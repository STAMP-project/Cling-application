import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime9 = dateTime5.minusMinutes((int) '#');
        org.joda.time.Duration duration10 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime14.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property21 = dateTime14.secondOfMinute();
        org.joda.time.Chronology chronology22 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfMonth();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology22);
        org.joda.time.DurationField durationField25 = chronology22.months();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.weekyear();
        org.joda.time.DateTime dateTime28 = dateTime3.toDateTime(chronology22);
        boolean boolean30 = dateTime28.isBefore(1645455245117L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusSeconds((int) (short) 1);
        org.joda.time.Period period7 = period5.multipliedBy((int) (byte) -1);
        int int8 = period7.size();
        org.joda.time.Period period10 = period7.plusDays(53858);
        int int11 = period10.getMonths();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 57598258, (long) 48);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        boolean boolean14 = dateTime12.isEqual((long) 11);
        org.joda.time.DateTime dateTime16 = dateTime12.plusWeeks(57635003);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(30);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-21T14:56:50.952+00:00:00.054", (double) (-74664032460000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-7.466403246E13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime7 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) ' ');
        int int16 = dateTime13.getEra();
        int int17 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime13.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime35.withZone(dateTimeZone36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        java.lang.String str41 = dateTimeZone36.getNameKey(1728000L);
        long long43 = dateTimeZone29.getMillisKeepLocal(dateTimeZone36, 1643727237875L);
        org.joda.time.DateTime dateTime44 = dateTime7.withZone(dateTimeZone36);
        java.lang.String str46 = dateTimeZone36.getShortName(1645455272980L);
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime52 = dateTime47.withTime(8, (int) (short) 10, 38, 958);
        int int53 = dateTime52.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-53L) + "'", long32 == (-53L));
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
// flaky:         org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1643727237875L + "'", long43 == 1643727237875L);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.054" + "'", str46, "+00:00:00.054");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 29438 + "'", int53 == 29438);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(1645455223479L);
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.daysIn(readableInterval6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration9.isLongerThan(readableDuration10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        boolean boolean18 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        int int23 = dateTime20.getEra();
        org.joda.time.DateTime dateTime25 = dateTime20.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime27 = dateTime20.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval28 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime20);
        mutablePeriod5.add((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Days days35 = org.joda.time.Days.daysIn(readableInterval34);
        org.joda.time.Duration duration36 = days35.toStandardDuration();
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.ReadableDuration readableDuration38 = null;
        boolean boolean39 = duration37.isLongerThan(readableDuration38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Days days41 = org.joda.time.Days.daysIn(readableInterval40);
        org.joda.time.Duration duration42 = days41.toStandardDuration();
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration43.isLongerThan(readableDuration44);
        boolean boolean46 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMillis((int) ' ');
        int int51 = dateTime48.getEra();
        org.joda.time.DateTime dateTime53 = dateTime48.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime55 = dateTime48.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval56 = duration37.toIntervalTo((org.joda.time.ReadableInstant) dateTime48);
        mutablePeriod33.add((org.joda.time.ReadableInterval) interval56);
        boolean boolean58 = interval28.isBefore((org.joda.time.ReadableInterval) interval56);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = interval28.toPeriod(periodType59);
        mutablePeriod1.setPeriod((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Days days62 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval28);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusYears((int) '4');
        org.joda.time.DateTime.Property property67 = dateTime64.dayOfWeek();
        org.joda.time.DateTime dateTime70 = dateTime64.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property71 = dateTime64.minuteOfHour();
        org.joda.time.DateTime dateTime72 = dateTime64.toDateTime();
        int int73 = dateTime72.getWeekyear();
        org.joda.time.DateTime dateTime75 = dateTime72.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime77 = dateTime72.minusWeeks(21);
        org.joda.time.DateTime.Property property78 = dateTime72.yearOfCentury();
        org.joda.time.DateTime dateTime79 = property78.roundFloorCopy();
        org.joda.time.Interval interval80 = property78.toInterval();
        boolean boolean81 = interval28.overlaps((org.joda.time.ReadableInterval) interval80);
        org.joda.time.DateTime dateTime82 = interval28.getStart();
        org.joda.time.Chronology chronology83 = interval28.getChronology();
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2022 + "'", int73 == 2022);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(chronology83);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        int int19 = dateTime16.getEra();
        int int20 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime28 = dateTime22.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property29 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime31 = dateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        long long35 = dateTimeZone32.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime16.toMutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime36, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime45 = dateTime38.plusDays(1);
        org.joda.time.TimeOfDay timeOfDay46 = dateTime45.toTimeOfDay();
        java.lang.Object obj47 = null;
        boolean boolean48 = timeOfDay46.equals(obj47);
        long long50 = chronology9.set((org.joda.time.ReadablePartial) timeOfDay46, 1645455239563L);
        org.joda.time.DurationField durationField51 = chronology9.centuries();
        long long54 = durationField51.getMillis((int) '#', 1645455345347L);
        int int57 = durationField51.getValue(53913062L, 1645455267607L);
        boolean boolean58 = durationField51.isSupported();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-53L) + "'", long35 == (-53L));
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1645455814292L + "'", long50 == 1645455814292L);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 110449267200000L + "'", long54 == 110449267200000L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(841, 0, 57546, 76, 111, 7, 237, 13575);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusSeconds((int) (short) 1);
        org.joda.time.Days days6 = period5.toStandardDays();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        java.lang.String str9 = days8.toString();
        boolean boolean10 = days6.isGreaterThan(days8);
        org.joda.time.Days days12 = days8.dividedBy(18);
        org.joda.time.Days days14 = days8.minus(787);
        org.joda.time.MutablePeriod mutablePeriod15 = days8.toMutablePeriod();
        mutablePeriod15.setMonths(1970);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes6 = period2.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.multipliedBy(893);
        org.joda.time.PeriodType periodType9 = minutes6.getPeriodType();
        org.joda.time.Minutes minutes11 = minutes6.dividedBy((int) '4');
        int int12 = minutes11.getMinutes();
        org.joda.time.Minutes minutes14 = minutes11.minus(2022);
        org.joda.time.Minutes minutes15 = minutes11.negated();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.TWO;
        org.joda.time.MutablePeriod mutablePeriod18 = minutes17.toMutablePeriod();
        org.joda.time.Minutes minutes19 = minutes16.plus(minutes17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime dateTime29 = dateTime27.withYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis((int) ' ');
        int int42 = dateTime39.getEra();
        int int43 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears((int) '4');
        org.joda.time.DateTime.Property property48 = dateTime45.dayOfWeek();
        org.joda.time.DateTime dateTime51 = dateTime45.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property52 = dateTime45.minuteOfHour();
        org.joda.time.DateTime dateTime54 = dateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        long long58 = dateTimeZone55.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime39.toMutableDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime65 = dateTime61.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime59, (org.joda.time.ReadableInstant) dateTime61);
        boolean boolean67 = dateTime31.isBefore((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean68 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime70 = dateTime31.plusMinutes(2147483647);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.minusMillis((int) ' ');
        org.joda.time.TimeOfDay timeOfDay75 = dateTime72.toTimeOfDay();
        org.joda.time.Minutes minutes76 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime72);
        boolean boolean77 = minutes17.isGreaterThan(minutes76);
        org.joda.time.Minutes minutes78 = minutes15.plus(minutes17);
        org.joda.time.PeriodType periodType79 = minutes78.getPeriodType();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-53L) + "'", long58 == (-53L));
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(timeOfDay75);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(minutes78);
        org.junit.Assert.assertNotNull(periodType79);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes2 = minutes0.minus(2147483647);
        org.joda.time.Minutes minutes4 = minutes0.multipliedBy(0);
        int int5 = minutes0.getMinutes();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        org.joda.time.Period period1 = new org.joda.time.Period(1645455436435L);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.Period period4 = period1.minusYears(53688331);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration3.isLongerThan(readableDuration4);
        org.joda.time.Duration duration6 = duration3.toDuration();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration3.toIntervalTo(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        org.joda.time.DurationField durationField13 = property11.getLeapDurationField();
        org.joda.time.DateTime dateTime14 = property11.getDateTime();
        boolean boolean15 = interval8.equals((java.lang.Object) property11);
        org.joda.time.DateTime dateTime16 = property11.roundCeilingCopy();
        int int17 = dateTime16.getYearOfCentury();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1, chronology10);
        org.joda.time.DurationField durationField14 = chronology10.millis();
        org.joda.time.DurationField durationField15 = chronology10.millis();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        org.joda.time.Period period27 = period24.plusMinutes((int) (byte) 0);
        mutablePeriod21.mergePeriod((org.joda.time.ReadablePeriod) period24);
        boolean boolean29 = periodType17.equals((java.lang.Object) period24);
        org.joda.time.Seconds seconds30 = period24.toStandardSeconds();
        int[] intArray32 = chronology10.get((org.joda.time.ReadablePeriod) period24, 50400000L);
        org.joda.time.DurationField durationField33 = chronology10.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.Period period4 = period2.minusMonths(894);
        org.joda.time.Period period6 = period2.withSeconds(53822);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime1.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfMinute();
        org.joda.time.Chronology chronology16 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1, chronology16);
        org.joda.time.DateTime dateTime20 = dateTime1.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfYear();
        org.joda.time.Chronology chronology22 = chronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyear();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology16);
        java.lang.String str26 = chronology16.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[+00:00:00.054]" + "'", str26, "ISOChronology[+00:00:00.054]");
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Days days33 = org.joda.time.Days.daysIn(readableInterval32);
        org.joda.time.Duration duration34 = days33.toStandardDuration();
        org.joda.time.Duration duration35 = duration34.toDuration();
        org.joda.time.ReadableDuration readableDuration36 = null;
        boolean boolean37 = duration35.isLongerThan(readableDuration36);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Days days39 = org.joda.time.Days.daysIn(readableInterval38);
        org.joda.time.Duration duration40 = days39.toStandardDuration();
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.joda.time.ReadableDuration readableDuration42 = null;
        boolean boolean43 = duration41.isLongerThan(readableDuration42);
        boolean boolean44 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis((int) ' ');
        int int49 = dateTime46.getEra();
        org.joda.time.DateTime dateTime51 = dateTime46.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime53 = dateTime46.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval54 = duration35.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        mutablePeriod31.add((org.joda.time.ReadableInterval) interval54);
        boolean boolean56 = interval26.isBefore((org.joda.time.ReadableInterval) interval54);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = interval26.toPeriod(periodType57);
        long long59 = interval26.getStartMillis();
        org.joda.time.MutableInterval mutableInterval60 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology61 = interval26.getChronology();
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType63 = periodType62.withYearsRemoved();
        org.joda.time.PeriodType periodType64 = periodType63.withYearsRemoved();
        org.joda.time.Period period65 = interval26.toPeriod(periodType63);
        org.joda.time.Interval interval66 = interval26.toInterval();
        long long67 = interval66.getStartMillis();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(period58);
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1645455814475L + "'", long59 == 1645455814475L);
        org.junit.Assert.assertNotNull(mutableInterval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(interval66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1645455814475L + "'", long67 == 1645455814475L);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration3.isLongerThan(readableDuration4);
        long long6 = duration3.getStandardSeconds();
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) 3);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration3.withDurationAdded((org.joda.time.ReadableDuration) duration8, 12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime15.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        int int23 = dateTime20.getEra();
        boolean boolean24 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime27 = dateTime18.withDurationAdded((long) '#', (int) ' ');
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period34 = period31.plusMinutes((int) (byte) 0);
        org.joda.time.Period period36 = period34.plusMonths((int) '4');
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType38.getDurationType();
        boolean boolean40 = periodType37.isSupported(durationFieldType39);
        boolean boolean41 = period34.isSupported(durationFieldType39);
        mutablePeriod28.set(durationFieldType39, 1727999);
        mutablePeriod28.add(57814138, (-691236), 27, 0, 54137, 16, 826, 308);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }
}
