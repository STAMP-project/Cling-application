import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (-292275054));
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) iOException3);
        org.joda.time.Duration duration8 = new org.joda.time.Duration(0L, 946312L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration8, 1424);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 1, chronology14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Instant instant17 = dateTime15.toInstant();
        org.joda.time.Instant instant19 = instant17.minus((long) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = instant19.toMutableDateTimeISO();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((-229564796800L));
        org.joda.time.Instant instant23 = instant19.minus((org.joda.time.ReadableDuration) duration22);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.add((org.joda.time.ReadableDuration) duration22, 26278);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -826433268480000000 * 26278");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration4 = duration1.withDurationAdded((long) (short) 100, (int) ' ');
        long long5 = duration4.getMillis();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis(0L);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.months();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime15, periodType16);
        boolean boolean18 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime13);
        int int19 = dateTime13.getDayOfMonth();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant20, readableInstant21, periodType22);
        org.joda.time.PeriodType periodType24 = periodType22.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration4, (org.joda.time.ReadableInstant) dateTime13, periodType22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes(15);
        org.joda.time.Chronology chronology30 = dateTime27.getChronology();
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.eras();
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now(chronology34);
        org.joda.time.DurationField durationField37 = chronology34.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.hourOfDay();
        org.joda.time.DateTime dateTime39 = dateTime27.withChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.getMutableDateTime();
        boolean boolean43 = dateTime39.isBefore((org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.Instant instant44 = new org.joda.time.Instant();
        org.joda.time.Instant instant46 = instant44.withMillis(0L);
        org.joda.time.Chronology chronology47 = instant46.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.eras();
        long long52 = chronology47.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField53 = chronology47.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology47.minuteOfDay();
        mutableDateTime42.setChronology(chronology47);
        org.joda.time.DateTime dateTime56 = dateTime13.toDateTime(chronology47);
        org.joda.time.DateTime dateTime58 = dateTime56.withYearOfCentury((int) 'a');
        org.joda.time.DateTime dateTime59 = dateTime58.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime59.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime62 = dateTime59.plusMillis(26353940);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMonths(93);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 86403200L + "'", long5 == 86403200L);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 105144L + "'", long52 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes(15);
        org.joda.time.Chronology chronology4 = dateTime1.getChronology();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime1.withChronology(chronology8);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        boolean boolean17 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        long long26 = chronology21.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField27 = chronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.minuteOfDay();
        mutableDateTime16.setChronology(chronology21);
        mutableDateTime16.setMillisOfSecond((int) '4');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant32, readableInstant33, periodType34);
        mutablePeriod35.addDays((int) '4');
        org.joda.time.MutablePeriod mutablePeriod38 = mutablePeriod35.toMutablePeriod();
        mutableDateTime16.add((org.joda.time.ReadablePeriod) mutablePeriod38, 1439);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableDuration41, readableInstant42);
        org.joda.time.Period period45 = period43.withDays((int) (byte) 1);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours48 = duration47.toStandardHours();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Duration duration53 = period43.toDurationFrom((org.joda.time.ReadableInstant) dateTime50);
        int int54 = period43.getDays();
        mutableDateTime16.add((org.joda.time.ReadablePeriod) period43);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime16.dayOfMonth();
        java.lang.Object obj57 = mutableDateTime16.clone();
        mutableDateTime16.addMillis(26150803);
        org.joda.time.Period period61 = new org.joda.time.Period(3438000000L);
        int[] intArray62 = period61.getValues();
        int int63 = period61.getYears();
        mutableDateTime16.add((org.joda.time.ReadablePeriod) period61, 26311);
        int int66 = period61.getMillis();
        int int67 = period61.getMinutes();
        org.joda.time.Period period69 = period61.minusMinutes(62342);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 105144L + "'", long26 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(hours48);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 40 + "'", int51 == 40);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(obj57);
// flaky:         org.junit.Assert.assertEquals(obj57.toString(), "2227-01-07T07:25:40.052Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "2227-01-07T07:25:40.052Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "2227-01-07T07:25:40.052Z");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 955, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        org.joda.time.DurationFieldType durationFieldType7 = periodType4.getFieldType((int) (short) 0);
        java.lang.String str8 = periodType4.toString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 53, (long) (-1), periodType4, chronology12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        int int18 = dateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime21 = dateTime17.withDurationAdded(0L, (int) '4');
        org.joda.time.LocalDate localDate22 = dateTime21.toLocalDate();
        int int23 = dateTime21.getSecondOfDay();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime21, periodType24);
        org.joda.time.DateTime dateTime27 = dateTime21.withYear(494);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[YearDayTime]" + "'", str8, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate14);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26740 + "'", int23 == 26740);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(442);
        int int3 = dateTimeZone1.getStandardOffset((long) 641);
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 442 + "'", int3 == 442);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        mutableDateTime0.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.dayOfWeek();
        int int5 = mutableDateTime0.getHourOfDay();
        mutableDateTime0.addWeeks(99);
        mutableDateTime0.add((long) 26252);
        mutableDateTime0.addHours(26405);
        int int12 = mutableDateTime0.getYearOfCentury();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2022-02-22T07:25:40.837Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2022-02-22T07:25:40.837Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2022-02-22T07:25:40.837Z");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes(15);
        org.joda.time.Chronology chronology4 = dateTime1.getChronology();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime1.withChronology(chronology8);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        boolean boolean17 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.addWeekyears((-1));
        mutableDateTime16.addHours(26150565);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology25);
        org.joda.time.DurationField durationField28 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.year();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField33 = chronology25.millisOfSecond();
        mutableDateTime16.setRounding(dateTimeField33);
        long long37 = dateTimeField33.add((long) 37174539, 47892750L);
        org.joda.time.DurationField durationField38 = dateTimeField33.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 85067289L + "'", long37 == 85067289L);
        org.junit.Assert.assertNull(durationField38);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addYears(0);
        mutableDateTime0.setMinuteOfDay((int) (short) 0);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration27 = duration23.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant28 = instant21.plus((org.joda.time.ReadableDuration) duration27);
        long long29 = instant28.getMillis();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) instant28);
        mutableDateTime0.addHours(20);
        int int33 = mutableDateTime0.getMinuteOfDay();
        mutableDateTime0.setSecondOfDay(26);
        mutableDateTime0.addWeekyears(8642122);
        mutableDateTime0.setTime(1121517L);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 86400000L + "'", long29 == 86400000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1200 + "'", int33 == 1200);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period4 = duration3.toPeriod();
        org.joda.time.Duration duration7 = duration3.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Instant instant9 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime1.withDurationAdded((long) 3, 4);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now();
        mutableDateTime13.add((long) 'a');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.yearOfCentury();
        mutableDateTime13.addSeconds(0);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration21, readableInstant22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period29 = period27.minusSeconds((-1));
        java.lang.String str30 = period27.toString();
        org.joda.time.Period period31 = period27.toPeriod();
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Period period33 = period23.normalizedStandard(periodType32);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = periodType32.indexOf(durationFieldType34);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Chronology chronology39 = instant38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.eras();
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.now(chronology39);
        org.joda.time.DurationField durationField42 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 12, (long) 292278993, periodType32, chronology39);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime13.toMutableDateTime(chronology39);
        mutableDateTime13.setDayOfYear(44);
        int int48 = mutableDateTime13.getHourOfDay();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) mutableDateTime13);
        mutableDateTime13.addYears(26229);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime13.monthOfYear();
        mutableDateTime13.setTime((long) 1328);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setMinuteOfHour(29022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0.099S" + "'", str30, "PT0.099S");
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str7 = duration6.toString();
        boolean boolean8 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Hours hours9 = duration4.toStandardHours();
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration4, 20);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale19);
        java.lang.Object obj22 = dateTimeParserBucket21.saveState();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) 100, chronology24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str27 = durationFieldType26.getName();
        boolean boolean28 = localTime25.isSupported(durationFieldType26);
        boolean boolean29 = dateTimeParserBucket21.restoreState((java.lang.Object) boolean28);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket21.getChronology();
        long long33 = dateTimeParserBucket21.computeMillis(true, "");
        int int34 = dateTimeParserBucket21.getOffset();
        java.lang.Object obj35 = dateTimeParserBucket21.saveState();
        java.lang.Integer int36 = dateTimeParserBucket21.getPivotYear();
        long long38 = dateTimeParserBucket21.computeMillis(false);
        java.lang.Integer int39 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.Chronology chronology40 = dateTimeParserBucket21.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.centuries();
        org.joda.time.Period period42 = new org.joda.time.Period((long) 37057844, (long) 26343, periodType15, chronology40);
        boolean boolean43 = duration4.equals((java.lang.Object) period42);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj45 = mutableDateTime44.clone();
        mutableDateTime44.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime44.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.add(1L);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale51.getISO3Language();
        java.lang.String str55 = property48.getAsText(locale51);
        org.joda.time.MutableDateTime mutableDateTime56 = property48.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime58 = property48.add(62273);
        mutableDateTime58.setDate(299, 4, (int) (byte) 1);
        mutableDateTime58.addDays(26417);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(readableInstant65, readableInstant66, periodType67);
        org.joda.time.PeriodType periodType69 = periodType67.withMonthsRemoved();
        org.joda.time.Period period70 = duration4.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime58, periodType69);
        mutableDateTime58.setTime(1645514527696L);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        int int75 = dateTime74.getYearOfCentury();
        int int76 = dateTime74.getWeekyear();
        org.joda.time.DateTime dateTime78 = dateTime74.plus((long) 15);
        org.joda.time.DateTime.Property property79 = dateTime78.millisOfSecond();
        int int80 = dateTime78.getWeekOfWeekyear();
        java.lang.String str81 = dateTime78.toString();
        org.joda.time.DateTime dateTime83 = dateTime78.withWeekyear((int) (byte) 0);
        org.joda.time.DateTime dateTime85 = dateTime83.plusDays(1132);
        org.joda.time.Period period86 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime58, (org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime58.hourOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT86400S" + "'", str7, "PT86400S");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "weeks" + "'", str27, "weeks");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(obj45);
// flaky:         org.junit.Assert.assertEquals(obj45.toString(), "2022-02-22T07:25:40.896Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "2022-02-22T07:25:40.896Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "2022-02-22T07:25:40.896Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "deu" + "'", str54, "deu");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Mittwoch" + "'", str55, "Mittwoch");
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 22 + "'", int75 == 22);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2022 + "'", int76 == 2022);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 8 + "'", int80 == 8);
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "2022-02-22T07:25:40.911Z" + "'", str81, "2022-02-22T07:25:40.911Z");
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(property87);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(46);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localDateTime4.get(dateTimeFieldType5);
        int int7 = localDateTime4.size();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.hourOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.weekOfWeekyear();
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale locale16 = builder14.build();
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Locale.setDefault(category10, locale16);
        java.lang.String str19 = property9.getAsText(locale16);
        java.util.Set<java.lang.String> strSet20 = locale16.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale16);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 999 + "'", int6 == 999);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44" + "'", str19, "44");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        mutableDateTime0.setDate((long) '#');
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        int int10 = localDate6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime0.toDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = dateTimeZone17.getName(100L, locale19);
        java.lang.String str23 = dateTimeZone17.getShortName(3600000L);
        int int25 = dateTimeZone17.getOffset((long) 62176);
        boolean boolean26 = dateTimeZone17.isFixed();
        org.joda.time.DateTime dateTime27 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = localDate16.withYearOfCentury(26338);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26338 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "German" + "'", str20, "German");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(45);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.eras();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 44, chronology16);
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType11.getField(chronology16);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.Period period27 = period25.minusSeconds((-1));
        java.lang.String str28 = period25.toString();
        long long31 = chronology16.add((org.joda.time.ReadablePeriod) period25, (long) ' ', (int) 'a');
        org.joda.time.Period period33 = period25.minusHours((-292275054));
        org.joda.time.Period period35 = period33.minusHours(2000);
        int int36 = period33.getMinutes();
        org.joda.time.Period period37 = period33.toPeriod();
        mutableDateTime10.add((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = period37.minusYears(443);
        org.joda.time.Period period42 = period40.minusDays(19);
        org.joda.time.DateTime dateTime43 = dateTime3.minus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.DateTime dateTime45 = dateTime43.plusHours(8);
        org.joda.time.DateTime.Property property46 = dateTime43.centuryOfEra();
        org.joda.time.DateTime dateTime47 = property46.withMinimumValue();
        org.joda.time.DateTime dateTime49 = dateTime47.plusDays(29);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Instant instant52 = instant50.withMillis(0L);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period57 = duration56.toPeriod();
        org.joda.time.Duration duration60 = duration56.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant62 = dateTime54.toInstant();
        org.joda.time.DateTime dateTime65 = dateTime54.withDurationAdded((long) 3, 4);
        org.joda.time.Instant instant66 = dateTime65.toInstant();
        boolean boolean67 = instant50.isBefore((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Duration duration70 = new org.joda.time.Duration(826665956185622L, (long) 26195);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime74 = dateTime72.withZoneRetainFields(dateTimeZone73);
        int int75 = dateTime74.getMinuteOfHour();
        org.joda.time.DateTime dateTime77 = dateTime74.plusWeeks(0);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = dateTime74.toDateTime(chronology78);
        org.joda.time.DateTime dateTime81 = dateTime79.plusYears(73619);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.PeriodType periodType86 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant84, readableInstant85, periodType86);
        org.joda.time.DurationFieldType durationFieldType89 = periodType86.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType90 = periodType86.withMillisRemoved();
        org.joda.time.Period period91 = new org.joda.time.Period(44L, (long) 2000, periodType86);
        org.joda.time.PeriodType periodType92 = periodType86.withMinutesRemoved();
        org.joda.time.Period period93 = duration70.toPeriodTo((org.joda.time.ReadableInstant) dateTime81, periodType86);
        org.joda.time.PeriodType periodType94 = periodType86.withMonthsRemoved();
        org.joda.time.Period period95 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) instant50, periodType94);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((long) 26297, (long) 62261, periodType94);
        int int97 = periodType94.size();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT0.099S" + "'", str28, "PT0.099S");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-9571L) + "'", long31 == (-9571L));
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertNotNull(periodType90);
        org.junit.Assert.assertNotNull(periodType92);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(periodType94);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 6 + "'", int97 == 6);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime5 = property4.withMinimumValue();
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayName();
        java.lang.String str13 = dateTimeZone9.getName(100L, locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(948227L, dateTimeZone9);
        long long15 = mutableDateTime14.getMillis();
        mutableDateTime14.setWeekyear(1439);
        boolean boolean19 = mutableDateTime14.isBefore(1645514186724L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(36988464);
        mutableDateTime14.setZone(dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.Period period28 = period26.minusSeconds((-1));
        java.lang.String str29 = period26.toString();
        org.joda.time.Period period30 = period26.toPeriod();
        int int31 = period30.size();
        org.joda.time.Period period33 = period30.plusSeconds(62151);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant35, readableInstant36, periodType37);
        org.joda.time.PeriodType periodType39 = periodType37.withHoursRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.Instant instant44 = instant42.withMillis(0L);
        org.joda.time.Chronology chronology45 = instant44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.eras();
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.now(chronology45);
        org.joda.time.DurationField durationField48 = chronology45.eras();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 44, chronology45);
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType40.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (-292275054), periodType37, chronology45);
        org.joda.time.Period period53 = period33.minus((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str55 = durationFieldType54.getName();
        int int56 = mutablePeriod52.get(durationFieldType54);
        mutableDateTime14.add(durationFieldType54, 37048051);
        org.joda.time.format.DateTimePrinter dateTimePrinter59 = null;
        org.joda.time.format.DateTimeParser dateTimeParser60 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter59, dateTimeParser60);
        org.joda.time.Instant instant62 = new org.joda.time.Instant();
        org.joda.time.Instant instant64 = instant62.withMillis(0L);
        org.joda.time.Chronology chronology65 = instant64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.eras();
        long long70 = chronology65.add(0L, (long) 2022, (int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter61.withChronology(chronology65);
        org.joda.time.format.DateTimePrinter dateTimePrinter72 = dateTimeFormatter71.getPrinter();
        org.joda.time.Chronology chronology73 = dateTimeFormatter71.getChronology();
        boolean boolean74 = durationFieldType54.isSupported(chronology73);
        java.lang.String str75 = durationFieldType54.toString();
        org.joda.time.DateTime dateTime77 = dateTime5.withFieldAdded(durationFieldType54, 26236);
        java.lang.String str78 = durationFieldType54.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 948227L + "'", long15 == 948227L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0.099S" + "'", str29, "PT0.099S");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "weeks" + "'", str55, "weeks");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 105144L + "'", long70 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNull(dateTimePrinter72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "weeks" + "'", str75, "weeks");
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "weeks" + "'", str78, "weeks");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.dayOfYear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.add((long) (short) 0);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime8.toMutableDateTime();
        mutableDateTime8.setYear(62254);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDate(26345, 37358368, 2122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37358368 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "53" + "'", str6, "53");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withMonthsRemoved();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.minusHours((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.DurationField durationField13 = durationFieldType6.getField(chronology11);
        int int14 = periodType5.indexOf(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property5 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours10 = duration9.toStandardHours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime12);
        mutablePeriod14.addSeconds(292278993);
        mutablePeriod14.setPeriod((long) 45, 946312L);
        org.joda.time.DateTime dateTime20 = dateTime7.minus((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.DateTime dateTime23 = dateTime7.withDurationAdded((long) 1969, (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        mutableDateTime24.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.add((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime31.toMutableDateTime(dateTimeZone32);
        mutableDateTime34.add(51L);
        int int37 = mutableDateTime34.getHourOfDay();
        boolean boolean38 = dateTime23.isAfter((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime42 = dateTime40.withZoneRetainFields(dateTimeZone41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDate43.toDateTimeAtCurrentTime(dateTimeZone45);
        int int48 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime47);
        int int49 = dateTime47.getCenturyOfEra();
        org.joda.time.DateTime dateTime51 = dateTime47.withWeekyear(44);
        boolean boolean52 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) dateTime51);
        int int53 = dateTime51.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime55 = dateTime51.withMillisOfSecond(26682);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26682 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(hours10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 41 + "'", int13 == 41);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 25 + "'", int53 == 25);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now();
        mutableDateTime1.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.addWrapField(62151);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.toMutableDateTime();
        int int9 = mutableDateTime8.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.millisOfSecond();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardDays((-9571L));
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableDuration) duration12);
        java.lang.String str14 = duration12.toString();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration23 = duration19.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant24 = instant17.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period26 = duration23.toPeriod(periodType25);
        org.joda.time.Duration duration28 = duration23.withMillis(60000L);
        org.joda.time.Period period29 = duration28.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.withSeconds(46);
        org.joda.time.PeriodType periodType33 = period29.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getYearOfCentury();
        int int37 = dateTime35.getWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime35.plus((long) 15);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfSecond();
        org.joda.time.DateTime dateTime42 = dateTime39.plusMillis(1439);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DurationField durationField45 = chronology43.centuries();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.Period period47 = duration12.toPeriod(periodType33, chronology43);
        org.joda.time.PeriodType periodType48 = periodType33.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(1539095L, periodType33);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26741 + "'", int9 == 26741);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT-826934400S" + "'", str14, "PT-826934400S");
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str7 = duration6.toString();
        boolean boolean8 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Hours hours9 = duration4.toStandardHours();
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration4, 20);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime0.millisOfDay();
        mutableDateTime0.setMillis((long) 443);
        mutableDateTime0.addWeekyears((-596));
        java.util.Locale locale20 = new java.util.Locale("2022-02-22T07:16:51.679Z", "2022-02-22T10:15:57.851", "2022-02-22T07:15:58.646Z");
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.util.Calendar calendar22 = mutableDateTime0.toCalendar(locale20);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology24, locale26, (java.lang.Integer) 10);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale35.getDisplayName();
        java.lang.String str37 = dateTimeZone33.getName(100L, locale35);
        java.lang.String str38 = locale31.getDisplayScript(locale35);
        java.lang.String str39 = locale26.getDisplayScript(locale31);
        java.lang.String str40 = locale20.getDisplayScript(locale26);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT86400S" + "'", str7, "PT86400S");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals(locale20.toString(), "2022-02-22t07:16:51.679z_2022-02-22T10:15:57.851_2022-02-22T07:15:58.646Z");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=-18807465599557,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1373,MONTH=11,WEEK_OF_YEAR=53,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=363,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=443,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "German" + "'", str36, "German");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addHours((int) (byte) 10);
        mutableDateTime0.addWeeks(20);
        org.joda.time.DateTimeField dateTimeField19 = mutableDateTime0.getRoundingField();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration20, readableInstant21);
        org.joda.time.Period period24 = period22.withDays((int) (byte) 1);
        org.joda.time.Period period26 = period24.minusWeeks(100);
        org.joda.time.Period period28 = period24.plusWeeks((int) (short) -1);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period28, 62166);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.Instant instant35 = instant33.toInstant();
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(964100L, (long) 26172069, chronology36);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) mutablePeriod37, 0);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime0.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology42 = mutableDateTime0.getChronology();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(dateTimeField19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property5 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours10 = duration9.toStandardHours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime12);
        mutablePeriod14.addSeconds(292278993);
        mutablePeriod14.setPeriod((long) 45, 946312L);
        org.joda.time.DateTime dateTime20 = dateTime7.minus((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.DateTime dateTime23 = dateTime7.withDurationAdded((long) 1969, (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        mutableDateTime24.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.add((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime31.toMutableDateTime(dateTimeZone32);
        mutableDateTime34.add(51L);
        int int37 = mutableDateTime34.getHourOfDay();
        boolean boolean38 = dateTime23.isAfter((org.joda.time.ReadableInstant) mutableDateTime34);
        boolean boolean39 = dateTime23.isBeforeNow();
        org.joda.time.DateTime.Property property40 = dateTime23.minuteOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(hours10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 41 + "'", int13 == 41);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 44);
        boolean boolean6 = dateTimeZone2.isStandardOffset((long) (-1));
        java.lang.String str7 = dateTimeZone2.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone2);
        mutableDateTime8.setSecondOfMinute(41);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 44L + "'", long4 == 44L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        long long11 = chronology6.add(0L, (long) 2022, (int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        int int14 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = locale20.getDisplayName();
        java.lang.String str22 = dateTimeZone18.getName(100L, locale20);
        java.lang.String str23 = dateTimeZone18.toString();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone18);
        java.lang.String str26 = dateTimeZone18.getShortName((long) 6);
        long long28 = dateTimeZone18.nextTransition(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter13.withZone(dateTimeZone18);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter29.getParser();
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 105144L + "'", long11 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "German" + "'", str21, "German");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNull(dateTimeParser30);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set(45);
        org.joda.time.MutableDateTime mutableDateTime4 = property1.roundFloor();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) 'a');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(15);
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime18 = localDateTime9.toDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        mutableDateTime4.setRounding(dateTimeField20);
        java.lang.Object obj22 = mutableDateTime4.clone();
        java.lang.String str23 = mutableDateTime4.toString();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime4.toMutableDateTime();
        int int25 = mutableDateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period30 = duration29.toPeriod();
        org.joda.time.Duration duration33 = duration29.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime37 = dateTime27.withDurationAdded((long) 62170, 26175904);
        int int38 = dateTime37.getYearOfEra();
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime37);
        int int40 = mutableDateTime24.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime24.setDate(443, 765, 48143102);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 765 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "4500-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "4500-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "4500-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4500-01-01T00:00:00.000Z" + "'", str23, "4500-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2021 + "'", int38 == 2021);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(7L);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = localTime1.minusMinutes(3522);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addHours((int) (byte) 10);
        mutableDateTime0.addWeeks(20);
        org.joda.time.DateTimeField dateTimeField19 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime0.era();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(4);
        mutableDateTime0.setZoneRetainFields(dateTimeZone22);
        mutableDateTime0.addYears(82800100);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(dateTimeField19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addHours((int) (byte) 10);
        mutableDateTime0.addWeeks(20);
        int int19 = mutableDateTime0.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime0.copy();
        mutableDateTime0.addWeekyears(26170959);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime0.toMutableDateTime();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plus((long) 15);
        org.joda.time.DateTime.Property property6 = dateTime1.year();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addToCopy((long) 61);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((-229564796800L));
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateTime dateTime14 = dateTime9.withWeekyear(0);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime9.withZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(53);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration28 = duration21.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType((int) (short) 0);
        java.lang.String str35 = periodType31.toString();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration21, periodType31);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.addWeekyears(21);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime0.copy();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        long long47 = dateTimeZone43.getMillisKeepLocal(dateTimeZone45, (long) 44);
        boolean boolean49 = dateTimeZone45.isStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property53 = localDateTime50.hourOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str57 = dateTimeFieldType56.getName();
        int int58 = localDateTime50.indexOf(dateTimeFieldType56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime50.minusSeconds((int) (short) 0);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        int int63 = dateTime62.getYearOfCentury();
        int int64 = dateTime62.getWeekyear();
        org.joda.time.DateTime dateTime66 = dateTime62.plus((long) 15);
        org.joda.time.DateTime.Property property67 = dateTime62.year();
        org.joda.time.DateTime dateTime68 = property67.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property69 = dateTime68.millisOfSecond();
        org.joda.time.DateTime dateTime70 = localDateTime60.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime72 = dateTime68.minusMinutes(55);
        int int73 = dateTimeZone45.getOffset((org.joda.time.ReadableInstant) dateTime72);
        int int75 = dateTimeZone45.getStandardOffset(37051857L);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 36950209, dateTimeZone45);
        mutableDateTime0.setZoneRetainFields(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone45);
        int int79 = localDateTime78.getWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[YearDayTime]" + "'", str35, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 44L + "'", long47 == 44L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "clockhourOfDay" + "'", str57, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 22 + "'", int63 == 22);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2022 + "'", int64 == 2022);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2022 + "'", int79 == 2022);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.addWeekyears((int) '4');
        mutableDateTime1.add((long) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.yearOfEra();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.LocalDate localDate10 = property8.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = localDate10.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight15 = localDate12.toDateMidnight(dateTimeZone13);
        java.lang.String str17 = dateTimeZone13.getNameKey(960000L);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone13);
        mutableDateTime1.setZoneRetainFields(dateTimeZone13);
        java.util.TimeZone timeZone20 = dateTimeZone13.toTimeZone();
        java.time.ZoneId zoneId21 = timeZone20.toZoneId();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId21);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        org.joda.time.DurationFieldType durationFieldType7 = periodType4.getFieldType((int) (short) 0);
        java.lang.String str8 = periodType4.toString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 53, (long) (-1), periodType4, chronology12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekyear();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[YearDayTime]" + "'", str8, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.millisOfDay();
        org.joda.time.DateTime dateTime3 = mutableDateTime0.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMonths((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2022-02-22T07:25:41.371Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2022-02-22T07:25:41.371Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2022-02-22T07:25:41.371Z");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream6 = languageRangeList1.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertNotNull(languageRangeStream6);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale4);
        java.lang.Object obj7 = dateTimeParserBucket6.saveState();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) 100, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str12 = durationFieldType11.getName();
        boolean boolean13 = localTime10.isSupported(durationFieldType11);
        boolean boolean14 = dateTimeParserBucket6.restoreState((java.lang.Object) boolean13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        dateTimeParserBucket6.setZone(dateTimeZone18);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) 435, dateTimeZone18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getYearOfCentury();
        int int25 = dateTime23.getWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime23.withEarlierOffsetAtOverlap();
        java.lang.String str27 = dateTime26.toString();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime26.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean30 = dateTimeZone29.isFixed();
        mutableDateTime28.setZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localTime21.toDateTimeToday(dateTimeZone29);
        int int33 = localTime21.size();
        org.joda.time.LocalTime.Property property34 = localTime21.secondOfMinute();
        org.joda.time.LocalTime.Property property35 = localTime21.secondOfMinute();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "weeks" + "'", str12, "weeks");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-02-22T07:25:41.390Z" + "'", str27, "2022-02-22T07:25:41.390Z");
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean4 = localDate1.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate1.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        mutableDateTime6.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime6.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        mutableDateTime12.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime12.copy();
        mutableDateTime12.setDate((long) '#');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean21 = localDate18.isSupported(dateTimeFieldType20);
        int int22 = localDate18.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight24 = localDate18.toDateMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = mutableDateTime12.toDateTime(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        boolean boolean32 = dateTimeZone23.equals((java.lang.Object) periodType31);
        mutableDateTime6.setZoneRetainFields(dateTimeZone23);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = localDate1.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.Chronology chronology36 = localDate1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 26520792, chronology36);
        java.lang.String str38 = chronology36.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53 + "'", int22 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ISOChronology[UTC]" + "'", str38, "ISOChronology[UTC]");
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getYearOfCentury();
        int int14 = dateTime12.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime12.plus((long) 15);
        org.joda.time.DateTime.Property property17 = dateTime12.year();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfSecond();
        org.joda.time.DateTime dateTime20 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        int int21 = dateTime20.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime();
        org.joda.time.DateTime.Property property23 = dateTime20.millisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.era();
        mutableDateTime5.setYear(0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.add((long) 'a');
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.secondOfDay();
        int int12 = mutableDateTime8.getDayOfWeek();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period15 = duration14.toPeriod();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration20 = duration17.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration21 = duration14.minus((org.joda.time.ReadableDuration) duration20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration14, 19045);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.months();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime33, periodType34);
        boolean boolean36 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime31);
        int int37 = dateTime31.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.hourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        boolean boolean44 = property41.equals((java.lang.Object) 10L);
        long long45 = property41.remainder();
        java.lang.String str46 = property41.getAsText();
        org.joda.time.LocalDateTime localDateTime47 = property41.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property41.getFieldType();
        int int49 = dateTime31.get(dateTimeFieldType48);
        org.joda.time.DateTime dateTime50 = dateTime31.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration51, readableInstant52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period59 = period57.minusSeconds((-1));
        java.lang.String str60 = period57.toString();
        org.joda.time.Period period61 = period57.toPeriod();
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Period period63 = period53.normalizedStandard(periodType62);
        org.joda.time.Period period65 = period63.withSeconds(10);
        org.joda.time.Minutes minutes66 = period63.toStandardMinutes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray67 = period63.getFieldTypes();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.forFields(durationFieldTypeArray67);
        org.joda.time.Period period69 = duration14.toPeriodTo((org.joda.time.ReadableInstant) dateTime31, periodType68);
        org.joda.time.Period period70 = new org.joda.time.Period(1969, 133, 26552, 62234, 440, 125, 26186255, (int) (short) -1, periodType68);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1541488L + "'", long45 == 1541488L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "7" + "'", str46, "7");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0.099S" + "'", str60, "PT0.099S");
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(durationFieldTypeArray67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(26149000L, (long) (byte) 1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration10 = duration6.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Instant instant12 = dateTime4.toInstant();
        org.joda.time.Instant instant13 = instant12.toInstant();
        long long14 = instant12.getMillis();
        org.joda.time.DateTime dateTime15 = instant12.toDateTimeISO();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration23 = duration20.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration24 = duration17.minus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant25, readableInstant26, periodType27);
        mutablePeriod28.addDays((int) '4');
        org.joda.time.MutablePeriod mutablePeriod31 = mutablePeriod28.toMutablePeriod();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean35 = localDate32.isSupported(dateTimeFieldType34);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType34.getRangeDurationType();
        int int37 = mutablePeriod28.indexOf(durationFieldType36);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period40 = duration39.toPeriod();
        org.joda.time.Duration duration42 = duration39.minus((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now();
        mutableDateTime43.add((long) 'a');
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime43.yearOfCentury();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration54 = duration51.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration55 = duration48.minus((org.joda.time.ReadableDuration) duration54);
        mutableDateTime43.add((org.joda.time.ReadableDuration) duration48);
        boolean boolean57 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration59 = duration48.minus((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now();
        mutableDateTime60.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime60.copy();
        mutableDateTime60.setDate((long) '#');
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property67 = localDate66.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean69 = localDate66.isSupported(dateTimeFieldType68);
        int int70 = localDate66.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight72 = localDate66.toDateMidnight(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = mutableDateTime60.toDateTime(dateTimeZone71);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, (org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.MutablePeriod mutablePeriod75 = mutablePeriod74.copy();
        mutablePeriod75.clear();
        mutablePeriod75.setPeriod(21L, (long) '#');
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod75);
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate();
        int int82 = localDate81.getDayOfMonth();
        org.joda.time.DateTime dateTime83 = localDate81.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate85 = localDate81.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate87 = localDate85.plusDays(26150565);
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.DateTime dateTime89 = localDate85.toDateTimeAtStartOfDay(dateTimeZone88);
        org.joda.time.Duration duration90 = mutablePeriod75.toDurationFrom((org.joda.time.ReadableInstant) dateTime89);
        int int91 = duration23.compareTo((org.joda.time.ReadableDuration) duration90);
        org.joda.time.Instant instant92 = instant12.minus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period93 = duration2.toPeriodTo((org.joda.time.ReadableInstant) instant12);
        long long94 = instant12.getMillis();
        org.joda.time.DateTime dateTime95 = instant12.toDateTime();
        int int96 = dateTime95.getMinuteOfDay();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 53 + "'", int70 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateMidnight72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutablePeriod75);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 22 + "'", int82 == 22);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(localDate85);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(duration90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(instant92);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 1L + "'", long94 == 1L);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 62172);
        org.joda.time.Duration duration3 = duration1.withMillis((long) 84);
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        mutableDateTime4.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.copy();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property8.set(1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getYearOfCentury();
        int int16 = dateTime14.getWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withEarlierOffsetAtOverlap();
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone20.isFixed();
        mutableDateTime19.setZoneRetainFields(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(dateTimeZone20);
        boolean boolean24 = mutableDateTime23.isEqualNow();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str27 = duration26.toString();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours30 = duration29.toStandardHours();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        int int33 = dateTime32.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration35 = duration26.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period38 = duration37.toPeriod();
        org.joda.time.Duration duration40 = duration37.minus((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now();
        mutableDateTime41.add((long) 'a');
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime41.yearOfCentury();
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period47 = duration46.toPeriod();
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration52 = duration49.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration53 = duration46.minus((org.joda.time.ReadableDuration) duration52);
        mutableDateTime41.add((org.joda.time.ReadableDuration) duration46);
        boolean boolean55 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration46);
        boolean boolean56 = duration29.isLongerThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period61 = duration60.toPeriod();
        org.joda.time.Duration duration64 = duration60.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableDuration) duration64);
        org.joda.time.Duration duration66 = duration40.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology67);
        int int69 = dateTime68.getYearOfCentury();
        int int70 = dateTime68.getWeekyear();
        org.joda.time.DateTime dateTime72 = dateTime68.plus((long) 15);
        org.joda.time.DateTime.Property property73 = dateTime68.year();
        org.joda.time.DateTime dateTime74 = property73.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableDuration75, readableInstant76);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) 100, 1L, periodType80);
        org.joda.time.Period period83 = period81.minusSeconds((-1));
        java.lang.String str84 = period81.toString();
        org.joda.time.Period period85 = period81.toPeriod();
        org.joda.time.PeriodType periodType86 = period81.getPeriodType();
        org.joda.time.Period period87 = period77.normalizedStandard(periodType86);
        java.lang.String str88 = periodType86.getName();
        org.joda.time.PeriodType periodType89 = periodType86.withYearsRemoved();
        org.joda.time.Period period90 = duration64.toPeriodTo((org.joda.time.ReadableInstant) dateTime74, periodType89);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableDuration) duration64);
        org.joda.time.Duration duration93 = duration64.withMillis((long) 26150803);
        int int94 = duration3.compareTo((org.joda.time.ReadableDuration) duration93);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-22T07:25:41.579Z" + "'", str18, "2022-02-22T07:25:41.579Z");
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT86400S" + "'", str27, "PT86400S");
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(hours30);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41 + "'", int33 == 41);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 22 + "'", int69 == 22);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PT0.099S" + "'", str84, "PT0.099S");
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Standard" + "'", str88, "Standard");
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(duration93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(999, 12, 8, (int) (byte) 10, 5, (-292275054), 15, 50);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = periodType22.getFieldType((int) (short) 0);
        java.lang.String str26 = periodType22.toString();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        org.joda.time.Period period31 = new org.joda.time.Period((long) 53, (long) (-1), periodType22, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMinutes(15);
        org.joda.time.Chronology chronology37 = dateTime34.getChronology();
        java.lang.String str38 = chronology37.toString();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType17.getField(chronology37);
        org.joda.time.DurationField durationField40 = chronology37.centuries();
        mutablePeriod15.setPeriod(60000L, chronology37);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(26536, 26503844, 62170, 26531, 27425221, 62738, 253, chronology37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26531 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PeriodType[YearDayTime]" + "'", str26, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ISOChronology[UTC]" + "'", str38, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfEra();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str16 = duration15.toString();
        org.joda.time.Instant instant17 = instant11.minus((org.joda.time.ReadableDuration) duration15);
        int int18 = property10.getDifference((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) (short) -1, (long) (-292275054));
        org.joda.time.Instant instant22 = instant11.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Instant instant24 = instant11.withMillis((long) 6);
        long long25 = instant11.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1200);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 60, dateTimeZone28);
        java.lang.String str30 = dateTimeZone28.getID();
        org.joda.time.MutableDateTime mutableDateTime31 = instant11.toMutableDateTime(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(1524, 26681, 26401, 64173, 26738, 26594, 26679, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64173 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT86400S" + "'", str16, "PT86400S");
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1645514741651L + "'", long25 == 1645514741651L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:01.200" + "'", str30, "+00:00:01.200");
        org.junit.Assert.assertNotNull(mutableDateTime31);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.eras();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 44, chronology4);
        int int9 = dateTime8.getSecondOfMinute();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) 36946953);
        org.joda.time.Instant instant15 = instant10.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime16 = dateTime8.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant17);
        org.joda.time.Period period20 = period18.minusSeconds(4022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = period18.getFieldType(38219999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.DurationField durationField6 = chronology4.weeks();
        long long9 = durationField6.add(5L, 5);
        long long12 = durationField6.add((-29862722304000000L), 435);
        long long15 = durationField6.getMillis((long) 26461581, (long) 33829);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3024000005L + "'", long9 == 3024000005L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-29862459216000000L) + "'", long12 == (-29862459216000000L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 16003964188800000L + "'", long15 == 16003964188800000L);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        mutableDateTime0.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.add(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone7.getMillisKeepLocal(dateTimeZone9, (long) 44);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone7);
        mutableDateTime6.setZoneRetainFields(dateTimeZone7);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale locale17 = builder16.build();
        java.lang.String str18 = dateTimeZone7.getName(555370422L, locale17);
        java.lang.String str20 = dateTimeZone7.getShortName(962578L);
        long long23 = dateTimeZone7.convertLocalToUTC((long) 62151, false);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        boolean boolean26 = dateTimeZone7.isStandardOffset((long) 184);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = property30.getField();
        boolean boolean33 = property30.equals((java.lang.Object) 10L);
        long long34 = property30.remainder();
        java.lang.String str35 = property30.getAsText();
        org.joda.time.LocalDateTime localDateTime36 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.hourOfDay();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.hourOfDay();
        boolean boolean39 = dateTimeZone7.isLocalDateTimeGap(localDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2022-02-22T07:25:41.722Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2022-02-22T07:25:41.722Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2022-02-22T07:25:41.722Z");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 44L + "'", long11 == 44L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 62151L + "'", long23 == 62151L);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1541722L + "'", long34 == 1541722L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7" + "'", str35, "7");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        long long8 = chronology3.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField9 = chronology3.secondOfMinute();
        boolean boolean10 = dateTimeField9.isSupported();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(15);
        org.joda.time.Chronology chronology16 = dateTime13.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        org.joda.time.DurationFieldType durationFieldType26 = periodType23.getFieldType((int) (short) 0);
        java.lang.String str27 = periodType23.toString();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.Period period32 = new org.joda.time.Period((long) 53, (long) (-1), periodType23, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType18.getField(chronology31);
        java.util.Locale locale34 = java.util.Locale.UK;
        java.lang.String str35 = locale34.getDisplayLanguage();
        int int36 = dateTimeField33.getMaximumTextLength(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(3155695200000L, chronology16, locale34);
        int int38 = dateTimeField9.getMaximumShortTextLength(locale34);
        java.lang.String str40 = dateTimeField9.getAsShortText((long) 26172069);
        int int43 = dateTimeField9.getDifference(1081001L, (long) 37139610);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime localTime47 = localTime45.minusHours((int) (byte) 100);
        int int48 = localTime47.getMinuteOfHour();
        java.lang.String str50 = localTime47.toString("1");
        org.joda.time.LocalTime localTime52 = localTime47.minusMinutes(15);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        int int55 = dateTime54.getYearOfCentury();
        int int56 = dateTime54.getWeekyear();
        org.joda.time.DateTime dateTime58 = dateTime54.plus((long) 15);
        org.joda.time.DateTime.Property property59 = dateTime54.year();
        org.joda.time.DateTime dateTime60 = property59.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property61 = dateTime60.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime60.toMutableDateTime();
        org.joda.time.LocalTime localTime63 = dateTime60.toLocalTime();
        org.joda.time.LocalTime localTime64 = localTime47.withFields((org.joda.time.ReadablePartial) localTime63);
        org.joda.time.LocalTime localTime66 = localTime47.minusMinutes(26212472);
        org.joda.time.LocalTime localTime68 = localTime47.minusMinutes(56);
        int int69 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localTime68);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 105144L + "'", long8 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[YearDayTime]" + "'", str27, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English" + "'", str35, "English");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "12" + "'", str40, "12");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-36058) + "'", int43 == (-36058));
        org.junit.Assert.assertNotNull(localTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 25 + "'", int48 == 25);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 22 + "'", int55 == 22);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 59 + "'", int69 == 59);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        mutableDateTime0.addSeconds(0);
        mutableDateTime0.setMinuteOfHour(51);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMillisOfSecond(26504067);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26504067 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(53);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration28 = duration21.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType((int) (short) 0);
        java.lang.String str35 = periodType31.toString();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration21, periodType31);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.addWeekyears(21);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.set(44);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime45 = property40.add((long) 26158);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime45.setDayOfMonth(62609);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62609 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[YearDayTime]" + "'", str35, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, 3155695200000L);
        mutablePeriod2.setHours(26148);
        org.joda.time.Period period5 = mutablePeriod2.toPeriod();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 26164766, 950707L);
        org.joda.time.Period period10 = period8.plusWeeks(62176);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = dateTimeZone12.getName(100L, locale14);
        java.lang.String str17 = dateTimeZone12.toString();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone12);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.yearOfCentury();
        boolean boolean20 = period10.equals((java.lang.Object) mutableDateTime18);
        org.joda.time.Duration duration21 = mutablePeriod2.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutablePeriod mutablePeriod22 = mutablePeriod2.toMutablePeriod();
        mutablePeriod22.setPeriod((-12352739560955L));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(mutablePeriod22);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("China");
        timeZone1.setRawOffset(37020985);
        int int4 = timeZone1.getRawOffset();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.lang.String str10 = locale9.getDisplayName();
        java.lang.String str11 = locale9.getISO3Language();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder8.clearExtensions();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant17, readableInstant18, periodType19);
        org.joda.time.DurationFieldType durationFieldType22 = periodType19.getFieldType((int) (short) 0);
        java.lang.String str23 = periodType19.toString();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 53, (long) (-1), periodType19, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology27);
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale30.getDisplayLanguage();
        int int32 = dateTimeField29.getMaximumTextLength(locale30);
        java.lang.String str33 = locale30.getScript();
        java.util.Locale.Builder builder34 = builder8.setLocale(locale30);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean38 = localDate35.isSupported(dateTimeFieldType37);
        org.joda.time.LocalDate.Property property39 = localDate35.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now();
        mutableDateTime40.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime40.copy();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime40.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime48 = property44.set(1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getYearOfCentury();
        int int52 = dateTime50.getWeekyear();
        org.joda.time.DateTime dateTime53 = dateTime50.withEarlierOffsetAtOverlap();
        java.lang.String str54 = dateTime53.toString();
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime53.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        boolean boolean57 = dateTimeZone56.isFixed();
        mutableDateTime55.setZoneRetainFields(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime48.toMutableDateTime(dateTimeZone56);
        org.joda.time.LocalDate localDate60 = org.joda.time.LocalDate.now(dateTimeZone56);
        java.lang.Object obj62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj62);
        org.joda.time.Duration duration65 = org.joda.time.Duration.standardSeconds((long) 45);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableDuration) duration65);
        org.joda.time.LocalDate localDate67 = dateTime63.toLocalDate();
        org.joda.time.LocalDate.Property property68 = localDate67.dayOfMonth();
        java.util.Date date69 = localDate67.toDate();
        org.joda.time.LocalDate.Property property70 = localDate67.dayOfYear();
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.lang.String str72 = property70.getAsText(locale71);
        java.lang.String str73 = dateTimeZone56.getShortName(360000000L, locale71);
        java.lang.String str74 = property39.getAsText(locale71);
        java.util.Set<java.lang.String> strSet75 = locale71.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder76 = builder8.setLocale(locale71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = timeZone1.getDisplayName(true, 26263180, locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 26263180");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37020985 + "'", int4 == 37020985);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "German" + "'", str10, "German");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "deu" + "'", str11, "deu");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PeriodType[YearDayTime]" + "'", str23, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "English" + "'", str31, "English");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 22 + "'", int51 == 22);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
        org.junit.Assert.assertNotNull(dateTime53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022-02-22T07:25:41.850Z" + "'", str54, "2022-02-22T07:25:41.850Z");
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Tue Feb 22 00:00:00 GMT+23:00 2022");
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "de");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "53" + "'", str72, "53");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:00" + "'", str73, "+00:00");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Dienstag" + "'", str74, "Dienstag");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        int int4 = localTime3.getMinuteOfHour();
        java.lang.String str6 = localTime3.toString("1");
        org.joda.time.LocalTime localTime8 = localTime3.minusMinutes(15);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime14 = dateTime10.plus((long) 15);
        org.joda.time.DateTime.Property property15 = dateTime10.year();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime();
        org.joda.time.LocalTime localTime19 = dateTime16.toLocalTime();
        org.joda.time.LocalTime localTime20 = localTime3.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime19.minus(readablePeriod21);
        int int23 = localTime22.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes(15);
        org.joda.time.Chronology chronology4 = dateTime1.getChronology();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime1.withChronology(chronology8);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        boolean boolean17 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.addWeekyears((-1));
        mutableDateTime16.addHours(26150565);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology25);
        org.joda.time.DurationField durationField28 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.year();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField33 = chronology25.millisOfSecond();
        mutableDateTime16.setRounding(dateTimeField33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime16.copy();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) -1);
        int int2 = localDate1.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 44);
        org.joda.time.DateTime dateTime8 = localDate1.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime9 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        mutableDateTime10.add((long) 'a');
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.addWeekyears((int) (byte) 1);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.centuryOfEra();
        mutableDateTime10.setDayOfYear(35);
        mutableDateTime10.addWeeks(26314650);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setDate(26466, 26469, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26469 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 44L + "'", long7 == 44L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.dayOfYear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.add((long) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property14 = dateTime10.yearOfEra();
        org.joda.time.DateTime dateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime16 = property14.roundHalfEvenCopy();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours19 = duration18.toStandardHours();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) dateTime21);
        mutablePeriod23.addSeconds(292278993);
        mutablePeriod23.setPeriod((long) 45, 946312L);
        org.joda.time.DateTime dateTime29 = dateTime16.minus((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.DateTime dateTime32 = dateTime16.withDurationAdded((long) 1969, (int) (short) -1);
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period35 = duration34.toPeriod();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration42 = duration39.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean43 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration44 = duration34.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration49 = duration46.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean50 = duration37.equals((java.lang.Object) duration46);
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Instant instant53 = new org.joda.time.Instant();
        org.joda.time.Instant instant55 = instant53.withMillis(0L);
        org.joda.time.Chronology chronology56 = instant55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.eras();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.now(chronology56);
        org.joda.time.Period period59 = duration37.toPeriod(periodType52, chronology56);
        org.joda.time.DurationFieldType durationFieldType61 = period59.getFieldType(1);
        mutableDateTime8.add(durationFieldType61, 61);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime8.millisOfSecond();
        int int65 = mutableDateTime8.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setTime(26482271, 37079542, 62537, 26414458);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26482271 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "53" + "'", str6, "53");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(hours19);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 41 + "'", int22 == 41);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        mutableDateTime15.setZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime8.toMutableDateTime(dateTimeZone16);
        boolean boolean20 = mutableDateTime19.isEqualNow();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str23 = duration22.toString();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours26 = duration25.toStandardHours();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration31 = duration22.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period34 = duration33.toPeriod();
        org.joda.time.Duration duration36 = duration33.minus((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now();
        mutableDateTime37.add((long) 'a');
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.yearOfCentury();
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period43 = duration42.toPeriod();
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration48 = duration45.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration49 = duration42.minus((org.joda.time.ReadableDuration) duration48);
        mutableDateTime37.add((org.joda.time.ReadableDuration) duration42);
        boolean boolean51 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration42);
        boolean boolean52 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period57 = duration56.toPeriod();
        org.joda.time.Duration duration60 = duration56.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.Duration duration62 = duration36.plus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        int int65 = dateTime64.getYearOfCentury();
        int int66 = dateTime64.getWeekyear();
        org.joda.time.DateTime dateTime68 = dateTime64.plus((long) 15);
        org.joda.time.DateTime.Property property69 = dateTime64.year();
        org.joda.time.DateTime dateTime70 = property69.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableDuration71, readableInstant72);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period((long) 100, 1L, periodType76);
        org.joda.time.Period period79 = period77.minusSeconds((-1));
        java.lang.String str80 = period77.toString();
        org.joda.time.Period period81 = period77.toPeriod();
        org.joda.time.PeriodType periodType82 = period77.getPeriodType();
        org.joda.time.Period period83 = period73.normalizedStandard(periodType82);
        java.lang.String str84 = periodType82.getName();
        org.joda.time.PeriodType periodType85 = periodType82.withYearsRemoved();
        org.joda.time.Period period86 = duration60.toPeriodTo((org.joda.time.ReadableInstant) dateTime70, periodType85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime19, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableDuration readableDuration88 = null;
        mutablePeriod87.setPeriod(readableDuration88);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-22T07:25:41.967Z" + "'", str14, "2022-02-22T07:25:41.967Z");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT86400S" + "'", str23, "PT86400S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(hours26);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 41 + "'", int29 == 41);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 22 + "'", int65 == 22);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PT0.099S" + "'", str80, "PT0.099S");
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Standard" + "'", str84, "Standard");
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.millisOfDay();
        org.joda.time.DateTime dateTime3 = mutableDateTime0.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMonths((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(26158);
        org.joda.time.DateTime dateTime9 = dateTime5.withYearOfEra(26184076);
        org.joda.time.DateTime dateTime11 = dateTime5.withWeekyear(2622452);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2022-02-22T07:25:42.011Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2022-02-22T07:25:42.011Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2022-02-22T07:25:42.011Z");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes(15);
        org.joda.time.Chronology chronology4 = dateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis(0L);
        org.joda.time.Chronology chronology11 = instant10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        long long16 = chronology11.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.yearOfCentury();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) 0, chronology11);
        int int20 = localTime19.getMillisOfDay();
        org.joda.time.LocalTime localTime22 = localTime19.minusMillis(2320);
        org.joda.time.LocalTime localTime24 = localTime19.plusSeconds(26359);
        org.joda.time.LocalTime localTime26 = localTime19.plusHours(38219999);
        int[] intArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localTime19, 37020985, intArray28, 62277);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 105144L + "'", long16 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = dateTimeZone1.getName(100L, locale3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(948227L, dateTimeZone1);
        long long7 = mutableDateTime6.getMillis();
        mutableDateTime6.setWeekyear(1439);
        boolean boolean11 = mutableDateTime6.isBefore(1645514186724L);
        long long12 = mutableDateTime6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime6.getZone();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(dateTimeZone13);
        org.joda.time.LocalTime localTime16 = localTime14.plusHours(26312485);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration30 = duration26.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration38 = duration35.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean39 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Minutes minutes40 = duration33.toStandardMinutes();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration33);
        int int42 = property22.getDifference((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime43 = dateTime24.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusMillis(2122);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = localTime16.compareTo((org.joda.time.ReadablePartial) localDateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutsch" + "'", str4, "Deutsch");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 948227L + "'", long7 == 948227L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-16756587851773L) + "'", long12 == (-16756587851773L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 19045 + "'", int42 == 19045);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.eras();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 44, chronology4);
        int int9 = dateTime8.getSecondOfMinute();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) 36946953);
        org.joda.time.Instant instant15 = instant10.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime16 = dateTime8.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime18 = dateTime8.withWeekyear(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusWeeks((-198));
        org.joda.time.DateTime dateTime22 = dateTime18.minusWeeks(39);
        int int23 = dateTime18.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 0);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime localTime29 = localTime27.withMillisOfSecond(20);
        org.joda.time.LocalTime localTime31 = localTime27.minusMinutes(22623598);
        org.joda.time.Chronology chronology32 = localTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime18.toMutableDateTime(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-22T07:20:54.501Z");
        mutableDateTime1.addSeconds(15856179);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        boolean boolean10 = property7.equals((java.lang.Object) 10L);
        long long11 = property7.remainder();
        java.lang.String str12 = property7.getAsText();
        org.joda.time.LocalDateTime localDateTime13 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property7.getFieldType();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMinutes(15);
        org.joda.time.Chronology chronology23 = dateTime20.getChronology();
        java.lang.String str24 = chronology23.toString();
        org.joda.time.DurationField durationField25 = chronology23.halfdays();
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 1, (long) (-1), chronology23);
        org.joda.time.DateTimeField dateTimeField27 = chronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType14.getField(chronology23);
        long long30 = dateTimeField28.remainder(4801285024346L);
        mutableDateTime1.setRounding(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1542067L + "'", long11 == 1542067L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[UTC]" + "'", str24, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1024346L + "'", long30 == 1024346L);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        org.joda.time.DurationFieldType durationFieldType8 = periodType5.getFieldType((int) (short) 0);
        java.lang.String str9 = periodType5.toString();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 53, (long) (-1), periodType5, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField18 = mutableDateTime17.getRoundingField();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDate19.toDateTimeAtCurrentTime();
        boolean boolean25 = dateTime24.isEqualNow();
        org.joda.time.DateTime dateTime27 = dateTime24.plus(1026189L);
        org.joda.time.DateTime.Property property28 = dateTime24.year();
        boolean boolean29 = mutableDateTime17.equals((java.lang.Object) property28);
        org.joda.time.DateTime dateTime30 = property28.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[YearDayTime]" + "'", str9, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set(1);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        mutableDateTime9.add((long) 'a');
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.yearOfCentury();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period15 = duration14.toPeriod();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration20 = duration17.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration21 = duration14.minus((org.joda.time.ReadableDuration) duration20);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration14);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime9.centuryOfEra();
        mutableDateTime9.addYears(0);
        mutableDateTime9.setMinuteOfDay((int) (short) 0);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration36 = duration32.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant37 = instant30.plus((org.joda.time.ReadableDuration) duration36);
        long long38 = instant37.getMillis();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime9, (org.joda.time.ReadableInstant) instant37);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration39, 999);
        mutableDateTime8.setSecondOfMinute(24);
        java.lang.String str44 = mutableDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime8.getZone();
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.Instant instant48 = instant46.withMillis(0L);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period51 = duration50.toPeriod();
        org.joda.time.Duration duration54 = duration50.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant55 = instant48.plus((org.joda.time.ReadableDuration) duration54);
        long long56 = instant55.getMillis();
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period59 = duration58.toPeriod();
        org.joda.time.Duration duration61 = duration58.minus((long) 292278993);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(readableInstant69, readableInstant70, periodType71);
        org.joda.time.DurationFieldType durationFieldType74 = periodType71.getFieldType((int) (short) 0);
        java.lang.String str75 = periodType71.toString();
        org.joda.time.Instant instant76 = new org.joda.time.Instant();
        org.joda.time.Instant instant78 = instant76.withMillis(0L);
        org.joda.time.Chronology chronology79 = instant78.getChronology();
        org.joda.time.Period period80 = new org.joda.time.Period((long) 53, (long) (-1), periodType71, chronology79);
        org.joda.time.Period period81 = new org.joda.time.Period((long) (short) -1, (long) 26148950, periodType71);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalTime localTime85 = new org.joda.time.LocalTime(dateTimeZone84);
        org.joda.time.LocalTime localTime87 = localTime85.minusHours((int) (byte) 100);
        org.joda.time.Chronology chronology88 = localTime87.getChronology();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) 45, 949680L, chronology88);
        org.joda.time.DateTimeField dateTimeField90 = chronology88.millisOfDay();
        org.joda.time.Period period91 = new org.joda.time.Period(3155760000000L, periodType71, chronology88);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) (short) 100, periodType71);
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant55, (org.joda.time.ReadableDuration) duration61, periodType71);
        long long94 = instant55.getMillis();
        int int95 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Instant instant98 = instant55.withDurationAdded((long) 903, 26);
        org.joda.time.MutableDateTime mutableDateTime99 = instant98.toMutableDateTime();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 86400000L + "'", long38 == 86400000L);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-50070-08-06T21:16:24.252+23:00" + "'", str44, "-50070-08-06T21:16:24.252+23:00");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 86400000L + "'", long56 == 86400000L);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PeriodType[YearDayTime]" + "'", str75, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 86400000L + "'", long94 == 86400000L);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(instant98);
        org.junit.Assert.assertNotNull(mutableDateTime99);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.LocalDate localDate3 = property1.withMaximumValue();
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate7 = property4.roundHalfCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime8.copy();
        mutableDateTime8.setDate((long) '#');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean17 = localDate14.isSupported(dateTimeFieldType16);
        int int18 = localDate14.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime8.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone19);
        long long24 = dateTimeZone19.previousTransition(950707L);
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        int int27 = dateTimeZone19.getStandardOffset(0L);
        org.joda.time.DateTime dateTime28 = localDate7.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.LocalDate.Property property29 = localDate7.monthOfYear();
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.Instant instant32 = instant30.toInstant();
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfHalfday();
        org.joda.time.DurationField durationField36 = dateTimeField35.getRangeDurationField();
        long long39 = durationField36.getMillis(597, 1645514423158L);
        int int41 = durationField36.getValue((long) 62289);
        boolean boolean42 = property29.equals((java.lang.Object) durationField36);
        long long45 = durationField36.getMillis(989095L, 311544071856818L);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = durationField36.getMillis(942808036587048L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 942808036587048 * 43200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 950707L + "'", long24 == 950707L);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 25790400000L + "'", long39 == 25790400000L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 42728904000000L + "'", long45 == 42728904000000L);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundFloor();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now();
        mutableDateTime17.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime17.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.add((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.toMutableDateTime(dateTimeZone25);
        int int28 = mutableDateTime27.getDayOfYear();
        int int29 = mutableDateTime27.getWeekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj33 = mutableDateTime32.clone();
        mutableDateTime32.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.add(1L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long43 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) 44);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone39);
        mutableDateTime38.setZoneRetainFields(dateTimeZone39);
        mutableDateTime38.addSeconds((int) (short) 10);
        java.lang.Object obj48 = mutableDateTime38.clone();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime38.era();
        mutableDateTime38.setTime((long) (byte) 10);
        mutableDateTime38.addMonths(44);
        org.joda.time.Period period55 = org.joda.time.Period.weeks((int) (byte) 0);
        org.joda.time.Period period57 = period55.minusMillis(19045);
        int int58 = period57.size();
        mutableDateTime38.add((org.joda.time.ReadablePeriod) period57, 26208340);
        org.joda.time.Period period62 = period57.plusSeconds(26461895);
        org.joda.time.Period period64 = period62.multipliedBy(0);
        mutableDateTime27.add((org.joda.time.ReadablePeriod) period64, 1132);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(mutableDateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 121 + "'", int28 == 121);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 17 + "'", int29 == 17);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(obj33);
// flaky:         org.junit.Assert.assertEquals(obj33.toString(), "2022-02-23T06:25:42.231+23:00");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "2022-02-23T06:25:42.231+23:00");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "2022-02-23T06:25:42.231+23:00");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 44L + "'", long43 == 44L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(obj48);
// flaky:         org.junit.Assert.assertEquals(obj48.toString(), "2022-02-24T00:00:10.046Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "2022-02-24T00:00:10.046Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "2022-02-24T00:00:10.046Z");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("German");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale6);
        java.lang.String str9 = locale6.getDisplayScript();
        java.util.Locale locale10 = locale6.stripExtensions();
        java.lang.String str11 = locale10.getDisplayVariant();
        java.util.Locale.Builder builder12 = builder2.setLocale(locale10);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField21 = localDateTime19.getField((int) (byte) 0);
        long long23 = dateTimeField21.roundHalfEven((long) 1);
        int int24 = dateTime14.get(dateTimeField21);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withCenturyOfEra((int) 'a');
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale33.getDisplayName();
        java.lang.String str35 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime29, 53, locale33);
        java.lang.String str37 = locale33.getExtension('a');
        java.util.Locale.Builder builder38 = builder12.setLocale(locale33);
        java.util.Locale.setDefault(locale33);
        java.lang.String str40 = locale33.getDisplayVariant();
        java.util.Locale locale41 = locale33.stripExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Deutsch" + "'", str34, "Deutsch");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "53" + "'", str35, "53");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set(45);
        org.joda.time.MutableDateTime mutableDateTime4 = property1.roundFloor();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) -1, 3155695200000L);
        mutablePeriod7.clear();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.Duration duration14 = duration10.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(15);
        org.joda.time.Interval interval19 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod7.setPeriod((org.joda.time.ReadableInterval) interval19);
        mutablePeriod7.setYears(0);
        mutablePeriod7.addMinutes((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration25, readableInstant26);
        org.joda.time.Period period29 = period27.withDays((int) (byte) 1);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100, chronology31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.millis();
        java.lang.String str34 = durationFieldType33.getName();
        boolean boolean35 = localTime32.isSupported(durationFieldType33);
        int int36 = period27.get(durationFieldType33);
        boolean boolean37 = mutablePeriod7.isSupported(durationFieldType33);
        int int38 = mutablePeriod7.getSeconds();
        mutableDateTime4.add((org.joda.time.ReadablePeriod) mutablePeriod7, 1424);
        int int41 = mutablePeriod7.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod7.setValue(849, 37118622);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 849");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "millis" + "'", str34, "millis");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration9 = duration5.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant10 = instant3.plus((org.joda.time.ReadableDuration) duration9);
        long long11 = instant10.getMillis();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.Period period14 = new org.joda.time.Period((-205878993L), chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.DurationField durationField17 = chronology12.hours();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86400000L + "'", long11 == 86400000L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        int int4 = localTime3.getMinuteOfHour();
        java.lang.String str6 = localTime3.toString("1");
        org.joda.time.LocalTime localTime8 = localTime3.minusMinutes(15);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime14 = dateTime10.plus((long) 15);
        org.joda.time.DateTime.Property property15 = dateTime10.year();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime();
        org.joda.time.LocalTime localTime19 = dateTime16.toLocalTime();
        org.joda.time.LocalTime localTime20 = localTime3.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime19.minus(readablePeriod21);
        java.lang.String str24 = localTime22.toString("00:15:59.418");
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration25, readableInstant26);
        org.joda.time.Period period29 = period27.withDays((int) (byte) 1);
        org.joda.time.Period period31 = period29.plusMinutes(26148950);
        org.joda.time.LocalTime localTime32 = localTime22.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.LocalTime localTime34 = localTime22.minusMillis(34);
        org.joda.time.LocalTime localTime36 = localTime22.withSecondOfMinute(34);
        org.joda.time.LocalTime.Property property37 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime39 = property37.addCopy(26251);
        org.joda.time.LocalTime localTime41 = property37.addWrapFieldToCopy(167);
        org.joda.time.LocalTime localTime42 = property37.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField43 = property37.getField();
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00:15:59.418" + "'", str24, "00:15:59.418");
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.secondOfDay();
        int int4 = mutableDateTime0.getDayOfWeek();
        mutableDateTime0.addHours(43);
        org.joda.time.DateTime dateTime7 = mutableDateTime0.toDateTime();
        int int8 = dateTime7.getYearOfEra();
        org.joda.time.DateTime.Property property9 = dateTime7.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addHours((int) (byte) 10);
        mutableDateTime0.addWeeks(20);
        org.joda.time.DateTimeField dateTimeField19 = mutableDateTime0.getRoundingField();
        int int20 = mutableDateTime0.getWeekyear();
        int int21 = mutableDateTime0.getDayOfWeek();
        int int22 = mutableDateTime0.getWeekyear();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours(946312L);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration24, 24);
        org.joda.time.DateTimeField dateTimeField27 = mutableDateTime0.getRoundingField();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardHours((-374399976L));
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNull(dateTimeField27);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DateTimeField dateTimeField3 = property1.getField();
        int int4 = property1.getLeapAmount();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale6.getISO3Language();
        org.joda.time.MutableDateTime mutableDateTime10 = property1.set("1969", locale6);
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleAttributes();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "deu" + "'", str9, "deu");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType6);
        org.joda.time.DurationFieldType durationFieldType9 = periodType6.getFieldType((int) (short) 0);
        java.lang.String str10 = periodType6.toString();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.Period period15 = new org.joda.time.Period((long) 53, (long) (-1), periodType6, chronology14);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.Period period19 = duration1.toPeriod(chronology14);
        org.joda.time.DurationField durationField20 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.weekyearOfCentury();
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PeriodType[YearDayTime]" + "'", str10, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(53);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration28 = duration21.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType((int) (short) 0);
        java.lang.String str35 = periodType31.toString();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration21, periodType31);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.addWeekyears(21);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        java.lang.String str42 = property40.getName();
        org.joda.time.MutableDateTime mutableDateTime44 = property40.add(62714);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[YearDayTime]" + "'", str35, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "weekOfWeekyear" + "'", str42, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(mutableDateTime44);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addHours((int) (byte) 10);
        mutableDateTime0.addWeeks(20);
        org.joda.time.DateTimeField dateTimeField19 = mutableDateTime0.getRoundingField();
        int int20 = mutableDateTime0.getMillisOfSecond();
        mutableDateTime0.setMillisOfDay(86399999);
        mutableDateTime0.setMillis(0L);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(dateTimeField19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 662 + "'", int20 == 662);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        int int4 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMinimumValue();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayName();
        java.lang.String str13 = dateTimeZone9.getName(100L, locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(948227L, dateTimeZone9);
        long long15 = mutableDateTime14.getMillis();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration22 = duration19.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean23 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField32 = localDateTime30.getField((int) (byte) 0);
        long long34 = dateTimeField32.roundHalfEven((long) 1);
        int int35 = dateTime25.get(dateTimeField32);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withCenturyOfEra((int) 'a');
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.lang.String str45 = locale44.getDisplayName();
        java.lang.String str46 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime40, 53, locale44);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.Duration duration52 = duration48.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime40.minus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property57 = localDateTime54.hourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusMillis((int) (byte) 0);
        int int60 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        boolean boolean61 = duration17.equals((java.lang.Object) int60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        int int65 = dateTime63.getYearOfEra();
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(readableInstant66, readableInstant67, periodType68);
        mutablePeriod69.setYears((int) '#');
        mutablePeriod69.setSeconds((int) 'a');
        org.joda.time.DateTime dateTime74 = dateTime63.plus((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime14, (org.joda.time.ReadableDuration) duration17);
        java.lang.Object obj77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(obj77);
        boolean boolean80 = dateTime78.isBefore((long) 7);
        java.lang.String str81 = dateTime78.toString();
        org.joda.time.DateTime dateTime83 = dateTime78.minus((long) 7);
        org.joda.time.Instant instant84 = new org.joda.time.Instant();
        org.joda.time.Instant instant86 = instant84.withMillis(0L);
        org.joda.time.Chronology chronology87 = instant86.getChronology();
        org.joda.time.DateTime dateTime88 = dateTime78.toDateTime(chronology87);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime(chronology87);
        org.joda.time.DateTime dateTime91 = dateTime89.minusDays(2100);
        int int92 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) dateTime89);
        int int93 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        int int94 = mutableDateTime14.getYear();
        mutableDateTime14.setWeekyear(26427);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setHourOfDay(181);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 181 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deutsch" + "'", str12, "Deutsch");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 948227L + "'", long15 == 948227L);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Deutsch" + "'", str45, "Deutsch");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "53" + "'", str46, "53");
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 42 + "'", int64 == 42);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2022 + "'", int65 == 2022);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "2022-02-23T06:25:42.582+23:00" + "'", str81, "2022-02-23T06:25:42.582+23:00");
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(instant86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1970 + "'", int94 == 1970);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = dateTimeZone1.getName(100L, locale3);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        mutableDateTime7.addDays(55);
        java.lang.Object obj12 = mutableDateTime7.clone();
        mutableDateTime7.addWeekyears(262);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutsch" + "'", str4, "Deutsch");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "1970-02-25T00:00:01.970Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "1970-02-25T00:00:01.970Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "1970-02-25T00:00:01.970Z");
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.era();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale6.getDisplayCountry(locale8);
        int int11 = dateTimeField5.getMaximumShortTextLength(locale8);
        org.joda.time.DurationField durationField12 = dateTimeField5.getLeapDurationField();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = dateTimeZone1.getName(100L, locale3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(948227L, dateTimeZone1);
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration14 = duration11.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean15 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration14);
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField24 = localDateTime22.getField((int) (byte) 0);
        long long26 = dateTimeField24.roundHalfEven((long) 1);
        int int27 = dateTime17.get(dateTimeField24);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withCenturyOfEra((int) 'a');
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.lang.String str37 = locale36.getDisplayName();
        java.lang.String str38 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime32, 53, locale36);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period41 = duration40.toPeriod();
        org.joda.time.Duration duration44 = duration40.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime32.minus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.hourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusMillis((int) (byte) 0);
        int int52 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        boolean boolean53 = duration9.equals((java.lang.Object) int52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology54);
        int int56 = dateTime55.getSecondOfMinute();
        int int57 = dateTime55.getYearOfEra();
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant58, readableInstant59, periodType60);
        mutablePeriod61.setYears((int) '#');
        mutablePeriod61.setSeconds((int) 'a');
        org.joda.time.DateTime dateTime66 = dateTime55.plus((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.Period period70 = period68.withMillis(26186255);
        int[] intArray71 = period70.getValues();
        org.joda.time.Period period73 = period70.minusMinutes(832);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutsch" + "'", str4, "Deutsch");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 948227L + "'", long7 == 948227L);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2022 + "'", int27 == 2022);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Deutsch" + "'", str37, "Deutsch");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "53" + "'", str38, "53");
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 42 + "'", int56 == 42);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 0, 0, 0, 1, 40, 26186255]");
        org.junit.Assert.assertNotNull(period73);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period4 = duration3.toPeriod();
        org.joda.time.Duration duration7 = duration3.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        mutableDateTime11.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        org.joda.time.DurationFieldType durationFieldType26 = periodType23.getFieldType((int) (short) 0);
        java.lang.String str27 = periodType23.toString();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.Period period32 = new org.joda.time.Period((long) 53, (long) (-1), periodType23, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType18.getField(chronology31);
        java.util.Locale locale34 = java.util.Locale.UK;
        java.lang.String str35 = locale34.getDisplayLanguage();
        int int36 = dateTimeField33.getMaximumTextLength(locale34);
        mutableDateTime17.setRounding(dateTimeField33);
        org.joda.time.Duration duration38 = period8.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime17.centuryOfEra();
        org.joda.time.Duration duration41 = new org.joda.time.Duration(0L);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardDays((-9571L));
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardMinutes(1L);
        org.joda.time.Period period46 = duration45.toPeriod();
        org.joda.time.Duration duration47 = duration43.minus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration48 = duration41.minus((org.joda.time.ReadableDuration) duration45);
        long long49 = duration45.getMillis();
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration45);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime17.hourOfDay();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[YearDayTime]" + "'", str27, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Englisch" + "'", str35, "Englisch");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 60000L + "'", long49 == 60000L);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.Period period7 = period5.minusSeconds((-1));
        org.joda.time.Period period9 = period7.multipliedBy((int) '#');
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        int int11 = period9.getYears();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        mutableDateTime12.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime20 = property16.set(1);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        mutableDateTime21.add((long) 'a');
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.yearOfCentury();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration32 = duration29.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration33 = duration26.minus((org.joda.time.ReadableDuration) duration32);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration26);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime21.centuryOfEra();
        mutableDateTime21.addYears(0);
        mutableDateTime21.setMinuteOfDay((int) (short) 0);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.Instant instant42 = instant40.withMillis(0L);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration48 = duration44.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant49 = instant42.plus((org.joda.time.ReadableDuration) duration48);
        long long50 = instant49.getMillis();
        org.joda.time.Duration duration51 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime21, (org.joda.time.ReadableInstant) instant49);
        mutableDateTime20.add((org.joda.time.ReadableDuration) duration51, 999);
        mutableDateTime20.setSecondOfMinute(24);
        java.lang.String str56 = mutableDateTime20.toString();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime20.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfCeiling();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(10, 1, 53, 15);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(readableInstant64, readableInstant65, periodType66);
        org.joda.time.DurationFieldType durationFieldType69 = periodType66.getFieldType((int) (short) 0);
        int int70 = mutablePeriod63.get(durationFieldType69);
        org.joda.time.Instant instant71 = new org.joda.time.Instant();
        org.joda.time.Instant instant73 = instant71.withMillis(0L);
        org.joda.time.Chronology chronology74 = instant73.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.eras();
        long long79 = chronology74.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField80 = chronology74.secondOfMinute();
        boolean boolean81 = dateTimeField80.isSupported();
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property83 = localDate82.monthOfYear();
        int int84 = dateTimeField80.getMinimumValue((org.joda.time.ReadablePartial) localDate82);
        org.joda.time.LocalDate localDate86 = localDate82.withYearOfCentury(46);
        org.joda.time.LocalDate.Property property87 = localDate82.dayOfMonth();
        org.joda.time.Chronology chronology88 = localDate82.getChronology();
        org.joda.time.DateTimeZone dateTimeZone89 = chronology88.getZone();
        boolean boolean90 = durationFieldType69.isSupported(chronology88);
        mutableDateTime58.add(durationFieldType69, 26249317);
        org.joda.time.Period period94 = period9.withField(durationFieldType69, 3);
        mutableDateTime1.add(durationFieldType69, 62725);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "-50070-08-06T21:07:24.799+23:00" + "'", str56, "-50070-08-06T21:07:24.799+23:00");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 105144L + "'", long79 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(localDate86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime2.setSecondOfMinute(53);
        mutableDateTime2.addMonths(0);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.LocalDate localDate10 = property8.roundCeilingCopy();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekOfWeekyear();
        mutableDateTime2.setChronology(chronology11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(1005101L, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.set(45);
        org.joda.time.MutableDateTime mutableDateTime24 = property21.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.now(chronology30);
        org.joda.time.DurationField durationField33 = chronology30.eras();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 44, chronology30);
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType25.getField(chronology30);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 1L, periodType38);
        org.joda.time.Period period41 = period39.minusSeconds((-1));
        java.lang.String str42 = period39.toString();
        long long45 = chronology30.add((org.joda.time.ReadablePeriod) period39, (long) ' ', (int) 'a');
        org.joda.time.Period period47 = period39.minusHours((-292275054));
        org.joda.time.Period period49 = period47.minusHours(2000);
        int int50 = period47.getMinutes();
        org.joda.time.Period period51 = period47.toPeriod();
        mutableDateTime24.add((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology54, locale56);
        java.util.Locale locale59 = dateTimeParserBucket58.getLocale();
        long long60 = dateTimeParserBucket58.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeParserBucket58.getZone();
        mutableDateTime24.setZone(dateTimeZone61);
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj65 = mutableDateTime64.clone();
        mutableDateTime64.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime64.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime70 = property68.add(1L);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone72 = dateTimeZone71.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        long long75 = dateTimeZone71.getMillisKeepLocal(dateTimeZone73, (long) 44);
        org.joda.time.DateTime dateTime76 = org.joda.time.DateTime.now(dateTimeZone71);
        mutableDateTime70.setZoneRetainFields(dateTimeZone71);
        java.util.Locale.Builder builder79 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder80 = builder79.clear();
        java.util.Locale locale81 = builder80.build();
        java.lang.String str82 = dateTimeZone71.getName(555370422L, locale81);
        java.lang.String str83 = dateTimeZone61.getShortName((long) 25, locale81);
        java.lang.String str84 = locale81.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            long long85 = dateTimeField17.set(46L, "2022-02-22T07:23:08.769Z", locale81);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:23:08.769Z\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0.099S" + "'", str42, "PT0.099S");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-9571L) + "'", long45 == (-9571L));
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-82799903L) + "'", long60 == (-82799903L));
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(obj65);
// flaky:         org.junit.Assert.assertEquals(obj65.toString(), "2022-02-23T06:25:42.767+23:00");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "2022-02-23T06:25:42.767+23:00");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "2022-02-23T06:25:42.767+23:00");
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 44L + "'", long75 == 44L);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+00:00" + "'", str82, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+23:00" + "'", str83, "+23:00");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale3);
        java.lang.Object obj6 = dateTimeParserBucket5.saveState();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) 100, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str11 = durationFieldType10.getName();
        boolean boolean12 = localTime9.isSupported(durationFieldType10);
        boolean boolean13 = dateTimeParserBucket5.restoreState((java.lang.Object) boolean12);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime18 = dateTime16.withZoneRetainFields(dateTimeZone17);
        dateTimeParserBucket5.setZone(dateTimeZone17);
        long long21 = dateTimeParserBucket5.computeMillis(true);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 863);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        mutableDateTime24.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime32 = property28.set(1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        int int35 = dateTime34.getYearOfCentury();
        int int36 = dateTime34.getWeekyear();
        org.joda.time.DateTime dateTime37 = dateTime34.withEarlierOffsetAtOverlap();
        java.lang.String str38 = dateTime37.toString();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        boolean boolean41 = dateTimeZone40.isFixed();
        mutableDateTime39.setZoneRetainFields(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.yearOfCentury();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.weekOfWeekyear();
        boolean boolean46 = dateTimeParserBucket5.restoreState((java.lang.Object) mutableDateTime43);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime43.era();
        java.lang.String str48 = mutableDateTime43.toString();
        mutableDateTime43.setMillis((long) 890);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime43.setMonthOfYear(63704);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 63704 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weeks" + "'", str11, "weeks");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2022-02-23T06:25:42.870+23:00" + "'", str38, "2022-02-23T06:25:42.870+23:00");
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2022-01-02T01:00:00.000Z" + "'", str48, "2022-01-02T01:00:00.000Z");
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plus((long) 15);
        org.joda.time.DateTime.Property property6 = dateTime1.year();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime();
        int int10 = dateTime7.getMillisOfSecond();
        int int11 = dateTime7.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getDisplayName();
        java.lang.String str17 = dateTimeZone13.getName(100L, locale15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(948227L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.year();
        org.joda.time.ReadableInstant readableInstant20 = null;
        mutableDateTime18.setMillis(readableInstant20);
        mutableDateTime18.addYears(36985848);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.era();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime18.yearOfCentury();
        int int26 = dateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime18.setMonthOfYear(26464145);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26464145 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u5fb7\u6587" + "'", str16, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.addYears(0);
        mutableDateTime0.setMinuteOfDay((int) (short) 0);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration27 = duration23.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant28 = instant21.plus((org.joda.time.ReadableDuration) duration27);
        long long29 = instant28.getMillis();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) instant28);
        mutableDateTime0.addHours(20);
        mutableDateTime0.setMillisOfSecond(57);
        mutableDateTime0.addDays(2);
        mutableDateTime0.setDate((long) 253);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime0.yearOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 86400000L + "'", long29 == 86400000L);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.add((long) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getYearOfCentury();
        int int11 = dateTime9.getWeekyear();
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfYear();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) dateTime13);
        mutableDateTime7.add((-1L));
        int int17 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.minusHours((int) (byte) 100);
        int int22 = localTime21.getMinuteOfHour();
        java.lang.String str24 = localTime21.toString("1");
        org.joda.time.LocalTime localTime26 = localTime21.minusMinutes(15);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getYearOfCentury();
        int int30 = dateTime28.getWeekyear();
        org.joda.time.DateTime dateTime32 = dateTime28.plus((long) 15);
        org.joda.time.DateTime.Property property33 = dateTime28.year();
        org.joda.time.DateTime dateTime34 = property33.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime34.toMutableDateTime();
        org.joda.time.LocalTime localTime37 = dateTime34.toLocalTime();
        org.joda.time.LocalTime localTime38 = localTime21.withFields((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime37.minus(readablePeriod39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str42 = dateTimeFieldType41.getName();
        int int43 = localTime40.get(dateTimeFieldType41);
        boolean boolean44 = mutableDateTime7.isSupported(dateTimeFieldType41);
        mutableDateTime7.addMonths(97);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime7.dayOfMonth();
        org.joda.time.DurationField durationField48 = property47.getDurationField();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        org.junit.Assert.assertNotNull(localTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "clockhourOfDay" + "'", str42, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 24 + "'", int43 == 24);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(durationField48);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        mutableDateTime6.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime6.copy();
        mutableDateTime6.setDate((long) '#');
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        int int16 = localDate12.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime6.toDateTime(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.PeriodType periodType25 = period24.getPeriodType();
        boolean boolean26 = dateTimeZone17.equals((java.lang.Object) periodType25);
        mutableDateTime0.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = property29.setCopy(26727334);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26727334 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes(15);
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        java.lang.String str6 = chronology5.toString();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 2022, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.days();
        java.lang.String str9 = chronology5.toString();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DurationField durationField12 = chronology5.weekyears();
        org.joda.time.Period period14 = org.joda.time.Period.weeks((int) (byte) 0);
        org.joda.time.Period period16 = period14.minusMillis(19045);
        org.joda.time.Period period18 = period14.minusYears(0);
        org.joda.time.Period period20 = period18.withWeeks((int) 'x');
        org.joda.time.Period period22 = period18.withDays(62248);
        org.joda.time.Period period24 = period18.minusYears(26224);
        org.joda.time.Period period26 = period18.minusMonths(36981644);
        int[] intArray29 = chronology5.get((org.joda.time.ReadablePeriod) period26, (long) 62243, (long) (-7938));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[+23:00]" + "'", str6, "ISOChronology[+23:00]");
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[+23:00]" + "'", str9, "ISOChronology[+23:00]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, -1, -10, -181]");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        int int4 = localTime3.getMinuteOfHour();
        java.lang.String str6 = localTime3.toString("1");
        org.joda.time.LocalTime localTime8 = localTime3.minusMinutes(15);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime14 = dateTime10.plus((long) 15);
        org.joda.time.DateTime.Property property15 = dateTime10.year();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime();
        org.joda.time.LocalTime localTime19 = dateTime16.toLocalTime();
        org.joda.time.LocalTime localTime20 = localTime3.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime19.minus(readablePeriod21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str24 = dateTimeFieldType23.getName();
        int int25 = localTime22.get(dateTimeFieldType23);
        int int26 = localTime22.getMillisOfSecond();
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "clockhourOfDay" + "'", str24, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 24 + "'", int25 == 24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-22T07:19:57.260Z");
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(15);
        org.joda.time.Interval interval10 = duration5.toIntervalTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) -1);
        org.joda.time.DateTime dateTime14 = dateTime9.withDurationAdded((org.joda.time.ReadableDuration) duration12, 50);
        org.joda.time.DateTime dateTime16 = dateTime9.withYearOfEra(26349625);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime1.toString(dateTimeFormatter3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        mutableDateTime6.add((long) 'a');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.yearOfCentury();
        mutableDateTime6.addSeconds(0);
        mutableDateTime6.add((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime6.getZone();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 1973, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime1.withZone(dateTimeZone14);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-23T06:25:43.168+23:00" + "'", str4, "2022-02-23T06:25:43.168+23:00");
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj3 = mutableDateTime2.clone();
        mutableDateTime2.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add(1L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 44);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone9);
        mutableDateTime8.setZoneRetainFields(dateTimeZone9);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = builder18.build();
        java.lang.String str20 = dateTimeZone9.getName(555370422L, locale19);
        java.lang.String str22 = dateTimeZone9.getShortName(962578L);
        long long25 = dateTimeZone9.convertLocalToUTC((long) 62151, false);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 26150565, dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(1645514421863L, dateTimeZone9);
        mutableDateTime27.addSeconds(900);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.dayOfMonth();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "2022-02-23T06:25:43.196+23:00");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "2022-02-23T06:25:43.196+23:00");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "2022-02-23T06:25:43.196+23:00");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 44L + "'", long13 == 44L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 62151L + "'", long25 == 62151L);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((-1));
        java.lang.String str12 = period9.toString();
        org.joda.time.Period period13 = period9.toPeriod();
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Period period15 = period5.normalizedStandard(periodType14);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Instant instant18 = instant16.withMillis(0L);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        long long24 = chronology19.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField25 = chronology19.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(44L, periodType14, chronology19);
        org.joda.time.PeriodType periodType27 = periodType14.withWeeksRemoved();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        long long36 = chronology31.add(0L, (long) 2022, (int) '4');
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableDuration37, readableInstant38);
        int[] intArray42 = chronology31.get((org.joda.time.ReadablePeriod) period39, (long) 0, (long) 48);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(6L, periodType14, chronology31);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(36946953L, chronology31);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0.099S" + "'", str12, "PT0.099S");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 105144L + "'", long24 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 105144L + "'", long36 == 105144L);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 0, 0, 0, 0, 48]");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str5 = duration4.toString();
        org.joda.time.Instant instant6 = instant0.minus((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration16 = duration13.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean17 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration18 = duration8.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration23 = duration20.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean24 = duration11.equals((java.lang.Object) duration20);
        org.joda.time.Instant instant26 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration11, 26150565);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration34 = duration30.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration34);
        long long36 = duration34.getMillis();
        boolean boolean37 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Period period38 = duration34.toPeriod();
        org.joda.time.Period period40 = period38.minusHours(62194);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime42.setSecondOfMinute(53);
        int int45 = mutableDateTime42.getEra();
        mutableDateTime42.setHourOfDay((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime42.copy();
        org.joda.time.Duration duration50 = period40.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration51, readableInstant52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period59 = period57.minusSeconds((-1));
        java.lang.String str60 = period57.toString();
        org.joda.time.Period period61 = period57.toPeriod();
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Period period63 = period53.normalizedStandard(periodType62);
        int int64 = period63.getWeeks();
        mutableDateTime49.add((org.joda.time.ReadablePeriod) period63, 2022);
        org.joda.time.Period period68 = period63.withDays(1058);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT86400S" + "'", str5, "PT86400S");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 86400000L + "'", long36 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0.099S" + "'", str60, "PT0.099S");
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) -1);
        int int2 = localDate1.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 44);
        org.joda.time.DateTime dateTime8 = localDate1.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime9 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        mutableDateTime10.add((long) 'a');
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.addWeekyears((int) (byte) 1);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.weekyear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 44L + "'", long7 == 44L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration6 = duration3.withDurationAdded((long) (short) 100, (int) ' ');
        long long7 = duration6.getMillis();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis(0L);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.months();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime17, periodType18);
        boolean boolean20 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime15);
        int int21 = dateTime15.getDayOfMonth();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant22, readableInstant23, periodType24);
        org.joda.time.PeriodType periodType26 = periodType24.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime15, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period(0L, 24L, periodType24);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale33.getDisplayName();
        java.lang.String str35 = dateTimeZone31.getName(100L, locale33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(948227L, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.year();
        mutableDateTime36.addHours(16);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant43, readableInstant44, periodType45);
        org.joda.time.DurationFieldType durationFieldType48 = periodType45.getFieldType((int) (short) 0);
        java.lang.String str49 = periodType45.toString();
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Instant instant52 = instant50.withMillis(0L);
        org.joda.time.Chronology chronology53 = instant52.getChronology();
        org.joda.time.Period period54 = new org.joda.time.Period((long) 53, (long) (-1), periodType45, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType40.getField(chronology53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMinutes(15);
        org.joda.time.Chronology chronology60 = dateTime57.getChronology();
        java.lang.String str61 = chronology60.toString();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType40.getField(chronology60);
        org.joda.time.DurationField durationField63 = chronology60.centuries();
        org.joda.time.DateTimeField dateTimeField64 = chronology60.millisOfDay();
        mutableDateTime36.setChronology(chronology60);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 46, chronology60);
        org.joda.time.Period period67 = period28.withFields((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property69 = localDate68.monthOfYear();
        org.joda.time.DateTimeField dateTimeField70 = property69.getField();
        org.joda.time.LocalDate localDate71 = property69.roundCeilingCopy();
        org.joda.time.Chronology chronology72 = localDate71.getChronology();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 0);
        org.joda.time.DateTime dateTime76 = localDate71.toDateTimeAtMidnight(dateTimeZone75);
        org.joda.time.DateTime.Property property77 = dateTime76.monthOfYear();
        org.joda.time.DateTime dateTime79 = dateTime76.minusMonths(53);
        org.joda.time.DateTime dateTime81 = dateTime76.minusMonths(60);
        org.joda.time.Duration duration83 = new org.joda.time.Duration((long) 59);
        org.joda.time.DateTime dateTime84 = dateTime81.minus((org.joda.time.ReadableDuration) duration83);
        org.joda.time.MutableDateTime mutableDateTime85 = dateTime84.toMutableDateTime();
        java.util.Date date86 = dateTime84.toDate();
        org.joda.time.DateTime dateTime87 = dateTime84.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration88 = period28.toDurationTo((org.joda.time.ReadableInstant) dateTime87);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime90 = dateTime87.withWeekOfWeekyear(113);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 113 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86403200L + "'", long7 == 86403200L);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u5fb7\u6587" + "'", str34, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PeriodType[YearDayTime]" + "'", str49, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(chronology60);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ISOChronology[+23:00]" + "'", str61, "ISOChronology[+23:00]");
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(mutableDateTime85);
        org.junit.Assert.assertNotNull(date86);
// flaky:         org.junit.Assert.assertEquals(date86.toString(), "Sun Feb 26 18:59:59 GMT+00:00 2017");
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(duration88);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.setDayOfMonth(3);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.add(62181);
        mutableDateTime7.setMillis(1645514274696L);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.Period period16 = org.joda.time.Period.hours((int) (short) 10);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.monthOfYear();
        org.joda.time.LocalDate localDate19 = property18.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtMidnight();
        boolean boolean21 = period16.equals((java.lang.Object) localDate19);
        org.joda.time.DateTime dateTime22 = dateTime14.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Seconds seconds23 = period16.toStandardSeconds();
        mutableDateTime7.add((org.joda.time.ReadablePeriod) period16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration25 = new org.joda.time.Duration((java.lang.Object) mutableDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.MutableDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(seconds23);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        org.joda.time.DurationFieldType durationFieldType8 = periodType5.getFieldType((int) (short) 0);
        java.lang.String str9 = periodType5.toString();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 53, (long) (-1), periodType5, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology13.getZone();
        long long19 = dateTimeZone17.nextTransition((long) 26425743);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[YearDayTime]" + "'", str9, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 26425743L + "'", long19 == 26425743L);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-22T07:16:10.145Z");
        mutableDateTime1.setWeekyear(26675953);
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths(22);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.LocalDate.Property property8 = localDate5.weekyear();
        org.joda.time.LocalDate localDate10 = localDate5.plusDays(26208340);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.monthOfYear();
        java.util.Date date13 = localDate11.toDate();
        org.joda.time.LocalDate.Property property14 = localDate11.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        java.lang.String str16 = durationFieldType15.getName();
        org.joda.time.LocalDate localDate18 = localDate11.withFieldAdded(durationFieldType15, (int) 'a');
        org.joda.time.LocalDate localDate20 = localDate10.withFieldAdded(durationFieldType15, 26249317);
        org.joda.time.LocalDate localDate22 = localDate10.plusYears(62259);
        org.joda.time.LocalDate.Property property23 = localDate22.weekyear();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        mutableDateTime24.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now();
        mutableDateTime30.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime30.copy();
        mutableDateTime30.setDate((long) '#');
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean39 = localDate36.isSupported(dateTimeFieldType38);
        int int40 = localDate36.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight42 = localDate36.toDateMidnight(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = mutableDateTime30.toDateTime(dateTimeZone41);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(dateTimeZone41);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 1L, periodType47);
        org.joda.time.PeriodType periodType49 = period48.getPeriodType();
        boolean boolean50 = dateTimeZone41.equals((java.lang.Object) periodType49);
        mutableDateTime24.setZoneRetainFields(dateTimeZone41);
        long long53 = dateTimeZone41.nextTransition(100L);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime56 = localDate22.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.format.DateTimePrinter dateTimePrinter57 = null;
        org.joda.time.format.DateTimeParser dateTimeParser58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter57, dateTimeParser58);
        org.joda.time.Instant instant60 = new org.joda.time.Instant();
        org.joda.time.Instant instant62 = instant60.withMillis(0L);
        org.joda.time.Chronology chronology63 = instant62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.eras();
        long long68 = chronology63.add(0L, (long) 2022, (int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter59.withChronology(chronology63);
        java.lang.Object obj70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(obj70);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField78 = localDateTime76.getField((int) (byte) 0);
        long long80 = dateTimeField78.roundHalfEven((long) 1);
        int int81 = dateTime71.get(dateTimeField78);
        org.joda.time.LocalDateTime localDateTime82 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.withCenturyOfEra((int) 'a');
        java.util.Locale locale90 = java.util.Locale.GERMAN;
        java.lang.String str91 = locale90.getDisplayName();
        java.lang.String str92 = dateTimeField78.getAsText((org.joda.time.ReadablePartial) localDateTime86, 53, locale90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter93 = dateTimeFormatter59.withLocale(locale90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter95 = dateTimeFormatter59.withPivotYear((java.lang.Integer) 26333);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = dateTime56.toString(dateTimeFormatter95);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 23 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "years" + "'", str16, "years");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 54 + "'", int40 == 54);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 105144L + "'", long68 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2022 + "'", int81 == 2022);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str91, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "53" + "'", str92, "53");
        org.junit.Assert.assertNotNull(dateTimeFormatter93);
        org.junit.Assert.assertNotNull(dateTimeFormatter95);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plus((long) 15);
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime5.withCenturyOfEra((int) '#');
        org.joda.time.DateTime dateTime10 = dateTime5.withYear((int) 'u');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes(15);
        org.joda.time.Chronology chronology15 = dateTime12.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.hours();
        org.joda.time.DurationField durationField17 = chronology15.years();
        org.joda.time.DateTime dateTime18 = dateTime10.toDateTime(chronology15);
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property5 = dateTime1.yearOfEra();
        int int6 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime1.minusMonths(37020985);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusMillis((int) (byte) 0);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.Period period23 = period21.minusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.minus((org.joda.time.ReadablePeriod) period21);
        mutableDateTime9.add((org.joda.time.ReadablePeriod) period21, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone30);
        mutableDateTime28.setZone(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableDuration34, readableInstant35);
        java.lang.String str37 = period36.toString();
        org.joda.time.Period period39 = period36.withHours(69);
        mutableDateTime28.add((org.joda.time.ReadablePeriod) period36);
        org.joda.time.DateTime dateTime41 = dateTime1.minus((org.joda.time.ReadablePeriod) period36);
        int int42 = period36.getMillis();
        org.joda.time.Period period44 = period36.withHours(838);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0S" + "'", str37, "PT0S");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        mutableDateTime9.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime9.copy();
        mutableDateTime9.setDate((long) '#');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean18 = localDate15.isSupported(dateTimeFieldType17);
        int int19 = localDate15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight21 = localDate15.toDateMidnight(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime9.toDateTime(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone20);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        boolean boolean29 = dateTimeZone20.equals((java.lang.Object) periodType28);
        org.joda.time.PeriodType periodType30 = periodType28.withHoursRemoved();
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime32 = instant31.toDateTime();
        org.joda.time.Instant instant33 = instant31.toInstant();
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 54, periodType30, chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.weekyearOfCentury();
        mutableDateTime7.setChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.year();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology34.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(1447, 26608, 37249, 2016, 81, dateTimeZone39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2016 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 54 + "'", int19 == 54);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 1, chronology7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod3.setPeriod(readableInterval9);
        int int11 = mutablePeriod3.getDays();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) 36946953);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period16 = duration15.toPeriod();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration23 = duration20.withDurationAdded((long) (short) 100, (int) ' ');
        boolean boolean24 = duration18.isLongerThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration25 = duration15.minus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Days days26 = duration15.toStandardDays();
        boolean boolean27 = duration13.isEqual((org.joda.time.ReadableDuration) duration15);
        long long28 = duration15.getStandardSeconds();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean31 = localDate29.isSupported(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property32 = localDate29.yearOfEra();
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str38 = duration37.toString();
        org.joda.time.Instant instant39 = instant33.minus((org.joda.time.ReadableDuration) duration37);
        int int40 = property32.getDifference((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) (short) -1, (long) (-292275054));
        org.joda.time.Instant instant44 = instant33.plus((org.joda.time.ReadableDuration) duration43);
        int int45 = duration15.compareTo((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration47, readableInstant48);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 100, 1L, periodType52);
        org.joda.time.Period period55 = period53.minusSeconds((-1));
        java.lang.String str56 = period53.toString();
        org.joda.time.Period period57 = period53.toPeriod();
        org.joda.time.PeriodType periodType58 = period53.getPeriodType();
        org.joda.time.Period period59 = period49.normalizedStandard(periodType58);
        org.joda.time.Instant instant60 = new org.joda.time.Instant();
        org.joda.time.Instant instant62 = instant60.withMillis(0L);
        org.joda.time.Chronology chronology63 = instant62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.eras();
        long long68 = chronology63.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField69 = chronology63.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(44L, periodType58, chronology63);
        org.joda.time.DateTimeField dateTimeField71 = chronology63.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField72 = chronology63.weekyearOfCentury();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration15, chronology63);
        mutablePeriod3.clear();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.PeriodType periodType81 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant79, readableInstant80, periodType81);
        org.joda.time.DurationFieldType durationFieldType84 = periodType81.getFieldType((int) (short) 0);
        java.lang.String str85 = periodType81.toString();
        org.joda.time.Instant instant86 = new org.joda.time.Instant();
        org.joda.time.Instant instant88 = instant86.withMillis(0L);
        org.joda.time.Chronology chronology89 = instant88.getChronology();
        org.joda.time.Period period90 = new org.joda.time.Period((long) 53, (long) (-1), periodType81, chronology89);
        org.joda.time.DateTimeField dateTimeField91 = dateTimeFieldType76.getField(chronology89);
        org.joda.time.DateTimeField dateTimeField92 = chronology89.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime93 = new org.joda.time.MutableDateTime(chronology89);
        org.joda.time.DateTimeField dateTimeField94 = chronology89.millisOfSecond();
        org.joda.time.Period period95 = new org.joda.time.Period(555370422L, chronology89);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) period95);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 86400L + "'", long28 == 86400L);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT86400S" + "'", str38, "PT86400S");
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0.099S" + "'", str56, "PT0.099S");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 105144L + "'", long68 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PeriodType[YearDayTime]" + "'", str85, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant88);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertNotNull(dateTimeField91);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(dateTimeField94);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream4 = languageRangeList2.stream();
        boolean boolean5 = strSet0.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream6 = languageRangeList2.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap7);
        org.joda.time.tz.Provider provider9 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone11 = provider9.getZone("2022-02-22T07:16:06.809Z");
        java.util.Set<java.lang.String> strSet12 = provider9.getAvailableIDs();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strSet12.spliterator();
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet12);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.set(45);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.add(45);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        long long28 = dateTimeZone25.previousTransition(100L);
        int int30 = dateTimeZone25.getStandardOffset(86403200L);
        org.joda.time.DateTime dateTime31 = mutableDateTime24.toDateTime(dateTimeZone25);
        mutableDateTime17.setZoneRetainFields(dateTimeZone25);
        java.lang.String str34 = dateTimeZone25.getNameKey((long) 36950209);
        java.lang.String str35 = dateTimeZone25.getID();
        long long38 = dateTimeZone25.convertLocalToUTC(1645514162999L, true);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(1645514162999L, dateTimeZone25);
        java.lang.String str40 = dateTimeZone25.getID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = strSet12.contains((java.lang.Object) dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.tz.FixedDateTimeZone cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeStream6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1645514162999L + "'", long38 == 1645514162999L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(53);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration28 = duration21.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType((int) (short) 0);
        java.lang.String str35 = periodType31.toString();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration21, periodType31);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.addWeekyears(21);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.set(44);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime45 = property40.add((long) 26158);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundFloor();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.weekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[YearDayTime]" + "'", str35, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(53);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration28 = duration21.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType((int) (short) 0);
        java.lang.String str35 = periodType31.toString();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration21, periodType31);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.addWeekyears(21);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.set(44);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime46 = property43.set("2022-02-22T10:20:12.297");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T10:20:12.297\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[YearDayTime]" + "'", str35, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str9 = duration8.toString();
        org.joda.time.Instant instant10 = instant4.minus((org.joda.time.ReadableDuration) duration8);
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((long) (short) -1, (long) (-292275054));
        org.joda.time.Instant instant15 = instant4.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str18 = duration17.toString();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours21 = duration20.toStandardHours();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration26 = duration17.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period29 = duration28.toPeriod();
        org.joda.time.Duration duration31 = duration28.minus((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now();
        mutableDateTime32.add((long) 'a');
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.yearOfCentury();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period38 = duration37.toPeriod();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration43 = duration40.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration44 = duration37.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime32.add((org.joda.time.ReadableDuration) duration37);
        boolean boolean46 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration37);
        boolean boolean47 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Instant instant48 = instant15.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period53 = duration52.toPeriod();
        org.joda.time.Duration duration56 = duration52.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.Period period59 = period57.plusSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now();
        mutableDateTime60.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime60.copy();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime65 = property64.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime66 = property64.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant70, readableInstant71, periodType72);
        org.joda.time.DurationFieldType durationFieldType75 = periodType72.getFieldType((int) (short) 0);
        java.lang.String str76 = periodType72.toString();
        org.joda.time.Instant instant77 = new org.joda.time.Instant();
        org.joda.time.Instant instant79 = instant77.withMillis(0L);
        org.joda.time.Chronology chronology80 = instant79.getChronology();
        org.joda.time.Period period81 = new org.joda.time.Period((long) 53, (long) (-1), periodType72, chronology80);
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType67.getField(chronology80);
        java.util.Locale locale83 = java.util.Locale.UK;
        java.lang.String str84 = locale83.getDisplayLanguage();
        int int85 = dateTimeField82.getMaximumTextLength(locale83);
        mutableDateTime66.setRounding(dateTimeField82);
        org.joda.time.Duration duration87 = period57.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime66);
        boolean boolean88 = instant48.isBefore((org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime66.addWeekyears(12);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime66.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime92 = property91.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime94 = property91.add(241);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime94.setDate(2025, 33613, 812);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33613 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT86400S" + "'", str9, "PT86400S");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT86400S" + "'", str18, "PT86400S");
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(hours21);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43 + "'", int24 == 43);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "PeriodType[YearDayTime]" + "'", str76, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\uc601\uc5b4" + "'", str84, "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
        org.junit.Assert.assertNotNull(duration87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(mutableDateTime92);
        org.junit.Assert.assertNotNull(mutableDateTime94);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.addWrapField(62151);
        org.joda.time.MutableDateTime mutableDateTime8 = property4.addWrapField(26150);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.yearOfCentury();
        boolean boolean12 = mutableDateTime8.isBefore(68991376564766L);
        org.joda.time.Duration duration15 = new org.joda.time.Duration(960000L, 3155760000000L);
        long long16 = duration15.getStandardHours();
        org.joda.time.Duration duration18 = duration15.minus((long) 180000000);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration18, 48);
        org.joda.time.Chronology chronology21 = mutableDateTime8.getChronology();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 876599L + "'", long16 == 876599L);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 44, 26150, 1);
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod4.copy();
        mutablePeriod4.setMonths(122);
        mutablePeriod4.setPeriod(13, 36985848, 26190, 36988464, 0, 26208340, 36988464, 36992192);
        int int17 = mutablePeriod4.getMonths();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        int int22 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime dateTime24 = dateTime19.withDayOfYear(6);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.lang.String str30 = locale29.getDisplayName();
        java.lang.String str31 = dateTimeZone27.getName(100L, locale29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(948227L, dateTimeZone27);
        long long33 = mutableDateTime32.getMillis();
        mutableDateTime32.setWeekyear(1439);
        boolean boolean37 = mutableDateTime32.isBefore(1645514186724L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(36988464);
        mutableDateTime32.setZone(dateTimeZone39);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        int int44 = dateTime43.getYearOfCentury();
        int int45 = dateTime43.getWeekyear();
        org.joda.time.DateTime dateTime46 = dateTime43.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property47 = dateTime43.yearOfEra();
        org.joda.time.DateTime dateTime48 = property47.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime50 = property47.addToCopy(48);
        org.joda.time.DateTime dateTime52 = dateTime50.plus((long) 2100);
        int int53 = dateTime50.getSecondOfMinute();
        boolean boolean54 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36985848 + "'", int17 == 36985848);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1380 + "'", int22 == 1380);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str30, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 948227L + "'", long33 == 948227L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 43 + "'", int53 == 43);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property6.addWrapFieldToCopy((int) (short) -1);
        boolean boolean10 = strSet0.equals((java.lang.Object) localDateTime9);
        int int11 = localDateTime9.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusSeconds(26333335);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str21 = dateTimeFieldType20.getName();
        int int22 = localDateTime14.indexOf(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime14.minusSeconds((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMillis(10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfDay(19);
        int int29 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.centuryOfEra();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusMillis((int) (byte) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 1L, periodType41);
        org.joda.time.Period period44 = period42.minusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.minus((org.joda.time.ReadablePeriod) period42);
        mutableDateTime30.add((org.joda.time.ReadablePeriod) period42, 0);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime30.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone51);
        mutableDateTime49.setZone(dateTimeZone51);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableDuration55, readableInstant56);
        java.lang.String str58 = period57.toString();
        org.joda.time.Period period60 = period57.withHours(69);
        mutableDateTime49.add((org.joda.time.ReadablePeriod) period57);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) 100, 1L, periodType64);
        org.joda.time.PeriodType periodType66 = period65.getPeriodType();
        org.joda.time.Period period68 = period65.plusWeeks((int) 'x');
        org.joda.time.Period period70 = period65.minusMinutes(26);
        mutableDateTime49.add((org.joda.time.ReadablePeriod) period65);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime49.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now();
        mutableDateTime73.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime73.copy();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime73.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime79 = property77.addWrapField(62151);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime79.toMutableDateTime();
        int int81 = mutableDateTime80.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime80.millisOfSecond();
        org.joda.time.Duration duration84 = org.joda.time.Duration.standardDays((-9571L));
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime80, (org.joda.time.ReadableDuration) duration84);
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime9.minus((org.joda.time.ReadableDuration) duration84);
        org.joda.time.MutableDateTime mutableDateTime88 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime88.centuryOfEra();
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime88.dayOfWeek();
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime88.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime92 = property91.roundHalfEven();
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime92.millisOfDay();
        boolean boolean94 = localDateTime87.equals((java.lang.Object) property93);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "clockhourOfDay" + "'", str21, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0S" + "'", str58, "PT0S");
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 23143 + "'", int81 == 23143);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(mutableDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(mutableDateTime92);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = dateTimeZone1.getName(100L, locale3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(948227L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.year();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime6.setMillis(readableInstant8);
        mutableDateTime6.setMillisOfDay(54);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getYearOfCentury();
        int int15 = dateTime13.getWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime13.plus((long) 15);
        org.joda.time.DateTime.Property property18 = dateTime13.year();
        org.joda.time.DateTime dateTime20 = property18.addToCopy((long) 25);
        org.joda.time.DateTime dateTime21 = property18.roundCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj23 = mutableDateTime22.clone();
        mutableDateTime22.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.dayOfWeek();
        int int27 = mutableDateTime22.getMinuteOfDay();
        boolean boolean28 = dateTime21.isEqual((org.joda.time.ReadableInstant) mutableDateTime22);
        int int29 = dateTime21.getYearOfCentury();
        boolean boolean30 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Instant instant31 = dateTime21.toInstant();
        org.joda.time.DateTime dateTime33 = dateTime21.minusDays(26440);
        org.joda.time.DateTime dateTime35 = dateTime21.plusDays(62215);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str4, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(obj23);
// flaky:         org.junit.Assert.assertEquals(obj23.toString(), "2022-02-23T06:25:43.878+23:00");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "2022-02-23T06:25:43.878+23:00");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "2022-02-23T06:25:43.878+23:00");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 23 + "'", int29 == 23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) 45);
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.LocalDate localDate5 = dateTime1.toLocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfMonth();
        java.util.Date date7 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate10 = property9.roundFloorCopy();
        java.lang.String str11 = property9.getName();
        org.joda.time.LocalDate localDate12 = property9.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight13 = localDate12.toDateMidnight();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 23 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfMonth" + "'", str11, "dayOfMonth");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (-292275054));
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) iOException3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType8.getRangeDurationType();
        mutableDateTime1.set(dateTimeFieldType8, 4);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.hourOfDay();
        mutableDateTime1.addWeekyears(62354);
        int int16 = mutableDateTime1.getDayOfYear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 365 + "'", int16 == 365);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime3 = dateTime1.withZoneRetainFields(dateTimeZone2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime11 = dateTime8.minusWeeks(44);
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded((-1L), 36946953);
        int int15 = dateTime11.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) -1, (int) (byte) 1, 44, (int) ' ');
        mutablePeriod4.addDays((int) (byte) 10);
        mutablePeriod4.addMillis((int) '4');
        mutablePeriod4.addYears((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.getMutableDateTime();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        int int16 = localDate15.getDayOfMonth();
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        mutableDateTime14.setChronology(chronology17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.LocalDate localDate22 = property20.roundCeilingCopy();
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDate localDate26 = localDate22.withWeekOfWeekyear(46);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration28, readableInstant29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 1L, periodType33);
        org.joda.time.Period period36 = period34.minusSeconds((-1));
        java.lang.String str37 = period34.toString();
        org.joda.time.Period period38 = period34.toPeriod();
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.Period period40 = period30.normalizedStandard(periodType39);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.withMillis(0L);
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.eras();
        long long49 = chronology44.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField50 = chronology44.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(44L, periodType39, chronology44);
        org.joda.time.LocalDate localDate53 = localDate26.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod51, (int) (byte) 1);
        int int54 = localDate53.getDayOfWeek();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        int int57 = dateTime56.getYearOfCentury();
        int int58 = dateTime56.getWeekyear();
        org.joda.time.DateTime dateTime59 = dateTime56.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property60 = dateTime56.yearOfEra();
        org.joda.time.DateTime dateTime61 = property60.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime63 = property60.setCopy(1424);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.DateTime dateTime65 = localDate53.toDateTimeAtCurrentTime(dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight66 = dateTime65.toDateMidnight();
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) mutableDateTime14, (org.joda.time.ReadableInstant) dateTime65);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime71 = dateTime65.withDate(26351151, 62706, 139);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62706 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 23 + "'", int16 == 23);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0.099S" + "'", str37, "PT0.099S");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 105144L + "'", long49 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 22 + "'", int57 == 22);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2022 + "'", int58 == 2022);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateMidnight66);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate5 = localDate3.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDate localDate7 = localDate3.withWeekOfWeekyear(46);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        mutableDateTime10.add((long) 'a');
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.yearOfCentury();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period16 = duration15.toPeriod();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration21 = duration18.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration22 = duration15.minus((org.joda.time.ReadableDuration) duration21);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration15);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime10.centuryOfEra();
        mutableDateTime10.addHours((int) (byte) 10);
        int int27 = mutableDateTime10.getSecondOfDay();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.monthOfYear();
        org.joda.time.LocalDate.Property property30 = localDate28.dayOfMonth();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType33);
        org.joda.time.DurationFieldType durationFieldType36 = periodType33.getFieldType((int) (short) 0);
        boolean boolean37 = localDate28.isSupported(durationFieldType36);
        mutableDateTime10.add(durationFieldType36, (-292275054));
        org.joda.time.LocalDate localDate41 = localDate7.withFieldAdded(durationFieldType36, 53);
        org.joda.time.LocalDate.Property property42 = localDate7.yearOfCentury();
        int int43 = property42.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.set(45);
        org.joda.time.MutableDateTime mutableDateTime48 = property45.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime50 = property45.add(45);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        long long54 = dateTimeZone51.previousTransition(100L);
        int int56 = dateTimeZone51.getStandardOffset(86403200L);
        org.joda.time.DateTime dateTime57 = mutableDateTime50.toDateTime(dateTimeZone51);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.withDurationAdded(readableDuration58, (int) (byte) -1);
        int int61 = property42.getDifference((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.LocalDate localDate62 = dateTime60.toLocalDate();
        int int63 = dateTime60.getYear();
        org.joda.time.DateTime.Property property64 = dateTime60.dayOfWeek();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property66 = localDate65.monthOfYear();
        org.joda.time.DateTimeField dateTimeField67 = property66.getField();
        org.joda.time.LocalDate localDate68 = property66.roundCeilingCopy();
        org.joda.time.LocalDate localDate70 = localDate68.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDate localDate72 = localDate68.withWeekOfWeekyear(46);
        org.joda.time.LocalDate localDate74 = localDate68.plusMonths(62172);
        boolean boolean75 = property64.equals((java.lang.Object) localDate74);
        org.joda.time.DateTime dateTime76 = property64.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime78 = dateTime76.withDayOfWeek(62170);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62170 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59144 + "'", int27 == 59144);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 99 + "'", int43 == 99);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L + "'", long54 == 100L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-6977) + "'", int61 == (-6977));
        org.junit.Assert.assertNotNull(localDate62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8999 + "'", int63 == 8999);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(dateTime76);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        long long9 = durationField6.subtract(1028704L, 26297);
        long long12 = durationField6.getDifferenceAsLong((long) 62401, (long) 5);
        boolean boolean13 = durationField6.isSupported();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1576791296L) + "'", long9 == (-1576791296L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        int int7 = localDateTime4.getDayOfWeek();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime4.getFields();
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.dayOfWeek();
        java.lang.Object obj10 = null;
        boolean boolean11 = localDateTime4.equals(obj10);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.set(45);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean17 = mutableDateTime15.isSupported(dateTimeFieldType16);
        boolean boolean18 = localDateTime4.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime4.plusMinutes(30);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = dateTimeZone1.getName(100L, locale3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(948227L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.year();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime6.setMillis(readableInstant8);
        mutableDateTime6.addYears(36985848);
        mutableDateTime6.addMillis(0);
        mutableDateTime6.setWeekyear(297);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime6.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str4, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        int int5 = dateTime1.getHourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime1.plus(960800L);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.String str9 = dateTimeFieldType8.getName();
        int int10 = dateTime1.get(dateTimeFieldType8);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant14, readableInstant15, periodType16);
        org.joda.time.DurationFieldType durationFieldType19 = periodType16.getFieldType((int) (short) 0);
        java.lang.String str20 = periodType16.toString();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 53, (long) (-1), periodType16, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes(15);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        java.lang.String str32 = chronology31.toString();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType11.getField(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime1, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = mutableDateTime34.toString("2022-02-22T10:22:43.619");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfDay" + "'", str9, "secondOfDay");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26744 + "'", int10 == 26744);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PeriodType[YearDayTime]" + "'", str20, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[UTC]" + "'", str32, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add(51);
        int int6 = mutableDateTime5.getMinuteOfDay();
        mutableDateTime5.setWeekyear(26402);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 446 + "'", int6 == 446);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(1488905L, chronology1);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.yearOfEra();
        mutableDateTime0.setTime((long) 26367);
        int int7 = mutableDateTime0.getHourOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes(15);
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        java.lang.String str6 = chronology5.toString();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0, chronology5);
        org.joda.time.DateTime dateTime8 = localDate7.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period15 = duration14.toPeriod();
        org.joda.time.Duration duration18 = duration14.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant19 = instant12.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period21 = duration18.toPeriod(periodType20);
        org.joda.time.Duration duration23 = duration18.withMillis(60000L);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str29 = duration28.toString();
        org.joda.time.Instant instant30 = instant24.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now();
        mutableDateTime31.add((long) 'a');
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.yearOfCentury();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period37 = duration36.toPeriod();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration42 = duration39.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration43 = duration36.minus((org.joda.time.ReadableDuration) duration42);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration36);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime31.centuryOfEra();
        mutableDateTime31.addHours((int) (byte) 10);
        mutableDateTime31.addWeeks(100);
        boolean boolean50 = instant24.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration51, readableInstant52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period59 = period57.minusSeconds((-1));
        java.lang.String str60 = period57.toString();
        org.joda.time.Period period61 = period57.toPeriod();
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Period period63 = period53.normalizedStandard(periodType62);
        java.lang.String str64 = periodType62.getName();
        int int65 = periodType62.size();
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) instant24, periodType62);
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str69 = duration68.toString();
        org.joda.time.Duration duration71 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours72 = duration71.toStandardHours();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        int int75 = dateTime74.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration71, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Duration duration77 = duration68.plus((org.joda.time.ReadableDuration) duration71);
        org.joda.time.Instant instant78 = instant24.plus((org.joda.time.ReadableDuration) duration77);
        long long79 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) instant78);
        org.joda.time.LocalDate localDate80 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate82 = localDate80.withWeekyear(3622);
        org.joda.time.LocalDate localDate84 = localDate82.minusYears(0);
        org.joda.time.Chronology chronology85 = localDate84.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField87 = localDate84.getField(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1969");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT86400S" + "'", str29, "PT86400S");
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0.099S" + "'", str60, "PT0.099S");
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Standard" + "'", str64, "Standard");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 8 + "'", int65 == 8);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PT86400S" + "'", str69, "PT86400S");
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(hours72);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 44 + "'", int75 == 44);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(instant78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-52L) + "'", long79 == (-52L));
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertNotNull(chronology85);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        mutableDateTime0.setTime((long) 46);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.dayOfWeek();
        boolean boolean6 = mutableDateTime0.isAfter((long) 26170959);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.minuteOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2022-02-22T07:25:44.191Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2022-02-22T07:25:44.191Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2022-02-22T07:25:44.191Z");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str12 = duration11.toString();
        boolean boolean13 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration11);
        java.lang.String str14 = duration9.toString();
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant22, readableInstant23, periodType24);
        org.joda.time.DurationFieldType durationFieldType27 = periodType24.getFieldType((int) (short) 0);
        java.lang.String str28 = periodType24.toString();
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.Period period33 = new org.joda.time.Period((long) 53, (long) (-1), periodType24, chronology32);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = periodType38.getFieldType((int) (short) 0);
        java.lang.String str42 = periodType38.toString();
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        org.joda.time.Period period47 = new org.joda.time.Period((long) 53, (long) (-1), periodType38, chronology46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 10, periodType24, chronology46);
        org.joda.time.PeriodType periodType49 = periodType24.withHoursRemoved();
        org.joda.time.Period period50 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime18, periodType49);
        org.joda.time.PeriodType periodType51 = periodType49.withYearsRemoved();
        org.joda.time.PeriodType periodType52 = periodType51.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period53 = new org.joda.time.Period((-99), 26319, 26445355, 18966, 26479, 26647, 62726, 26489, periodType51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT86400S" + "'", str12, "PT86400S");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT86400S" + "'", str14, "PT86400S");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PeriodType[YearDayTime]" + "'", str28, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PeriodType[YearDayTime]" + "'", str42, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(15);
        org.joda.time.Chronology chronology6 = dateTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.hours();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1440L, chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 575, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfDay();
        boolean boolean14 = dateTimeField12.isLeap((long) (byte) 0);
        org.joda.time.DurationField durationField15 = dateTimeField12.getDurationField();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        mutableDateTime0.setDate((long) '#');
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        int int10 = localDate6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime0.toDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone11);
        java.util.TimeZone timeZone16 = dateTimeZone11.toTimeZone();
        timeZone16.setRawOffset(26196);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId20 = timeZone19.toZoneId();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone(zoneId20);
        boolean boolean22 = timeZone16.hasSameRules(timeZone21);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("");
        boolean boolean25 = timeZone21.hasSameRules(timeZone24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean29 = localDate26.isSupported(dateTimeFieldType28);
        int int30 = localDate26.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight32 = localDate26.toDateMidnight(dateTimeZone31);
        org.joda.time.LocalDate.Property property33 = localDate26.year();
        java.util.Date date34 = localDate26.toDate();
        org.joda.time.LocalDate localDate36 = localDate26.withDayOfYear(13);
        java.util.Date date37 = localDate26.toDate();
        boolean boolean38 = timeZone21.inDaylightTime(date37);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53 + "'", int30 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Feb 22 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Feb 22 00:00:00 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        org.joda.time.DurationFieldType durationFieldType8 = periodType5.getFieldType((int) (short) 0);
        java.lang.String str9 = periodType5.toString();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 53, (long) (-1), periodType5, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1119096L, chronology13);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration17, readableInstant18);
        org.joda.time.Period period21 = period19.withDays((int) (byte) 1);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours24 = duration23.toStandardHours();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        int int27 = dateTime26.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration29 = period19.toDurationFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Instant instant32 = instant30.withMillis(0L);
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = periodType38.getFieldType((int) (short) 0);
        java.lang.String str42 = periodType38.toString();
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        org.joda.time.Period period47 = new org.joda.time.Period((long) 53, (long) (-1), periodType38, chronology46);
        org.joda.time.PeriodType periodType48 = periodType38.withHoursRemoved();
        org.joda.time.PeriodType periodType49 = periodType48.withMinutesRemoved();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) instant32, periodType48);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str55 = duration54.toString();
        boolean boolean56 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Hours hours57 = duration52.toStandardHours();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardSeconds(100L);
        int int60 = duration52.compareTo((org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration52);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[YearDayTime]" + "'", str9, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(hours24);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44 + "'", int27 == 44);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PeriodType[YearDayTime]" + "'", str42, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT86400S" + "'", str55, "PT86400S");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(46);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localDateTime4.get(dateTimeFieldType5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(45);
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime14 = property9.add(45);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        long long18 = dateTimeZone15.previousTransition(100L);
        int int20 = dateTimeZone15.getStandardOffset(86403200L);
        org.joda.time.DateTime dateTime21 = mutableDateTime14.toDateTime(dateTimeZone15);
        mutableDateTime14.setWeekyear(26202);
        int int24 = mutableDateTime14.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime14.year();
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale28.getDisplayName();
        java.lang.String str30 = locale28.getISO3Language();
        java.util.Locale.Builder builder31 = builder27.setLocale(locale28);
        java.util.Locale.Builder builder32 = builder27.clearExtensions();
        java.util.Locale locale33 = builder27.build();
        java.util.Locale.Builder builder35 = builder27.addUnicodeLocaleAttribute("100");
        java.util.Locale.Builder builder36 = builder35.clearExtensions();
        boolean boolean37 = property25.equals((java.lang.Object) builder36);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder39 = builder36.setLocale(locale38);
        java.lang.String str40 = property7.getAsShortText(locale38);
        org.joda.time.LocalDateTime localDateTime41 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 999 + "'", int6 == 999);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str29, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "deu" + "'", str30, "deu");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1973" + "'", str40, "1973");
        org.junit.Assert.assertNotNull(localDateTime41);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration9 = duration5.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant10 = instant3.plus((org.joda.time.ReadableDuration) duration9);
        long long11 = instant10.getMillis();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.Period period14 = new org.joda.time.Period((-205878993L), chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology12.getZone();
        java.lang.String str18 = dateTimeZone16.getShortName((long) 52);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        int int20 = mutableDateTime19.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setMinuteOfDay(1968);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1968 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86400000L + "'", long11 == 86400000L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 25 + "'", int20 == 25);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        org.joda.time.DurationFieldType durationFieldType8 = periodType5.getFieldType((int) (short) 0);
        java.lang.String str9 = periodType5.toString();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 53, (long) (-1), periodType5, chronology13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology13);
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        org.joda.time.LocalDate localDate17 = property16.roundCeilingCopy();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale22);
        java.lang.Object obj25 = dateTimeParserBucket24.saveState();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket24.getZone();
        org.joda.time.DateTime dateTime27 = localDate17.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((-205878993L), dateTimeZone26);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now(dateTimeZone26);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[YearDayTime]" + "'", str9, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate5 = localDate3.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((-9571L), 26148);
        int int11 = dateTime7.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime13.setSecondOfMinute(53);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime13.copy();
        int int17 = mutableDateTime13.getWeekyear();
        mutableDateTime13.addSeconds(37129311);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime13.toMutableDateTime();
        boolean boolean21 = dateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        mutableDateTime0.setDayOfMonth(3);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.add(62181);
        mutableDateTime7.setMillis(1645514274696L);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.Period period16 = org.joda.time.Period.hours((int) (short) 10);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.monthOfYear();
        org.joda.time.LocalDate localDate19 = property18.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtMidnight();
        boolean boolean21 = period16.equals((java.lang.Object) localDate19);
        org.joda.time.DateTime dateTime22 = dateTime14.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Seconds seconds23 = period16.toStandardSeconds();
        mutableDateTime7.add((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period26 = period16.withSeconds(896);
        org.joda.time.Period period28 = period26.minusMonths(26314650);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        mutableDateTime15.setZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime8.toMutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add(200);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours26 = duration25.toStandardHours();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime28);
        mutablePeriod30.addSeconds(292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period41 = duration40.toPeriod();
        org.joda.time.Duration duration44 = duration40.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant45 = instant38.plus((org.joda.time.ReadableDuration) duration44);
        long long46 = instant45.getMillis();
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.months();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType34.getField(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = chronology47.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(chronology47);
        mutablePeriod30.setPeriod(960800L, chronology47);
        org.joda.time.DurationField durationField53 = chronology47.weekyears();
        org.joda.time.DateTimeField dateTimeField54 = chronology47.halfdayOfDay();
        mutableDateTime23.setRounding(dateTimeField54);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime23.toMutableDateTime();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-22T07:25:44.397Z" + "'", str14, "2022-02-22T07:25:44.397Z");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(hours26);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 44 + "'", int29 == 44);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 86400000L + "'", long46 == 86400000L);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(mutableDateTime56);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property5 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DateTime dateTime11 = property8.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        mutableDateTime12.add((long) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.yearOfCentury();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration23 = duration20.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration24 = duration17.minus((org.joda.time.ReadableDuration) duration23);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration17);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime12.centuryOfEra();
        mutableDateTime12.addHours((int) (byte) 10);
        mutableDateTime12.addWeeks(100);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        mutableDateTime34.add((long) 'a');
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime34.yearOfCentury();
        mutableDateTime34.addSeconds(0);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours42 = duration41.toStandardHours();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        int int45 = dateTime44.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        org.joda.time.Instant instant51 = instant49.withMillis(0L);
        org.joda.time.DateTime dateTime52 = instant51.toDateTime();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.months();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime54, periodType55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime48, periodType55);
        org.joda.time.Duration duration58 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime34, (org.joda.time.ReadableInstant) dateTime48);
        int int59 = property32.getDifference((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableInstant) mutableDateTime34);
        int int61 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(hours42);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 44 + "'", int45 == 44);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        boolean boolean6 = dateTime4.equals((java.lang.Object) (-1L));
        org.joda.time.Chronology chronology7 = dateTime4.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology7, locale8, (java.lang.Integer) 50);
        org.joda.time.DurationField durationField11 = chronology7.eras();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.secondOfMinute();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (byte) -1);
        int int16 = localDate15.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 44);
        org.joda.time.DateTime dateTime22 = localDate15.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime23 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property24 = localDate15.era();
        org.joda.time.LocalDate localDate26 = localDate15.plusWeeks((int) (byte) 1);
        org.joda.time.Period period29 = org.joda.time.Period.months(53);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now();
        mutableDateTime30.add((long) 'a');
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.months();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime38, periodType39);
        org.joda.time.DateTime.Property property41 = dateTime38.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime30.property(dateTimeFieldType42);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis(0L);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period50 = duration49.toPeriod();
        org.joda.time.Duration duration53 = duration49.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant54 = instant47.plus((org.joda.time.ReadableDuration) duration53);
        long long55 = instant54.getMillis();
        org.joda.time.Chronology chronology56 = instant54.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.months();
        org.joda.time.Period period58 = new org.joda.time.Period((-205878993L), chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology56.getZone();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime30, chronology56);
        mutableDateTime30.addSeconds(152);
        mutableDateTime30.addDays(57);
        org.joda.time.Duration duration66 = period29.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.Period period68 = period29.minusMillis((int) '#');
        int[] intArray69 = period29.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray71 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDate26, 720, intArray69, 890);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1969 + "'", int16 == 1969);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 44L + "'", long21 == 44L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 86400000L + "'", long55 == 86400000L);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[0, 53, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        mutableDateTime0.setDate((long) '#');
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        int int10 = localDate6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime0.toDateTime(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.Interval interval15 = localDate14.toInterval();
        org.joda.time.LocalDate localDate17 = localDate14.withWeekyear(37094831);
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfEra();
        org.joda.time.LocalDate.Property property19 = localDate17.dayOfWeek();
        org.joda.time.LocalDate localDate20 = property19.getLocalDate();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property5 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Hours hours10 = duration9.toStandardHours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime12);
        mutablePeriod14.addSeconds(292278993);
        mutablePeriod14.setPeriod((long) 45, 946312L);
        org.joda.time.DateTime dateTime20 = dateTime7.minus((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime localTime24 = localTime22.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime26 = localTime24.withHourOfDay(0);
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond(44);
        org.joda.time.LocalTime localTime30 = localTime28.plusSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.now(dateTimeZone31);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone31);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (-2022));
        java.lang.String str37 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 1);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period43 = duration42.toPeriod();
        org.joda.time.Duration duration46 = duration42.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableDuration) duration46);
        java.util.Locale locale48 = java.util.Locale.UK;
        java.util.Calendar calendar49 = dateTime40.toCalendar(locale48);
        java.lang.String str50 = dateTimeZone31.getName(1040955L, locale48);
        org.joda.time.DateTime dateTime51 = dateTime7.toDateTime(dateTimeZone31);
        long long53 = dateTimeZone31.previousTransition((long) 37118622);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(hours10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44 + "'", int13 == 44);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_GB");
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 37118622L + "'", long53 == 37118622L);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getYearOfCentury();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime6.withEarlierOffsetAtOverlap();
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime9.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        mutableDateTime11.setZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localTime3.toDateTimeToday(dateTimeZone12);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100, chronology17);
        int int19 = localTime18.getMillisOfDay();
        org.joda.time.LocalTime.Property property20 = localTime18.millisOfSecond();
        org.joda.time.DurationField durationField21 = property20.getLeapDurationField();
        org.joda.time.LocalTime localTime22 = property20.roundHalfEvenCopy();
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant25 = instant23.withMillis(0L);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration31 = duration27.withDurationAdded((long) '#', (int) (short) 0);
        org.joda.time.Instant instant32 = instant25.plus((org.joda.time.ReadableDuration) duration31);
        long long33 = instant32.getMillis();
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now();
        mutableDateTime35.add((long) 'a');
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str42 = duration41.toString();
        boolean boolean43 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Hours hours44 = duration39.toStandardHours();
        mutableDateTime35.add((org.joda.time.ReadableDuration) duration39, 20);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        int int49 = dateTime48.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = dateTime48.toString(dateTimeFormatter50);
        org.joda.time.DateTime dateTime53 = dateTime48.minusMonths(22);
        org.joda.time.Instant instant54 = new org.joda.time.Instant();
        org.joda.time.Instant instant56 = instant54.withMillis(0L);
        org.joda.time.Chronology chronology57 = instant56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.DateTime dateTime59 = dateTime48.withChronology(chronology57);
        org.joda.time.Period period60 = duration39.toPeriod(chronology57);
        org.joda.time.Instant instant62 = instant32.withDurationAdded((org.joda.time.ReadableDuration) duration39, 16);
        boolean boolean63 = localTime22.equals((java.lang.Object) instant32);
        org.joda.time.Instant instant66 = instant32.withDurationAdded(3155695200000L, 44);
        org.joda.time.DateTime dateTime67 = instant66.toDateTimeISO();
        org.joda.time.Period period69 = org.joda.time.Period.years((-99));
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant70, readableInstant71, periodType72);
        org.joda.time.PeriodType periodType74 = periodType72.withHoursRemoved();
        org.joda.time.PeriodType periodType75 = periodType74.withWeeksRemoved();
        org.joda.time.PeriodType periodType76 = periodType74.withMonthsRemoved();
        org.joda.time.Period period77 = period69.normalizedStandard(periodType76);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime67, periodType76);
        org.joda.time.DateTime dateTime79 = dateTime67.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property80 = dateTime79.dayOfMonth();
        int int81 = dateTime79.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-22T07:25:44.527Z" + "'", str10, "2022-02-22T07:25:44.527Z");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNull(durationField21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86400000L + "'", long33 == 86400000L);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT86400S" + "'", str42, "PT86400S");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 22 + "'", int49 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2022-02-22T07:25:44.527Z" + "'", str51, "2022-02-22T07:25:44.527Z");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        mutableDateTime15.setZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime8.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-22T07:25:44.577Z" + "'", str14, "2022-02-22T07:25:44.577Z");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) 'a');
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.yearOfCentury();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration11 = duration8.withDurationAdded((long) (short) 100, (int) ' ');
        org.joda.time.Duration duration12 = duration5.minus((org.joda.time.ReadableDuration) duration11);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        int int20 = property18.get();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = property18.getAsShortText(locale21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths(46);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int29 = localDateTime27.get(dateTimeFieldType28);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean31 = localDateTime27.equals((java.lang.Object) locale30);
        java.lang.String str32 = locale21.getDisplayVariant(locale30);
        java.lang.String str33 = locale21.getScript();
        java.lang.String str34 = property14.getAsShortText(locale21);
        org.joda.time.MutableDateTime mutableDateTime35 = property14.roundHalfEven();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.year();
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.months();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime.Property property46 = dateTime43.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        org.joda.time.Instant instant50 = instant48.withMillis(0L);
        org.joda.time.Chronology chronology51 = instant50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.eras();
        long long56 = chronology51.add(0L, (long) 2022, (int) '4');
        org.joda.time.DateTimeField dateTimeField57 = chronology51.secondOfMinute();
        boolean boolean58 = dateTimeField57.isSupported();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.monthOfYear();
        int int61 = dateTimeField57.getMinimumValue((org.joda.time.ReadablePartial) localDate59);
        org.joda.time.LocalDate localDate63 = localDate59.withYearOfCentury(46);
        boolean boolean64 = property46.equals((java.lang.Object) localDate63);
        org.joda.time.Chronology chronology65 = localDate63.getChronology();
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        long long69 = chronology65.add(readablePeriod66, 555370422L, 1191);
        org.joda.time.DateTimeField dateTimeField70 = chronology65.yearOfCentury();
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("2022-02-22T10:16:18.959");
        boolean boolean74 = locale73.hasExtensions();
        java.lang.String str75 = dateTimeField70.getAsText((int) 'x', locale73);
        java.lang.String str76 = locale73.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = mutableDateTime35.toString("3348-02-20T07:24:15.380Z", locale73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "7" + "'", str22, "7");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1439 + "'", int29 == 1439);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "20" + "'", str34, "20");
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 105144L + "'", long56 == 105144L);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 555370422L + "'", long69 == 555370422L);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "120" + "'", str75, "120");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDate localDate5 = property3.roundCeilingCopy();
        org.joda.time.LocalDate localDate7 = localDate5.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDate localDate9 = localDate5.withWeekOfWeekyear(46);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 26198, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime13.toString(dateTimeFormatter15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusMonths(22);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.joda.time.DateTime dateTime24 = dateTime13.withChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.centuryOfEra();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        boolean boolean29 = dateTime13.isSupported(dateTimeFieldType28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        int int31 = localDate30.getDayOfMonth();
        org.joda.time.Chronology chronology32 = localDate30.getChronology();
        boolean boolean33 = dateTimeFieldType28.isSupported(chronology32);
        mutableDateTime11.setChronology(chronology32);
        org.joda.time.Period period35 = new org.joda.time.Period(0L, chronology32);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-22T07:25:44.615Z" + "'", str16, "2022-02-22T07:25:44.615Z");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 22 + "'", int31 == 22);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setSecondOfMinute(53);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.copy();
        int int5 = mutableDateTime1.getWeekyear();
        boolean boolean6 = mutableDateTime1.isBeforeNow();
        int int7 = mutableDateTime1.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.yearOfCentury();
        mutableDateTime1.setMillisOfDay(26256);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 1);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.months();
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime16, periodType17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period24 = period22.minusSeconds((-1));
        java.lang.String str25 = period22.toString();
        org.joda.time.Period period26 = period22.toPeriod();
        org.joda.time.PeriodType periodType27 = period22.getPeriodType();
        org.joda.time.DateTime dateTime28 = dateTime16.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant32, readableInstant33, periodType34);
        org.joda.time.DurationFieldType durationFieldType37 = periodType34.getFieldType((int) (short) 0);
        java.lang.String str38 = periodType34.toString();
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.Instant instant41 = instant39.withMillis(0L);
        org.joda.time.Chronology chronology42 = instant41.getChronology();
        org.joda.time.Period period43 = new org.joda.time.Period((long) 53, (long) (-1), periodType34, chronology42);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = periodType48.getFieldType((int) (short) 0);
        java.lang.String str52 = periodType48.toString();
        org.joda.time.Instant instant53 = new org.joda.time.Instant();
        org.joda.time.Instant instant55 = instant53.withMillis(0L);
        org.joda.time.Chronology chronology56 = instant55.getChronology();
        org.joda.time.Period period57 = new org.joda.time.Period((long) 53, (long) (-1), periodType48, chronology56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (short) 10, periodType34, chronology56);
        org.joda.time.DateTime dateTime59 = dateTime28.toDateTime(chronology56);
        org.joda.time.DateTime.Property property60 = dateTime28.year();
        org.joda.time.Instant instant61 = dateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj63 = mutableDateTime62.clone();
        mutableDateTime62.setDate(0L);
        org.joda.time.DateTimeField dateTimeField66 = mutableDateTime62.getRoundingField();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant61, (org.joda.time.ReadableInstant) mutableDateTime62);
        mutableDateTime62.setYear(26297466);
        org.joda.time.Instant instant70 = new org.joda.time.Instant();
        org.joda.time.Instant instant72 = instant70.withMillis(0L);
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str75 = duration74.toString();
        org.joda.time.Instant instant76 = instant70.minus((org.joda.time.ReadableDuration) duration74);
        org.joda.time.Instant instant77 = instant70.toInstant();
        mutableDateTime62.setDate((org.joda.time.ReadableInstant) instant77);
        boolean boolean79 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) instant77);
        mutableDateTime1.setWeekyear(0);
        mutableDateTime1.addSeconds(37463948);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 69 + "'", int7 == 69);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0.099S" + "'", str25, "PT0.099S");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PeriodType[YearDayTime]" + "'", str38, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PeriodType[YearDayTime]" + "'", str52, "PeriodType[YearDayTime]");
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(obj63);
// flaky:         org.junit.Assert.assertEquals(obj63.toString(), "2022-02-22T07:25:44.635Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "2022-02-22T07:25:44.635Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "2022-02-22T07:25:44.635Z");
        org.junit.Assert.assertNull(dateTimeField66);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT86400S" + "'", str75, "PT86400S");
        org.junit.Assert.assertNotNull(instant76);
        org.junit.Assert.assertNotNull(instant77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }
}
