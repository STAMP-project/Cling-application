import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod4 = periodFormatter2.parseMutablePeriod("PT4460371.281S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("1970-01-01T00:00:00.001Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.001Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-813), 85619999, (-21), 2115, 101);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2115 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setHours((int) (byte) 100);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.minutes();
        int int10 = days8.get(durationFieldType9);
        mutablePeriod5.set(durationFieldType9, (int) 'x');
        mutablePeriod5.setMillis(2);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardSeconds((long) 1969);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration16, chronology17);
        int int19 = mutablePeriod5.getMillis();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod5.toMutablePeriod();
        mutablePeriod20.setMillis(11);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod20);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.joda.time.Period period1 = org.joda.time.Period.millis(13);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setScript("");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("PT0.011S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: PT0.011S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType8, chronology9);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 11, 0L, periodType8);
        java.lang.String str12 = periodType8.getName();
        org.joda.time.PeriodType periodType13 = periodType8.withMonthsRemoved();
        java.lang.String str14 = periodType8.toString();
        int int15 = periodType8.size();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (-2147483648), periodType8);
        org.joda.time.PeriodType periodType17 = periodType8.withYearsRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period((long) 358, periodType17);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime21 = instant20.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withZoneRetainFields(dateTimeZone22);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime26 = instant25.toDateTime();
        org.joda.time.DateTime.Property property27 = dateTime26.era();
        org.joda.time.DateTime dateTime28 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.Duration duration31 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration31, readableInstant32, periodType33);
        mutablePeriod34.setMonths((int) '4');
        org.joda.time.DateTime dateTime37 = dateTime26.plus((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTime dateTime39 = dateTime26.minusWeeks((int) (byte) 1);
        int int40 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property41 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime43 = dateTime26.withYear(1969);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.millisOfDay();
        java.lang.String str47 = chronology44.toString();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.monthOfYear();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 720, 100L, periodType17, chronology44);
        org.joda.time.PeriodType periodType50 = periodType17.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YearDay" + "'", str12, "YearDay");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[YearDay]" + "'", str14, "PeriodType[YearDay]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ISOChronology[UTC]" + "'", str47, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(992);
        java.lang.Object obj2 = null;
        org.joda.time.Instant instant3 = new org.joda.time.Instant(obj2);
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        java.lang.String str5 = dateTimeZone4.toString();
        int int7 = dateTimeZone4.getOffset(1L);
        boolean boolean9 = dateTimeZone4.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone4.getNameKey((long) 1);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone4);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int16 = dateTimeZone14.getOffset((long) 365);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.era();
        org.joda.time.DateTime dateTime26 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean28 = dateTime24.isSupported(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime19.property(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime19.getZone();
        org.joda.time.LocalDateTime localDateTime31 = dateTime19.toLocalDateTime();
        boolean boolean32 = dateTimeZone14.isLocalDateTimeGap(localDateTime31);
        boolean boolean33 = dateTimeZone4.isLocalDateTimeGap(localDateTime31);
        int int34 = localDateTime31.size();
        boolean boolean35 = dateTimeZone1.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.DateTime.Property property18 = dateTime8.yearOfEra();
        java.util.GregorianCalendar gregorianCalendar19 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime.Property property20 = dateTime8.secondOfMinute();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField22 = property20.getField();
        org.joda.time.format.PeriodPrinter periodPrinter23 = null;
        org.joda.time.format.PeriodParser periodParser24 = null;
        org.joda.time.format.PeriodFormatter periodFormatter25 = new org.joda.time.format.PeriodFormatter(periodPrinter23, periodParser24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter25.withParseType(periodType26);
        org.joda.time.format.PeriodParser periodParser28 = periodFormatter27.getParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        long long34 = dateTimeField31.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial35 = null;
        int int36 = dateTimeField31.getMinimumValue(readablePartial35);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime39 = instant38.toDateTime();
        org.joda.time.DateTime.Property property40 = dateTime39.era();
        org.joda.time.ReadablePartial readablePartial41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.withFields(readablePartial41);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillisOfSecond((int) ' ');
        org.joda.time.LocalTime localTime45 = dateTime44.toLocalTime();
        org.joda.time.format.PeriodPrinter periodPrinter46 = null;
        org.joda.time.format.PeriodParser periodParser47 = null;
        org.joda.time.format.PeriodFormatter periodFormatter48 = new org.joda.time.format.PeriodFormatter(periodPrinter46, periodParser47);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter50 = periodFormatter48.withParseType(periodType49);
        java.util.Locale locale51 = periodFormatter48.getLocale();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter54 = periodFormatter48.withLocale(locale52);
        java.lang.String str55 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localTime45, locale52);
        org.joda.time.format.PeriodFormatter periodFormatter56 = periodFormatter27.withLocale(locale52);
        java.lang.String str57 = property20.getAsShortText(locale52);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertNull(periodParser28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 43200000L + "'", long34 == 43200000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodFormatter50);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(periodFormatter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PM" + "'", str55, "PM");
        org.junit.Assert.assertNotNull(periodFormatter56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "59" + "'", str57, "59");
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Seconds seconds3 = seconds1.plus((int) (byte) -1);
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds6 = seconds3.negated();
        int int7 = seconds6.getSeconds();
        java.lang.String str8 = seconds6.toString();
        org.joda.time.Seconds seconds9 = seconds6.negated();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT1S" + "'", str8, "PT1S");
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded(0L, (int) 'a');
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = period13.getFieldTypes();
        org.joda.time.Period period16 = period13.minusYears((int) (byte) 1);
        org.joda.time.Period period18 = period13.plusMonths((int) (byte) 0);
        int int19 = period13.size();
        org.joda.time.Period period21 = period13.plusYears(100);
        org.joda.time.Period period23 = period13.minusSeconds(292278993);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType28);
        mutablePeriod29.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.days();
        mutablePeriod29.add(durationFieldType32, 8);
        boolean boolean35 = period13.isSupported(durationFieldType32);
        org.joda.time.DateTime dateTime37 = dateTime2.withFieldAdded(durationFieldType32, (-2147483648));
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime40 = instant39.toDateTime();
        org.joda.time.DateTime.Property property41 = dateTime40.era();
        org.joda.time.DateTime dateTime42 = property41.withMinimumValue();
        int int43 = property41.getMaximumValueOverall();
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = locale44.getScript();
        java.lang.String str46 = locale44.getDisplayCountry();
        int int47 = property41.getMaximumShortTextLength(locale44);
        org.joda.time.DateTime dateTime48 = property41.withMaximumValue();
        org.joda.time.LocalTime localTime49 = dateTime48.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime48.getZone();
        int int52 = dateTimeZone50.getOffsetFromLocal(0L);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone50);
        int int54 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime.Property property55 = dateTime53.millisOfDay();
        java.lang.String str56 = property55.toString();
        org.joda.time.DateTime dateTime57 = property55.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Property[millisOfDay]" + "'", str56, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType4, chronology5);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int16 = mutablePeriod15.getDays();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.Interval interval26 = property25.toInterval();
        boolean boolean27 = interval22.contains((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        mutablePeriod15.setPeriod((long) 'u', (long) 1969, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.yearOfCentury();
        org.joda.time.Duration duration34 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds35 = duration34.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration36 = null;
        boolean boolean37 = duration34.isEqual(readableDuration36);
        org.joda.time.Duration duration39 = duration34.minus((long) 1);
        org.joda.time.Duration duration41 = duration39.minus((long) '4');
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime44 = instant43.toDateTime();
        org.joda.time.DateTime.Property property45 = dateTime44.era();
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period52 = duration51.toPeriod();
        org.joda.time.Duration duration54 = duration51.plus((long) (byte) 0);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime57 = instant56.toDateTime();
        boolean boolean59 = dateTime57.isEqual(10L);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType62, chronology63);
        org.joda.time.PeriodType periodType65 = periodType62.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration54, (org.joda.time.ReadableInstant) dateTime57, periodType65);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration48, periodType65);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime44, periodType68);
        org.joda.time.TimeOfDay timeOfDay70 = dateTime44.toTimeOfDay();
        int[] intArray72 = chronology28.get((org.joda.time.ReadablePartial) timeOfDay70, (long) (-1));
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(0L, (long) 59, periodType4, chronology28);
        org.joda.time.DateTimeField dateTimeField74 = chronology28.era();
        org.joda.time.DateTimeField dateTimeField75 = chronology28.year();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(53786950);
        java.lang.String str2 = hours1.toString();
        org.joda.time.Hours hours3 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours5 = hours3.multipliedBy(0);
        org.joda.time.Hours hours7 = hours3.dividedBy(69);
        org.joda.time.DurationFieldType durationFieldType9 = hours3.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours10 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType11 = hours10.getFieldType();
        boolean boolean12 = hours3.isGreaterThan(hours10);
        org.joda.time.Hours hours13 = hours1.plus(hours10);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT53786950H" + "'", str2, "PT53786950H");
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hours13);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType10);
        boolean boolean12 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period16 = duration15.toPeriod();
        org.joda.time.Duration duration18 = duration15.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration15.toPeriodTo(readableInstant19);
        org.joda.time.Duration duration22 = duration15.minus(43200000L);
        org.joda.time.Duration duration24 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration15, (int) ' ');
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Duration duration27 = duration24.withDurationAdded(readableDuration25, 97);
        org.joda.time.Duration duration29 = duration24.withMillis(100L);
        org.joda.time.Duration duration31 = duration24.plus(43199999L);
        long long32 = duration24.getStandardMinutes();
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime.Property property38 = dateTime37.weekOfWeekyear();
        org.joda.time.Duration duration41 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, readableInstant42, periodType43);
        org.joda.time.DateTime dateTime45 = dateTime37.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration46 = duration24.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        org.joda.time.Duration duration14 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType16);
        org.joda.time.DateTime dateTime18 = dateTime10.plus((org.joda.time.ReadableDuration) duration14);
        boolean boolean19 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType24);
        long long26 = duration22.getStandardSeconds();
        org.joda.time.Duration duration28 = duration14.withDurationAdded((org.joda.time.ReadableDuration) duration22, 10);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period32 = duration31.toPeriod();
        org.joda.time.Duration duration34 = duration31.plus((long) (byte) 0);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        boolean boolean39 = dateTime37.isEqual(10L);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType42, chronology43);
        org.joda.time.PeriodType periodType45 = periodType42.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, (org.joda.time.ReadableInstant) dateTime37, periodType45);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        org.joda.time.DateTime.Property property50 = dateTime49.era();
        org.joda.time.DateTime dateTime51 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.Instant instant52 = dateTime49.toInstant();
        org.joda.time.DateTime dateTime54 = dateTime49.withMillis((long) '4');
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime.Property property56 = dateTime37.minuteOfDay();
        org.joda.time.Interval interval57 = duration28.toIntervalTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = interval57.toPeriod(periodType58);
        org.joda.time.Period period60 = interval57.toPeriod();
        int int61 = period60.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setPeriod((long) 1, (-1L));
        mutablePeriod5.setMillis((int) (short) 0);
        mutablePeriod5.setWeeks(7);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration19 = null;
        boolean boolean20 = duration17.isEqual(readableDuration19);
        org.joda.time.Duration duration22 = duration17.minus((long) 1);
        org.joda.time.Duration duration24 = duration22.minus((long) '4');
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period35 = duration34.toPeriod();
        org.joda.time.Duration duration37 = duration34.plus((long) (byte) 0);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime40 = instant39.toDateTime();
        boolean boolean42 = dateTime40.isEqual(10L);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType45, chronology46);
        org.joda.time.PeriodType periodType48 = periodType45.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime40, periodType48);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration31, periodType48);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime27, periodType51);
        org.joda.time.Duration duration54 = duration22.minus((long) 7);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int65 = mutablePeriod64.getDays();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        org.joda.time.DateTime.Property property70 = dateTime69.yearOfEra();
        org.joda.time.Interval interval71 = property70.toInterval();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology72);
        org.joda.time.DateTime.Property property74 = dateTime73.yearOfEra();
        org.joda.time.Interval interval75 = property74.toInterval();
        boolean boolean76 = interval71.contains((org.joda.time.ReadableInterval) interval75);
        org.joda.time.Chronology chronology77 = interval75.getChronology();
        mutablePeriod64.setPeriod((long) 'u', (long) 1969, chronology77);
        org.joda.time.Period period79 = new org.joda.time.Period((long) (byte) 100, chronology77);
        org.joda.time.Period period80 = duration54.toPeriod(chronology77);
        org.joda.time.DateTimeField dateTimeField81 = chronology77.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField82 = chronology77.monthOfYear();
        org.joda.time.DurationField durationField83 = chronology77.weeks();
        mutablePeriod5.setPeriod((long) '#', (long) 11, chronology77);
        mutablePeriod5.add(0, 1970, (-1), (-100), (int) 'a', 19, 23, (-10));
        mutablePeriod5.setDays((int) (byte) -1);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(durationField83);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period7 = duration6.toPeriod();
        boolean boolean8 = duration2.isEqual((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        boolean boolean13 = dateTime11.isEqual(10L);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period17 = duration16.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray18 = period17.getFieldTypes();
        int int19 = period17.getMinutes();
        org.joda.time.Period period21 = period17.withDays((int) ' ');
        org.joda.time.Period period23 = period17.plusWeeks(10);
        org.joda.time.Period period25 = period17.minusMillis((int) (short) 1);
        org.joda.time.DateTime dateTime26 = dateTime11.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZone(dateTimeZone30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean38 = dateTime34.isSupported(dateTimeFieldType37);
        org.joda.time.DateTime.Property property39 = dateTime29.property(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime29.getZone();
        org.joda.time.LocalDate localDate41 = dateTime29.toLocalDate();
        org.joda.time.DateTime dateTime42 = dateTime26.withFields((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.DateTime dateTime44 = dateTime26.plusYears((int) 'a');
        org.joda.time.Interval interval45 = duration6.toIntervalTo((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldTypeArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval45);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        int int5 = period3.getMinutes();
        org.joda.time.Period period7 = period3.withDays((int) ' ');
        org.joda.time.Period period9 = period7.withYears(86399);
        org.joda.time.Period period14 = new org.joda.time.Period(0, (int) (byte) -1, (int) '#', 7);
        org.joda.time.Period period15 = period7.plus((org.joda.time.ReadablePeriod) period14);
        java.lang.String str16 = period15.toString();
        org.joda.time.Period period17 = period15.toPeriod();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P32DT-1M35.007S" + "'", str16, "P32DT-1M35.007S");
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours3 = hours1.minus((int) (short) 10);
        org.joda.time.Hours hours5 = hours1.plus(53669837);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfEra();
        org.joda.time.Interval interval13 = property12.toInterval();
        boolean boolean14 = interval9.contains((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        boolean boolean23 = interval18.contains((org.joda.time.ReadableInterval) interval22);
        boolean boolean24 = interval13.contains((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfEra();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.Interval interval32 = property31.toInterval();
        boolean boolean33 = interval28.contains((org.joda.time.ReadableInterval) interval32);
        java.lang.String str34 = interval32.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfEra();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.Interval interval42 = property41.toInterval();
        boolean boolean43 = interval38.contains((org.joda.time.ReadableInterval) interval42);
        boolean boolean44 = interval32.isBefore((org.joda.time.ReadableInterval) interval42);
        boolean boolean45 = interval18.overlaps((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Hours hours46 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Hours hours48 = hours46.dividedBy(10);
        org.joda.time.Hours hours49 = hours46.negated();
        boolean boolean50 = hours1.isGreaterThan(hours49);
        org.joda.time.Hours hours52 = hours49.multipliedBy(52);
        java.lang.String str53 = hours49.toString();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str34, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(hours46);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PT-8760H" + "'", str53, "PT-8760H");
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant3 = instant1.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.weekOfWeekyear();
        boolean boolean9 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime.Property property10 = dateTime6.dayOfWeek();
        boolean boolean11 = property10.isLeap();
        org.joda.time.DateTime dateTime12 = property10.roundHalfCeilingCopy();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withZoneRetainFields(dateTimeZone16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, readableInstant26, periodType27);
        mutablePeriod28.setMonths((int) '4');
        org.joda.time.DateTime dateTime31 = dateTime20.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.DateTime dateTime33 = dateTime20.minusWeeks((int) (byte) 1);
        int int34 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property35 = dateTime20.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime20.withYear(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int39 = dateTime20.get(dateTimeFieldType38);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime42 = instant41.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        org.joda.time.DateTime dateTime44 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Instant instant45 = dateTime42.toInstant();
        org.joda.time.DateMidnight dateMidnight46 = dateTime42.toDateMidnight();
        int int47 = dateTime42.getEra();
        org.joda.time.Chronology chronology48 = dateTime42.getChronology();
        long long52 = chronology48.add((long) 1439, (long) 'a', 1439);
        boolean boolean53 = dateTimeFieldType38.isSupported(chronology48);
        int int54 = dateTime12.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-59));
        org.joda.time.DateMidnight dateMidnight57 = dateTime56.toDateMidnight();
        org.joda.time.Minutes minutes58 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.DateTime dateTime60 = dateTime12.withCenturyOfEra(51);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime63 = instant62.toDateTime();
        org.joda.time.DateTime.Property property64 = dateTime63.era();
        org.joda.time.DateTime dateTime65 = dateTime63.withTimeAtStartOfDay();
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        org.joda.time.DateMidnight dateMidnight67 = dateTime63.toDateMidnight();
        int int68 = dateMidnight67.getDayOfYear();
        boolean boolean69 = dateMidnight67.isAfterNow();
        org.joda.time.Instant instant70 = dateMidnight67.toInstant();
        org.joda.time.Instant instant73 = instant70.withDurationAdded((long) 7, 11);
        org.joda.time.MutableDateTime mutableDateTime74 = instant70.toMutableDateTime();
        boolean boolean76 = mutableDateTime74.isAfter(885371L);
        int int77 = dateTime60.compareTo((org.joda.time.ReadableInstant) mutableDateTime74);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 86399999 + "'", int39 == 86399999);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 141022L + "'", long52 == 141022L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 365 + "'", int68 == 365);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(instant70);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMillis((int) (short) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        boolean boolean17 = interval12.contains((org.joda.time.ReadableInterval) interval16);
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology18.seconds();
        mutablePeriod5.add(3599999000L, chronology18);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfEra();
        org.joda.time.Interval interval30 = property29.toInterval();
        boolean boolean31 = interval26.contains((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Chronology chronology32 = interval30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.secondOfMinute();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.era();
        org.joda.time.DateTime dateTime38 = property37.withMinimumValue();
        int int39 = property37.getMaximumValueOverall();
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale40.getScript();
        java.lang.String str42 = locale40.getDisplayCountry();
        int int43 = property37.getMaximumShortTextLength(locale40);
        org.joda.time.DateTime dateTime44 = property37.withMaximumValue();
        org.joda.time.LocalTime localTime45 = dateTime44.toLocalTime();
        int int46 = dateTimeField33.getMinimumValue((org.joda.time.ReadablePartial) localTime45);
        int[] intArray48 = chronology18.get((org.joda.time.ReadablePartial) localTime45, (-3L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField50 = localTime45.getField(365);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 365");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[23, 59, 59, 997]");
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder4 = builder0.setVariant("2022");
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("halfdays");
        java.util.Locale.Builder builder7 = builder6.clear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.Interval interval15 = property14.toInterval();
        boolean boolean16 = interval11.contains((org.joda.time.ReadableInterval) interval15);
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField19.getAsText((long) 'a', locale21);
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = dateTimeField19.getAsShortText(58406400000L, locale25);
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale27.getDisplayCountry(locale31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.Interval interval37 = property36.toInterval();
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.lang.String str39 = property36.getAsText(locale38);
        int int40 = property36.getMaximumValue();
        org.joda.time.format.PeriodPrinter periodPrinter41 = null;
        org.joda.time.format.PeriodParser periodParser42 = null;
        org.joda.time.format.PeriodFormatter periodFormatter43 = new org.joda.time.format.PeriodFormatter(periodPrinter41, periodParser42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter45 = periodFormatter43.withParseType(periodType44);
        java.util.Locale locale46 = periodFormatter43.getLocale();
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.lang.String str48 = locale47.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter49 = periodFormatter43.withLocale(locale47);
        java.util.Locale locale50 = locale47.stripExtensions();
        int int51 = property36.getMaximumShortTextLength(locale47);
        java.lang.String str52 = locale27.getDisplayScript(locale47);
        java.lang.String str53 = locale25.getDisplayName(locale27);
        java.util.Locale.Builder builder54 = builder7.setLocale(locale25);
        java.util.Locale.Builder builder55 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder57 = builder55.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "China" + "'", str32, "China");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "China" + "'", str33, "China");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022" + "'", str39, "2022");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 292278993 + "'", int40 == 292278993);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodFormatter45);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(periodFormatter49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        boolean boolean27 = dateTime25.isEqual(10L);
        org.joda.time.DateTime dateTime29 = dateTime25.withCenturyOfEra((int) (byte) 1);
        boolean boolean30 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime32 = dateTime25.withWeekyear(19);
        java.lang.String str34 = dateTime32.toString("\u7fa9\u5927\u5229\u6587");
        java.lang.Object obj36 = null;
        org.joda.time.Instant instant37 = new org.joda.time.Instant(obj36);
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        java.lang.String str39 = dateTimeZone38.toString();
        java.lang.String str41 = dateTimeZone38.getName((long) 10);
        long long44 = dateTimeZone38.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 76, dateTimeZone38);
        long long47 = dateTimeZone38.previousTransition(2L);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime32.toMutableDateTime(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str34, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 2L + "'", long47 == 2L);
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.joda.time.DateTime dateTime10 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType15);
        mutablePeriod16.setMonths((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime8.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTime dateTime21 = dateTime8.minusWeeks((int) (byte) 1);
        int int22 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property23 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime8.withYear(1969);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekyearOfCentury();
        boolean boolean30 = dateTimeFieldType0.isSupported(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.clockhourOfDay();
        java.lang.String str33 = dateTimeField31.getAsText((long) 111);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "24" + "'", str33, "24");
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property5.addWrapFieldToCopy(2022);
        org.joda.time.Interval interval8 = property5.toInterval();
        int int9 = property5.getMinimumValueOverall();
        boolean boolean10 = property5.isLeap();
        org.joda.time.DateTime dateTime11 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(19044);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekOfWeekyear();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField31 = chronology25.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.minuteOfDay();
        long long35 = dateTimeField32.add(111420000L, (-303L));
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 93240000L + "'", long35 == 93240000L);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Instant instant3 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1970);
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant3, (org.joda.time.ReadableInstant) dateTime5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.joda.time.Period period1 = org.joda.time.Period.millis(122);
        int int2 = period1.getMonths();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfEra();
        org.joda.time.Interval interval10 = property9.toInterval();
        boolean boolean11 = interval6.contains((org.joda.time.ReadableInterval) interval10);
        java.lang.String str12 = interval6.toString();
        long long13 = interval6.getEndMillis();
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval6);
        org.joda.time.Duration duration15 = interval6.toDuration();
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(category16, locale18);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("11");
        java.util.Locale.setDefault(category16, locale21);
        java.util.Locale locale23 = java.util.Locale.JAPAN;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.Interval interval27 = property26.toInterval();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.lang.String str29 = property26.getAsText(locale28);
        java.util.Set<java.lang.String> strSet30 = locale28.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale23.getDisplayCountry(locale28);
        java.util.Locale.setDefault(category16, locale28);
        java.util.Locale locale33 = java.util.Locale.getDefault(category16);
        boolean boolean34 = interval6.equals((java.lang.Object) category16);
        boolean boolean35 = period1.equals((java.lang.Object) category16);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str12, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1672531200000L + "'", long13 == 1672531200000L);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\uc77c\ubcf8" + "'", str31, "\uc77c\ubcf8");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant4 = instant2.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime.Property property9 = dateTime7.weekOfWeekyear();
        boolean boolean10 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime12 = dateTime7.withMillisOfDay(0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 6, (-3676492805054399977L), periodType15);
        org.joda.time.DateTime dateTime17 = dateTime7.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTime.Property property18 = dateTime7.era();
        org.joda.time.TimeOfDay timeOfDay19 = dateTime7.toTimeOfDay();
        org.joda.time.DateTime dateTime21 = dateTime7.minusWeeks(12);
        int int22 = dateTime21.getMinuteOfHour();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        int int7 = dateTime2.getEra();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfMonth();
        org.joda.time.DateTime.Property property10 = dateTime2.millisOfDay();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = period14.getFieldTypes();
        org.joda.time.Period period17 = period14.minusYears((int) (byte) 1);
        org.joda.time.Period period19 = period14.plusMonths((int) (byte) 0);
        org.joda.time.Period period21 = period14.withMillis((int) '#');
        org.joda.time.Weeks weeks22 = period14.toStandardWeeks();
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks25 = weeks23.dividedBy((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType27 = weeks23.getFieldType(0);
        org.joda.time.Period period29 = period14.withField(durationFieldType27, 0);
        org.joda.time.Period period31 = period14.multipliedBy((int) '4');
        org.joda.time.Duration duration32 = period31.toStandardDuration();
        org.joda.time.Duration duration35 = duration32.withDurationAdded((long) (short) 1, (int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Duration duration37 = duration32.minus(readableDuration36);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType40, chronology41);
        org.joda.time.PeriodType periodType43 = periodType40.withWeeksRemoved();
        org.joda.time.PeriodType periodType44 = periodType43.withSecondsRemoved();
        org.joda.time.PeriodType periodType45 = periodType44.withHoursRemoved();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration32, periodType45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period48 = period46.plusSeconds(364);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.joda.time.Days days1 = org.joda.time.Days.days(100);
        int int2 = days1.size();
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        int int6 = days4.get(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod7 = days4.toMutablePeriod();
        org.joda.time.Days days9 = days4.multipliedBy((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Days days12 = days10.dividedBy((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        int int15 = days13.get(durationFieldType14);
        boolean boolean16 = days10.isLessThan(days13);
        org.joda.time.PeriodType periodType17 = days13.getPeriodType();
        boolean boolean18 = days9.isLessThan(days13);
        boolean boolean19 = days1.isLessThan(days13);
        org.joda.time.Days days21 = days13.plus(53669954);
        org.joda.time.Days days22 = days13.negated();
        org.joda.time.Days days23 = days13.negated();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.joda.time.Period period1 = org.joda.time.Period.days(2922789);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(8);
        org.joda.time.Period period3 = period1.plusYears(364);
        org.joda.time.Period period5 = period3.minusMinutes((-292276));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 365, 38716L, chronology2);
        org.joda.time.Period period5 = period3.withMillis((-59));
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks8 = weeks6.plus(86399999);
        org.joda.time.Weeks weeks10 = weeks8.dividedBy(281);
        org.joda.time.DurationFieldType durationFieldType11 = weeks10.getFieldType();
        org.joda.time.PeriodType periodType12 = weeks10.getPeriodType();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = days6.get(durationFieldType7);
        mutablePeriod5.add(durationFieldType7, 8);
        int int11 = mutablePeriod5.getHours();
        mutablePeriod5.addMillis(10);
        mutablePeriod5.setSeconds((int) (short) -1);
        mutablePeriod5.addMonths(53669837);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = days6.get(durationFieldType7);
        mutablePeriod5.add(durationFieldType7, 8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutablePeriod5.add(readablePeriod11);
        int int13 = mutablePeriod5.getMonths();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.Interval interval21 = property20.toInterval();
        boolean boolean22 = interval17.contains((org.joda.time.ReadableInterval) interval21);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withZoneRetainFields(dateTimeZone29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime33 = instant32.toDateTime();
        org.joda.time.DateTime.Property property34 = dateTime33.era();
        org.joda.time.DateTime dateTime35 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.Duration duration38 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant39, periodType40);
        mutablePeriod41.setMonths((int) '4');
        org.joda.time.DateTime dateTime44 = dateTime33.plus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.DateTime dateTime46 = dateTime33.minusWeeks((int) (byte) 1);
        int int47 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property48 = dateTime33.minuteOfHour();
        org.joda.time.DateTime dateTime50 = dateTime33.withYear(1969);
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.DurationField durationField52 = durationFieldType25.getField(chronology51);
        mutablePeriod5.add((-43199999L), chronology51);
        org.joda.time.DurationField durationField54 = chronology51.millis();
        org.joda.time.DurationField durationField55 = chronology51.months();
        org.joda.time.DateTimeField dateTimeField56 = chronology51.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField57 = chronology51.monthOfYear();
        long long61 = chronology51.add(123811200001L, 86400467L, 19);
        org.joda.time.DateTimeField dateTimeField62 = chronology51.dayOfMonth();
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime65 = instant64.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.withZoneRetainFields(dateTimeZone66);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime70 = instant69.toDateTime();
        org.joda.time.DateTime.Property property71 = dateTime70.era();
        org.joda.time.DateTime dateTime72 = dateTime70.withTimeAtStartOfDay();
        org.joda.time.Duration duration75 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration75, readableInstant76, periodType77);
        mutablePeriod78.setMonths((int) '4');
        org.joda.time.DateTime dateTime81 = dateTime70.plus((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.DateTime dateTime83 = dateTime70.minusWeeks((int) (byte) 1);
        int int84 = dateTime67.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime.Property property85 = dateTime70.minuteOfHour();
        org.joda.time.DateTime dateTime87 = dateTime70.withYear(1969);
        org.joda.time.Chronology chronology88 = dateTime87.getChronology();
        org.joda.time.DateTimeField dateTimeField89 = chronology88.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField90 = chronology88.era();
        org.joda.time.DateTimeField dateTimeField91 = chronology88.secondOfDay();
        java.util.Locale locale93 = java.util.Locale.JAPANESE;
        java.lang.String str94 = dateTimeField91.getAsShortText(1, locale93);
        java.lang.String str95 = locale93.getVariant();
        java.lang.String str96 = locale93.getLanguage();
        int int97 = dateTimeField62.getMaximumShortTextLength(locale93);
        java.lang.String str98 = locale93.getISO3Country();
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 125452808874L + "'", long61 == 125452808874L);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(dateTimeField91);
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "1" + "'", str94, "1");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "ja" + "'", str96, "ja");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 2 + "'", int97 == 2);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("11");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str11 = locale8.getUnicodeLocaleType("AM");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime21 = instant20.toDateTime();
        org.joda.time.DateTime.Property property22 = dateTime21.era();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        int int24 = property22.getMaximumValueOverall();
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale29 = new java.util.Locale("", "hi!", "hi!");
        java.lang.String str30 = locale25.getDisplayCountry(locale29);
        java.lang.String str31 = locale29.getDisplayVariant();
        int int32 = property22.getMaximumShortTextLength(locale29);
        java.util.Locale.setDefault(category18, locale29);
        java.util.Locale locale34 = java.util.Locale.getDefault(category18);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str39 = locale36.getUnicodeLocaleType("AM");
        java.util.Locale locale40 = locale36.stripExtensions();
        java.lang.String str41 = locale34.getDisplayCountry(locale40);
        java.util.Locale.setDefault(category0, locale40);
        java.lang.Object obj43 = null;
        org.joda.time.Instant instant44 = new org.joda.time.Instant(obj43);
        org.joda.time.DateTimeZone dateTimeZone45 = instant44.getZone();
        java.lang.String str46 = dateTimeZone45.toString();
        int int48 = dateTimeZone45.getOffset(1L);
        boolean boolean50 = dateTimeZone45.isStandardOffset(0L);
        java.lang.String str52 = dateTimeZone45.getNameKey((long) 1);
        java.util.Locale locale54 = java.util.Locale.FRENCH;
        java.lang.String str55 = dateTimeZone45.getName((long) (byte) 10, locale54);
        java.lang.String str56 = locale54.getLanguage();
        java.lang.String str57 = locale54.getDisplayLanguage();
        java.lang.String str58 = locale54.getCountry();
        java.util.Locale.setDefault(category0, locale54);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale29.toString(), "_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Italy" + "'", str30, "Italy");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "_HI!_hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HI!" + "'", str41, "HI!");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00" + "'", str55, "+00:00");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "fr" + "'", str56, "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "francese" + "'", str57, "francese");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        int int22 = dateTime4.getDayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime25 = dateTime4.minusHours((-2147483648));
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds(78719999);
        org.joda.time.DateTime.Property property28 = dateTime25.millisOfSecond();
        int int29 = property28.getMaximumValue();
        org.joda.time.DateTime dateTime30 = property28.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 999 + "'", int29 == 999);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.millisOfDay();
        java.lang.String str28 = chronology25.toString();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.hourOfDay();
        org.joda.time.DurationField durationField30 = chronology25.minutes();
        long long32 = durationField30.getValueAsLong(1645455514365L);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ISOChronology[UTC]" + "'", str28, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 27424258L + "'", long32 == 27424258L);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-21), 75659999, 36, (-2147483648));
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        boolean boolean5 = property2.isLeap();
        java.lang.String str6 = property2.getAsString();
        java.lang.String str7 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022" + "'", str7, "2022");
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.standard();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.THREE;
        org.joda.time.DurationFieldType durationFieldType4 = weeks3.getFieldType();
        int int5 = periodType2.indexOf(durationFieldType4);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType2);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (short) 10, (long) (byte) 0);
        mutablePeriod9.setDays(3);
        int int12 = mutablePeriod9.getHours();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        org.joda.time.DateTime dateTime24 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.Duration duration27 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant28, periodType29);
        mutablePeriod30.setMonths((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime22.plus((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.DateTime dateTime35 = dateTime22.minusWeeks((int) (byte) 1);
        int int36 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property37 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime39 = dateTime22.withYear(1969);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DurationField durationField41 = durationFieldType14.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.clockhourOfHalfday();
        mutablePeriod9.add((-3600000L), chronology40);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 42, 90326018515345L, periodType2, chronology40);
        int int45 = periodType2.size();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZone(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean11 = dateTime7.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime2.property(dateTimeFieldType10);
        org.joda.time.DateTime.Property property13 = dateTime2.dayOfMonth();
        org.joda.time.Days days14 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        int int16 = days14.get(durationFieldType15);
        org.joda.time.MutablePeriod mutablePeriod17 = days14.toMutablePeriod();
        org.joda.time.Days days19 = days14.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration20 = days14.toStandardDuration();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant24 = instant22.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime25 = instant22.toMutableDateTimeISO();
        int int26 = mutableDateTime25.getDayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) mutableDateTime25);
        long long28 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DurationField durationField29 = property13.getRangeDurationField();
        long long31 = durationField29.getValueAsLong(141022L);
        boolean boolean32 = durationField29.isSupported();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.Period period3 = period1.plusWeeks((int) (byte) 1);
        int int4 = period1.size();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Period period6 = period1.minus(readablePeriod5);
        org.joda.time.Period period8 = period1.minusWeeks(2);
        org.joda.time.Period period10 = period8.withHours(1969);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period13 = period10.withMinutes((-546));
        int int14 = period10.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZone(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean11 = dateTime7.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime2.property(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime2.getZone();
        org.joda.time.LocalDateTime localDateTime14 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime dateTime15 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.DateTime dateTime20 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean22 = dateTime18.isSupported(dateTimeFieldType21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18, periodType23);
        org.joda.time.DateTime.Property property26 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime27 = property26.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setPeriod((long) 1, (-1L));
        mutablePeriod5.setMillis((int) (short) 0);
        mutablePeriod5.setWeeks(7);
        java.lang.Object obj13 = mutablePeriod5.clone();
        int int14 = mutablePeriod5.getYears();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.DurationFieldType durationFieldType16 = minutes15.getFieldType();
        org.joda.time.Minutes minutes17 = minutes15.negated();
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "P7W");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "P7W");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "P7W");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(minutes17);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.clockhourOfHalfday();
        java.lang.Object obj14 = null;
        org.joda.time.Instant instant15 = new org.joda.time.Instant(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffset(1L);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone16.getNameKey((long) 1);
        java.lang.String str25 = dateTimeZone16.getNameKey((long) (short) 10);
        java.lang.String str27 = dateTimeZone16.getNameKey(0L);
        org.joda.time.Chronology chronology28 = chronology9.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.Interval interval36 = property35.toInterval();
        boolean boolean37 = interval32.contains((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.minuteOfDay();
        org.joda.time.DurationField durationField41 = chronology38.seconds();
        org.joda.time.DurationField durationField42 = chronology38.days();
        boolean boolean43 = dateTimeZone16.equals((java.lang.Object) chronology38);
        long long45 = dateTimeZone16.convertUTCToLocal(2980800894L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2980800894L + "'", long45 == 2980800894L);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValue();
        int int5 = property2.getMaximumValueOverall();
        org.joda.time.DateTime dateTime6 = property2.roundHalfEvenCopy();
        int int7 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 292278993 + "'", int4 == 292278993);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 292278993 + "'", int5 == 292278993);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = duration2.toPeriodTo(readableInstant6);
        org.joda.time.Days days8 = duration2.toStandardDays();
        long long9 = duration2.getStandardSeconds();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant13 = instant11.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant11.toMutableDateTimeISO();
        java.lang.Object obj15 = null;
        org.joda.time.Instant instant16 = new org.joda.time.Instant(obj15);
        boolean boolean17 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.Instant instant24 = instant16.minus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration30 = duration27.plus((long) (byte) 0);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((-1L), 10L);
        long long34 = duration33.getStandardDays();
        org.joda.time.Duration duration35 = duration30.plus((org.joda.time.ReadableDuration) duration33);
        boolean boolean36 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = duration39.toPeriod(chronology40);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType46);
        org.joda.time.Days days48 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.minutes();
        int int50 = days48.get(durationFieldType49);
        mutablePeriod47.add(durationFieldType49, 8);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutablePeriod47.add(readablePeriod53);
        int int55 = mutablePeriod47.getMonths();
        org.joda.time.ReadableInterval readableInterval56 = null;
        mutablePeriod47.add(readableInterval56);
        org.joda.time.Days days58 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.minutes();
        int int60 = days58.get(durationFieldType59);
        org.joda.time.MutablePeriod mutablePeriod61 = days58.toMutablePeriod();
        org.joda.time.Days days63 = days58.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration64 = days58.toStandardDuration();
        mutablePeriod47.setPeriod((org.joda.time.ReadableDuration) duration64);
        boolean boolean66 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration64);
        boolean boolean67 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration64);
        boolean boolean68 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration23);
        long long69 = duration23.getStandardDays();
        org.joda.time.Duration duration70 = duration23.toDuration();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod61);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(duration70);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = hours0.minus((int) (short) 100);
        org.joda.time.Hours hours3 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours5 = hours3.multipliedBy(0);
        org.joda.time.Hours hours7 = hours3.dividedBy(69);
        org.joda.time.Hours hours8 = hours3.negated();
        boolean boolean9 = hours2.isGreaterThan(hours8);
        org.joda.time.Hours hours10 = hours8.negated();
        org.joda.time.Hours hours11 = hours10.negated();
        java.lang.String str12 = hours11.toString();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-8H" + "'", str12, "PT-8H");
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.joda.time.Period period1 = new org.joda.time.Period(1151828812800000L);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1970);
        org.joda.time.Period period3 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period5 = period3.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration12 = null;
        boolean boolean13 = duration10.isEqual(readableDuration12);
        org.joda.time.Duration duration15 = duration10.minus((long) 1);
        org.joda.time.Duration duration17 = duration15.minus((long) '4');
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration30 = duration27.plus((long) (byte) 0);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime33 = instant32.toDateTime();
        boolean boolean35 = dateTime33.isEqual(10L);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType38, chronology39);
        org.joda.time.PeriodType periodType41 = periodType38.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, (org.joda.time.ReadableInstant) dateTime33, periodType41);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration24, periodType41);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime20, periodType44);
        boolean boolean46 = duration7.isEqual((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime47 = dateTime1.minus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.DateTime.Property property48 = dateTime47.year();
        java.lang.String str49 = property48.getName();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "year" + "'", str49, "year");
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.days();
        int int2 = periodType0.indexOf(durationFieldType1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        org.joda.time.DateTime dateTime12 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType17);
        mutablePeriod18.setMonths((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime10.plus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTime dateTime23 = dateTime10.minusWeeks((int) (byte) 1);
        int int24 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property25 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime27 = dateTime10.withYear(1969);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.era();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.minuteOfDay();
        boolean boolean32 = durationFieldType1.isSupported(chronology28);
        org.joda.time.DurationField durationField33 = chronology28.hours();
        long long36 = durationField33.getMillis(78719999, (long) 36);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 283391996400000L + "'", long36 == 283391996400000L);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime2.toTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        long long12 = dateTimeField9.add(0L, (long) (short) 1);
        long long14 = dateTimeField9.roundHalfCeiling((long) 2);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant22 = instant20.minus(100L);
        org.joda.time.Instant instant24 = instant22.plus((long) 100);
        org.joda.time.Instant instant26 = instant22.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.LocalTime localTime28 = dateTime17.toLocalTime();
        org.joda.time.Duration duration32 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33, periodType34);
        mutablePeriod35.setMonths((int) '4');
        org.joda.time.Period period38 = mutablePeriod35.toPeriod();
        int[] intArray39 = period38.getValues();
        int[] intArray41 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localTime28, 0, intArray39, 3);
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) timeOfDay6, (org.joda.time.ReadablePartial) localTime28);
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes44 = minutes42.minus(minutes43);
        org.joda.time.Minutes minutes45 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes48 = minutes46.minus((int) (short) -1);
        boolean boolean49 = minutes45.isGreaterThan(minutes46);
        org.joda.time.Minutes minutes50 = null;
        org.joda.time.Minutes minutes51 = minutes46.minus(minutes50);
        int int52 = minutes46.getMinutes();
        org.joda.time.Minutes minutes53 = minutes43.plus(minutes46);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DateTime.Property property57 = dateTime56.yearOfEra();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.yearOfEra();
        org.joda.time.Interval interval62 = property61.toInterval();
        boolean boolean63 = interval58.contains((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Chronology chronology64 = interval62.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.weeks();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.yearOfEra();
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType54.getField(chronology64);
        org.joda.time.DateTimeField dateTimeField69 = chronology64.millisOfDay();
        org.joda.time.Period period70 = new org.joda.time.Period((java.lang.Object) minutes53, chronology64);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType72 = period70.getFieldType(76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 43200000L + "'", long12 == 43200000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 52, 0, 0, 0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 52, 0, 0, 0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2147483648) + "'", int52 == (-2147483648));
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = dateTime7.get(dateTimeFieldType25);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType25.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 86399999 + "'", int26 == 86399999);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        java.util.Locale locale5 = periodFormatter2.getLocale();
        boolean boolean6 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType7 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration14 = duration11.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = duration11.toPeriodTo(readableInstant15);
        org.joda.time.Duration duration18 = duration11.withMillis((long) (short) 0);
        java.lang.String str19 = duration18.toString();
        org.joda.time.Duration duration20 = duration18.toDuration();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21, periodType22);
        org.joda.time.PeriodType periodType24 = periodType22.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter25 = periodFormatter2.withParseType(periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = periodFormatter2.parsePeriod("+45:01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertNull(periodPrinter8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodFormatter25);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean5 = dateTimeZone2.isStandardOffset((long) '4');
        boolean boolean6 = dateTimeZone2.isFixed();
        long long8 = dateTimeZone2.convertUTCToLocal(3599999L);
        java.lang.String str10 = dateTimeZone2.getNameKey((long) (byte) -1);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale16 = new java.util.Locale("", "hi!", "hi!");
        java.lang.String str17 = locale12.getDisplayCountry(locale16);
        java.lang.String str18 = locale16.getDisplayVariant();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale16.getDisplayVariant(locale19);
        java.lang.String str21 = locale19.toLanguageTag();
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str24 = locale19.getDisplayVariant(locale22);
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.lang.String str26 = locale25.getLanguage();
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.lang.String str28 = dateTimeZone2.getShortName(0L, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3599999L + "'", long8 == 3599999L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale16.toString(), "_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italy" + "'", str17, "Italy");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ja" + "'", str26, "ja");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u53f0\u6e7e" + "'", str27, "\u53f0\u6e7e");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.minutes();
        int int2 = days0.get(durationFieldType1);
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        boolean boolean4 = days0.isLessThan(days3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        boolean boolean13 = interval8.contains((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfHour();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType21);
        mutablePeriod22.setMonths((int) '4');
        org.joda.time.Period period25 = mutablePeriod22.toPeriod();
        mutablePeriod22.setYears((int) (short) -1);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration33 = duration30.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration30.toPeriodTo(readableInstant34);
        org.joda.time.Days days36 = duration30.toStandardDays();
        boolean boolean37 = mutablePeriod22.equals((java.lang.Object) days36);
        org.joda.time.Days days38 = org.joda.time.Days.FIVE;
        boolean boolean39 = days36.isLessThan(days38);
        org.joda.time.PeriodType periodType40 = days36.getPeriodType();
        org.joda.time.Days days42 = org.joda.time.Days.days(0);
        org.joda.time.Days days44 = days42.dividedBy((int) (short) 10);
        org.joda.time.Days days45 = days36.plus(days42);
        int[] intArray48 = chronology14.get((org.joda.time.ReadablePeriod) days36, (long) (-2147483648), 43199999L);
        org.joda.time.DurationFieldType durationFieldType49 = days36.getFieldType();
        org.joda.time.Days days51 = org.joda.time.Days.days(999);
        org.joda.time.Duration duration54 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration54, readableInstant55, periodType56);
        mutablePeriod57.setMonths((int) '4');
        org.joda.time.Period period60 = mutablePeriod57.toPeriod();
        mutablePeriod57.setYears((int) (short) -1);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period66 = duration65.toPeriod();
        org.joda.time.Duration duration68 = duration65.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = duration65.toPeriodTo(readableInstant69);
        org.joda.time.Days days71 = duration65.toStandardDays();
        boolean boolean72 = mutablePeriod57.equals((java.lang.Object) days71);
        org.joda.time.Days days73 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.minutes();
        int int75 = days73.get(durationFieldType74);
        boolean boolean76 = days71.isGreaterThan(days73);
        org.joda.time.Duration duration79 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration79, readableInstant80, periodType81);
        mutablePeriod82.setHours((int) (byte) 100);
        org.joda.time.Days days85 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType86 = org.joda.time.DurationFieldType.minutes();
        int int87 = days85.get(durationFieldType86);
        mutablePeriod82.set(durationFieldType86, (int) 'x');
        int int90 = days73.get(durationFieldType86);
        boolean boolean91 = days51.isGreaterThan(days73);
        org.joda.time.Days days92 = days36.minus(days51);
        boolean boolean93 = days3.isLessThan(days51);
        org.joda.time.Period period94 = days51.toPeriod();
        org.joda.time.Period period96 = period94.minusMinutes(43199999);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[25]");
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(days71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(days73);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(days85);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(days92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        java.lang.Object obj14 = null;
        org.joda.time.Instant instant15 = new org.joda.time.Instant(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffset(1L);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        org.joda.time.DateTime dateTime22 = dateTime2.withZoneRetainFields(dateTimeZone16);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int35 = mutablePeriod34.getDays();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfEra();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfEra();
        org.joda.time.Interval interval45 = property44.toInterval();
        boolean boolean46 = interval41.contains((org.joda.time.ReadableInterval) interval45);
        org.joda.time.Chronology chronology47 = interval45.getChronology();
        mutablePeriod34.setPeriod((long) 'u', (long) 1969, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 100, chronology47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(1645455304L, chronology47);
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(chronology47);
        org.joda.time.DurationField durationField52 = chronology47.months();
        org.joda.time.DateTimeField dateTimeField53 = chronology47.millisOfSecond();
        org.joda.time.DurationField durationField54 = chronology47.minutes();
        org.joda.time.DateTime dateTime55 = dateTime22.toDateTime(chronology47);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTime55);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setPeriod(893, 101, 2022, (int) (short) -1, 120, 12, 4, 78719999);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        boolean boolean23 = interval18.contains((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.Interval interval31 = property30.toInterval();
        boolean boolean32 = interval27.contains((org.joda.time.ReadableInterval) interval31);
        boolean boolean33 = interval22.contains((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Chronology chronology34 = interval22.getChronology();
        org.joda.time.Hours hours35 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval22);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInterval) interval22);
        int int37 = mutablePeriod5.getMinutes();
        org.joda.time.Duration duration40 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period41 = duration40.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray42 = period41.getFieldTypes();
        int int43 = period41.getMinutes();
        org.joda.time.Period period45 = period41.withDays((int) ' ');
        org.joda.time.Period period47 = period45.withYears(86399);
        org.joda.time.Period period52 = new org.joda.time.Period(0, (int) (byte) -1, (int) '#', 7);
        org.joda.time.Period period53 = period45.plus((org.joda.time.ReadablePeriod) period52);
        java.lang.String str54 = period53.toString();
        mutablePeriod5.add((org.joda.time.ReadablePeriod) period53);
        mutablePeriod5.addMillis((-675));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldTypeArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "P32DT-1M35.007S" + "'", str54, "P32DT-1M35.007S");
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMillis((int) (short) 1);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period11.getFieldTypes();
        org.joda.time.Period period14 = period11.minusYears((int) (byte) 1);
        org.joda.time.Period period16 = period11.plusMonths((int) (byte) 0);
        org.joda.time.Period period18 = period11.withMillis((int) '#');
        org.joda.time.Period period20 = period18.minusMinutes((int) 'u');
        boolean boolean21 = mutablePeriod5.equals((java.lang.Object) period18);
        org.joda.time.Period period23 = period18.plusMillis(53786950);
        org.joda.time.Period period25 = period23.plusYears(999);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = period23.withField(durationFieldType27, 54192);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(2);
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy((int) 'x');
        org.joda.time.DurationFieldType durationFieldType4 = seconds1.getFieldType();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        boolean boolean9 = interval4.contains((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfEra();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        boolean boolean18 = interval13.contains((org.joda.time.ReadableInterval) interval17);
        java.lang.Object obj19 = null;
        org.joda.time.Instant instant20 = new org.joda.time.Instant(obj19);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone21);
        boolean boolean24 = interval13.contains((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        boolean boolean29 = interval13.contains((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.Interval interval37 = property36.toInterval();
        boolean boolean38 = interval33.contains((org.joda.time.ReadableInterval) interval37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfEra();
        org.joda.time.Interval interval46 = property45.toInterval();
        boolean boolean47 = interval42.contains((org.joda.time.ReadableInterval) interval46);
        boolean boolean48 = interval37.contains((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        org.joda.time.DateTime.Property property51 = dateTime50.yearOfEra();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfEra();
        org.joda.time.Interval interval56 = property55.toInterval();
        boolean boolean57 = interval52.contains((org.joda.time.ReadableInterval) interval56);
        java.lang.String str58 = interval56.toString();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.yearOfEra();
        org.joda.time.Interval interval62 = property61.toInterval();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        org.joda.time.DateTime.Property property65 = dateTime64.yearOfEra();
        org.joda.time.Interval interval66 = property65.toInterval();
        boolean boolean67 = interval62.contains((org.joda.time.ReadableInterval) interval66);
        boolean boolean68 = interval56.isBefore((org.joda.time.ReadableInterval) interval66);
        boolean boolean69 = interval42.overlaps((org.joda.time.ReadableInterval) interval66);
        boolean boolean70 = interval13.isAfter((org.joda.time.ReadableInterval) interval66);
        boolean boolean71 = interval4.isAfter((org.joda.time.ReadableInterval) interval66);
        org.joda.time.DateTime dateTime72 = interval66.getStart();
        org.joda.time.DateMidnight dateMidnight73 = dateTime72.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str58, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateMidnight73);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMonths((int) (short) 10);
        org.joda.time.Period period5 = period1.plusHours(86399);
        org.joda.time.Period period6 = period5.toPeriod();
        org.joda.time.Period period8 = period6.withHours(0);
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.joda.time.Period period11 = period6.withHours(2147483647);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Hours hours3 = duration2.toStandardHours();
        org.joda.time.MutablePeriod mutablePeriod4 = hours3.toMutablePeriod();
        mutablePeriod4.addDays(97);
        org.joda.time.DurationFieldType durationFieldType8 = mutablePeriod4.getFieldType(4);
        mutablePeriod4.addHours(43198030);
        mutablePeriod4.setMillis(0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration2.isEqual(readableDuration4);
        org.joda.time.Duration duration7 = duration2.minus((long) 1);
        org.joda.time.Duration duration9 = duration7.minus((long) '4');
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        boolean boolean27 = dateTime25.isEqual(10L);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime25, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration16, periodType33);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime12, periodType36);
        org.joda.time.Duration duration39 = duration7.minus((long) 7);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int50 = mutablePeriod49.getDays();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfEra();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.Interval interval60 = property59.toInterval();
        boolean boolean61 = interval56.contains((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        mutablePeriod49.setPeriod((long) 'u', (long) 1969, chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period((long) (byte) 100, chronology62);
        org.joda.time.Period period65 = duration39.toPeriod(chronology62);
        org.joda.time.DateTimeField dateTimeField66 = chronology62.minuteOfDay();
        long long68 = dateTimeField66.roundFloor((long) 1970);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = duration2.toPeriodTo(readableInstant6);
        org.joda.time.Duration duration9 = duration2.withMillis((long) (short) 0);
        org.joda.time.Duration duration12 = duration2.withDurationAdded((long) 1, (int) ' ');
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        boolean boolean17 = dateTime15.isEqual(10L);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime15, periodType18);
        org.joda.time.DateTime dateTime21 = dateTime15.minusSeconds((int) 'a');
        org.joda.time.DateTime dateTime23 = dateTime21.plusMillis(31);
        org.joda.time.ReadablePartial readablePartial24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withFields(readablePartial24);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime.Property property31 = dateTime30.weekOfWeekyear();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant35 = instant33.minus(100L);
        org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime30.getZone();
        java.lang.String str39 = dateTimeZone37.getName((long) 'a');
        int int41 = dateTimeZone37.getOffsetFromLocal(0L);
        org.joda.time.DateTime dateTime42 = dateTime25.withZoneRetainFields(dateTimeZone37);
        org.joda.time.Instant instant43 = dateTime25.toInstant();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(instant43);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1970);
        org.joda.time.DateTime dateTime3 = dateTime1.plusDays(11);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType8);
        mutablePeriod9.setMonths((int) '4');
        org.joda.time.Period period12 = mutablePeriod9.toPeriod();
        mutablePeriod9.setYears((int) (short) -1);
        mutablePeriod9.addDays(10);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType21);
        long long23 = duration19.getStandardSeconds();
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration30 = duration27.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration27.toPeriodTo(readableInstant31);
        org.joda.time.Duration duration34 = duration27.withMillis((long) (short) 0);
        java.lang.String str35 = duration34.toString();
        org.joda.time.Duration duration36 = duration34.toDuration();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, readableInstant37, periodType38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getRangeDurationType();
        mutablePeriod39.add(durationFieldType41, 11);
        java.lang.String str44 = durationFieldType41.getName();
        mutablePeriod9.set(durationFieldType41, (-27349920));
        org.joda.time.DateTime dateTime48 = dateTime3.withFieldAdded(durationFieldType41, 98);
        org.joda.time.DateTime.Property property49 = dateTime48.era();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "days" + "'", str44, "days");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = days6.get(durationFieldType7);
        mutablePeriod5.add(durationFieldType7, 8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutablePeriod5.add(readablePeriod11);
        int int13 = mutablePeriod5.getMillis();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod5.add((long) 8, chronology15);
        mutablePeriod5.addDays(7);
        mutablePeriod5.setMinutes(436320);
        org.joda.time.format.PeriodPrinter periodPrinter21 = null;
        org.joda.time.format.PeriodParser periodParser22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = new org.joda.time.format.PeriodFormatter(periodPrinter21, periodParser22);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter23.withParseType(periodType24);
        java.util.Locale locale27 = periodFormatter23.getLocale();
        org.joda.time.PeriodType periodType28 = periodFormatter23.getParseType();
        org.joda.time.PeriodType periodType29 = periodFormatter23.getParseType();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType32, chronology33);
        org.joda.time.PeriodType periodType35 = periodType32.withWeeksRemoved();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter23.withParseType(periodType36);
        org.joda.time.PeriodType periodType39 = periodType36.withYearsRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) mutablePeriod5, periodType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(periodType28);
        org.junit.Assert.assertNull(periodType29);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodFormatter38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("11");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str11 = locale8.getUnicodeLocaleType("AM");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime21 = instant20.toDateTime();
        org.joda.time.DateTime.Property property22 = dateTime21.era();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        int int24 = property22.getMaximumValueOverall();
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale29 = new java.util.Locale("", "hi!", "hi!");
        java.lang.String str30 = locale25.getDisplayCountry(locale29);
        java.lang.String str31 = locale29.getDisplayVariant();
        int int32 = property22.getMaximumShortTextLength(locale29);
        java.util.Locale.setDefault(category18, locale29);
        java.util.Locale locale34 = java.util.Locale.getDefault(category18);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str39 = locale36.getUnicodeLocaleType("AM");
        java.util.Locale locale40 = locale36.stripExtensions();
        java.lang.String str41 = locale34.getDisplayCountry(locale40);
        java.util.Locale.setDefault(category0, locale40);
        java.util.Locale locale43 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale29.toString(), "_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Italy" + "'", str30, "Italy");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "_HI!_hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HI!" + "'", str41, "HI!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        long long16 = dateTime2.getMillis();
        int int17 = dateTime2.getYearOfCentury();
        java.lang.String str18 = dateTime2.toString();
        org.joda.time.DateTime dateTime20 = dateTime2.plusDays(53669869);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 69 + "'", int17 == 69);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str18, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.DateTime.Property property3 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.minusSeconds((int) 'u');
        boolean boolean6 = dateTime5.isBeforeNow();
        boolean boolean8 = dateTime5.isEqual(0L);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        int int14 = property12.getMaximumValueOverall();
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.getDisplayCountry();
        int int18 = property12.getMaximumShortTextLength(locale15);
        org.joda.time.DateTime dateTime19 = property12.withMaximumValue();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.weekOfWeekyear();
        org.joda.time.Duration duration28 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType30);
        org.joda.time.DateTime dateTime32 = dateTime24.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTime dateTime34 = dateTime24.withYearOfEra(9);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime34);
        int int36 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime34);
        int int37 = dateTime34.getMonthOfYear();
        java.lang.String str38 = dateTime34.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = dateTime34.toString(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 12 + "'", int37 == 12);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0009-12-31T23:59:59.999Z" + "'", str38, "0009-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0009-12-31T23:59:59.999Z" + "'", str40, "0009-12-31T23:59:59.999Z");
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Duration duration7 = duration4.plus((long) (byte) 0);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        boolean boolean12 = dateTime10.isEqual(10L);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType15, chronology16);
        org.joda.time.PeriodType periodType18 = periodType15.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime10, periodType18);
        org.joda.time.PeriodType periodType20 = periodType18.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1898, 86405467L, periodType18);
        org.joda.time.PeriodType periodType22 = periodType18.withWeeksRemoved();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'a', (int) (byte) -1, (-9859), 1958, 3909);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1958 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Duration duration7 = duration4.plus((long) (byte) 0);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        boolean boolean12 = dateTime10.isEqual(10L);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType15, chronology16);
        org.joda.time.PeriodType periodType18 = periodType15.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime10, periodType18);
        org.joda.time.PeriodType periodType20 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withMillisRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period(475286399L, (long) 54142, periodType20);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-10), 97, 99, 69);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        boolean boolean13 = interval8.contains((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        long long15 = interval12.toDurationMillis();
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval12);
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod4.toMutablePeriod();
        mutablePeriod17.setMillis((-624));
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 31536000000L + "'", long15 == 31536000000L);
        org.junit.Assert.assertNotNull(mutablePeriod17);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.minus(100L);
        org.joda.time.Instant instant9 = instant7.plus((long) 100);
        org.joda.time.Instant instant11 = instant7.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.LocalTime localTime13 = dateTime2.toLocalTime();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (short) 1, (long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType21, chronology22);
        org.joda.time.PeriodType periodType24 = periodType21.withWeeksRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration16, periodType24);
        org.joda.time.DateTime.Property property27 = dateTime2.weekyear();
        int int28 = property27.getMinimumValue();
        org.joda.time.DurationField durationField29 = property27.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-292275054) + "'", int28 == (-292275054));
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ONE;
        org.joda.time.MutablePeriod mutablePeriod2 = seconds1.toMutablePeriod();
        boolean boolean3 = seconds0.isGreaterThan(seconds1);
        java.lang.String str4 = seconds0.toString();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds7 = seconds5.plus((int) (short) 1);
        int int8 = seconds0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds5);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn(readableInterval9);
        org.joda.time.Seconds seconds12 = seconds10.plus((int) (byte) -1);
        org.joda.time.Seconds seconds14 = seconds10.multipliedBy((int) (byte) 0);
        boolean boolean15 = seconds5.isLessThan(seconds10);
        org.joda.time.Seconds seconds16 = seconds10.negated();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy(0);
        org.joda.time.Duration duration3 = seconds2.toStandardDuration();
        java.lang.String str4 = seconds2.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes21 = minutes19.minus((int) (short) -1);
        boolean boolean22 = minutes18.isGreaterThan(minutes19);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.TWO;
        boolean boolean24 = minutes18.isLessThan(minutes23);
        org.joda.time.DateTime dateTime25 = dateTime8.plus((org.joda.time.ReadablePeriod) minutes18);
        org.joda.time.DateTime.Property property26 = dateTime25.year();
        org.joda.time.DateTime dateTime28 = property26.addWrapFieldToCopy(10);
        org.joda.time.DateTime dateTime29 = property26.roundHalfCeilingCopy();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime32 = instant31.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZoneRetainFields(dateTimeZone33);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        org.joda.time.DateTime dateTime39 = dateTime37.withTimeAtStartOfDay();
        org.joda.time.Duration duration42 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43, periodType44);
        mutablePeriod45.setMonths((int) '4');
        org.joda.time.DateTime dateTime48 = dateTime37.plus((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.DateTime dateTime50 = dateTime37.minusWeeks((int) (byte) 1);
        int int51 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime52 = dateTime34.toDateTimeISO();
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfHour();
        boolean boolean54 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Instant instant23 = dateTime20.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime20.withMillis((long) '4');
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime20);
        int int27 = dateTime20.getYear();
        org.joda.time.DateTime.Property property28 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime30 = dateTime20.plusWeeks(53669837);
        org.joda.time.DateTime.Property property31 = dateTime20.centuryOfEra();
        org.joda.time.DateTime dateTime32 = property31.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime34 = property31.addWrapFieldToCopy(1073741825);
        org.joda.time.DateTime dateTime35 = property31.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1969 + "'", int27 == 1969);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration2.isEqual(readableDuration4);
        org.joda.time.Duration duration7 = duration2.minus((long) 1);
        org.joda.time.Duration duration9 = duration7.minus((long) '4');
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        boolean boolean27 = dateTime25.isEqual(10L);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime25, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration16, periodType33);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime12, periodType36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = dateTime12.withMonthOfYear(436320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 436320 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial6 = null;
        int int7 = dateTimeField2.getMinimumValue(readablePartial6);
        long long10 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = dateTimeField2.getType();
        long long13 = dateTimeField2.remainder(432000000L);
        int int15 = dateTimeField2.getLeapAmount((long) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        java.lang.String str17 = dateTimeFieldType16.getName();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withZoneRetainFields(dateTimeZone21);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.joda.time.DateTime.Property property26 = dateTime25.era();
        org.joda.time.DateTime dateTime27 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31, periodType32);
        mutablePeriod33.setMonths((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime25.plus((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTime dateTime38 = dateTime25.minusWeeks((int) (byte) 1);
        int int39 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property40 = dateTime25.minuteOfHour();
        org.joda.time.DateTime dateTime42 = dateTime25.withYear(1969);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.year();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.era();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType16.getField(chronology43);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType48.getField(chronology49);
        int int52 = dateTimeField50.get((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType53.getField(chronology54);
        long long58 = dateTimeField55.add(0L, (long) (short) 1);
        long long60 = dateTimeField55.roundHalfCeiling((long) 2);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime63 = instant62.toDateTime();
        org.joda.time.DateTime.Property property64 = dateTime63.era();
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant68 = instant66.minus(100L);
        org.joda.time.Instant instant70 = instant68.plus((long) 100);
        org.joda.time.Instant instant72 = instant68.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes73 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.LocalTime localTime74 = dateTime63.toLocalTime();
        org.joda.time.Duration duration78 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration78, readableInstant79, periodType80);
        mutablePeriod81.setMonths((int) '4');
        org.joda.time.Period period84 = mutablePeriod81.toPeriod();
        int[] intArray85 = period84.getValues();
        int[] intArray87 = dateTimeField55.addWrapField((org.joda.time.ReadablePartial) localTime74, 0, intArray85, 3);
        int int88 = localTime74.size();
        int int89 = dateTimeField50.getMaximumValue((org.joda.time.ReadablePartial) localTime74);
        java.lang.String str90 = localTime74.toString();
        int int91 = dateTimeField47.getMaximumValue((org.joda.time.ReadablePartial) localTime74);
        int int92 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localTime74);
        long long95 = dateTimeField2.getDifferenceAsLong((-1921997864959L), (-26179201L));
        org.joda.time.DurationField durationField96 = dateTimeField2.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 43200000L + "'", long5 == 43200000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "year" + "'", str17, "year");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 43200000L + "'", long58 == 43200000L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(instant70);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 52, 0, 0, 0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[1, 52, 0, 0, 0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "23:59:59.999" + "'", str90, "23:59:59.999");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 292278993 + "'", int91 == 292278993);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-44490L) + "'", long95 == (-44490L));
        org.junit.Assert.assertNotNull(durationField96);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        boolean boolean5 = dateTime3.isEqual(10L);
        org.joda.time.DateTime dateTime7 = dateTime3.withCenturyOfEra((int) (byte) 1);
        int int8 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.minus((int) (short) -1);
        boolean boolean13 = minutes9.isGreaterThan(minutes10);
        org.joda.time.Minutes minutes14 = null;
        org.joda.time.Minutes minutes15 = minutes10.minus(minutes14);
        org.joda.time.Minutes minutes17 = minutes10.plus((int) (short) 1);
        org.joda.time.PeriodType periodType18 = minutes17.getPeriodType();
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.TWO;
        boolean boolean20 = minutes17.isLessThan(minutes19);
        org.joda.time.Minutes minutes22 = minutes19.minus(70);
        org.joda.time.DurationFieldType durationFieldType23 = minutes19.getFieldType();
        org.joda.time.DateTime dateTime25 = dateTime3.withFieldAdded(durationFieldType23, (-1));
        int int26 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime3.withMonthOfYear(7);
        org.joda.time.DateTime dateTime30 = dateTime28.minusDays((-278));
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime33 = instant32.toDateTime();
        org.joda.time.DateTime.Property property34 = dateTime33.era();
        org.joda.time.DateTime dateTime35 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.Instant instant36 = dateTime33.toInstant();
        org.joda.time.DateMidnight dateMidnight37 = dateTime33.toDateMidnight();
        org.joda.time.DateTime dateTime40 = dateTime33.withDurationAdded(0L, (int) 'a');
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period44 = duration43.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = period44.getFieldTypes();
        org.joda.time.Period period47 = period44.minusYears((int) (byte) 1);
        org.joda.time.Period period49 = period44.plusMonths((int) (byte) 0);
        int int50 = period44.size();
        org.joda.time.Period period52 = period44.plusYears(100);
        org.joda.time.Period period54 = period44.minusSeconds(292278993);
        org.joda.time.Duration duration57 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration57, readableInstant58, periodType59);
        mutablePeriod60.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.days();
        mutablePeriod60.add(durationFieldType63, 8);
        boolean boolean66 = period44.isSupported(durationFieldType63);
        org.joda.time.DateTime dateTime68 = dateTime33.withFieldAdded(durationFieldType63, (-2147483648));
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = dateTime33.toDateTime(chronology69);
        org.joda.time.DateTime dateTime72 = dateTime70.plusDays(69);
        boolean boolean73 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 59 + "'", int26 == 59);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldTypeArray45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.minutes();
        int int2 = days0.get(durationFieldType1);
        org.joda.time.MutablePeriod mutablePeriod3 = days0.toMutablePeriod();
        org.joda.time.Days days5 = days0.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration6 = days0.toStandardDuration();
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.minutes();
        int int9 = days7.get(durationFieldType8);
        org.joda.time.MutablePeriod mutablePeriod10 = days7.toMutablePeriod();
        org.joda.time.Days days12 = days7.multipliedBy((int) (byte) 1);
        org.joda.time.Days days13 = days0.minus(days7);
        org.joda.time.DurationFieldType durationFieldType14 = days13.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        java.util.Locale locale2 = new java.util.Locale("JAPANESE (JAPAN)", "PT0.011S");
        org.junit.Assert.assertEquals(locale2.toString(), "japanese (japan)_PT0.011S");
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes1.minus((int) (short) -1);
        boolean boolean4 = minutes0.isGreaterThan(minutes1);
        org.joda.time.Minutes minutes5 = null;
        org.joda.time.Minutes minutes6 = minutes1.minus(minutes5);
        org.joda.time.Minutes minutes8 = minutes1.plus((int) (short) 1);
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        boolean boolean11 = minutes8.isLessThan(minutes10);
        org.joda.time.Minutes minutes13 = minutes10.minus(70);
        org.joda.time.DurationFieldType durationFieldType14 = minutes10.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.Interval interval23 = property22.toInterval();
        boolean boolean24 = interval19.contains((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType15.getField(chronology25);
        long long33 = chronology25.add(720000L, 63808214400000L, (-10));
        org.joda.time.DurationField durationField34 = durationFieldType14.getField(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        long long40 = dateTimeField37.add(0L, (long) (short) 1);
        long long42 = dateTimeField37.roundHalfCeiling((long) 2);
        org.joda.time.DurationField durationField43 = dateTimeField37.getDurationField();
        long long46 = durationField43.getMillis(4190400000L, (long) 86399999);
        int int47 = durationField34.compareTo(durationField43);
        int int49 = durationField34.getValue((long) 'x');
        int int52 = durationField34.getDifference((-86340011L), (long) 3732480);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-638082143280000L) + "'", long33 == (-638082143280000L));
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 43200000L + "'", long40 == 43200000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 181025280000000000L + "'", long46 == 181025280000000000L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1501) + "'", int52 == (-1501));
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 10, (int) (byte) 0, 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        boolean boolean13 = interval8.contains((org.joda.time.ReadableInterval) interval12);
        java.lang.String str14 = interval12.toString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        boolean boolean23 = interval18.contains((org.joda.time.ReadableInterval) interval22);
        boolean boolean24 = interval12.isBefore((org.joda.time.ReadableInterval) interval22);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Chronology chronology26 = interval22.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.centuryOfEra();
        long long29 = dateTimeField27.roundCeiling((long) 117);
        int int30 = dateTimeField27.getMinimumValue();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str14, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 946684800000L + "'", long29 == 946684800000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("-00:00:00.155");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-00:00:00.155\" is malformed at \":00:00.155\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded(0L, (int) 'a');
        org.joda.time.DateTime dateTime11 = dateTime2.plusMinutes(365);
        org.joda.time.DateTime dateTime13 = dateTime2.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime15 = dateTime2.withDayOfYear(53);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int25 = mutablePeriod24.getDays();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfEra();
        org.joda.time.Interval interval35 = property34.toInterval();
        boolean boolean36 = interval31.contains((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        mutablePeriod24.setPeriod((long) 'u', (long) 1969, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.clockhourOfHalfday();
        org.joda.time.DurationField durationField40 = chronology37.eras();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology37);
        boolean boolean42 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Instant instant23 = dateTime20.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime20.withMillis((long) '4');
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property27 = dateTime8.minuteOfDay();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant31 = instant29.minus(100L);
        java.lang.String str32 = instant31.toString();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period36 = duration35.toPeriod();
        org.joda.time.Duration duration38 = duration35.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = duration35.toPeriodTo(readableInstant39);
        org.joda.time.Duration duration42 = duration35.withMillis((long) (short) 0);
        org.joda.time.Instant instant43 = instant31.plus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean45 = instant31.isSupported(dateTimeFieldType44);
        boolean boolean46 = dateTime8.isSupported(dateTimeFieldType44);
        boolean boolean48 = dateTime8.isBefore(27882719L);
        org.joda.time.DateTime.Property property49 = dateTime8.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval50 = property49.toInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31T23:59:59.899Z" + "'", str32, "1969-12-31T23:59:59.899Z");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-27349920), (-10), 86399999, 999);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType8, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) 0, periodType8, chronology11);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 10, periodType14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant18 = instant17.toInstant();
        org.joda.time.DateTime dateTime19 = instant18.toDateTimeISO();
        org.joda.time.Duration duration20 = period15.toDurationFrom((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((-1L), (long) 23);
        org.joda.time.Period period25 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period27 = period25.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.Duration duration32 = duration29.withDurationAdded((long) '#', 0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = duration32.toPeriodFrom(readableInstant33);
        org.joda.time.Duration duration35 = duration23.minus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration36 = duration20.plus((org.joda.time.ReadableDuration) duration23);
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfEra();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfEra();
        org.joda.time.Interval interval45 = property44.toInterval();
        boolean boolean46 = interval41.contains((org.joda.time.ReadableInterval) interval45);
        java.lang.String str47 = interval41.toString();
        long long48 = interval41.getEndMillis();
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime51 = instant50.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withZoneRetainFields(dateTimeZone52);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime56 = instant55.toDateTime();
        org.joda.time.DateTime.Property property57 = dateTime56.era();
        org.joda.time.DateTime dateTime58 = dateTime56.withTimeAtStartOfDay();
        org.joda.time.Duration duration61 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant62, periodType63);
        mutablePeriod64.setMonths((int) '4');
        org.joda.time.DateTime dateTime67 = dateTime56.plus((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.DateTime dateTime69 = dateTime56.minusWeeks((int) (byte) 1);
        int int70 = dateTime53.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime.Property property71 = dateTime56.minuteOfHour();
        org.joda.time.DateTime dateTime73 = dateTime56.withYear(1969);
        org.joda.time.Chronology chronology74 = dateTime73.getChronology();
        boolean boolean75 = interval41.isBefore((org.joda.time.ReadableInstant) dateTime73);
        mutablePeriod12.setPeriod((org.joda.time.ReadableInterval) interval41);
        mutablePeriod4.add((org.joda.time.ReadableInterval) interval41);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str47, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1672531200000L + "'", long48 == 1672531200000L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillis(1640995200000L);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration8.isEqual(readableDuration10);
        org.joda.time.Duration duration13 = duration8.minus((long) 1);
        org.joda.time.Duration duration15 = duration13.minus((long) '4');
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration28 = duration25.plus((long) (byte) 0);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        boolean boolean33 = dateTime31.isEqual(10L);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType36, chronology37);
        org.joda.time.PeriodType periodType39 = periodType36.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime31, periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration22, periodType39);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) dateTime18, periodType42);
        org.joda.time.TimeOfDay timeOfDay44 = dateTime18.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = timeOfDay44.toDateTime(readableInstant45);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant50 = instant48.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime51 = instant48.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime52 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.year();
        boolean boolean54 = dateTime52.isSupported(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = dateTime2.withField(dateTimeFieldType53, 1439);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMillis(52);
        org.joda.time.Duration duration61 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period62 = duration61.toPeriod();
        org.joda.time.Duration duration64 = org.joda.time.Duration.parse("PT432000S");
        org.joda.time.Duration duration65 = duration64.toDuration();
        org.joda.time.Duration duration66 = duration61.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.DateTime dateTime67 = dateTime56.minus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateTime dateTime69 = dateTime67.plusMillis(6);
        org.joda.time.DateTime dateTime71 = dateTime67.withMillis(846112L);
        org.joda.time.Duration duration74 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period75 = duration74.toPeriod();
        org.joda.time.Duration duration78 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period79 = duration78.toPeriod();
        boolean boolean80 = duration74.isEqual((org.joda.time.ReadableDuration) duration78);
        org.joda.time.Duration duration81 = duration74.toDuration();
        org.joda.time.DateTime dateTime82 = dateTime67.plus((org.joda.time.ReadableDuration) duration81);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(dateTime82);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-2147483648));
        java.lang.String str2 = period1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = period1.get(durationFieldType3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT-2147483648H" + "'", str2, "PT-2147483648H");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) 10);
        java.lang.String str7 = dateTimeZone2.getName((-1889265600001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfEra();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.Interval interval9 = property8.toInterval();
        boolean boolean10 = interval5.contains((org.joda.time.ReadableInterval) interval9);
        java.lang.Object obj11 = null;
        org.joda.time.Instant instant12 = new org.joda.time.Instant(obj11);
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        boolean boolean16 = interval5.contains((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        boolean boolean21 = interval5.contains((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.MutableInterval mutableInterval22 = interval5.toMutableInterval();
        org.joda.time.Chronology chronology23 = interval5.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.Period period25 = new org.joda.time.Period(86405467L, (long) (-59), chronology23);
        org.joda.time.Hours hours26 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours27 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours28 = hours26.plus(hours27);
        org.joda.time.Duration duration29 = hours26.toStandardDuration();
        org.joda.time.Duration duration32 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33, periodType34);
        mutablePeriod35.setMillis((int) (short) 1);
        mutablePeriod35.setDays(100);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant43 = instant41.minus(100L);
        org.joda.time.Instant instant45 = instant43.plus((long) 100);
        boolean boolean46 = instant43.isBeforeNow();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        org.joda.time.DateTime.Property property50 = dateTime49.era();
        int int51 = dateTime49.getWeekOfWeekyear();
        int int52 = dateTime49.getMonthOfYear();
        int int53 = dateTime49.getDayOfWeek();
        org.joda.time.DateTime dateTime55 = dateTime49.plus(4190400000L);
        org.joda.time.DateTime dateTime57 = dateTime55.withYearOfCentury((int) (short) 10);
        org.joda.time.DateTime.Property property58 = dateTime57.centuryOfEra();
        mutablePeriod35.setPeriod((org.joda.time.ReadableInstant) instant43, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.MutableDateTime mutableDateTime60 = instant43.toMutableDateTime();
        org.joda.time.Period period61 = duration29.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.Duration duration62 = period25.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime60);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 12 + "'", int52 == 12);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(duration62);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) -1);
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.Chronology chronology7 = dateTime2.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.seconds();
        int int11 = durationField8.getValue(1645455304L, 1672617599999L);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1645455 + "'", int11 == 1645455);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1969);
        org.joda.time.Instant instant4 = instant1.withDurationAdded((-100L), 0);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant8 = instant6.minus(100L);
        org.joda.time.Instant instant10 = instant8.plus((long) 100);
        org.joda.time.Instant instant12 = instant8.withMillis((long) (byte) 1);
        org.joda.time.Instant instant15 = instant8.withDurationAdded((long) '4', (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType21);
        mutablePeriod22.setMonths((int) '4');
        org.joda.time.Period period25 = mutablePeriod22.toPeriod();
        org.joda.time.ReadableInterval readableInterval26 = null;
        mutablePeriod22.setPeriod(readableInterval26);
        int int28 = mutablePeriod22.getMillis();
        int int29 = mutablePeriod22.getWeeks();
        mutablePeriod22.addMonths(78719999);
        org.joda.time.PeriodType periodType32 = mutablePeriod22.getPeriodType();
        org.joda.time.Period period34 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period36 = period34.minusMonths((int) (short) 10);
        org.joda.time.Period period38 = period36.withSeconds((int) '4');
        org.joda.time.Period period39 = period38.negated();
        org.joda.time.Period period41 = period39.plusYears(3);
        org.joda.time.Period period43 = period41.withSeconds((int) (byte) 100);
        org.joda.time.Period period45 = period41.minusMonths(0);
        org.joda.time.PeriodType periodType46 = period45.getPeriodType();
        org.joda.time.Days days47 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.minutes();
        int int49 = days47.get(durationFieldType48);
        org.joda.time.DurationFieldType durationFieldType50 = days47.getFieldType();
        boolean boolean51 = periodType46.isSupported(durationFieldType50);
        int int52 = periodType32.indexOf(durationFieldType50);
        org.joda.time.PeriodType periodType53 = periodType32.withYearsRemoved();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) mutableDateTime16, periodType53);
        org.joda.time.MutableDateTime mutableDateTime55 = instant1.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Hours hours2 = hours0.dividedBy(169);
        org.joda.time.Hours hours4 = hours2.plus((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        boolean boolean13 = interval8.contains((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.Interval interval21 = property20.toInterval();
        boolean boolean22 = interval17.contains((org.joda.time.ReadableInterval) interval21);
        boolean boolean23 = interval12.contains((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.Interval interval31 = property30.toInterval();
        boolean boolean32 = interval27.contains((org.joda.time.ReadableInterval) interval31);
        java.lang.String str33 = interval31.toString();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfEra();
        org.joda.time.Interval interval41 = property40.toInterval();
        boolean boolean42 = interval37.contains((org.joda.time.ReadableInterval) interval41);
        boolean boolean43 = interval31.isBefore((org.joda.time.ReadableInterval) interval41);
        boolean boolean44 = interval17.overlaps((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Hours hours45 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Hours hours47 = hours45.dividedBy(10);
        org.joda.time.Hours hours48 = hours45.negated();
        org.joda.time.Hours hours50 = org.joda.time.Hours.hours(97);
        org.joda.time.Hours hours51 = hours48.plus(hours50);
        org.joda.time.Hours hours53 = hours51.plus((-100));
        boolean boolean54 = hours4.isLessThan(hours51);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str33, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(hours47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(hours53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period(48872928527999030L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 13575813479");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P0W");
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period5.getFieldTypes();
        int int7 = period5.getMinutes();
        org.joda.time.Weeks weeks8 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks10 = weeks8.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks11 = weeks10.negated();
        org.joda.time.Weeks weeks13 = weeks10.dividedBy(8);
        org.joda.time.Weeks weeks14 = weeks1.plus(weeks13);
        int int15 = weeks13.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration2.isEqual(readableDuration4);
        org.joda.time.Duration duration7 = duration2.minus((long) 1);
        org.joda.time.Duration duration9 = duration7.minus((long) '4');
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        boolean boolean27 = dateTime25.isEqual(10L);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime25, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration16, periodType33);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime12, periodType36);
        org.joda.time.Duration duration39 = duration7.minus((long) 7);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int50 = mutablePeriod49.getDays();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfEra();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.Interval interval60 = property59.toInterval();
        boolean boolean61 = interval56.contains((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        mutablePeriod49.setPeriod((long) 'u', (long) 1969, chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period((long) (byte) 100, chronology62);
        org.joda.time.Period period65 = duration39.toPeriod(chronology62);
        org.joda.time.DateTimeField dateTimeField66 = chronology62.weekyearOfCentury();
        long long68 = dateTimeField66.roundHalfCeiling((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = dateTimeField66.getType();
        java.lang.String str70 = dateTimeFieldType69.toString();
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "weekyearOfCentury" + "'", str70, "weekyearOfCentury");
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime7 = dateTime2.withMillis((long) '4');
        java.lang.Object obj8 = null;
        org.joda.time.Instant instant9 = new org.joda.time.Instant(obj8);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        java.lang.String str11 = dateTimeZone10.toString();
        int int13 = dateTimeZone10.getOffset(1L);
        boolean boolean15 = dateTimeZone10.isStandardOffset(0L);
        org.joda.time.DateTime dateTime16 = dateTime2.withZoneRetainFields(dateTimeZone10);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = duration19.toPeriodTo(readableInstant23);
        org.joda.time.Duration duration26 = duration19.minus(43200000L);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period29 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period31 = period29.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationTo(readableInstant32);
        org.joda.time.Duration duration36 = duration33.withDurationAdded((long) '#', 0);
        long long37 = duration36.getStandardSeconds();
        int int38 = duration26.compareTo((org.joda.time.ReadableDuration) duration36);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-26179201L) + "'", long37 == (-26179201L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMillis((int) (short) 1);
        int int8 = mutablePeriod5.getSeconds();
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.THREE;
        org.joda.time.DurationFieldType durationFieldType10 = weeks9.getFieldType();
        mutablePeriod5.add(durationFieldType10, (int) (byte) 0);
        mutablePeriod5.add((long) 'a');
        mutablePeriod5.setMillis((-2147483648));
        mutablePeriod5.setHours(52);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType23);
        mutablePeriod24.setMillis((int) (short) 1);
        int int27 = mutablePeriod24.getSeconds();
        mutablePeriod24.setSeconds(436320);
        mutablePeriod24.addHours(3911);
        int int32 = mutablePeriod24.getSeconds();
        mutablePeriod5.add((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 436320 + "'", int32 == 436320);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        int int30 = durationField27.getValue((long) 69, (long) (short) 0);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfEra();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfEra();
        org.joda.time.Interval interval38 = property37.toInterval();
        boolean boolean39 = interval34.contains((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.weeks();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.minuteOfDay();
        org.joda.time.DurationField durationField43 = chronology40.seconds();
        org.joda.time.DurationField durationField44 = chronology40.centuries();
        int int45 = durationField27.compareTo(durationField44);
        boolean boolean46 = durationField44.isSupported();
        long long48 = durationField44.getMillis(0);
        boolean boolean49 = durationField44.isPrecise();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy((int) (byte) 0);
        org.joda.time.Seconds seconds5 = seconds1.minus(86399999);
        org.joda.time.Seconds seconds7 = seconds5.plus((int) (short) 100);
        org.joda.time.PeriodType periodType8 = seconds7.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        boolean boolean17 = interval12.contains((org.joda.time.ReadableInterval) interval16);
        java.lang.Object obj18 = null;
        org.joda.time.Instant instant19 = new org.joda.time.Instant(obj18);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone20);
        boolean boolean23 = interval12.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime26 = instant25.toDateTime();
        org.joda.time.DateTime.Property property27 = dateTime26.era();
        boolean boolean28 = interval12.contains((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Seconds seconds30 = seconds7.minus(seconds29);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, readableInstant34, periodType35);
        java.lang.String str37 = duration33.toString();
        org.joda.time.Seconds seconds38 = duration33.toStandardSeconds();
        org.joda.time.Seconds seconds39 = seconds38.negated();
        boolean boolean40 = seconds29.isLessThan(seconds39);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0.011S" + "'", str37, "PT0.011S");
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        java.io.IOException iOException3 = new java.io.IOException("Chinese (China)");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("1969-12-29T20:59:59.999Z", (java.lang.Throwable) iOException3);
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException(throwable8);
        java.io.IOException iOException10 = new java.io.IOException(throwable8);
        java.io.IOException iOException11 = new java.io.IOException("DurationField[hours]", (java.lang.Throwable) iOException10);
        iOException6.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("PT1H9S", (java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = iOException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = days6.get(durationFieldType7);
        mutablePeriod5.add(durationFieldType7, 8);
        mutablePeriod5.addMillis((int) (byte) 1);
        org.joda.time.Period period13 = mutablePeriod5.toPeriod();
        mutablePeriod5.setMonths((-1));
        int int16 = mutablePeriod5.getWeeks();
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Set<java.lang.String> strSet3 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode4 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList5 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet3, filteringMode4);
        java.util.Collection<java.util.Locale> localeCollection6 = null;
        java.util.Locale.FilteringMode filteringMode7 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList8 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection6, filteringMode7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZoneRetainFields(dateTimeZone14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.DateTime dateTime20 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.Duration duration23 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant24, periodType25);
        mutablePeriod26.setMonths((int) '4');
        org.joda.time.DateTime dateTime29 = dateTime18.plus((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.DateTime dateTime31 = dateTime18.minusWeeks((int) (byte) 1);
        int int32 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property33 = dateTime18.minuteOfHour();
        org.joda.time.DateTime dateTime35 = dateTime18.withYear(1969);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.dayOfMonth();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTime dateTime39 = dateTime10.toDateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = chronology36.clockhourOfHalfday();
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime44 = instant43.toDateTime();
        org.joda.time.DateTime.Property property45 = dateTime44.era();
        org.joda.time.DateTime dateTime46 = dateTime44.withTimeAtStartOfDay();
        org.joda.time.Duration duration49 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant50, periodType51);
        mutablePeriod52.setMonths((int) '4');
        org.joda.time.DateTime dateTime55 = dateTime44.plus((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.LocalDate localDate56 = dateTime44.toLocalDate();
        int int57 = localDate56.size();
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime60 = instant59.toDateTime();
        org.joda.time.DateTime.Property property61 = dateTime60.era();
        org.joda.time.DateTime dateTime62 = dateTime60.withTimeAtStartOfDay();
        org.joda.time.Duration duration65 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration65, readableInstant66, periodType67);
        mutablePeriod68.setMonths((int) '4');
        org.joda.time.DateTime dateTime71 = dateTime60.plus((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.joda.time.LocalDate localDate72 = dateTime60.toLocalDate();
        int int73 = localDate56.compareTo((org.joda.time.ReadablePartial) localDate72);
        org.joda.time.format.PeriodPrinter periodPrinter75 = null;
        org.joda.time.format.PeriodParser periodParser76 = null;
        org.joda.time.format.PeriodFormatter periodFormatter77 = new org.joda.time.format.PeriodFormatter(periodPrinter75, periodParser76);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter79 = periodFormatter77.withParseType(periodType78);
        java.util.Locale locale80 = periodFormatter77.getLocale();
        java.util.Locale locale81 = java.util.Locale.ITALY;
        java.lang.String str82 = locale81.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter83 = periodFormatter77.withLocale(locale81);
        java.util.Locale locale84 = locale81.stripExtensions();
        java.lang.String str85 = locale84.getDisplayName();
        java.lang.String str86 = dateTimeField41.getAsShortText((org.joda.time.ReadablePartial) localDate56, (int) (short) -1, locale84);
        java.util.Set<java.lang.String> strSet87 = locale84.getUnicodeLocaleKeys();
        java.lang.String str88 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet87);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + filteringMode4 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode4.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + filteringMode7 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode7.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodFormatter79);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(periodFormatter83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "italiano (Italia)" + "'", str85, "italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "-1" + "'", str86, "-1");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = duration2.toPeriodTo(readableInstant6);
        org.joda.time.Duration duration9 = duration2.withMillis((long) (short) 0);
        java.lang.String str10 = duration9.toString();
        org.joda.time.Duration duration11 = duration9.toDuration();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getRangeDurationType();
        mutablePeriod14.add(durationFieldType16, 11);
        java.lang.String str19 = durationFieldType16.toString();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int29 = mutablePeriod28.getDays();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfEra();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.Interval interval39 = property38.toInterval();
        boolean boolean40 = interval35.contains((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        mutablePeriod28.setPeriod((long) 'u', (long) 1969, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.millisOfDay();
        org.joda.time.DurationField durationField44 = durationFieldType16.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField45 = chronology41.hourOfHalfday();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "days" + "'", str19, "days");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.LocalDate localDate14 = dateTime2.toLocalDate();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.DateTime dateTime19 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.Instant instant20 = dateTime17.toInstant();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.era();
        org.joda.time.DateTime dateTime26 = property25.withMinimumValue();
        int int27 = property25.getMaximumValueOverall();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale28.getScript();
        java.lang.String str30 = locale28.getDisplayCountry();
        int int31 = property25.getMaximumShortTextLength(locale28);
        org.joda.time.DateTime dateTime32 = property25.withMaximumValue();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType34 = periodType33.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime32, periodType33);
        org.joda.time.DateTime dateTime37 = dateTime32.plusWeeks((-2147483648));
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfWeek();
        org.joda.time.DateTime.Property property39 = dateTime37.centuryOfEra();
        org.joda.time.DateTime dateTime41 = dateTime37.withYearOfEra(120000);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0S");
        org.joda.time.Hours hours2 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours4 = hours2.multipliedBy(0);
        org.joda.time.Hours hours6 = hours2.dividedBy(69);
        org.joda.time.Hours hours7 = hours2.negated();
        org.joda.time.Hours hours9 = hours7.multipliedBy(0);
        org.joda.time.Hours hours10 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours11 = hours9.plus(hours10);
        boolean boolean12 = hours1.isGreaterThan(hours9);
        org.joda.time.PeriodType periodType13 = hours1.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType15 = periodType13.getFieldType(0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType15);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Seconds seconds3 = seconds1.plus((int) (byte) -1);
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds6 = seconds3.negated();
        org.joda.time.Seconds seconds7 = seconds6.negated();
        org.joda.time.Seconds seconds9 = seconds7.multipliedBy(54070);
        org.joda.time.Seconds seconds11 = seconds9.multipliedBy(675);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant3 = instant1.minus(100L);
        org.joda.time.Instant instant5 = instant3.plus((long) 100);
        org.joda.time.Instant instant7 = instant3.withMillis((long) (byte) 1);
        org.joda.time.Period period9 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period11 = period9.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Duration duration16 = duration13.withDurationAdded((long) '#', 0);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant20 = instant18.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime21 = instant18.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period23 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime21, periodType22);
        org.joda.time.Instant instant24 = instant7.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant25 = instant7.toInstant();
        boolean boolean27 = instant25.isEqual(100L);
        org.joda.time.MutableDateTime mutableDateTime28 = instant25.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableDateTime28);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) '#', 0);
        org.joda.time.Duration duration10 = duration8.plus((long) 0);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        org.joda.time.DateTime dateTime15 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType20);
        mutablePeriod21.setMonths((int) '4');
        org.joda.time.DateTime dateTime24 = dateTime13.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        java.lang.Object obj25 = null;
        org.joda.time.Instant instant26 = new org.joda.time.Instant(obj25);
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        java.lang.String str28 = dateTimeZone27.toString();
        int int30 = dateTimeZone27.getOffset(1L);
        boolean boolean32 = dateTimeZone27.isStandardOffset(0L);
        org.joda.time.DateTime dateTime33 = dateTime13.withZoneRetainFields(dateTimeZone27);
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime36 = dateTime33.withCenturyOfEra((int) (byte) 1);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 675);
        org.joda.time.DateTime dateTime41 = dateTime39.withDayOfYear(99);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = period45.getFieldTypes();
        org.joda.time.Period period48 = period45.minusYears((int) (byte) 1);
        org.joda.time.Period period50 = period45.plusMonths((int) (byte) 0);
        int int51 = period45.getHours();
        org.joda.time.Period period53 = period45.multipliedBy((int) (byte) 1);
        org.joda.time.Period period55 = period53.withMonths((int) 'x');
        org.joda.time.Period period57 = period55.minusYears(169);
        org.joda.time.Period period59 = period55.plusHours((-292276));
        org.joda.time.DateTime dateTime60 = dateTime41.plus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Days days61 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days63 = days61.minus((int) '4');
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTime.Property property66 = dateTime65.yearOfEra();
        org.joda.time.Interval interval67 = property66.toInterval();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        org.joda.time.DateTime.Property property70 = dateTime69.yearOfEra();
        org.joda.time.Interval interval71 = property70.toInterval();
        boolean boolean72 = interval67.contains((org.joda.time.ReadableInterval) interval71);
        java.lang.String str73 = interval71.toString();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime.Property property76 = dateTime75.yearOfEra();
        org.joda.time.Interval interval77 = property76.toInterval();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(chronology78);
        org.joda.time.DateTime.Property property80 = dateTime79.yearOfEra();
        org.joda.time.Interval interval81 = property80.toInterval();
        boolean boolean82 = interval77.contains((org.joda.time.ReadableInterval) interval81);
        boolean boolean83 = interval71.isBefore((org.joda.time.ReadableInterval) interval81);
        org.joda.time.Days days84 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval71);
        boolean boolean85 = days63.isLessThan(days84);
        org.joda.time.DurationFieldType durationFieldType86 = days63.getFieldType();
        org.joda.time.Period period88 = period59.withField(durationFieldType86, 42);
        org.joda.time.Period period90 = period37.withFieldAdded(durationFieldType86, (-546));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldTypeArray46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str73, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(days84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(2796082055L);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        java.util.Locale locale5 = periodFormatter2.getLocale();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale6);
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter11.withParseType(periodType12);
        java.util.Locale locale14 = periodFormatter11.getLocale();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter11.withLocale(locale15);
        java.util.Locale locale18 = locale15.stripExtensions();
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter8.withLocale(locale18);
        org.joda.time.PeriodType periodType20 = periodFormatter19.getParseType();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        long long26 = dateTimeField23.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial27 = null;
        int int28 = dateTimeField23.getMinimumValue(readablePartial27);
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        int int30 = dateTimeField23.getMaximumTextLength(locale29);
        org.joda.time.format.PeriodFormatter periodFormatter31 = periodFormatter19.withLocale(locale29);
        org.joda.time.format.PeriodParser periodParser32 = periodFormatter19.getParser();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(periodType20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 43200000L + "'", long26 == 43200000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(periodFormatter31);
        org.junit.Assert.assertNull(periodParser32);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: java.io.IOException: java.io.IOException: days", "1969-12-31T23:58:22.999Z", "2022-02-21T15:03:21.599Z");
        org.junit.Assert.assertEquals(locale3.toString(), "java.io.ioexception: java.io.ioexception: java.io.ioexception: days_1969-12-31T23:58:22.999Z_2022-02-21T15:03:21.599Z");
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        org.joda.time.format.PeriodParser periodParser5 = periodFormatter2.getParser();
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        org.joda.time.PeriodType periodType8 = periodFormatter7.getParseType();
        org.joda.time.PeriodType periodType9 = periodFormatter7.getParseType();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter7.withParseType(periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = periodFormatter7.parseMutablePeriod("und");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNull(periodParser5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter11);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(2980800894L);
        mutablePeriod1.addSeconds((-2434303));
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 1, 1972, 117, 12, (int) 'a', (-2147483648), (int) (byte) 100, 1970);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        boolean boolean17 = interval12.contains((org.joda.time.ReadableInterval) interval16);
        java.lang.Object obj18 = null;
        org.joda.time.Instant instant19 = new org.joda.time.Instant(obj18);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone20);
        boolean boolean23 = interval12.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime26 = instant25.toDateTime();
        org.joda.time.DateTime.Property property27 = dateTime26.era();
        boolean boolean28 = interval12.contains((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.MutableInterval mutableInterval29 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.Interval interval37 = property36.toInterval();
        boolean boolean38 = interval33.contains((org.joda.time.ReadableInterval) interval37);
        java.lang.Object obj39 = null;
        org.joda.time.Instant instant40 = new org.joda.time.Instant(obj39);
        org.joda.time.DateTimeZone dateTimeZone41 = instant40.getZone();
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone41);
        boolean boolean44 = interval33.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime47 = instant46.toDateTime();
        org.joda.time.DateTime.Property property48 = dateTime47.era();
        boolean boolean49 = interval33.contains((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval33);
        boolean boolean51 = interval12.isAfter((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime54 = instant53.toDateTime();
        boolean boolean55 = interval12.contains((org.joda.time.ReadableInstant) instant53);
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval12);
        mutablePeriod8.addHours(0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology9.days();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        int int18 = property16.getMaximumValueOverall();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        int int22 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime23 = property16.withMaximumValue();
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        long long26 = chronology9.set((org.joda.time.ReadablePartial) localTime24, (long) (byte) 10);
        org.joda.time.DurationField durationField27 = chronology9.seconds();
        java.lang.Object obj28 = null;
        org.joda.time.Instant instant29 = new org.joda.time.Instant(obj28);
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        java.lang.String str31 = dateTimeZone30.toString();
        java.lang.String str33 = dateTimeZone30.getName((long) 10);
        java.lang.String str35 = dateTimeZone30.getName((long) 8);
        long long39 = dateTimeZone30.convertLocalToUTC((long) 31, false, (-3676492805054399977L));
        java.lang.String str41 = dateTimeZone30.getShortName((long) 292278993);
        org.joda.time.Chronology chronology42 = chronology9.withZone(dateTimeZone30);
        int int44 = dateTimeZone30.getStandardOffset((long) (-2147483647));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 86399999L + "'", long26 == 86399999L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 31L + "'", long39 == 31L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.monthOfYear();
        org.joda.time.DateTime.Property property17 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.toDateTime();
        int int19 = dateTime15.getSecondOfDay();
        org.joda.time.DateTime.Property property20 = dateTime15.weekyear();
        int int21 = property20.getMinimumValueOverall();
        org.joda.time.Interval interval22 = property20.toInterval();
        org.joda.time.DateTime dateTime23 = property20.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.DateMidnight dateMidnight25 = dateTime23.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 86399 + "'", int19 == 86399);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-292275054) + "'", int21 == (-292275054));
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateMidnight25);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours2 = hours0.multipliedBy(0);
        org.joda.time.Hours hours3 = hours0.negated();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        boolean boolean4 = dateTime2.isEqual(10L);
        org.joda.time.DateTime dateTime6 = dateTime2.withCenturyOfEra((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours(1969);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        boolean boolean10 = dateTime8.isAfterNow();
        org.joda.time.DateTime dateTime12 = dateTime8.minusHours(2115);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.monthOfYear();
        org.joda.time.DateTime.Property property17 = dateTime15.weekyear();
        int int18 = property17.get();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        org.joda.time.Interval interval20 = property17.toInterval();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfEra();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.DateTime dateTime25 = interval24.getStart();
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.DateTime dateTime28 = property26.addToCopy(893);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.Duration duration32 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration32.toPeriod(chronology33);
        org.joda.time.Duration duration37 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, readableInstant38, periodType39);
        org.joda.time.Days days41 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.minutes();
        int int43 = days41.get(durationFieldType42);
        mutablePeriod40.add(durationFieldType42, 8);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutablePeriod40.add(readablePeriod46);
        int int48 = mutablePeriod40.getMonths();
        org.joda.time.ReadableInterval readableInterval49 = null;
        mutablePeriod40.add(readableInterval49);
        org.joda.time.Days days51 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.minutes();
        int int53 = days51.get(durationFieldType52);
        org.joda.time.MutablePeriod mutablePeriod54 = days51.toMutablePeriod();
        org.joda.time.Days days56 = days51.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration57 = days51.toStandardDuration();
        mutablePeriod40.setPeriod((org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration57);
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardSeconds((-7152L));
        org.joda.time.Duration duration62 = duration57.plus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateTime dateTime63 = dateTime28.minus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateMidnight dateMidnight64 = dateTime28.toDateMidnight();
        int int65 = property17.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        long long72 = dateTimeZone68.adjustOffset(8380845299L, false);
        java.util.Locale locale74 = java.util.Locale.ITALY;
        java.util.Locale locale78 = new java.util.Locale("", "hi!", "hi!");
        java.lang.String str79 = locale74.getDisplayCountry(locale78);
        java.lang.String str80 = locale78.getDisplayVariant();
        java.util.Locale locale81 = java.util.Locale.ENGLISH;
        java.lang.String str82 = locale78.getDisplayVariant(locale81);
        java.lang.String str83 = locale81.toLanguageTag();
        java.lang.String str84 = locale81.getDisplayScript();
        java.lang.String str85 = dateTimeZone68.getName((long) 100, locale81);
        boolean boolean87 = dateTimeZone68.isStandardOffset(432000000L);
        long long89 = dateTimeZone68.nextTransition((long) 54041);
        org.joda.time.DateTime dateTime90 = dateTime28.toDateTime(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1969 + "'", int18 == 1969);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod54);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 8380845299L + "'", long72 == 8380845299L);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale78.toString(), "_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Italy" + "'", str79, "Italy");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "en" + "'", str83, "en");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+00:02" + "'", str85, "+00:02");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 54041L + "'", long89 == 54041L);
        org.junit.Assert.assertNotNull(dateTime90);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        boolean boolean17 = interval12.contains((org.joda.time.ReadableInterval) interval16);
        boolean boolean18 = interval7.contains((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.Interval interval26 = property25.toInterval();
        boolean boolean27 = interval22.contains((org.joda.time.ReadableInterval) interval26);
        java.lang.String str28 = interval26.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.Interval interval36 = property35.toInterval();
        boolean boolean37 = interval32.contains((org.joda.time.ReadableInterval) interval36);
        boolean boolean38 = interval26.isBefore((org.joda.time.ReadableInterval) interval36);
        boolean boolean39 = interval12.overlaps((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Days days41 = org.joda.time.Days.days(21);
        boolean boolean42 = interval12.equals((java.lang.Object) days41);
        org.joda.time.MutableInterval mutableInterval43 = interval12.toMutableInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02" + "'", str28, "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(mutableInterval43);
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.DateTime dateTime4 = interval3.getStart();
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(893);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.plus((-128849018760L));
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded(53L, 133);
        org.joda.time.DateTime dateTime15 = dateTime7.withMillisOfDay(977);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, readableInstant16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Duration duration5 = interval3.toDuration();
        java.lang.String str6 = duration5.toString();
        org.joda.time.Duration duration9 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration9.isEqual(readableDuration11);
        org.joda.time.Duration duration14 = duration9.minus((long) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration9.toPeriod(chronology15);
        boolean boolean17 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT31536000S" + "'", str6, "PT31536000S");
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration10.toPeriod(chronology11);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean16 = periodType13.equals((java.lang.Object) dateTimeFieldType15);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) duration10, periodType13);
        org.joda.time.PeriodType periodType18 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(436320, 1969, 402086, 992, (-1970), 97, 624, 624, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMonths((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period6 = period1.withFieldAdded(durationFieldType4, (int) (short) 100);
        org.joda.time.Period period8 = period1.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        boolean boolean17 = interval12.contains((org.joda.time.ReadableInterval) interval16);
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weeks();
        org.joda.time.DurationFieldType durationFieldType20 = durationField19.getType();
        org.joda.time.Period period22 = period1.withField(durationFieldType20, 19);
        org.joda.time.Period period24 = period1.plusDays(2);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Duration duration26 = hours25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration27);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = hours0.minus((int) (short) 100);
        org.joda.time.Hours hours3 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours5 = hours3.multipliedBy(0);
        org.joda.time.Hours hours7 = hours3.dividedBy(69);
        org.joda.time.Hours hours9 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours11 = hours9.minus((int) (short) 10);
        org.joda.time.Hours hours12 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours14 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours16 = hours14.minus((int) (short) 10);
        boolean boolean17 = hours12.isGreaterThan(hours16);
        boolean boolean18 = hours9.isLessThan(hours16);
        org.joda.time.Hours hours19 = hours9.negated();
        org.joda.time.Hours hours21 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours23 = hours21.minus((int) (short) 10);
        org.joda.time.Hours hours24 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours26 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours28 = hours26.minus((int) (short) 10);
        boolean boolean29 = hours24.isGreaterThan(hours28);
        boolean boolean30 = hours21.isLessThan(hours28);
        org.joda.time.Hours hours31 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours33 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours35 = hours33.minus((int) (short) 10);
        boolean boolean36 = hours31.isGreaterThan(hours35);
        boolean boolean37 = hours21.isGreaterThan(hours35);
        int int38 = hours35.getHours();
        org.joda.time.Hours hours40 = hours35.plus(0);
        org.joda.time.Hours hours42 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours44 = hours42.minus((int) (short) 10);
        org.joda.time.Hours hours45 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours47 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours49 = hours47.minus((int) (short) 10);
        boolean boolean50 = hours45.isGreaterThan(hours49);
        boolean boolean51 = hours42.isLessThan(hours49);
        org.joda.time.Hours hours52 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours54 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours56 = hours54.minus((int) (short) 10);
        boolean boolean57 = hours52.isGreaterThan(hours56);
        boolean boolean58 = hours42.isGreaterThan(hours56);
        int int59 = hours56.getHours();
        org.joda.time.Hours hours61 = hours56.plus(0);
        org.joda.time.Hours hours62 = hours35.plus(hours56);
        org.joda.time.Hours hours63 = hours9.plus(hours35);
        org.joda.time.Hours hours64 = hours3.plus(hours9);
        org.joda.time.Hours hours65 = hours0.minus(hours9);
        org.joda.time.DurationFieldType durationFieldType66 = hours0.getFieldType();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology67);
        org.joda.time.DateTime.Property property69 = dateTime68.yearOfEra();
        org.joda.time.Interval interval70 = property69.toInterval();
        java.util.Locale locale71 = java.util.Locale.KOREAN;
        java.lang.String str72 = property69.getAsText(locale71);
        int int73 = property69.getMaximumValue();
        org.joda.time.format.PeriodPrinter periodPrinter74 = null;
        org.joda.time.format.PeriodParser periodParser75 = null;
        org.joda.time.format.PeriodFormatter periodFormatter76 = new org.joda.time.format.PeriodFormatter(periodPrinter74, periodParser75);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter78 = periodFormatter76.withParseType(periodType77);
        java.util.Locale locale79 = periodFormatter76.getLocale();
        java.util.Locale locale80 = java.util.Locale.ITALY;
        java.lang.String str81 = locale80.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter82 = periodFormatter76.withLocale(locale80);
        java.util.Locale locale83 = locale80.stripExtensions();
        int int84 = property69.getMaximumShortTextLength(locale80);
        java.lang.String str85 = locale80.getVariant();
        java.lang.String str86 = locale80.getLanguage();
        boolean boolean87 = hours0.equals((java.lang.Object) str86);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-10) + "'", int38 == (-10));
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(hours47);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-10) + "'", int59 == (-10));
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(hours63);
        org.junit.Assert.assertNotNull(hours64);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2022" + "'", str72, "2022");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 292278993 + "'", int73 == 292278993);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(periodFormatter78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(periodFormatter82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "it" + "'", str86, "it");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Duration duration3 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period4 = duration3.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period4.getFieldTypes();
        org.joda.time.Period period7 = period4.minusYears((int) (byte) 1);
        org.joda.time.Period period9 = period4.plusMonths((int) (byte) 0);
        int int10 = period4.size();
        org.joda.time.Period period12 = period4.plusYears(100);
        org.joda.time.Period period14 = period4.minusSeconds(292278993);
        org.joda.time.Period period15 = period4.negated();
        org.joda.time.Hours hours16 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Hours hours17 = hours0.plus(hours16);
        org.joda.time.Hours hours18 = hours16.negated();
        java.lang.String str19 = hours18.toString();
        org.joda.time.Hours hours20 = org.joda.time.Hours.FOUR;
        boolean boolean21 = hours18.isGreaterThan(hours20);
        int int22 = hours20.getHours();
        int int23 = hours20.size();
        org.joda.time.Hours hours25 = hours20.multipliedBy((-9));
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0H" + "'", str19, "PT0H");
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(hours25);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(23);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period5.getFieldTypes();
        org.joda.time.Period period8 = period5.minusYears((int) (byte) 1);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Weeks weeks10 = weeks1.minus(weeks9);
        org.joda.time.Weeks weeks12 = weeks1.multipliedBy((-155));
        org.joda.time.Weeks weeks14 = weeks12.multipliedBy(214);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale locale7 = builder4.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusSeconds(19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        int int14 = dateTime2.getMinuteOfDay();
        org.joda.time.DateTime.Property property15 = dateTime2.secondOfMinute();
        int int16 = dateTime2.getEra();
        org.joda.time.DateTime dateTime18 = dateTime2.plusMillis((-596));
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(5184367, 13, (-40944), (-354488925), (-2201246));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -354488925 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours3 = hours1.multipliedBy(0);
        org.joda.time.Hours hours5 = hours1.dividedBy(69);
        org.joda.time.DurationFieldType durationFieldType7 = hours1.getFieldType((int) (byte) 0);
        boolean boolean8 = hours0.isGreaterThan(hours1);
        org.joda.time.Hours hours10 = hours1.multipliedBy((int) '#');
        org.joda.time.Hours hours12 = hours1.multipliedBy(2022);
        org.joda.time.Hours hours14 = hours12.plus(120);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) hours14, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-546), 0L);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(0L);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = dateTime2.toString(dateTimeFormatter4);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        int int14 = days12.get(durationFieldType13);
        mutablePeriod11.add(durationFieldType13, 8);
        int int17 = mutablePeriod11.getHours();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfEra();
        org.joda.time.Interval interval25 = property24.toInterval();
        boolean boolean26 = interval21.contains((org.joda.time.ReadableInterval) interval25);
        java.lang.String str27 = interval21.toString();
        mutablePeriod11.add((org.joda.time.ReadableInterval) interval21);
        java.lang.String str29 = interval21.toString();
        java.lang.String str30 = interval21.toString();
        org.joda.time.Duration duration31 = interval21.toDuration();
        org.joda.time.DateTime dateTime32 = dateTime2.plus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.DateTime dateTime34 = dateTime2.minusMillis(1972);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant39, periodType40);
        mutablePeriod41.setPeriod((long) 1, (-1L));
        mutablePeriod41.setMillis((int) (short) 0);
        int int47 = mutablePeriod41.getDays();
        mutablePeriod41.addYears((int) (short) 10);
        org.joda.time.DateTime dateTime50 = dateTime34.minus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.MutablePeriod mutablePeriod51 = mutablePeriod41.copy();
        mutablePeriod51.setWeeks((-292276));
        mutablePeriod51.setDays((int) (byte) 0);
        mutablePeriod51.addMonths((int) (short) 100);
        int int58 = mutablePeriod51.getWeeks();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:02:00.000+00:02" + "'", str5, "1970-01-01T00:02:00.000+00:02");
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02" + "'", str27, "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02" + "'", str29, "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02" + "'", str30, "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02");
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-292276) + "'", int58 == (-292276));
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.minusYears((int) (byte) 1);
        org.joda.time.Period period8 = period3.plusMonths((int) (byte) 0);
        int int9 = period3.size();
        org.joda.time.Period period11 = period3.plusYears(100);
        org.joda.time.Period period13 = period3.minusSeconds(292278993);
        org.joda.time.Period period14 = period3.negated();
        org.joda.time.Hours hours15 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period3);
        int[] intArray16 = period3.getValues();
        org.joda.time.Period period17 = period3.toPeriod();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = period17.normalizedStandard(periodType18);
        org.joda.time.Period period21 = period17.minusMonths((-1398041029));
        org.joda.time.Period period23 = period17.withMinutes(0);
        org.joda.time.Period period25 = period23.minusSeconds(36);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale6.getDisplayScript();
        java.lang.String str8 = dateTimeZone2.getShortName(100L, locale6);
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayName();
        java.lang.String str11 = locale6.getDisplayVariant();
        java.lang.String str12 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "giapponese" + "'", str9, "giapponese");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "giapponese" + "'", str10, "giapponese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "giapponese" + "'", str12, "giapponese");
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime2);
        org.joda.time.DateTime dateTime5 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Date date6 = dateTime5.toDate();
        java.lang.Object obj7 = null;
        org.joda.time.Instant instant8 = new org.joda.time.Instant(obj7);
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        java.lang.String str10 = dateTimeZone9.toString();
        int int12 = dateTimeZone9.getOffset(1L);
        boolean boolean14 = dateTimeZone9.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone9.getNameKey((long) 1);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone9);
        java.util.TimeZone timeZone18 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTime dateTime20 = dateTime5.toDateTime(dateTimeZone19);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration26 = duration23.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = duration23.toPeriodTo(readableInstant27);
        org.joda.time.Duration duration30 = duration23.withMillis((long) (short) 0);
        org.joda.time.Duration duration33 = duration23.withDurationAdded((long) 1, (int) ' ');
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        boolean boolean38 = dateTime36.isEqual(10L);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime36, periodType39);
        long long41 = dateTime36.getMillis();
        org.joda.time.DateTime.Property property42 = dateTime36.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfEra();
        org.joda.time.Interval interval47 = property46.toInterval();
        org.joda.time.DateTime dateTime48 = property46.roundFloorCopy();
        int int49 = dateTime48.getHourOfDay();
        org.joda.time.Duration duration52 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, readableInstant53, periodType54);
        java.lang.String str56 = duration52.toString();
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant60 = instant58.minus(100L);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration52, (org.joda.time.ReadableInstant) instant58);
        org.joda.time.Instant instant63 = instant58.withMillis((long) 1970);
        org.joda.time.MutableDateTime mutableDateTime64 = instant58.toMutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant69 = instant67.minus(100L);
        java.lang.String str70 = instant69.toString();
        org.joda.time.Duration duration73 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period74 = duration73.toPeriod();
        org.joda.time.Duration duration76 = duration73.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Period period78 = duration73.toPeriodTo(readableInstant77);
        org.joda.time.Duration duration80 = duration73.withMillis((long) (short) 0);
        org.joda.time.Instant instant81 = instant69.plus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean83 = instant69.isSupported(dateTimeFieldType82);
        int int84 = mutableDateTime64.get(dateTimeFieldType82);
        int int85 = dateTime20.get(dateTimeFieldType82);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime87 = dateTime20.withCenturyOfEra(85619999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85619999 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0.011S" + "'", str56, "PT0.011S");
        org.junit.Assert.assertNotNull(instant60);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1969-12-31T23:59:59.899Z" + "'", str70, "1969-12-31T23:59:59.899Z");
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNotNull(dateTimeFieldType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1970 + "'", int84 == 1970);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1969 + "'", int85 == 1969);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(86365000);
        org.joda.time.Duration duration2 = seconds1.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int18 = mutablePeriod17.getDays();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfEra();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfEra();
        org.joda.time.Interval interval28 = property27.toInterval();
        boolean boolean29 = interval24.contains((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        mutablePeriod17.setPeriod((long) 'u', (long) 1969, chronology30);
        org.joda.time.DurationField durationField32 = chronology30.eras();
        org.joda.time.Period period33 = new org.joda.time.Period((long) 19, 1439L, chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((int) ' ', 3911, (int) (byte) 0, 86399, 3909, 111, 208, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        boolean boolean9 = interval4.contains((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Chronology chronology10 = interval8.getChronology();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        org.joda.time.Weeks weeks14 = weeks12.minus((int) 'u');
        org.joda.time.Weeks weeks16 = weeks12.plus((int) '#');
        org.joda.time.Weeks weeks18 = weeks12.plus((-2147483647));
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.ZERO;
        java.lang.String str20 = weeks19.toString();
        org.joda.time.Period period22 = org.joda.time.Period.hours(1969);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = period27.getFieldTypes();
        int int29 = period27.getMinutes();
        org.joda.time.Weeks weeks30 = period27.toStandardWeeks();
        org.joda.time.Weeks weeks32 = weeks30.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks33 = weeks23.plus(weeks32);
        java.lang.String str34 = weeks23.toString();
        org.joda.time.Weeks weeks35 = weeks19.plus(weeks23);
        boolean boolean36 = weeks18.isGreaterThan(weeks19);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period40 = duration39.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray41 = period40.getFieldTypes();
        org.joda.time.Period period43 = period40.minusYears((int) (byte) 1);
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Weeks weeks46 = weeks44.plus(0);
        org.joda.time.Weeks weeks48 = weeks44.minus((int) 'a');
        boolean boolean49 = weeks19.isLessThan(weeks44);
        org.joda.time.Period period50 = weeks19.toPeriod();
        org.joda.time.Weeks weeks51 = weeks19.negated();
        long long54 = chronology10.add((org.joda.time.ReadablePeriod) weeks19, (long) 893, (-40944));
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(169L, chronology10);
        org.joda.time.DateTimeField dateTimeField56 = chronology10.halfdayOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0W" + "'", str20, "P0W");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P11W" + "'", str34, "P11W");
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldTypeArray41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 893L + "'", long54 == 893L);
        org.junit.Assert.assertNotNull(dateTimeField56);
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        java.lang.Object obj1 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant(obj1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone3);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = dateTimeZone3.getShortName(100L, locale7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 9, dateTimeZone3);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime10.withTime(0, (-1), 999, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (short) -1);
        org.joda.time.Minutes minutes3 = minutes1.minus(59);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes7 = minutes5.minus((int) (short) -1);
        boolean boolean8 = minutes4.isGreaterThan(minutes5);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        boolean boolean10 = minutes4.isLessThan(minutes9);
        org.joda.time.Minutes minutes12 = minutes4.plus((int) 'a');
        boolean boolean13 = minutes1.isLessThan(minutes12);
        org.joda.time.Minutes minutes15 = minutes12.plus(120);
        org.joda.time.PeriodType periodType16 = minutes15.getPeriodType();
        int int17 = periodType16.size();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        int int3 = property2.getMaximumValue();
        int int4 = property2.getLeapAmount();
        org.joda.time.DateTime dateTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 292278993 + "'", int3 == 292278993);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial6 = null;
        int int7 = dateTimeField2.getMinimumValue(readablePartial6);
        long long10 = dateTimeField2.add(0L, 69);
        org.joda.time.DurationField durationField11 = dateTimeField2.getRangeDurationField();
        long long14 = durationField11.getMillis(0, 259200000L);
        long long15 = durationField11.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 43200000L + "'", long5 == 43200000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2980800000L + "'", long10 == 2980800000L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 86400000L + "'", long15 == 86400000L);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 86399999);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Duration duration5 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, readableInstant6, periodType7);
        mutablePeriod8.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        mutablePeriod8.add(durationFieldType11, 8);
        int int14 = weeks2.get(durationFieldType11);
        org.joda.time.Duration duration15 = weeks2.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        org.joda.time.Weeks weeks19 = weeks17.minus((int) 'u');
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeks((-1));
        org.joda.time.Weeks weeks23 = weeks21.multipliedBy(59);
        boolean boolean24 = weeks19.isGreaterThan(weeks23);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeks(0);
        org.joda.time.Weeks weeks27 = weeks26.negated();
        org.joda.time.Weeks weeks28 = weeks23.minus(weeks26);
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeks((int) (short) 0);
        java.lang.String str31 = weeks30.toString();
        org.joda.time.Weeks weeks33 = weeks30.multipliedBy(6);
        java.lang.String str34 = weeks33.toString();
        org.joda.time.Weeks weeks35 = weeks28.minus(weeks33);
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.weeks((int) (byte) 0);
        org.joda.time.PeriodType periodType38 = weeks37.getPeriodType();
        boolean boolean39 = weeks35.isGreaterThan(weeks37);
        boolean boolean40 = weeks2.isGreaterThan(weeks35);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0W" + "'", str31, "P0W");
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P0W" + "'", str34, "P0W");
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValue();
        int int5 = property2.get();
        org.joda.time.DateTime dateTime7 = property2.addToCopy((long) 3732480);
        org.joda.time.Interval interval8 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 292278993 + "'", int4 == 292278993);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder4 = builder0.setVariant("2022");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("-81816-06-21T02:34:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: -81816-06-21T02:34:59.999Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en__2022");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en__2022");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.minusYears((int) (byte) 1);
        org.joda.time.Period period8 = period3.plusMonths((int) (byte) 0);
        int int9 = period3.size();
        org.joda.time.Period period10 = period3.toPeriod();
        org.joda.time.Period period12 = period3.withYears((int) (byte) 1);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType17);
        mutablePeriod18.setMillis((int) (short) 1);
        int int21 = mutablePeriod18.getSeconds();
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.THREE;
        org.joda.time.DurationFieldType durationFieldType23 = weeks22.getFieldType();
        mutablePeriod18.add(durationFieldType23, (int) (byte) 0);
        mutablePeriod18.addMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getRangeDurationType();
        int int30 = mutablePeriod18.get(durationFieldType29);
        java.lang.String str31 = durationFieldType29.getName();
        int int32 = period3.get(durationFieldType29);
        org.joda.time.Period period34 = period3.withMillis(0);
        org.joda.time.Period period36 = period34.plusSeconds(78719999);
        int int37 = period34.getHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "weekyears" + "'", str31, "weekyears");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMonths((int) '4');
        org.joda.time.Period period8 = mutablePeriod5.toPeriod();
        mutablePeriod5.setYears((int) (short) -1);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Duration duration16 = duration13.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = duration13.toPeriodTo(readableInstant17);
        org.joda.time.Days days19 = duration13.toStandardDays();
        boolean boolean20 = mutablePeriod5.equals((java.lang.Object) days19);
        org.joda.time.Days days21 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        int int23 = days21.get(durationFieldType22);
        boolean boolean24 = days19.isGreaterThan(days21);
        org.joda.time.Days days26 = days19.dividedBy((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        boolean boolean28 = days26.isLessThan(days27);
        org.joda.time.Days days30 = days27.plus(10);
        org.joda.time.Days days31 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.minutes();
        int int33 = days31.get(durationFieldType32);
        org.joda.time.MutablePeriod mutablePeriod34 = days31.toMutablePeriod();
        int int35 = days31.getDays();
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration41 = duration38.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = duration38.toPeriodTo(readableInstant42);
        org.joda.time.Days days44 = duration38.toStandardDays();
        org.joda.time.Days days46 = days44.multipliedBy((int) '#');
        org.joda.time.Days days47 = days31.minus(days46);
        org.joda.time.Days days48 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.minutes();
        int int50 = days48.get(durationFieldType49);
        org.joda.time.MutablePeriod mutablePeriod51 = days48.toMutablePeriod();
        org.joda.time.Days days53 = days48.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration54 = days48.toStandardDuration();
        org.joda.time.Days days55 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.minutes();
        int int57 = days55.get(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod58 = days55.toMutablePeriod();
        org.joda.time.Days days60 = days55.multipliedBy((int) (byte) 1);
        org.joda.time.Days days61 = days48.minus(days55);
        int int62 = days31.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days61);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period66 = duration65.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray67 = period66.getFieldTypes();
        int int68 = period66.getMinutes();
        org.joda.time.Period period70 = period66.withDays((int) ' ');
        org.joda.time.Period period72 = period66.plusWeeks(10);
        org.joda.time.Period period74 = period66.withSeconds((int) (byte) 1);
        org.joda.time.Period period76 = period66.minusDays((int) (byte) 1);
        org.joda.time.Days days78 = org.joda.time.Days.days(0);
        org.joda.time.Days days80 = days78.dividedBy((int) (short) 10);
        org.joda.time.Duration duration81 = days78.toStandardDuration();
        org.joda.time.Days days83 = days78.dividedBy(69);
        org.joda.time.Period period84 = period66.plus((org.joda.time.ReadablePeriod) days83);
        org.joda.time.Days days86 = days83.dividedBy(6);
        org.joda.time.Days days88 = days83.plus(11);
        org.joda.time.Days days89 = days61.plus(days83);
        boolean boolean90 = days30.isLessThan(days61);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod58);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(durationFieldTypeArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(days78);
        org.junit.Assert.assertNotNull(days80);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(days83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(days86);
        org.junit.Assert.assertNotNull(days88);
        org.junit.Assert.assertNotNull(days89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        org.joda.time.Period period1 = org.joda.time.Period.months(11);
        org.joda.time.Period period3 = period1.minusSeconds(78719999);
        org.joda.time.Period period5 = period3.minusWeeks((int) 'a');
        int int6 = period5.getHours();
        org.joda.time.Period period8 = period5.plusDays(0);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfEra();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        boolean boolean18 = interval13.contains((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weeks();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.era();
        org.joda.time.Chronology chronology24 = chronology19.withUTC();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) period5, periodType9, chronology19);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter3.withParseType(periodType4);
        org.joda.time.format.PeriodParser periodParser6 = periodFormatter3.getParser();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withLocale(locale7);
        org.joda.time.PeriodType periodType9 = periodFormatter8.getParseType();
        java.util.Locale locale10 = periodFormatter8.getLocale();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType12 = periodType11.withMonthsRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType11);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter8.withParseType(periodType11);
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter8.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = org.joda.time.Period.parse("1969-12-31T23:59:59.999Z/1969-12-31T23:59:59.999Z", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodParser6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(periodType9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodPrinter16);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.withHours(1);
        org.joda.time.Duration duration7 = period3.toStandardDuration();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("AD", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLanguageTag("P0W");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: P0W [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial6 = null;
        int int7 = dateTimeField2.getMinimumValue(readablePartial6);
        long long10 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        long long17 = dateTimeField14.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial18 = null;
        int int19 = dateTimeField14.getMinimumValue(readablePartial18);
        java.lang.String str20 = dateTimeField14.toString();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "hi!");
        java.lang.String str26 = locale21.getDisplayCountry(locale25);
        java.lang.String str27 = locale25.getDisplayVariant();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale25.getDisplayVariant(locale28);
        int int30 = dateTimeField14.getMaximumTextLength(locale25);
        org.joda.time.format.PeriodPrinter periodPrinter31 = null;
        org.joda.time.format.PeriodParser periodParser32 = null;
        org.joda.time.format.PeriodFormatter periodFormatter33 = new org.joda.time.format.PeriodFormatter(periodPrinter31, periodParser32);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter35 = periodFormatter33.withParseType(periodType34);
        java.util.Locale locale36 = periodFormatter33.getLocale();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.lang.String str38 = locale37.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter39 = periodFormatter33.withLocale(locale37);
        java.util.Locale locale40 = locale37.stripExtensions();
        java.lang.String str41 = locale25.getDisplayLanguage(locale40);
        java.lang.String str42 = dateTimeField2.getAsText((long) 86365000, locale40);
        org.joda.time.DurationField durationField43 = dateTimeField2.getRangeDurationField();
        long long45 = dateTimeField2.roundFloor((long) 970);
        long long48 = dateTimeField2.addWrapField(50384462399999L, (-1439));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 43200000L + "'", long5 == 43200000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 43200000L + "'", long17 == 43200000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateTimeField[halfdayOfDay]" + "'", str20, "DateTimeField[halfdayOfDay]");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale25.toString(), "_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Italy" + "'", str26, "Italy");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodFormatter35);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(periodFormatter39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AM" + "'", str42, "AM");
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-120000L) + "'", long45 == (-120000L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 50384419199999L + "'", long48 == 50384419199999L);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        long long11 = durationField10.getUnitMillis();
        long long14 = durationField10.subtract((long) (-1), 172800000L);
        long long17 = durationField10.add((long) 21, 23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 604800000L + "'", long11 == 604800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-104509440000000001L) + "'", long14 == (-104509440000000001L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 13910400021L + "'", long17 == 13910400021L);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.minutes();
        int int2 = days0.get(durationFieldType1);
        org.joda.time.MutablePeriod mutablePeriod3 = days0.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.toMutablePeriod();
        mutablePeriod4.setYears(10);
        mutablePeriod4.setYears((-718));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes15 = minutes13.minus((int) (short) -1);
        boolean boolean16 = minutes12.isGreaterThan(minutes13);
        org.joda.time.Minutes minutes17 = null;
        org.joda.time.Minutes minutes18 = minutes13.minus(minutes17);
        int int19 = minutes13.getMinutes();
        org.joda.time.DateTime dateTime21 = dateTime11.withPeriodAdded((org.joda.time.ReadablePeriod) minutes13, 19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.toDateTime(chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.DateTime dateTime29 = dateTime23.withFieldAdded(durationFieldType27, (-100));
        org.joda.time.DateTime dateTime31 = dateTime29.minusYears(98);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMinutes((-11));
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfEra();
        org.joda.time.Interval interval41 = property40.toInterval();
        boolean boolean42 = interval37.contains((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.yearOfEra();
        org.joda.time.DateTime dateTime49 = dateTime29.toDateTime(chronology43);
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2147483648) + "'", int19 == (-2147483648));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(instant50);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        java.lang.String str6 = duration2.toString();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant10 = instant8.minus(100L);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant12 = instant8.toInstant();
        org.joda.time.Instant instant15 = instant12.withDurationAdded((long) 35, 0);
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.011S" + "'", str6, "PT0.011S");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType8, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) 0, periodType8, chronology11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        int int14 = periodType8.indexOf(durationFieldType13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType16 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter17 = periodFormatter2.getPrinter();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearWeekDayTime();
        int int19 = periodType18.size();
        org.joda.time.PeriodType periodType20 = periodType18.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withParseType(periodType20);
        org.joda.time.format.PeriodPrinter periodPrinter22 = periodFormatter21.getPrinter();
        boolean boolean23 = periodFormatter21.isPrinter();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType29, chronology30);
        org.joda.time.PeriodType periodType32 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withSecondsRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withZoneRetainFields(dateTimeZone38);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime42 = instant41.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        org.joda.time.DateTime dateTime44 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Duration duration47 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType49);
        mutablePeriod50.setMonths((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime42.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.DateTime dateTime55 = dateTime42.minusWeeks((int) (byte) 1);
        int int56 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property57 = dateTime42.minuteOfHour();
        org.joda.time.DateTime dateTime59 = dateTime42.withYear(1969);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.year();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField63 = chronology60.year();
        org.joda.time.Period period64 = new org.joda.time.Period((long) (byte) 100, (long) 'a', periodType34, chronology60);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) '#', chronology60);
        mutablePeriod65.clear();
        mutablePeriod65.add(86399999L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = periodFormatter21.print((org.joda.time.ReadablePeriod) mutablePeriod65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodType16);
        org.junit.Assert.assertNull(periodPrinter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNull(periodPrinter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType4, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (short) 0, periodType4, chronology7);
        org.joda.time.PeriodType periodType9 = periodType4.withHoursRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfEra();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        boolean boolean18 = interval13.contains((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weeks();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DurationField durationField22 = chronology19.centuries();
        org.joda.time.DurationField durationField23 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfWeek();
        org.joda.time.DurationField durationField25 = chronology19.minutes();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(454L, periodType9, chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology19.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-9859));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setPeriod((long) 1, (-1L));
        mutablePeriod5.setMillis((int) (short) 0);
        mutablePeriod5.setWeeks(7);
        int int13 = mutablePeriod5.getMinutes();
        mutablePeriod5.clear();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(27882719L, (-42679977L));
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration23 = null;
        boolean boolean24 = duration21.isEqual(readableDuration23);
        org.joda.time.Duration duration26 = duration21.minus((long) 1);
        org.joda.time.Duration duration28 = duration26.minus((long) '4');
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.DateTime.Property property32 = dateTime31.era();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration41 = duration38.plus((long) (byte) 0);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime44 = instant43.toDateTime();
        boolean boolean46 = dateTime44.isEqual(10L);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType49, chronology50);
        org.joda.time.PeriodType periodType52 = periodType49.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime44, periodType52);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableDuration) duration35, periodType52);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime31, periodType55);
        org.joda.time.TimeOfDay timeOfDay57 = dateTime31.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.DateTime dateTime59 = timeOfDay57.toDateTime(readableInstant58);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant63 = instant61.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime64 = instant61.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime65 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Instant instant66 = instant61.toInstant();
        java.lang.String str67 = instant61.toString();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        org.joda.time.DateTime.Property property70 = dateTime69.yearOfEra();
        org.joda.time.Interval interval71 = property70.toInterval();
        org.joda.time.DateTime dateTime72 = interval71.getStart();
        org.joda.time.DateTime.Property property73 = dateTime72.yearOfEra();
        mutablePeriod5.setPeriod((org.joda.time.ReadableInstant) instant61, (org.joda.time.ReadableInstant) dateTime72);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = mutablePeriod5.getValue(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str67, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(31536000000L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Period period3 = duration1.toPeriod();
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period5 = period3.normalizedStandard();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        int int7 = dateTime2.getEra();
        org.joda.time.DateTime dateTime9 = dateTime2.withWeekyear(0);
        org.joda.time.DateTime dateTime11 = dateTime2.minusMinutes(70);
        org.joda.time.DateTime dateTime13 = dateTime2.withMonthOfYear(2);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 10, (int) (byte) 0, 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        boolean boolean13 = interval8.contains((org.joda.time.ReadableInterval) interval12);
        java.lang.String str14 = interval12.toString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        boolean boolean23 = interval18.contains((org.joda.time.ReadableInterval) interval22);
        boolean boolean24 = interval12.isBefore((org.joda.time.ReadableInterval) interval22);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Chronology chronology26 = interval22.getChronology();
        org.joda.time.MutableInterval mutableInterval27 = interval22.toMutableInterval();
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval27);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02" + "'", str14, "2022-01-01T00:00:00.000+00:02/2023-01-01T00:00:00.000+00:02");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertNotNull(minutes28);
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getID();
        java.lang.String str7 = dateTimeZone2.getNameKey(1842739200000L);
        int int9 = dateTimeZone2.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime22 = dateTime4.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.withMillisOfDay((int) (byte) 10);
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded((long) 281, (int) '#');
        org.joda.time.Period period29 = org.joda.time.Period.minutes((int) (byte) -1);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33, periodType34);
        mutablePeriod35.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.days();
        mutablePeriod35.add(durationFieldType38, 8);
        java.lang.String str41 = durationFieldType38.toString();
        java.lang.String str42 = durationFieldType38.getName();
        java.lang.String str43 = durationFieldType38.getName();
        org.joda.time.Period period45 = period29.withField(durationFieldType38, 39600000);
        java.lang.String str46 = period29.toString();
        org.joda.time.DateTime dateTime47 = dateTime22.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Minutes minutes48 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period29);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "days" + "'", str41, "days");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "days" + "'", str42, "days");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "days" + "'", str43, "days");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT-1M" + "'", str46, "PT-1M");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(minutes48);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMonths((int) '4');
        mutablePeriod5.addWeeks(8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.Duration duration17 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType19);
        mutablePeriod20.setMonths((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime12.plus((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTime dateTime25 = dateTime12.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property26 = dateTime25.monthOfYear();
        org.joda.time.DateTime.Property property27 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = dateTime25.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime31 = dateTime28.withZone(dateTimeZone30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.Instant instant37 = dateTime34.toInstant();
        org.joda.time.DateMidnight dateMidnight38 = dateTime34.toDateMidnight();
        int int39 = dateMidnight38.getDayOfYear();
        boolean boolean40 = dateMidnight38.isAfterNow();
        org.joda.time.Instant instant41 = dateMidnight38.toInstant();
        boolean boolean42 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds46 = duration45.toStandardSeconds();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant50 = instant48.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime51 = instant48.toMutableDateTimeISO();
        org.joda.time.Period period52 = duration45.toPeriodTo((org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeZone dateTimeZone53 = instant48.getZone();
        mutablePeriod5.setPeriod((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) instant48);
        mutablePeriod5.setMinutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 365 + "'", int39 == 365);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        int int7 = dateTime2.getEra();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        long long12 = chronology8.add((long) 1439, (long) 'a', 1439);
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType14.getField(chronology15);
        long long19 = dateTimeField16.add(0L, (long) (short) 1);
        boolean boolean21 = dateTimeField16.isLeap(10L);
        int int22 = dateTimeField16.getMinimumValue();
        long long24 = dateTimeField16.roundHalfEven((long) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        java.util.Locale locale32 = java.util.Locale.UK;
        java.lang.String str33 = locale32.getDisplayScript();
        java.lang.String str34 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localTime30, 0, locale32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfEra();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.Interval interval42 = property41.toInterval();
        boolean boolean43 = interval38.contains((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Chronology chronology44 = interval42.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.weeks();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.minuteOfHour();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        org.joda.time.TimeOfDay timeOfDay50 = dateTime49.toTimeOfDay();
        int int51 = dateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay50);
        org.joda.time.Hours hours52 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localTime30, (org.joda.time.ReadablePartial) timeOfDay50);
        int int53 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.Chronology chronology54 = localTime30.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long62 = chronology54.getDateTimeMillis(53878857, 0, 54041, 53786950, 900, (-400077), (-400077));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53786950 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 141022L + "'", long12 == 141022L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 43200000L + "'", long19 == 43200000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AM" + "'", str34, "AM");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-292275054) + "'", int53 == (-292275054));
        org.junit.Assert.assertNotNull(chronology54);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1970);
        mutablePeriod1.setMonths(1969);
        mutablePeriod1.setHours(5);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType12);
        org.joda.time.Days days14 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        int int16 = days14.get(durationFieldType15);
        mutablePeriod13.add(durationFieldType15, 8);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutablePeriod13.add(readablePeriod19);
        int int21 = mutablePeriod13.getMonths();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfEra();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.Interval interval29 = property28.toInterval();
        boolean boolean30 = interval25.contains((org.joda.time.ReadableInterval) interval29);
        mutablePeriod13.setPeriod((org.joda.time.ReadableInterval) interval25);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withZoneRetainFields(dateTimeZone37);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = dateTime41.withTimeAtStartOfDay();
        org.joda.time.Duration duration46 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47, periodType48);
        mutablePeriod49.setMonths((int) '4');
        org.joda.time.DateTime dateTime52 = dateTime41.plus((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.DateTime dateTime54 = dateTime41.minusWeeks((int) (byte) 1);
        int int55 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime.Property property56 = dateTime41.minuteOfHour();
        org.joda.time.DateTime dateTime58 = dateTime41.withYear(1969);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.DurationField durationField60 = durationFieldType33.getField(chronology59);
        mutablePeriod13.add((-43199999L), chronology59);
        org.joda.time.DurationField durationField62 = chronology59.millis();
        org.joda.time.DurationField durationField63 = chronology59.months();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) 69, chronology59);
        org.joda.time.DateTimeField dateTimeField65 = chronology59.minuteOfDay();
        org.joda.time.DurationField durationField66 = chronology59.months();
        org.joda.time.Instant instant68 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime69 = instant68.toDateTime();
        org.joda.time.TimeOfDay timeOfDay70 = dateTime69.toTimeOfDay();
        int[] intArray72 = chronology59.get((org.joda.time.ReadablePartial) timeOfDay70, (long) 86399);
        long long76 = chronology59.add(0L, 86400467L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField77 = chronology59.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField78 = chronology59.hourOfHalfday();
        mutablePeriod1.setPeriod(62220787320028L, chronology59);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 1, 26, 399]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 8380845299L + "'", long76 == 8380845299L);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Instant instant23 = dateTime20.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime20.withMillis((long) '4');
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime20);
        boolean boolean27 = dateTime8.isBeforeNow();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        mutablePeriod8.setWeeks((int) '4');
        org.joda.time.Days days11 = org.joda.time.Days.THREE;
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) days11);
        int int13 = mutablePeriod8.getMinutes();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType18);
        java.lang.String str20 = duration16.toString();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant24 = instant22.minus(100L);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant27 = instant22.withMillis((long) 1970);
        org.joda.time.MutableDateTime mutableDateTime28 = instant22.toMutableDateTime();
        org.joda.time.Duration duration29 = mutablePeriod8.toDurationTo((org.joda.time.ReadableInstant) instant22);
        int int30 = mutablePeriod8.getWeeks();
        mutablePeriod8.addDays(1645455);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0.011S" + "'", str20, "PT0.011S");
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes1.minus((int) (short) -1);
        boolean boolean4 = minutes0.isGreaterThan(minutes1);
        org.joda.time.Minutes minutes5 = null;
        org.joda.time.Minutes minutes6 = minutes1.minus(minutes5);
        org.joda.time.Minutes minutes8 = minutes1.minus((int) (byte) -1);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.minus((int) (short) -1);
        boolean boolean13 = minutes9.isGreaterThan(minutes10);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.TWO;
        boolean boolean15 = minutes9.isLessThan(minutes14);
        boolean boolean16 = minutes1.isLessThan(minutes9);
        java.lang.String str17 = minutes9.toString();
        org.joda.time.PeriodType periodType18 = minutes9.getPeriodType();
        int int19 = periodType18.size();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT-2147483648M" + "'", str17, "PT-2147483648M");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0S");
        org.joda.time.Hours hours2 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours4 = hours2.multipliedBy(0);
        org.joda.time.Hours hours6 = hours2.dividedBy(69);
        org.joda.time.Hours hours7 = hours2.negated();
        org.joda.time.Hours hours9 = hours7.multipliedBy(0);
        org.joda.time.Hours hours10 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours11 = hours9.plus(hours10);
        boolean boolean12 = hours1.isGreaterThan(hours9);
        java.lang.String str13 = hours9.toString();
        org.joda.time.DurationFieldType durationFieldType14 = hours9.getFieldType();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0H" + "'", str13, "PT0H");
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        java.lang.String str12 = dateTimeField11.getName();
        boolean boolean14 = dateTimeField11.isLeap(0L);
        boolean boolean15 = dateTimeField11.isLenient();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "minuteOfHour" + "'", str12, "minuteOfHour");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Instant instant6 = new org.joda.time.Instant(obj5);
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) 10);
        java.lang.String str12 = dateTimeZone7.getName((long) 8);
        java.lang.String str14 = dateTimeZone7.getShortName(181025280000000000L);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime2.toMutableDateTime(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = duration2.toPeriodTo(readableInstant6);
        org.joda.time.Days days8 = duration2.toStandardDays();
        long long9 = duration2.getStandardSeconds();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant13 = instant11.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant11.toMutableDateTimeISO();
        java.lang.Object obj15 = null;
        org.joda.time.Instant instant16 = new org.joda.time.Instant(obj15);
        boolean boolean17 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant18 = instant16.toInstant();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType22, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 0, periodType22, chronology25);
        org.joda.time.Period period27 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) instant18, periodType22);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime32 = instant31.toDateTime();
        org.joda.time.DateTime.Property property33 = dateTime32.era();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant37 = instant35.minus(100L);
        org.joda.time.Instant instant39 = instant37.plus((long) 100);
        org.joda.time.Instant instant41 = instant37.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) instant37);
        org.joda.time.LocalTime localTime43 = dateTime32.toLocalTime();
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(2678400000L, 720070L, chronology44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) instant18, chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(34L, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.addMonths(360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        boolean boolean17 = interval12.contains((org.joda.time.ReadableInterval) interval16);
        boolean boolean18 = interval7.contains((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType23);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        int int27 = days25.get(durationFieldType26);
        mutablePeriod24.add(durationFieldType26, 8);
        int int30 = mutablePeriod24.getHours();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfEra();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfEra();
        org.joda.time.Interval interval38 = property37.toInterval();
        boolean boolean39 = interval34.contains((org.joda.time.ReadableInterval) interval38);
        java.lang.String str40 = interval34.toString();
        mutablePeriod24.add((org.joda.time.ReadableInterval) interval34);
        java.lang.String str42 = interval34.toString();
        java.lang.String str43 = interval34.toString();
        boolean boolean44 = interval12.isAfter((org.joda.time.ReadableInterval) interval34);
        long long45 = interval34.getStartMillis();
        org.joda.time.MutableInterval mutableInterval46 = interval34.toMutableInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str40, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str42, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str43, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1640995200000L + "'", long45 == 1640995200000L);
        org.junit.Assert.assertNotNull(mutableInterval46);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute(1);
        java.lang.Object obj27 = null;
        org.joda.time.Instant instant28 = new org.joda.time.Instant(obj27);
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        java.lang.String str30 = dateTimeZone29.toString();
        java.lang.String str32 = dateTimeZone29.getName((long) 10);
        java.lang.String str34 = dateTimeZone29.getName((long) 8);
        java.util.Locale locale36 = java.util.Locale.FRENCH;
        java.lang.String str37 = dateTimeZone29.getName((long) 1969, locale36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime24.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime40 = dateTime24.minusDays(48);
        org.joda.time.DateTime.Property property41 = dateTime24.centuryOfEra();
        org.joda.time.DateTime dateTime43 = dateTime24.withEra(0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMillis((int) (short) 1);
        int int8 = mutablePeriod5.getSeconds();
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.THREE;
        org.joda.time.DurationFieldType durationFieldType10 = weeks9.getFieldType();
        mutablePeriod5.add(durationFieldType10, (int) (byte) 0);
        mutablePeriod5.setSeconds(1439);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType16 = periodType15.withMonthsRemoved();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = duration19.toPeriodTo(readableInstant23);
        org.joda.time.Weeks weeks25 = period24.toStandardWeeks();
        org.joda.time.DurationFieldType durationFieldType26 = null;
        int int27 = period24.get(durationFieldType26);
        int int28 = period24.getWeeks();
        org.joda.time.Duration duration29 = period24.toStandardDuration();
        boolean boolean30 = periodType16.equals((java.lang.Object) duration29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime33 = instant32.toDateTime();
        org.joda.time.DateTime.Property property34 = dateTime33.era();
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withFields(readablePartial35);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType39, chronology40);
        org.joda.time.PeriodType periodType42 = periodType39.withWeeksRemoved();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.PeriodType periodType44 = periodType43.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime36, periodType44);
        org.joda.time.Duration duration46 = mutablePeriod5.toDurationTo((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean47 = dateTime36.isEqualNow();
        org.joda.time.DateTime.Property property48 = dateTime36.millisOfSecond();
        java.lang.String str49 = property48.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Property[millisOfSecond]" + "'", str49, "Property[millisOfSecond]");
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.get((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        long long10 = dateTimeField7.add(0L, (long) (short) 1);
        long long12 = dateTimeField7.roundHalfCeiling((long) 2);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant20 = instant18.minus(100L);
        org.joda.time.Instant instant22 = instant20.plus((long) 100);
        org.joda.time.Instant instant24 = instant20.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.LocalTime localTime26 = dateTime15.toLocalTime();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31, periodType32);
        mutablePeriod33.setMonths((int) '4');
        org.joda.time.Period period36 = mutablePeriod33.toPeriod();
        int[] intArray37 = period36.getValues();
        int[] intArray39 = dateTimeField7.addWrapField((org.joda.time.ReadablePartial) localTime26, 0, intArray37, 3);
        int int40 = localTime26.size();
        int int41 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localTime26);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = dateTimeField2.set((long) 85559999, "T23:59:59.999");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T23:59:59.999\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 43200000L + "'", long10 == 43200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 52, 0, 0, 0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 52, 0, 0, 0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.minusYears((int) (byte) 1);
        org.joda.time.Period period8 = period3.plusMonths((int) (byte) 0);
        int int9 = period3.size();
        org.joda.time.Period period11 = period3.plusYears(100);
        org.joda.time.Period period13 = period3.minusSeconds(292278993);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType18);
        mutablePeriod19.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.days();
        mutablePeriod19.add(durationFieldType22, 8);
        boolean boolean25 = period3.isSupported(durationFieldType22);
        org.joda.time.Period period27 = period3.withSeconds(169);
        org.joda.time.Period period29 = period27.plusSeconds(59);
        org.joda.time.Period period31 = period27.minusYears(31);
        org.joda.time.Period period33 = period31.withHours(23);
        org.joda.time.Period period35 = period31.minusHours((-292276));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes36 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P-31YT292276H169S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant3 = instant1.minus(100L);
        org.joda.time.Instant instant5 = instant3.plus((long) 100);
        boolean boolean6 = instant3.isBeforeNow();
        org.joda.time.DateTime dateTime7 = instant3.toDateTimeISO();
        org.joda.time.Instant instant9 = instant3.withMillis(10586950L);
        org.joda.time.DateTimeZone dateTimeZone10 = instant3.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMillisOfSecond();
        org.joda.time.DateTime dateTime14 = dateTime11.withYear((-9859));
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 465 + "'", int12 == 465);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        int int5 = property3.getMaximumValueOverall();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = property3.getMaximumShortTextLength(locale6);
        org.joda.time.DateTime dateTime10 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime11 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant15 = instant13.minus(100L);
        java.lang.String str16 = instant15.toString();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = duration19.toPeriodTo(readableInstant23);
        org.joda.time.Duration duration26 = duration19.withMillis((long) (short) 0);
        org.joda.time.Instant instant27 = instant15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTime dateTime29 = dateTime10.withDurationAdded((org.joda.time.ReadableDuration) duration19, 2);
        org.joda.time.DateTime dateTime31 = dateTime29.plus((long) 3);
        int int32 = dateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = dateTime29.plusMonths((-3861186));
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31T23:59:59.899Z" + "'", str16, "1969-12-31T23:59:59.899Z");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfEra();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.Interval interval9 = property8.toInterval();
        boolean boolean10 = interval5.contains((org.joda.time.ReadableInterval) interval9);
        java.lang.Object obj11 = null;
        org.joda.time.Instant instant12 = new org.joda.time.Instant(obj11);
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        boolean boolean16 = interval5.contains((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        boolean boolean21 = interval5.contains((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period22 = interval5.toPeriod();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray27 = period26.getFieldTypes();
        int int28 = period26.getMinutes();
        org.joda.time.Period period30 = period26.withDays((int) ' ');
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        org.joda.time.Period period32 = interval5.toPeriod(periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((-2592000000L), 181025280000000000L, periodType31);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldTypeArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.DateTime.Property property18 = dateTime8.yearOfEra();
        java.util.GregorianCalendar gregorianCalendar19 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime dateTime21 = dateTime8.minusMillis((int) (short) -1);
        org.joda.time.Instant instant22 = dateTime8.toInstant();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period30 = duration29.toPeriod();
        boolean boolean31 = duration25.isEqual((org.joda.time.ReadableDuration) duration29);
        java.lang.String str32 = duration29.toString();
        org.joda.time.Instant instant33 = instant22.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.MutableDateTime mutableDateTime34 = instant33.toMutableDateTimeISO();
        int int35 = mutableDateTime34.getMonthOfYear();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0S" + "'", str32, "PT0S");
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add(0L, (long) (short) 1);
        long long7 = dateTimeField2.roundHalfCeiling((long) 2);
        org.joda.time.DurationField durationField8 = dateTimeField2.getDurationField();
        long long10 = durationField8.getMillis((int) '4');
        long long13 = durationField8.add((long) (short) 10, 0L);
        long long14 = durationField8.getUnitMillis();
        long long16 = durationField8.getMillis(86399999);
        int int19 = durationField8.getValue((long) 2022, 420007L);
        long long22 = durationField8.add(0L, 281L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 43200000L + "'", long5 == 43200000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2246400000L + "'", long10 == 2246400000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 43200000L + "'", long14 == 43200000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3732479956800000L + "'", long16 == 3732479956800000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 12139200000L + "'", long22 == 12139200000L);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime2);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType15);
        boolean boolean17 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = duration20.toPeriodTo(readableInstant24);
        org.joda.time.Duration duration27 = duration20.minus(43200000L);
        org.joda.time.Duration duration29 = duration13.withDurationAdded((org.joda.time.ReadableDuration) duration20, (int) ' ');
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType31 = periodType30.withMinutesRemoved();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration29, periodType31);
        org.joda.time.DateTime.Property property33 = dateTime2.dayOfWeek();
        int int34 = property33.get();
        org.joda.time.DateTime dateTime35 = property33.roundFloorCopy();
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime38 = instant37.toDateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.ReadablePartial readablePartial40 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.withFields(readablePartial40);
        org.joda.time.DateMidnight dateMidnight42 = dateTime41.toDateMidnight();
        boolean boolean44 = dateTime41.isAfter(0L);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime48 = instant47.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withZoneRetainFields(dateTimeZone49);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime53 = instant52.toDateTime();
        org.joda.time.DateTime.Property property54 = dateTime53.era();
        org.joda.time.DateTime dateTime55 = dateTime53.withTimeAtStartOfDay();
        org.joda.time.Duration duration58 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration58, readableInstant59, periodType60);
        mutablePeriod61.setMonths((int) '4');
        org.joda.time.DateTime dateTime64 = dateTime53.plus((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.DateTime dateTime66 = dateTime53.minusWeeks((int) (byte) 1);
        int int67 = dateTime50.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.format.PeriodPrinter periodPrinter68 = null;
        org.joda.time.format.PeriodParser periodParser69 = null;
        org.joda.time.format.PeriodFormatter periodFormatter70 = new org.joda.time.format.PeriodFormatter(periodPrinter68, periodParser69);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter72 = periodFormatter70.withParseType(periodType71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant45, (org.joda.time.ReadableInstant) dateTime50, periodType71);
        org.joda.time.Duration duration76 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration76, readableInstant77, periodType78);
        org.joda.time.Days days80 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType81 = org.joda.time.DurationFieldType.minutes();
        int int82 = days80.get(durationFieldType81);
        mutablePeriod79.add(durationFieldType81, 8);
        mutablePeriod73.add(durationFieldType81, (int) (short) 100);
        java.lang.String str87 = durationFieldType81.getName();
        org.joda.time.DateTime dateTime89 = dateTime41.withFieldAdded(durationFieldType81, (-292276));
        org.joda.time.DateTime dateTime90 = dateTime41.withLaterOffsetAtOverlap();
        boolean boolean91 = dateTime35.equals((java.lang.Object) dateTime41);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodFormatter72);
        org.junit.Assert.assertNotNull(days80);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "minutes" + "'", str87, "minutes");
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(10);
        org.joda.time.DurationFieldType durationFieldType2 = minutes1.getFieldType();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        java.lang.String str9 = interval3.toString();
        long long10 = interval3.getEndMillis();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        boolean boolean20 = interval15.contains((org.joda.time.ReadableInterval) interval19);
        java.lang.String str21 = interval19.toString();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfEra();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.Interval interval29 = property28.toInterval();
        boolean boolean30 = interval25.contains((org.joda.time.ReadableInterval) interval29);
        boolean boolean31 = interval19.isBefore((org.joda.time.ReadableInterval) interval29);
        boolean boolean32 = interval3.overlaps((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfEra();
        org.joda.time.Interval interval40 = property39.toInterval();
        boolean boolean41 = interval36.contains((org.joda.time.ReadableInterval) interval40);
        java.lang.Object obj42 = null;
        org.joda.time.Instant instant43 = new org.joda.time.Instant(obj42);
        org.joda.time.DateTimeZone dateTimeZone44 = instant43.getZone();
        java.lang.String str45 = dateTimeZone44.toString();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone44);
        boolean boolean47 = interval36.contains((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime50 = instant49.toDateTime();
        org.joda.time.DateTime.Property property51 = dateTime50.era();
        boolean boolean52 = interval36.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfEra();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.Interval interval60 = property59.toInterval();
        boolean boolean61 = interval56.contains((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DateTime.Property property64 = dateTime63.yearOfEra();
        org.joda.time.Interval interval65 = property64.toInterval();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology66);
        org.joda.time.DateTime.Property property68 = dateTime67.yearOfEra();
        org.joda.time.Interval interval69 = property68.toInterval();
        boolean boolean70 = interval65.contains((org.joda.time.ReadableInterval) interval69);
        boolean boolean71 = interval60.contains((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology72);
        org.joda.time.DateTime.Property property74 = dateTime73.yearOfEra();
        org.joda.time.Interval interval75 = property74.toInterval();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(chronology76);
        org.joda.time.DateTime.Property property78 = dateTime77.yearOfEra();
        org.joda.time.Interval interval79 = property78.toInterval();
        boolean boolean80 = interval75.contains((org.joda.time.ReadableInterval) interval79);
        java.lang.String str81 = interval79.toString();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(chronology82);
        org.joda.time.DateTime.Property property84 = dateTime83.yearOfEra();
        org.joda.time.Interval interval85 = property84.toInterval();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(chronology86);
        org.joda.time.DateTime.Property property88 = dateTime87.yearOfEra();
        org.joda.time.Interval interval89 = property88.toInterval();
        boolean boolean90 = interval85.contains((org.joda.time.ReadableInterval) interval89);
        boolean boolean91 = interval79.isBefore((org.joda.time.ReadableInterval) interval89);
        boolean boolean92 = interval65.overlaps((org.joda.time.ReadableInterval) interval89);
        boolean boolean93 = interval36.isAfter((org.joda.time.ReadableInterval) interval89);
        boolean boolean94 = interval19.isBefore((org.joda.time.ReadableInterval) interval36);
        org.joda.time.DateTime dateTime95 = interval19.getStart();
        org.joda.time.MutableDateTime mutableDateTime96 = dateTime95.toMutableDateTime();
        org.joda.time.DateTime dateTime98 = dateTime95.minusMinutes(75659999);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str9, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1672531200000L + "'", long10 == 1672531200000L);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str21, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z" + "'", str81, "2022-01-01T00:00:00.000Z/2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertNotNull(mutableDateTime96);
        org.junit.Assert.assertNotNull(dateTime98);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.weekOfWeekyear();
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType10);
        org.joda.time.DateTime dateTime12 = dateTime4.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration17 = null;
        boolean boolean18 = duration15.isEqual(readableDuration17);
        org.joda.time.Duration duration20 = duration15.minus((long) 1);
        org.joda.time.Duration duration22 = duration20.minus((long) '4');
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.joda.time.DateTime.Property property26 = dateTime25.era();
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration35 = duration32.plus((long) (byte) 0);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime38 = instant37.toDateTime();
        boolean boolean40 = dateTime38.isEqual(10L);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType43, chronology44);
        org.joda.time.PeriodType periodType46 = periodType43.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, (org.joda.time.ReadableInstant) dateTime38, periodType46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration29, periodType46);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime25, periodType49);
        org.joda.time.TimeOfDay timeOfDay51 = dateTime25.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = timeOfDay51.toDateTime(readableInstant52);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant57 = instant55.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime58 = instant55.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime59 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Instant instant60 = instant55.toInstant();
        boolean boolean61 = dateTime12.isBefore((org.joda.time.ReadableInstant) instant55);
        org.joda.time.DateTime dateTime62 = instant55.toDateTimeISO();
        org.joda.time.DateTime.Property property63 = dateTime62.era();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(instant60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        int int4 = dateTime2.getWeekOfWeekyear();
        int int5 = dateTime2.getMonthOfYear();
        int int6 = dateTime2.getDayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.plus(4190400000L);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime8.withEarlierOffsetAtOverlap();
        boolean boolean13 = dateTime11.isBefore((-126057600000L));
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology9.days();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        int int18 = property16.getMaximumValueOverall();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        int int22 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime23 = property16.withMaximumValue();
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        long long26 = chronology9.set((org.joda.time.ReadablePartial) localTime24, (long) (byte) 10);
        org.joda.time.DurationField durationField27 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField28 = chronology9.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = chronology9.getDateTimeMillis(70, 20, 43198030, (-43));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -43 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 86399999L + "'", long26 == 86399999L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType3, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 0, periodType3, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 10, periodType9);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.joda.time.DateTime dateTime14 = instant13.toDateTimeISO();
        org.joda.time.Duration duration15 = period10.toDurationFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), (long) 23);
        org.joda.time.Period period20 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period22 = period20.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) '#', 0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = duration27.toPeriodFrom(readableInstant28);
        org.joda.time.Duration duration30 = duration18.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration31 = duration15.plus((org.joda.time.ReadableDuration) duration18);
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfEra();
        org.joda.time.Interval interval40 = property39.toInterval();
        boolean boolean41 = interval36.contains((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfEra();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfEra();
        org.joda.time.Interval interval49 = property48.toInterval();
        boolean boolean50 = interval45.contains((org.joda.time.ReadableInterval) interval49);
        boolean boolean51 = interval40.contains((org.joda.time.ReadableInterval) interval45);
        org.joda.time.Chronology chronology52 = interval40.getChronology();
        org.joda.time.Duration duration55 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period56 = duration55.toPeriod();
        org.joda.time.Duration duration59 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period60 = duration59.toPeriod();
        boolean boolean61 = duration55.isEqual((org.joda.time.ReadableDuration) duration59);
        java.lang.String str62 = duration59.toString();
        org.joda.time.Duration duration65 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period66 = duration65.toPeriod();
        org.joda.time.Duration duration68 = duration65.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = duration65.toPeriodTo(readableInstant69);
        org.joda.time.Weeks weeks71 = period70.toStandardWeeks();
        org.joda.time.Period period73 = period70.plusMonths((int) (short) 100);
        org.joda.time.Period period75 = period73.minusHours((int) (byte) -1);
        boolean boolean76 = duration59.equals((java.lang.Object) period75);
        org.joda.time.Duration duration79 = new org.joda.time.Duration((-1L), (long) 23);
        boolean boolean80 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration79);
        boolean boolean81 = interval40.equals((java.lang.Object) duration79);
        int int82 = duration18.compareTo((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration85 = duration18.withDurationAdded((-1855204655L), 18992);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PT0S" + "'", str62, "PT0S");
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(duration85);
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add(0L, (long) (short) 1);
        long long8 = dateTimeField2.getDifferenceAsLong((long) ' ', (long) 1969);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        java.lang.String str10 = locale9.getVariant();
        int int11 = dateTimeField2.getMaximumShortTextLength(locale9);
        org.joda.time.DurationField durationField12 = dateTimeField2.getLeapDurationField();
        java.lang.String str14 = dateTimeField2.getAsShortText((long) 7);
        org.joda.time.DurationField durationField15 = dateTimeField2.getDurationField();
        boolean boolean16 = dateTimeField2.isSupported();
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType26);
        mutablePeriod27.setMonths((int) '4');
        org.joda.time.DateTime dateTime30 = dateTime19.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTime dateTime32 = dateTime19.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property33 = dateTime32.monthOfYear();
        org.joda.time.DateTime.Property property34 = dateTime32.weekyear();
        org.joda.time.DateTime dateTime35 = dateTime32.toDateTime();
        org.joda.time.LocalTime localTime36 = dateTime32.toLocalTime();
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime39 = instant38.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.weekOfWeekyear();
        java.lang.String str43 = property42.getAsText();
        org.joda.time.DateTime dateTime44 = property42.withMaximumValue();
        org.joda.time.LocalTime localTime45 = dateTime44.toLocalTime();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime36, (org.joda.time.ReadablePartial) localTime45);
        int int47 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime45);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = dateTimeField2.set(62198582400000L, "53942");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"53942\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 43200000L + "'", long5 == 43200000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AM" + "'", str14, "AM");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1" + "'", str43, "1");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = days6.get(durationFieldType7);
        mutablePeriod5.add(durationFieldType7, 8);
        mutablePeriod5.addMillis((int) (byte) 1);
        org.joda.time.Period period13 = mutablePeriod5.toPeriod();
        mutablePeriod5.setYears((int) (byte) 10);
        mutablePeriod5.setPeriod((long) 23, (long) 23);
        mutablePeriod5.addYears((-813));
        mutablePeriod5.setMonths(64);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType12, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) 10, periodType12, chronology15);
        org.joda.time.PeriodType periodType17 = periodType12.withDaysRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        boolean boolean20 = periodType12.isSupported(durationFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((-596), 0, 2159965, 1798, 2147483647, 120, 120, (-546), periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours3 = hours1.minus((int) (short) 10);
        org.joda.time.Hours hours4 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours8 = hours6.minus((int) (short) 10);
        boolean boolean9 = hours4.isGreaterThan(hours8);
        boolean boolean10 = hours1.isLessThan(hours8);
        org.joda.time.Hours hours12 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours14 = hours12.minus((int) (short) 10);
        org.joda.time.Hours hours15 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours17 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Hours hours19 = hours17.minus((int) (short) 10);
        boolean boolean20 = hours15.isGreaterThan(hours19);
        boolean boolean21 = hours12.isLessThan(hours19);
        boolean boolean22 = hours1.isGreaterThan(hours12);
        java.lang.String str23 = hours12.toString();
        org.joda.time.Hours hours25 = hours12.minus(1970);
        org.joda.time.PeriodType periodType26 = hours12.getPeriodType();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0H" + "'", str23, "PT0H");
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillis(1640995200000L);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration8.isEqual(readableDuration10);
        org.joda.time.Duration duration13 = duration8.minus((long) 1);
        org.joda.time.Duration duration15 = duration13.minus((long) '4');
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration28 = duration25.plus((long) (byte) 0);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        boolean boolean33 = dateTime31.isEqual(10L);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType36, chronology37);
        org.joda.time.PeriodType periodType39 = periodType36.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime31, periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration22, periodType39);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) dateTime18, periodType42);
        org.joda.time.TimeOfDay timeOfDay44 = dateTime18.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = timeOfDay44.toDateTime(readableInstant45);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant50 = instant48.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime51 = instant48.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime52 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.year();
        boolean boolean54 = dateTime52.isSupported(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = dateTime2.withField(dateTimeFieldType53, 1439);
        org.joda.time.DateTime dateTime57 = dateTime56.withEarlierOffsetAtOverlap();
        int int58 = dateTime57.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 31 + "'", int58 == 31);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean5 = dateTimeZone2.isStandardOffset((long) '4');
        boolean boolean6 = dateTimeZone2.isFixed();
        long long8 = dateTimeZone2.nextTransition((long) 100);
        long long11 = dateTimeZone2.adjustOffset((-128849018879L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-128849018879L) + "'", long11 == (-128849018879L));
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.centuries();
        org.joda.time.DurationField durationField13 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        long long18 = durationField15.getDifferenceAsLong((-43199999L), (long) 365);
        long long21 = durationField15.add(100L, (-2592000001L));
        long long22 = durationField15.getUnitMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-720L) + "'", long18 == (-720L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-155520000059900L) + "'", long21 == (-155520000059900L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60000L + "'", long22 == 60000L);
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration2.isEqual(readableDuration4);
        org.joda.time.Duration duration7 = duration2.minus((long) 1);
        org.joda.time.Duration duration9 = duration7.minus((long) '4');
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        boolean boolean27 = dateTime25.isEqual(10L);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime25, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration16, periodType33);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime12, periodType36);
        org.joda.time.TimeOfDay timeOfDay38 = dateTime12.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = timeOfDay38.toDateTime(readableInstant39);
        int int41 = timeOfDay38.size();
        org.joda.time.Chronology chronology42 = timeOfDay38.getChronology();
        int int43 = timeOfDay38.size();
        boolean boolean45 = timeOfDay38.equals((java.lang.Object) "PT-62H");
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-8));
        org.joda.time.LocalDateTime localDateTime48 = dateTime47.toLocalDateTime();
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int50 = timeOfDay38.compareTo((org.joda.time.ReadablePartial) localDateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Duration duration6 = duration2.toDuration();
        org.joda.time.Period period7 = duration2.toPeriod();
        org.joda.time.Period period9 = period7.withMonths(53878857);
        org.joda.time.Period period10 = period7.normalizedStandard();
        org.joda.time.Period period12 = period10.plusHours(30);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }
}
