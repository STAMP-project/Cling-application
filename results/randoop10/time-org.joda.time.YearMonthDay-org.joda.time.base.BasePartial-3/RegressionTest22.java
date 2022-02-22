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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("12");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0L, 100L, periodType6, chronology7);
        java.lang.Object obj9 = mutablePeriod8.clone();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.Duration duration19 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight3.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.LocalDate localDate21 = dateMidnight20.toLocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        int int35 = mutablePeriod33.getMinutes();
        org.joda.time.Period period37 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.hours();
        java.lang.String str39 = durationFieldType38.toString();
        org.joda.time.Period period41 = period37.withField(durationFieldType38, 2);
        boolean boolean42 = mutablePeriod33.isSupported(durationFieldType38);
        long long45 = chronology22.add((org.joda.time.ReadablePeriod) mutablePeriod33, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.Chronology chronology47 = chronology22.withZone(dateTimeZone46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 11, chronology47);
        org.joda.time.DurationField durationField49 = chronology47.weeks();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.clockhourOfHalfday();
        long long53 = dateTimeField50.addWrapField((long) 53390189, 53354070);
        java.util.Locale.Category category55 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale56 = java.util.Locale.getDefault(category55);
        java.util.Locale locale57 = java.util.Locale.getDefault(category55);
        java.lang.String str58 = dateTimeField50.getAsShortText((long) (-2022), locale57);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "PT0.100S");
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hours" + "'", str39, "hours");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 53230963L + "'", long45 == 53230963L);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 74990189L + "'", long53 == 74990189L);
        org.junit.Assert.assertTrue("'" + category55 + "' != '" + java.util.Locale.Category.FORMAT + "'", category55.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "2023-01-09t00:00:00.000z/2023-01-09t02:00:00.035z");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "2023-01-09t00:00:00.000z/2023-01-09t02:00:00.035z");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "11" + "'", str58, "11");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay11 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime12 = timeOfDay11.toLocalTime();
        int int13 = localTime12.getMinuteOfHour();
        org.joda.time.LocalTime.Property property14 = localTime12.millisOfDay();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.LocalTime localTime17 = property14.addCopy(53097298);
        org.joda.time.LocalTime localTime19 = property14.addCopy((-62262119413347L));
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "82859000" + "'", str15, "82859000");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        int int6 = dateMidnight5.getEra();
        org.joda.time.DateMidnight.Property property7 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property7.addToCopy((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property7.getFieldType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.year();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        boolean boolean19 = dateTimeFieldType10.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.hours();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 53243308, 600000L, periodType2, chronology18);
        org.joda.time.DurationField durationField22 = chronology18.months();
        long long24 = durationField22.getMillis(25);
        int int26 = durationField22.getValue(47335363222999L);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 65743650000L + "'", long24 == 65743650000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17999 + "'", int26 == 17999);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        mutablePeriod10.setHours(2);
        mutablePeriod10.setSeconds(11);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        java.lang.Object obj21 = mutablePeriod20.clone();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone29);
        org.joda.time.Duration duration31 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(0L, dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        int int38 = dateMidnight37.getEra();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        java.lang.Object obj44 = mutablePeriod43.clone();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, 100L, periodType47, chronology48);
        mutablePeriod43.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone52);
        org.joda.time.Duration duration54 = mutablePeriod43.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight37, (org.joda.time.ReadableDuration) duration54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight34, (org.joda.time.ReadableDuration) duration54, periodType56);
        boolean boolean58 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration54);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration54);
        mutablePeriod10.addYears(86399999);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) ' ');
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((long) 3, dateTimeZone65);
        int int69 = dateTimeZone65.getOffset((long) 39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) 86399999, dateTimeZone65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "PT0.100S");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "PT0.100S");
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "PT0.100S");
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 117120000 + "'", int69 == 117120000);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        org.joda.time.DateTime.Property property9 = dateTime6.minuteOfDay();
        org.joda.time.DateTime.Property property10 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        org.joda.time.LocalDate localDate12 = dateTime6.toLocalDate();
        int int13 = localDate12.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate17 = dateMidnight16.toLocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks(100);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears(53);
        int int23 = localDate22.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(0L, dateTimeZone25);
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks(100);
        org.joda.time.Chronology chronology30 = localDate27.getChronology();
        org.joda.time.LocalDate.Property property31 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate32 = property31.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone34);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(0L, 100L, periodType38, chronology39);
        java.lang.Object obj41 = mutablePeriod40.clone();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone49);
        org.joda.time.Duration duration51 = mutablePeriod40.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight50);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight35.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.LocalDate localDate53 = dateMidnight52.toLocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(0L, 100L, periodType57, chronology58);
        java.lang.Object obj60 = mutablePeriod59.clone();
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(0L, 100L, periodType63, chronology64);
        mutablePeriod59.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod65);
        int int67 = mutablePeriod65.getMinutes();
        org.joda.time.Period period69 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.hours();
        java.lang.String str71 = durationFieldType70.toString();
        org.joda.time.Period period73 = period69.withField(durationFieldType70, 2);
        boolean boolean74 = mutablePeriod65.isSupported(durationFieldType70);
        long long77 = chronology54.add((org.joda.time.ReadablePeriod) mutablePeriod65, (long) 53230763, 2);
        org.joda.time.LocalDate localDate78 = localDate32.minus((org.joda.time.ReadablePeriod) mutablePeriod65);
        org.joda.time.LocalDate localDate80 = localDate78.withDayOfYear(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property82 = localDate80.property(dateTimeFieldType81);
        org.joda.time.LocalDate.Property property83 = localDate22.property(dateTimeFieldType81);
        org.joda.time.LocalDate localDate84 = property83.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "PT0.100S");
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hours" + "'", str71, "hours");
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 53230963L + "'", long77 == 53230963L);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localDate84);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.centuryOfEra();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("days");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property3.setCopy("PT86400S", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT86400S\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "days");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("11:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"11:00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        int int9 = property8.get();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        mutablePeriod14.addMillis(0);
        mutablePeriod14.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        java.lang.Object obj38 = mutablePeriod37.clone();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone46);
        org.joda.time.Duration duration48 = mutablePeriod37.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight32.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(0L, 100L, periodType54, chronology55);
        java.lang.Object obj57 = mutablePeriod56.clone();
        java.lang.String str58 = mutablePeriod56.toString();
        mutableDateTime51.add((org.joda.time.ReadablePeriod) mutablePeriod56, 2022);
        mutablePeriod14.setPeriod((org.joda.time.ReadableInstant) dateMidnight49, (org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime51.addWeekyears((int) (byte) 0);
        mutableDateTime51.setSecondOfMinute(8);
        int int66 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        java.lang.String str67 = property8.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay69 = property8.addToCopy(852);
        int int70 = timeOfDay69.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay69.plusSeconds(27);
        org.joda.time.TimeOfDay timeOfDay74 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 53453096);
        boolean boolean75 = timeOfDay69.isEqual((org.joda.time.ReadablePartial) timeOfDay74);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "PT0.100S");
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.100S" + "'", str58, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 12 + "'", int70 == 12);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(timeOfDay74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfFloor();
        mutableDateTime3.addWeekyears((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        int int10 = dateMidnight9.getEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateMidnight9.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        boolean boolean16 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period18 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.hours();
        java.lang.String str20 = durationFieldType19.toString();
        org.joda.time.Period period22 = period18.withField(durationFieldType19, 2);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, 100L, periodType28, chronology29);
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone39);
        org.joda.time.Duration duration41 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight25.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.LocalDate localDate43 = dateMidnight42.toLocalDate();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, 100L, periodType47, chronology48);
        java.lang.Object obj50 = mutablePeriod49.clone();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(0L, 100L, periodType53, chronology54);
        mutablePeriod49.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod55);
        int int57 = mutablePeriod55.getMinutes();
        org.joda.time.Period period59 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.hours();
        java.lang.String str61 = durationFieldType60.toString();
        org.joda.time.Period period63 = period59.withField(durationFieldType60, 2);
        boolean boolean64 = mutablePeriod55.isSupported(durationFieldType60);
        long long67 = chronology44.add((org.joda.time.ReadablePeriod) mutablePeriod55, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.Chronology chronology69 = chronology44.withZone(dateTimeZone68);
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate(chronology69);
        org.joda.time.DurationField durationField71 = chronology69.halfdays();
        org.joda.time.DurationField durationField72 = durationFieldType19.getField(chronology69);
        mutableDateTime3.add(durationFieldType19, 53256552);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime3.secondOfDay();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime3.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime77 = property76.roundHalfCeiling();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hours" + "'", str20, "hours");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT0.100S");
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hours" + "'", str61, "hours");
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 53230963L + "'", long67 == 53230963L);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(mutableDateTime77);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[clockhourOfHalfday]");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.Duration duration24 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.LocalDate localDate26 = dateMidnight25.toLocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        int int40 = mutablePeriod38.getMinutes();
        org.joda.time.Period period42 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.hours();
        java.lang.String str44 = durationFieldType43.toString();
        org.joda.time.Period period46 = period42.withField(durationFieldType43, 2);
        boolean boolean47 = mutablePeriod38.isSupported(durationFieldType43);
        long long50 = chronology27.add((org.joda.time.ReadablePeriod) mutablePeriod38, (long) 53230763, 2);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 11, chronology27);
        org.joda.time.DateTimeField dateTimeField52 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField53 = chronology27.era();
        org.joda.time.DateTimeField dateTimeField54 = chronology27.weekOfWeekyear();
        long long57 = dateTimeField54.add((long) 47, 0);
        java.util.Locale locale60 = new java.util.Locale("Japanese", "years");
        int int61 = dateTimeField54.getMaximumTextLength(locale60);
        java.lang.String str62 = locale1.getDisplayCountry(locale60);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT0.100S");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hours" + "'", str44, "hours");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 53230963L + "'", long50 == 53230963L);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 47L + "'", long57 == 47L);
        org.junit.Assert.assertEquals(locale60.toString(), "japanese_YEARS");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusSeconds((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) ' ', (int) (short) 100, 7, 1970, 7, 21, 3, 100);
        int[] intArray16 = mutablePeriod15.getValues();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears(12);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfDay(0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfDay(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getRangeDurationType();
        int int35 = localDateTime30.indexOf(dateTimeFieldType33);
        boolean boolean36 = localDateTime26.isEqual((org.joda.time.ReadablePartial) localDateTime30);
        int int37 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime18.plusMillis(53230763);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime18.minusHours(53693557);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime18.plus(readableDuration42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 100, 7, 1970, 7, 21, 3, 100]");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        int int4 = dateMidnight3.getEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateMidnight3.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(9);
        int int9 = dateTime6.getEra();
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.isStandardOffset(53230963L);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((-1900800001L), dateTimeZone11);
        int int17 = dateTimeZone11.getOffsetFromLocal(4598160382091985L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(68540843L);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1639353600100L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone5);
        int int7 = dateMidnight6.getEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = dateMidnight6.toDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(9);
        int int12 = dateTime9.getEra();
        org.joda.time.DateTime dateTime13 = dateTime9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        long long17 = dateTimeZone14.adjustOffset((long) 5, true);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone14);
        long long22 = dateTimeZone14.adjustOffset((long) 9, false);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 1, 434L, dateTimeZone14);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateTime1, dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5L + "'", long17 == 5L);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9L + "'", long22 == 9L);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        org.joda.time.Period period2 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        java.lang.String str4 = durationFieldType3.toString();
        org.joda.time.Period period6 = period2.withField(durationFieldType3, 2);
        int int7 = period2.size();
        org.joda.time.MutablePeriod mutablePeriod8 = period2.toMutablePeriod();
        org.joda.time.PeriodType periodType9 = mutablePeriod8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((-169257599990L), periodType9);
        org.joda.time.PeriodType periodType11 = periodType9.withMillisRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType9.getFieldType(0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        java.lang.String str22 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        long long25 = dateTimeField23.roundHalfFloor(100L);
        java.util.Locale locale29 = new java.util.Locale("hi!", "");
        java.lang.String str30 = locale29.getDisplayVariant();
        java.lang.String str31 = locale29.getCountry();
        java.lang.String str32 = dateTimeField23.getAsShortText((long) 14, locale29);
        int int34 = dateTimeField23.getMinimumValue(0L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        mutableDateTime4.addWeekyears((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone9);
        int int11 = dateMidnight10.getEra();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateMidnight10.toDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        boolean boolean17 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) dateTime15);
        mutableDateTime4.addWeeks(9);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableInstant) mutableDateTime4);
        int int21 = mutableDateTime4.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        int int25 = dateMidnight24.getEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateMidnight24.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight30 = dateTime29.toDateMidnight();
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.era();
        int int32 = dateMidnight30.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight30.plusWeeks(70);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.year();
        boolean boolean37 = dateMidnight34.isBefore((long) 887);
        mutableDateTime4.setDate((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.Chronology chronology39 = dateMidnight34.getChronology();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight34.plusWeeks(53403668);
        int int42 = dateMidnight41.getEra();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(588, 588, 2004, 2004);
        mutablePeriod4.setDays(53260798);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        java.lang.Object obj17 = mutablePeriod16.clone();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(0L, 100L, periodType20, chronology21);
        mutablePeriod16.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone25);
        org.joda.time.Duration duration27 = mutablePeriod16.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight11.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.Period period31 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.hours();
        java.lang.String str33 = durationFieldType32.toString();
        org.joda.time.Period period35 = period31.withField(durationFieldType32, 2);
        org.joda.time.Period period37 = period35.withMillis((int) '#');
        org.joda.time.LocalDate localDate38 = localDate29.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.LocalDate localDate40 = localDate38.minusYears(11);
        org.joda.time.LocalDate localDate42 = localDate38.withDayOfMonth(13);
        org.joda.time.LocalDate.Property property43 = localDate38.weekOfWeekyear();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        mutablePeriod4.setPeriod((-61725661916944L), (long) 53243063, chronology45);
        int int47 = mutablePeriod4.size();
        org.joda.time.MutablePeriod mutablePeriod48 = mutablePeriod4.copy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(0L, dateTimeZone50);
        org.joda.time.LocalDate localDate52 = dateMidnight51.toLocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.weekyear();
        org.joda.time.LocalDate localDate55 = property53.setCopy(16);
        org.joda.time.DateTime dateTime56 = localDate55.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime58 = dateTime56.plusSeconds(16);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone60);
        int int62 = dateMidnight61.getEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = dateMidnight61.toDateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime64.minusWeeks(0);
        org.joda.time.DateTime dateTime68 = dateTime66.plusDays(10);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime70 = dateTime68.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property71 = dateTime70.dayOfYear();
        org.joda.time.DateTime dateTime73 = dateTime70.plusHours(0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "PT0.100S");
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hours" + "'", str33, "hours");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate23 = localDate20.minusWeeks(9);
        int int24 = localDate20.getWeekOfWeekyear();
        int int25 = localDate20.getYearOfEra();
        org.joda.time.Interval interval26 = localDate20.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.Period period28 = interval26.toPeriod();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(70);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMinutes(6);
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.withEra(68);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 68 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(53321751);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        java.lang.String str25 = chronology24.toString();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfDay();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(0L, (long) 1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(10L);
        long long31 = chronology24.set((org.joda.time.ReadablePartial) yearMonthDay29, (long) 8);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 12, chronology24);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime32.setMillisOfSecond(53292560);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53292560 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[UTC]" + "'", str25, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 8L + "'", long31 == 8L);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        int int2 = period1.getWeeks();
        org.joda.time.Period period4 = period1.withMinutes(196);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(0L, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(0L, 100L, periodType15, chronology16);
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.Duration duration28 = mutablePeriod17.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableDuration) duration28, periodType30);
        org.joda.time.Period period33 = period31.withDays((-1));
        org.joda.time.PeriodType periodType34 = period33.getPeriodType();
        org.joda.time.Period period35 = new org.joda.time.Period((long) 34, periodType34);
        org.joda.time.PeriodType periodType36 = periodType34.withSecondsRemoved();
        org.joda.time.Period period37 = period4.normalizedStandard(periodType36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(periodType36);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0.100S");
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, 100L, periodType28, chronology29);
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone39);
        org.joda.time.Duration duration41 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight25.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.LocalDate localDate43 = dateMidnight42.toLocalDate();
        org.joda.time.Period period45 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.hours();
        java.lang.String str47 = durationFieldType46.toString();
        org.joda.time.Period period49 = period45.withField(durationFieldType46, 2);
        org.joda.time.Period period51 = period49.withMillis((int) '#');
        org.joda.time.LocalDate localDate52 = localDate43.minus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.LocalDate localDate54 = localDate52.minusYears(11);
        org.joda.time.LocalDate localDate56 = localDate52.withDayOfMonth(13);
        org.joda.time.LocalDate localDate58 = localDate52.minusWeeks(69);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType59.getRangeDurationType();
        java.lang.String str61 = durationFieldType60.getName();
        org.joda.time.LocalDate localDate63 = localDate58.withFieldAdded(durationFieldType60, 2004);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate.Property property65 = localDate58.property(dateTimeFieldType64);
        int int66 = localDate20.indexOf(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT0.100S");
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hours" + "'", str47, "hours");
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "days" + "'", str61, "days");
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.Object obj0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(obj0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Interval interval11 = dateMidnight1.toInterval();
        org.joda.time.DateMidnight.Property property12 = dateMidnight1.weekyear();
        int int13 = property12.getMaximumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateMidnight2.toLocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(100);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate.Property property7 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate9 = localDate3.plusDays((int) (short) 100);
        org.joda.time.LocalDate.Property property10 = localDate3.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = localDate3.withYearOfEra(53533600);
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusYears(6);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, 100L, periodType9, chronology10);
        java.lang.Object obj12 = mutablePeriod11.clone();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(0L, 100L, periodType15, chronology16);
        mutablePeriod11.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone20);
        org.joda.time.Duration duration22 = mutablePeriod11.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight6.plus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.LocalDate localDate24 = dateMidnight23.toLocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, 100L, periodType28, chronology29);
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        int int38 = mutablePeriod36.getMinutes();
        org.joda.time.Period period40 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.hours();
        java.lang.String str42 = durationFieldType41.toString();
        org.joda.time.Period period44 = period40.withField(durationFieldType41, 2);
        boolean boolean45 = mutablePeriod36.isSupported(durationFieldType41);
        long long48 = chronology25.add((org.joda.time.ReadablePeriod) mutablePeriod36, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.Chronology chronology50 = chronology25.withZone(dateTimeZone49);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.DurationField durationField52 = chronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.secondOfMinute();
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay1.withChronologyRetainFields(chronology50);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 13, chronology50);
        int int56 = mutablePeriod55.getWeeks();
        int int57 = mutablePeriod55.size();
        int int58 = mutablePeriod55.getYears();
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "PT0.100S");
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hours" + "'", str42, "hours");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 53230963L + "'", long48 == 53230963L);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.util.Date date3 = new java.util.Date(53305541, 16, 25);
        date3.setMinutes(53335569);
        int int6 = date3.getMinutes();
        org.junit.Assert.assertEquals(date3.toString(), "Thu Oct 21 14:09:00 GMT 53307543");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        java.lang.String str12 = dateTimeZone10.getNameKey((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.years();
        java.lang.String str15 = durationFieldType14.getName();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withFieldAdded(durationFieldType14, 53337603);
        java.lang.String str18 = durationFieldType14.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "years" + "'", str15, "years");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "years" + "'", str18, "years");
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        int int5 = yearMonthDay4.size();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay4.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology24);
        org.joda.time.Interval interval26 = yearMonthDay25.toInterval();
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property29 = dateTime27.property(dateTimeFieldType28);
        org.joda.time.DateTime.Property property30 = dateTime27.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        int int34 = dateMidnight33.getEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateMidnight33.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusDays(9);
        int int39 = dateTime36.getEra();
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime43 = dateTime27.toDateTime(dateTimeZone41);
        int int45 = dateTimeZone41.getStandardOffset((-1L));
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight47 = yearMonthDay18.toDateMidnight(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay18.minusDays(427);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay18.withYear(55996);
        org.joda.time.LocalDate localDate52 = yearMonthDay51.toLocalDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Etc/UTC" + "'", str42, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateMidnight2.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone5);
        int int7 = dateMidnight6.getEra();
        int int8 = dateMidnight6.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.withField(dateTimeFieldType9, 3);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(0L, 100L, periodType19, chronology20);
        java.lang.Object obj22 = mutablePeriod21.clone();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        mutablePeriod21.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone30);
        org.joda.time.Duration duration32 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight16.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDate localDate34 = dateMidnight33.toLocalDate();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        java.lang.String str36 = chronology35.toString();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfDay();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(0L, (long) 1, chronology35);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(10L);
        long long42 = chronology35.set((org.joda.time.ReadablePartial) yearMonthDay40, (long) 8);
        org.joda.time.DateTimeField dateTimeField43 = chronology35.secondOfDay();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(chronology35);
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType9.getField(chronology35);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = dateTimeField45.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = localDate3.get(dateTimeFieldType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "PT0.100S");
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ISOChronology[UTC]" + "'", str36, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 8L + "'", long42 == 8L);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateMidnight11.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(9);
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime5.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded((long) 86399, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.Chronology chronology25 = dateTime23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.minusYears(6);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        java.lang.Object obj37 = mutablePeriod36.clone();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        org.joda.time.Duration duration47 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight31.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.LocalDate localDate49 = dateMidnight48.toLocalDate();
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(0L, 100L, periodType53, chronology54);
        java.lang.Object obj56 = mutablePeriod55.clone();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, 100L, periodType59, chronology60);
        mutablePeriod55.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod61);
        int int63 = mutablePeriod61.getMinutes();
        org.joda.time.Period period65 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.hours();
        java.lang.String str67 = durationFieldType66.toString();
        org.joda.time.Period period69 = period65.withField(durationFieldType66, 2);
        boolean boolean70 = mutablePeriod61.isSupported(durationFieldType66);
        long long73 = chronology50.add((org.joda.time.ReadablePeriod) mutablePeriod61, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.Chronology chronology75 = chronology50.withZone(dateTimeZone74);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate(chronology75);
        org.joda.time.DurationField durationField77 = chronology75.halfdays();
        org.joda.time.DateTimeField dateTimeField78 = chronology75.secondOfMinute();
        org.joda.time.YearMonthDay yearMonthDay79 = yearMonthDay26.withChronologyRetainFields(chronology75);
        org.joda.time.LocalDate localDate80 = org.joda.time.LocalDate.now(chronology75);
        org.joda.time.DateTime dateTime81 = dateTime23.toDateTime(chronology75);
        org.joda.time.DateTime.Property property82 = dateTime81.year();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "PT0.100S");
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hours" + "'", str67, "hours");
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 53230963L + "'", long73 == 53230963L);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(yearMonthDay79);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(property82);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.util.Date date1 = new java.util.Date((long) 0);
        int int2 = date1.getDay();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 100L, periodType10, chronology11);
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.Duration duration23 = mutablePeriod12.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight7.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.LocalDate localDate25 = dateMidnight24.toLocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        int int39 = mutablePeriod37.getMinutes();
        org.joda.time.Period period41 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        java.lang.String str43 = durationFieldType42.toString();
        org.joda.time.Period period45 = period41.withField(durationFieldType42, 2);
        boolean boolean46 = mutablePeriod37.isSupported(durationFieldType42);
        long long49 = chronology26.add((org.joda.time.ReadablePeriod) mutablePeriod37, (long) 53230763, 2);
        boolean boolean50 = durationFieldType4.isSupported(chronology26);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay3.withChronologyRetainFields(chronology26);
        org.joda.time.DurationField durationField52 = chronology26.weeks();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone60);
        int int62 = dateMidnight61.getEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = dateMidnight61.toDateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusDays(9);
        int int67 = dateTime64.getEra();
        org.joda.time.DateTime dateTime68 = dateTime64.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime68.getZone();
        java.lang.String str70 = dateTimeZone69.toString();
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone69);
        java.lang.String str73 = dateTimeZone69.toString();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate(dateTimeZone69);
        org.joda.time.Chronology chronology75 = chronology26.withZone(dateTimeZone69);
        org.joda.time.DurationField durationField76 = chronology75.hours();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.100S");
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hours" + "'", str43, "hours");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 53230963L + "'", long49 == 53230963L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Etc/UTC" + "'", str70, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Etc/UTC" + "'", str73, "Etc/UTC");
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(durationField76);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(365, 0, 53744616);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        int int6 = calendar0.getGreatestMinimum(0);
        calendar0.setMinimalDaysInFirstWeek(8);
        boolean boolean9 = calendar0.isWeekDateSupported();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(0L, 100L, periodType15, chronology16);
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.Duration duration28 = mutablePeriod17.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight12.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.LocalDate localDate30 = dateMidnight29.toLocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        java.lang.Object obj37 = mutablePeriod36.clone();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        int int44 = mutablePeriod42.getMinutes();
        org.joda.time.Period period46 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.hours();
        java.lang.String str48 = durationFieldType47.toString();
        org.joda.time.Period period50 = period46.withField(durationFieldType47, 2);
        boolean boolean51 = mutablePeriod42.isSupported(durationFieldType47);
        long long54 = chronology31.add((org.joda.time.ReadablePeriod) mutablePeriod42, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Chronology chronology56 = chronology31.withZone(dateTimeZone55);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology56);
        int int58 = localDate57.getWeekOfWeekyear();
        java.util.Date date59 = localDate57.toDate();
        calendar0.setTime(date59);
        long long61 = calendar0.getTimeInMillis();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645401600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0.100S");
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hours" + "'", str48, "hours");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 53230963L + "'", long54 == 53230963L);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Mon Feb 21 00:00:00 GMT 2022");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1645401600000L + "'", long61 == 1645401600000L);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay11 = property8.getTimeOfDay();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.DateMidnight dateMidnight14 = property13.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight15 = property13.roundHalfEvenCopy();
        org.joda.time.DurationField durationField16 = property13.getLeapDurationField();
        org.joda.time.DateMidnight dateMidnight17 = property13.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight18 = property13.withMinimumValue();
        int int19 = property8.compareTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.yearOfEra();
        org.joda.time.DateMidnight dateMidnight21 = property20.roundHalfEvenCopy();
        org.joda.time.Chronology chronology22 = dateMidnight21.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = dateMidnight21.withDurationAdded((-61725661795590L), 53795541);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61725661795590 * 53795541");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Period period22 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        java.lang.String str24 = durationFieldType23.toString();
        org.joda.time.Period period26 = period22.withField(durationFieldType23, 2);
        org.joda.time.Period period28 = period26.withMillis((int) '#');
        org.joda.time.LocalDate localDate29 = localDate20.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = localDate29.minusYears(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.era();
        boolean boolean33 = localDate31.isSupported(dateTimeFieldType32);
        org.joda.time.LocalDate localDate35 = localDate31.withMonthOfYear(6);
        java.util.Calendar.Builder builder36 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder40 = builder36.setDate(53243063, 21, 32769);
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar.Builder builder42 = builder40.setLocale(locale41);
        java.util.Calendar.Builder builder47 = builder42.setTimeOfDay((int) (byte) 10, 53256552, (int) '#', 53243308);
        java.util.Calendar.Builder builder51 = builder47.setTimeOfDay(53243434, 32772, 53097298);
        java.util.Calendar calendar52 = builder51.build();
        boolean boolean53 = calendar52.isWeekDateSupported();
        boolean boolean54 = localDate31.equals((java.lang.Object) boolean53);
        org.joda.time.LocalDate.Property property55 = localDate31.centuryOfEra();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hours" + "'", str24, "hours");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(calendar52);
        org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=1680321234014818000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53249230,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=70,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=26,SECOND=58,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        int int9 = property8.get();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        mutablePeriod14.addMillis(0);
        mutablePeriod14.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        java.lang.Object obj38 = mutablePeriod37.clone();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone46);
        org.joda.time.Duration duration48 = mutablePeriod37.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight32.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(0L, 100L, periodType54, chronology55);
        java.lang.Object obj57 = mutablePeriod56.clone();
        java.lang.String str58 = mutablePeriod56.toString();
        mutableDateTime51.add((org.joda.time.ReadablePeriod) mutablePeriod56, 2022);
        mutablePeriod14.setPeriod((org.joda.time.ReadableInstant) dateMidnight49, (org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime51.addWeekyears((int) (byte) 0);
        mutableDateTime51.setSecondOfMinute(8);
        int int66 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        java.lang.String str67 = property8.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay69 = property8.addToCopy(852);
        org.joda.time.TimeOfDay timeOfDay71 = property8.addToCopy(101);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay73 = property8.setCopy(68);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 68 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "PT0.100S");
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.100S" + "'", str58, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(timeOfDay71);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        org.joda.time.Period period18 = interval15.toPeriod(periodType17);
        org.joda.time.Duration duration19 = interval15.toDuration();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        mutableDateTime23.setMonthOfYear(11);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, 100L, periodType37, chronology38);
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone42);
        org.joda.time.Duration duration44 = mutablePeriod33.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight28.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.LocalDate localDate46 = dateMidnight45.toLocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, 100L, periodType50, chronology51);
        java.lang.Object obj53 = mutablePeriod52.clone();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(0L, 100L, periodType56, chronology57);
        mutablePeriod52.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod58);
        int int60 = mutablePeriod58.getMinutes();
        org.joda.time.Period period62 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.hours();
        java.lang.String str64 = durationFieldType63.toString();
        org.joda.time.Period period66 = period62.withField(durationFieldType63, 2);
        boolean boolean67 = mutablePeriod58.isSupported(durationFieldType63);
        long long70 = chronology47.add((org.joda.time.ReadablePeriod) mutablePeriod58, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.Chronology chronology72 = chronology47.withZone(dateTimeZone71);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate(chronology72);
        org.joda.time.DurationField durationField74 = chronology72.halfdays();
        org.joda.time.DateTimeField dateTimeField75 = chronology72.secondOfMinute();
        int int76 = mutableDateTime23.get(dateTimeField75);
        mutableDateTime23.addMinutes(5);
        int int79 = mutableDateTime23.getYear();
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period82 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.hours();
        java.lang.String str84 = durationFieldType83.toString();
        org.joda.time.Period period86 = period82.withField(durationFieldType83, 2);
        org.joda.time.DurationFieldType durationFieldType87 = org.joda.time.DurationFieldType.millis();
        int int88 = period82.get(durationFieldType87);
        int int89 = periodType80.indexOf(durationFieldType87);
        org.joda.time.PeriodType periodType90 = periodType80.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) mutableDateTime23, periodType80);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime23.setSecondOfMinute(53541);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53541 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-61038316800000L) + "'", long14 == (-61038316800000L));
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0.100S");
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hours" + "'", str64, "hours");
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 53230963L + "'", long70 == 53230963L);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2022 + "'", int79 == 2022);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hours" + "'", str84, "hours");
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(periodType90);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateMidnight2.toLocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.weekyear();
        org.joda.time.LocalDate localDate6 = property4.setCopy(16);
        org.joda.time.DateMidnight dateMidnight7 = localDate6.toDateMidnight();
        org.joda.time.Period period9 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        java.lang.String str11 = durationFieldType10.toString();
        org.joda.time.Period period13 = period9.withField(durationFieldType10, 2);
        int int14 = period9.size();
        org.joda.time.MutablePeriod mutablePeriod15 = period9.toMutablePeriod();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        org.joda.time.Period period18 = period9.plus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone35);
        org.joda.time.Duration duration37 = mutablePeriod26.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight21.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.LocalDate localDate39 = dateMidnight38.toLocalDate();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(0L, 100L, periodType43, chronology44);
        java.lang.Object obj46 = mutablePeriod45.clone();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 100L, periodType49, chronology50);
        mutablePeriod45.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod51);
        int int53 = mutablePeriod51.getMinutes();
        org.joda.time.Period period55 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.hours();
        java.lang.String str57 = durationFieldType56.toString();
        org.joda.time.Period period59 = period55.withField(durationFieldType56, 2);
        boolean boolean60 = mutablePeriod51.isSupported(durationFieldType56);
        long long63 = chronology40.add((org.joda.time.ReadablePeriod) mutablePeriod51, (long) 53230763, 2);
        org.joda.time.Period period65 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.hours();
        java.lang.String str67 = durationFieldType66.toString();
        org.joda.time.Period period69 = period65.withField(durationFieldType66, 2);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.hours();
        java.lang.String str71 = durationFieldType70.toString();
        boolean boolean72 = period65.isSupported(durationFieldType70);
        java.lang.String str73 = durationFieldType70.getName();
        int int74 = mutablePeriod51.indexOf(durationFieldType70);
        int int75 = period18.get(durationFieldType70);
        java.lang.String str76 = durationFieldType70.toString();
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight7.withFieldAdded(durationFieldType70, 53538349);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hours" + "'", str11, "hours");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "PT0.100S");
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hours" + "'", str57, "hours");
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 53230963L + "'", long63 == 53230963L);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hours" + "'", str67, "hours");
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hours" + "'", str71, "hours");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hours" + "'", str73, "hours");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hours" + "'", str76, "hours");
        org.junit.Assert.assertNotNull(dateMidnight78);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.addWrapField((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        int int15 = dateMidnight14.getEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateMidnight14.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusDays(9);
        int int20 = dateTime17.getEra();
        org.joda.time.DateTime dateTime21 = dateTime17.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone22);
        java.lang.String str26 = dateTimeZone22.toString();
        mutableDateTime5.setZoneRetainFields(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 36, dateTimeZone22);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime28.setTime(53292560, 53452430, 0, 53754841);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53292560 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Etc/UTC" + "'", str23, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Etc/UTC" + "'", str26, "Etc/UTC");
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.util.Date date1 = new java.util.Date((long) 0);
        int int2 = date1.getDay();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 100L, periodType10, chronology11);
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.Duration duration23 = mutablePeriod12.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight7.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.LocalDate localDate25 = dateMidnight24.toLocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        int int39 = mutablePeriod37.getMinutes();
        org.joda.time.Period period41 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        java.lang.String str43 = durationFieldType42.toString();
        org.joda.time.Period period45 = period41.withField(durationFieldType42, 2);
        boolean boolean46 = mutablePeriod37.isSupported(durationFieldType42);
        long long49 = chronology26.add((org.joda.time.ReadablePeriod) mutablePeriod37, (long) 53230763, 2);
        boolean boolean50 = durationFieldType4.isSupported(chronology26);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay3.withChronologyRetainFields(chronology26);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay51.minusYears(53233428);
        org.joda.time.YearMonthDay.Property property54 = yearMonthDay51.year();
        org.joda.time.YearMonthDay yearMonthDay56 = property54.setCopy(21);
        int int57 = property54.get();
        org.joda.time.YearMonthDay yearMonthDay58 = property54.withMaximumValue();
        int int59 = property54.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay60 = property54.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay61 = property54.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay63 = property54.setCopy((int) (byte) 10);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.100S");
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hours" + "'", str43, "hours");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 53230963L + "'", long49 == 53230963L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1970 + "'", int57 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 292278993 + "'", int59 == 292278993);
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(yearMonthDay63);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        int int17 = dateMidnight16.getEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateMidnight16.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(0);
        org.joda.time.DateTime dateTime23 = dateTime19.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime23.plusDays(53230763);
        int int26 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime23);
        boolean boolean27 = dateTime12.isAfterNow();
        org.joda.time.DateMidnight dateMidnight28 = dateTime12.toDateMidnight();
        org.joda.time.LocalTime localTime29 = dateTime12.toLocalTime();
        int int30 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property31 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime33 = dateTime12.plusMillis(53756674);
        int int34 = dateTime12.getWeekyear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        int int34 = mutablePeriod32.getMinutes();
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        java.lang.String str38 = durationFieldType37.toString();
        org.joda.time.Period period40 = period36.withField(durationFieldType37, 2);
        boolean boolean41 = mutablePeriod32.isSupported(durationFieldType37);
        long long44 = chronology21.add((org.joda.time.ReadablePeriod) mutablePeriod32, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Chronology chronology46 = chronology21.withZone(dateTimeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DateTime dateTime48 = localDate47.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate50 = localDate47.withCenturyOfEra((int) ' ');
        org.joda.time.LocalDate localDate52 = localDate47.plusYears(57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate54 = localDate47.withMonthOfYear(53693557);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53693557 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hours" + "'", str38, "hours");
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 53230963L + "'", long44 == 53230963L);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        int int40 = dateMidnight19.compareTo((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, readableInstant41);
        org.joda.time.DateMidnight.Property property43 = dateMidnight19.monthOfYear();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.DateMidnight dateMidnight45 = property43.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateMidnight45);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(5);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = timeZone5.getID();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = property9.getDateMidnight();
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfYear();
        int int12 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.DateTime dateTime13 = localTime1.toDateTimeToday(dateTimeZone7);
        long long16 = dateTimeZone7.convertLocalToUTC((long) 'x', true);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((-604800001L), dateTimeZone7);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime();
        int int20 = localTime19.getMillisOfDay();
        org.joda.time.LocalTime.Property property21 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime23 = property21.addCopy(0L);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime.Property property25 = localTime23.millisOfSecond();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, 100L, periodType28, chronology29);
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        mutablePeriod36.setHours(2);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(10, 100, 10, (int) (short) 100, 4, 53230763, (int) ' ', (int) (short) 10);
        org.joda.time.Period period50 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.hours();
        java.lang.String str52 = durationFieldType51.toString();
        org.joda.time.Period period54 = period50.withField(durationFieldType51, 2);
        mutablePeriod48.add(durationFieldType51, 32769);
        int int57 = mutablePeriod36.get(durationFieldType51);
        org.joda.time.LocalTime localTime59 = localTime23.withFieldAdded(durationFieldType51, 96);
        org.joda.time.LocalTime localTime61 = localTime18.withFieldAdded(durationFieldType51, 0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 120L + "'", long16 == 120L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53819433 + "'", int20 == 53819433);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT0.100S");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hours" + "'", str52, "hours");
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        int int4 = dateMidnight3.getEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateMidnight3.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks(0);
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime12 = dateTime8.withFieldAdded(durationFieldType10, 5);
        org.joda.time.DateTime dateTime14 = dateTime8.minus((long) 35);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        int int18 = dateMidnight17.getEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateMidnight17.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks(0);
        org.joda.time.DateTime dateTime23 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.year();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMillis((int) (short) 10);
        org.joda.time.DateTime dateTime31 = dateTime22.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime30.toDateTime(readableInstant32);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, readableInstant32, periodType34);
        org.joda.time.PeriodType periodType36 = periodType34.withSecondsRemoved();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 365, periodType34, chronology37);
        int int39 = mutablePeriod38.getSeconds();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Property[year]");
        timeZone1.setID("hours");
        java.lang.String str4 = timeZone1.getID();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455419474,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hours\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=59,MILLISECOND=474,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundFloor();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.weekOfWeekyear();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        mutableDateTime7.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime7.millisOfDay();
        mutableDateTime7.setMillis((-967894379785000L));
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime7.secondOfDay();
        int int26 = mutableDateTime7.getSecondOfDay();
        boolean boolean27 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone29);
        int int31 = dateMidnight30.getEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateMidnight30.toDateTime(chronology32);
        java.util.Date date34 = dateTime33.toDate();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        int int39 = dateMidnight38.getEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateMidnight38.toDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime41.plusDays(9);
        int int44 = dateTime41.getEra();
        org.joda.time.DateTime dateTime45 = dateTime41.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime45.getZone();
        java.lang.String str48 = dateTimeZone46.getNameKey((long) '4');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone50);
        int int52 = dateMidnight51.getEra();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateMidnight51.toDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusDays(9);
        int int57 = dateTime54.getEra();
        org.joda.time.DateTime dateTime58 = dateTime54.toDateTime();
        int int59 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Period period61 = org.joda.time.Period.days(1);
        org.joda.time.Period period63 = period61.minusSeconds(5);
        org.joda.time.DateTime dateTime64 = dateTime58.plus((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period66 = period63.plusYears(758);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone68);
        int int70 = dateMidnight69.getEra();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = dateMidnight69.toDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusDays(9);
        int int75 = dateTime72.getEra();
        org.joda.time.DateTime dateTime76 = dateTime72.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        long long80 = dateTimeZone77.adjustOffset((long) 5, true);
        org.joda.time.LocalDate localDate81 = org.joda.time.LocalDate.now(dateTimeZone77);
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime84 = dateTime82.plusYears((int) (byte) 1);
        org.joda.time.DateTime dateTime86 = dateTime82.minusMillis(32770);
        boolean boolean87 = period66.equals((java.lang.Object) dateTime86);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.add((org.joda.time.ReadablePeriod) period66, 53704907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 40708319506");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT0.100S");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 65015 + "'", int26 == 65015);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 5L + "'", long80 == 5L);
        org.junit.Assert.assertNotNull(localDate81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        int int23 = dateMidnight22.getEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateMidnight22.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusDays(9);
        int int28 = dateTime25.getEra();
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime16.withZoneRetainFields(dateTimeZone30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 11, dateTimeZone30);
        org.joda.time.LocalDate localDate34 = localDate32.withDayOfYear(15);
        org.joda.time.LocalDate localDate36 = localDate32.withDayOfYear(10);
        org.joda.time.LocalDate.Property property37 = localDate36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone40);
        int int42 = dateMidnight41.getEra();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = dateMidnight41.toDateTime(chronology43);
        long long45 = dateTime44.getMillis();
        org.joda.time.DateTime dateTime47 = dateTime44.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone49);
        int int51 = dateMidnight50.getEra();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = dateMidnight50.toDateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusDays(9);
        int int56 = dateTime53.getEra();
        org.joda.time.DateTime dateTime57 = dateTime53.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        org.joda.time.DateTime dateTime59 = dateTime44.withZoneRetainFields(dateTimeZone58);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 11, dateTimeZone58);
        boolean boolean62 = dateTimeZone58.equals((java.lang.Object) 11);
        org.joda.time.DateTime dateTime63 = localDate36.toDateTimeAtMidnight(dateTimeZone58);
        java.util.Calendar.Builder builder64 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder68 = builder64.setDate(53243063, 21, 32769);
        java.util.Calendar.Builder builder72 = builder68.setTimeOfDay(9, 588, 70);
        java.util.Calendar.Builder builder76 = builder72.setDate(16, 101, 70);
        java.util.Locale locale79 = new java.util.Locale("hi!", "");
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.YearMonthDay yearMonthDay84 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology83);
        org.joda.time.Interval interval85 = yearMonthDay84.toInterval();
        org.joda.time.DateTime dateTime86 = yearMonthDay84.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property88 = dateTime86.property(dateTimeFieldType87);
        org.joda.time.DateTime dateTime89 = property88.getDateTime();
        java.util.Locale locale90 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale91 = locale90.stripExtensions();
        int int92 = property88.getMaximumShortTextLength(locale90);
        java.lang.String str93 = locale79.getDisplayScript(locale90);
        java.lang.String str94 = locale79.getLanguage();
        java.util.Calendar.Builder builder95 = builder72.setLocale(locale79);
        java.util.Calendar calendar96 = dateTime63.toCalendar(locale79);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime97 = property8.setCopy("java.util.GregorianCalendar[time=-61725661802112,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=49,SECOND=57,MILLISECOND=888,ZONE_OFFSET=0,DST_OFFSET=0]", locale79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=-61725661802112,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=49,SECOND=57,MILLISECOND=888,ZONE_OFFSET=0,DST_OFFSET=0]\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 5 + "'", int92 == 5);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(calendar96);
        org.junit.Assert.assertEquals(calendar96.toString(), "java.util.GregorianCalendar[time=777600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=10,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfFloor();
        mutableDateTime3.setMonthOfYear(11);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withWeekyear((int) (short) 1);
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, 100L, periodType28, chronology29);
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone39);
        org.joda.time.Duration duration41 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight25.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.LocalDate localDate43 = dateMidnight42.toLocalDate();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, 100L, periodType47, chronology48);
        java.lang.Object obj50 = mutablePeriod49.clone();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(0L, 100L, periodType53, chronology54);
        mutablePeriod49.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod55);
        int int57 = mutablePeriod55.getMinutes();
        org.joda.time.Period period59 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.hours();
        java.lang.String str61 = durationFieldType60.toString();
        org.joda.time.Period period63 = period59.withField(durationFieldType60, 2);
        boolean boolean64 = mutablePeriod55.isSupported(durationFieldType60);
        long long67 = chronology44.add((org.joda.time.ReadablePeriod) mutablePeriod55, (long) 53230763, 2);
        org.joda.time.Period period69 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.hours();
        java.lang.String str71 = durationFieldType70.toString();
        org.joda.time.Period period73 = period69.withField(durationFieldType70, 2);
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.hours();
        java.lang.String str75 = durationFieldType74.toString();
        boolean boolean76 = period69.isSupported(durationFieldType74);
        java.lang.String str77 = durationFieldType74.getName();
        int int78 = mutablePeriod55.indexOf(durationFieldType74);
        mutablePeriod55.setWeeks(292278993);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight19.plus((org.joda.time.ReadablePeriod) mutablePeriod55);
        mutablePeriod55.addDays(0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Etc/UTC" + "'", str17, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT0.100S");
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hours" + "'", str61, "hours");
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 53230963L + "'", long67 == 53230963L);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hours" + "'", str71, "hours");
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hours" + "'", str75, "hours");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hours" + "'", str77, "hours");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertNotNull(dateMidnight81);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay2.getFieldType(53553757);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53553757");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime15 = property12.addCopy((int) ' ');
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        int int18 = localTime17.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1920000 + "'", int18 == 1920000);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property12.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.joda.time.LocalTime localTime15 = property12.roundHalfCeilingCopy();
        int int16 = localTime15.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone18);
        int int20 = dateMidnight19.getEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateMidnight19.toDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight25 = dateTime24.toDateMidnight();
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.era();
        int int27 = dateMidnight25.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight25.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1);
        boolean boolean32 = dateMidnight29.isEqual((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateMidnight.Property property34 = dateMidnight31.property(dateTimeFieldType33);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType33.getDurationType();
        boolean boolean36 = localTime15.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime localTime38 = localTime15.plusMillis((-5601628));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime38);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.dayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 27, (long) 53736392, periodType2);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        int int40 = dateMidnight19.compareTo((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, readableInstant41);
        org.joda.time.DateMidnight.Property property43 = dateMidnight19.monthOfYear();
        org.joda.time.DateMidnight dateMidnight44 = property43.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateMidnight44);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfEvenCopy();
        java.lang.String str4 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[year]" + "'", str4, "Property[year]");
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 12);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear(7);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayVariant();
        java.util.Date date13 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromDateFields(date13);
        int int15 = timeOfDay14.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.secondOfMinute();
        java.util.Locale locale23 = new java.util.Locale("hi!", "");
        java.lang.String str24 = property20.getAsShortText(locale23);
        java.lang.String str25 = locale10.getDisplayScript(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter7.withLocale(locale23);
        java.util.Calendar.Builder builder27 = builder0.setLocale(locale23);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        java.lang.Object obj35 = mutablePeriod34.clone();
        java.lang.String str36 = mutablePeriod34.toString();
        mutableDateTime29.add((org.joda.time.ReadablePeriod) mutablePeriod34, 2022);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        int int43 = dateMidnight42.getEra();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateMidnight42.toDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusDays(9);
        int int48 = dateTime45.getEra();
        org.joda.time.DateTime dateTime49 = dateTime45.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        long long53 = dateTimeZone50.adjustOffset((long) 5, true);
        mutableDateTime29.setZoneRetainFields(dateTimeZone50);
        java.util.TimeZone timeZone55 = dateTimeZone50.toTimeZone();
        java.util.Calendar.Builder builder56 = builder0.setTimeZone(timeZone55);
        java.util.Calendar calendar57 = builder0.build();
        calendar57.set(53299420, 852, 0, (int) (short) 0, (-292275054), 9);
        org.joda.time.LocalTime localTime65 = org.joda.time.LocalTime.fromCalendarFields(calendar57);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = calendar57.getMinimum(3682080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3682080");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.100S" + "'", str36, "PT0.100S");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 5L + "'", long53 == 5L);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=1681889775339969012,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53298935,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=6,SECOND=9,MILLISECOND=12,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime65);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology19);
        org.joda.time.Interval interval21 = yearMonthDay20.toInterval();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.Interval interval23 = interval21.withPeriodBeforeEnd(readablePeriod22);
        boolean boolean24 = interval5.overlaps((org.joda.time.ReadableInterval) interval23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        int int28 = dateMidnight27.getEra();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, 100L, periodType37, chronology38);
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone42);
        org.joda.time.Duration duration44 = mutablePeriod33.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight27, (org.joda.time.ReadableDuration) duration44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone47);
        int int49 = dateMidnight48.getEra();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(0L, 100L, periodType52, chronology53);
        java.lang.Object obj55 = mutablePeriod54.clone();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(0L, 100L, periodType58, chronology59);
        mutablePeriod54.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone63);
        org.joda.time.Duration duration65 = mutablePeriod54.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight64);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight48, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration44.isLongerThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Interval interval68 = interval5.withDurationAfterStart((org.joda.time.ReadableDuration) duration44);
        java.lang.String str69 = interval5.toString();
        org.joda.time.Period period70 = interval5.toPeriod();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-61038316800000L) + "'", long14 == (-61038316800000L));
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0.100S");
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "PT0.100S");
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0035-10-10T00:00:00.000Z/0035-10-11T00:00:00.000Z" + "'", str69, "0035-10-10T00:00:00.000Z/0035-10-11T00:00:00.000Z");
        org.junit.Assert.assertNotNull(period70);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekyearOfCentury();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 57);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds(53480);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.year();
        java.util.Locale locale7 = new java.util.Locale("hi!", "");
        java.lang.String str8 = property4.getAsText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property4.withMaximumValue();
        java.lang.String str10 = property4.toString();
        org.joda.time.DateTimeField dateTimeField11 = property4.getField();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        int int15 = property4.getDifference((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.LocalDateTime localDateTime16 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime18 = property4.addWrapFieldToCopy((int) (short) 10);
        boolean boolean19 = strSet1.contains((java.lang.Object) property4);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.lang.String str22 = locale21.getScript();
        java.lang.String str23 = locale21.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = property4.setCopy("java.util.GregorianCalendar[time=1645401600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=1645401600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[year]" + "'", str10, "Property[year]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Period period22 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        java.lang.String str24 = durationFieldType23.toString();
        org.joda.time.Period period26 = period22.withField(durationFieldType23, 2);
        org.joda.time.Period period28 = period26.withMillis((int) '#');
        org.joda.time.LocalDate localDate29 = localDate20.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfMonth(11);
        org.joda.time.LocalDate localDate33 = localDate31.plusMonths((int) (short) 100);
        int int34 = localDate33.getDayOfMonth();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hours" + "'", str24, "hours");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11 + "'", int34 == 11);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMonths(896);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.lang.String str2 = timeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("Property[year]");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone5);
        java.util.TimeZone.setDefault(timeZone5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        boolean boolean10 = timeZone1.hasSameRules(timeZone5);
        int int12 = timeZone5.getOffset((long) 970);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455419813,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=59,MILLISECOND=813,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455419813,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=59,MILLISECOND=813,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withMinuteOfHour(0);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay12.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = property14.setCopy(19);
        java.lang.String str17 = property14.getName();
        org.joda.time.TimeOfDay timeOfDay19 = property14.addWrapFieldToCopy((-1996092050));
        int int20 = timeOfDay19.getMinuteOfHour();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hourOfDay" + "'", str17, "hourOfDay");
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("java.io.IOException: PT0.100S");
        int int11 = property8.getMaximumShortTextLength(locale10);
        java.lang.String str12 = property8.getName();
        org.joda.time.TimeOfDay timeOfDay13 = property8.withMinimumValue();
        int int14 = timeOfDay13.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withSecondOfMinute(53305541);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53305541 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondOfMinute" + "'", str12, "secondOfMinute");
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 23 + "'", int14 == 23);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.minusHours(45);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(53395022);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone16);
        boolean boolean18 = calendar0.before((java.lang.Object) dateTimeZone16);
        calendar0.clear();
        java.util.TimeZone timeZone20 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(86398030, 53489781);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        int int4 = dateMidnight3.getEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateMidnight3.toDateTime(chronology5);
        long long7 = dateTime6.getMillis();
        org.joda.time.DateTime dateTime9 = dateTime6.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone11);
        int int13 = dateMidnight12.getEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateMidnight12.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusDays(9);
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.DateTime dateTime21 = dateTime6.withZoneRetainFields(dateTimeZone20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 11, dateTimeZone20);
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfYear(15);
        org.joda.time.LocalDate localDate26 = localDate22.withDayOfYear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = localDate22.withMonthOfYear(53250029);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53250029 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(69, 53233428, (int) (byte) -1, 14);
        mutablePeriod4.addDays(32);
        mutablePeriod4.addWeeks(50400000);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfDay(0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        int int10 = dateMidnight9.getEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateMidnight9.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks(0);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(70);
        int int19 = property6.getDifference((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime18.minusHours(30);
        org.joda.time.DateTime dateTime23 = dateTime18.plus((-61725661873986L));
        org.joda.time.DateTime.Property property24 = dateTime18.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        java.lang.String str33 = mutablePeriod31.toString();
        mutableDateTime26.add((org.joda.time.ReadablePeriod) mutablePeriod31, 2022);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone38);
        int int40 = dateMidnight39.getEra();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = dateMidnight39.toDateTime(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusDays(9);
        int int45 = dateTime42.getEra();
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone47 = dateTime46.getZone();
        long long50 = dateTimeZone47.adjustOffset((long) 5, true);
        mutableDateTime26.setZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime52 = dateTime18.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime54 = dateTime18.minusSeconds(53359356);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-260254) + "'", int19 == (-260254));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0.100S" + "'", str33, "PT0.100S");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 5L + "'", long50 == 5L);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(9, 0, 53230763, (int) (byte) 1, 3, 7, (int) (short) 0, 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = mutablePeriod8.isSupported(durationFieldType10);
        java.lang.String str13 = durationFieldType10.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P9Y53230763W1DT3H7M0.021S" + "'", str9, "P9Y53230763W1DT3H7M0.021S");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hours" + "'", str11, "hours");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hours" + "'", str13, "hours");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        java.lang.Object obj24 = mutablePeriod23.clone();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        org.joda.time.Duration duration34 = mutablePeriod23.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.LocalDate localDate36 = dateMidnight35.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = localDate36.toInterval(dateTimeZone37);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean40 = interval38.equals((java.lang.Object) filteringMode39);
        boolean boolean41 = interval5.isAfter((org.joda.time.ReadableInterval) interval38);
        boolean boolean43 = interval38.contains(10950508800000L);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        int int47 = dateMidnight46.getEra();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateMidnight46.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight52 = dateTime51.toDateMidnight();
        org.joda.time.DateMidnight.Property property53 = dateMidnight52.era();
        int int54 = dateMidnight52.getDayOfYear();
        org.joda.time.DateTime dateTime55 = dateMidnight52.toDateTime();
        boolean boolean56 = interval38.contains((org.joda.time.ReadableInstant) dateMidnight52);
        java.lang.String str57 = dateMidnight52.toString();
        int int58 = dateMidnight52.getDayOfMonth();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-61038316800000L) + "'", long14 == (-61038316800000L));
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "PT0.100S");
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str57, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(9, 0, 53230763, (int) (byte) 1, 3, 7, (int) (short) 0, 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = mutablePeriod8.isSupported(durationFieldType10);
        mutablePeriod8.addMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks(0);
        org.joda.time.DateTime dateTime24 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime25 = dateTime23.toLocalTime();
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes(3);
        org.joda.time.LocalTime localTime29 = localTime25.minusMillis((-1));
        org.joda.time.DateTime dateTime30 = localTime29.toDateTimeToday();
        org.joda.time.LocalTime localTime32 = localTime29.minusMinutes(2022);
        org.joda.time.Chronology chronology33 = localTime29.getChronology();
        mutablePeriod8.add((long) 13, chronology33);
        org.joda.time.DurationField durationField35 = chronology33.seconds();
        long long37 = durationField35.getValueAsLong((long) 53553757);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P9Y53230763W1DT3H7M0.021S" + "'", str9, "P9Y53230763W1DT3H7M0.021S");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hours" + "'", str11, "hours");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 53553L + "'", long37 == 53553L);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime5 = property2.getMutableDateTime();
        int int6 = mutableDateTime5.getSecondOfMinute();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        int int17 = dateMidnight16.getEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateMidnight16.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.era();
        int int24 = dateMidnight22.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        int int28 = dateMidnight27.getEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateMidnight27.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks(0);
        org.joda.time.DateTime dateTime33 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime36 = dateTime32.withFieldAdded(durationFieldType34, 5);
        int int37 = dateMidnight22.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = dateTime36.toDateTime();
        int int39 = dateTime38.getDayOfMonth();
        org.joda.time.DateTime dateTime41 = dateTime38.minus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone43);
        int int45 = dateMidnight44.getEra();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateMidnight44.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusWeeks(0);
        org.joda.time.DateTime dateTime51 = dateTime47.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime53 = dateTime51.plusDays(53230763);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology57);
        int int59 = yearMonthDay58.size();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone67);
        int int69 = dateMidnight68.getEra();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateMidnight68.toDateTime(chronology70);
        org.joda.time.DateTime dateTime73 = dateTime71.plusDays(9);
        int int74 = dateTime71.getEra();
        org.joda.time.DateTime dateTime75 = dateTime71.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime75.getZone();
        java.lang.String str77 = dateTimeZone76.toString();
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone76);
        java.lang.String str80 = dateTimeZone76.toString();
        org.joda.time.Interval interval81 = yearMonthDay58.toInterval(dateTimeZone76);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime53.toMutableDateTime(dateTimeZone76);
        org.joda.time.MutableDateTime mutableDateTime83 = dateTime38.toMutableDateTime(dateTimeZone76);
        boolean boolean84 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime83);
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property86 = dateTime13.dayOfWeek();
        org.joda.time.DateTime dateTime88 = dateTime13.withMillisOfDay(999);
        org.joda.time.DateTime dateTime90 = dateTime13.plusMinutes(53484781);
        org.joda.time.DateTime dateTime92 = dateTime90.minusMonths(86399);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Etc/UTC" + "'", str77, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Etc/UTC" + "'", str80, "Etc/UTC");
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        java.lang.String str25 = chronology24.toString();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 14, chronology24);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 53243063, 600000L, chronology24);
        org.joda.time.DateTimeField dateTimeField28 = chronology24.millisOfDay();
        long long31 = dateTimeField28.getDifferenceAsLong(53353L, (long) 347);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[UTC]" + "'", str25, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 53006L + "'", long31 == 53006L);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime();
        int int12 = dateMidnight8.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        java.lang.Object obj21 = mutablePeriod20.clone();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone29);
        org.joda.time.Duration duration31 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.plus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.LocalDate localDate33 = dateMidnight32.toLocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.dayOfYear();
        org.joda.time.LocalDate localDate35 = property34.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate37 = localDate35.withWeekyear(11);
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = null;
        org.joda.time.format.DateTimeParser dateTimeParser39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter38, dateTimeParser39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone44);
        int int46 = dateMidnight45.getEra();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = dateMidnight45.toDateTime(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusDays(9);
        int int51 = dateTime48.getEra();
        org.joda.time.DateTime dateTime52 = dateTime48.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        java.lang.String str54 = dateTimeZone53.toString();
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter40.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = localDate37.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        boolean boolean59 = dateTimeZone53.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) int12, dateTimeZone53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "PT0.100S");
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Etc/UTC" + "'", str54, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        int int6 = calendar0.getGreatestMinimum(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        int int10 = dateMidnight9.getEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateMidnight9.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.era();
        int int17 = dateMidnight15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        int int21 = dateMidnight20.getEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateMidnight20.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusWeeks(0);
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime29 = dateTime25.withFieldAdded(durationFieldType27, 5);
        int int30 = dateMidnight15.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime();
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime34 = dateTime31.minus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        int int38 = dateMidnight37.getEra();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateMidnight37.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks(0);
        org.joda.time.DateTime dateTime44 = dateTime40.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusDays(53230763);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology50);
        int int52 = yearMonthDay51.size();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone60);
        int int62 = dateMidnight61.getEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = dateMidnight61.toDateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusDays(9);
        int int67 = dateTime64.getEra();
        org.joda.time.DateTime dateTime68 = dateTime64.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime68.getZone();
        java.lang.String str70 = dateTimeZone69.toString();
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone69);
        java.lang.String str73 = dateTimeZone69.toString();
        org.joda.time.Interval interval74 = yearMonthDay51.toInterval(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime75 = dateTime46.toMutableDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime31.toMutableDateTime(dateTimeZone69);
        boolean boolean77 = calendar0.before((java.lang.Object) dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone69);
        mutableDateTime78.setDate((-604800001L));
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime78.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime83 = property81.addWrapField(53250029);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-61725661379900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Etc/UTC" + "'", str70, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Etc/UTC" + "'", str73, "Etc/UTC");
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(mutableDateTime83);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale3 = new java.util.Locale("hi!", "");
        java.lang.String str6 = nameProvider0.getName(locale3, "days", "years");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        java.lang.String str29 = chronology28.toString();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone34);
        int int36 = dateMidnight35.getEra();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = dateMidnight35.toDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusDays(9);
        int int41 = dateTime38.getEra();
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        java.lang.String str44 = dateTimeZone43.toString();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone43);
        java.util.Locale locale49 = new java.util.Locale("", "0035-10-10");
        java.lang.String str50 = dateTimeZone43.getName((long) (short) 0, locale49);
        java.lang.String str51 = dateTimeField31.getAsText((int) (short) 0, locale49);
        java.util.Set<java.lang.Character> charSet52 = locale49.getExtensionKeys();
        java.lang.String str55 = nameProvider0.getShortName(locale49, "P1D", "java.util.GregorianCalendar[time=1645454851032,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=31,MILLISECOND=32,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.joda.time.tz.NameProvider nameProvider56 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale59 = new java.util.Locale("hi!", "");
        java.lang.String str62 = nameProvider56.getName(locale59, "days", "years");
        java.lang.String str63 = locale59.getVariant();
        java.lang.String str64 = locale59.getScript();
        java.lang.String str67 = nameProvider0.getName(locale59, "32", "2022-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "PT0.100S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ISOChronology[UTC]" + "'", str29, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Etc/UTC" + "'", str44, "Etc/UTC");
        org.junit.Assert.assertEquals(locale49.toString(), "_0035-10-10");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(nameProvider56);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.toString();
        org.joda.time.LocalDateTime localDateTime9 = property2.getLocalDateTime();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("days");
        int int12 = property2.getMaximumTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks(42);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(53675741);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[year]" + "'", str8, "Property[year]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "days");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        java.util.Locale locale2 = new java.util.Locale("2022-02-21T00:00:00.000", "1969-12-29");
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-21t00:00:00.000_1969-12-29");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (byte) 10);
        boolean boolean5 = dateTimeFormatter4.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withPivotYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear(53255370);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        calendar10.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(9);
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone26);
        boolean boolean28 = calendar10.before((java.lang.Object) dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter9.withZone(dateTimeZone26);
        java.lang.String str32 = dateTimeZone26.getName(2325376800052L);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61725661379813,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=187,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear(7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withPivotYear(53243434);
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        int int15 = dateMidnight14.getEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateMidnight14.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks(0);
        org.joda.time.DateTime dateTime20 = dateTime19.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime21 = dateTime19.toLocalTime();
        org.joda.time.LocalTime localTime23 = localTime21.minusMinutes(3);
        org.joda.time.LocalTime localTime25 = localTime21.minusMillis((-1));
        org.joda.time.DateTime dateTime26 = localTime25.toDateTimeToday();
        org.joda.time.LocalTime localTime28 = localTime25.minusMinutes(2022);
        org.joda.time.Chronology chronology29 = localTime25.getChronology();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 9, chronology29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear((-46800000));
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer10, (org.joda.time.ReadableInstant) dateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours(2022);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.year();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfDay();
        boolean boolean16 = localDateTime4.equals((java.lang.Object) dateTimeField15);
        java.lang.String str18 = dateTimeField15.getAsText(53636897L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "53636" + "'", str18, "53636");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis(14);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay10.plusHours(45);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withMillisOfSecond(53);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone18);
        int int20 = dateMidnight19.getEra();
        int int21 = dateMidnight19.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withField(dateTimeFieldType22, 3);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        java.lang.Object obj35 = mutablePeriod34.clone();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(0L, 100L, periodType38, chronology39);
        mutablePeriod34.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone43);
        org.joda.time.Duration duration45 = mutablePeriod34.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight29.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.LocalDate localDate47 = dateMidnight46.toLocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        java.lang.String str49 = chronology48.toString();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.secondOfDay();
        org.joda.time.Interval interval51 = new org.joda.time.Interval(0L, (long) 1, chronology48);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay(10L);
        long long55 = chronology48.set((org.joda.time.ReadablePartial) yearMonthDay53, (long) 8);
        org.joda.time.DateTimeField dateTimeField56 = chronology48.secondOfDay();
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(chronology48);
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType22.getField(chronology48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property59 = timeOfDay16.property(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "PT0.100S");
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ISOChronology[UTC]" + "'", str49, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 8L + "'", long55 == 8L);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField58);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.withWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.weekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Etc/UTC" + "'", str11, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 100L, periodType4, chronology5);
        java.lang.Object obj7 = mutablePeriod6.clone();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 100L, periodType10, chronology11);
        mutablePeriod6.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        org.joda.time.Duration duration17 = mutablePeriod6.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight16);
        mutablePeriod6.addMillis(0);
        mutablePeriod6.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone38);
        org.joda.time.Duration duration40 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight24.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 100L, periodType46, chronology47);
        java.lang.Object obj49 = mutablePeriod48.clone();
        java.lang.String str50 = mutablePeriod48.toString();
        mutableDateTime43.add((org.joda.time.ReadablePeriod) mutablePeriod48, 2022);
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) dateMidnight41, (org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone57);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(0L, 100L, periodType61, chronology62);
        java.lang.Object obj64 = mutablePeriod63.clone();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(0L, 100L, periodType67, chronology68);
        mutablePeriod63.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone72);
        org.joda.time.Duration duration74 = mutablePeriod63.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight58.plus((org.joda.time.ReadableDuration) duration74);
        org.joda.time.LocalDate localDate76 = dateMidnight75.toLocalDate();
        org.joda.time.Chronology chronology77 = localDate76.getChronology();
        java.lang.String str78 = chronology77.toString();
        org.joda.time.DateTimeField dateTimeField79 = chronology77.secondOfDay();
        org.joda.time.Interval interval80 = new org.joda.time.Interval(0L, (long) 1, chronology77);
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay(10L);
        long long84 = chronology77.set((org.joda.time.ReadablePartial) yearMonthDay82, (long) 8);
        org.joda.time.DateTimeField dateTimeField85 = chronology77.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod6, chronology77);
        org.joda.time.DateTimeField dateTimeField87 = chronology77.dayOfMonth();
        org.joda.time.LocalDate localDate88 = new org.joda.time.LocalDate((long) 588, chronology77);
        org.joda.time.DurationField durationField89 = chronology77.weekyears();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((-61725661931538L), chronology77);
        java.lang.String str91 = chronology77.toString();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0.100S");
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT0.100S" + "'", str50, "PT0.100S");
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "PT0.100S");
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(dateMidnight75);
        org.junit.Assert.assertNotNull(localDate76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ISOChronology[UTC]" + "'", str78, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 8L + "'", long84 == 8L);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "ISOChronology[UTC]" + "'", str91, "ISOChronology[UTC]");
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear(7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withPivotYear(53243434);
        org.joda.time.format.DateTimeFormatter[] dateTimeFormatterArray14 = new org.joda.time.format.DateTimeFormatter[] { dateTimeFormatter13 };
        org.joda.time.format.DateTimeFormatter[] dateTimeFormatterArray15 = strSet3.toArray(dateTimeFormatterArray14);
        strSet3.clear();
        boolean boolean17 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet3);
        int int18 = strSet1.size();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterArray14);
        org.junit.Assert.assertNotNull(dateTimeFormatterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = property8.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = property8.addNoWrapToCopy(3);
        int int12 = property8.get();
        org.joda.time.DurationField durationField13 = property8.getDurationField();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1);
        boolean boolean15 = dateMidnight12.isEqual((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        java.lang.Object obj24 = mutablePeriod23.clone();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        org.joda.time.Duration duration34 = mutablePeriod23.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.year();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        int int47 = dateMidnight46.getEra();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateMidnight46.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime49.plusDays(9);
        int int52 = dateTime49.getEra();
        org.joda.time.DateTime dateTime53 = dateTime49.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime53.getZone();
        java.lang.String str55 = dateTimeZone54.toString();
        org.joda.time.Chronology chronology56 = chronology43.withZone(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone57 = chronology56.getZone();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.year();
        java.util.Locale locale63 = new java.util.Locale("hi!", "");
        java.lang.String str64 = property60.getAsText(locale63);
        org.joda.time.LocalDateTime localDateTime65 = property60.withMaximumValue();
        int int67 = localDateTime65.getValue(3);
        boolean boolean68 = dateTimeZone57.isLocalDateTimeGap(localDateTime65);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight18.withZoneRetainFields(dateTimeZone57);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight12, (org.joda.time.ReadableInstant) dateMidnight69);
        int int71 = dateMidnight12.getSecondOfMinute();
        org.joda.time.DateMidnight.Property property72 = dateMidnight12.monthOfYear();
        int int73 = dateMidnight12.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight12.withMillis((long) 53337603);
        int int76 = dateMidnight75.getEra();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "PT0.100S");
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Etc/UTC" + "'", str55, "Etc/UTC");
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2022" + "'", str64, "2022");
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 53820312 + "'", int67 == 53820312);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 6 + "'", int73 == 6);
        org.junit.Assert.assertNotNull(dateMidnight75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        int int6 = timeOfDay2.size();
        org.joda.time.DateTime dateTime7 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(21);
        org.joda.time.DateTime dateTime11 = dateTime7.plusDays(53250029);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        int int15 = dateMidnight14.getEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateMidnight14.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks(0);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(53230763);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.dayTime();
        int int25 = periodType24.size();
        org.joda.time.PeriodType periodType26 = periodType24.withMillisRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime23, periodType24);
        org.joda.time.Period period28 = period27.normalizedStandard();
        int int29 = period27.getYears();
        org.joda.time.Weeks weeks30 = period27.toStandardWeeks();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(weeks30);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes(32770);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays(86399997);
        org.joda.time.DateTime dateTime18 = dateTime16.minusYears(1972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((-62262119413347L), periodType1);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis(14);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay10.plusHours(45);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (short) -1, (-61725661923552L), periodType17);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay14.plus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay14.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay22 = property20.addToCopy(53363);
        org.joda.time.TimeOfDay timeOfDay24 = property20.addToCopy(892);
        org.joda.time.DurationField durationField25 = property20.getRangeDurationField();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone16);
        boolean boolean18 = calendar0.before((java.lang.Object) dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.addWrapField((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField26 = mutableDateTime25.getRoundingField();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 53230763, dateTimeZone29);
        int int31 = localDateTime30.size();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.plusMonths(0);
        org.joda.time.Period period35 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.hours();
        java.lang.String str37 = durationFieldType36.toString();
        org.joda.time.Period period39 = period35.withField(durationFieldType36, 2);
        org.joda.time.Period period41 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        java.lang.String str43 = durationFieldType42.toString();
        org.joda.time.Period period45 = period41.withField(durationFieldType42, 2);
        org.joda.time.Period period46 = period39.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime30.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period49 = period39.minusMonths(21);
        mutableDateTime25.add((org.joda.time.ReadablePeriod) period39);
        boolean boolean51 = mutableDateTime20.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 53230763, dateTimeZone53);
        int int55 = localDateTime54.size();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.plusMonths(0);
        org.joda.time.Period period59 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.hours();
        java.lang.String str61 = durationFieldType60.toString();
        org.joda.time.Period period63 = period59.withField(durationFieldType60, 2);
        org.joda.time.Period period65 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.hours();
        java.lang.String str67 = durationFieldType66.toString();
        org.joda.time.Period period69 = period65.withField(durationFieldType66, 2);
        org.joda.time.Period period70 = period63.minus((org.joda.time.ReadablePeriod) period69);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime54.plus((org.joda.time.ReadablePeriod) period63);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime54.withYearOfEra((int) (short) 1);
        int int74 = localDateTime73.getYearOfEra();
        int int75 = localDateTime73.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property76 = localDateTime73.secondOfMinute();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(chronology77);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.withMillisOfDay(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType84 = dateTimeFieldType83.getRangeDurationType();
        int int85 = localDateTime80.indexOf(dateTimeFieldType83);
        boolean boolean86 = localDateTime73.isSupported(dateTimeFieldType83);
        boolean boolean87 = mutableDateTime25.isSupported(dateTimeFieldType83);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-61725661379592,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=408,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNull(dateTimeField26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hours" + "'", str37, "hours");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hours" + "'", str43, "hours");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hours" + "'", str61, "hours");
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hours" + "'", str67, "hours");
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology9);
        org.joda.time.DateMidnight dateMidnight11 = yearMonthDay10.toDateMidnight();
        org.joda.time.Chronology chronology12 = yearMonthDay10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        int int16 = dateMidnight15.getEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateMidnight15.toDateTime(chronology17);
        long long19 = dateTime18.getMillis();
        org.joda.time.DateTime dateTime21 = dateTime18.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        int int25 = dateMidnight24.getEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateMidnight24.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusDays(9);
        int int30 = dateTime27.getEra();
        org.joda.time.DateTime dateTime31 = dateTime27.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime18.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        java.lang.String str36 = dateTimeZone34.getNameKey(2022L);
        org.joda.time.DateTime dateTime37 = yearMonthDay10.toDateTimeAtMidnight(dateTimeZone34);
        long long39 = dateTimeZone34.previousTransition(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(83100, 283, 53708, 53336067, 43, 282, dateTimeZone34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53336067 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addWrapFieldToCopy(887);
        int int11 = property8.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay12 = property8.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property8.getFieldType();
        org.joda.time.TimeOfDay timeOfDay15 = property8.setCopy("2");
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = timeOfDay15.getFields();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        java.util.Date date6 = dateTime5.toDate();
        java.time.Instant instant7 = date6.toInstant();
        java.util.Date date14 = new java.util.Date((int) (short) 10, 32769, 9, 9, 22, 21);
        java.util.Date date16 = new java.util.Date((long) 0);
        boolean boolean17 = date14.after(date16);
        int int18 = date14.getDay();
        boolean boolean19 = date6.after(date14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 09 09:22:21 GMT 4640");
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusSeconds((-1));
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withFieldAdded(durationFieldType7, 57);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone6);
        int int8 = dateMidnight7.getEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateMidnight7.toDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(9);
        int int13 = dateTime10.getEra();
        org.joda.time.DateTime dateTime14 = dateTime10.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 35);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        boolean boolean24 = dateTimeFormatter22.isPrinter();
        org.joda.time.Chronology chronology25 = dateTimeFormatter22.getChronolgy();
        int int26 = dateTimeFormatter22.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2000 + "'", int26 == 2000);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        org.joda.time.DateTime.Property property8 = dateTime5.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime5.plusDays(0);
        org.joda.time.Period period15 = new org.joda.time.Period(12, 2, (int) ' ', (int) (short) 10);
        org.joda.time.Period period17 = period15.plusDays(1970);
        org.joda.time.Period period19 = period15.plusWeeks((int) '#');
        org.joda.time.DateTime dateTime21 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period19, (-292275054));
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours(637);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Date date5 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromDateFields(date5);
        int int7 = timeOfDay6.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        java.util.Locale locale15 = new java.util.Locale("hi!", "");
        java.lang.String str16 = property12.getAsShortText(locale15);
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale3.getDisplayName(locale15);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone1, locale3);
        calendar20.setMinimalDaysInFirstWeek(245);
        calendar20.setMinimalDaysInFirstWeek(1022397);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455420528,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=528,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French (Canada)" + "'", str19, "French (Canada)");
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455420528,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1022397,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=528,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone16);
        boolean boolean18 = calendar0.before((java.lang.Object) dateTimeZone16);
        calendar0.clear((int) (byte) 0);
        calendar0.add((int) (byte) 0, (int) (short) 1);
        calendar0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar0.getActualMinimum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        calendar0.set((int) (byte) 10, 8, (int) (short) 0);
        int int9 = calendar0.getFirstDayOfWeek();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        calendar10.setWeekDate(14, (int) (byte) 0, 7);
        java.util.Date date15 = calendar10.getTime();
        int int16 = date15.getTimezoneOffset();
        calendar0.setTime(date15);
        java.time.Instant instant18 = calendar0.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(53329);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53329");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-61725661379440,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=560,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61725661379440,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=560,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Dec 30 14:57:00 GMT 13");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        java.util.Locale locale11 = new java.util.Locale("hi!", "");
        java.lang.String str12 = property8.getAsShortText(locale11);
        org.joda.time.DateTimeField dateTimeField13 = property8.getField();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.util.Date date1 = new java.util.Date((long) 0);
        int int2 = date1.getDay();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.minusMonths(32770);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay3.year();
        java.lang.String str7 = yearMonthDay3.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime41.toMutableDateTime();
        org.joda.time.Period period54 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.Period period56 = period54.plusMonths((int) 'a');
        org.joda.time.Period period58 = period54.withHours(70);
        mutableDateTime52.add((org.joda.time.ReadablePeriod) period58, 47);
        mutableDateTime52.setYear(69);
        int int63 = mutableDateTime52.getSecondOfDay();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT0.100S" + "'", str48, "PT0.100S");
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7406 + "'", int63 == 7406);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("120");
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale6.getScript();
        java.util.Locale.Builder builder9 = builder1.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.year();
        java.util.Locale locale16 = new java.util.Locale("hi!", "");
        java.lang.String str17 = property13.getAsText(locale16);
        org.joda.time.LocalDateTime localDateTime18 = property13.withMaximumValue();
        java.lang.String str19 = property13.toString();
        org.joda.time.LocalDateTime localDateTime20 = property13.getLocalDateTime();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("days");
        int int23 = property13.getMaximumTextLength(locale22);
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale.Builder builder25 = builder9.setLocale(locale24);
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = builder26.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022" + "'", str17, "2022");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[year]" + "'", str19, "Property[year]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "days");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "days");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "days");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone27);
        int int29 = dateMidnight28.getEra();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property30.getFieldType();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime25.property(dateTimeFieldType33);
        boolean boolean35 = dateMidnight2.isSupported(dateTimeFieldType33);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight2.minusWeeks(14);
        long long38 = dateMidnight2.getMillis();
        org.joda.time.DateMidnight.Property property39 = dateMidnight2.year();
        org.joda.time.DateMidnight dateMidnight41 = property39.addToCopy(53693557);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateMidnight41);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.year();
        java.util.Locale locale6 = new java.util.Locale("hi!", "");
        java.lang.String str7 = property3.getAsText(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        java.lang.String str9 = property3.toString();
        org.joda.time.DurationField durationField10 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.Period period18 = new org.joda.time.Period(53260798000L, chronology14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022" + "'", str7, "2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[year]" + "'", str9, "Property[year]");
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime27);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime24.toGregorianCalendar();
        gregorianCalendar30.setFirstDayOfWeek(53558619);
        gregorianCalendar30.setMinimalDaysInFirstWeek(53233428);
        gregorianCalendar30.set(34, 53453096, 53614730, 887, 53321751);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = gregorianCalendar30.getMinimum(53675741);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53675741");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getFirstDayOfWeek();
        java.util.TimeZone timeZone3 = calendar1.getTimeZone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455420678,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=678,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone55);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, 100L, periodType59, chronology60);
        java.lang.Object obj62 = mutablePeriod61.clone();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(0L, 100L, periodType65, chronology66);
        mutablePeriod61.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod67);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone70);
        org.joda.time.Duration duration72 = mutablePeriod61.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight56.plus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.LocalDate localDate74 = dateMidnight73.toLocalDate();
        org.joda.time.Chronology chronology75 = localDate74.getChronology();
        java.lang.String str76 = chronology75.toString();
        org.joda.time.DateTimeField dateTimeField77 = chronology75.secondOfDay();
        org.joda.time.Interval interval78 = new org.joda.time.Interval(0L, (long) 1, chronology75);
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay(10L);
        long long82 = chronology75.set((org.joda.time.ReadablePartial) yearMonthDay80, (long) 8);
        org.joda.time.DateTimeField dateTimeField83 = chronology75.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology75);
        mutablePeriod84.setDays((-5601628));
        mutablePeriod84.setPeriod(1689628762080000000L, 3600000L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT0.100S" + "'", str48, "PT0.100S");
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "PT0.100S");
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ISOChronology[UTC]" + "'", str76, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 8L + "'", long82 == 8L);
        org.junit.Assert.assertNotNull(dateTimeField83);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone16);
        boolean boolean18 = calendar0.before((java.lang.Object) dateTimeZone16);
        calendar0.clear((int) (byte) 0);
        calendar0.add((int) (byte) 0, (int) (short) 1);
        java.time.Instant instant24 = calendar0.toInstant();
        long long25 = calendar0.getTimeInMillis();
        calendar0.set(14, (int) (byte) 100, (int) ' ');
        int int31 = calendar0.getActualMinimum(0);
        calendar0.clear(5);
        java.util.Date date39 = new java.util.Date((-1), (int) 'x', 35, 0, (int) (byte) 100);
        calendar0.setTime(date39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(0L, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        int int47 = dateMidnight46.getEra();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, 100L, periodType50, chronology51);
        java.lang.Object obj53 = mutablePeriod52.clone();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(0L, 100L, periodType56, chronology57);
        mutablePeriod52.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod58);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone61);
        org.joda.time.Duration duration63 = mutablePeriod52.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight46, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight43, (org.joda.time.ReadableDuration) duration63, periodType65);
        org.joda.time.Period period68 = period66.withMillis(21);
        org.joda.time.PeriodType periodType69 = period68.getPeriodType();
        org.joda.time.Period period71 = period68.withMillis((int) (byte) -1);
        org.joda.time.Period period73 = period71.minusMillis(347);
        boolean boolean74 = calendar0.after((java.lang.Object) period71);
        calendar0.setMinimalDaysInFirstWeek(202971);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-1922048400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=202971,ERA=1,YEAR=1909,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=0,DAY_OF_MONTH=4,DAY_OF_YEAR=35,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=40,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-61725661379291L) + "'", long25 == (-61725661379291L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Feb 04 01:40:00 GMT 1909");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "PT0.100S");
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(5, (int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.plusMillis(21);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeOfDay4.getValue(10196);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10196");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 53297241);
        org.joda.time.Period period3 = org.joda.time.Period.days(1);
        org.joda.time.Period period5 = period3.minusSeconds(65015);
        int int6 = period3.size();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay1.plus((org.joda.time.ReadablePeriod) period3);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(timeOfDay7);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Interval interval7 = interval5.withEndMillis((long) 2);
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology12);
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property17 = dateTime15.property(dateTimeFieldType16);
        boolean boolean18 = dateTime8.isSupported(dateTimeFieldType16);
        int int19 = dateTime8.getYearOfEra();
        org.joda.time.DateTime.Property property20 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime21 = property20.roundFloorCopy();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime15 = localTime13.withMinuteOfHour(47);
        org.joda.time.LocalTime localTime17 = localTime13.plusMillis(25);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.centuries();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMinutes(3);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(0L, 100L, periodType19, chronology20);
        java.lang.Object obj22 = mutablePeriod21.clone();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        mutablePeriod21.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone30);
        org.joda.time.Duration duration32 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight16.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone35);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(0L, 100L, periodType39, chronology40);
        java.lang.Object obj42 = mutablePeriod41.clone();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, 100L, periodType45, chronology46);
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone50);
        org.joda.time.Duration duration52 = mutablePeriod41.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight51);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight36.plus((org.joda.time.ReadableDuration) duration52);
        int int54 = dateMidnight33.compareTo((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight33.plus((long) 8);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight33.withDurationAdded(455830L, 69);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight33.minusYears(53750276);
        int int62 = property13.compareTo((org.joda.time.ReadableInstant) dateMidnight33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "PT0.100S");
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "PT0.100S");
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight59);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property15 = dateTime13.property(dateTimeFieldType14);
        org.joda.time.DateTime.Property property16 = dateTime13.minuteOfDay();
        org.joda.time.DateTime.Property property17 = dateTime13.monthOfYear();
        org.joda.time.DateTime.Property property18 = dateTime13.centuryOfEra();
        org.joda.time.LocalDate localDate19 = dateTime13.toLocalDate();
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.Interval interval21 = localDate19.toInterval();
        int int22 = localDate19.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.monthOfYear();
        org.joda.time.DateMidnight dateMidnight25 = property24.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight26 = property24.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight28 = property24.addToCopy((long) 6);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone30);
        int int32 = dateMidnight31.getEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateMidnight31.toDateTime(chronology33);
        long long35 = dateTime34.getMillis();
        org.joda.time.DateTime dateTime37 = dateTime34.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone39);
        int int41 = dateMidnight40.getEra();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = dateMidnight40.toDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusDays(9);
        int int46 = dateTime43.getEra();
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime47.getZone();
        org.joda.time.DateTime dateTime49 = dateTime34.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime49.withDurationAdded((long) 86399, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight28.withZoneRetainFields(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight55 = localDate19.toDateMidnight(dateTimeZone53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(53736392, 14, 25, 2525, 0, 2006, 866, dateTimeZone53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2525 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 283 + "'", int22 == 283);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateMidnight55);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        mutableDateTime1.setMillisOfSecond((int) (byte) 10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(0L, 100L, periodType7, chronology8);
        java.lang.Object obj10 = mutablePeriod9.clone();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L, 100L, periodType13, chronology14);
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone18);
        org.joda.time.Duration duration20 = mutablePeriod9.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight19);
        mutablePeriod9.addMillis(0);
        mutablePeriod9.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        org.joda.time.Duration duration43 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 100L, periodType49, chronology50);
        java.lang.Object obj52 = mutablePeriod51.clone();
        java.lang.String str53 = mutablePeriod51.toString();
        mutableDateTime46.add((org.joda.time.ReadablePeriod) mutablePeriod51, 2022);
        mutablePeriod9.setPeriod((org.joda.time.ReadableInstant) dateMidnight44, (org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone58);
        int int60 = dateMidnight59.getEra();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateMidnight59.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusDays(9);
        int int65 = dateTime62.getEra();
        org.joda.time.DateTime dateTime66 = dateTime62.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime66.getZone();
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        mutableDateTime46.setZone(dateTimeZone67);
        mutableDateTime1.setZone(dateTimeZone67);
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(locale72);
        java.lang.String str74 = mutableDateTime1.toString("2022", locale72);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((java.lang.Object) "2022");
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime75.toMutableDateTime();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "PT0.100S");
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PT0.100S" + "'", str53, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar73);
        org.junit.Assert.assertEquals(calendar73.toString(), "java.util.GregorianCalendar[time=1645455420824,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=824,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "2022" + "'", str74, "2022");
        org.junit.Assert.assertNotNull(mutableDateTime76);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0L, 100L, periodType6, chronology7);
        java.lang.Object obj9 = mutablePeriod8.clone();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.Duration duration19 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.Period period22 = period20.plusMinutes(22);
        org.joda.time.Period period24 = period22.minusDays(2740);
        int int25 = period22.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "PT0.100S");
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone16);
        boolean boolean18 = calendar0.before((java.lang.Object) dateTimeZone16);
        calendar0.clear((int) (byte) 0);
        calendar0.add((int) (byte) 0, (int) (short) 1);
        java.time.Instant instant24 = calendar0.toInstant();
        long long25 = calendar0.getTimeInMillis();
        calendar0.set(14, (int) (byte) 100, (int) ' ');
        int int31 = calendar0.getActualMinimum(0);
        calendar0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=14,MONTH=100,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=32,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=0,MILLISECOND=883,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-61725661379117L) + "'", long25 == (-61725661379117L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 53255370);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        int int37 = mutablePeriod35.getMinutes();
        org.joda.time.Period period39 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        java.lang.String str41 = durationFieldType40.toString();
        org.joda.time.Period period43 = period39.withField(durationFieldType40, 2);
        boolean boolean44 = mutablePeriod35.isSupported(durationFieldType40);
        long long47 = chronology24.add((org.joda.time.ReadablePeriod) mutablePeriod35, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = chronology24.withZone(dateTimeZone48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 11, chronology49);
        org.joda.time.DurationField durationField51 = chronology49.days();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (-1), (long) (short) 0, chronology49);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone54);
        int int56 = dateMidnight55.getEra();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateMidnight55.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusWeeks(0);
        org.joda.time.Interval interval61 = interval52.withStart((org.joda.time.ReadableInstant) dateTime58);
        long long62 = interval52.getEndMillis();
        org.joda.time.Period period63 = interval52.toPeriod();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hours" + "'", str41, "hours");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53230963L + "'", long47 == 53230963L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        java.lang.String str5 = yearMonthDay4.toString();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withYear(10);
        int int8 = yearMonthDay7.getDayOfMonth();
        org.joda.time.LocalDate localDate9 = yearMonthDay7.toLocalDate();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(10, 100, 10, (int) (short) 100, 4, 53230763, (int) ' ', (int) (short) 10);
        org.joda.time.Period period20 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        java.lang.String str22 = durationFieldType21.toString();
        org.joda.time.Period period24 = period20.withField(durationFieldType21, 2);
        mutablePeriod18.add(durationFieldType21, 32769);
        mutablePeriod18.addWeeks(86399);
        org.joda.time.LocalDate localDate29 = localDate9.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Period period31 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.hours();
        java.lang.String str33 = durationFieldType32.toString();
        org.joda.time.Period period35 = period31.withField(durationFieldType32, 2);
        org.joda.time.Period period37 = period35.minusMinutes(21);
        org.joda.time.Days days38 = period35.toStandardDays();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.halfdays();
        int int40 = period35.get(durationFieldType39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone42);
        int int44 = dateMidnight43.getEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateMidnight43.toDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusWeeks(0);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone51);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(0L, 100L, periodType55, chronology56);
        java.lang.Object obj58 = mutablePeriod57.clone();
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(0L, 100L, periodType61, chronology62);
        mutablePeriod57.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone66);
        org.joda.time.Duration duration68 = mutablePeriod57.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight67);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight52.plus((org.joda.time.ReadableDuration) duration68);
        org.joda.time.LocalDate localDate70 = dateMidnight69.toLocalDate();
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        java.lang.String str72 = chronology71.toString();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.minuteOfHour();
        java.lang.String str75 = dateTimeField73.getAsText((long) (short) 100);
        int int77 = dateTimeField73.getMinimumValue((long) (byte) -1);
        boolean boolean78 = dateTimeField73.isSupported();
        boolean boolean79 = dateTime48.equals((java.lang.Object) dateTimeField73);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period35, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Period period81 = interval80.toPeriod();
        org.joda.time.Interval interval82 = interval80.toInterval();
        boolean boolean84 = interval82.isBefore((long) 113);
        mutablePeriod18.add((org.joda.time.ReadableInterval) interval82);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0035-10-10" + "'", str5, "0035-10-10");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hours" + "'", str22, "hours");
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hours" + "'", str33, "hours");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "PT0.100S");
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ISOChronology[UTC]" + "'", str72, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0" + "'", str75, "0");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        java.lang.String str22 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone40);
        org.joda.time.Duration duration42 = mutablePeriod31.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight26.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.LocalDate localDate44 = dateMidnight43.toLocalDate();
        org.joda.time.Period period46 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.hours();
        java.lang.String str48 = durationFieldType47.toString();
        org.joda.time.Period period50 = period46.withField(durationFieldType47, 2);
        org.joda.time.Period period52 = period50.withMillis((int) '#');
        org.joda.time.LocalDate localDate53 = localDate44.minus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.LocalDate localDate55 = localDate53.minusYears(11);
        int int56 = localDate53.getYearOfEra();
        int int57 = dateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) localDate53);
        long long60 = dateTimeField23.set((-1L), 22);
        org.joda.time.DurationField durationField61 = dateTimeField23.getRangeDurationField();
        long long64 = durationField61.subtract((long) 10, 1959);
        long long67 = durationField61.getValueAsLong(1645455127298L, (-493803162694459L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "PT0.100S");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hours" + "'", str48, "hours");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1970 + "'", int56 == 1970);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-86377001L) + "'", long60 == (-86377001L));
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-169257599990L) + "'", long64 == (-169257599990L));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 19044L + "'", long67 == 19044L);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("120");
        java.util.Locale.Builder builder7 = builder5.setRegion("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setVariant("eras");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: eras [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.toString();
        org.joda.time.LocalDateTime localDateTime9 = property2.getLocalDateTime();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("days");
        int int12 = property2.getMaximumTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks(42);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfCentury();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[year]" + "'", str8, "Property[year]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "days");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        java.lang.String str5 = yearMonthDay4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay4.toDateMidnight(dateTimeZone6);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) yearMonthDay4, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0035-10-10" + "'", str5, "0035-10-10");
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMillisOfDay(3);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.year();
        org.joda.time.LocalDateTime localDateTime12 = property10.setCopy((int) (byte) -1);
        int int13 = localDateTime12.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(53323082);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusYears(53576961);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.minusWeeks((int) ' ');
        java.util.GregorianCalendar gregorianCalendar15 = dateMidnight14.toGregorianCalendar();
        gregorianCalendar15.setFirstDayOfWeek(53243063);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime11 = dateTime7.withFieldAdded(durationFieldType9, 5);
        org.joda.time.TimeOfDay timeOfDay12 = dateTime7.toTimeOfDay();
        int int13 = timeOfDay12.getMinuteOfHour();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        mutablePeriod18.setMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        int int24 = dateMidnight23.getEra();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone38);
        org.joda.time.Duration duration40 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, (org.joda.time.ReadableDuration) duration40);
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration40);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay12.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Chronology chronology44 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay.Property property45 = timeOfDay12.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay12.minusSeconds(53315843);
        java.lang.String str48 = timeOfDay47.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0.100S");
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "T22:02:37.000" + "'", str48, "T22:02:37.000");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) 3);
        mutableDateTime4.setDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.year();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone9);
        int int11 = dateMidnight10.getEra();
        org.joda.time.DateMidnight.Property property12 = dateMidnight10.monthOfYear();
        org.joda.time.DateMidnight dateMidnight14 = property12.addToCopy((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(9);
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight14.withZoneRetainFields(dateTimeZone26);
        mutableDateTime4.setZoneRetainFields(dateTimeZone26);
        mutableDateTime4.setWeekyear(41);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime4.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setHourOfDay(456);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 456 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Period period22 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        java.lang.String str24 = durationFieldType23.toString();
        org.joda.time.Period period26 = period22.withField(durationFieldType23, 2);
        org.joda.time.Period period28 = period26.withMillis((int) '#');
        org.joda.time.LocalDate localDate29 = localDate20.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = localDate29.minusYears(11);
        org.joda.time.LocalDate localDate33 = localDate29.withDayOfMonth(13);
        org.joda.time.LocalDate.Property property34 = localDate29.weekOfWeekyear();
        org.joda.time.LocalDate localDate35 = property34.roundCeilingCopy();
        org.joda.time.LocalDate localDate36 = property34.withMinimumValue();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hours" + "'", str24, "hours");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime.Property property13 = localTime9.millisOfDay();
        org.joda.time.LocalTime localTime14 = property13.withMaximumValue();
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime16.withFieldAdded(durationFieldType17, 53299420);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay11 = property8.withMaximumValue();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        long long15 = durationField12.getMillis((int) '#', (-61725661650820L));
        org.joda.time.DurationFieldType durationFieldType16 = durationField12.getType();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2100000L + "'", long15 == 2100000L);
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((long) 86399);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusDays(25);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.DateMidnight.Property property15 = dateMidnight13.monthOfYear();
        org.joda.time.DateMidnight dateMidnight17 = property15.addToCopy((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone20);
        int int22 = dateMidnight21.getEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateMidnight21.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusDays(9);
        int int27 = dateTime24.getEra();
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight17.withZoneRetainFields(dateTimeZone29);
        boolean boolean32 = dateMidnight17.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone33 = dateMidnight17.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        boolean boolean36 = dateTimeZone33.isStandardOffset(125237318400100L);
        org.joda.time.DateTime dateTime37 = localDateTime8.toDateTime(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.withYearOfCentury(53688664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53688664 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        org.joda.time.Period period1 = org.joda.time.Period.years(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) 3);
        mutableDateTime13.setDayOfMonth((int) (byte) 10);
        mutableDateTime13.add((long) 6);
        mutableDateTime13.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.monthOfYear();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) dateMidnight20);
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property8.getFieldType();
        org.joda.time.TimeOfDay timeOfDay26 = property8.addWrapFieldToCopy(53250029);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone28);
        int int30 = dateMidnight29.getEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateMidnight29.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusWeeks(0);
        org.joda.time.DateTime dateTime35 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime36 = dateTime34.toLocalTime();
        org.joda.time.LocalTime localTime38 = localTime36.minusMinutes(3);
        org.joda.time.LocalTime.Property property39 = localTime36.minuteOfHour();
        org.joda.time.LocalTime localTime40 = property39.withMinimumValue();
        int int41 = property39.get();
        org.joda.time.LocalTime localTime42 = property39.roundHalfCeilingCopy();
        int int43 = timeOfDay26.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.LocalTime localTime44 = timeOfDay26.toLocalTime();
        int int45 = localTime44.getMinuteOfHour();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 29 + "'", int45 == 29);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate22 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate23 = property21.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone40);
        org.joda.time.Duration duration42 = mutablePeriod31.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight26.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.LocalDate localDate44 = dateMidnight43.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = localDate44.toInterval(dateTimeZone45);
        java.lang.String str47 = interval46.toString();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology51);
        org.joda.time.Interval interval53 = yearMonthDay52.toInterval();
        org.joda.time.Period period54 = interval53.toPeriod();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology58);
        org.joda.time.Interval interval60 = yearMonthDay59.toInterval();
        org.joda.time.Period period61 = interval60.toPeriod();
        long long62 = interval60.getStartMillis();
        org.joda.time.Interval interval63 = interval53.overlap((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology67);
        org.joda.time.Interval interval69 = yearMonthDay68.toInterval();
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.Interval interval71 = interval69.withPeriodBeforeEnd(readablePeriod70);
        boolean boolean72 = interval53.overlaps((org.joda.time.ReadableInterval) interval71);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology76);
        org.joda.time.Interval interval78 = yearMonthDay77.toInterval();
        org.joda.time.Period period79 = interval78.toPeriod();
        boolean boolean81 = interval78.isAfter(100L);
        boolean boolean82 = interval71.isAfter((org.joda.time.ReadableInterval) interval78);
        boolean boolean83 = interval46.isBefore((org.joda.time.ReadableInterval) interval78);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(0L, 100L, periodType86, chronology87);
        mutablePeriod88.setMillis((-1));
        mutablePeriod88.setDays(10);
        org.joda.time.Interval interval93 = interval78.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod88);
        org.joda.time.MutablePeriod mutablePeriod94 = mutablePeriod88.copy();
        org.joda.time.LocalDate localDate95 = localDate23.plus((org.joda.time.ReadablePeriod) mutablePeriod94);
        int int96 = localDate95.getYearOfCentury();
        org.joda.time.LocalDate localDate98 = localDate95.plusMonths(53443776);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "PT0.100S");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z" + "'", str47, "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-61038316800000L) + "'", long62 == (-61038316800000L));
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(interval93);
        org.junit.Assert.assertNotNull(mutablePeriod94);
        org.junit.Assert.assertNotNull(localDate95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 70 + "'", int96 == 70);
        org.junit.Assert.assertNotNull(localDate98);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 100L, periodType10, chronology11);
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.Duration duration23 = mutablePeriod12.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight7.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.LocalDate localDate25 = dateMidnight24.toLocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        int int39 = mutablePeriod37.getMinutes();
        org.joda.time.Period period41 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        java.lang.String str43 = durationFieldType42.toString();
        org.joda.time.Period period45 = period41.withField(durationFieldType42, 2);
        boolean boolean46 = mutablePeriod37.isSupported(durationFieldType42);
        long long49 = chronology26.add((org.joda.time.ReadablePeriod) mutablePeriod37, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.Chronology chronology51 = chronology26.withZone(dateTimeZone50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 11, chronology51);
        org.joda.time.DurationField durationField53 = chronology51.days();
        org.joda.time.Interval interval54 = new org.joda.time.Interval((long) (-1), (long) (short) 0, chronology51);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology58);
        org.joda.time.Interval interval60 = yearMonthDay59.toInterval();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.Interval interval62 = interval60.withPeriodBeforeEnd(readablePeriod61);
        boolean boolean63 = interval54.contains((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology67);
        int int69 = yearMonthDay68.size();
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(0L, 100L, periodType72, chronology73);
        java.lang.Object obj75 = mutablePeriod74.clone();
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(0L, 100L, periodType78, chronology79);
        mutablePeriod74.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod80);
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay68.plus((org.joda.time.ReadablePeriod) mutablePeriod80);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone86);
        int int88 = dateMidnight87.getEra();
        org.joda.time.Chronology chronology89 = dateMidnight87.getChronology();
        mutablePeriod80.setPeriod((long) (byte) 100, (long) (byte) -1, chronology89);
        org.joda.time.DurationField durationField91 = chronology89.seconds();
        org.joda.time.Interval interval92 = interval54.withChronology(chronology89);
        org.joda.time.DateTimeField dateTimeField93 = chronology89.weekyear();
        org.joda.time.Interval interval94 = new org.joda.time.Interval((-22463999900L), (long) 53363525, chronology89);
        org.joda.time.DurationField durationField95 = chronology89.millis();
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.100S");
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hours" + "'", str43, "hours");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 53230963L + "'", long49 == 53230963L);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertEquals(obj75.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj75), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj75), "PT0.100S");
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertNotNull(durationField91);
        org.junit.Assert.assertNotNull(interval92);
        org.junit.Assert.assertNotNull(dateTimeField93);
        org.junit.Assert.assertNotNull(durationField95);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        int int8 = dateTime5.getYearOfCentury();
        org.joda.time.LocalDate localDate9 = dateTime5.toLocalDate();
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusWeeks(1);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.withMillis((-61725661717443L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime10 = dateTime7.withDayOfYear(22);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        int int17 = dateMidnight16.getEra();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(0L, 100L, periodType20, chronology21);
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        mutablePeriod22.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone31);
        org.joda.time.Duration duration33 = mutablePeriod22.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight13, (org.joda.time.ReadableDuration) duration33, periodType35);
        java.lang.String str37 = duration33.toString();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime40 = dateTime10.minusMonths(31);
        org.joda.time.DateTime.Property property41 = dateTime40.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "PT0.100S");
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0.100S" + "'", str37, "PT0.100S");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.set("0");
        mutableDateTime5.setYear(53533600);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        int int9 = property8.get();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        mutablePeriod14.addMillis(0);
        mutablePeriod14.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        java.lang.Object obj38 = mutablePeriod37.clone();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone46);
        org.joda.time.Duration duration48 = mutablePeriod37.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight32.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(0L, 100L, periodType54, chronology55);
        java.lang.Object obj57 = mutablePeriod56.clone();
        java.lang.String str58 = mutablePeriod56.toString();
        mutableDateTime51.add((org.joda.time.ReadablePeriod) mutablePeriod56, 2022);
        mutablePeriod14.setPeriod((org.joda.time.ReadableInstant) dateMidnight49, (org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime51.addWeekyears((int) (byte) 0);
        mutableDateTime51.setSecondOfMinute(8);
        int int66 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.TimeOfDay timeOfDay67 = property8.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay68 = property8.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property8.getFieldType();
        org.joda.time.TimeOfDay timeOfDay70 = property8.withMaximumValue();
        java.util.Locale locale71 = null;
        java.lang.String str72 = property8.getAsText(locale71);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "PT0.100S");
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.100S" + "'", str58, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "0" + "'", str72, "0");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateMidnight11.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(9);
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime5.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withDayOfMonth(21);
        boolean boolean23 = dateTime20.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime20.toYearMonthDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(yearMonthDay24);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime5 = property2.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = property2.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = property2.addWrapField(196);
        org.joda.time.MutableDateTime mutableDateTime10 = property2.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 3);
        mutableDateTime15.setDayOfMonth((int) (byte) 10);
        mutableDateTime15.add((long) 6);
        mutableDateTime15.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.monthOfYear();
        mutableDateTime15.setTime((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        org.joda.time.Duration duration43 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDate localDate45 = dateMidnight44.toLocalDate();
        org.joda.time.Period period47 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        java.lang.String str49 = durationFieldType48.toString();
        org.joda.time.Period period51 = period47.withField(durationFieldType48, 2);
        org.joda.time.Period period53 = period51.withMillis((int) '#');
        org.joda.time.LocalDate localDate54 = localDate45.minus((org.joda.time.ReadablePeriod) period53);
        int int55 = period53.getMonths();
        org.joda.time.Period period57 = period53.minusMinutes(8);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadablePeriod) period53);
        org.joda.time.Interval interval59 = interval58.toInterval();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(0L, 100L, periodType62, chronology63);
        mutablePeriod64.setMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone68);
        int int70 = dateMidnight69.getEra();
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(0L, 100L, periodType73, chronology74);
        java.lang.Object obj76 = mutablePeriod75.clone();
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(0L, 100L, periodType79, chronology80);
        mutablePeriod75.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone84);
        org.joda.time.Duration duration86 = mutablePeriod75.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight85);
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight69, (org.joda.time.ReadableDuration) duration86);
        mutablePeriod64.add((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Interval interval89 = interval58.withDurationAfterStart((org.joda.time.ReadableDuration) duration86);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration86, 1959);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setDayOfMonth(37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "PT0.100S");
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hours" + "'", str49, "hours");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "PT0.100S");
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(interval89);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.Duration duration24 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(0L, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone29);
        int int31 = dateMidnight30.getEra();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        java.lang.Object obj37 = mutablePeriod36.clone();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        org.joda.time.Duration duration47 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight30, (org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight27, (org.joda.time.ReadableDuration) duration47, periodType49);
        boolean boolean51 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateMidnight.Property property53 = dateMidnight52.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight54 = property53.roundFloorCopy();
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.DateMidnight.Property property56 = dateMidnight54.era();
        org.joda.time.DateMidnight.Property property57 = dateMidnight54.monthOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT0.100S");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "PT0.100S");
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1969 + "'", int55 == 1969);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime15 = property12.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime17 = property12.addCopy(889);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        int int34 = mutablePeriod32.getMinutes();
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        java.lang.String str38 = durationFieldType37.toString();
        org.joda.time.Period period40 = period36.withField(durationFieldType37, 2);
        boolean boolean41 = mutablePeriod32.isSupported(durationFieldType37);
        long long44 = chronology21.add((org.joda.time.ReadablePeriod) mutablePeriod32, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Chronology chronology46 = chronology21.withZone(dateTimeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DurationField durationField48 = chronology46.halfdays();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.add((long) 53361675);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime55 = property51.set("1970-04-16");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-04-16\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hours" + "'", str38, "hours");
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 53230963L + "'", long44 == 53230963L);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate22 = property21.roundFloorCopy();
        java.lang.String str23 = property21.getAsText();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("en-GB");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        int int40 = dateMidnight19.compareTo((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight19.plus((long) 8);
        org.joda.time.DateMidnight.Property property43 = dateMidnight42.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight44 = property43.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight45 = property43.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.plusWeeks(53347509);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(dateMidnight47);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(53243063, 21, 32769);
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar.Builder builder6 = builder4.setLocale(locale5);
        java.util.Calendar.Builder builder8 = builder4.setLenient(true);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Calendar.Builder builder12 = builder8.setLocale(locale9);
        java.util.Calendar calendar13 = builder8.build();
        long long14 = calendar13.getTimeInMillis();
        calendar13.setTimeInMillis(0L);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1680129502588800000L + "'", long14 == 1680129502588800000L);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusSeconds(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.year();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfDay(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfDay(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        int int24 = localDateTime19.indexOf(dateTimeFieldType22);
        boolean boolean25 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.plusMillis(32770);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime19);
        java.lang.String str29 = localDateTime3.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2021-12-13T14:57:01.426" + "'", str29, "2021-12-13T14:57:01.426");
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone16);
        boolean boolean18 = calendar0.before((java.lang.Object) dateTimeZone16);
        calendar0.clear((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        java.lang.String str29 = mutablePeriod27.toString();
        mutableDateTime22.add((org.joda.time.ReadablePeriod) mutablePeriod27, 2022);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone34);
        int int36 = dateMidnight35.getEra();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = dateMidnight35.toDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusDays(9);
        int int41 = dateTime38.getEra();
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        long long46 = dateTimeZone43.adjustOffset((long) 5, true);
        mutableDateTime22.setZoneRetainFields(dateTimeZone43);
        java.util.TimeZone timeZone48 = dateTimeZone43.toTimeZone();
        boolean boolean49 = timeZone48.observesDaylightTime();
        timeZone48.setID("");
        java.util.TimeZone.setDefault(timeZone48);
        calendar0.setTimeZone(timeZone48);
        boolean boolean55 = calendar0.before((java.lang.Object) 2023);
        calendar0.clear(10);
        calendar0.clear();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0.100S" + "'", str29, "PT0.100S");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5L + "'", long46 == 5L);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateMidnight2.toLocalDate();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.plusDays((int) (byte) 100);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight8 = property6.addWrapFieldToCopy(53329);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plusYears(53390189);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.weekyear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) 3);
        mutableDateTime4.setDayOfMonth((int) (byte) 10);
        mutableDateTime4.add((long) 6);
        mutableDateTime4.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.monthOfYear();
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(0L, 100L, periodType19, chronology20);
        java.lang.Object obj22 = mutablePeriod21.clone();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        mutablePeriod21.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone30);
        org.joda.time.Duration duration32 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight16.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDate localDate34 = dateMidnight33.toLocalDate();
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        java.lang.String str38 = durationFieldType37.toString();
        org.joda.time.Period period40 = period36.withField(durationFieldType37, 2);
        org.joda.time.Period period42 = period40.withMillis((int) '#');
        org.joda.time.LocalDate localDate43 = localDate34.minus((org.joda.time.ReadablePeriod) period42);
        int int44 = period42.getMonths();
        org.joda.time.Period period46 = period42.minusMinutes(8);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadablePeriod) period42);
        long long48 = interval47.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval49 = interval47.toMutableInterval();
        org.joda.time.Period period58 = new org.joda.time.Period(887, 1970, 59, (int) (byte) 1, 713, 32772, 53329, 455376);
        org.joda.time.Interval interval59 = interval47.withPeriodAfterStart((org.joda.time.ReadablePeriod) period58);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime64 = property62.roundFloor();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology68);
        org.joda.time.DateMidnight dateMidnight70 = yearMonthDay69.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight70.withDurationAdded((long) (byte) 10, 12);
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime64, (org.joda.time.ReadableInstant) dateMidnight70, periodType74);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone77);
        int int79 = dateMidnight78.getEra();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTime dateTime81 = dateMidnight78.toDateTime(chronology80);
        org.joda.time.DateTime dateTime83 = dateTime81.plusDays(9);
        int int84 = dateTime81.getEra();
        org.joda.time.DateTime dateTime85 = dateTime81.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime85.getZone();
        long long89 = dateTimeZone86.adjustOffset((long) 5, true);
        boolean boolean91 = dateTimeZone86.isStandardOffset((long) 3);
        mutableDateTime64.setZoneRetainFields(dateTimeZone86);
        mutableDateTime64.setTime(0L);
        mutableDateTime64.addDays(4);
        boolean boolean97 = interval47.isAfter((org.joda.time.ReadableInstant) mutableDateTime64);
        boolean boolean99 = mutableDateTime64.isAfter(4610206627200000L);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "PT0.100S");
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hours" + "'", str38, "hours");
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 7200035L + "'", long48 == 7200035L);
        org.junit.Assert.assertNotNull(mutableInterval49);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateMidnight70);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 5L + "'", long89 == 5L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(11, 68, 53297241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 68 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.addWrapField((int) (short) 0);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, 100L, periodType37, chronology38);
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        int int41 = mutablePeriod39.getMinutes();
        org.joda.time.Period period43 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        java.lang.String str45 = durationFieldType44.toString();
        org.joda.time.Period period47 = period43.withField(durationFieldType44, 2);
        boolean boolean48 = mutablePeriod39.isSupported(durationFieldType44);
        long long51 = chronology28.add((org.joda.time.ReadablePeriod) mutablePeriod39, (long) 53230763, 2);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 11, chronology28);
        org.joda.time.DateTimeField dateTimeField53 = chronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = chronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField55 = chronology28.minuteOfDay();
        mutableDateTime4.setChronology(chronology28);
        mutableDateTime4.setMillisOfDay(75328413);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "PT0.100S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hours" + "'", str45, "hours");
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 53230963L + "'", long51 == 53230963L);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(5966870400000L, (long) 218);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = property8.getTimeOfDay();
        int[] intArray10 = timeOfDay9.getValues();
        int int11 = timeOfDay9.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        int int15 = dateMidnight14.getEra();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.Period period18 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.hours();
        java.lang.String str20 = durationFieldType19.toString();
        org.joda.time.Period period22 = period18.withField(durationFieldType19, 2);
        org.joda.time.Period period27 = new org.joda.time.Period(12, 2, (int) ' ', (int) (short) 10);
        org.joda.time.Period period29 = period27.plusDays(1970);
        org.joda.time.Period period30 = period22.minus((org.joda.time.ReadablePeriod) period27);
        int[] intArray32 = chronology16.get((org.joda.time.ReadablePeriod) period30, (long) 7);
        org.joda.time.Period period34 = period30.minusMonths(31);
        org.joda.time.Period period36 = period34.withSeconds(36);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay9.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.year();
        java.util.Locale locale43 = new java.util.Locale("hi!", "");
        java.lang.String str44 = property40.getAsText(locale43);
        org.joda.time.LocalDateTime localDateTime45 = property40.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withYear((-1));
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.centuryOfEra();
        int int49 = localDateTime47.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.plusYears(1970);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = timeOfDay9.compareTo((org.joda.time.ReadablePartial) localDateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[23, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hours" + "'", str20, "hours");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 7]");
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2022" + "'", str44, "2022");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        int int6 = timeOfDay2.size();
        org.joda.time.DateTime dateTime7 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(21);
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 5);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property13.setCopy(47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy(120052);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime4.getValue(86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        int int37 = mutablePeriod35.getMinutes();
        org.joda.time.Period period39 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        java.lang.String str41 = durationFieldType40.toString();
        org.joda.time.Period period43 = period39.withField(durationFieldType40, 2);
        boolean boolean44 = mutablePeriod35.isSupported(durationFieldType40);
        long long47 = chronology24.add((org.joda.time.ReadablePeriod) mutablePeriod35, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = chronology24.withZone(dateTimeZone48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 11, chronology49);
        org.joda.time.DurationField durationField51 = chronology49.days();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (-1), (long) (short) 0, chronology49);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone54);
        int int56 = dateMidnight55.getEra();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateMidnight55.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusWeeks(0);
        org.joda.time.Interval interval61 = interval52.withStart((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology62 = interval52.getChronology();
        java.lang.String str63 = interval52.toString();
        java.lang.String str64 = interval52.toString();
        org.joda.time.Interval interval66 = interval52.withEndMillis((long) 520);
        long long67 = interval66.getStartMillis();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(0L, 100L, periodType70, chronology71);
        java.lang.Object obj73 = mutablePeriod72.clone();
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(0L, 100L, periodType76, chronology77);
        mutablePeriod72.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone81);
        org.joda.time.Duration duration83 = mutablePeriod72.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight82);
        org.joda.time.DateMidnight dateMidnight85 = dateMidnight82.minusYears((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight85.plusMonths(887);
        org.joda.time.Period period89 = org.joda.time.Period.weeks((int) ' ');
        org.joda.time.Interval interval90 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight85, (org.joda.time.ReadablePeriod) period89);
        boolean boolean91 = interval66.isAfter((org.joda.time.ReadableInterval) interval90);
        org.joda.time.Chronology chronology92 = interval66.getChronology();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hours" + "'", str41, "hours");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53230963L + "'", long47 == 53230963L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.000Z" + "'", str63, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.000Z" + "'", str64, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "PT0.100S");
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(dateMidnight85);
        org.junit.Assert.assertNotNull(dateMidnight87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(chronology92);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        mutableDateTime41.addWeekyears((int) (byte) 0);
        mutableDateTime41.setSecondOfMinute(8);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone57);
        int int59 = dateMidnight58.getEra();
        org.joda.time.DateMidnight.Property property60 = dateMidnight58.monthOfYear();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType62 = periodType61.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime41, (org.joda.time.ReadableInstant) dateMidnight58, periodType61);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(0L, 100L, periodType66, chronology67);
        mutablePeriod68.setMillis((-1));
        mutablePeriod68.setDays(10);
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod68);
        int int74 = mutableDateTime41.getMonthOfYear();
        int int75 = mutableDateTime41.getSecondOfDay();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "P52YT3M22.200S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "P52YT3M22.200S");
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT0.100S" + "'", str48, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 188 + "'", int75 == 188);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17);
        java.util.Set<java.lang.String> strSet19 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.io.IOException iOException32 = new java.io.IOException("PT0.100S");
        java.io.IOException iOException34 = new java.io.IOException("PT0.100S");
        java.lang.Exception[] exceptionArray35 = new java.lang.Exception[] { iOException32, iOException34 };
        java.lang.Exception[] exceptionArray36 = strSet30.toArray(exceptionArray35);
        strSet30.clear();
        strSet30.clear();
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strSet30);
        boolean boolean40 = strSet30.isEmpty();
        boolean boolean41 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet30);
        java.util.Iterator<java.lang.String> strItor42 = strSet30.iterator();
        int int43 = strSet30.size();
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet30);
        java.util.stream.Stream<java.lang.String> strStream45 = strSet30.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(exceptionArray35);
        org.junit.Assert.assertNotNull(exceptionArray36);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strStream45);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusYears(6);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        int int37 = mutablePeriod35.getMinutes();
        org.joda.time.Period period39 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        java.lang.String str41 = durationFieldType40.toString();
        org.joda.time.Period period43 = period39.withField(durationFieldType40, 2);
        boolean boolean44 = mutablePeriod35.isSupported(durationFieldType40);
        long long47 = chronology24.add((org.joda.time.ReadablePeriod) mutablePeriod35, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = chronology24.withZone(dateTimeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.DurationField durationField51 = chronology49.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.secondOfMinute();
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay0.withChronologyRetainFields(chronology49);
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.now(chronology49);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateTimeField dateTimeField56 = chronology49.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone59);
        int int61 = dateMidnight60.getEra();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = dateMidnight60.toDateTime(chronology62);
        long long64 = dateTime63.getMillis();
        org.joda.time.DateTime dateTime66 = dateTime63.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone68);
        int int70 = dateMidnight69.getEra();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = dateMidnight69.toDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusDays(9);
        int int75 = dateTime72.getEra();
        org.joda.time.DateTime dateTime76 = dateTime72.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.DateTime dateTime78 = dateTime63.withZoneRetainFields(dateTimeZone77);
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate((long) 11, dateTimeZone77);
        org.joda.time.LocalDate localDate81 = localDate79.withDayOfYear(15);
        org.joda.time.LocalDate localDate83 = localDate79.withDayOfYear(10);
        org.joda.time.LocalDate localDate85 = localDate83.minusMonths(53304562);
        java.lang.Object obj87 = null;
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime(obj87);
        int[] intArray89 = localTime88.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray91 = dateTimeField56.addWrapPartial((org.joda.time.ReadablePartial) localDate85, 520, intArray89, (-2022));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 520");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hours" + "'", str41, "hours");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53230963L + "'", long47 == 53230963L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(localDate81);
        org.junit.Assert.assertNotNull(localDate83);
        org.junit.Assert.assertNotNull(localDate85);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[14, 57, 1, 671]");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(188, 53688664, 896, 609, 1972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 609 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay.Property property1 = yearMonthDay0.year();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        int int6 = dateMidnight5.getEra();
        int int7 = dateMidnight5.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.withField(dateTimeFieldType8, 3);
        org.joda.time.DateTime dateTime12 = dateTime2.withField(dateTimeFieldType8, 25);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType16 = periodType15.withMillisRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((long) 10, (long) '#', periodType16);
        org.joda.time.PeriodType periodType18 = periodType16.withSecondsRemoved();
        org.joda.time.Period period20 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        java.lang.String str22 = durationFieldType21.toString();
        org.joda.time.Period period24 = period20.withField(durationFieldType21, 2);
        boolean boolean25 = periodType16.isSupported(durationFieldType21);
        org.joda.time.PeriodType periodType26 = periodType16.withHoursRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getRangeDurationType();
        boolean boolean29 = periodType26.isSupported(durationFieldType28);
        org.joda.time.DateTime dateTime31 = dateTime12.withFieldAdded(durationFieldType28, 53322289);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = dateTime12.withSecondOfMinute(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hours" + "'", str22, "hours");
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 53230763, dateTimeZone1);
        int int3 = localDateTime2.size();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMonths(0);
        org.joda.time.Period period7 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        java.lang.String str9 = durationFieldType8.toString();
        org.joda.time.Period period11 = period7.withField(durationFieldType8, 2);
        org.joda.time.Period period13 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        java.lang.String str15 = durationFieldType14.toString();
        org.joda.time.Period period17 = period13.withField(durationFieldType14, 2);
        org.joda.time.Period period18 = period11.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime2.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period21 = period11.plusYears(179);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hours" + "'", str9, "hours");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hours" + "'", str15, "hours");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("java.io.IOException: PT0.100S");
        int int11 = property8.getMaximumShortTextLength(locale10);
        org.joda.time.TimeOfDay timeOfDay13 = property8.addWrapFieldToCopy(45);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.plusMinutes(0);
        int int16 = timeOfDay15.getMinuteOfHour();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 121);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(3);
        org.joda.time.TimeOfDay timeOfDay11 = property8.withMaximumValue();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay13 = property8.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField14 = property8.getField();
        java.lang.String str15 = dateTimeField14.getName();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(9);
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        java.util.Date date30 = new java.util.Date((long) 0);
        int int31 = date30.getDay();
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromDateFields(date30);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone35);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(0L, 100L, periodType39, chronology40);
        java.lang.Object obj42 = mutablePeriod41.clone();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, 100L, periodType45, chronology46);
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone50);
        org.joda.time.Duration duration52 = mutablePeriod41.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight51);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight36.plus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.LocalDate localDate54 = dateMidnight53.toLocalDate();
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(0L, 100L, periodType58, chronology59);
        java.lang.Object obj61 = mutablePeriod60.clone();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(0L, 100L, periodType64, chronology65);
        mutablePeriod60.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod66);
        int int68 = mutablePeriod66.getMinutes();
        org.joda.time.Period period70 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType71 = org.joda.time.DurationFieldType.hours();
        java.lang.String str72 = durationFieldType71.toString();
        org.joda.time.Period period74 = period70.withField(durationFieldType71, 2);
        boolean boolean75 = mutablePeriod66.isSupported(durationFieldType71);
        long long78 = chronology55.add((org.joda.time.ReadablePeriod) mutablePeriod66, (long) 53230763, 2);
        boolean boolean79 = durationFieldType33.isSupported(chronology55);
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay32.withChronologyRetainFields(chronology55);
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay80.minusYears(53233428);
        org.joda.time.YearMonthDay.Property property83 = yearMonthDay80.year();
        org.joda.time.YearMonthDay yearMonthDay85 = property83.setCopy(21);
        int int86 = property83.get();
        org.joda.time.YearMonthDay yearMonthDay87 = property83.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight88 = yearMonthDay87.toDateMidnight();
        int[] intArray89 = yearMonthDay87.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray91 = dateTimeField14.set((org.joda.time.ReadablePartial) localDateTime27, 53532665, intArray89, 2043);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2043 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondOfMinute" + "'", str15, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "PT0.100S");
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hours" + "'", str72, "hours");
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 53230963L + "'", long78 == 53230963L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(yearMonthDay80);
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(yearMonthDay85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1970 + "'", int86 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay87);
        org.junit.Assert.assertNotNull(dateMidnight88);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[292278993, 1, 1]");
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        int int4 = dateMidnight3.getEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateMidnight3.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks(0);
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime10 = dateTime8.toLocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.minusMinutes(3);
        org.joda.time.LocalTime localTime14 = localTime10.minusMillis((-1));
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        org.joda.time.LocalTime localTime17 = localTime14.minusMinutes(2022);
        org.joda.time.Chronology chronology18 = localTime14.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 2000, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime44 = property42.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime45 = property42.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone47);
        int int49 = dateMidnight48.getEra();
        org.joda.time.DateMidnight.Property property50 = dateMidnight48.monthOfYear();
        org.joda.time.DateMidnight dateMidnight52 = property50.addToCopy((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property50.getFieldType();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime45.property(dateTimeFieldType53);
        boolean boolean55 = dateMidnight22.isSupported(dateTimeFieldType53);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight22.minusWeeks(14);
        long long58 = dateMidnight22.getMillis();
        boolean boolean59 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateMidnight22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight61 = dateMidnight22.withYearOfCentury(17999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        int int5 = yearMonthDay4.getDayOfMonth();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay4.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod7, 53230763);
        mutablePeriod7.setMinutes(0);
        int int12 = mutablePeriod7.getYears();
        java.lang.Object obj13 = mutablePeriod7.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        org.joda.time.Period period3 = period1.withSeconds(15);
        int int4 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0L, 100L, periodType6, chronology7);
        java.lang.Object obj9 = mutablePeriod8.clone();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.Duration duration19 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight3.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.LocalDate localDate21 = dateMidnight20.toLocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        int int35 = mutablePeriod33.getMinutes();
        org.joda.time.Period period37 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.hours();
        java.lang.String str39 = durationFieldType38.toString();
        org.joda.time.Period period41 = period37.withField(durationFieldType38, 2);
        boolean boolean42 = mutablePeriod33.isSupported(durationFieldType38);
        long long45 = chronology22.add((org.joda.time.ReadablePeriod) mutablePeriod33, (long) 53230763, 2);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 11, chronology22);
        org.joda.time.LocalDate.Property property47 = localDate46.dayOfMonth();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, 100L, periodType50, chronology51);
        java.lang.Object obj53 = mutablePeriod52.clone();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(0L, 100L, periodType56, chronology57);
        mutablePeriod52.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod58);
        org.joda.time.LocalDate localDate60 = localDate46.plus((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.LocalDate.Property property61 = localDate60.dayOfMonth();
        boolean boolean63 = property61.equals((java.lang.Object) 53582722);
        org.joda.time.LocalDate localDate64 = property61.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate66 = localDate64.withWeekOfWeekyear(53612694);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53612694 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "PT0.100S");
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hours" + "'", str39, "hours");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 53230963L + "'", long45 == 53230963L);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "PT0.100S");
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localDate64);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.util.Date date3 = new java.util.Date(43352, 774, 713);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Jun 13 00:00:00 GMT+00:00 45318");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology9);
        org.joda.time.Interval interval11 = yearMonthDay10.toInterval();
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(9);
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        java.lang.String str27 = dateTimeZone26.toString();
        org.joda.time.DateTime dateTime28 = dateTime12.toDateTime(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.isFixed();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime37 = property34.getMutableDateTime();
        java.lang.String str38 = mutableDateTime37.toString();
        int int39 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) mutableDateTime37);
        long long41 = dateTimeZone26.previousTransition((long) 28);
        java.lang.String str43 = dateTimeZone26.getNameKey((-168723889700L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(427, 9, 10, (-890), 53322289, 888, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -890 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Etc/UTC" + "'", str27, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2022-01-01T00:00:00.003Z" + "'", str38, "2022-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 28L + "'", long41 == 28L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray2 = strSet1.toArray();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Period period25 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        java.lang.String str27 = durationFieldType26.toString();
        org.joda.time.Period period29 = period25.withField(durationFieldType26, 2);
        org.joda.time.Period period31 = period29.withMillis((int) '#');
        org.joda.time.LocalDate localDate32 = localDate23.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.LocalDate localDate34 = localDate32.minusYears(11);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        java.lang.Object obj43 = mutablePeriod42.clone();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 100L, periodType46, chronology47);
        mutablePeriod42.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone51);
        org.joda.time.Duration duration53 = mutablePeriod42.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight37.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.LocalDate localDate55 = dateMidnight54.toLocalDate();
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, 100L, periodType59, chronology60);
        java.lang.Object obj62 = mutablePeriod61.clone();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(0L, 100L, periodType65, chronology66);
        mutablePeriod61.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod67);
        int int69 = mutablePeriod67.getMinutes();
        org.joda.time.Period period71 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.hours();
        java.lang.String str73 = durationFieldType72.toString();
        org.joda.time.Period period75 = period71.withField(durationFieldType72, 2);
        boolean boolean76 = mutablePeriod67.isSupported(durationFieldType72);
        long long79 = chronology56.add((org.joda.time.ReadablePeriod) mutablePeriod67, (long) 53230763, 2);
        org.joda.time.Period period81 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType82 = org.joda.time.DurationFieldType.hours();
        java.lang.String str83 = durationFieldType82.toString();
        org.joda.time.Period period85 = period81.withField(durationFieldType82, 2);
        org.joda.time.DurationFieldType durationFieldType86 = org.joda.time.DurationFieldType.hours();
        java.lang.String str87 = durationFieldType86.toString();
        boolean boolean88 = period81.isSupported(durationFieldType86);
        java.lang.String str89 = durationFieldType86.getName();
        int int90 = mutablePeriod67.indexOf(durationFieldType86);
        org.joda.time.LocalDate localDate92 = localDate32.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod67, 22);
        org.joda.time.Chronology chronology93 = localDate32.getChronology();
        boolean boolean94 = strSet1.contains((java.lang.Object) localDate32);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hours" + "'", str27, "hours");
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "PT0.100S");
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hours" + "'", str73, "hours");
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 53230963L + "'", long79 == 53230963L);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hours" + "'", str83, "hours");
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hours" + "'", str87, "hours");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hours" + "'", str89, "hours");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 4 + "'", int90 == 4);
        org.junit.Assert.assertNotNull(localDate92);
        org.junit.Assert.assertNotNull(chronology93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        int int40 = dateMidnight19.compareTo((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, readableInstant41);
        org.joda.time.LocalDate localDate43 = dateMidnight19.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone46);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, 100L, periodType50, chronology51);
        java.lang.Object obj53 = mutablePeriod52.clone();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(0L, 100L, periodType56, chronology57);
        mutablePeriod52.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod58);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone61);
        org.joda.time.Duration duration63 = mutablePeriod52.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight47.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.LocalDate localDate65 = dateMidnight64.toLocalDate();
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(0L, 100L, periodType69, chronology70);
        java.lang.Object obj72 = mutablePeriod71.clone();
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(0L, 100L, periodType75, chronology76);
        mutablePeriod71.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod77);
        int int79 = mutablePeriod77.getMinutes();
        org.joda.time.Period period81 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType82 = org.joda.time.DurationFieldType.hours();
        java.lang.String str83 = durationFieldType82.toString();
        org.joda.time.Period period85 = period81.withField(durationFieldType82, 2);
        boolean boolean86 = mutablePeriod77.isSupported(durationFieldType82);
        long long89 = chronology66.add((org.joda.time.ReadablePeriod) mutablePeriod77, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone90 = null;
        org.joda.time.Chronology chronology91 = chronology66.withZone(dateTimeZone90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) 11, chronology91);
        java.lang.String str93 = mutablePeriod92.toString();
        mutablePeriod92.add((long) 16);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod92);
        org.joda.time.DateMidnight dateMidnight98 = dateMidnight19.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod96, 53363);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0.100S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "PT0.100S");
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hours" + "'", str83, "hours");
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 53230963L + "'", long89 == 53230963L);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "PT0.011S" + "'", str93, "PT0.011S");
        org.junit.Assert.assertNotNull(dateMidnight98);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        org.joda.time.DateTime.Property property9 = dateTime6.minuteOfDay();
        org.joda.time.DateTime.Property property10 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        org.joda.time.LocalDate localDate12 = dateTime6.toLocalDate();
        int int13 = localDate12.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate17 = dateMidnight16.toLocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks(100);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property21 = localDate12.dayOfYear();
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.util.Locale locale8 = new java.util.Locale("hi!", "");
        java.lang.String str9 = property5.getAsText(locale8);
        int int10 = property2.getMaximumShortTextLength(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property2.setCopy("hours");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hours\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromDateFields(date1);
        java.time.Instant instant4 = date1.toInstant();
        java.util.Date date5 = java.util.Date.from(instant4);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        int int4 = periodType2.size();
        java.util.Calendar.Builder builder5 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder9 = builder5.setDate(53243063, 21, 32769);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar.Builder builder11 = builder9.setLocale(locale10);
        java.util.Calendar.Builder builder16 = builder11.setTimeOfDay((int) (byte) 10, 53256552, (int) '#', 53243308);
        boolean boolean17 = periodType2.equals((java.lang.Object) '#');
        java.lang.String str18 = periodType2.getName();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 'x', 31536000000L, periodType2);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Minutes" + "'", str18, "Minutes");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        int int4 = dateMidnight2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withField(dateTimeFieldType5, 3);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.minusDays((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateMidnight9.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 3);
        mutableDateTime15.setDayOfMonth((int) (byte) 10);
        mutableDateTime15.add((long) 6);
        mutableDateTime15.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.monthOfYear();
        mutableDateTime15.setTime((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone27);
        int int29 = dateMidnight28.getEra();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateMidnight28.toDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight34 = dateTime33.toDateMidnight();
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.era();
        int int36 = dateMidnight34.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight34.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight34.minusWeeks((int) ' ');
        java.util.GregorianCalendar gregorianCalendar41 = dateMidnight40.toGregorianCalendar();
        boolean boolean43 = dateMidnight40.isAfter((long) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateMidnight.Property property45 = dateMidnight22.weekOfWeekyear();
        int int46 = dateMidnight22.getSecondOfDay();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight22.withWeekyear(8);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight22.withCenturyOfEra(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(gregorianCalendar41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(dateMidnight50);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getDisplayScript();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        java.lang.String str25 = chronology24.toString();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfDay();
        long long28 = dateTimeField26.roundHalfFloor(100L);
        java.util.Locale locale32 = new java.util.Locale("hi!", "");
        java.lang.String str33 = locale32.getDisplayVariant();
        java.lang.String str34 = locale32.getCountry();
        java.lang.String str35 = dateTimeField26.getAsShortText((long) 14, locale32);
        java.lang.String str36 = locale32.getCountry();
        java.lang.String str37 = locale1.getDisplayName(locale32);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[UTC]" + "'", str25, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chinese (China)" + "'", str37, "Chinese (China)");
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) 3);
        mutableDateTime13.setDayOfMonth((int) (byte) 10);
        mutableDateTime13.add((long) 6);
        mutableDateTime13.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.monthOfYear();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) dateMidnight20);
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        int int24 = property8.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay26 = property8.setCopy(1967);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1967 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setYears(11);
        org.joda.time.Period period4 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        java.lang.String str6 = durationFieldType5.toString();
        org.joda.time.Period period8 = period4.withField(durationFieldType5, 2);
        org.joda.time.Period period10 = period8.minusMinutes(21);
        mutablePeriod0.add((org.joda.time.ReadablePeriod) period8);
        org.joda.time.MutablePeriod mutablePeriod12 = period8.toMutablePeriod();
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.Period period14 = period8.normalizedStandard();
        org.joda.time.Period period16 = period8.plusYears(0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        int int4 = dateMidnight2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.minusWeeks(86399);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.minusYears(75222);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((-4550400000L));
        org.joda.time.Period period3 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        java.lang.String str5 = durationFieldType4.toString();
        org.joda.time.Period period7 = period3.withField(durationFieldType4, 2);
        org.joda.time.Period period9 = period7.minusMinutes(21);
        org.joda.time.Days days10 = period7.toStandardDays();
        org.joda.time.Period period11 = period7.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period11.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay1.plus((org.joda.time.ReadablePeriod) period11);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(2022, 27, (int) (byte) -1, 53243063, 53403668);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53243063 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        org.joda.time.Period period4 = new org.joda.time.Period(53484781, 53455652, 60000, 20);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        int int6 = calendar0.getGreatestMinimum(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        int int10 = dateMidnight9.getEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateMidnight9.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.era();
        int int17 = dateMidnight15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        int int21 = dateMidnight20.getEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateMidnight20.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusWeeks(0);
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime29 = dateTime25.withFieldAdded(durationFieldType27, 5);
        int int30 = dateMidnight15.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime();
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime34 = dateTime31.minus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        int int38 = dateMidnight37.getEra();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateMidnight37.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks(0);
        org.joda.time.DateTime dateTime44 = dateTime40.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusDays(53230763);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology50);
        int int52 = yearMonthDay51.size();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone60);
        int int62 = dateMidnight61.getEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = dateMidnight61.toDateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusDays(9);
        int int67 = dateTime64.getEra();
        org.joda.time.DateTime dateTime68 = dateTime64.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime68.getZone();
        java.lang.String str70 = dateTimeZone69.toString();
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone69);
        java.lang.String str73 = dateTimeZone69.toString();
        org.joda.time.Interval interval74 = yearMonthDay51.toInterval(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime75 = dateTime46.toMutableDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime31.toMutableDateTime(dateTimeZone69);
        boolean boolean77 = calendar0.before((java.lang.Object) dateTimeZone69);
        java.util.TimeZone timeZone78 = dateTimeZone69.toTimeZone();
        boolean boolean79 = timeZone78.observesDaylightTime();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-61725661377899,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=2,MILLISECOND=101,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Etc/UTC" + "'", str70, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Etc/UTC" + "'", str73, "Etc/UTC");
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(timeZone78);
        org.junit.Assert.assertEquals(timeZone78.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 100L, periodType4, chronology5);
        java.lang.Object obj7 = mutablePeriod6.clone();
        java.lang.String str8 = mutablePeriod6.toString();
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod6, 2022);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(9);
        int int19 = dateTime16.getEra();
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone21);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        long long28 = dateTimeZone21.convertLocalToUTC((long) (short) 1, true, 240000000L);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology33);
        org.joda.time.Interval interval35 = yearMonthDay34.toInterval();
        org.joda.time.Period period36 = interval35.toPeriod();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology40);
        org.joda.time.Interval interval42 = yearMonthDay41.toInterval();
        org.joda.time.Period period43 = interval42.toPeriod();
        long long44 = interval42.getStartMillis();
        org.joda.time.Interval interval45 = interval35.overlap((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone47);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(0L, 100L, periodType51, chronology52);
        java.lang.Object obj54 = mutablePeriod53.clone();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(0L, 100L, periodType57, chronology58);
        mutablePeriod53.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone62);
        org.joda.time.Duration duration64 = mutablePeriod53.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight63);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight48.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.LocalDate localDate66 = dateMidnight65.toLocalDate();
        org.joda.time.Chronology chronology67 = localDate66.getChronology();
        java.lang.String str68 = chronology67.toString();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.secondOfDay();
        org.joda.time.Interval interval70 = interval35.withChronology(chronology67);
        org.joda.time.DateMidnight dateMidnight71 = org.joda.time.DateMidnight.now(chronology67);
        org.joda.time.DateTimeField dateTimeField72 = chronology67.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = chronology67.monthOfYear();
        boolean boolean74 = dateTimeField73.isSupported();
        mutableDateTime29.setRounding(dateTimeField73);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0.100S" + "'", str8, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Etc/UTC" + "'", str22, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-61038316800000L) + "'", long44 == (-61038316800000L));
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "PT0.100S");
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ISOChronology[UTC]" + "'", str68, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(2020);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(752, (-1), (-46800000), dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(53638496, 53812737, 50400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638496 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("120");
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale6.getScript();
        java.util.Locale.Builder builder9 = builder1.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.year();
        java.util.Locale locale16 = new java.util.Locale("hi!", "");
        java.lang.String str17 = property13.getAsText(locale16);
        org.joda.time.LocalDateTime localDateTime18 = property13.withMaximumValue();
        java.lang.String str19 = property13.toString();
        org.joda.time.LocalDateTime localDateTime20 = property13.getLocalDateTime();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("days");
        int int23 = property13.getMaximumTextLength(locale22);
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale.Builder builder25 = builder9.setLocale(locale24);
        org.joda.time.tz.NameProvider nameProvider26 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider26);
        java.util.Locale locale28 = null;
        java.lang.String str31 = nameProvider26.getName(locale28, "20", "14:47:57.698");
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime37 = property34.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone39);
        int int41 = dateMidnight40.getEra();
        org.joda.time.DateMidnight.Property property42 = dateMidnight40.monthOfYear();
        org.joda.time.DateMidnight dateMidnight44 = property42.addToCopy((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property42.getFieldType();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime37.property(dateTimeFieldType45);
        org.joda.time.MutableDateTime mutableDateTime48 = property46.add((long) 365);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.lang.String str51 = locale50.getScript();
        java.lang.String str52 = mutableDateTime48.toString("32", locale50);
        java.lang.String str55 = nameProvider26.getShortName(locale50, "GMT+00:00", "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        java.util.Locale.Builder builder56 = builder9.setLocale(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder58 = builder56.setLanguageTag("7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 7 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022" + "'", str17, "2022");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[year]" + "'", str19, "Property[year]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "days");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "days");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(nameProvider26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "32" + "'", str52, "32");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        java.util.Locale locale1 = new java.util.Locale("9 Oct 4640 09:22:21 GMT");
        org.junit.Assert.assertEquals(locale1.toString(), "9 oct 4640 09:22:21 gmt");
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        calendar0.set((int) (byte) 10, 8, (int) (short) 0);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek((int) (byte) -1);
        calendar0.set(17, 53277990, 2021, 70, 540);
        java.util.TimeZone timeZone18 = calendar0.getTimeZone();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("");
        java.lang.String str21 = timeZone20.getID();
        boolean boolean22 = timeZone20.observesDaylightTime();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone20);
        int int24 = calendar0.compareTo(calendar23);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=17,MONTH=53277990,WEEK_OF_YEAR=36,WEEK_OF_MONTH=5,DAY_OF_MONTH=2021,DAY_OF_YEAR=243,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=70,MINUTE=540,SECOND=2,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1645455422200,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=2,MILLISECOND=200,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 12);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear(7);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayVariant();
        java.util.Date date13 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromDateFields(date13);
        int int15 = timeOfDay14.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.secondOfMinute();
        java.util.Locale locale23 = new java.util.Locale("hi!", "");
        java.lang.String str24 = property20.getAsShortText(locale23);
        java.lang.String str25 = locale10.getDisplayScript(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter7.withLocale(locale23);
        java.util.Calendar.Builder builder27 = builder0.setLocale(locale23);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        java.lang.Object obj35 = mutablePeriod34.clone();
        java.lang.String str36 = mutablePeriod34.toString();
        mutableDateTime29.add((org.joda.time.ReadablePeriod) mutablePeriod34, 2022);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        int int43 = dateMidnight42.getEra();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateMidnight42.toDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusDays(9);
        int int48 = dateTime45.getEra();
        org.joda.time.DateTime dateTime49 = dateTime45.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        long long53 = dateTimeZone50.adjustOffset((long) 5, true);
        mutableDateTime29.setZoneRetainFields(dateTimeZone50);
        java.util.TimeZone timeZone55 = dateTimeZone50.toTimeZone();
        java.util.Calendar.Builder builder56 = builder0.setTimeZone(timeZone55);
        java.util.Calendar calendar57 = builder0.build();
        calendar57.set(53299420, 852, 0, (int) (short) 0, (-292275054), 9);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = calendar57.getActualMaximum(852);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 852");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "PT0.100S");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.100S" + "'", str36, "PT0.100S");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 5L + "'", long53 == 5L);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53299420,MONTH=852,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=-292275054,SECOND=9,MILLISECOND=12,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        int int4 = dateMidnight2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.minusWeeks(86399);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.centuryOfEra();
        int int8 = dateMidnight6.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateMidnight11.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight17 = dateTime16.toDateMidnight();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(0L, 100L, periodType20, chronology21);
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        mutablePeriod22.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone31);
        org.joda.time.Duration duration33 = mutablePeriod22.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(0L, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone38);
        int int40 = dateMidnight39.getEra();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(0L, 100L, periodType43, chronology44);
        java.lang.Object obj46 = mutablePeriod45.clone();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 100L, periodType49, chronology50);
        mutablePeriod45.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone54);
        org.joda.time.Duration duration56 = mutablePeriod45.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight36, (org.joda.time.ReadableDuration) duration56, periodType58);
        boolean boolean60 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight17.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType63 = periodType62.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType65 = periodType62.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableDuration) duration33, periodType62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "PT0.100S");
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "PT0.100S");
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(durationFieldType65);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay4.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withDurationAdded((long) (byte) 10, 12);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plus((long) (byte) -1);
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight13 = property11.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight14 = property11.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.withYearOfEra((int) ' ');
        int int17 = dateMidnight16.getMinuteOfDay();
        org.joda.time.Interval interval18 = dateMidnight16.toInterval();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Period period22 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        java.lang.String str24 = durationFieldType23.toString();
        org.joda.time.Period period26 = period22.withField(durationFieldType23, 2);
        org.joda.time.Period period28 = period26.withMillis((int) '#');
        org.joda.time.LocalDate localDate29 = localDate20.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = localDate29.minusYears(11);
        org.joda.time.LocalDate localDate33 = localDate29.withDayOfMonth(13);
        org.joda.time.LocalDate localDate35 = localDate29.minusWeeks(69);
        org.joda.time.LocalDate localDate37 = localDate35.plusWeeks(53243434);
        int int38 = localDate37.getCenturyOfEra();
        int int39 = localDate37.getYear();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate42 = localDate37.withFieldAdded(durationFieldType40, 3682080);
        int int43 = localDate42.getDayOfMonth();
        org.joda.time.LocalDate localDate45 = localDate42.minusDays(366);
        int int46 = localDate42.getYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = localDate42.toString("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hours" + "'", str24, "hours");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10223 + "'", int38 == 10223);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1022397 + "'", int39 == 1022397);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1329237 + "'", int46 == 1329237);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay4.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withDurationAdded((long) (byte) 10, 12);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plus((long) (byte) -1);
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight12 = property11.withMaximumValue();
        int int13 = property11.getMaximumValue();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2922789 + "'", int13 == 2922789);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        org.joda.time.DateTime.Property property9 = dateTime6.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone11);
        int int13 = dateMidnight12.getEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateMidnight12.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusDays(9);
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.DateTime dateTime22 = dateTime6.toDateTime(dateTimeZone20);
        int int24 = dateTimeZone20.getStandardOffset((-1L));
        long long27 = dateTimeZone20.convertLocalToUTC((long) 60000, false);
        boolean boolean29 = dateTimeZone20.isStandardOffset((long) 53286779);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone20);
        java.lang.String str31 = dateTimeZone20.toString();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        java.lang.String str35 = dateTimeZone20.getName(2344164764463360000L, locale33);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Etc/UTC" + "'", str21, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60000L + "'", long27 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Etc/UTC" + "'", str31, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(calendar34);
        org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1645455422301,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=2,MILLISECOND=301,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusWeeks(70);
        org.joda.time.DateTime dateTime13 = dateMidnight12.toDateTimeISO();
        boolean boolean15 = dateTime13.isEqual((-61725661795590L));
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone18);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0L, 100L, periodType22, chronology23);
        java.lang.Object obj25 = mutablePeriod24.clone();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, 100L, periodType28, chronology29);
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone33);
        org.joda.time.Duration duration35 = mutablePeriod24.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.LocalDate localDate37 = dateMidnight36.toLocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        java.lang.Object obj44 = mutablePeriod43.clone();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, 100L, periodType47, chronology48);
        mutablePeriod43.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod49);
        int int51 = mutablePeriod49.getMinutes();
        org.joda.time.Period period53 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.hours();
        java.lang.String str55 = durationFieldType54.toString();
        org.joda.time.Period period57 = period53.withField(durationFieldType54, 2);
        boolean boolean58 = mutablePeriod49.isSupported(durationFieldType54);
        long long61 = chronology38.add((org.joda.time.ReadablePeriod) mutablePeriod49, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.Chronology chronology63 = chronology38.withZone(dateTimeZone62);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(chronology63);
        org.joda.time.DurationField durationField65 = chronology63.halfdays();
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(chronology63);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(chronology63);
        org.joda.time.Period period68 = new org.joda.time.Period((-604800001L), chronology63);
        int int69 = period68.getSeconds();
        org.joda.time.Period period71 = period68.withMillis((int) 'x');
        org.joda.time.Duration duration72 = period68.toStandardDuration();
        org.joda.time.DateTime dateTime73 = dateTime13.plus((org.joda.time.ReadableDuration) duration72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "PT0.100S");
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hours" + "'", str55, "hours");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 53230963L + "'", long61 == 53230963L);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) 3);
        mutableDateTime13.setDayOfMonth((int) (byte) 10);
        mutableDateTime13.add((long) 6);
        mutableDateTime13.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.monthOfYear();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) dateMidnight20);
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.TimeOfDay timeOfDay25 = property8.addNoWrapToCopy(5);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.plusHours((-1));
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMinutes(53582722);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setWeekDate(14, (int) (byte) 0, 7);
        java.util.Date date5 = calendar0.getTime();
        calendar0.setMinimalDaysInFirstWeek((int) '4');
        calendar0.roll(0, false);
        calendar0.setFirstDayOfWeek(53303564);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=53303564,minimalDaysInFirstWeek=52,ERA=0,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=2,MILLISECOND=403,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Dec 30 14:57:02 GMT+00:00 13");
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMinutes(3);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withSecondOfMinute((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property18.getLocalDateTime();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 50);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.withYearOfEra(113);
        org.joda.time.DateMidnight.Property property4 = dateMidnight1.year();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withYearOfEra(3120947);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime localTime13 = localTime9.minusMillis((-1));
        org.joda.time.DateTime dateTime14 = localTime13.toDateTimeToday();
        org.joda.time.LocalTime localTime16 = localTime13.minusMinutes(2022);
        org.joda.time.Chronology chronology17 = localTime13.getChronology();
        org.joda.time.DateTime dateTime18 = localTime13.toDateTimeToday();
        int int19 = dateTime18.getSecondOfDay();
        java.util.Date date21 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.fromDateFields(date21);
        int int23 = timeOfDay22.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property28 = timeOfDay27.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.add((long) 3);
        mutableDateTime33.setDayOfMonth((int) (byte) 10);
        mutableDateTime33.add((long) 6);
        mutableDateTime33.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.monthOfYear();
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) dateMidnight40);
        int int43 = property28.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.TimeOfDay timeOfDay45 = property28.addNoWrapToCopy(5);
        org.joda.time.TimeOfDay timeOfDay47 = property28.setCopy(8);
        org.joda.time.TimeOfDay timeOfDay48 = property28.getTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone50);
        int int52 = dateMidnight51.getEra();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateMidnight51.toDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusDays(9);
        int int57 = dateTime54.getEra();
        org.joda.time.DateTime dateTime58 = dateTime54.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime58.getZone();
        java.lang.String str60 = dateTimeZone59.toString();
        org.joda.time.DateTime dateTime61 = timeOfDay48.toDateTimeToday(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime18.withZone(dateTimeZone59);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Etc/UTC" + "'", str60, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1645454839865L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        boolean boolean3 = dateTime1.isSupported(dateTimeFieldType2);
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours(93);
        org.joda.time.DateTime dateTime7 = dateTime1.withWeekyear(53326321);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfFloor();
        mutableDateTime3.setMonthOfYear(11);
        int int6 = mutableDateTime3.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        int int10 = dateMidnight9.getEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateMidnight9.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusDays(9);
        int int15 = dateTime12.getEra();
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        long long20 = dateTimeZone17.adjustOffset((long) 5, true);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone17);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight.Property property25 = dateMidnight23.centuryOfEra();
        org.joda.time.DateMidnight.Property property26 = dateMidnight23.centuryOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5L + "'", long20 == 5L);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime10 = dateTime7.withDayOfYear(22);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusYears(48);
        org.joda.time.YearMonthDay yearMonthDay15 = dateTime14.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        int int20 = dateMidnight18.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withField(dateTimeFieldType21, 3);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight18.minusDays((int) (short) 10);
        org.joda.time.DateTime dateTime26 = dateMidnight25.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.add((long) 3);
        mutableDateTime31.setDayOfMonth((int) (byte) 10);
        mutableDateTime31.add((long) 6);
        mutableDateTime31.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.monthOfYear();
        mutableDateTime31.setTime((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, (org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone43);
        int int45 = dateMidnight44.getEra();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateMidnight44.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight50 = dateTime49.toDateMidnight();
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.era();
        int int52 = dateMidnight50.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight50.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight50.minusWeeks((int) ' ');
        java.util.GregorianCalendar gregorianCalendar57 = dateMidnight56.toGregorianCalendar();
        boolean boolean59 = dateMidnight56.isAfter((long) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight38, (org.joda.time.ReadableInstant) dateMidnight56);
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay15.plus((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay61.minusYears(53455652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(gregorianCalendar57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(yearMonthDay63);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.Duration duration21 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        int int37 = mutablePeriod35.getMinutes();
        org.joda.time.Period period39 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        java.lang.String str41 = durationFieldType40.toString();
        org.joda.time.Period period43 = period39.withField(durationFieldType40, 2);
        boolean boolean44 = mutablePeriod35.isSupported(durationFieldType40);
        long long47 = chronology24.add((org.joda.time.ReadablePeriod) mutablePeriod35, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = chronology24.withZone(dateTimeZone48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 11, chronology49);
        org.joda.time.DurationField durationField51 = chronology49.days();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (-1), (long) (short) 0, chronology49);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone54);
        int int56 = dateMidnight55.getEra();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateMidnight55.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusWeeks(0);
        org.joda.time.Interval interval61 = interval52.withStart((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime.Property property62 = dateTime58.hourOfDay();
        org.joda.time.DateTime dateTime64 = dateTime58.plusMonths(21);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(0L, 100L, periodType67, chronology68);
        java.lang.Object obj70 = mutablePeriod69.clone();
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(0L, 100L, periodType73, chronology74);
        mutablePeriod69.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod75);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone78);
        org.joda.time.Duration duration80 = mutablePeriod69.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight79);
        mutablePeriod69.addMillis(0);
        mutablePeriod69.setMonths(0);
        int int85 = mutablePeriod69.getWeeks();
        org.joda.time.DateTime dateTime87 = dateTime58.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod69, 365);
        org.joda.time.MutableDateTime mutableDateTime88 = dateTime58.toMutableDateTimeISO();
        mutableDateTime88.setWeekOfWeekyear(13);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime88.setDayOfWeek(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "PT0.100S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hours" + "'", str41, "hours");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53230963L + "'", long47 == 53230963L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "PT0.100S");
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(mutableDateTime88);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.util.Date date2 = new java.util.Date((long) 0);
        int int3 = date2.getDay();
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromDateFields(date2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.Duration duration24 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.LocalDate localDate26 = dateMidnight25.toLocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        int int40 = mutablePeriod38.getMinutes();
        org.joda.time.Period period42 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.hours();
        java.lang.String str44 = durationFieldType43.toString();
        org.joda.time.Period period46 = period42.withField(durationFieldType43, 2);
        boolean boolean47 = mutablePeriod38.isSupported(durationFieldType43);
        long long50 = chronology27.add((org.joda.time.ReadablePeriod) mutablePeriod38, (long) 53230763, 2);
        boolean boolean51 = durationFieldType5.isSupported(chronology27);
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay4.withChronologyRetainFields(chronology27);
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay52.minusYears(53233428);
        org.joda.time.YearMonthDay.Property property55 = yearMonthDay52.year();
        org.joda.time.YearMonthDay yearMonthDay57 = property55.setCopy(21);
        int int58 = property55.getMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay60 = property55.addWrapFieldToCopy(2);
        org.joda.time.YearMonthDay yearMonthDay61 = property55.withMinimumValue();
        int int62 = yearMonthDay61.size();
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay61.minusDays((-1996092050));
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = yearMonthDay61.toDateTimeAtMidnight(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) 53443776, dateTimeZone65);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT0.100S");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hours" + "'", str44, "hours");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 53230963L + "'", long50 == 53230963L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-292275054) + "'", int58 == (-292275054));
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime67);
    }
}

