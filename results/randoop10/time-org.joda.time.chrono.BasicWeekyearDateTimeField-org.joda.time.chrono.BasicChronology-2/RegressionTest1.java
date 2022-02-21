import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0, chronology4);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate9 = property7.withMaximumValue();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(locale10);
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusMonths(10);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusYears(0);
        org.joda.time.DateMidnight dateMidnight17 = yearMonthDay16.toDateMidnight();
        int int18 = yearMonthDay16.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) yearMonthDay16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15250281647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.of(96);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfWeek: 96");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        char[] charArray7 = new char[] { '\uffff', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer10 = charBuffer3.get(charArray7, 59, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\uffffa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\uffffa ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "\uffff, a,  ]");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("19:34:11.279", "2022-02-21T09:34:04.525");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2022-02-21T09:34:04.525");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = yearMonthDay2.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) dateMidnight12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength(70);
        java.util.Optional<java.nio.charset.CoderResult> coderResultOptional2 = java.util.Optional.of(coderResult1);
        boolean boolean3 = coderResult1.isError();
        boolean boolean4 = coderResult1.isUnmappable();
        org.junit.Assert.assertNotNull(coderResult1);
        org.junit.Assert.assertNotNull(coderResultOptional2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 565000000, (long) 97);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.BIG_ENDIAN;
        java.lang.String str1 = byteOrder0.toString();
        org.junit.Assert.assertNotNull(byteOrder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BIG_ENDIAN" + "'", str1, "BIG_ENDIAN");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = yearMonthDay2.getField((int) (byte) 1);
        org.joda.time.DurationField durationField7 = dateTimeField6.getLeapDurationField();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.time.Month month0 = java.time.Month.JANUARY;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        boolean boolean3 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime2);
        java.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        boolean boolean9 = localDateTime5.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime11 = localDateTime5.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange14 = chronoField13.range();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField13.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField13.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime17 = localDateTime11.plus((long) 4096, temporalUnit16);
        java.time.LocalDate localDate18 = localDateTime11.toLocalDate();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar20 = new java.util.GregorianCalendar(locale19);
        org.joda.time.YearMonthDay yearMonthDay21 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar20);
        java.time.Instant instant22 = gregorianCalendar20.toInstant();
        java.time.ZonedDateTime zonedDateTime23 = gregorianCalendar20.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime25 = zonedDateTime23.plusSeconds((long) 5);
        java.time.LocalTime localTime26 = zonedDateTime25.toLocalTime();
        java.time.DayOfWeek dayOfWeek27 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange29 = chronoField28.range();
        boolean boolean30 = chronoField28.isDateBased();
        boolean boolean31 = dayOfWeek27.isSupported((java.time.temporal.TemporalField) chronoField28);
        boolean boolean32 = zonedDateTime25.isSupported((java.time.temporal.TemporalField) chronoField28);
        java.time.LocalTime localTime37 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        boolean boolean43 = localTime37.equals((java.lang.Object) languageRangeList39);
        boolean boolean44 = chronoField28.isSupportedBy((java.time.temporal.TemporalAccessor) localTime37);
        boolean boolean45 = localDate18.isSupported((java.time.temporal.TemporalField) chronoField28);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = month0.getLong((java.time.temporal.TemporalField) chronoField28);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JANUARY + "'", month0.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + dayOfWeek27 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek27.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField28.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale.setDefault(locale6);
        java.time.format.DecimalStyle decimalStyle9 = java.time.format.DecimalStyle.of(locale6);
        char char10 = decimalStyle9.getNegativeSign();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(decimalStyle9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '-' + "'", char10 == '-');
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        int int15 = property2.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay16 = property2.getTimeOfDay();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.plusMonths((int) '#');
        boolean boolean22 = dateMidnight20.isAfter((long) (short) 1);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withChronology(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime35 = dateTime31.withDayOfWeek(4);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.monthOfYear();
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (short) 1);
        long long41 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight40.withField(dateTimeFieldType42, (int) ' ');
        boolean boolean45 = dateTime31.isSupported(dateTimeFieldType42);
        int int46 = dateMidnight20.get(dateTimeFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay48 = timeOfDay16.withField(dateTimeFieldType42, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 72 + "'", int46 == 72);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval1.setEndMillis((long) 4096);
        boolean boolean5 = mutableInterval1.isBefore((long) (short) 100);
        java.lang.String str6 = mutableInterval1.toString();
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:04.096Z" + "'", str6, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:04.096Z");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.time.format.FormatStyle formatStyle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: dateTimeStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((-86399965L), 1);
        long long4 = instant3.getMillis();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645349658915L + "'", long4 == 1645349658915L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("2022-02-21T09:34:14.586", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.setWeekyear(0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay24.toDateMidnight(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = yearMonthDay24.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay24.toDateMidnight(dateTimeZone29);
        java.lang.Object obj31 = properties1.getOrDefault((java.lang.Object) 0, (java.lang.Object) dateMidnight30);
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties1.keys();
        java.util.Collection<java.lang.Object> objCollection33 = properties1.values();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNotNull(objCollection33);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.ZonedDateTime zonedDateTime3 = gregorianCalendar1.toZonedDateTime();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.empty();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusMonths((int) '#');
        int int9 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withMillis((long) (short) -1);
        boolean boolean12 = optionalLong4.equals((java.lang.Object) dateMidnight11);
        boolean boolean13 = gregorianCalendar1.equals((java.lang.Object) dateMidnight11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        org.joda.time.TimeOfDay.Property property3 = timeOfDay1.hourOfDay();
        int int4 = property3.get();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.Period period8 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.temporal.Temporal temporal9 = zonedDateTime6.minus((java.time.temporal.TemporalAmount) period8);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(locale10);
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar11);
        java.time.Instant instant13 = gregorianCalendar11.toInstant();
        java.time.ZonedDateTime zonedDateTime14 = gregorianCalendar11.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime14.plusSeconds((long) 5);
        java.time.chrono.IsoEra isoEra17 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange19 = chronoField18.range();
        boolean boolean20 = isoEra17.isSupported((java.time.temporal.TemporalField) chronoField18);
        int int21 = zonedDateTime14.get((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = zonedDateTime6.isAfter((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime14);
        java.time.temporal.TemporalAmount temporalAmount23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime24 = zonedDateTime6.minus(temporalAmount23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToSubtract");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(temporal9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + isoEra17 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra17.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.WRITE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.WRITE + "'", accessMode0.equals(java.nio.file.AccessMode.WRITE));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        boolean boolean14 = localDateTime10.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime16 = localDateTime10.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        boolean boolean24 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean25 = localDateTime21.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean26 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField27.getRangeUnit();
        boolean boolean30 = localDateTime23.isSupported(temporalUnit29);
        boolean boolean31 = zonedDateTime5.isSupported(temporalUnit29);
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime33 = localDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime35 = localDateTime32.withNano(0);
        java.time.LocalDate localDate36 = localDateTime35.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate38 = temporalUnit29.addTo(localDate36, (-86399965L));
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add(8553600000L);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setHourOfDay(403);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 403 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList11.listIterator();
        boolean boolean20 = languageRangeItor19.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.time.Duration duration1 = java.time.Duration.ofHours(0L);
        java.time.Duration duration3 = java.time.Duration.ofHours(0L);
        int int4 = duration1.compareTo(duration3);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        boolean boolean14 = localDateTime10.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime16 = localDateTime10.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        boolean boolean24 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean25 = localDateTime21.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean26 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField27.getRangeUnit();
        boolean boolean30 = localDateTime23.isSupported(temporalUnit29);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration31 = duration3.minus((long) 64, temporalUnit29);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        int int2 = period1.getSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Period period5 = period1.withFieldAdded(durationFieldType3, 256);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDay();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.era();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray12 = new int[] { 37930000, 11, 64, 256, 100 };
        int int13 = dateTimeField5.getMinimumValue(readablePartial6, intArray12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[37930000, 11, 64, 256, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        date2.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date2);
        java.lang.Object obj6 = date2.clone();
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 10:34:19 UTC 2022");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "Mon Feb 21 10:34:19 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Mon Feb 21 10:34:19 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Mon Feb 21 10:34:19 UTC 2022");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime15 = localDateTime11.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        boolean boolean18 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean19 = localDateTime15.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean20 = localDateTime10.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset22, (java.time.ZoneId) zoneOffset24);
        int int26 = localDateTime10.getMinute();
        int int27 = localDateTime10.getHour();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.net.SocketAddress socketAddress1 = proxy0.address();
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertNull(socketAddress1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate(37930, intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minus(readableDuration3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusDays(97);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addWrapFieldToCopy(2);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        int int6 = localTime4.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (short) 1);
        long long16 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight15);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        int int18 = property13.getMaximumTextLength(locale17);
        org.joda.time.DateMidnight dateMidnight19 = property13.roundHalfCeilingCopy();
        org.joda.time.Duration duration21 = org.joda.time.Duration.millis((long) 'a');
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) dateMidnight19);
        mutableDateTime0.setDate((long) '4');
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.era();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar7 = new java.util.GregorianCalendar(locale6);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(10);
        org.joda.time.LocalDate localDate11 = yearMonthDay10.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone15);
        org.joda.time.Period period17 = interval16.toPeriod();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = period17.get(durationFieldType18);
        org.joda.time.Period period20 = period17.toPeriod();
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType22 = hours21.getFieldType();
        org.joda.time.DurationFieldType durationFieldType23 = hours21.getFieldType();
        int int24 = period17.indexOf(durationFieldType23);
        org.joda.time.Period period26 = period17.withMinutes((int) (byte) 10);
        int[] intArray27 = period17.getValues();
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property31 = timeOfDay30.minuteOfHour();
        int int32 = property31.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.monthOfYear();
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 1);
        long long38 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight37);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        int int40 = property35.getMaximumTextLength(locale39);
        java.util.Locale.setDefault(locale39);
        java.lang.String str42 = property31.getAsText(locale39);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = dateTimeField5.set((org.joda.time.ReadablePartial) yearMonthDay10, 21, intArray27, "January", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"January\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file7 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean8 = file2.renameTo(file7);
        java.io.File file9 = file7.getAbsoluteFile();
        java.io.File file11 = new java.io.File(file7, "hi!");
        boolean boolean12 = file11.mkdirs();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "2022-02-21T09:33:57.064");
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(file9);
// flaky:         org.junit.Assert.assertEquals(file9.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/experiment/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file11.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file11.toString(), "2022-02-21T09:33:57.064/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.Duration duration5 = java.time.Duration.ofHours(0L);
        java.time.Duration duration7 = java.time.Duration.ofHours(0L);
        int int8 = duration5.compareTo(duration7);
        java.time.Duration duration10 = duration5.minusMinutes((long) 'a');
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList11 = duration5.getUnits();
        java.time.temporal.Temporal temporal12 = localDateTime3.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalDate localDate13 = localDateTime3.toLocalDate();
        java.time.LocalDate localDate15 = localDate13.withDayOfMonth((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = localDate13.atTime(11, 70, 2022, 256);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 70");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(temporalUnitList11);
        org.junit.Assert.assertNotNull(temporal12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "2022-02-21T09:34:16.572Z", "/", "-999999999 - 999999999", "8", "2022-02-21T09:34:07.351", "java.util.GregorianCalendar[time=1645436052229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=12,MILLISECOND=229,ZONE_OFFSET=0,DST_OFFSET=0]", "2022-02-21T09:34:06.877", "java.util.GregorianCalendar[time=1645436052229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=12,MILLISECOND=229,ZONE_OFFSET=0,DST_OFFSET=0]", "java.util.GregorianCalendar[time=1645436052229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=12,MILLISECOND=229,ZONE_OFFSET=0,DST_OFFSET=0]", "2022-02-21T09:34:18.591", "-2074-02-21", "2022-02-21T09:34:17.111", "2022-02-21T09:34:17.111Z[Etc/UTC]", "NanoOfDay", "2022-02-21T09:34:00.693", "-2074-02-21", "", "P35Y100MT32H97M97.001S", "NanoOfDay", "2022-02-21T09:34:04.553", "+00:00", "2022-02-21T09:34:09.012", "BIG_ENDIAN", "2022-02-21T09:34:06.877", "2022-02-21T09:34:17.111Z[Etc/UTC]", "2022-02-21T09:34:01.158", "Coordinated Universal Time", "Big5", "/", "1", "P35Y12D", "", "2022-02-21T09:34:08.128", "2022-02-21T09:34:01.158", "2022-02-21T09:34:06.877", "weekyearOfCentury", "1970-02-21T00:00:00.000Z", "2022-02-21T09:34:19.241", "2022-02-21T09:34:07.194", "1970-01-01T00:00:00.000Z/1970-01-01T00:00:04.096Z", "PT4.096S", "2022-02-21T09:34:14.586", "", "ISO" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service52 = new java.security.Provider.Service(provider0, "java.text.ParsePosition[index=1024,errorIndex=-1]", "T00:00:00.032", "InstantSeconds", (java.util.List<java.lang.String>) strList49, strMap51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double[] doubleArray3 = new double[] { 97, 10, '#' };
        java.nio.DoubleBuffer doubleBuffer4 = java.nio.DoubleBuffer.wrap(doubleArray3);
        double[] doubleArray8 = new double[] { 97, 10, '#' };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray8);
        java.nio.DoubleBuffer doubleBuffer10 = doubleBuffer4.get(doubleArray8);
        java.lang.String str11 = doubleBuffer4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.nio.HeapDoubleBuffer[pos=3 lim=3 cap=3]" + "'", str11, "java.nio.HeapDoubleBuffer[pos=3 lim=3 cap=3]");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.YEAR;
        boolean boolean6 = localDateTime3.isSupported((java.time.temporal.TemporalField) chronoField5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfYear(85800);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 85800");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(59);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        int int14 = property2.getMinimumValue();
        org.joda.time.DurationField durationField15 = property2.getRangeDurationField();
        int int16 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = localTime0.minusMinutes(100L);
        java.time.LocalTime localTime4 = localTime2.plusSeconds((long) (byte) 100);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.of(4096, 10, (int) (byte) 1, 0, 32, (int) '4');
        java.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((long) 'a');
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.now();
        boolean boolean16 = localDateTime14.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime15);
        java.time.LocalDateTime localDateTime18 = localDateTime14.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.now();
        boolean boolean21 = localDateTime19.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        boolean boolean22 = localDateTime18.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.temporal.Temporal temporal23 = localDateTime11.adjustInto((java.time.temporal.Temporal) localDateTime20);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.now();
        boolean boolean26 = localDateTime24.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDateTime localDateTime28 = localDateTime24.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.now();
        boolean boolean31 = localDateTime29.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        boolean boolean32 = localDateTime28.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        java.time.LocalDateTime localDateTime34 = localDateTime28.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.now();
        boolean boolean37 = localDateTime35.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime36);
        java.time.LocalDateTime localDateTime39 = localDateTime35.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime41 = java.time.LocalDateTime.now();
        boolean boolean42 = localDateTime40.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        boolean boolean43 = localDateTime39.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        boolean boolean44 = localDateTime34.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange46 = chronoField45.range();
        java.time.temporal.TemporalUnit temporalUnit47 = chronoField45.getRangeUnit();
        boolean boolean48 = localDateTime41.isSupported(temporalUnit47);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = localTime4.until((java.time.temporal.Temporal) localDateTime20, temporalUnit47);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(temporal23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange46);
        org.junit.Assert.assertTrue("'" + temporalUnit47 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit47.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.net.URL uRL0 = null;
        java.security.CodeSigner codeSigner1 = null;
        java.security.CodeSigner[] codeSignerArray2 = new java.security.CodeSigner[] { codeSigner1 };
        java.security.CodeSource codeSource3 = new java.security.CodeSource(uRL0, codeSignerArray2);
        java.security.PermissionCollection permissionCollection4 = null;
        java.security.ProtectionDomain protectionDomain5 = new java.security.ProtectionDomain(codeSource3, permissionCollection4);
        java.lang.String str6 = codeSource3.toString();
        org.junit.Assert.assertNotNull(codeSignerArray2);
        org.junit.Assert.assertEquals(protectionDomain5.toString(), "ProtectionDomain  (null null)\n null\n <no principals>\n null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(null null)" + "'", str6, "(null null)");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.Chronology chronology8 = localDate6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(50, 3, 32769, (int) ':', 3, 16, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.nio.file.WatchService watchService6 = null;
        java.nio.file.WatchEvent.Kind[] kindArray8 = new java.nio.file.WatchEvent.Kind[0];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray9 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey10 = path5.register(watchService6, wildcardKindArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(kindArray8);
        org.junit.Assert.assertNotNull(wildcardKindArray9);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        java.time.Period period2 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean4 = period2.equals((java.lang.Object) (-1));
        java.time.Period period6 = period2.plusMonths((long) 12);
        int int7 = period2.getMonths();
        boolean boolean8 = localDateTime0.equals((java.lang.Object) period2);
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj10, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) localDateTime0, (org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Hours hours15 = minutes14.toStandardHours();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.time.format.ResolverStyle resolverStyle2 = dateTimeFormatter0.getResolverStyle();
        java.time.ZoneId zoneId3 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(zoneId3);
        java.time.format.DecimalStyle decimalStyle5 = dateTimeFormatter4.getDecimalStyle();
        java.util.Set<java.time.temporal.TemporalField> temporalFieldSet6 = dateTimeFormatter4.getResolverFields();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertTrue("'" + resolverStyle2 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle2.equals(java.time.format.ResolverStyle.STRICT));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(decimalStyle5);
        org.junit.Assert.assertNull(temporalFieldSet6);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "19:34:11.279");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.stream.LongStream.Builder builder0 = java.util.stream.LongStream.builder();
        java.util.stream.LongStream.Builder builder1 = java.util.stream.LongStream.builder();
        java.util.function.LongConsumer longConsumer2 = builder0.andThen((java.util.function.LongConsumer) builder1);
        java.util.stream.LongStream.Builder builder4 = builder0.add((long) 8);
        builder0.accept((long) 21);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(longConsumer2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.time.Duration duration1 = java.time.Duration.ofHours(0L);
        java.time.Duration duration3 = java.time.Duration.ofHours(0L);
        int int4 = duration1.compareTo(duration3);
        java.time.Duration duration6 = duration3.plusMillis(100L);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.now();
        boolean boolean10 = localDateTime8.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.LocalDateTime localDateTime12 = localDateTime8.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now();
        boolean boolean15 = localDateTime13.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime12.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        java.time.LocalDateTime localDateTime18 = localDateTime12.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.now();
        boolean boolean21 = localDateTime19.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.LocalDateTime localDateTime23 = localDateTime19.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.now();
        boolean boolean26 = localDateTime24.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        boolean boolean27 = localDateTime23.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        boolean boolean28 = localDateTime18.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange30 = chronoField29.range();
        java.time.temporal.TemporalUnit temporalUnit31 = chronoField29.getRangeUnit();
        boolean boolean32 = localDateTime25.isSupported(temporalUnit31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration33 = duration3.plus((long) 37930000, temporalUnit31);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange30);
        org.junit.Assert.assertTrue("'" + temporalUnit31 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit31.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonthDay2.toInterval(dateTimeZone3);
        org.joda.time.Interval interval5 = yearMonthDay2.toInterval();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer2 = longBuffer1.duplicate();
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.allocate(3);
        int int5 = longBuffer2.compareTo(longBuffer4);
        java.lang.Object obj6 = longBuffer2.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer9 = longBuffer2.put((int) (byte) 100, 3000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add(8553600000L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = mutableDateTime11.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 0, 365);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        int int5 = mutableDateTime4.getEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(10);
        org.joda.time.DateTime dateTime13 = property9.addToCopy((long) 2022);
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        int int3 = buffer2.position();
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.net.FileNameMap fileNameMap0 = java.net.URLConnection.getFileNameMap();
        java.lang.String str2 = fileNameMap0.getContentTypeFor("2022-02-21T09:34:04.553");
        org.junit.Assert.assertNotNull(fileNameMap0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        java.time.ZoneId zoneId6 = timeZone3.toZoneId();
        java.time.ZonedDateTime zonedDateTime7 = localDateTime0.atZone(zoneId6);
        java.time.chrono.Chronology chronology8 = localDateTime0.getChronology();
        java.lang.String str9 = chronology8.getId();
        java.time.LocalTime localTime14 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        boolean boolean20 = localTime14.equals((java.lang.Object) languageRangeList16);
        java.time.LocalTime localTime22 = localTime14.minusMinutes((long) (short) 10);
        int int23 = localTime22.getNano();
        java.lang.String str24 = localTime22.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate25 = chronology8.date((java.time.temporal.TemporalAccessor) localTime22);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 23:50:00.000000097 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISO" + "'", str9, "ISO");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "23:50:00.000000097" + "'", str24, "23:50:00.000000097");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.time.LocalTime localTime12 = localTime4.minusMinutes((long) (short) 10);
        int int13 = localTime12.toSecondOfDay();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.now();
        boolean boolean16 = localDateTime14.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime15);
        java.time.LocalDateTime localDateTime18 = localDateTime14.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.now();
        boolean boolean21 = localDateTime19.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        boolean boolean22 = localDateTime18.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.LocalDateTime localDateTime24 = localDateTime18.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange27 = chronoField26.range();
        java.time.temporal.TemporalUnit temporalUnit28 = chronoField26.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField26.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime30 = localDateTime24.plus((long) 4096, temporalUnit29);
        java.time.LocalDate localDate31 = localDateTime24.toLocalDate();
        long long32 = localDate31.toEpochDay();
        int int33 = localDate31.lengthOfYear();
        java.time.chrono.Era era34 = localDate31.getEra();
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str36 = chronoField35.toString();
        boolean boolean37 = localDate31.isSupported((java.time.temporal.TemporalField) chronoField35);
        java.time.chrono.IsoEra isoEra38 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange40 = chronoField39.range();
        boolean boolean41 = isoEra38.isSupported((java.time.temporal.TemporalField) chronoField39);
        java.time.temporal.Temporal temporal43 = localDate31.with((java.time.temporal.TemporalField) chronoField39, (long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = localTime12.get((java.time.temporal.TemporalField) chronoField39);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 85800 + "'", int13 == 85800);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + temporalUnit28 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit28.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 19044L + "'", long32 == 19044L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 365 + "'", int33 == 365);
        org.junit.Assert.assertTrue("'" + era34 + "' != '" + java.time.chrono.IsoEra.CE + "'", era34.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField35.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Year" + "'", str36, "Year");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + isoEra38 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra38.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField39.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(temporal43);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay((int) '-', 52);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.TWO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.DurationFieldType durationFieldType3 = minutes1.getFieldType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar7 = new java.util.GregorianCalendar(locale6);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        java.time.Instant instant9 = gregorianCalendar7.toInstant();
        java.time.ZonedDateTime zonedDateTime10 = gregorianCalendar7.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.plusSeconds((long) 5);
        java.time.LocalTime localTime13 = zonedDateTime12.toLocalTime();
        boolean boolean14 = zonedDateTime5.isAfter((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime12);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        boolean boolean17 = localDateTime15.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime16);
        java.time.LocalDateTime localDateTime19 = localDateTime15.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.now();
        boolean boolean22 = localDateTime20.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime21);
        boolean boolean23 = localDateTime19.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime21);
        java.time.LocalDateTime localDateTime25 = localDateTime19.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField27.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit30 = chronoField27.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime31 = localDateTime25.plus((long) 4096, temporalUnit30);
        boolean boolean32 = temporalUnit30.isTimeBased();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime33 = zonedDateTime5.truncatedTo(temporalUnit30);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit30 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit30.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withMillisOfSecond((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay14.plusMillis(2147483647);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2147483617 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList11.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange20 = languageRangeItor19.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeItor19);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        boolean boolean4 = interval3.containsNow();
        org.joda.time.ReadableInterval readableInterval5 = null;
        boolean boolean6 = interval3.overlaps(readableInterval5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer2 = longBuffer1.duplicate();
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.duplicate();
        int int6 = longBuffer1.compareTo(longBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer9 = longBuffer1.put(839000000, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.util.Date date1 = localDate0.toDate();
        org.joda.time.Chronology chronology2 = localDate0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate0.getValue((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream0.noneMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = property1.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears(100);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod8.copy();
        mutablePeriod8.setMillis(64);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.DayOfWeek dayOfWeek1 = localDateTime0.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + dayOfWeek1 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek1.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        java.util.LongSummaryStatistics longSummaryStatistics11 = new java.util.LongSummaryStatistics();
        longSummaryStatistics11.accept(565000000);
        intStream10.forEachOrdered((java.util.function.IntConsumer) longSummaryStatistics11);
        java.util.function.IntUnaryOperator intUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = intStream10.map(intUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals(longSummaryStatistics11.toString(), "LongSummaryStatistics{count=13, sum=565001215, min=46, average=43461631.923077, max=565000000}");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.year();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.withMaximumValue();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.stream.Stream<java.lang.Long> longStream11 = longStream10.boxed();
        java.lang.Object[] objArray12 = longStream11.toArray();
        java.util.function.BinaryOperator<java.lang.Long> longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Long> longOptional14 = longStream11.reduce(longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[79, 112, 116, 105, 111, 110, 97, 108, 46, 101, 109, 112, 116, 121]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[79, 112, 116, 105, 111, 110, 97, 108, 46, 101, 109, 112, 116, 121]");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putFloat(3, (float) 16);
        float float6 = byteBuffer4.getFloat((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = byteBuffer4.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        int int2 = zoneOffset1.getTotalSeconds();
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        boolean boolean6 = timeZone4.hasSameRules(timeZone5);
        int int7 = timeZone5.getRawOffset();
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone5);
        java.time.Clock clock9 = java.time.Clock.systemUTC();
        java.time.Instant instant10 = clock9.instant();
        java.util.Date date11 = java.util.Date.from(instant10);
        date11.setHours((int) (short) 10);
        java.util.Calendar.Builder builder14 = builder8.setInstant(date11);
        boolean boolean15 = zoneOffset1.equals((java.lang.Object) builder14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder14.set(13, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36000 + "'", int2 == 36000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 10:34:21 UTC 2022");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream3 = null; // flaky: new java.io.PrintStream(file2);
// flaky:         printStream3.print('a');
// flaky:         printStream3.println(false);
        char[] charArray13 = new char[] { 'a', '\uffff', '\uffff', 'x', ' ' };
// flaky:         printStream3.print(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer17 = java.nio.CharBuffer.wrap(charArray13, 3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(charArray13);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "\uffff\uffff, x,  ]");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.net.SocketException socketException0 = new java.net.SocketException();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.stream.Stream<java.lang.Long> longStream11 = longStream10.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.LongSummaryStatistics longSummaryStatistics12 = longStream10.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone7);
        org.joda.time.Period period9 = interval8.toPeriod();
        boolean boolean10 = interval4.isBefore((org.joda.time.ReadableInterval) interval8);
        boolean boolean11 = interval4.isBeforeNow();
        org.joda.time.Duration duration12 = interval4.toDuration();
        org.joda.time.Duration duration14 = duration12.minus((long) 21);
        org.joda.time.Instant instant15 = instant0.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) instant16);
        mutablePeriod17.add((long) (short) 1);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        int int15 = localDate14.lengthOfMonth();
        java.time.chrono.IsoChronology isoChronology16 = localDate14.getChronology();
        boolean boolean18 = isoChronology16.isLeapYear((long) 64);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        java.lang.String str2 = valueRange1.toString();
        long long3 = valueRange1.getLargestMinimum();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999 - 999999999" + "'", str2, "-999999999 - 999999999");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-999999999L) + "'", long3 == (-999999999L));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = charBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod15.setYears(100);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long20 = duration19.getStandardDays();
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime6.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime6.property(dateTimeFieldType25);
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = dateTimeField27.getAsText((long) 21, locale30);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setRounding(dateTimeField27, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 256");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 0);
        int int4 = localTime3.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 86399999 + "'", int4 == 86399999);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.time.Period period0 = java.time.Period.ZERO;
        org.junit.Assert.assertNotNull(period0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfDay();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset1);
        java.time.OffsetTime offsetTime4 = offsetTime2.plusNanos(125L);
        java.time.OffsetTime offsetTime6 = offsetTime4.withNano(32);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long4 = duration3.getStandardDays();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.time();
        org.joda.time.Period period7 = duration3.toPeriodTo(readableInstant5, periodType6);
        org.joda.time.Duration duration8 = duration1.minus((org.joda.time.ReadableDuration) duration3);
        long long9 = duration3.getStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        java.lang.String str1 = attribute0.toString();
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.AttributedCharacterIterator$Attribute(input_method_segment)" + "'", str1, "java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(1024);
        java.lang.String str2 = parsePosition1.toString();
        parsePosition1.setIndex(2);
        int int5 = parsePosition1.getIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.text.ParsePosition[index=1024,errorIndex=-1]" + "'", str2, "java.text.ParsePosition[index=1024,errorIndex=-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        boolean boolean2 = intBuffer1.isDirect();
        int[] intArray3 = intBuffer1.array();
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.of(intArray3);
        java.util.function.IntToLongFunction intToLongFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = intStream4.mapToLong(intToLongFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean3 = mutableInterval1.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone6);
        org.joda.time.Period period8 = interval7.toPeriod();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = period8.get(durationFieldType9);
        org.joda.time.Period period11 = period8.toPeriod();
        mutableInterval1.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period13 = mutableInterval1.toPeriod();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 256, 0L);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval1.setDurationAfterStart((org.joda.time.ReadableDuration) duration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        int int8 = charBuffer3.position();
        java.nio.CharBuffer charBuffer9 = charBuffer3.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer11 = charBuffer3.put(':');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charBuffer9);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.IntSummaryStatistics intSummaryStatistics11 = intStream9.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.years();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0, chronology5);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 32, chronology5, locale8);
        java.lang.String str11 = locale8.getDisplayVariant();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.time.Period period5 = period1.plusMonths((long) 12);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        boolean boolean9 = localDateTime7.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime8);
        java.time.LocalDateTime localDateTime11 = localDateTime7.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.now();
        boolean boolean14 = localDateTime12.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime13);
        boolean boolean15 = localDateTime11.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime13);
        java.time.LocalDateTime localDateTime17 = localDateTime11.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now();
        boolean boolean20 = localDateTime18.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime19);
        java.time.LocalDateTime localDateTime22 = localDateTime18.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        boolean boolean25 = localDateTime23.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        boolean boolean26 = localDateTime22.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        boolean boolean27 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.YEAR;
        boolean boolean29 = localDateTime17.isSupported((java.time.temporal.TemporalField) chronoField28);
        java.time.temporal.TemporalUnit temporalUnit30 = chronoField28.getRangeUnit();
        boolean boolean31 = localDateTime6.isSupported(temporalUnit30);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = period1.get(temporalUnit30);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField28.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit30 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit30.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.IntSummaryStatistics intSummaryStatistics0 = new java.util.IntSummaryStatistics();
        int int1 = intSummaryStatistics0.getMin();
        int int2 = intSummaryStatistics0.getMax();
        org.junit.Assert.assertEquals(intSummaryStatistics0.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean7 = period5.equals((java.lang.Object) (-1));
        java.time.Period period9 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean11 = period9.equals((java.lang.Object) (-1));
        int int12 = period9.getDays();
        java.time.Period period13 = period5.minus((java.time.temporal.TemporalAmount) period9);
        java.time.chrono.ChronoPeriod chronoPeriod14 = period9.normalized();
        java.time.temporal.Temporal temporal15 = localDateTime3.plus((java.time.temporal.TemporalAmount) chronoPeriod14);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange18 = chronoField17.range();
        java.time.temporal.TemporalUnit temporalUnit19 = chronoField17.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime20 = localDateTime3.minus(10L, temporalUnit19);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(chronoPeriod14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField17.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange18);
        org.junit.Assert.assertTrue("'" + temporalUnit19 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit19.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod28.setYears(100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long33 = duration32.getStandardDays();
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime19.plus((org.joda.time.ReadableDuration) duration32);
        int int36 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        int int37 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property38 = localDateTime1.era();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        java.util.function.IntUnaryOperator intUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = intStream10.map(intUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.joda.time.Period period1 = org.joda.time.Period.days(2022);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.Month month5 = localDate4.getMonth();
        java.time.LocalTime localTime10 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        boolean boolean16 = localTime10.equals((java.lang.Object) languageRangeList12);
        java.time.LocalTime localTime18 = localTime10.minusMinutes((long) (short) 10);
        int int19 = localTime18.getNano();
        java.time.LocalTime localTime21 = localTime18.minusHours(88473600000L);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.of(localDate4, localTime18);
        java.time.LocalDateTime localDateTime24 = localDateTime22.minusSeconds(1645436060L);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean3 = file2.setReadOnly();
        java.lang.String str4 = file2.getName();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21T09:33:57.064" + "'", str4, "2022-02-21T09:33:57.064");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property9.setCopy(565000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 565000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.time.format.ResolverStyle resolverStyle2 = dateTimeFormatter1.getResolverStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = java.time.OffsetTime.parse((java.lang.CharSequence) "2022-02-21T09:34:07.351", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2022-02-21T09:34:07.351' could not be parsed: Unable to obtain OffsetTime from TemporalAccessor: {},ISO resolved to 2022-02-21T09:34:07.351 of type java.time.format.Parsed");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + resolverStyle2 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle2.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "java.text.ParsePosition[index=1024,errorIndex=-1]");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'java.text.ParsePosition[index=1024,errorIndex=-1]' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        boolean boolean14 = localDateTime10.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime16 = localDateTime10.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        boolean boolean24 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean25 = localDateTime21.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean26 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField27.getRangeUnit();
        boolean boolean30 = localDateTime23.isSupported(temporalUnit29);
        boolean boolean31 = zonedDateTime5.isSupported(temporalUnit29);
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset33);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime35 = zonedDateTime5.withZoneSameLocal((java.time.ZoneId) zoneOffset33);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime35);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = property21.getAsText(locale22);
        org.joda.time.LocalDateTime localDateTime26 = property21.addToCopy((long) 7);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withSecondOfMinute(16);
        int int29 = localDateTime28.getWeekyear();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar31 = new java.util.GregorianCalendar(locale30);
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar31);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay32.plusMonths(10);
        org.joda.time.LocalDate localDate35 = yearMonthDay34.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) localDateTime28, (org.joda.time.ReadablePartial) yearMonthDay34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "8" + "'", str24, "8");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(localDate35);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = days0.plus(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.time.Instant instant3 = instant1.plusMillis((long) (byte) -1);
        java.time.Period period5 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean7 = period5.equals((java.lang.Object) (-1));
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withChronology(chronology15);
        boolean boolean17 = period5.equals((java.lang.Object) dateTime16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant18 = instant3.plus((java.time.temporal.TemporalAmount) period5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.Days days1 = org.joda.time.Days.days(2022);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer2 = longBuffer1.duplicate();
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.allocate(3);
        int int5 = longBuffer2.compareTo(longBuffer4);
        int int6 = longBuffer4.remaining();
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.Instant instant6 = zonedDateTime5.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime8 = zonedDateTime5.withDayOfYear(16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 16384");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file6 = new java.io.File(file4, "T00:00:00.032");
        boolean boolean7 = file6.delete();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter8 = new java.io.PrintWriter(file6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032 (Not a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.setWeekyear(0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay24.toDateMidnight(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = yearMonthDay24.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay24.toDateMidnight(dateTimeZone29);
        java.lang.Object obj31 = properties1.getOrDefault((java.lang.Object) 0, (java.lang.Object) dateMidnight30);
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties1.keys();
        java.lang.Object obj33 = properties1.clone();
        java.io.InputStream inputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.loadFromXML(inputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{}");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        java.time.temporal.TemporalUnit temporalUnit2 = chronoField0.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit3 = chronoField0.getBaseUnit();
        boolean boolean4 = temporalUnit3.isDurationEstimated();
        boolean boolean5 = temporalUnit3.isDurationEstimated();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + temporalUnit2 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit2.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(2, 10, 11);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar3);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar3.roll(50, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.stream.Stream<java.lang.Long> longStream4 = longStream2.boxed();
        longStream2.close();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.wrap(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        java.lang.String str1 = seconds0.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT0S" + "'", str1, "PT0S");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("P35Y100MT32H97M97.001S", "weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: weekOfWeekyear");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        short[] shortArray4 = new short[] { (short) 100, (short) -1, (short) 10, (byte) 10 };
        java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray4);
        boolean boolean6 = shortBuffer5.hasRemaining();
        java.nio.ShortBuffer shortBuffer7 = shortBuffer5.asReadOnlyBuffer();
        short[] shortArray12 = new short[] { (short) 100, (short) -1, (short) 10, (byte) 10 };
        java.nio.ShortBuffer shortBuffer13 = java.nio.ShortBuffer.wrap(shortArray12);
        int int14 = shortBuffer7.compareTo(shortBuffer13);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 10, 10]");
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[100, -1, 10, 10]");
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.iterate((double) '-', doubleUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.net.MalformedURLException malformedURLException0 = new java.net.MalformedURLException();
        java.lang.String str1 = malformedURLException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.net.MalformedURLException" + "'", str1, "java.net.MalformedURLException");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.withDayOfMonth(20);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay2.monthOfYear();
        org.joda.time.MutableInterval mutableInterval7 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean9 = mutableInterval7.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone12);
        org.joda.time.Period period14 = interval13.toPeriod();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = period14.get(durationFieldType15);
        org.joda.time.Period period17 = period14.toPeriod();
        mutableInterval7.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period14);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.add((long) (byte) 0);
        mutableDateTime19.add((long) (byte) 1);
        org.joda.time.MutableInterval mutableInterval25 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean27 = mutableInterval25.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Interval interval31 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone30);
        org.joda.time.Period period32 = interval31.toPeriod();
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = period32.get(durationFieldType33);
        org.joda.time.Period period35 = period32.toPeriod();
        mutableInterval25.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period38 = period32.plusMinutes((int) (byte) 100);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long44 = duration43.getStandardDays();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.time();
        org.joda.time.Period period47 = duration43.toPeriodTo(readableInstant45, periodType46);
        org.joda.time.Duration duration48 = duration41.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long52 = duration51.getStandardDays();
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.time();
        org.joda.time.Period period55 = duration51.toPeriodTo(readableInstant53, periodType54);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.Interval interval59 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone58);
        org.joda.time.Period period60 = interval59.toPeriod();
        org.joda.time.DurationFieldType durationFieldType61 = null;
        int int62 = period60.get(durationFieldType61);
        org.joda.time.Period period63 = period60.toPeriod();
        org.joda.time.Hours hours64 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType65 = hours64.getFieldType();
        org.joda.time.DurationFieldType durationFieldType66 = hours64.getFieldType();
        int int67 = period60.indexOf(durationFieldType66);
        int int68 = period55.get(durationFieldType66);
        mutableDateTime19.add(durationFieldType66, 2);
        org.joda.time.Period period72 = period14.withFieldAdded(durationFieldType66, 35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay2.withFieldAdded(durationFieldType66, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(hours64);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period72);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        java.util.stream.LongStream longStream4 = longStream2.parallel();
        java.util.stream.LongStream longStream5 = longStream4.sequential();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.Optional<java.time.Period> periodOptional0 = java.util.Optional.empty();
        java.lang.String str1 = periodOptional0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period2 = periodOptional0.get();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodOptional0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Optional.empty" + "'", str1, "Optional.empty");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        java.lang.String str15 = timeOfDay14.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = timeOfDay14.toString(dateTimeFormatter16);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.plusMonths((int) '#');
        boolean boolean23 = dateMidnight21.isAfter((long) (short) 1);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withChronology(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime36 = dateTime32.withDayOfWeek(4);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.monthOfYear();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (short) 1);
        long long42 = property39.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight41.withField(dateTimeFieldType43, (int) ' ');
        boolean boolean46 = dateTime32.isSupported(dateTimeFieldType43);
        int int47 = dateMidnight21.get(dateTimeFieldType43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay49 = timeOfDay14.withField(dateTimeFieldType43, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T00:00:00.032" + "'", str15, "T00:00:00.032");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "T00:00:00.032" + "'", str17, "T00:00:00.032");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 72 + "'", int47 == 72);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file6 = new java.io.File(file4, "T00:00:00.032");
        boolean boolean8 = file6.setWritable(true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream10 = new java.io.PrintStream(file6, "2022-02-21T09:34:08.128");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2022-02-21T09:34:08.128");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) 50, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        mutableDateTime6.add((long) (byte) 0);
        mutableDateTime6.add((long) (byte) 1);
        org.joda.time.MutableInterval mutableInterval12 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean14 = mutableInterval12.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone17);
        org.joda.time.Period period19 = interval18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = period19.get(durationFieldType20);
        org.joda.time.Period period22 = period19.toPeriod();
        mutableInterval12.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period25 = period19.plusMinutes((int) (byte) 100);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long31 = duration30.getStandardDays();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.time();
        org.joda.time.Period period34 = duration30.toPeriodTo(readableInstant32, periodType33);
        org.joda.time.Duration duration35 = duration28.minus((org.joda.time.ReadableDuration) duration30);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long39 = duration38.getStandardDays();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.time();
        org.joda.time.Period period42 = duration38.toPeriodTo(readableInstant40, periodType41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone45);
        org.joda.time.Period period47 = interval46.toPeriod();
        org.joda.time.DurationFieldType durationFieldType48 = null;
        int int49 = period47.get(durationFieldType48);
        org.joda.time.Period period50 = period47.toPeriod();
        org.joda.time.Hours hours51 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType52 = hours51.getFieldType();
        org.joda.time.DurationFieldType durationFieldType53 = hours51.getFieldType();
        int int54 = period47.indexOf(durationFieldType53);
        int int55 = period42.get(durationFieldType53);
        mutableDateTime6.add(durationFieldType53, 2);
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar59 = new java.util.GregorianCalendar(locale58);
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = yearMonthDay60.toDateMidnight(dateTimeZone61);
        java.util.TimeZone timeZone63 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone64 = java.util.TimeZone.getDefault();
        boolean boolean65 = timeZone63.hasSameRules(timeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.DateTime dateTime67 = dateMidnight62.toDateTime(dateTimeZone66);
        mutableDateTime6.setZone(dateTimeZone66);
        java.lang.String str70 = dateTimeZone66.getShortName((long) 16384);
        org.joda.time.DateMidnight dateMidnight71 = yearMonthDay5.toDateMidnight(dateTimeZone66);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableInterval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00" + "'", str70, "+00:00");
        org.junit.Assert.assertNotNull(dateMidnight71);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.time.Instant instant4 = clock3.instant();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.Clock clock9 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset6);
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:23 UTC 2022");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(clock9);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0, chronology4);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate10 = property7.addToCopy(59);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.function.IntToDoubleFunction intToDoubleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = intStream9.mapToDouble(intToDoubleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '4', 4096, 23, 7000000, 28, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone4);
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period6.get(durationFieldType7);
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.Period period11 = period6.minusHours((int) (byte) 1);
        boolean boolean12 = gregorianCalendar1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        java.net.URI uRI6 = java.net.URI.create("January");
        java.net.URI uRI8 = java.net.URI.create("January");
        java.net.URI uRI9 = uRI6.relativize(uRI8);
        java.net.URI uRI11 = java.net.URI.create("January");
        java.net.URI uRI13 = java.net.URI.create("January");
        java.net.URI uRI14 = uRI11.relativize(uRI13);
        java.net.URI uRI15 = uRI9.relativize(uRI13);
        java.net.URI uRI17 = java.net.URI.create("January");
        java.net.URI uRI19 = java.net.URI.create("January");
        java.net.URI uRI20 = uRI17.relativize(uRI19);
        java.net.URI uRI21 = uRI9.relativize(uRI17);
        int int22 = uRI9.getPort();
        java.net.URI uRI23 = uRI1.resolve(uRI9);
        java.lang.String str24 = uRI23.getRawUserInfo();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(uRI13);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(uRI15);
        org.junit.Assert.assertNotNull(uRI17);
        org.junit.Assert.assertNotNull(uRI19);
        org.junit.Assert.assertNotNull(uRI20);
        org.junit.Assert.assertNotNull(uRI21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(uRI23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        java.lang.String str15 = timeOfDay14.toString();
        org.joda.time.DateTime dateTime16 = timeOfDay14.toDateTimeToday();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T00:00:00.032" + "'", str15, "T00:00:00.032");
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        long long18 = localDate17.toEpochDay();
        int int19 = localDate17.lengthOfYear();
        java.time.chrono.Era era20 = localDate17.getEra();
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str22 = chronoField21.toString();
        boolean boolean23 = localDate17.isSupported((java.time.temporal.TemporalField) chronoField21);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.now();
        boolean boolean26 = localDateTime24.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDate localDate27 = localDateTime24.toLocalDate();
        boolean boolean28 = localDate17.isBefore((java.time.chrono.ChronoLocalDate) localDate27);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate30 = localDate17.withMonth(23);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 23");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 19044L + "'", long18 == 19044L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertTrue("'" + era20 + "' != '" + java.time.chrono.IsoEra.CE + "'", era20.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Year" + "'", str22, "Year");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.monthOfYear();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(0L, chronology26);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay21.withChronologyRetainFields(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days30 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) localDateTime1, (org.joda.time.ReadablePartial) timeOfDay29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(timeOfDay29);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.time.LocalTime localTime12 = localTime4.minusMinutes((long) (short) 10);
        int int13 = localTime12.getNano();
        java.lang.String str14 = localTime12.toString();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar16 = new java.util.GregorianCalendar(locale15);
        org.joda.time.YearMonthDay yearMonthDay17 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar16);
        java.time.Instant instant18 = gregorianCalendar16.toInstant();
        java.time.ZonedDateTime zonedDateTime19 = gregorianCalendar16.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime19.plusSeconds((long) 5);
        java.time.Period period23 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.temporal.Temporal temporal24 = zonedDateTime21.minus((java.time.temporal.TemporalAmount) period23);
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar26 = new java.util.GregorianCalendar(locale25);
        org.joda.time.YearMonthDay yearMonthDay27 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar26);
        java.time.Instant instant28 = gregorianCalendar26.toInstant();
        java.time.ZonedDateTime zonedDateTime29 = gregorianCalendar26.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime29.plusSeconds((long) 5);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange34 = chronoField33.range();
        boolean boolean35 = isoEra32.isSupported((java.time.temporal.TemporalField) chronoField33);
        int int36 = zonedDateTime29.get((java.time.temporal.TemporalField) chronoField33);
        boolean boolean37 = zonedDateTime21.isAfter((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime29);
        java.time.temporal.Temporal temporal38 = localTime12.adjustInto((java.time.temporal.Temporal) zonedDateTime21);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "23:50:00.000000097" + "'", str14, "23:50:00.000000097");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(temporal24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField33.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(temporal38);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.net.URLConnection.setDefaultRequestProperty("minuteOfHour", "2022-02-21T09:34:21.664");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime3 = offsetTime1.plusHours((long) 20);
        java.time.Clock clock4 = java.time.Clock.systemUTC();
        java.time.Instant instant5 = clock4.instant();
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.now(clock4);
        java.time.OffsetTime offsetTime8 = offsetTime6.withNano(8);
        boolean boolean9 = offsetTime3.isAfter(offsetTime6);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strMap0.remove((java.lang.Object) offsetTime3, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusMonths(171);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMonthOfYear(96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 96 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.stream.Stream<java.lang.Long> longStream11 = longStream10.boxed();
        java.lang.Object[] objArray12 = longStream11.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Long> longOptional13 = longStream11.findAny();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[79, 112, 116, 105, 111, 110, 97, 108, 46, 101, 109, 112, 116, 121]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[79, 112, 116, 105, 111, 110, 97, 108, 46, 101, 109, 112, 116, 121]");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("2022-02-21T09:34:07.194");
        java.security.cert.CertificateEncodingException certificateEncodingException2 = new java.security.cert.CertificateEncodingException((java.lang.Throwable) accessControlException1);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(59);
        org.joda.time.LocalTime.Property property6 = localTime3.minuteOfHour();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) chronologySet0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.HashSet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset1);
        java.time.OffsetTime offsetTime4 = offsetTime2.withMinute((int) (short) 0);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        int int6 = offsetTime5.getHour();
        boolean boolean7 = offsetTime4.isEqual(offsetTime5);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        doubleStream0.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Double> doubleStream3 = doubleStream0.boxed();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone4);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = yearMonthDay6.getFieldType((int) '\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65535");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime2 = localDateTime1.toLocalTime();
        java.time.LocalTime localTime4 = localTime2.minusHours((long) 19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = isoEra0.adjustInto((java.time.temporal.Temporal) localTime2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.function.LongPredicate longPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = longStream2.allMatch(longPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: weekOfWeekyear");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days4 = days2.negated();
        org.joda.time.Days days5 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.Days days7 = days4.plus(days5);
        org.joda.time.Days days8 = days0.plus(days4);
        org.joda.time.Days days10 = days4.plus(23);
        org.joda.time.Days days11 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.Days days13 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.Days days15 = days13.negated();
        org.joda.time.Days days16 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.Days days18 = days15.plus(days16);
        int int19 = days15.size();
        boolean boolean20 = days11.isLessThan(days15);
        boolean boolean21 = days4.isLessThan(days11);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap11);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator13 = languageRangeList12.spliterator();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeSpliterator13);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(59);
        org.joda.time.Minutes minutes2 = seconds1.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.Instant instant6 = zonedDateTime5.toInstant();
        int int7 = zonedDateTime5.getMonthValue();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime9 = zonedDateTime5.withMonth(70);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 70");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        java.net.URI uRI6 = java.net.URI.create("January");
        java.net.URI uRI8 = java.net.URI.create("January");
        java.net.URI uRI9 = uRI6.relativize(uRI8);
        java.net.URI uRI10 = uRI4.relativize(uRI8);
        java.net.URI uRI12 = java.net.URI.create("January");
        java.net.URI uRI14 = java.net.URI.create("January");
        java.net.URI uRI15 = uRI12.relativize(uRI14);
        java.net.URI uRI16 = uRI4.relativize(uRI12);
        java.lang.String str17 = uRI16.getFragment();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(uRI15);
        org.junit.Assert.assertNotNull(uRI16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((int) (short) 1, (long) 32);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putLong((int) '#', 203L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar4 = new java.util.GregorianCalendar(locale3);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1, locale3);
        java.lang.String str6 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645436064411,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=24,MILLISECOND=411,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean" + "'", str6, "Korean");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file6 = new java.io.File(file4, "T00:00:00.032");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter7 = new java.io.PrintWriter(file4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 2022-02-21T09:33:57.064/2022-02-21T09:33:57.064 (Not a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.time.Instant instant3 = instant1.minusMillis((-1L));
        java.time.Period period5 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period7 = period5.plusYears((long) 20);
        java.time.Period period9 = period7.withMonths(96);
        java.lang.String str10 = period7.toString();
        java.time.Period period12 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean14 = period12.equals((java.lang.Object) (-1));
        java.time.Period period16 = period12.plusMonths((long) 4096);
        java.time.Period period17 = period7.plus((java.time.temporal.TemporalAmount) period16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant18 = instant1.minus((java.time.temporal.TemporalAmount) period17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P20Y-1M" + "'", str10, "P20Y-1M");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone4);
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period6.get(durationFieldType7);
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.Hours hours10 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType11 = hours10.getFieldType();
        org.joda.time.DurationFieldType durationFieldType12 = hours10.getFieldType();
        int int13 = period6.indexOf(durationFieldType12);
        org.joda.time.Period period15 = period6.withMinutes((int) (byte) 10);
        org.joda.time.Period period17 = period15.minusMinutes(59);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay1.minus((org.joda.time.ReadablePeriod) period15);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(21, 4096, 85800, 2147483647, 256, 403, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2147483647 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long6 = duration5.getStandardDays();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod32.setYears((int) '#');
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.monthOfYear();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        mutablePeriod32.setPeriod((long) 3, (long) 9, chronology41);
        boolean boolean44 = durationFieldType3.isSupported(chronology41);
        org.joda.time.LocalDate localDate46 = localDate0.withFieldAdded(durationFieldType3, 5);
        org.joda.time.LocalDate localDate48 = localDate46.plusWeeks(8);
        org.joda.time.LocalDate localDate50 = localDate48.withYear(9);
        int int51 = localDate48.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 6 + "'", int51 == 6);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.Chronology chronology3 = yearMonthDay2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.centuries();
        long long7 = durationField4.getValueAsLong((long) 171, (long) 72);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0);
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.MEDIUM + "'", formatStyle0.equals(java.time.format.FormatStyle.MEDIUM));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.util.TimeZone timeZone4 = gregorianCalendar1.getTimeZone();
        java.time.ZoneId zoneId5 = timeZone4.toZoneId();
        java.time.LocalTime localTime6 = java.time.LocalTime.now(zoneId5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        boolean boolean9 = localTime6.equals((java.lang.Object) durationFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate10 = java.time.LocalDate.from((java.time.temporal.TemporalAccessor) localTime6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 09:34:24.794 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 64, chronology4);
        org.joda.time.YearMonthDay yearMonthDay7 = dateMidnight6.toYearMonthDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime9.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.ofInstant(instant3, zoneId8);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.minusDays(1645436047L);
        int int12 = offsetDateTime9.getMonthValue();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime9.plusHours((long) (short) -1);
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.plusNanos((long) 96);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime16);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) ' ');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        int int15 = property2.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay17 = property2.addWrapFieldToCopy(15);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.nio.channels.ClosedChannelException closedChannelException0 = new java.nio.channels.ClosedChannelException();
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.Hashtable<org.joda.time.Interval, java.security.cert.CertificateException> intervalMap0 = new java.util.Hashtable<org.joda.time.Interval, java.security.cert.CertificateException>();
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1645349658915L);
        double double2 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645349658915E12d + "'", double2 == 1.645349658915E12d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.time.Month month1 = java.time.Month.FEBRUARY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.of(2, month1, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.FEBRUARY + "'", month1.equals(java.time.Month.FEBRUARY));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.iterate((double) 20, doubleUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.time.LocalTime localTime9 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        boolean boolean15 = localTime9.equals((java.lang.Object) languageRangeList11);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        boolean boolean22 = languageRangeList20.contains((java.lang.Object) "");
        boolean boolean23 = languageRangeList20.isEmpty();
        boolean boolean25 = languageRangeList20.remove((java.lang.Object) 10L);
        boolean boolean26 = languageRangeList20.isEmpty();
        boolean boolean27 = languageRangeList11.remove((java.lang.Object) boolean26);
        java.util.Collection<java.lang.String> strCollection28 = null;
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strCollection28);
        boolean boolean30 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor32 = languageRangeList11.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        java.lang.String str1 = dateTimeFormatter0.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(ParseCaseSensitive(false)(ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]]))Offset(+HH:MM:ss,'Z'))['['ParseCaseSensitive(true)ZoneRegionId()']']" + "'", str1, "(ParseCaseSensitive(false)(ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]]))Offset(+HH:MM:ss,'Z'))['['ParseCaseSensitive(true)ZoneRegionId()']']");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList11.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeItor19);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        mutableDateTime0.setMillis((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMonthOfYear(64);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.Days days3 = days1.negated();
        org.joda.time.Days days4 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days6 = days3.plus(days4);
        int int7 = days3.size();
        boolean boolean8 = days0.isLessThan(days3);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = yearMonthDay2.getField((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay2.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property7.addToCopy((int) 'a');
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime13 = localTime11.minusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes(9);
        int int16 = localTime15.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = property7.compareTo((org.joda.time.ReadablePartial) localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        java.net.URI uRI6 = java.net.URI.create("January");
        java.net.URI uRI8 = java.net.URI.create("January");
        java.net.URI uRI9 = uRI6.relativize(uRI8);
        java.net.URI uRI10 = uRI4.relativize(uRI8);
        java.net.URI uRI12 = java.net.URI.create("January");
        java.net.URI uRI14 = java.net.URI.create("January");
        java.net.URI uRI15 = uRI12.relativize(uRI14);
        java.net.URI uRI16 = uRI4.relativize(uRI12);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL17 = uRI4.toURL();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI is not absolute");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(uRI15);
        org.junit.Assert.assertNotNull(uRI16);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        short[] shortArray4 = new short[] { (short) 100, (short) -1, (short) 10, (byte) 10 };
        java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer8 = java.nio.ShortBuffer.wrap(shortArray4, 5, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 10, 10]");
        org.junit.Assert.assertNotNull(shortBuffer5);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.MutableInterval mutableInterval6 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean8 = mutableInterval6.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period16 = period13.toPeriod();
        mutableInterval6.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period18 = mutableInterval6.toPeriod();
        org.joda.time.Interval interval19 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusSeconds(1);
        java.lang.String str25 = timeOfDay21.toString();
        boolean boolean26 = interval3.equals((java.lang.Object) str25);
        org.joda.time.Hours hours27 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Interval interval28 = interval3.toInterval();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNull(interval19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "T00:00:00.032" + "'", str25, "T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(interval28);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone5);
        org.joda.time.Period period7 = interval6.toPeriod();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minus((org.joda.time.ReadablePeriod) period7);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar10 = new java.util.GregorianCalendar(locale9);
        org.joda.time.YearMonthDay yearMonthDay11 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.plusMonths(10);
        org.joda.time.Interval interval14 = yearMonthDay11.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadablePartial) localDateTime8, (org.joda.time.ReadablePartial) yearMonthDay11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:25.521" + "'", str2, "2022-02-21T09:34:25.521");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        long long24 = dateTimeField22.roundHalfFloor((long) (short) 100);
        java.lang.String str25 = dateTimeField22.toString();
        java.lang.String str26 = dateTimeField22.getName();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-259200000L) + "'", long24 == (-259200000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str25, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "weekOfWeekyear" + "'", str26, "weekOfWeekyear");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property10.set("USA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"USA\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream.Builder builder2 = builder0.add(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate0.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod16.setYears(100);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long21 = duration20.getStandardDays();
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long25 = duration24.getStandardDays();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.time();
        org.joda.time.Period period28 = duration24.toPeriodTo(readableInstant26, periodType27);
        boolean boolean29 = duration20.isEqual((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.Interval interval34 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone37);
        org.joda.time.Period period39 = interval38.toPeriod();
        boolean boolean40 = interval34.isBefore((org.joda.time.ReadableInterval) interval38);
        boolean boolean41 = interval34.isBeforeNow();
        org.joda.time.Duration duration42 = interval34.toDuration();
        org.joda.time.Duration duration44 = duration42.minus((long) 21);
        org.joda.time.Instant instant45 = instant30.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.days();
        boolean boolean48 = periodType46.isSupported(durationFieldType47);
        org.joda.time.Period period49 = duration24.toPeriodFrom((org.joda.time.ReadableInstant) instant30, periodType46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(19, (int) (short) 1, (int) (short) 1, (int) 'a', 36000, 1024, 14, 100, periodType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period3 = period1.plusYears((long) 20);
        java.time.Period period5 = period3.withMonths(96);
        java.lang.String str6 = period3.toString();
        java.time.Period period8 = period3.minusYears((long) 70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) period3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P20Y-1M" + "'", str6, "P20Y-1M");
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        java.lang.String str1 = attribute0.toString();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        boolean boolean3 = attribute0.equals((java.lang.Object) dateMidnight2);
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.AttributedCharacterIterator$Attribute(language)" + "'", str1, "java.text.AttributedCharacterIterator$Attribute(language)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        java.util.function.IntBinaryOperator intBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt12 = intStream9.reduce(intBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone4);
        mutableDateTime5.setDayOfYear(10);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long12 = duration11.getStandardDays();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundFloorCopy();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) dateTime23, periodType24);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.monthOfYear();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 'u', 8553600000L, periodType24, chronology29);
        mutableDateTime5.setChronology(chronology29);
        mutableDateTime5.setDayOfMonth((int) (byte) 1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.TWO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.TWO;
        org.joda.time.DurationFieldType durationFieldType4 = minutes3.getFieldType();
        org.joda.time.Minutes minutes5 = minutes0.minus(minutes3);
        org.joda.time.Minutes minutes7 = minutes3.multipliedBy(1);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours(16);
        org.joda.time.DateTime dateTime15 = dateTime10.withTime((int) (byte) 1, 12, (int) (short) 0, 5);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.withDayOfYear(100);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withYearOfEra((int) (byte) 1);
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.DurationFieldType durationFieldType23 = weeks22.getFieldType();
        org.joda.time.Weeks weeks25 = weeks22.plus((int) 'u');
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours(16);
        org.joda.time.DateTime dateTime41 = dateTime36.withTime((int) (byte) 1, 12, (int) (short) 0, 5);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.withDayOfYear(100);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.withYearOfEra((int) (byte) 1);
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.Weeks weeks49 = weeks48.negated();
        boolean boolean50 = weeks25.isGreaterThan(weeks48);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(16);
        org.joda.time.DateTime dateTime66 = dateTime61.withTime((int) (byte) 1, 12, (int) (short) 0, 5);
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.withDayOfYear(100);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight70.withYearOfEra((int) (byte) 1);
        org.joda.time.Weeks weeks73 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateMidnight72);
        java.lang.String str74 = weeks73.toString();
        org.joda.time.PeriodType periodType75 = weeks73.getPeriodType();
        boolean boolean76 = weeks25.isLessThan(weeks73);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateMidnight70);
        org.junit.Assert.assertNotNull(dateMidnight72);
        org.junit.Assert.assertNotNull(weeks73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "P-30W" + "'", str74, "P-30W");
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.Month month5 = localDate4.getMonth();
        java.time.LocalTime localTime10 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        boolean boolean16 = localTime10.equals((java.lang.Object) languageRangeList12);
        java.time.LocalTime localTime18 = localTime10.minusMinutes((long) (short) 10);
        int int19 = localTime18.getNano();
        java.time.LocalTime localTime21 = localTime18.minusHours(88473600000L);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.of(localDate4, localTime18);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format24 = dateTimeFormatter23.toFormat();
        java.time.format.ResolverStyle resolverStyle25 = dateTimeFormatter23.getResolverStyle();
        java.time.ZoneId zoneId26 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withZone(zoneId26);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now();
        boolean boolean30 = localDateTime28.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        boolean boolean33 = timeZone31.hasSameRules(timeZone32);
        java.time.ZoneId zoneId34 = timeZone31.toZoneId();
        java.time.ZonedDateTime zonedDateTime35 = localDateTime28.atZone(zoneId34);
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.now(zoneId34);
        java.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter23.withZone(zoneId34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = localDate4.format(dateTimeFormatter37);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(format24);
        org.junit.Assert.assertTrue("'" + resolverStyle25 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle25.equals(java.time.format.ResolverStyle.STRICT));
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.Comparator<org.joda.time.DateTime> dateTimeComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(dateTimeComparator0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.Period period11 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration13 = duration1.plus((long) (byte) 100);
        org.joda.time.Period period14 = duration1.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears(100);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod8.copy();
        mutablePeriod8.setMonths((int) (byte) 10);
        mutablePeriod8.clear();
        int int15 = mutablePeriod8.getWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfLong ofLong4 = longStream2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = localTime0.minusMinutes(100L);
        java.time.LocalTime localTime4 = localTime2.plusSeconds((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) localTime2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Month from TemporalAccessor: 22:20 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.util.TimeZone timeZone4 = gregorianCalendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gregorianCalendar1.getLeastMaximum(34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(85800, 19, 256, (int) (short) -1, 34, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean3 = mutableInterval1.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone6);
        org.joda.time.Period period8 = interval7.toPeriod();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = period8.get(durationFieldType9);
        org.joda.time.Period period11 = period8.toPeriod();
        mutableInterval1.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period13 = mutableInterval1.toPeriod();
        org.joda.time.Chronology chronology14 = mutableInterval1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval1.setInterval((long) 300000000, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfWeek();
        int int5 = localDateTime1.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:26.762" + "'", str2, "2022-02-21T09:34:26.762");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        int int8 = period4.getWeeks();
        org.joda.time.Period period10 = period4.minusHours(9);
        org.joda.time.Hours hours11 = period4.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.minus(readableDuration9);
        int int11 = dateMidnight7.getSecondOfMinute();
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) dateMidnight7);
        org.joda.time.DateMidnight dateMidnight13 = property2.roundCeilingCopy();
        boolean boolean14 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add(8553600000L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone14);
        org.joda.time.Period period16 = interval15.toPeriod();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = period16.get(durationFieldType17);
        org.joda.time.Period period19 = period16.toPeriod();
        org.joda.time.Period period21 = period16.minusHours((int) (byte) 1);
        org.joda.time.Period period23 = period16.plusMillis(2);
        mutableDateTime11.add((org.joda.time.ReadablePeriod) period23);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.Clock clock4 = java.time.Clock.systemDefaultZone();
        boolean boolean5 = gregorianCalendar1.after((java.lang.Object) clock4);
        java.util.TimeZone timeZone6 = gregorianCalendar1.getTimeZone();
        gregorianCalendar1.set(37930, 10, (int) 'u', (int) ' ', 14);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = gregorianCalendar1.getMaximum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((int) (short) 1, (long) 32);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteBuffer7.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.STANDARD;
        java.time.format.DecimalStyle decimalStyle2 = decimalStyle0.withZeroDigit('a');
        java.io.File file5 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file7 = new java.io.File(file5, "2022-02-21T09:33:57.064");
        java.io.File file9 = new java.io.File(file7, "T00:00:00.032");
        boolean boolean10 = decimalStyle2.equals((java.lang.Object) file9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(locale11);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar12);
        org.joda.time.Chronology chronology14 = yearMonthDay13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) boolean10, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file7.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file7.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file9.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file9.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.setWeekyear(0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay24.toDateMidnight(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = yearMonthDay24.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay24.toDateMidnight(dateTimeZone29);
        java.lang.Object obj31 = properties1.getOrDefault((java.lang.Object) 0, (java.lang.Object) dateMidnight30);
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties1.keys();
        java.util.concurrent.TimeUnit timeUnit33 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.TimeUnit timeUnit35 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long37 = timeUnit35.toNanos((long) (byte) 0);
        long long38 = timeUnit33.convert((long) (byte) 1, timeUnit35);
        boolean boolean39 = properties1.containsValue((java.lang.Object) timeUnit35);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNotNull(timeUnit33);
        org.junit.Assert.assertNotNull(timeUnit35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        boolean boolean2 = intBuffer1.isDirect();
        int[] intArray3 = intBuffer1.array();
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.of(intArray3);
        int[] intArray5 = intStream4.toArray();
        java.util.LongSummaryStatistics longSummaryStatistics6 = new java.util.LongSummaryStatistics();
        longSummaryStatistics6.accept(565000000);
        longSummaryStatistics6.accept(13);
        // The following exception was thrown during execution in test generation
        try {
            intStream4.forEachOrdered((java.util.function.IntConsumer) longSummaryStatistics6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals(longSummaryStatistics6.toString(), "LongSummaryStatistics{count=2, sum=565000013, min=13, average=282500006.500000, max=565000000}");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime5 = property2.addCopy((long) 100);
        long long6 = property2.remainder();
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 37L + "'", long6 == 37L);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add((long) 64);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.time.Month month1 = java.time.Month.FEBRUARY;
        java.time.LocalDate localDate3 = java.time.LocalDate.of(505000000, month1, 13);
        java.time.Month month4 = month1.firstMonthOfQuarter();
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.FEBRUARY + "'", month1.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.JANUARY + "'", month4.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod28.setYears((int) '#');
        mutablePeriod28.addSeconds(1);
        mutablePeriod28.addSeconds(100);
        org.joda.time.MutableInterval mutableInterval36 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval36.setEndMillis((long) 4096);
        org.joda.time.Duration duration39 = mutableInterval36.toDuration();
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration39, 70);
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        int int44 = localDateTime42.getMillisOfSecond();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 867 + "'", int44 == 867);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 4, 10L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.ofInstant(instant3, zoneId8);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.minusDays(1645436047L);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime9.minusSeconds((long) ' ');
        java.time.ZoneId zoneId14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime15 = offsetDateTime13.atZoneSimilarLocal(zoneId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime13);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.lang.String str1 = strMap0.firstKey();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean9 = languageRangeList7.contains((java.lang.Object) "");
        boolean boolean10 = languageRangeList7.isEmpty();
        java.util.Locale.LanguageRange languageRange11 = null;
        boolean boolean12 = languageRangeList7.add(languageRange11);
        java.lang.String[] strArray25 = new java.lang.String[] { "Optional.empty", "1", "P35Y100MT32H97M97.001S", "23:50:00.000000097", "-999999999 - 999999999", "-999999999 - 999999999", "P35Y12D", "-999999999 - 999999999", "", "Optional.empty", "10", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.time.LocalTime localTime32 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        boolean boolean38 = localTime32.equals((java.lang.Object) languageRangeList34);
        boolean boolean39 = strSet26.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34);
        java.time.LocalTime localTime44 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        boolean boolean50 = localTime44.equals((java.lang.Object) languageRangeList46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap51);
        java.lang.Iterable[] iterableArray54 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale.LanguageRange>[] languageRangeIterableArray55 = (java.lang.Iterable<java.util.Locale.LanguageRange>[]) iterableArray54;
        languageRangeIterableArray55[0] = languageRangeList7;
        languageRangeIterableArray55[1] = languageRangeList34;
        languageRangeIterableArray55[2] = languageRangeList52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<java.util.Locale.LanguageRange>[] languageRangeIterableArray62 = strSet2.toArray(languageRangeIterableArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Big5" + "'", str1, "Big5");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(iterableArray54);
        org.junit.Assert.assertNotNull(languageRangeIterableArray55);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(32, 11, 16, 0, 6, 16, 9);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalAccessor temporalAccessor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = chronoField0.rangeRefinedBy(temporalAccessor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        int int7 = property2.getMaximumTextLength(locale6);
        int int8 = property2.getMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property2.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plusWeeks(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long2 = duration1.getStandardDays();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.time();
        org.joda.time.Period period5 = duration1.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.Days days6 = period5.toStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period9 = period4.minusHours((int) (byte) 1);
        int int10 = period9.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod12.setYears(100);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long17 = duration16.getStandardDays();
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime3.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime3.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime3.property(dateTimeFieldType22);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = property23.getAsText(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = format1.format((java.lang.Object) property23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format target must implement TemporalAccessor");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "8" + "'", str26, "8");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(10);
        org.joda.time.DateTime dateTime12 = property9.roundCeilingCopy();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.time();
        org.joda.time.Period period18 = duration14.toPeriodTo(readableInstant16, periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = localTime1.atOffset(zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        boolean boolean6 = timeZone4.hasSameRules(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone7);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTime.Property property20 = dateTime19.centuryOfEra();
        int int21 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(3000L, dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((java.lang.Object) (byte) 10, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval1.setEndMillis((long) 4096);
        mutableInterval1.setDurationAfterStart((long) 442000000);
        org.junit.Assert.assertNotNull(mutableInterval1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        java.net.URI uRI6 = java.net.URI.create("January");
        java.net.URI uRI8 = java.net.URI.create("January");
        java.net.URI uRI9 = uRI6.relativize(uRI8);
        java.net.URI uRI10 = uRI4.relativize(uRI8);
        java.lang.String str11 = uRI4.getQuery();
        java.lang.String str12 = uRI4.getAuthority();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.net.URLConnection.setDefaultAllowUserInteraction(false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        double[] doubleArray3 = new double[] { 97, 10, '#' };
        java.nio.DoubleBuffer doubleBuffer4 = java.nio.DoubleBuffer.wrap(doubleArray3);
        java.nio.DoubleBuffer doubleBuffer5 = doubleBuffer4.asReadOnlyBuffer();
        java.time.format.DecimalStyle decimalStyle6 = java.time.format.DecimalStyle.STANDARD;
        java.time.format.DecimalStyle decimalStyle8 = decimalStyle6.withZeroDigit('a');
        java.io.File file11 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file13 = new java.io.File(file11, "2022-02-21T09:33:57.064");
        java.io.File file15 = new java.io.File(file13, "T00:00:00.032");
        boolean boolean16 = decimalStyle8.equals((java.lang.Object) file15);
        boolean boolean17 = file15.mkdirs();
        boolean boolean18 = doubleBuffer4.equals((java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = doubleBuffer4.get(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertNotNull(decimalStyle6);
        org.junit.Assert.assertNotNull(decimalStyle8);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file13.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file13.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file15.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file15.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.io.File file4 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file6 = new java.io.File(file4, "2022-02-21T09:33:57.064");
        java.io.File file9 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean10 = file4.renameTo(file9);
        java.io.File file11 = file9.getAbsoluteFile();
        java.io.File file13 = new java.io.File(file9, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file14 = java.io.File.createTempFile("2022-02-21T09:34:16.572Z", "T00:00:00.032", file9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(file11);
// flaky:         org.junit.Assert.assertEquals(file11.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "/experiment/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file13.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file13.toString(), "2022-02-21T09:33:57.064/hi!");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress("Optional.empty", byteArray5);
        boolean boolean7 = inetAddress6.isSiteLocalAddress();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone10);
        org.joda.time.Period period12 = interval11.toPeriod();
        org.joda.time.MutableInterval mutableInterval14 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean16 = mutableInterval14.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone19);
        org.joda.time.Period period21 = interval20.toPeriod();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = period21.get(durationFieldType22);
        org.joda.time.Period period24 = period21.toPeriod();
        mutableInterval14.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = mutableInterval14.toPeriod();
        org.joda.time.Interval interval27 = interval11.gap((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean28 = inetAddress6.equals((java.lang.Object) interval11);
        byte[] byteArray29 = inetAddress6.getAddress();
        boolean boolean30 = inetAddress6.isLinkLocalAddress();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNull(interval27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withChronology(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime8.withHourOfDay(1);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.TWO;
        org.joda.time.DurationFieldType durationFieldType15 = minutes14.getFieldType();
        boolean boolean16 = minutes13.isGreaterThan(minutes14);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadablePeriod) minutes13);
        long long18 = interval17.toDurationMillis();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 120000L + "'", long18 == 120000L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime.Property property5 = localTime4.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property5.addNoWrapToCopy(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.time.Month month1 = java.time.Month.JANUARY;
        java.time.Month month2 = java.time.Month.from((java.time.temporal.TemporalAccessor) month1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.of(171, month2, (int) (short) 10, (int) (short) 100, 7, 1024, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JANUARY + "'", month1.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.JANUARY + "'", month2.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear((int) '4');
        org.joda.time.DateTime dateTime5 = localDateTime1.toDateTime();
        int int6 = dateTime5.getMinuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:27.744" + "'", str2, "2022-02-21T09:34:27.744");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.time.Period period5 = period1.plusMonths((long) 12);
        int int6 = period1.getMonths();
        java.time.Period period8 = period1.minusYears((long) (short) -1);
        java.time.Period period10 = period8.plusDays((long) 64);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList11 = period10.getUnits();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(temporalUnitList11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.Comparator<org.joda.time.Days> daysComparator0 = java.util.Comparator.reverseOrder();
        org.junit.Assert.assertNotNull(daysComparator0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        int int2 = strMap0.size();
        java.nio.IntBuffer intBuffer4 = java.nio.IntBuffer.allocate(256);
        boolean boolean5 = intBuffer4.isDirect();
        java.nio.ByteOrder byteOrder6 = intBuffer4.order();
        java.nio.IntBuffer intBuffer8 = java.nio.IntBuffer.allocate(256);
        boolean boolean9 = intBuffer8.isDirect();
        int[] intArray10 = intBuffer8.array();
        java.nio.IntBuffer intBuffer13 = intBuffer4.get(intArray10, 9, (int) (short) 1);
        int int14 = intBuffer4.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = strMap0.containsKey((java.lang.Object) intBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 171 + "'", int2 == 171);
        org.junit.Assert.assertNotNull(intBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength(52);
        org.junit.Assert.assertNotNull(coderResult1);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0, chronology4);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property7.setCopy("/");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"/\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.Hours hours0 = org.joda.time.Hours.TWO;
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.lang.String str1 = strMap0.firstKey();
        double[] doubleArray7 = new double[] { 96, 1024, 'a', 32, 100 };
        java.nio.DoubleBuffer doubleBuffer8 = java.nio.DoubleBuffer.wrap(doubleArray7);
        boolean boolean9 = doubleBuffer8.hasArray();
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset11 = strMap0.getOrDefault((java.lang.Object) doubleBuffer8, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Big5" + "'", str1, "Big5");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[96.0, 1024.0, 97.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long2 = duration1.getStandardDays();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long5 = duration4.getStandardDays();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime16 = property15.roundFloorCopy();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration4, (org.joda.time.ReadableInstant) dateTime16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod28.setYears((int) '#');
        mutablePeriod19.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod28);
        mutablePeriod28.addMonths(27);
        mutablePeriod28.addMinutes(6);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        java.util.LongSummaryStatistics longSummaryStatistics11 = new java.util.LongSummaryStatistics();
        longSummaryStatistics11.accept(565000000);
        intStream10.forEachOrdered((java.util.function.IntConsumer) longSummaryStatistics11);
        longSummaryStatistics11.accept(37930000);
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals(longSummaryStatistics11.toString(), "LongSummaryStatistics{count=14, sum=602931215, min=46, average=43066515.357143, max=565000000}");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay(125L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.io.UnsupportedEncodingException unsupportedEncodingException2 = new java.io.UnsupportedEncodingException();
        java.security.SignatureException signatureException3 = new java.security.SignatureException("January", (java.lang.Throwable) unsupportedEncodingException2);
        java.security.InvalidKeyException invalidKeyException4 = new java.security.InvalidKeyException((java.lang.Throwable) unsupportedEncodingException2);
        java.security.GeneralSecurityException generalSecurityException5 = new java.security.GeneralSecurityException((java.lang.Throwable) invalidKeyException4);
        java.security.SignatureException signatureException6 = new java.security.SignatureException("2022-02-21T09:33:57.762", (java.lang.Throwable) invalidKeyException4);
        java.security.InvalidKeyException invalidKeyException7 = new java.security.InvalidKeyException((java.lang.Throwable) signatureException6);
        java.security.SignatureException signatureException8 = new java.security.SignatureException((java.lang.Throwable) invalidKeyException7);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withChronology(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime8.withDayOfWeek(4);
        org.joda.time.DateTime.Property property13 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime8.plus((-259200000L));
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withChronology(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime28 = dateTime24.withDayOfWeek(4);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.monthOfYear();
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (short) 1);
        long long34 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight33.withField(dateTimeFieldType35, (int) ' ');
        boolean boolean38 = dateTime24.isSupported(dateTimeFieldType35);
        org.joda.time.DateTime.Property property39 = dateTime15.property(dateTimeFieldType35);
        int int40 = dateTime15.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = dateTime15.withMonthOfYear((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime7 = zonedDateTime4.plusHours((-62127043200000L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -7087417433");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 10);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+35:10" + "'", str3, "+35:10");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(4096, 439000000, 59, 12, 9);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar5.setWeekDate(96, 457000000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone7);
        org.joda.time.Period period9 = interval8.toPeriod();
        boolean boolean10 = interval4.isBefore((org.joda.time.ReadableInterval) interval8);
        boolean boolean11 = interval4.isBeforeNow();
        org.joda.time.Duration duration12 = interval4.toDuration();
        org.joda.time.Duration duration14 = duration12.minus((long) 21);
        org.joda.time.Instant instant15 = instant0.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 1);
        long long21 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        int int23 = property18.getMaximumTextLength(locale22);
        org.joda.time.DateTimeField dateTimeField24 = property18.getField();
        int int25 = instant0.get(dateTimeField24);
        int int26 = dateTimeField24.getMaximumValue();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        int int14 = property2.getMinimumValue();
        org.joda.time.DurationField durationField15 = property2.getRangeDurationField();
        java.lang.String str16 = durationField15.toString();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DurationField[hours]" + "'", str16, "DurationField[hours]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(565000000, 22, (int) (short) 10, 72);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 565000000 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.Period period11 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration13 = duration1.withMillis((long) (byte) 10);
        long long14 = duration13.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.TWO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.TWO;
        org.joda.time.DurationFieldType durationFieldType4 = minutes3.getFieldType();
        org.joda.time.Minutes minutes5 = minutes0.minus(minutes3);
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean9 = languageRangeList7.contains((java.lang.Object) "");
        boolean boolean10 = languageRangeList7.isEmpty();
        boolean boolean12 = languageRangeList7.remove((java.lang.Object) 10L);
        boolean boolean13 = strSet2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        int int14 = strSet2.size();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.monthOfYear();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        long long20 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight19);
        boolean boolean21 = strSet2.contains((java.lang.Object) dateMidnight19);
        org.joda.time.DateMidnight.Property property22 = dateMidnight19.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight24 = property22.setCopy("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate3 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear(96);
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        int int6 = zonedDateTime5.getDayOfMonth();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime7 = zonedDateTime5.withLaterOffsetAtOverlap();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(locale8);
        org.joda.time.YearMonthDay yearMonthDay10 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar9);
        java.time.Instant instant11 = gregorianCalendar9.toInstant();
        java.time.ZonedDateTime zonedDateTime12 = gregorianCalendar9.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime12.withEarlierOffsetAtOverlap();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar15 = new java.util.GregorianCalendar(locale14);
        org.joda.time.YearMonthDay yearMonthDay16 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar15);
        java.time.Instant instant17 = gregorianCalendar15.toInstant();
        java.time.ZonedDateTime zonedDateTime18 = gregorianCalendar15.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime20 = zonedDateTime18.plusSeconds((long) 5);
        java.time.LocalTime localTime21 = zonedDateTime20.toLocalTime();
        boolean boolean22 = zonedDateTime13.isAfter((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime20);
        boolean boolean23 = zonedDateTime5.isAfter((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime13);
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = new java.util.Properties(properties24);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        boolean boolean35 = languageRangeList33.contains((java.lang.Object) "");
        boolean boolean36 = languageRangeList33.isEmpty();
        boolean boolean38 = languageRangeList33.remove((java.lang.Object) 10L);
        boolean boolean39 = strSet28.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        int int40 = strSet28.size();
        java.time.Duration duration41 = java.time.Duration.ZERO;
        java.lang.Object obj42 = properties25.replace((java.lang.Object) int40, (java.lang.Object) duration41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now();
        mutableDateTime43.setWeekyear(0);
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar47 = new java.util.GregorianCalendar(locale46);
        org.joda.time.YearMonthDay yearMonthDay48 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = yearMonthDay48.toDateMidnight(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField52 = yearMonthDay48.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = yearMonthDay48.toDateMidnight(dateTimeZone53);
        java.lang.Object obj55 = properties25.getOrDefault((java.lang.Object) 0, (java.lang.Object) dateMidnight54);
        java.util.Enumeration<java.lang.Object> objEnumeration56 = properties25.keys();
        java.lang.Object obj57 = properties25.clone();
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (short) 1);
        int int60 = dateMidnight59.getDayOfMonth();
        int int61 = dateMidnight59.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight59.withYear(8);
        java.util.Optional<java.time.Period> periodOptional64 = java.util.Optional.empty();
        java.lang.String str65 = periodOptional64.toString();
        java.lang.Object obj66 = properties25.put((java.lang.Object) 8, (java.lang.Object) periodOptional64);
        boolean boolean67 = zonedDateTime13.equals((java.lang.Object) 8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(objEnumeration56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "{}");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(periodOptional64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Optional.empty" + "'", str65, "Optional.empty");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.function.LongPredicate longPredicate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = longStream10.filter(longPredicate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        short[] shortArray4 = new short[] { (short) 100, (short) -1, (short) 10, (byte) 10 };
        java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray4);
        java.nio.ShortBuffer shortBuffer7 = shortBuffer5.put((short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer7.put(97, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 10, 10]");
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.stream.Stream<java.lang.Long> longStream4 = longStream2.boxed();
        java.util.function.LongToDoubleFunction longToDoubleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = longStream2.mapToDouble(longToDoubleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.LongSummaryStatistics longSummaryStatistics10 = new java.util.LongSummaryStatistics();
        longSummaryStatistics10.accept(565000000);
        longSummaryStatistics10.accept(13);
        java.util.LongSummaryStatistics longSummaryStatistics15 = new java.util.LongSummaryStatistics();
        longSummaryStatistics15.accept(565000000);
        longSummaryStatistics10.combine(longSummaryStatistics15);
        intStream9.forEach((java.util.function.IntConsumer) longSummaryStatistics15);
        java.util.function.IntPredicate intPredicate20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = intStream9.anyMatch(intPredicate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertEquals(longSummaryStatistics10.toString(), "LongSummaryStatistics{count=3, sum=1130000013, min=13, average=376666671.000000, max=565000000}");
        org.junit.Assert.assertEquals(longSummaryStatistics15.toString(), "LongSummaryStatistics{count=15, sum=565001443, min=46, average=37666762.866667, max=565000000}");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.io.PrintStream printStream1 = new java.io.PrintStream("en_US");
        printStream1.flush();
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate3 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear(96);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        mutableDateTime6.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period11);
        mutableDateTime6.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.secondOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime6.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.monthOfYear();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (short) 1);
        long long22 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight21);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        int int24 = property19.getMaximumTextLength(locale23);
        org.joda.time.DateMidnight dateMidnight25 = property19.roundHalfCeilingCopy();
        org.joda.time.Duration duration27 = org.joda.time.Duration.millis((long) 'a');
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.plus((org.joda.time.ReadableDuration) duration27);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateTime dateTime30 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.LocalDate.Property property31 = localDate3.era();
        org.joda.time.LocalDate localDate32 = property31.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException();
        java.security.NoSuchAlgorithmException noSuchAlgorithmException3 = new java.security.NoSuchAlgorithmException("hi!");
        unsupportedEncodingException1.addSuppressed((java.lang.Throwable) noSuchAlgorithmException3);
        java.security.KeyException keyException5 = new java.security.KeyException("2022-02-21T09:34:27.964", (java.lang.Throwable) noSuchAlgorithmException3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        gregorianCalendar1.setTimeInMillis((-999999999L));
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar8 = new java.util.GregorianCalendar(locale7);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        java.time.Instant instant10 = gregorianCalendar8.toInstant();
        java.util.TimeZone timeZone11 = gregorianCalendar8.getTimeZone();
        gregorianCalendar1.setTimeZone(timeZone11);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar14 = new java.util.GregorianCalendar(locale13);
        int int15 = gregorianCalendar1.compareTo((java.util.Calendar) gregorianCalendar14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = dateTimeField22.getAsText((long) 21, locale25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.getDisplayScript();
        java.lang.String str32 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime28, 0, locale30);
        java.lang.String str33 = localDateTime28.toString();
        int int34 = localDateTime28.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.withWeekyear(171);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022-02-21T09:34:29.426" + "'", str33, "2022-02-21T09:34:29.426");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 21 + "'", int34 == 21);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYearOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.weekyear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone6);
        org.joda.time.Period period8 = interval7.toPeriod();
        boolean boolean9 = interval3.isBefore((org.joda.time.ReadableInterval) interval7);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0L, chronology14);
        org.joda.time.Interval interval17 = interval7.withChronology(chronology14);
        boolean boolean19 = interval17.contains((long) 70);
        org.joda.time.DateTime dateTime20 = interval17.getEnd();
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.io.File file1 = new java.io.File("+1000000000-12-31T23:59:59.999999999Z");
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "+1000000000-12-31T23:59:59.999999999Z");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(2022, (int) '4', 1024, (-999948), chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        java.lang.String str15 = timeOfDay14.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = timeOfDay14.toString(dateTimeFormatter16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = timeOfDay14.withField(dateTimeFieldType18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T00:00:00.032" + "'", str15, "T00:00:00.032");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "T00:00:00.032" + "'", str17, "T00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress("Optional.empty", byteArray5);
        boolean boolean7 = inetAddress6.isSiteLocalAddress();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone10);
        org.joda.time.Period period12 = interval11.toPeriod();
        org.joda.time.MutableInterval mutableInterval14 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean16 = mutableInterval14.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone19);
        org.joda.time.Period period21 = interval20.toPeriod();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = period21.get(durationFieldType22);
        org.joda.time.Period period24 = period21.toPeriod();
        mutableInterval14.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = mutableInterval14.toPeriod();
        org.joda.time.Interval interval27 = interval11.gap((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean28 = inetAddress6.equals((java.lang.Object) interval11);
        boolean boolean29 = inetAddress6.isMCLinkLocal();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNull(interval27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.monthOfYear();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.halfdays();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(0L, chronology12);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay7.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime4.withField(dateTimeFieldType5, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = coderResult0.length();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears((int) 'u');
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.time.LocalTime localTime23 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        boolean boolean29 = localTime23.equals((java.lang.Object) languageRangeList25);
        languageRangeList25.clear();
        boolean boolean31 = strSet5.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        int int32 = strSet5.size();
        java.util.Spliterator<java.lang.String> strSpliterator33 = strSet5.spliterator();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strSpliterator33);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.TWO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        int int3 = minutes0.getMinutes();
        org.joda.time.Duration duration4 = minutes0.toStandardDuration();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        int int15 = localDate14.lengthOfMonth();
        java.time.LocalTime localTime20 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.time.LocalDateTime localDateTime21 = localDate14.atTime(localTime20);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar23);
        java.time.Instant instant25 = gregorianCalendar23.toInstant();
        java.time.ZonedDateTime zonedDateTime26 = gregorianCalendar23.toZonedDateTime();
        java.time.Clock clock27 = java.time.Clock.systemUTC();
        java.time.Instant instant28 = clock27.instant();
        java.util.Date date29 = java.util.Date.from(instant28);
        java.time.Clock clock30 = java.time.Clock.systemUTC();
        java.time.Instant instant31 = clock30.instant();
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.ofInstant(instant31, (java.time.ZoneId) zoneOffset33);
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.ofInstant(instant28, (java.time.ZoneId) zoneOffset33);
        java.time.ZonedDateTime zonedDateTime36 = zonedDateTime26.withZoneSameLocal((java.time.ZoneId) zoneOffset33);
        long long37 = localDateTime21.toEpochSecond(zoneOffset33);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertNotNull(clock27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Mon Feb 21 09:34:29 UTC 2022");
        org.junit.Assert.assertNotNull(clock30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1645365600L + "'", long37 == 1645365600L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("java.text.ParsePosition[index=1024,errorIndex=-1]");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean9 = languageRangeList7.contains((java.lang.Object) "");
        boolean boolean10 = languageRangeList7.isEmpty();
        boolean boolean12 = languageRangeList7.remove((java.lang.Object) 10L);
        boolean boolean13 = strSet2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        int int14 = strSet2.size();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.monthOfYear();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        long long20 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight19);
        boolean boolean21 = strSet2.contains((java.lang.Object) dateMidnight19);
        org.joda.time.DateMidnight.Property property22 = dateMidnight19.weekyear();
        org.joda.time.DateMidnight dateMidnight23 = property22.withMaximumValue();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateMidnight23);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress("Optional.empty", byteArray5);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray5);
        java.lang.String str9 = byteBuffer8.toString();
        // The following exception was thrown during execution in test generation
        try {
            char char11 = byteBuffer8.getChar(34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=4 cap=4]" + "'", str9, "java.nio.HeapByteBuffer[pos=0 lim=4 cap=4]");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        int int2 = strMap0.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet3 = strMap0.entrySet();
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = new java.util.Properties(properties4);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        boolean boolean15 = languageRangeList13.contains((java.lang.Object) "");
        boolean boolean16 = languageRangeList13.isEmpty();
        boolean boolean18 = languageRangeList13.remove((java.lang.Object) 10L);
        boolean boolean19 = strSet8.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        int int20 = strSet8.size();
        java.time.Duration duration21 = java.time.Duration.ZERO;
        java.lang.Object obj22 = properties5.replace((java.lang.Object) int20, (java.lang.Object) duration21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strMap0.containsKey((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 171 + "'", int2 == 171);
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.Month month5 = localDate4.getMonth();
        java.time.DayOfWeek dayOfWeek6 = localDate4.getDayOfWeek();
        java.time.chrono.ChronoLocalDate chronoLocalDate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = localDate4.isAfter(chronoLocalDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + dayOfWeek6 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek6.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.time.Instant instant4 = clock3.instant();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.Duration duration11 = java.time.Duration.ofHours(0L);
        java.time.Duration duration13 = java.time.Duration.ofHours(0L);
        int int14 = duration11.compareTo(duration13);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList15 = duration11.getUnits();
        java.time.Duration duration16 = duration11.abs();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime8.minus((java.time.temporal.TemporalAmount) duration11);
        int int18 = offsetDateTime17.getSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) int18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:30 UTC 2022");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(temporalUnitList15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add((long) 64);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod21.setYears((int) '#');
        mutablePeriod21.addSeconds(1);
        mutablePeriod21.addSeconds(100);
        org.joda.time.MutableInterval mutableInterval29 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval29.setEndMillis((long) 4096);
        org.joda.time.Duration duration32 = mutableInterval29.toDuration();
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long38 = duration37.getStandardDays();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.time();
        org.joda.time.Period period41 = duration37.toPeriodTo(readableInstant39, periodType40);
        org.joda.time.Duration duration42 = duration35.minus((org.joda.time.ReadableDuration) duration37);
        boolean boolean43 = duration32.isLongerThan((org.joda.time.ReadableDuration) duration42);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration32);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours(16);
        boolean boolean57 = dateTime53.isBefore(100L);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long60 = duration59.getStandardDays();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime69 = dateTime67.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property70 = dateTime69.hourOfDay();
        org.joda.time.DateTime dateTime71 = property70.roundFloorCopy();
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, (org.joda.time.ReadableInstant) dateTime71, periodType72);
        boolean boolean74 = dateTime53.isAfter((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Period period75 = duration32.toPeriodTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Period period77 = period75.plusMinutes(5);
        org.joda.time.Weeks weeks78 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period75);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(weeks78);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        int int15 = localDate14.lengthOfMonth();
        java.time.chrono.IsoChronology isoChronology16 = localDate14.getChronology();
        java.lang.String str17 = isoChronology16.getCalendarType();
        java.time.chrono.IsoEra isoEra18 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange20 = chronoField19.range();
        boolean boolean21 = isoEra18.isSupported((java.time.temporal.TemporalField) chronoField19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate25 = isoChronology16.date((java.time.chrono.Era) isoEra18, (int) (byte) 100, 365, 35);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 365");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "iso8601" + "'", str17, "iso8601");
        org.junit.Assert.assertTrue("'" + isoEra18 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra18.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap2 = new java.util.Hashtable<java.lang.Object, java.lang.Object>(23, (float) 905L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime9 = dateMidnight4.toDateTime(dateTimeZone8);
        int int10 = dateMidnight4.getCenturyOfEra();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        java.lang.Object obj19 = properties1.clone();
        java.io.File file22 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream23 = null; // flaky: new java.io.PrintStream(file22);
// flaky:         printStream23.print(6);
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
// flaky:             properties1.storeToXML((java.io.OutputStream) printStream23, "(ParseCaseSensitive(false)(ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]]))Offset(+HH:MM:ss,'Z'))['['ParseCaseSensitive(true)ZoneRegionId()']']", "/experiment/2022-02-21T09:33:57.064/P20Y-1M");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: /experiment/2022-02-21T09:33:57.064/P20Y-1M");
// flaky:         } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{}");
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "2022-02-21T09:33:57.064");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        java.time.ZoneId zoneId6 = timeZone3.toZoneId();
        java.time.ZonedDateTime zonedDateTime7 = localDateTime0.atZone(zoneId6);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now(zoneId6);
        org.joda.time.Period period11 = new org.joda.time.Period(125L, (long) ' ');
        org.joda.time.Period period13 = period11.minusMonths(32);
        boolean boolean14 = localDateTime8.equals((java.lang.Object) period13);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime24 = dateTime21.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime21.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period13, (org.joda.time.ReadableInstant) dateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar10 = new java.util.GregorianCalendar(locale9);
        org.joda.time.YearMonthDay yearMonthDay11 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar10);
        java.time.ZonedDateTime zonedDateTime12 = gregorianCalendar10.toZonedDateTime();
        java.time.DayOfWeek dayOfWeek13 = zonedDateTime12.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime12.minusHours((long) 6);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange17 = chronoField16.range();
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField16.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = localDateTime4.until((java.time.temporal.Temporal) zonedDateTime15, temporalUnit18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + dayOfWeek13 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek13.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange17);
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = hours0.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone4);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.centuryOfEra();
        int int18 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime16);
        int int19 = dateTime16.getMinuteOfHour();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0, chronology4);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        boolean boolean2 = intBuffer1.isDirect();
        int[] intArray3 = intBuffer1.array();
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.of(intArray3);
        java.util.function.IntPredicate intPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = intStream4.allMatch(intPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar19 = new java.util.GregorianCalendar(locale18);
        org.joda.time.YearMonthDay yearMonthDay20 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar19);
        java.time.Instant instant21 = gregorianCalendar19.toInstant();
        java.time.ZonedDateTime zonedDateTime22 = gregorianCalendar19.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime24 = zonedDateTime22.plusSeconds((long) 5);
        java.time.LocalTime localTime25 = zonedDateTime24.toLocalTime();
        java.time.DayOfWeek dayOfWeek26 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        boolean boolean29 = chronoField27.isDateBased();
        boolean boolean30 = dayOfWeek26.isSupported((java.time.temporal.TemporalField) chronoField27);
        boolean boolean31 = zonedDateTime24.isSupported((java.time.temporal.TemporalField) chronoField27);
        java.time.LocalTime localTime36 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        boolean boolean42 = localTime36.equals((java.lang.Object) languageRangeList38);
        boolean boolean43 = chronoField27.isSupportedBy((java.time.temporal.TemporalAccessor) localTime36);
        boolean boolean44 = localDate17.isSupported((java.time.temporal.TemporalField) chronoField27);
        java.time.chrono.Era era45 = localDate17.getEra();
        java.time.LocalDateTime localDateTime46 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime47 = java.time.LocalDateTime.now();
        boolean boolean48 = localDateTime46.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime47);
        java.time.LocalDateTime localDateTime50 = localDateTime46.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.now();
        boolean boolean53 = localDateTime51.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime52);
        boolean boolean54 = localDateTime50.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime52);
        java.time.LocalDateTime localDateTime56 = localDateTime50.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField58 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange59 = chronoField58.range();
        java.time.temporal.TemporalUnit temporalUnit60 = chronoField58.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit61 = chronoField58.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime62 = localDateTime56.plus((long) 4096, temporalUnit61);
        java.time.LocalDate localDate63 = localDateTime56.toLocalDate();
        java.time.Duration duration65 = java.time.Duration.ofHours(0L);
        java.time.Duration duration67 = java.time.Duration.ofHours(0L);
        int int68 = duration65.compareTo(duration67);
        java.time.Duration duration70 = duration65.minusMinutes((long) 'a');
        long long71 = duration65.toMinutes();
        long long72 = duration65.toHours();
        java.time.Duration duration74 = duration65.minusMinutes((long) ' ');
        java.time.chrono.ChronoLocalDate chronoLocalDate75 = localDate63.plus((java.time.temporal.TemporalAmount) duration65);
        boolean boolean76 = localDate17.isAfter(chronoLocalDate75);
        java.time.Clock clock77 = java.time.Clock.systemUTC();
        java.time.Instant instant78 = clock77.instant();
        java.util.Date date79 = java.util.Date.from(instant78);
        java.time.Clock clock80 = java.time.Clock.systemUTC();
        java.time.Instant instant81 = clock80.instant();
        java.time.ZoneOffset zoneOffset83 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime84 = java.time.LocalDateTime.ofInstant(instant81, (java.time.ZoneId) zoneOffset83);
        java.time.OffsetDateTime offsetDateTime85 = java.time.OffsetDateTime.ofInstant(instant78, (java.time.ZoneId) zoneOffset83);
        java.time.LocalTime localTime86 = offsetDateTime85.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate87 = localDate17.with((java.time.temporal.TemporalAdjuster) localTime86);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + dayOfWeek26 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek26.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + era45 + "' != '" + java.time.chrono.IsoEra.CE + "'", era45.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + chronoField58 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField58.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange59);
        org.junit.Assert.assertTrue("'" + temporalUnit60 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit60.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit61 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit61.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime62);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(chronoLocalDate75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(clock77);
        org.junit.Assert.assertNotNull(instant78);
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Mon Feb 21 09:34:31 UTC 2022");
        org.junit.Assert.assertNotNull(clock80);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNotNull(zoneOffset83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(offsetDateTime85);
        org.junit.Assert.assertNotNull(localTime86);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-21T09:34:09.012");
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.GregorianCalendar gregorianCalendar0 = new java.util.GregorianCalendar();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.dayOfWeek();
        org.joda.time.Period period7 = new org.joda.time.Period(1L, chronology4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        long long10 = durationField8.getValueAsLong((long) 16);
        long long13 = durationField8.getDifferenceAsLong((long) (byte) 100, (long) 3);
        long long16 = durationField8.add((long) '#', (-1));
        long long19 = durationField8.getMillis((long) 100, (long) ' ');
        boolean boolean20 = durationField8.isSupported();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "January" + "'", str7, "January");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-86399965L) + "'", long16 == (-86399965L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8640000000L + "'", long19 == 8640000000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy(7);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) property2, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int) (short) 0, (int) (short) -1, 96, (int) (byte) 1, (-1), 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.year();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay2.getFieldTypes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.YEAR;
        boolean boolean6 = localDateTime3.isSupported((java.time.temporal.TemporalField) chronoField5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = localDateTime3.withMinute((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): -2147483648");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone7);
        org.joda.time.Period period9 = interval8.toPeriod();
        boolean boolean10 = interval4.isBefore((org.joda.time.ReadableInterval) interval8);
        boolean boolean11 = interval4.isBeforeNow();
        org.joda.time.Duration duration12 = interval4.toDuration();
        org.joda.time.Duration duration14 = duration12.minus((long) 21);
        org.joda.time.Instant instant15 = instant0.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 1);
        long long21 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        int int23 = property18.getMaximumTextLength(locale22);
        org.joda.time.DateTimeField dateTimeField24 = property18.getField();
        int int25 = instant0.get(dateTimeField24);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.monthOfYear();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.years();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((java.lang.Object) int25, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long3 = duration2.getStandardDays();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long6 = duration5.getStandardDays();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime17, periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod29.setYears((int) '#');
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.monthOfYear();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.days();
        mutablePeriod29.setPeriod((long) 3, (long) 9, chronology38);
        boolean boolean41 = durationFieldType0.isSupported(chronology38);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar43 = new java.util.GregorianCalendar(locale42);
        org.joda.time.YearMonthDay yearMonthDay44 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = yearMonthDay44.toDateMidnight(dateTimeZone45);
        java.util.TimeZone timeZone47 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        boolean boolean49 = timeZone47.hasSameRules(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateTime dateTime51 = dateMidnight46.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology52 = chronology38.withZone(dateTimeZone50);
        java.lang.String str54 = dateTimeZone50.getShortName((long) 7);
        long long57 = dateTimeZone50.adjustOffset((-86399965L), false);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-86399965L) + "'", long57 == (-86399965L));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonthDay2.toInterval(dateTimeZone3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod15.setYears(100);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long20 = duration19.getStandardDays();
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long25 = duration24.getStandardDays();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.time();
        org.joda.time.Period period28 = duration24.toPeriodTo(readableInstant26, periodType27);
        org.joda.time.Duration duration29 = duration19.plus((org.joda.time.ReadableDuration) duration24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval30 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.time.Instant instant4 = clock3.instant();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(locale10);
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar11);
        java.time.Instant instant13 = gregorianCalendar11.toInstant();
        java.time.ZonedDateTime zonedDateTime14 = gregorianCalendar11.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime14.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        boolean boolean18 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        boolean boolean23 = localDateTime21.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        boolean boolean24 = localDateTime20.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        java.time.LocalDateTime localDateTime26 = localDateTime20.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now();
        boolean boolean29 = localDateTime27.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime33 = java.time.LocalDateTime.now();
        boolean boolean34 = localDateTime32.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        boolean boolean35 = localDateTime31.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        boolean boolean36 = localDateTime26.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange38 = chronoField37.range();
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField37.getRangeUnit();
        boolean boolean40 = localDateTime33.isSupported(temporalUnit39);
        boolean boolean41 = zonedDateTime15.isSupported(temporalUnit39);
        boolean boolean42 = offsetDateTime8.isSupported(temporalUnit39);
        int int43 = offsetDateTime8.getHour();
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:31 UTC 2022");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField37.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 19 + "'", int43 == 19);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        date2.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfMonth();
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 10:34:31 UTC 2022");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withChronology(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 1);
        int int11 = dateMidnight10.getDayOfMonth();
        int int12 = dateMidnight10.getMinuteOfHour();
        boolean boolean13 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateMidnight10);
        int int14 = dateMidnight10.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1L));
        java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics3 = doubleStream2.summaryStatistics();
        double double4 = doubleSummaryStatistics3.getMax();
        optionalDouble1.ifPresent((java.util.function.DoubleConsumer) doubleSummaryStatistics3);
        java.util.stream.DoubleStream doubleStream6 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics7 = doubleStream6.summaryStatistics();
        double double8 = doubleSummaryStatistics7.getMax();
        optionalDouble1.ifPresent((java.util.function.DoubleConsumer) doubleSummaryStatistics7);
        doubleSummaryStatistics7.accept((double) (byte) 10);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleSummaryStatistics3);
        org.junit.Assert.assertEquals(doubleSummaryStatistics3.toString(), "DoubleSummaryStatistics{count=1, sum=-1.000000, min=-1.000000, average=-1.000000, max=-1.000000}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleSummaryStatistics7);
        org.junit.Assert.assertEquals(doubleSummaryStatistics7.toString(), "DoubleSummaryStatistics{count=2, sum=9.000000, min=-1.000000, average=4.500000, max=10.000000}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        java.lang.Object obj19 = properties1.clone();
        properties1.clear();
        java.time.Clock clock21 = java.time.Clock.systemUTC();
        java.time.Instant instant22 = clock21.instant();
        java.util.Date date23 = java.util.Date.from(instant22);
        date23.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromDateFields(date23);
        boolean boolean27 = properties1.equals((java.lang.Object) date23);
        java.lang.Object obj28 = properties1.clone();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        int int30 = localDate29.getMonthOfYear();
        org.joda.time.LocalDate.Property property31 = localDate29.centuryOfEra();
        org.joda.time.LocalDate localDate32 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate34 = localDate32.withWeekyear(96);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now();
        mutableDateTime35.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        mutableDateTime35.add((org.joda.time.ReadablePeriod) period40);
        mutableDateTime35.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime35.secondOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime35.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.monthOfYear();
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (short) 1);
        long long51 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        int int53 = property48.getMaximumTextLength(locale52);
        org.joda.time.DateMidnight dateMidnight54 = property48.roundHalfCeilingCopy();
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((long) 'a');
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight54.plus((org.joda.time.ReadableDuration) duration56);
        mutableDateTime35.setDate((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.DateTime dateTime59 = localDate32.toDateTime((org.joda.time.ReadableInstant) dateMidnight54);
        int int60 = localDate32.getDayOfWeek();
        boolean boolean61 = properties1.containsKey((java.lang.Object) int60);
        java.util.Collection<java.lang.Object> objCollection62 = properties1.values();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{}");
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Feb 21 10:34:32 UTC 2022");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{}");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objCollection62);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long6 = duration5.getStandardDays();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod32.setYears((int) '#');
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.monthOfYear();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        mutablePeriod32.setPeriod((long) 3, (long) 9, chronology41);
        boolean boolean44 = durationFieldType3.isSupported(chronology41);
        org.joda.time.LocalDate localDate46 = localDate0.withFieldAdded(durationFieldType3, 5);
        int int47 = localDate46.getMonthOfYear();
        org.joda.time.LocalDate.Property property48 = localDate46.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType50 = localDate46.getFieldType(96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 96");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.Instant instant6 = zonedDateTime5.toInstant();
        java.util.Properties properties7 = null;
        java.util.Properties properties8 = new java.util.Properties(properties7);
        boolean boolean9 = instant6.equals((java.lang.Object) properties7);
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.now();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(locale11);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar12);
        java.time.Instant instant14 = gregorianCalendar12.toInstant();
        java.time.ZonedDateTime zonedDateTime15 = gregorianCalendar12.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime15.plusSeconds((long) 5);
        java.time.LocalTime localTime18 = zonedDateTime17.toLocalTime();
        java.time.DayOfWeek dayOfWeek19 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange21 = chronoField20.range();
        boolean boolean22 = chronoField20.isDateBased();
        boolean boolean23 = dayOfWeek19.isSupported((java.time.temporal.TemporalField) chronoField20);
        boolean boolean24 = zonedDateTime17.isSupported((java.time.temporal.TemporalField) chronoField20);
        java.time.LocalTime localTime29 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        boolean boolean35 = localTime29.equals((java.lang.Object) languageRangeList31);
        boolean boolean36 = chronoField20.isSupportedBy((java.time.temporal.TemporalAccessor) localTime29);
        boolean boolean37 = chronoField20.isTimeBased();
        long long38 = localDateTime10.getLong((java.time.temporal.TemporalField) chronoField20);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = instant6.get((java.time.temporal.TemporalField) chronoField20);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + dayOfWeek19 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek19.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField20.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2022L + "'", long38 == 2022L);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file10 = new java.io.File(file8, "2022-02-21T09:33:57.064");
        java.nio.file.Path path11 = file8.toPath();
        int int12 = path5.compareTo(path11);
        java.nio.file.Path path14 = path5.resolveSibling("BIG_ENDIAN");
        java.nio.file.WatchService watchService15 = null;
        java.nio.file.WatchEvent.Kind<?> wildcardKind16 = null;
        java.nio.file.WatchEvent.Kind[] kindArray18 = new java.nio.file.WatchEvent.Kind[1];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray19 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray18;
        wildcardKindArray19[0] = wildcardKind16;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey22 = path5.register(watchService15, wildcardKindArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(kindArray18);
        org.junit.Assert.assertNotNull(wildcardKindArray19);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream3 = null; // flaky: new java.io.PrintStream(file2);
// flaky:         printStream3.print('a');
// flaky:         printStream3.println(false);
        char[] charArray13 = new char[] { 'a', '\uffff', '\uffff', 'x', ' ' };
// flaky:         printStream3.print(charArray13);
// flaky:         printStream3.flush();
// flaky:         printStream3.println(996L);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(charArray13);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "\uffff\uffff, x,  ]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1L));
        java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics3 = doubleStream2.summaryStatistics();
        double double4 = doubleSummaryStatistics3.getMax();
        optionalDouble1.ifPresent((java.util.function.DoubleConsumer) doubleSummaryStatistics3);
        java.lang.String str6 = optionalDouble1.toString();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleSummaryStatistics3);
        org.junit.Assert.assertEquals(doubleSummaryStatistics3.toString(), "DoubleSummaryStatistics{count=1, sum=-1.000000, min=-1.000000, average=-1.000000, max=-1.000000}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[-1.0]" + "'", str6, "OptionalDouble[-1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.findFirst();
        doubleStream0.close();
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("+1000000000-12-31T23:59:59.999999999Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.PrimitiveIterator.OfDouble ofDouble2 = doubleStream1.iterator();
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.unordered();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble4 = doubleStream3.findFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(ofDouble2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.Locale locale0 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.TimeUnit timeUnit7 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long9 = timeUnit7.toNanos((long) (byte) 0);
        long long10 = timeUnit5.convert((long) (byte) 1, timeUnit7);
        long long11 = fileTime4.to(timeUnit5);
        java.lang.String str12 = fileTime4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(timeUnit5);
        org.junit.Assert.assertNotNull(timeUnit7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645436072L + "'", long11 == 1645436072L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-21T09:34:32.728Z" + "'", str12, "2022-02-21T09:34:32.728Z");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        short[] shortArray4 = new short[] { (short) 100, (short) -1, (short) 10, (byte) 10 };
        java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray4);
        boolean boolean6 = shortBuffer5.isDirect();
        java.nio.ShortBuffer shortBuffer7 = shortBuffer5.duplicate();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 10, 10]");
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        int int18 = localDate17.getYear();
        java.time.Clock clock19 = java.time.Clock.systemUTC();
        java.time.Instant instant20 = java.time.Instant.now(clock19);
        java.time.Instant instant22 = instant20.minusNanos((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal23 = localDate17.adjustInto((java.time.temporal.Temporal) instant20);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        int int2 = strMap0.size();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.LocalDate.Property property5 = localDate3.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long12 = duration11.getStandardDays();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundFloorCopy();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) dateTime23, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod35.setYears((int) '#');
        mutablePeriod26.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property43 = dateMidnight42.monthOfYear();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        mutablePeriod35.setPeriod((long) 3, (long) 9, chronology44);
        boolean boolean47 = durationFieldType6.isSupported(chronology44);
        org.joda.time.LocalDate localDate49 = localDate3.withFieldAdded(durationFieldType6, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset50 = strMap0.get((java.lang.Object) durationFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 171 + "'", int2 == 171);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localDate49);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        int int2 = zoneOffset1.getTotalSeconds();
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        boolean boolean6 = timeZone4.hasSameRules(timeZone5);
        int int7 = timeZone5.getRawOffset();
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone5);
        java.time.Clock clock9 = java.time.Clock.systemUTC();
        java.time.Instant instant10 = clock9.instant();
        java.util.Date date11 = java.util.Date.from(instant10);
        date11.setHours((int) (short) 10);
        java.util.Calendar.Builder builder14 = builder8.setInstant(date11);
        boolean boolean15 = zoneOffset1.equals((java.lang.Object) builder14);
        java.time.Month month16 = java.time.Month.MARCH;
        int int17 = month16.getValue();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now();
        boolean boolean20 = localDateTime18.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime19);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        boolean boolean23 = timeZone21.hasSameRules(timeZone22);
        java.time.ZoneId zoneId24 = timeZone21.toZoneId();
        java.time.ZonedDateTime zonedDateTime25 = localDateTime18.atZone(zoneId24);
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime27 = localDateTime26.toLocalTime();
        java.time.LocalDateTime localDateTime29 = localDateTime26.withNano(0);
        java.time.Duration duration31 = java.time.Duration.ofHours(0L);
        java.time.Duration duration33 = java.time.Duration.ofHours(0L);
        int int34 = duration31.compareTo(duration33);
        java.time.Duration duration36 = duration31.minusMinutes((long) 'a');
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList37 = duration31.getUnits();
        java.time.temporal.Temporal temporal38 = localDateTime29.plus((java.time.temporal.TemporalAmount) duration31);
        boolean boolean39 = localDateTime18.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str41 = chronoField40.toString();
        int int42 = localDateTime18.get((java.time.temporal.TemporalField) chronoField40);
        boolean boolean43 = month16.isSupported((java.time.temporal.TemporalField) chronoField40);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = zoneOffset1.get((java.time.temporal.TemporalField) chronoField40);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36000 + "'", int2 == 36000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 10:34:32 UTC 2022");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + month16 + "' != '" + java.time.Month.MARCH + "'", month16.equals(java.time.Month.MARCH));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(temporalUnitList37);
        org.junit.Assert.assertNotNull(temporal38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Year" + "'", str41, "Year");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        mutableDateTime0.add((long) (byte) 1);
        org.joda.time.MutableInterval mutableInterval6 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean8 = mutableInterval6.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period16 = period13.toPeriod();
        mutableInterval6.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period19 = period13.plusMinutes((int) (byte) 100);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long25 = duration24.getStandardDays();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.time();
        org.joda.time.Period period28 = duration24.toPeriodTo(readableInstant26, periodType27);
        org.joda.time.Duration duration29 = duration22.minus((org.joda.time.ReadableDuration) duration24);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long33 = duration32.getStandardDays();
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.time();
        org.joda.time.Period period36 = duration32.toPeriodTo(readableInstant34, periodType35);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Interval interval40 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone39);
        org.joda.time.Period period41 = interval40.toPeriod();
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = period41.get(durationFieldType42);
        org.joda.time.Period period44 = period41.toPeriod();
        org.joda.time.Hours hours45 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType46 = hours45.getFieldType();
        org.joda.time.DurationFieldType durationFieldType47 = hours45.getFieldType();
        int int48 = period41.indexOf(durationFieldType47);
        int int49 = period36.get(durationFieldType47);
        mutableDateTime0.add(durationFieldType47, 2);
        mutableDateTime0.setWeekOfWeekyear(15);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.GregorianCalendar gregorianCalendar6 = new java.util.GregorianCalendar((int) 'x', (int) 'a', 100, 23, 96, 96);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        long long24 = dateTimeField22.roundHalfFloor((long) (short) 100);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.monthOfYear();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (short) 1);
        long long30 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight29);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        int int32 = property27.getMaximumTextLength(locale31);
        java.util.Locale.setDefault(locale31);
        int int34 = dateTimeField22.getMaximumShortTextLength(locale31);
        int int36 = dateTimeField22.getMaximumValue((long) 50);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-259200000L) + "'", long24 == (-259200000L));
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 53 + "'", int36 == 53);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = yearMonthDay2.getField((int) (byte) 1);
        int int8 = dateTimeField6.getMinimumValue((long) 1024);
        int int10 = dateTimeField6.get(25920000009L);
        int int11 = dateTimeField6.getMaximumValue();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.io.IOException iOException0 = new java.io.IOException();
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period3 = period1.plusYears((long) 20);
        java.time.Period period5 = period3.withMonths(96);
        java.time.Period period7 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period9 = period7.plusYears((long) 20);
        java.time.Period period11 = period9.withMonths(96);
        java.time.Period period12 = period5.plus((java.time.temporal.TemporalAmount) period9);
        java.time.Period period14 = period5.minusMonths((long) 97);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        java.util.function.IntPredicate intPredicate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = intStream10.anyMatch(intPredicate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period4 = period2.minusDays((int) 'x');
        org.joda.time.Period period6 = period4.withMinutes((int) '-');
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.time();
        org.joda.time.Period period12 = duration8.toPeriodTo(readableInstant10, periodType11);
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.PeriodType periodType14 = period12.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period6.withPeriodType(periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file10 = new java.io.File(file8, "2022-02-21T09:33:57.064");
        java.nio.file.Path path11 = file8.toPath();
        int int12 = path5.compareTo(path11);
        java.nio.file.Path path13 = path5.getFileName();
        java.io.File file16 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file18 = new java.io.File(file16, "2022-02-21T09:33:57.064");
        java.nio.file.Path path19 = file16.toPath();
        java.io.File file22 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file24 = new java.io.File(file22, "2022-02-21T09:33:57.064");
        java.nio.file.Path path25 = file22.toPath();
        int int26 = path19.compareTo(path25);
        java.io.File file29 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file31 = new java.io.File(file29, "2022-02-21T09:33:57.064");
        java.nio.file.Path path32 = file29.toPath();
        java.io.File file35 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file37 = new java.io.File(file35, "2022-02-21T09:33:57.064");
        java.nio.file.Path path38 = file35.toPath();
        int int39 = path32.compareTo(path38);
        java.nio.file.Path path40 = path32.getFileName();
        java.nio.file.Path path41 = path32.normalize();
        java.nio.file.Path path42 = path25.resolveSibling(path41);
        java.nio.file.Path path43 = path5.relativize(path42);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path45 = path43.getName(34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file18.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file18.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path19);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file24.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file24.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull("file29.getParent() == null", file29.getParent());
        org.junit.Assert.assertEquals(file29.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file31.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file31.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path32);
        org.junit.Assert.assertNull("file35.getParent() == null", file35.getParent());
        org.junit.Assert.assertEquals(file35.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file37.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file37.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(path40);
        org.junit.Assert.assertNotNull(path41);
        org.junit.Assert.assertNotNull(path42);
        org.junit.Assert.assertNotNull(path43);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) 'x', (int) 'x', 16384);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.time.format.FormatStyle formatStyle1 = java.time.format.FormatStyle.SHORT;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = java.time.OffsetTime.parse((java.lang.CharSequence) "23:50:00.000000097", dateTimeFormatter2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '23:50:00.000000097' could not be parsed at index 5");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formatStyle1 + "' != '" + java.time.format.FormatStyle.SHORT + "'", formatStyle1.equals(java.time.format.FormatStyle.SHORT));
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(505000000, 34, 943000000, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        longStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong5 = longStream2.findFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '{}' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withMillisOfSecond((int) '#');
        int int17 = timeOfDay14.getSecondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        java.time.ZoneId zoneId6 = timeZone3.toZoneId();
        java.time.ZonedDateTime zonedDateTime7 = localDateTime0.atZone(zoneId6);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now(zoneId6);
        org.joda.time.Period period11 = new org.joda.time.Period(125L, (long) ' ');
        org.joda.time.Period period13 = period11.minusMonths(32);
        boolean boolean14 = localDateTime8.equals((java.lang.Object) period13);
        org.joda.time.Period period16 = period13.minusMonths(365);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        java.lang.Object obj19 = properties1.clone();
        properties1.clear();
        java.time.Clock clock21 = java.time.Clock.systemUTC();
        java.time.Instant instant22 = clock21.instant();
        java.util.Date date23 = java.util.Date.from(instant22);
        date23.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromDateFields(date23);
        boolean boolean27 = properties1.equals((java.lang.Object) date23);
        java.lang.Object obj28 = properties1.clone();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        int int30 = localDate29.getMonthOfYear();
        org.joda.time.LocalDate.Property property31 = localDate29.centuryOfEra();
        org.joda.time.LocalDate localDate32 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate34 = localDate32.withWeekyear(96);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now();
        mutableDateTime35.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        mutableDateTime35.add((org.joda.time.ReadablePeriod) period40);
        mutableDateTime35.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime35.secondOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime35.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.monthOfYear();
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (short) 1);
        long long51 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        int int53 = property48.getMaximumTextLength(locale52);
        org.joda.time.DateMidnight dateMidnight54 = property48.roundHalfCeilingCopy();
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((long) 'a');
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight54.plus((org.joda.time.ReadableDuration) duration56);
        mutableDateTime35.setDate((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.DateTime dateTime59 = localDate32.toDateTime((org.joda.time.ReadableInstant) dateMidnight54);
        int int60 = localDate32.getDayOfWeek();
        boolean boolean61 = properties1.containsKey((java.lang.Object) int60);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap62 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet63 = strMap62.keySet();
        properties1.putAll((java.util.Map<java.lang.String, java.nio.charset.Charset>) strMap62);
        java.util.Collection<java.lang.Object> objCollection65 = properties1.values();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{}");
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Feb 21 10:34:33 UTC 2022");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{}");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(objCollection65);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.Month month5 = localDate4.getMonth();
        java.time.DayOfWeek dayOfWeek6 = localDate4.getDayOfWeek();
        boolean boolean7 = localDate4.isLeapYear();
        java.lang.String str8 = localDate4.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + dayOfWeek6 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek6.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21" + "'", str8, "2022-02-21");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromDateFields(date0);
        java.util.Date date2 = new java.util.Date();
        date2.setMonth((int) '4');
        boolean boolean5 = date0.before(date2);
        int int6 = date2.getYear();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:34:33 UTC 2022");
        org.junit.Assert.assertNotNull(localDate1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Thu May 21 09:34:33 UTC 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 126 + "'", int6 == 126);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((-1L));
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(locale2);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusMonths(10);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay4.minusYears(0);
        org.joda.time.DateMidnight dateMidnight9 = yearMonthDay8.toDateMidnight();
        int int10 = dateMidnight9.getMinuteOfHour();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableInstant) mutableDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusMonths(10);
        org.joda.time.LocalDate localDate5 = yearMonthDay4.toLocalDate();
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays(64);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate5.getValue(23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 23");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.time.LocalTime localTime23 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        boolean boolean29 = localTime23.equals((java.lang.Object) languageRangeList25);
        languageRangeList25.clear();
        boolean boolean31 = strSet5.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.time.LocalTime localTime36 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        boolean boolean42 = localTime36.equals((java.lang.Object) languageRangeList38);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        boolean boolean49 = languageRangeList47.contains((java.lang.Object) "");
        boolean boolean50 = languageRangeList47.isEmpty();
        boolean boolean52 = languageRangeList47.remove((java.lang.Object) 10L);
        boolean boolean53 = languageRangeList47.isEmpty();
        boolean boolean54 = languageRangeList38.remove((java.lang.Object) boolean53);
        boolean boolean55 = languageRangeList25.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange57 = languageRangeList25.remove(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 53, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.time.LocalTime localTime12 = localTime4.minusMinutes((long) (short) 10);
        int int13 = localTime12.toSecondOfDay();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.YEAR;
        long long16 = chronoField14.checkValidValue(125L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime18 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) 300000000);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 85800 + "'", int13 == 85800);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 125L + "'", long16 == 125L);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long2 = duration1.getStandardDays();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13, periodType14);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod15.setWeeks((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(505000000, 366, (int) (short) 100, 37930);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 505000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.Month month5 = localDate4.getMonth();
        int int6 = month5.getValue();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.minusSeconds(1);
        java.lang.String str5 = timeOfDay1.toString();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.era();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay1.withChronologyRetainFields(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "T00:00:00.032" + "'", str5, "T00:00:00.032");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str7 = chronoField6.toString();
        java.time.temporal.ValueRange valueRange8 = zonedDateTime5.range((java.time.temporal.TemporalField) chronoField6);
        java.time.Clock clock9 = java.time.Clock.systemUTC();
        java.time.Instant instant10 = clock9.instant();
        java.util.Date date11 = java.util.Date.from(instant10);
        java.time.Clock clock12 = java.time.Clock.systemUTC();
        java.time.Instant instant13 = clock12.instant();
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofInstant(instant13, (java.time.ZoneId) zoneOffset15);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.ofInstant(instant10, (java.time.ZoneId) zoneOffset15);
        java.time.LocalTime localTime18 = offsetDateTime17.toLocalTime();
        java.time.Duration duration20 = java.time.Duration.ofHours(0L);
        java.time.Duration duration22 = java.time.Duration.ofHours(0L);
        int int23 = duration20.compareTo(duration22);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList24 = duration20.getUnits();
        java.time.Duration duration25 = duration20.abs();
        java.time.OffsetDateTime offsetDateTime26 = offsetDateTime17.minus((java.time.temporal.TemporalAmount) duration20);
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now();
        boolean boolean29 = localDateTime27.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime33 = java.time.LocalDateTime.now();
        boolean boolean34 = localDateTime32.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        boolean boolean35 = localDateTime31.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        java.time.LocalDateTime localDateTime37 = localDateTime31.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.now();
        boolean boolean40 = localDateTime38.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime39);
        java.time.LocalDateTime localDateTime42 = localDateTime38.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.now();
        boolean boolean45 = localDateTime43.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        boolean boolean46 = localDateTime42.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        boolean boolean47 = localDateTime37.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        java.time.temporal.ChronoField chronoField48 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange49 = chronoField48.range();
        java.time.temporal.TemporalUnit temporalUnit50 = chronoField48.getRangeUnit();
        boolean boolean51 = localDateTime44.isSupported(temporalUnit50);
        boolean boolean52 = temporalUnit50.isDurationEstimated();
        boolean boolean53 = offsetDateTime26.isSupported(temporalUnit50);
        boolean boolean54 = zonedDateTime5.isSupported(temporalUnit50);
        java.time.ZonedDateTime zonedDateTime55 = zonedDateTime5.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Year" + "'", str7, "Year");
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 09:34:33 UTC 2022");
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(temporalUnitList24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + chronoField48 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField48.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange49);
        org.junit.Assert.assertTrue("'" + temporalUnit50 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit50.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zonedDateTime55);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble11 = intStream9.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        long long18 = localDate17.toEpochDay();
        int int19 = localDate17.lengthOfYear();
        java.time.chrono.Era era20 = localDate17.getEra();
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange22 = chronoField21.range();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField21.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField21.getBaseUnit();
        java.time.LocalDate localDate26 = localDate17.with((java.time.temporal.TemporalField) chronoField21, (long) 14);
        java.time.LocalDate localDate28 = localDate26.minusDays(25920000009L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate30 = localDate28.withMonth(442000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 442000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 19044L + "'", long18 == 19044L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertTrue("'" + era20 + "' != '" + java.time.chrono.IsoEra.CE + "'", era20.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange22);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.stream.Stream<java.lang.Long> longStream4 = longStream2.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfLong ofLong5 = longStream2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears((int) '#');
        mutablePeriod8.addSeconds(1);
        mutablePeriod8.addSeconds(100);
        mutablePeriod8.setSeconds(0);
        mutablePeriod8.addSeconds(457000000);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.lang.String str5 = fileTime4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T09:34:33.837Z" + "'", str5, "2022-02-21T09:34:33.837Z");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file7 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean8 = file2.renameTo(file7);
        java.io.File file9 = file7.getAbsoluteFile();
        java.io.File file11 = new java.io.File(file7, "hi!");
        boolean boolean12 = file7.canRead();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(file9);
// flaky:         org.junit.Assert.assertEquals(file9.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/experiment/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file11.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file11.toString(), "2022-02-21T09:33:57.064/hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        byte byte4 = byteBuffer2.get((int) (short) 10);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer2.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = byteBuffer2.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period9 = period4.minusHours((int) (byte) 1);
        int int10 = period4.getHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone7);
        org.joda.time.Period period9 = interval8.toPeriod();
        boolean boolean10 = interval4.isBefore((org.joda.time.ReadableInterval) interval8);
        boolean boolean11 = interval4.isBeforeNow();
        org.joda.time.Duration duration12 = interval4.toDuration();
        org.joda.time.Duration duration14 = duration12.minus((long) 21);
        org.joda.time.Instant instant15 = instant0.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 1);
        long long21 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        int int23 = property18.getMaximumTextLength(locale22);
        org.joda.time.DateTimeField dateTimeField24 = property18.getField();
        int int25 = instant0.get(dateTimeField24);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod34.setYears(100);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long39 = duration38.getStandardDays();
        mutablePeriod34.setPeriod((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long43 = duration42.getStandardDays();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.time();
        org.joda.time.Period period46 = duration42.toPeriodTo(readableInstant44, periodType45);
        boolean boolean47 = duration38.isEqual((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Instant instant48 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Interval interval56 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone55);
        org.joda.time.Period period57 = interval56.toPeriod();
        boolean boolean58 = interval52.isBefore((org.joda.time.ReadableInterval) interval56);
        boolean boolean59 = interval52.isBeforeNow();
        org.joda.time.Duration duration60 = interval52.toDuration();
        org.joda.time.Duration duration62 = duration60.minus((long) 21);
        org.joda.time.Instant instant63 = instant48.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.days();
        boolean boolean66 = periodType64.isSupported(durationFieldType65);
        org.joda.time.Period period67 = duration42.toPeriodFrom((org.joda.time.ReadableInstant) instant48, periodType64);
        org.joda.time.Instant instant68 = instant0.plus((org.joda.time.ReadableDuration) duration42);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(instant68);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        double[] doubleArray3 = new double[] { 97, 10, '#' };
        java.nio.DoubleBuffer doubleBuffer4 = java.nio.DoubleBuffer.wrap(doubleArray3);
        java.nio.DoubleBuffer doubleBuffer5 = doubleBuffer4.asReadOnlyBuffer();
        java.time.format.DecimalStyle decimalStyle6 = java.time.format.DecimalStyle.STANDARD;
        java.time.format.DecimalStyle decimalStyle8 = decimalStyle6.withZeroDigit('a');
        java.io.File file11 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file13 = new java.io.File(file11, "2022-02-21T09:33:57.064");
        java.io.File file15 = new java.io.File(file13, "T00:00:00.032");
        boolean boolean16 = decimalStyle8.equals((java.lang.Object) file15);
        boolean boolean17 = file15.mkdirs();
        boolean boolean18 = doubleBuffer4.equals((java.lang.Object) boolean17);
        java.nio.ByteOrder byteOrder19 = doubleBuffer4.order();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertNotNull(decimalStyle6);
        org.junit.Assert.assertNotNull(decimalStyle8);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file13.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file13.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file15.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file15.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteOrder19);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property9.getAsText(locale10);
        org.joda.time.DateTime dateTime12 = property9.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property9.setCopy((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.IntStream intStream10 = intStream9.distinct();
        java.util.function.IntPredicate intPredicate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = intStream9.noneMatch(intPredicate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = property21.getAsText(locale22);
        org.joda.time.LocalDateTime localDateTime26 = property21.addToCopy((long) 7);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withSecondOfMinute(16);
        int int29 = localDateTime28.getWeekyear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(48816000000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 48816000000000000 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "8" + "'", str24, "8");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period3 = period1.plusYears((long) 20);
        java.time.Period period5 = period3.withMonths(96);
        int int6 = period5.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (short) 1);
        int int2 = seconds1.size();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) seconds1);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime1 = java.time.LocalTime.MIN;
        int int2 = localTime0.compareTo(localTime1);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.now();
        boolean boolean5 = localDateTime3.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime4);
        java.time.LocalDateTime localDateTime7 = localDateTime3.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.now();
        boolean boolean10 = localDateTime8.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        boolean boolean11 = localDateTime7.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.LocalDateTime localDateTime13 = localDateTime7.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = localTime0.until((java.time.temporal.Temporal) localDateTime13, temporalUnit15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField14.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.withField(dateTimeFieldType6, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withZoneRetainFields(dateTimeZone9);
        boolean boolean11 = dateMidnight10.isBeforeNow();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.IsoEra isoEra1 = java.time.chrono.IsoEra.of((-30));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: -30");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar6 = new java.util.GregorianCalendar(locale5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone3, locale5);
        java.time.chrono.Chronology chronology8 = java.time.chrono.Chronology.ofLocale(locale5);
        java.lang.String str9 = locale1.getDisplayScript(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645436074371,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=34,MILLISECOND=371,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        boolean boolean17 = languageRangeList15.contains((java.lang.Object) "");
        boolean boolean18 = languageRangeList15.isEmpty();
        boolean boolean20 = languageRangeList15.remove((java.lang.Object) 10L);
        boolean boolean21 = languageRangeList15.isEmpty();
        boolean boolean22 = languageRangeList6.remove((java.lang.Object) boolean21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        boolean boolean25 = localDateTime23.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        java.time.LocalDate localDate26 = localDateTime23.toLocalDate();
        java.lang.String str27 = localDateTime23.toString();
        boolean boolean28 = languageRangeList6.contains((java.lang.Object) localDateTime23);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-02-21T09:34:34.381" + "'", str27, "2022-02-21T09:34:34.381");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Hours hours8 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType9 = hours8.getFieldType();
        org.joda.time.DurationFieldType durationFieldType10 = hours8.getFieldType();
        int int11 = period4.indexOf(durationFieldType10);
        org.joda.time.Period period13 = period4.withMinutes((int) (byte) 10);
        int[] intArray14 = period4.getValues();
        org.joda.time.Period period16 = org.joda.time.Period.months(10);
        org.joda.time.Period period17 = period4.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = period16.plusMonths(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks20 = period19.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long6 = duration5.getStandardDays();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod32.setYears((int) '#');
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.monthOfYear();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        mutablePeriod32.setPeriod((long) 3, (long) 9, chronology41);
        boolean boolean44 = durationFieldType3.isSupported(chronology41);
        org.joda.time.LocalDate localDate46 = localDate0.withFieldAdded(durationFieldType3, 5);
        int int47 = localDate46.getMonthOfYear();
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime48.toMutableDateTime(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long6 = duration5.getStandardDays();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod32.setYears((int) '#');
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.monthOfYear();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        mutablePeriod32.setPeriod((long) 3, (long) 9, chronology41);
        boolean boolean44 = durationFieldType3.isSupported(chronology41);
        org.joda.time.LocalDate localDate46 = localDate0.withFieldAdded(durationFieldType3, 5);
        int int47 = localDate46.getMonthOfYear();
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate50 = localDate46.withDayOfYear((int) '\uffff');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 65535 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.TWO;
        org.joda.time.DurationFieldType durationFieldType2 = minutes1.getFieldType();
        boolean boolean3 = minutes0.isGreaterThan(minutes1);
        org.joda.time.MutablePeriod mutablePeriod4 = minutes1.toMutablePeriod();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("2022-02-21T09:34:04.525");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 2022-02-21T09:34:04.525");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.net.URL uRL0 = null;
        java.security.CodeSigner codeSigner1 = null;
        java.security.CodeSigner[] codeSignerArray2 = new java.security.CodeSigner[] { codeSigner1 };
        java.security.CodeSource codeSource3 = new java.security.CodeSource(uRL0, codeSignerArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.security.cert.Certificate[] certificateArray4 = codeSource3.getCertificates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeSignerArray2);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusMonths((int) '#');
        boolean boolean5 = dateMidnight3.isAfter((long) (short) 1);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime14.withDayOfWeek(4);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.monthOfYear();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 1);
        long long24 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight23.withField(dateTimeFieldType25, (int) ' ');
        boolean boolean28 = dateTime14.isSupported(dateTimeFieldType25);
        int int29 = dateMidnight3.get(dateTimeFieldType25);
        int int30 = dateMidnight3.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 72 + "'", int29 == 72);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusMonths(10);
        int int5 = yearMonthDay2.getYear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears((int) '#');
        mutablePeriod8.addSeconds(1);
        mutablePeriod8.addMinutes((int) (short) 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        int int5 = gregorianCalendar1.getLeastMaximum(8);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar1.setWeekDate((int) 'x', 7, 867);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 867");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(27, 16, 11);
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        java.nio.CharBuffer charBuffer7 = charBuffer5.duplicate();
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer10 = charBuffer9.clear();
        int int11 = charBuffer7.compareTo(charBuffer9);
        java.lang.String str12 = charBuffer7.toString();
        boolean boolean13 = gregorianCalendar3.equals((java.lang.Object) charBuffer7);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional.empty" + "'", str12, "Optional.empty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = property21.getAsText(locale22);
        java.lang.String str25 = locale22.getLanguage();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "8" + "'", str24, "8");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(52, 565000000, 11);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 52 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.io.File file1 = new java.io.File("ISO");
        boolean boolean4 = file1.setExecutable(false, false);
        java.net.URL uRL5 = file1.toURL();
        java.net.URI uRI6 = uRL5.toURI();
        java.lang.String str7 = uRL5.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "ISO");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(uRL5);
// flaky:         org.junit.Assert.assertEquals(uRL5.toString(), "file:/experiment/ISO");
        org.junit.Assert.assertNotNull(uRI6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "file:/experiment/ISO" + "'", str7, "file:/experiment/ISO");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(6603384152749567654L);
        int int2 = dateTime1.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 247 + "'", int2 == 247);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.halfdays();
        int int7 = durationField4.getDifference((long) 96, (long) (-1));
        boolean boolean8 = durationField4.isSupported();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        boolean boolean2 = intBuffer1.isDirect();
        int[] intArray3 = intBuffer1.array();
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.of(intArray3);
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer7 = charBuffer6.clear();
        java.nio.CharBuffer charBuffer8 = charBuffer6.duplicate();
        java.nio.CharBuffer charBuffer10 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer11 = charBuffer10.clear();
        int int12 = charBuffer8.compareTo(charBuffer10);
        java.lang.String str13 = charBuffer8.toString();
        java.util.stream.IntStream intStream14 = charBuffer8.chars();
        java.util.stream.IntStream intStream15 = intStream14.distinct();
        java.util.LongSummaryStatistics longSummaryStatistics16 = new java.util.LongSummaryStatistics();
        longSummaryStatistics16.accept(565000000);
        intStream15.forEachOrdered((java.util.function.IntConsumer) longSummaryStatistics16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream20 = java.util.stream.IntStream.concat(intStream4, intStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional.empty" + "'", str13, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertEquals(longSummaryStatistics16.toString(), "LongSummaryStatistics{count=13, sum=565001215, min=46, average=43461631.923077, max=565000000}");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        int int2 = dateMidnight1.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.monthOfYear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.minus(readableDuration6);
        int int8 = dateMidnight4.getSecondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadableInstant) dateMidnight4);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone12);
        boolean boolean14 = interval13.containsNow();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.monthOfYear();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        long long20 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.withField(dateTimeFieldType21, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight19.withZoneRetainFields(dateTimeZone24);
        boolean boolean26 = interval13.isBefore((org.joda.time.ReadableInstant) dateMidnight25);
        boolean boolean28 = interval13.isBefore((long) '4');
        mutablePeriod9.add((org.joda.time.ReadableInterval) interval13);
        org.joda.time.DateTime dateTime30 = interval13.getEnd();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.halfdays();
        int int7 = durationField4.getDifference((long) 96, (long) (-1));
        long long8 = durationField4.getUnitMillis();
        long long9 = durationField4.getUnitMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 43200000L + "'", long8 == 43200000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43200000L + "'", long9 == 43200000L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("2022-02-21T09:34:05.527", "2022-02-21T09:34:33.837Z", 347000000);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file7 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean8 = file2.renameTo(file7);
        boolean boolean11 = file2.setWritable(true, false);
        long long12 = file2.getTotalSpace();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 364740218880L + "'", long12 == 364740218880L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusMonths(10);
        org.joda.time.LocalDate localDate5 = yearMonthDay4.toLocalDate();
        java.lang.Class<?> wildcardClass6 = localDate5.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.of(457000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfWeek: 457000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.monthOfYear();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(0L, chronology6);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay1.withChronologyRetainFields(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream3 = null; // flaky: new java.io.PrintStream(file2);
// flaky:         printStream3.print('a');
// flaky:         printStream3.println(false);
        char[] charArray13 = new char[] { 'a', '\uffff', '\uffff', 'x', ' ' };
// flaky:         printStream3.print(charArray13);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar17 = new java.util.GregorianCalendar(locale16);
        org.joda.time.YearMonthDay yearMonthDay18 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar17);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.plusMonths(10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = yearMonthDay18.getFieldTypes();
        java.io.PrintStream printStream22 = null; // flaky: printStream3.printf("2022-02-21T09:34:05.527", (java.lang.Object[]) dateTimeFieldTypeArray21);
// flaky:         printStream22.println((long) 2022);
// flaky:         printStream22.println(' ');
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(charArray13);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "\uffff\uffff, x,  ]");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
// flaky:         org.junit.Assert.assertNotNull(printStream22);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        long long18 = localDate17.toEpochDay();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField20.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate22 = localDate17.plus((long) 999999999, temporalUnit21);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 19044L + "'", long18 == 19044L);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField20.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer2.putInt((-2147483648), 37930000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        int int8 = charBuffer3.position();
        java.nio.CharBuffer charBuffer9 = charBuffer3.duplicate();
        java.io.File file12 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file14 = new java.io.File(file12, "2022-02-21T09:33:57.064");
        java.nio.file.Path path15 = file12.toPath();
        java.io.PrintWriter printWriter16 = null; // flaky: new java.io.PrintWriter(file12);
        boolean boolean17 = false; // flaky: printWriter16.checkError();
        java.io.File file20 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file22 = new java.io.File(file20, "2022-02-21T09:33:57.064");
        java.nio.file.Path path23 = file20.toPath();
        java.io.PrintWriter printWriter24 = null; // flaky: new java.io.PrintWriter(file20);
// flaky:         printWriter24.print((double) 35);
        char[] charArray30 = new char[] { ':', 'a', '#' };
// flaky:         printWriter24.print(charArray30);
// flaky:         printWriter16.write(charArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer35 = charBuffer9.get(charArray30, (int) (short) -1, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file14.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file14.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull("file20.getParent() == null", file20.getParent());
        org.junit.Assert.assertEquals(file20.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file22.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file22.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), ":a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), ":a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[:, a, #]");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.time.Instant instant4 = clock3.instant();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.plusDays((long) 365);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime8.plusYears((long) 100);
        java.time.Duration duration15 = java.time.Duration.ofHours(0L);
        java.time.Duration duration17 = java.time.Duration.ofHours(0L);
        int int18 = duration15.compareTo(duration17);
        java.time.Duration duration20 = duration17.plusMillis(100L);
        java.time.OffsetDateTime offsetDateTime21 = offsetDateTime8.minus((java.time.temporal.TemporalAmount) duration20);
        java.time.OffsetDateTime offsetDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = offsetDateTime21.isBefore(offsetDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:35 UTC 2022");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.addWrapFieldToCopy(2);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.Period period8 = new org.joda.time.Period((-259200000L), (long) (short) 0, chronology7);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.time.Period period5 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean7 = period5.equals((java.lang.Object) (-1));
        int int8 = period5.getDays();
        java.time.Period period9 = period1.minus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod10 = period5.normalized();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList11 = period5.getUnits();
        java.time.chrono.ChronoPeriod chronoPeriod12 = period5.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(chronoPeriod10);
        org.junit.Assert.assertNotNull(temporalUnitList11);
        org.junit.Assert.assertNotNull(chronoPeriod12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer2.putDouble((double) 28);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        java.lang.String str9 = durationField8.getName();
        int int12 = durationField8.getValue((long) 19, 1645436062912L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "January" + "'", str7, "January");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "days" + "'", str9, "days");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter("/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setWeekyear(0);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) 21);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration4, 256);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod15.setYears(100);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod15.copy();
        int int19 = mutablePeriod18.getDays();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.add((org.joda.time.ReadablePeriod) mutablePeriod18, 505000000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 50500000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        long long25 = dateTimeField22.roundFloor(1L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-259200000L) + "'", long25 == (-259200000L));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        int int8 = timeZone6.getRawOffset();
        java.util.Calendar.Builder builder9 = builder4.setTimeZone(timeZone6);
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        int int11 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone4);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.centuryOfEra();
        int int18 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str20 = dateTimeZone4.getShortName((-1L));
        java.net.URL uRL21 = null;
        java.security.CodeSigner codeSigner22 = null;
        java.security.CodeSigner[] codeSignerArray23 = new java.security.CodeSigner[] { codeSigner22 };
        java.security.CodeSource codeSource24 = new java.security.CodeSource(uRL21, codeSignerArray23);
        java.security.CodeSigner[] codeSignerArray25 = codeSource24.getCodeSigners();
        java.security.PermissionCollection permissionCollection26 = null;
        java.lang.ClassLoader classLoader27 = null;
        java.security.Principal[] principalArray28 = null;
        java.security.ProtectionDomain protectionDomain29 = new java.security.ProtectionDomain(codeSource24, permissionCollection26, classLoader27, principalArray28);
        java.time.Duration duration31 = java.time.Duration.ofHours(0L);
        java.time.Duration duration33 = java.time.Duration.ofHours(0L);
        int int34 = duration31.compareTo(duration33);
        java.time.Duration duration36 = duration31.minusSeconds(0L);
        boolean boolean37 = codeSource24.equals((java.lang.Object) 0L);
        boolean boolean38 = dateTimeZone4.equals((java.lang.Object) codeSource24);
        java.net.URL uRL39 = codeSource24.getLocation();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(codeSignerArray23);
        org.junit.Assert.assertNotNull(codeSignerArray25);
        org.junit.Assert.assertEquals(protectionDomain29.toString(), "ProtectionDomain  (null null)\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(uRL39);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime6.withMonth(7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime18 = zonedDateTime16.withDayOfMonth(439000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 439000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(zonedDateTime16);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putDouble(999999999, (double) 457000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        boolean boolean3 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime2);
        java.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        boolean boolean9 = localDateTime5.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime11 = localDateTime5.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.now();
        boolean boolean14 = localDateTime12.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime13);
        java.time.LocalDateTime localDateTime16 = localDateTime12.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        boolean boolean20 = localDateTime16.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        boolean boolean21 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset23, (java.time.ZoneId) zoneOffset25);
        java.time.Clock clock27 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset25);
        java.time.chrono.ChronoLocalDate chronoLocalDate28 = isoChronology0.dateNow(clock27);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime30 = localDateTime29.toLocalTime();
        java.time.LocalDateTime localDateTime32 = localDateTime29.withNano(0);
        java.time.Duration duration34 = java.time.Duration.ofHours(0L);
        java.time.Duration duration36 = java.time.Duration.ofHours(0L);
        int int37 = duration34.compareTo(duration36);
        java.time.Duration duration39 = duration34.minusMinutes((long) 'a');
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList40 = duration34.getUnits();
        java.time.temporal.Temporal temporal41 = localDateTime32.plus((java.time.temporal.TemporalAmount) duration34);
        java.time.Clock clock42 = java.time.Clock.tick(clock27, duration34);
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertNotNull(clock27);
        org.junit.Assert.assertNotNull(chronoLocalDate28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(temporalUnitList40);
        org.junit.Assert.assertNotNull(temporal41);
        org.junit.Assert.assertNotNull(clock42);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean3 = mutableInterval1.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone6);
        org.joda.time.Period period8 = interval7.toPeriod();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = period8.get(durationFieldType9);
        org.joda.time.Period period11 = period8.toPeriod();
        mutableInterval1.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period8);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now();
        mutableDateTime13.add((long) (byte) 0);
        mutableDateTime13.add((long) (byte) 1);
        org.joda.time.MutableInterval mutableInterval19 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean21 = mutableInterval19.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone24);
        org.joda.time.Period period26 = interval25.toPeriod();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = period26.get(durationFieldType27);
        org.joda.time.Period period29 = period26.toPeriod();
        mutableInterval19.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period32 = period26.plusMinutes((int) (byte) 100);
        mutableDateTime13.add((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long38 = duration37.getStandardDays();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.time();
        org.joda.time.Period period41 = duration37.toPeriodTo(readableInstant39, periodType40);
        org.joda.time.Duration duration42 = duration35.minus((org.joda.time.ReadableDuration) duration37);
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long46 = duration45.getStandardDays();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.time();
        org.joda.time.Period period49 = duration45.toPeriodTo(readableInstant47, periodType48);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Interval interval53 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone52);
        org.joda.time.Period period54 = interval53.toPeriod();
        org.joda.time.DurationFieldType durationFieldType55 = null;
        int int56 = period54.get(durationFieldType55);
        org.joda.time.Period period57 = period54.toPeriod();
        org.joda.time.Hours hours58 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType59 = hours58.getFieldType();
        org.joda.time.DurationFieldType durationFieldType60 = hours58.getFieldType();
        int int61 = period54.indexOf(durationFieldType60);
        int int62 = period49.get(durationFieldType60);
        mutableDateTime13.add(durationFieldType60, 2);
        org.joda.time.Period period66 = period8.withFieldAdded(durationFieldType60, 35);
        int int67 = period66.getMonths();
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        int int15 = property2.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay16 = property2.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay17 = property2.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay18 = property2.withMaximumValue();
        java.lang.String str19 = property2.toString();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[minuteOfHour]" + "'", str19, "Property[minuteOfHour]");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone5);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        org.joda.time.DateTime.Property property18 = dateTime17.centuryOfEra();
        int int19 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone5);
        mutableDateTime0.setZoneRetainFields(dateTimeZone5);
        int int23 = dateTimeZone5.getOffsetFromLocal(203L);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException("P35Y12D");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.DoubleStream doubleStream3 = longStream2.asDoubleStream();
        java.util.stream.LongStream.Builder builder4 = java.util.stream.LongStream.builder();
        // The following exception was thrown during execution in test generation
        try {
            longStream2.forEach((java.util.function.LongConsumer) builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        boolean boolean2 = intBuffer1.isDirect();
        java.nio.IntBuffer intBuffer4 = java.nio.IntBuffer.allocate(256);
        boolean boolean5 = intBuffer4.isDirect();
        int int6 = intBuffer1.compareTo(intBuffer4);
        int int7 = intBuffer4.get();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.setWeekyear(0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay24.toDateMidnight(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = yearMonthDay24.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay24.toDateMidnight(dateTimeZone29);
        java.lang.Object obj31 = properties1.getOrDefault((java.lang.Object) 0, (java.lang.Object) dateMidnight30);
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties1.keys();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet33 = properties1.entrySet();
        java.io.File file36 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream37 = null; // flaky: new java.io.PrintStream(file36);
// flaky:         printStream37.print('a');
// flaky:         printStream37.println(false);
        char[] charArray47 = new char[] { 'a', '\uffff', '\uffff', 'x', ' ' };
// flaky:         printStream37.print(charArray47);
// flaky:         printStream37.flush();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod60.setYears(100);
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long65 = duration64.getStandardDays();
        mutablePeriod60.setPeriod((org.joda.time.ReadableDuration) duration64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime51.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime51.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property71 = localDateTime51.property(dateTimeFieldType70);
        java.util.Locale locale72 = java.util.Locale.UK;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.lang.String str74 = property71.getAsText(locale72);
        org.joda.time.LocalDateTime localDateTime76 = property71.addToCopy((long) 7);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.withSecondOfMinute(16);
        org.joda.time.LocalDateTime.Property property79 = localDateTime76.dayOfYear();
        org.joda.time.LocalDateTime.Property property80 = localDateTime76.era();
// flaky:         printStream37.println((java.lang.Object) property80);
        java.lang.Object obj82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = properties1.putIfAbsent((java.lang.Object) property80, obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNotNull(objEntrySet33);
        org.junit.Assert.assertNull("file36.getParent() == null", file36.getParent());
        org.junit.Assert.assertEquals(file36.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(charArray47);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "\uffff\uffff, x,  ]");
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "8" + "'", str74, "8");
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(property80);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        gregorianCalendar1.setTimeInMillis((-999999999L));
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar8 = new java.util.GregorianCalendar(locale7);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        java.time.Instant instant10 = gregorianCalendar8.toInstant();
        java.util.TimeZone timeZone11 = gregorianCalendar8.getTimeZone();
        gregorianCalendar1.setTimeZone(timeZone11);
        java.lang.String str13 = timeZone11.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears(100);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long13 = duration12.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long17 = duration16.getStandardDays();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.time();
        org.joda.time.Period period20 = duration16.toPeriodTo(readableInstant18, periodType19);
        boolean boolean21 = duration12.isEqual((org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property31 = dateTime30.hourOfDay();
        org.joda.time.DateTime.Property property32 = dateTime30.yearOfEra();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long35 = duration34.getStandardDays();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.time();
        org.joda.time.Period period38 = duration34.toPeriodTo(readableInstant36, periodType37);
        org.joda.time.Period period39 = period38.negated();
        org.joda.time.PeriodType periodType40 = period38.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withMonthsRemoved();
        org.joda.time.Period period42 = duration16.toPeriodTo((org.joda.time.ReadableInstant) dateTime30, periodType40);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 0);
        int int4 = localTime3.size();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        int int15 = localDate14.lengthOfMonth();
        java.time.chrono.IsoChronology isoChronology16 = localDate14.getChronology();
        java.lang.String str17 = isoChronology16.getCalendarType();
        java.time.chrono.IsoEra isoEra19 = isoChronology16.eraOf((int) (byte) 0);
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar21 = new java.util.GregorianCalendar(locale20);
        org.joda.time.YearMonthDay yearMonthDay22 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar21);
        java.time.Instant instant23 = gregorianCalendar21.toInstant();
        java.nio.file.attribute.FileTime fileTime24 = java.nio.file.attribute.FileTime.from(instant23);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone25.hasSameRules(timeZone26);
        java.time.ZoneId zoneId28 = timeZone25.toZoneId();
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.ofInstant(instant23, zoneId28);
        java.time.OffsetDateTime offsetDateTime31 = offsetDateTime29.minusDays(1645436047L);
        java.time.OffsetDateTime offsetDateTime33 = offsetDateTime31.minusYears(0L);
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.now();
        boolean boolean36 = localDateTime34.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime35);
        java.time.LocalDateTime localDateTime38 = localDateTime34.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.now();
        boolean boolean41 = localDateTime39.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime40);
        boolean boolean42 = localDateTime38.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime40);
        java.time.LocalDateTime localDateTime44 = localDateTime38.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime45 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime46 = java.time.LocalDateTime.now();
        boolean boolean47 = localDateTime45.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime46);
        java.time.LocalDateTime localDateTime49 = localDateTime45.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime50 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.now();
        boolean boolean52 = localDateTime50.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime51);
        boolean boolean53 = localDateTime49.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime51);
        boolean boolean54 = localDateTime44.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime51);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.YEAR;
        boolean boolean56 = localDateTime44.isSupported((java.time.temporal.TemporalField) chronoField55);
        boolean boolean57 = offsetDateTime33.isSupported((java.time.temporal.TemporalField) chronoField55);
        // The following exception was thrown during execution in test generation
        try {
            long long58 = isoEra19.getLong((java.time.temporal.TemporalField) chronoField55);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "iso8601" + "'", str17, "iso8601");
        org.junit.Assert.assertTrue("'" + isoEra19 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra19.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField55.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.net.FileNameMap fileNameMap0 = java.net.URLConnection.getFileNameMap();
        java.lang.String str2 = fileNameMap0.getContentTypeFor("2022-02-21T09:35:25.347");
        org.junit.Assert.assertNotNull(fileNameMap0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.concurrent.TimeoutException timeoutException1 = new java.util.concurrent.TimeoutException("PT0M");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone6);
        org.joda.time.Period period8 = interval7.toPeriod();
        boolean boolean9 = interval3.isBefore((org.joda.time.ReadableInterval) interval7);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0L, chronology14);
        org.joda.time.Interval interval17 = interval7.withChronology(chronology14);
        org.joda.time.MutableInterval mutableInterval18 = interval7.toMutableInterval();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours(16);
        org.joda.time.DateTime dateTime34 = dateTime29.withTime((int) (byte) 1, 12, (int) (short) 0, 5);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.withDayOfYear(100);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.withYearOfEra((int) (byte) 1);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DurationFieldType durationFieldType42 = weeks41.getFieldType();
        org.joda.time.Weeks weeks44 = weeks41.plus((int) 'u');
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours(16);
        org.joda.time.DateTime dateTime60 = dateTime55.withTime((int) (byte) 1, 12, (int) (short) 0, 5);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.withDayOfYear(100);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.withYearOfEra((int) (byte) 1);
        org.joda.time.Weeks weeks67 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateMidnight66);
        org.joda.time.Weeks weeks68 = weeks67.negated();
        boolean boolean69 = weeks44.isGreaterThan(weeks67);
        org.joda.time.Duration duration70 = weeks44.toStandardDuration();
        org.joda.time.Duration duration72 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long73 = duration72.getStandardDays();
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.time();
        org.joda.time.Period period76 = duration72.toPeriodTo(readableInstant74, periodType75);
        org.joda.time.Duration duration77 = duration70.plus((org.joda.time.ReadableDuration) duration72);
        mutableInterval18.setDurationAfterStart((org.joda.time.ReadableDuration) duration77);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(duration77);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long6 = duration5.getStandardDays();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long9 = duration8.getStandardDays();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod32.setYears((int) '#');
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.monthOfYear();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        mutablePeriod32.setPeriod((long) 3, (long) 9, chronology41);
        boolean boolean44 = durationFieldType3.isSupported(chronology41);
        org.joda.time.LocalDate localDate46 = localDate0.withFieldAdded(durationFieldType3, 5);
        int int47 = localDate46.getYear();
        org.joda.time.DateMidnight dateMidnight48 = localDate46.toDateMidnight();
        int int49 = dateMidnight48.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2022 + "'", int47 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 57 + "'", int49 == 57);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength((int) (byte) 100);
        java.lang.String str2 = coderResult1.toString();
        java.lang.String str3 = coderResult1.toString();
        org.junit.Assert.assertNotNull(coderResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MALFORMED[100]" + "'", str2, "MALFORMED[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MALFORMED[100]" + "'", str3, "MALFORMED[100]");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress("Optional.empty", byteArray5);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer7.asLongBuffer();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer7.putChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer12 = byteBuffer7.limit(7000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 32, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.plus(100);
        int int3 = hours0.getHours();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.MutableInterval mutableInterval6 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean8 = mutableInterval6.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period16 = period13.toPeriod();
        mutableInterval6.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period18 = mutableInterval6.toPeriod();
        org.joda.time.Interval interval19 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        java.lang.String str22 = localDateTime21.toString();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withDayOfYear((int) '4');
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime();
        boolean boolean26 = mutableInterval6.isBefore((org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime25.getDayOfWeek();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNull(interval19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022-02-21T09:34:38.107" + "'", str22, "2022-02-21T09:34:38.107");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.ofInstant(instant3, zoneId8);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.minusDays(1645436047L);
        int int12 = offsetDateTime9.getMonthValue();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime9.plusHours((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime16 = offsetDateTime9.withDayOfMonth(126);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 126");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(offsetDateTime14);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        java.nio.FloatBuffer floatBuffer5 = byteBuffer1.asFloatBuffer();
        java.nio.FloatBuffer floatBuffer6 = floatBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = floatBuffer6.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        boolean boolean17 = languageRangeList15.contains((java.lang.Object) "");
        boolean boolean18 = languageRangeList15.isEmpty();
        boolean boolean20 = languageRangeList15.remove((java.lang.Object) 10L);
        boolean boolean21 = languageRangeList15.isEmpty();
        boolean boolean22 = strSet9.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor23 = languageRangeList15.listIterator();
        java.lang.String[] strArray36 = new java.lang.String[] { "Optional.empty", "1", "P35Y100MT32H97M97.001S", "23:50:00.000000097", "-999999999 - 999999999", "-999999999 - 999999999", "P35Y12D", "-999999999 - 999999999", "", "Optional.empty", "10", "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.time.LocalTime localTime43 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        boolean boolean49 = localTime43.equals((java.lang.Object) languageRangeList45);
        boolean boolean50 = strSet37.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strSet37, filteringMode51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service54 = new java.security.Provider.Service(provider0, "2022-02-21T09:34:05.527", "java.nio.HeapShortBuffer[pos=0 lim=4 cap=4]", "NanoOfDay", strList52, strMap53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(languageRangeItor23);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList52);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        java.lang.String str1 = inetAddress0.getHostAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "172.17.0.2" + "'", str1, "172.17.0.2");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((-86399965L), 1);
        java.lang.String str4 = instant0.toString();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21T09:34:38.531Z" + "'", str4, "2022-02-21T09:34:38.531Z");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale.setDefault(locale6);
        java.time.format.DecimalStyle decimalStyle9 = java.time.format.DecimalStyle.of(locale6);
        java.lang.String str10 = locale6.getVariant();
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(locale6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(decimalStyle9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days4 = days2.negated();
        org.joda.time.Days days5 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.Days days7 = days4.plus(days5);
        org.joda.time.Days days8 = days0.plus(days4);
        org.joda.time.Days days10 = days4.plus(23);
        java.util.Optional<org.joda.time.base.BaseSingleFieldPeriod> baseSingleFieldPeriodOptional11 = java.util.Optional.ofNullable((org.joda.time.base.BaseSingleFieldPeriod) days10);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(baseSingleFieldPeriodOptional11);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Hours hours8 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType9 = hours8.getFieldType();
        org.joda.time.DurationFieldType durationFieldType10 = hours8.getFieldType();
        int int11 = period4.indexOf(durationFieldType10);
        org.joda.time.Period period13 = period4.withMinutes((int) (byte) 10);
        int[] intArray14 = period4.getValues();
        java.nio.IntBuffer intBuffer15 = java.nio.IntBuffer.wrap(intArray14);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intBuffer15);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException("BIG_ENDIAN");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withChronology(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime8.withHourOfDay(1);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.TWO;
        org.joda.time.DurationFieldType durationFieldType15 = minutes14.getFieldType();
        boolean boolean16 = minutes13.isGreaterThan(minutes14);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadablePeriod) minutes13);
        org.joda.time.MutableInterval mutableInterval19 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean21 = mutableInterval19.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone24);
        org.joda.time.Period period26 = interval25.toPeriod();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = period26.get(durationFieldType27);
        org.joda.time.Period period29 = period26.toPeriod();
        mutableInterval19.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Interval interval31 = interval17.overlap((org.joda.time.ReadableInterval) mutableInterval19);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNull(interval31);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.plus(100);
        org.joda.time.Hours hours3 = hours0.negated();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.time.Instant instant4 = clock3.instant();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.Duration duration11 = java.time.Duration.ofHours(0L);
        java.time.Duration duration13 = java.time.Duration.ofHours(0L);
        int int14 = duration11.compareTo(duration13);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList15 = duration11.getUnits();
        java.time.Duration duration16 = duration11.abs();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime8.minus((java.time.temporal.TemporalAmount) duration11);
        int int18 = offsetDateTime8.getDayOfYear();
        java.time.ZonedDateTime zonedDateTime19 = offsetDateTime8.toZonedDateTime();
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:38 UTC 2022");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(temporalUnitList15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(zonedDateTime19);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval1.setEndMillis((long) 4096);
        org.joda.time.Duration duration4 = mutableInterval1.toDuration();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (short) 1);
        long long10 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withField(dateTimeFieldType11, (int) ' ');
        mutableInterval1.setStart((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withYearOfCentury(19);
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.time.Month month1 = java.time.Month.FEBRUARY;
        java.time.LocalDate localDate3 = java.time.LocalDate.of(505000000, month1, 13);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange5 = localDate3.range((java.time.temporal.TemporalField) chronoField4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.FEBRUARY + "'", month1.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField4.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
    }
}
