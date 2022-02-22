import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test21501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21501");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime2.add(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap10);
        boolean boolean12 = dateTimeZone8.equals((java.lang.Object) strMap10);
        boolean boolean14 = dateTimeZone8.isStandardOffset((long) (byte) -1);
        long long17 = dateTimeZone8.convertLocalToUTC((long) (short) 10, true);
        mutableDateTime2.setZoneRetainFields(dateTimeZone8);
        boolean boolean19 = dateTimeZone8.isFixed();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
        org.joda.time.Chronology chronology23 = dateTimeFormatter22.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        int int25 = localDateTime24.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMinutes((int) (short) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.monthOfYear();
        long long35 = mutableDateTime33.getMillis();
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime33.add(readableDuration36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.era();
        int int39 = mutableDateTime33.get(dateTimeFieldType38);
        long long40 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime33);
        int int41 = mutableDateTime33.getDayOfWeek();
        int int44 = dateTimeFormatter22.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime33, "69262818", 37);
        org.joda.time.tz.NameProvider nameProvider45 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale47 = new java.util.Locale("hi!");
        java.util.Locale locale48 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale53 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 69203825, chronology51, locale53, (java.lang.Integer) 54202800);
        java.lang.String str56 = locale47.getDisplayCountry(locale53);
        java.lang.String str59 = nameProvider45.getShortName(locale53, "-2000-02-25T19:13:31.786", "fra");
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str63 = nameProvider45.getShortName(locale60, "1970-02-05T19", "2022-01-25T17:33:50.182");
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.lang.String str67 = nameProvider45.getName(locale64, "-2000-02-25T19:13:49.095", "DateTimeField[era]");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider45);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.monthOfYear();
        java.util.Locale locale73 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str74 = locale73.getISO3Language();
        int int75 = property72.getMaximumShortTextLength(locale73);
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale76);
        java.lang.String str78 = locale73.getDisplayName(locale76);
        java.lang.String str79 = locale76.getISO3Country();
        java.lang.String str82 = nameProvider45.getShortName(locale76, "1970-01-05T04:10:00.000+100:10", "2022-01-25T17:34:58.980");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter22.withLocale(locale76);
        java.lang.String str84 = dateTimeZone8.getName((long) 1322017, locale76);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-360599990L) + "'", long17 == (-360599990L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 69798213 + "'", int25 == 69798213);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 27385643L + "'", long40 == 27385643L);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-38) + "'", int44 == (-38));
        org.junit.Assert.assertNotNull(nameProvider45);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko_KR");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "fra" + "'", str74, "fra");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 5 + "'", int75 == 5);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "fran\347ais (Canada)" + "'", str78, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "FRA" + "'", str79, "FRA");
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "+100:10" + "'", str84, "+100:10");
    }

    @Test
    public void test21502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21502");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = mutableDateTime2.getMillis();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDayOfMonth((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYear(69204037);
        int int14 = localDateTime9.getDayOfMonth();
        int int15 = localDateTime9.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localDateTime9.isSupported(durationFieldType16);
        mutableDateTime2.add(durationFieldType16, 339);
        mutableDateTime2.add((long) 69210165);
        mutableDateTime2.setMillis((long) 69287180);
        int int24 = mutableDateTime2.getDayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test21503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21503");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("-2000-02-25T19:13:31.786");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) "-2000-02-25T19:13:31.786", dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDate(65929, 65860, 69726902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 65860 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test21504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21504");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate21.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDate.Property property26 = localDate21.monthOfYear();
        org.joda.time.LocalDate localDate28 = property26.addToCopy(69210404);
        int int29 = property26.getMaximumValue();
        org.joda.time.LocalDate localDate30 = property26.roundFloorCopy();
        org.joda.time.LocalDate localDate31 = property26.roundHalfEvenCopy();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test21505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21505");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.Instant instant4 = mutableDateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        long long11 = dateTimeZone7.convertLocalToUTC((long) 70, true, 1969L);
        boolean boolean12 = mutableDateTime2.equals((java.lang.Object) dateTimeZone7);
        boolean boolean13 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.year();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.era();
        mutableDateTime2.addMonths(69714048);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-360599930L) + "'", long11 == (-360599930L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test21506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21506");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        int int4 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfDay((int) (byte) 100);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 5, chronology8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.plus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusHours((-2022));
        org.joda.time.LocalTime localTime14 = dateTime13.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTimeISO();
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfHour();
        int int18 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test21507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21507");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(69210934);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plus(readableDuration15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.weekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test21508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21508");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) (short) 100);
        org.joda.time.DateTime.Property property32 = dateTime29.monthOfYear();
        org.joda.time.DateTime dateTime34 = property32.setCopy(2);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMonths(69223981);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMillis(69229864);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfWeek();
        org.joda.time.DateTime dateTime41 = property39.addToCopy(69253158);
        org.joda.time.DateTime dateTime43 = property39.addToCopy(69714413L);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test21509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21509");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withWeekyear(1969);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withMillisOfDay(365);
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69798318 + "'", int1 == 69798318);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test21510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21510");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate21.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDate.Property property26 = localDate21.weekyear();
        int int27 = property26.getLeapAmount();
        org.joda.time.LocalDate localDate28 = property26.roundHalfFloorCopy();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendTimeZoneShortName(strMap35);
        boolean boolean37 = dateTimeZone33.equals((java.lang.Object) strMap35);
        boolean boolean39 = dateTimeZone33.isStandardOffset((long) (byte) -1);
        long long42 = dateTimeZone33.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str43 = dateTimeZone33.getID();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone33);
        int int45 = localDate44.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property47 = localDate44.property(dateTimeFieldType46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType46.getField(chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) chronology48, chronology50);
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.minutes();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.weekyear();
        org.joda.time.DurationField durationField55 = durationFieldType29.getField(chronology52);
        org.joda.time.DateTimeZone dateTimeZone56 = chronology52.getZone();
        org.joda.time.DateMidnight dateMidnight57 = localDate28.toDateMidnight(dateTimeZone56);
        java.lang.String str59 = dateTimeZone56.getNameKey(72000000L);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(dateTimeZone56);
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.now(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-360599990L) + "'", long42 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+100:10" + "'", str43, "+100:10");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "UTC" + "'", str59, "UTC");
        org.junit.Assert.assertNotNull(localDate61);
    }

    @Test
    public void test21511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 5, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.DateTime dateTime7 = dateTime4.withWeekyear(69288542);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.monthOfYear();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.addWrapField(0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfWeek();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.millisOfSecond();
        int int27 = dateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test21512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21512");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology4);
        java.lang.String str6 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property7 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.plusMinutes(59);
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime.Property property12 = localTime10.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime.Property property15 = localTime10.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str6, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:58" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT00:58");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test21513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21513");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(59);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withWeekOfWeekyear((int) '#');
        int int7 = localDateTime0.size();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.minusSeconds(69221646);
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.monthOfYear();
        boolean boolean12 = property11.isLeap();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2019 + "'", int10 == 2019);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21514");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfCentury(70);
        int int18 = localDate17.getWeekOfWeekyear();
        int[] intArray19 = localDate17.getValues();
        int int20 = localDate17.getWeekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate23 = localDate17.withFieldAdded(durationFieldType21, 13248);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra(69434561);
        int int27 = localDate23.getMonthOfYear();
        org.joda.time.Chronology chronology28 = localDate23.getChronology();
        org.joda.time.LocalDate localDate30 = localDate23.minusWeeks(69289203);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1970, 1, 5]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "15218-01-05" + "'", str24, "15218-01-05");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test21515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21515");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap7);
        boolean boolean9 = dateTimeZone5.equals((java.lang.Object) strMap7);
        boolean boolean11 = dateTimeZone5.isStandardOffset((long) (byte) -1);
        long long14 = dateTimeZone5.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str15 = dateTimeZone5.getID();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone5);
        int int17 = localDate16.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property19 = localDate16.property(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType18.getField(chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) chronology20, chronology22);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.minutes();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.weekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.Chronology chronology31 = chronology24.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField32 = durationFieldType1.getField(chronology24);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendTimeZoneShortName(strMap39);
        boolean boolean41 = dateTimeZone37.equals((java.lang.Object) strMap39);
        boolean boolean43 = dateTimeZone37.isStandardOffset((long) (byte) -1);
        long long46 = dateTimeZone37.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str47 = dateTimeZone37.getID();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone37);
        int int49 = localDate48.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property51 = localDate48.property(dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType50.getField(chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) chronology52, chronology54);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDate localDate59 = localDate55.withPeriodAdded(readablePeriod57, (int) '#');
        org.joda.time.LocalDate.Property property60 = localDate55.weekyear();
        org.joda.time.LocalDate localDate61 = property60.withMinimumValue();
        org.joda.time.Chronology chronology62 = localDate61.getChronology();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap68 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder67.appendTimeZoneShortName(strMap68);
        boolean boolean70 = dateTimeZone66.equals((java.lang.Object) strMap68);
        boolean boolean72 = dateTimeZone66.isStandardOffset((long) (byte) -1);
        long long75 = dateTimeZone66.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str76 = dateTimeZone66.getID();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone66);
        int int78 = localDate77.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property80 = localDate77.property(dateTimeFieldType79);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType79.getField(chronology81);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.LocalDate localDate84 = new org.joda.time.LocalDate((java.lang.Object) chronology81, chronology83);
        org.joda.time.Chronology chronology85 = localDate84.getChronology();
        org.joda.time.LocalDate localDate87 = localDate84.minusMonths(10);
        int int88 = localDate84.getDayOfMonth();
        int[] intArray90 = chronology62.get((org.joda.time.ReadablePartial) localDate84, 69210934L);
        org.joda.time.MutableDateTime mutableDateTime91 = org.joda.time.MutableDateTime.now(chronology62);
        org.joda.time.DateTimeField dateTimeField92 = chronology62.weekyear();
        org.joda.time.LocalDate localDate93 = new org.joda.time.LocalDate((long) 69222463, chronology62);
        org.joda.time.DurationField durationField94 = chronology62.halfdays();
        boolean boolean95 = durationFieldType1.isSupported(chronology62);
        org.joda.time.DateTimeField dateTimeField96 = chronology62.secondOfDay();
        org.joda.time.DateTimeField dateTimeField97 = chronology62.minuteOfHour();
        int int98 = dateTimeField97.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-360599990L) + "'", long14 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:10" + "'", str15, "+100:10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-360599990L) + "'", long46 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+100:10" + "'", str47, "+100:10");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1970 + "'", int49 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-360599990L) + "'", long75 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+100:10" + "'", str76, "+100:10");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1970 + "'", int78 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 25 + "'", int88 == 25);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(mutableDateTime91);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(durationField94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(dateTimeField96);
        org.junit.Assert.assertNotNull(dateTimeField97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test21516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21516");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(69207900);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) '4', dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfMonth();
        org.joda.time.DurationField durationField5 = property4.getRangeDurationField();
        org.joda.time.LocalDate localDate6 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.LocalDate localDate8 = property4.withMaximumValue();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property9.setCopy(63);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test21517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21517");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(69446182, 72718383, 69713197, 69473644, 69476581, 69619358, 69422094);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69473644 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21518");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfCentury((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withPeriodAdded(readablePeriod7, 38);
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addWrapFieldToCopy(69222509);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(69284779);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minusWeeks(69479959);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test21519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21519");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate21.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDate.Property property26 = localDate21.weekyear();
        int int27 = localDate21.getEra();
        int int28 = localDate21.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = localDate21.toString("1970-01-02T11:00:00.001+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 56 + "'", int28 == 56);
    }

    @Test
    public void test21520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21520");
        java.io.IOException iOException1 = new java.io.IOException("0100057T192101");
    }

    @Test
    public void test21521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21521");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.stream.Stream<java.lang.String> strStream8 = strList7.stream();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localTime16.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = strSet13.toArray(dateTimeFieldTypeArray17);
        boolean boolean19 = strList7.containsAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.Spliterator<java.lang.String> strSpliterator20 = strSet13.spliterator();
        boolean boolean22 = strSet13.equals((java.lang.Object) "lun.");
        java.util.Locale.Builder[][] builderArray23 = new java.util.Locale.Builder[][] {};
        java.util.Locale.Builder[][] builderArray24 = strSet13.toArray(builderArray23);
        strSet13.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builderArray23);
        org.junit.Assert.assertNotNull(builderArray24);
    }

    @Test
    public void test21522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21522");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendFractionOfDay(59, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList19);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap28 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendTimeZoneShortName(strMap28);
        boolean boolean30 = dateTimeZone26.equals((java.lang.Object) strMap28);
        boolean boolean32 = dateTimeZone26.isStandardOffset((long) (byte) -1);
        long long35 = dateTimeZone26.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str36 = dateTimeZone26.getID();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone26);
        int int38 = localDate37.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property40 = localDate37.property(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap46 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder45.appendTimeZoneShortName(strMap46);
        boolean boolean48 = dateTimeZone44.equals((java.lang.Object) strMap46);
        boolean boolean50 = dateTimeZone44.isStandardOffset((long) (byte) -1);
        long long53 = dateTimeZone44.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str54 = dateTimeZone44.getID();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone44);
        int int56 = localDate55.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property58 = localDate55.property(dateTimeFieldType57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType57.getField(chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) chronology59, chronology61);
        org.joda.time.Chronology chronology63 = localDate62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.minutes();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType39.getField(chronology63);
        java.util.Locale locale66 = java.util.Locale.JAPAN;
        java.lang.String str67 = locale66.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology63, locale66, (java.lang.Integer) 0, 54202800);
        boolean boolean71 = strList19.remove((java.lang.Object) chronology63);
        boolean boolean72 = dateTimeFieldType13.isSupported(chronology63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder11.appendSignedDecimal(dateTimeFieldType13, (int) '4', 69208701);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder76 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        boolean boolean77 = dateTimeFormatterBuilder11.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder11.appendMillisOfSecond(69210934);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder11.appendHourOfHalfday(69354462);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder86 = dateTimeFormatterBuilder11.appendTimeZoneOffset("9864-11-23T18:14:17.446+100:10", true, 69283984, 69264512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-360599990L) + "'", long35 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+100:10" + "'", str36, "+100:10");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-360599990L) + "'", long53 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+100:10" + "'", str54, "+100:10");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1970 + "'", int56 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
    }

    @Test
    public void test21523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21523");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addMonths((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime9.add(readableDuration14, 69274084);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar17);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test21524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21524");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        mutableDateTime2.setMillis((long) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str8 = mutableDateTime2.toString(dateTimeFormatter7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.minuteOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.dayOfYear();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.set("70");
        int int18 = mutableDateTime17.getYearOfEra();
        boolean boolean19 = mutableDateTime2.equals((java.lang.Object) int18);
        java.lang.Object obj20 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.monthOfYear();
        boolean boolean22 = mutableDateTime2.isBeforeNow();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime2.weekOfWeekyear();
        java.lang.Object obj25 = null;
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap32 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendTimeZoneShortName(strMap32);
        boolean boolean34 = dateTimeZone30.equals((java.lang.Object) strMap32);
        boolean boolean36 = dateTimeZone30.isStandardOffset((long) (byte) -1);
        long long39 = dateTimeZone30.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str40 = dateTimeZone30.getID();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone30);
        int int42 = localDate41.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property44 = localDate41.property(dateTimeFieldType43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType43.getField(chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) chronology45, chronology47);
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.minutes();
        boolean boolean51 = durationFieldType26.isSupported(chronology49);
        org.joda.time.DurationField durationField52 = chronology49.days();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj25, chronology49);
        org.joda.time.DateTimeField dateTimeField54 = chronology49.monthOfYear();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 69222509, chronology49);
        org.joda.time.DateTime.Property property56 = dateTime55.minuteOfDay();
        boolean boolean57 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) dateTime55);
        boolean boolean59 = dateTime55.isBefore(0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00" + "'", str8, "00");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "1970-01-05T04:10:00.001+100:10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "1970-01-05T04:10:00.001+100:10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "1970-01-05T04:10:00.001+100:10");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-360599990L) + "'", long39 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+100:10" + "'", str40, "+100:10");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test21525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21525");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime9 = localTime3.minusSeconds(10);
        org.joda.time.LocalTime localTime11 = localTime3.plusSeconds((int) (byte) 10);
        int int12 = localTime3.getHourOfDay();
        org.joda.time.LocalTime localTime14 = localTime3.withMillisOfDay(69250945);
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        long long16 = dateTime15.getMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1645455850945L + "'", long16 == 1645455850945L);
    }

    @Test
    public void test21526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21526");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.year();
        int int13 = mutableDateTime9.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.secondOfMinute();
        int int15 = mutableDateTime9.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime9.add(readablePeriod16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime9.add(readablePeriod18);
        mutableDateTime9.setMillis((long) 69402798);
        java.lang.String str22 = mutableDateTime9.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-05T23:26:42.798+100:10" + "'", str22, "1970-01-05T23:26:42.798+100:10");
    }

    @Test
    public void test21527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21527");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(69378213, 69659008);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 69659008");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21528");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        boolean boolean8 = dateTimeZone4.equals((java.lang.Object) strMap6);
        boolean boolean10 = dateTimeZone4.isStandardOffset((long) (byte) -1);
        long long13 = dateTimeZone4.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str14 = dateTimeZone4.getID();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone4);
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight17 = localDate15.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap23 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTimeZoneShortName(strMap23);
        boolean boolean25 = dateTimeZone21.equals((java.lang.Object) strMap23);
        boolean boolean27 = dateTimeZone21.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter18.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTime dateTime30 = localDate15.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime32 = dateTime30.minusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime30.withCenturyOfEra((int) (byte) 10);
        org.joda.time.DateTime.Property property35 = dateTime30.secondOfDay();
        org.joda.time.DateTime dateTime36 = dateTime30.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekyear(69206843);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        boolean boolean40 = dateTimeFormatter39.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter39.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter39.withPivotYear(43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter43.withPivotYear((-1324509));
        java.lang.String str46 = dateTime38.toString(dateTimeFormatter45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.parse("69221500-02-23T19:22:33.290", dateTimeFormatter45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"69221500-02-23T19:22:33.290\" is malformed at \"-23T19:22:33.290\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-360599990L) + "'", long13 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:10" + "'", str14, "+100:10");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeParser41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "69206843-005T19:23:18.580+100:10" + "'", str46, "69206843-005T19:23:18.580+100:10");
    }

    @Test
    public void test21529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21529");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendFractionOfDay(59, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTwoDigitWeekyear(365);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        boolean boolean22 = dateTimeZone18.equals((java.lang.Object) strMap20);
        boolean boolean24 = dateTimeZone18.isStandardOffset((long) (byte) -1);
        long long27 = dateTimeZone18.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str28 = dateTimeZone18.getID();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone18);
        int int30 = localDate29.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property32 = localDate29.property(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType31.getField(chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) chronology33, chronology35);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.months();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField41.getType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder12.appendText(dateTimeFieldType42);
        boolean boolean44 = dateTimeFormatterBuilder43.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-360599990L) + "'", long27 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+100:10" + "'", str28, "+100:10");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test21530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21530");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime9 = localTime3.minusSeconds(10);
        org.joda.time.LocalTime localTime11 = localTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(10);
        org.joda.time.LocalTime localTime15 = localTime11.plusMinutes((int) (short) -1);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.yearOfCentury();
        mutableDateTime19.setMillisOfDay((int) '#');
        int int23 = mutableDateTime19.getYearOfCentury();
        boolean boolean24 = localTime15.equals((java.lang.Object) int23);
        org.joda.time.LocalTime.Property property25 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.roundHalfFloorCopy();
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.LocalTime.Property property28 = localTime26.millisOfDay();
        org.joda.time.LocalTime.Property property29 = localTime26.secondOfMinute();
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale32 = java.util.Locale.getDefault(category31);
        java.util.Locale locale33 = java.util.Locale.getDefault(category31);
        java.util.Locale locale34 = java.util.Locale.getDefault(category31);
        java.util.Locale locale35 = java.util.Locale.getDefault(category31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = property29.setCopy("DEU", locale35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DEU\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70 + "'", int23 == 70);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.FORMAT + "'", category31.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
    }

    @Test
    public void test21531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21531");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap7);
        boolean boolean9 = dateTimeZone5.equals((java.lang.Object) strMap7);
        boolean boolean11 = dateTimeZone5.isStandardOffset((long) (byte) -1);
        long long14 = dateTimeZone5.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str15 = dateTimeZone5.getID();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone5);
        int int17 = localDate16.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property19 = localDate16.property(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType18.getField(chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) chronology20, chronology22);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.minutes();
        org.joda.time.Chronology chronology26 = chronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology24.halfdays();
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.lang.String str32 = locale29.getDisplayCountry(locale31);
        java.util.Set<java.lang.Character> charSet33 = locale31.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 69308059, chronology24, locale31, (java.lang.Integer) 48);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 69764918, chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-360599990L) + "'", long14 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:10" + "'", str15, "+100:10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertEquals(locale31.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charSet33);
    }

    @Test
    public void test21532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21532");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = nameProvider0.getName(locale1, "1", "fr");
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("fra");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str12 = nameProvider0.getName(locale9, "2022-02-25T19:13:54.707+100:10", "+100:10");
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale9.getUnicodeLocaleType("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1970001T??????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21533");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinute();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((java.lang.Integer) 69209217);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone5);
        mutableDateTime6.setTime((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap14);
        boolean boolean16 = dateTimeZone12.equals((java.lang.Object) strMap14);
        boolean boolean18 = dateTimeZone12.isStandardOffset((long) (byte) -1);
        long long21 = dateTimeZone12.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str22 = dateTimeZone12.getID();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone12);
        int int24 = localDate23.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property26 = localDate23.property(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType25.getField(chronology27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        int int30 = dateTimeField28.getMaximumShortTextLength(locale29);
        mutableDateTime6.setRounding(dateTimeField28);
        int int32 = dateTimeField28.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendTimeZoneShortName(strMap39);
        boolean boolean41 = dateTimeZone37.equals((java.lang.Object) strMap39);
        boolean boolean43 = dateTimeZone37.isStandardOffset((long) (byte) -1);
        long long46 = dateTimeZone37.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str47 = dateTimeZone37.getID();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone37);
        int int49 = localDate48.getYearOfEra();
        org.joda.time.LocalDate localDate51 = localDate48.withYearOfCentury(70);
        int int52 = localDate51.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property53 = localDate51.centuryOfEra();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.lang.String str55 = property53.getAsText(locale54);
        java.lang.String str56 = dateTimeField28.getAsShortText((long) (-292275055), locale54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter3.withLocale(locale54);
        boolean boolean58 = dateTimeFormatter57.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter57.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-360599990L) + "'", long21 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+100:10" + "'", str22, "+100:10");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-360599990L) + "'", long46 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+100:10" + "'", str47, "+100:10");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1970 + "'", int49 == 1970);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "19" + "'", str55, "19");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u516c\u5143" + "'", str56, "\u516c\u5143");
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
    }

    @Test
    public void test21534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21534");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = localDate14.minusYears(69206920);
        int int20 = localDate19.getDayOfYear();
        org.joda.time.LocalDate.Property property21 = localDate19.year();
        org.joda.time.LocalDate localDate23 = property21.addWrapFieldToCopy(69258822);
        org.joda.time.LocalDate localDate25 = localDate23.plusYears(69269079);
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate25.minus(readablePeriod27);
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra(69300104);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test21535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21535");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 69203825, chronology1, locale3, (java.lang.Integer) 54202800);
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = nameProvider6.getName(locale7, "1", "fr");
        java.lang.String str11 = locale3.getDisplayScript(locale7);
        java.lang.String str12 = locale7.getDisplayCountry();
        java.lang.String str13 = locale7.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHN" + "'", str13, "CHN");
    }

    @Test
    public void test21536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21536");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.minuteOfDay();
        int int5 = mutableDateTime2.getYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.Chronology chronology7 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.set(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 05 04:10:00 GMT+:0:10 1970");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test21537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21537");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.year();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add(69207366);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.year();
        mutableDateTime16.setWeekyear(6);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        int int22 = mutableDateTime16.getDayOfWeek();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test21538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21538");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder4.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendWeekyear(69273854, 69522035);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendDayOfMonth(53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test21539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21539");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.minutes();
        java.lang.String str24 = chronology22.toString();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology22);
        java.util.Date date27 = mutableDateTime26.toDate();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.centuryOfEra();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 69241950);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneShortName(strMap37);
        boolean boolean39 = dateTimeZone35.equals((java.lang.Object) strMap37);
        boolean boolean41 = dateTimeZone35.isStandardOffset((long) (byte) -1);
        long long44 = dateTimeZone35.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str45 = dateTimeZone35.getID();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone35);
        int int47 = localDate46.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property49 = localDate46.property(dateTimeFieldType48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType48.getField(chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) chronology50, chronology52);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate57 = localDate53.withPeriodAdded(readablePeriod55, (int) '#');
        org.joda.time.LocalDate.Property property58 = localDate53.weekyear();
        org.joda.time.Chronology chronology59 = localDate53.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.Chronology chronology61 = chronology59.withZone(dateTimeZone60);
        boolean boolean62 = durationFieldType31.isSupported(chronology59);
        java.lang.String str63 = durationFieldType31.getName();
        boolean boolean64 = localDate30.isSupported(durationFieldType31);
        mutableDateTime26.add(durationFieldType31, 4518918);
        java.lang.String str67 = durationFieldType31.toString();
        java.lang.String str68 = durationFieldType31.getName();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[UTC]" + "'", str24, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Feb 25 19:23:18 GMT+:0:10 2022");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-360599990L) + "'", long44 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+100:10" + "'", str45, "+100:10");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "days" + "'", str63, "days");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "days" + "'", str67, "days");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "days" + "'", str68, "days");
    }

    @Test
    public void test21540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21540");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours(69205127);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        org.joda.time.DateTime dateTime34 = property32.addToCopy((long) 69206325);
        org.joda.time.DateTime.Property property35 = dateTime34.year();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime38 = dateTime34.plusWeeks(69210165);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfSecond();
        org.joda.time.DateTime dateTime41 = dateTime38.plusYears(69221646);
        org.joda.time.DateTime.Property property42 = dateTime41.weekyear();
        org.joda.time.DateTime.Property property43 = dateTime41.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test21541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 5, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.joda.time.DateTime dateTime6 = property3.addToCopy(69246442);
        org.joda.time.DateTime dateTime8 = dateTime6.minusHours(69283984);
        org.joda.time.DateTime.Property property9 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property9.getDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test21542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21542");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        int int21 = dateTimeField19.getMaximumShortTextLength(locale20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField19.getType();
        int int24 = dateTimeField19.get((long) (-2022));
        long long26 = dateTimeField19.roundHalfCeiling((long) (short) 100);
        boolean boolean27 = dateTimeField19.isLenient();
        boolean boolean29 = dateTimeField19.isLeap((-360599999L));
        long long31 = dateTimeField19.roundCeiling((long) 69694980);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-62135957400000L) + "'", long26 == (-62135957400000L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036494175807L + "'", long31 == 9223372036494175807L);
    }

    @Test
    public void test21543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21543");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        mutableDateTime7.addDays((int) (short) -1);
        int int11 = mutableDateTime7.getYear();
        boolean boolean12 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime2.setMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime2.add(readablePeriod15);
        mutableDateTime2.setDayOfMonth(2);
        long long19 = mutableDateTime2.getMillis();
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.setMillis((long) 69313247);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap30);
        boolean boolean32 = dateTimeZone28.equals((java.lang.Object) strMap30);
        boolean boolean34 = dateTimeZone28.isStandardOffset((long) (byte) -1);
        long long37 = dateTimeZone28.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str38 = dateTimeZone28.getID();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone28);
        int int40 = localDate39.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property42 = localDate39.property(dateTimeFieldType41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap48 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendTimeZoneShortName(strMap48);
        boolean boolean50 = dateTimeZone46.equals((java.lang.Object) strMap48);
        boolean boolean52 = dateTimeZone46.isStandardOffset((long) (byte) -1);
        long long55 = dateTimeZone46.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str56 = dateTimeZone46.getID();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone46);
        int int58 = localDate57.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property60 = localDate57.property(dateTimeFieldType59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType59.getField(chronology61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((java.lang.Object) chronology61, chronology63);
        org.joda.time.Chronology chronology65 = localDate64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.minutes();
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType41.getField(chronology65);
        java.util.Locale locale68 = java.util.Locale.JAPAN;
        java.lang.String str69 = locale68.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology65, locale68, (java.lang.Integer) 0, 54202800);
        org.joda.time.DateTimeZone dateTimeZone73 = chronology65.getZone();
        org.joda.time.DurationField durationField74 = chronology65.days();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) 69213798, chronology65);
        mutableDateTime2.setChronology(chronology65);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-187800900L) + "'", long19 == (-187800900L));
        org.junit.Assert.assertNotNull(gregorianCalendar20);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-360599990L) + "'", long37 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:10" + "'", str38, "+100:10");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-360599990L) + "'", long55 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+100:10" + "'", str56, "+100:10");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(durationField74);
    }

    @Test
    public void test21544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21544");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate4 = localDate0.plusWeeks(57770);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.monthOfYear();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getISO3Language();
        int int11 = property8.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property8.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime14 = property8.add((long) '#');
        mutableDateTime14.addYears(69210165);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        mutableDateTime14.add(durationFieldType18, 365);
        boolean boolean21 = localDate0.equals((java.lang.Object) mutableDateTime14);
        org.joda.time.DateTime dateTime22 = mutableDateTime14.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        int int24 = dateTime23.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 339 + "'", int24 == 339);
    }

    @Test
    public void test21545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21545");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.minuteOfDay();
        mutableDateTime2.addSeconds(69243332);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfYear(69287068);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69287068 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test21546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21546");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("-2000-02-25T19:16:49.420");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test21547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21547");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology3);
        java.lang.String str5 = dateTimeFormatter1.print((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property6 = localTime4.millisOfDay();
        org.joda.time.LocalTime localTime8 = localTime4.plusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime10 = localTime4.minusSeconds(10);
        java.lang.String str11 = localTime10.toString();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime14 = localTime10.withFieldAdded(durationFieldType12, 25);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean16 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime18 = localTime14.minusSeconds(23);
        java.lang.String str19 = localTime14.toString();
        org.joda.time.Chronology chronology20 = localTime14.getChronology();
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str22 = locale21.getDisplayScript();
        java.util.Locale locale24 = new java.util.Locale("hi!");
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale24.getISO3Language();
        boolean boolean28 = locale24.hasExtensions();
        java.util.Locale locale29 = locale24.stripExtensions();
        java.lang.String str30 = locale21.getDisplayLanguage(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(71400000L, chronology20, locale24, (java.lang.Integer) 65831, 69407203);
        org.joda.time.DateTimeField dateTimeField34 = chronology20.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23:59:50.010" + "'", str11, "23:59:50.010");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "00:59:50.010" + "'", str19, "00:59:50.010");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test21548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21548");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(10L);
        org.joda.time.LocalDate localDate3 = localDate1.withYear(69208090);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(19);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 0);
        mutableDateTime8.add((long) 69210179);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.monthOfYear();
        int int18 = mutableDateTime16.getWeekOfWeekyear();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = mutableDateTime16.toString("+100:10", locale20);
        mutableDateTime16.addSeconds(4);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime16.toMutableDateTimeISO();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime16.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField(69253158);
        org.joda.time.DateTime dateTime30 = localDate3.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap36 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendTimeZoneShortName(strMap36);
        boolean boolean38 = dateTimeZone34.equals((java.lang.Object) strMap36);
        boolean boolean40 = dateTimeZone34.isStandardOffset((long) (byte) -1);
        long long43 = dateTimeZone34.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str44 = dateTimeZone34.getID();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone34);
        int int46 = localDate45.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property48 = localDate45.property(dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType47.getField(chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) chronology49, chronology51);
        org.joda.time.Interval interval53 = localDate52.toInterval();
        org.joda.time.LocalDate localDate55 = localDate52.withDayOfYear(94);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap60 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder59.appendTimeZoneShortName(strMap60);
        boolean boolean62 = dateTimeZone58.equals((java.lang.Object) strMap60);
        boolean boolean64 = dateTimeZone58.isStandardOffset((long) (byte) -1);
        java.lang.String str66 = dateTimeZone58.getShortName((long) 69203825);
        org.joda.time.DateTime dateTime67 = localDate52.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime30.toMutableDateTime(dateTimeZone58);
        int int70 = dateTime30.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime30.toMutableDateTime();
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.DateTime dateTime73 = dateTime30.minus(readablePeriod72);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:10" + "'", str21, "+100:10");
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-360599990L) + "'", long43 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+100:10" + "'", str44, "+100:10");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1970 + "'", int46 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+100:10" + "'", str66, "+100:10");
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test21549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21549");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime9 = property5.addCopy((long) 10);
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(69237180);
        org.joda.time.DateTime.Property property13 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy(74);
        int int16 = property13.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField17 = property13.getField();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneShortName(strMap24);
        boolean boolean26 = dateTimeZone22.equals((java.lang.Object) strMap24);
        boolean boolean28 = dateTimeZone22.isStandardOffset((long) (byte) -1);
        long long31 = dateTimeZone22.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str32 = dateTimeZone22.getID();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone22);
        int int34 = localDate33.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property36 = localDate33.property(dateTimeFieldType35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType35.getField(chronology37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) chronology37, chronology39);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.minutes();
        org.joda.time.Chronology chronology43 = chronology41.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.era();
        java.util.Locale locale47 = new java.util.Locale("5777058235T181451+10010", "2022-02-25T19:14:27.970+100:10");
        int int48 = dateTimeField44.getMaximumShortTextLength(locale47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime49 = property13.setCopy("eng", locale47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eng\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-360599990L) + "'", long31 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+100:10" + "'", str32, "+100:10");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals(locale47.toString(), "5777058235t181451+10010_2022-02-25T19:14:27.970+100:10");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test21550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21550");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = mutableDateTime2.getMillis();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime2.add(readableDuration5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneShortName(strMap12);
        boolean boolean14 = dateTimeZone10.equals((java.lang.Object) strMap12);
        boolean boolean16 = dateTimeZone10.isStandardOffset((long) (byte) -1);
        long long19 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str20 = dateTimeZone10.getID();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int24 = mutableDateTime2.get(dateTimeFieldType23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 5, chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readableDuration28);
        org.joda.time.DateTime dateTime31 = dateTime27.minusHours((-2022));
        org.joda.time.DateTime.Property property32 = dateTime31.centuryOfEra();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property34 = dateTime31.hourOfDay();
        org.joda.time.DateTime dateTime35 = dateTime31.withLaterOffsetAtOverlap();
        int int36 = dateTime31.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.monthOfYear();
        mutableDateTime42.setMillis((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.year();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.secondOfMinute();
        int int51 = property50.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime53 = property50.addWrapField(69206843);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.hourOfDay();
        org.joda.time.DurationField durationField55 = property54.getRangeDurationField();
        org.joda.time.DurationField durationField56 = property54.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime58 = property54.add((long) 69332078);
        boolean boolean59 = dateTime31.isBefore((org.joda.time.ReadableInstant) mutableDateTime58);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360599990L) + "'", long19 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:10" + "'", str20, "+100:10");
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 30 + "'", int36 == 30);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test21551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21551");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours(69205127);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        org.joda.time.DateTime dateTime34 = property32.addToCopy((long) 69206325);
        org.joda.time.DateMidnight dateMidnight35 = dateTime34.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.add((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime43 = property39.set("00");
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight35, dateTimeZone44);
        int int46 = localDate45.getCenturyOfEra();
        org.joda.time.LocalDate localDate48 = localDate45.minusMonths(69255088);
        org.joda.time.LocalDate.Property property49 = localDate45.year();
        org.joda.time.LocalDate localDate51 = localDate45.plusDays(69230144);
        org.joda.time.LocalDate localDate53 = localDate51.minusWeeks(69338243);
        org.joda.time.LocalDate.Property property54 = localDate51.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 57770 + "'", int46 == 57770);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test21552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21552");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfCentury((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withDurationAdded(readableDuration5, 1969);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.plusHours(7);
        int int10 = localDateTime0.getMinuteOfHour();
        org.joda.time.DateTime dateTime11 = localDateTime0.toDateTime();
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test21553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21553");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.minutes();
        java.lang.String str24 = chronology22.toString();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField26 = chronology22.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.millisOfSecond();
        boolean boolean28 = dateTimeField27.isSupported();
        long long31 = dateTimeField27.addWrapField((long) 69256363, 69270501);
        boolean boolean32 = dateTimeField27.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[UTC]" + "'", str24, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 69256864L + "'", long31 == 69256864L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test21554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21554");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone2);
        mutableDateTime3.setTime((long) (short) -1);
        org.joda.time.Chronology chronology6 = mutableDateTime3.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 69206325, chronology6);
        int int8 = localDate7.getEra();
        org.joda.time.Chronology chronology9 = localDate7.getChronology();
        org.joda.time.LocalDate localDate11 = localDate7.withYearOfEra(69383448);
        int int12 = localDate11.getYear();
        org.joda.time.Chronology chronology13 = localDate11.getChronology();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 69383448 + "'", int12 == 69383448);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test21555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21555");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT195000");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTwoDigitYear((-2000), true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder7.appendTimeZoneOffset("minutes", false, 69583187, 54296);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test21556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21556");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology3);
        java.lang.String str5 = dateTimeFormatter1.print((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property6 = localTime4.millisOfDay();
        org.joda.time.LocalTime localTime8 = property6.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime9 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime11 = localTime9.plusHours(69221560);
        org.joda.time.Chronology chronology12 = localTime9.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 21, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.setWeekyear(69240858);
        mutableDateTime15.addSeconds(69308018);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime15.toMutableDateTimeISO();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology23);
        java.lang.String str25 = dateTimeFormatter21.print((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.Chronology chronology26 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.millisOfSecond();
        mutableDateTime15.setChronology(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setHourOfDay(69615860);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69615860 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str25, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test21557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21557");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.minutes();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.weekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.Chronology chronology29 = chronology22.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = chronology22.millisOfDay();
        int int33 = dateTimeField31.get((long) 69306803);
        org.joda.time.DurationField durationField34 = dateTimeField31.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 69306803 + "'", int33 == 69306803);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test21558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21558");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate21.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDate.Property property26 = localDate21.weekyear();
        int int27 = property26.getLeapAmount();
        org.joda.time.LocalDate localDate28 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate30 = property26.addToCopy(69222520);
        org.joda.time.LocalDate.Property property31 = localDate30.weekOfWeekyear();
        org.joda.time.LocalDate.Property property32 = localDate30.dayOfMonth();
        org.joda.time.LocalDate localDate33 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate35 = localDate33.minusYears((int) (short) 100);
        int int36 = localDate33.getYearOfCentury();
        org.joda.time.LocalDate localDate38 = localDate33.minusWeeks(69412205);
        org.joda.time.DateMidnight dateMidnight39 = localDate33.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 42 + "'", int36 == 42);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateMidnight39);
    }

    @Test
    public void test21559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21559");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.year();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.addWrapField(0);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 69203825, chronology17, locale19, (java.lang.Integer) 54202800);
        java.util.Locale locale22 = dateTimeParserBucket21.getLocale();
        java.util.Locale locale23 = dateTimeParserBucket21.getLocale();
        dateTimeParserBucket21.setPivotYear((java.lang.Integer) 69221500);
        java.lang.Object obj26 = dateTimeParserBucket21.saveState();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket21.getZone();
        mutableDateTime15.setZone(dateTimeZone27);
        java.lang.String str29 = dateTimeZone27.getID();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+100:10" + "'", str29, "+100:10");
    }

    @Test
    public void test21560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21560");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMinutes((int) (short) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundFloorCopy();
        int int8 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(69226456);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("-2000-02-25T19:13:37.408");
        java.lang.String str14 = property9.getAsText(locale13);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale18 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 69203825, chronology16, locale18, (java.lang.Integer) 54202800);
        java.lang.String str21 = property9.getAsShortText(locale18);
        org.joda.time.LocalDateTime localDateTime22 = property9.withMinimumValue();
        int int23 = localDateTime22.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfEra(69246442);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withPeriodAdded(readablePeriod26, 69478355);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.withYear(69430577);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime22.minusMillis(69230413);
        int int33 = localDateTime32.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69799058 + "'", int1 == 69799058);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test21561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21561");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate14.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfEra();
        org.joda.time.LocalDate localDate20 = localDate17.minusMonths(69287180);
        org.joda.time.Interval interval21 = localDate20.toInterval();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(interval21);
    }

    @Test
    public void test21562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21562");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 69243332);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(69222520);
        org.joda.time.LocalTime.Property property4 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime6 = property4.addCopy(65722);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test21563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21563");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.centuryOfEra();
        int int20 = dateTimeField19.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendTimeZoneShortName(strMap26);
        boolean boolean28 = dateTimeZone24.equals((java.lang.Object) strMap26);
        boolean boolean30 = dateTimeZone24.isStandardOffset((long) (byte) -1);
        long long33 = dateTimeZone24.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str34 = dateTimeZone24.getID();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone24);
        int int36 = localDate35.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property38 = localDate35.property(dateTimeFieldType37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType37.getField(chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) chronology39, chronology41);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate46 = localDate42.withPeriodAdded(readablePeriod44, (int) '#');
        org.joda.time.LocalDate.Property property47 = localDate42.monthOfYear();
        org.joda.time.LocalDate localDate49 = property47.addToCopy(69210404);
        int int50 = property47.getMaximumValue();
        org.joda.time.LocalDate localDate51 = property47.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap58 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendTimeZoneShortName(strMap58);
        boolean boolean60 = dateTimeZone56.equals((java.lang.Object) strMap58);
        boolean boolean62 = dateTimeZone56.isStandardOffset((long) (byte) -1);
        long long65 = dateTimeZone56.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str66 = dateTimeZone56.getID();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone56);
        int int68 = localDate67.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property70 = localDate67.property(dateTimeFieldType69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType69.getField(chronology71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((java.lang.Object) chronology71, chronology73);
        org.joda.time.Chronology chronology75 = localDate74.getChronology();
        org.joda.time.DurationField durationField76 = chronology75.minutes();
        org.joda.time.DateTimeField dateTimeField77 = chronology75.weekyear();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone80);
        org.joda.time.Chronology chronology82 = chronology75.withZone(dateTimeZone80);
        org.joda.time.MutableDateTime mutableDateTime83 = org.joda.time.MutableDateTime.now(chronology82);
        java.util.Locale locale84 = java.util.Locale.GERMAN;
        java.util.Locale locale86 = new java.util.Locale("hi!");
        java.lang.String str87 = locale84.getDisplayCountry(locale86);
        java.lang.String str88 = locale84.getCountry();
        java.util.Calendar calendar89 = mutableDateTime83.toCalendar(locale84);
        java.lang.String str90 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) localDate51, 69337598, locale84);
        java.lang.String str91 = locale84.getScript();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-360599990L) + "'", long33 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+100:10" + "'", str34, "+100:10");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 12 + "'", int50 == 12);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-360599990L) + "'", long65 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+100:10" + "'", str66, "+100:10");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1970 + "'", int68 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "de");
        org.junit.Assert.assertEquals(locale86.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(calendar89);
// flaky:         org.junit.Assert.assertEquals(calendar89.toString(), "java.util.GregorianCalendar[time=1645456399086,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:10,offset=360600000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=56,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=23,SECOND=19,MILLISECOND=86,ZONE_OFFSET=360600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "69337598" + "'", str90, "69337598");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test21564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21564");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDayOfMonth((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears(1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusSeconds((-32));
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusDays(69348249);
        java.util.Date date12 = localDateTime6.toDate();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Feb 01 19:23:19 GMT+:0:10 2023");
    }

    @Test
    public void test21565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21565");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime9 = localTime3.minusSeconds(10);
        org.joda.time.LocalTime localTime11 = localTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(10);
        org.joda.time.LocalTime localTime15 = localTime13.withSecondOfMinute(22);
        org.joda.time.LocalTime.Property property16 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime18 = property16.addWrapFieldToCopy(69287258);
        org.joda.time.LocalTime localTime20 = property16.addCopy(69245210);
        int int21 = localTime20.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test21566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21566");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.yearOfCentury();
        org.joda.time.DurationField durationField36 = property35.getDurationField();
        org.joda.time.DateTimeField dateTimeField37 = property35.getField();
        boolean boolean38 = dateTimeField37.isLenient();
        int int39 = dateTime29.get(dateTimeField37);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap45 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendTimeZoneShortName(strMap45);
        boolean boolean47 = dateTimeZone43.equals((java.lang.Object) strMap45);
        boolean boolean49 = dateTimeZone43.isStandardOffset((long) (byte) -1);
        long long52 = dateTimeZone43.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str53 = dateTimeZone43.getID();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone43);
        int int55 = localDate54.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property57 = localDate54.property(dateTimeFieldType56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType56.getField(chronology58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((java.lang.Object) chronology58, chronology60);
        org.joda.time.Chronology chronology62 = localDate61.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.months();
        org.joda.time.DateTimeField dateTimeField64 = chronology62.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = chronology62.weekOfWeekyear();
        int int67 = dateTime29.get(dateTimeField66);
        org.joda.time.DateTime dateTime69 = dateTime29.plusSeconds(69272825);
        java.util.GregorianCalendar gregorianCalendar70 = dateTime69.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-360599990L) + "'", long52 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+100:10" + "'", str53, "+100:10");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1970 + "'", int55 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(gregorianCalendar70);
    }

    @Test
    public void test21567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21567");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime9 = localTime3.minusSeconds(10);
        org.joda.time.LocalTime localTime11 = localTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(10);
        org.joda.time.LocalTime localTime15 = localTime11.plusMinutes((int) (short) -1);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale19.getDisplayVariant();
        java.lang.String str22 = locale19.getCountry();
        org.joda.time.LocalTime localTime23 = property16.setCopy("1", locale19);
        org.joda.time.LocalTime.Property property24 = localTime23.hourOfDay();
        org.joda.time.DurationField durationField25 = property24.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNull(durationField25);
    }

    @Test
    public void test21568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21568");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfCentury((int) (short) 0);
        int int5 = localDateTime0.getYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.minusWeeks(69206325);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatterBuilder8.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendTwoDigitYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFractionOfHour(100, 5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder19.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendSecondOfMinute((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder22.appendSignedDecimal(dateTimeFieldType23, (int) (byte) 10, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder8.appendText(dateTimeFieldType23);
        int int28 = localDateTime0.get(dateTimeFieldType23);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean30 = localDateTime0.isSupported(dateTimeFieldType29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime0.minuteOfHour();
        java.lang.String str32 = property31.getAsText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 56 + "'", int28 == 56);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "23" + "'", str32, "23");
    }

    @Test
    public void test21569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21569");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.addDays((int) (short) -1);
        int int6 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap15);
        boolean boolean17 = dateTimeZone13.equals((java.lang.Object) strMap15);
        boolean boolean19 = dateTimeZone13.isStandardOffset((long) (byte) -1);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str23 = dateTimeZone13.getID();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone13);
        int int25 = localDate24.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property27 = localDate24.property(dateTimeFieldType26);
        org.joda.time.LocalDate.Property property28 = localDate24.year();
        org.joda.time.LocalDate localDate29 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendTimeZoneShortName(strMap35);
        boolean boolean37 = dateTimeZone33.equals((java.lang.Object) strMap35);
        boolean boolean39 = dateTimeZone33.isStandardOffset((long) (byte) -1);
        long long42 = dateTimeZone33.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str43 = dateTimeZone33.getID();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone33);
        org.joda.time.LocalDate.Property property45 = localDate44.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight46 = localDate44.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendTimeZoneShortName(strMap52);
        boolean boolean54 = dateTimeZone50.equals((java.lang.Object) strMap52);
        boolean boolean56 = dateTimeZone50.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter47.withZone(dateTimeZone50);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        org.joda.time.DateTime dateTime59 = localDate44.toDateTimeAtCurrentTime(dateTimeZone50);
        long long63 = dateTimeZone50.convertLocalToUTC((long) 65641, false, (long) 69213992);
        org.joda.time.DateTime dateTime64 = localDate29.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withDurationAdded(readableDuration65, 69258111);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) dateTime64);
        java.lang.Object obj69 = mutableDateTime2.clone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-360599990L) + "'", long22 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+100:10" + "'", str23, "+100:10");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-360599990L) + "'", long42 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+100:10" + "'", str43, "+100:10");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-360534359L) + "'", long63 == (-360534359L));
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "1970-01-04T00:00:00.000+100:10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "1970-01-04T00:00:00.000+100:10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "1970-01-04T00:00:00.000+100:10");
    }

    @Test
    public void test21570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21570");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 69203825, chronology2, locale4, (java.lang.Integer) 54202800);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneShortName(strMap12);
        boolean boolean14 = dateTimeZone10.equals((java.lang.Object) strMap12);
        boolean boolean16 = dateTimeZone10.isStandardOffset((long) (byte) -1);
        long long19 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str20 = dateTimeZone10.getID();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone10);
        org.joda.time.LocalDate.Property property22 = localDate21.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight23 = localDate21.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendTimeZoneShortName(strMap29);
        boolean boolean31 = dateTimeZone27.equals((java.lang.Object) strMap29);
        boolean boolean33 = dateTimeZone27.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter24.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.DateTime dateTime36 = localDate21.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.withDurationAdded(readableDuration37, (int) (byte) 10);
        org.joda.time.DateTime dateTime40 = dateTime36.withTimeAtStartOfDay();
        boolean boolean41 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTime36);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 69239408, chronology42);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360599990L) + "'", long19 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:10" + "'", str20, "+100:10");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test21571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21571");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("1970-01-01", throwable2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("9864-328T18:13:43.196+100:10", (java.lang.Throwable) iOException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test21572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21572");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder3 = builder2.clear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTimeZoneShortName(strMap9);
        boolean boolean11 = dateTimeZone7.equals((java.lang.Object) strMap9);
        boolean boolean13 = dateTimeZone7.isStandardOffset((long) (byte) -1);
        long long16 = dateTimeZone7.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str17 = dateTimeZone7.getID();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone7);
        int int19 = localDate18.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property21 = localDate18.property(dateTimeFieldType20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType20.getField(chronology22);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        int int25 = dateTimeField23.getMaximumShortTextLength(locale24);
        boolean boolean26 = locale24.hasExtensions();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder3.setLocale(locale24);
        java.util.Locale locale32 = new java.util.Locale("GMT+19:13", "04:10:00.001+100:10", "2022-02-21T15:03:44.751Z");
        java.lang.String str33 = locale32.getVariant();
        java.util.Locale locale34 = locale32.stripExtensions();
        java.lang.String str35 = locale24.getDisplayScript(locale34);
        java.lang.String str36 = locale34.getDisplayName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-360599990L) + "'", long16 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:10" + "'", str17, "+100:10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "France" + "'", str27, "France");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals(locale32.toString(), "gmt+19:13_04:10:00.001+100:10_2022-02-21T15:03:44.751Z");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022-02-21T15:03:44.751Z" + "'", str33, "2022-02-21T15:03:44.751Z");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "gmt+19:13_04:10:00.001+100:10_2022-02-21T15:03:44.751Z");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "gmt+19:13 (04:10:00.001+100:10,2022-02-21T15:03:44.751Z)" + "'", str36, "gmt+19:13 (04:10:00.001+100:10,2022-02-21T15:03:44.751Z)");
    }

    @Test
    public void test21573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 5, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusHours((-2022));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime2.plus(readableDuration7);
        boolean boolean9 = dateTime8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime8.getZone();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap17);
        boolean boolean19 = dateTimeZone15.equals((java.lang.Object) strMap17);
        boolean boolean21 = dateTimeZone15.isStandardOffset((long) (byte) -1);
        long long24 = dateTimeZone15.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str25 = dateTimeZone15.getID();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone15);
        org.joda.time.LocalDate.Property property27 = localDate26.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight28 = localDate26.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap34 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder33.appendTimeZoneShortName(strMap34);
        boolean boolean36 = dateTimeZone32.equals((java.lang.Object) strMap34);
        boolean boolean38 = dateTimeZone32.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter29.withZone(dateTimeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.DateTime dateTime41 = localDate26.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.DateTime dateTime43 = dateTime41.minusSeconds((int) (short) 100);
        org.joda.time.DateTime.Property property44 = dateTime43.dayOfMonth();
        org.joda.time.DateTime dateTime45 = property44.roundCeilingCopy();
        org.joda.time.DateTime dateTime46 = property44.getDateTime();
        org.joda.time.DateTime dateTime48 = dateTime46.withYear(69207073);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.monthOfYear();
        int int53 = mutableDateTime51.getWeekOfWeekyear();
        mutableDateTime51.add((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean57 = mutableDateTime51.isSupported(dateTimeFieldType56);
        org.joda.time.DateTime dateTime59 = dateTime46.withField(dateTimeFieldType56, 38);
        boolean boolean60 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime62 = dateTime11.minusYears(69580);
        long long63 = dateTime11.getMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-360599990L) + "'", long24 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:10" + "'", str25, "+100:10");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTime62);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1645456399230L + "'", long63 == 1645456399230L);
    }

    @Test
    public void test21574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21574");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.withDurationAdded(readableDuration30, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime29.withDurationAdded(readableDuration33, 69207019);
        org.joda.time.DateTime.Property property36 = dateTime35.era();
        org.joda.time.DateTime dateTime37 = property36.getDateTime();
        org.joda.time.DateTime dateTime38 = property36.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test21575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21575");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withWeekyear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = property6.setCopy("1");
        int int9 = localDateTime8.size();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime8.weekOfWeekyear();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime15 = property13.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69799269 + "'", int1 == 69799269);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test21576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21576");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: hi!", "9864-328T18:19:18.410+100:10");
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: hi!_9864-328T18:19:18.410+100:10");
    }

    @Test
    public void test21577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21577");
        java.io.IOException iOException1 = new java.io.IOException("69206981");
    }

    @Test
    public void test21578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 5, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusHours((-2022));
        org.joda.time.DateTime.Property property7 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(69222959);
        org.joda.time.DateTime dateTime11 = property7.roundHalfEvenCopy();
        long long12 = dateTime11.getMillis();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 946324200000L + "'", long12 == 946324200000L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test21579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21579");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.property(dateTimeFieldType2);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMonths(54202757);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusWeeks(69233410);
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.year();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime13 = property9.setCopy((-69261392));
        org.joda.time.LocalDateTime localDateTime14 = property9.roundCeilingCopy();
        int int15 = property9.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property9.addWrapFieldToCopy(1154);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks(138443434);
        org.joda.time.Chronology chronology20 = localDateTime17.getChronology();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69799297 + "'", int1 == 69799297);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test21580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21580");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfCentury();
        mutableDateTime4.setMillisOfDay((int) '#');
        int int10 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "1", (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime4.toMutableDateTime();
        int int14 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", 4);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        boolean boolean22 = dateTimeZone18.equals((java.lang.Object) strMap20);
        boolean boolean24 = dateTimeZone18.isStandardOffset((long) (byte) -1);
        long long27 = dateTimeZone18.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str28 = dateTimeZone18.getID();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone18);
        int int30 = localDate29.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property32 = localDate29.property(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType31.getField(chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) chronology33, chronology35);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate40 = localDate36.withPeriodAdded(readablePeriod38, (int) '#');
        org.joda.time.LocalDate.Property property41 = localDate36.weekyear();
        org.joda.time.LocalDate localDate42 = property41.withMinimumValue();
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter0.withChronology(chronology43);
        java.lang.Integer int45 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.yearOfCentury();
        mutableDateTime48.addDays((int) (short) -1);
        int int52 = mutableDateTime48.getYear();
        java.lang.String str53 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.yearOfCentury();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime60.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap68 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder67.appendTimeZoneShortName(strMap68);
        boolean boolean70 = dateTimeZone66.equals((java.lang.Object) strMap68);
        boolean boolean72 = dateTimeZone66.isStandardOffset((long) (byte) -1);
        long long75 = dateTimeZone66.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str76 = dateTimeZone66.getID();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone66);
        int int78 = localDate77.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property80 = localDate77.property(dateTimeFieldType79);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType79.getField(chronology81);
        int int83 = dateTimeField82.getMinimumValue();
        mutableDateTime60.setRounding(dateTimeField82);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime60.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter86.withOffsetParsed();
        java.util.Locale locale88 = java.util.Locale.JAPAN;
        java.lang.String str89 = locale88.getDisplayVariant();
        java.util.Locale locale90 = null;
        java.lang.String str91 = locale88.getDisplayScript(locale90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter92 = dateTimeFormatter86.withLocale(locale88);
        int int93 = property85.getMaximumShortTextLength(locale88);
        boolean boolean94 = locale88.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter95 = dateTimeFormatter0.withLocale(locale88);
        java.lang.Integer int96 = dateTimeFormatter95.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter98 = dateTimeFormatter95.withPivotYear((java.lang.Integer) 69645326);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5) + "'", int14 == (-5));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-360599990L) + "'", long27 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+100:10" + "'", str28, "+100:10");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-004" + "'", str53, "1970-004");
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-360599990L) + "'", long75 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+100:10" + "'", str76, "+100:10");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1970 + "'", int78 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2 + "'", int93 == 2);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter95);
        org.junit.Assert.assertNull(int96);
        org.junit.Assert.assertNotNull(dateTimeFormatter98);
    }

    @Test
    public void test21581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21581");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(44);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        java.lang.String str3 = localDateTime2.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusYears((-26));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-23T11:13:19.339" + "'", str3, "2022-02-23T11:13:19.339");
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test21582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21582");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitWeekyear(69205874, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMinuteOfDay(69209217);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendFractionOfMinute(69555307, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder3.appendTwoDigitYear(86399999, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test21583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21583");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        int int4 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMinuteOfDay((int) (short) 0);
        boolean boolean7 = mutableDateTime2.isBeforeNow();
        mutableDateTime2.setSecondOfDay(250);
        int int10 = mutableDateTime2.getYearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test21584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21584");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        int int21 = dateTimeField19.getMaximumShortTextLength(locale20);
        long long23 = dateTimeField19.roundHalfCeiling((long) (short) 100);
        int int24 = dateTimeField19.getMaximumValue();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.monthOfYear();
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = locale32.getISO3Language();
        int int34 = property31.getMaximumShortTextLength(locale32);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale35);
        java.lang.String str37 = locale32.getDisplayName(locale35);
        java.lang.String str38 = locale35.getVariant();
        java.lang.String str39 = locale26.getDisplayCountry(locale35);
        java.lang.String str40 = dateTimeField19.getAsText((long) 69351868, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-62135957400000L) + "'", long23 == (-62135957400000L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fra" + "'", str33, "fra");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fran\347ais (Canada)" + "'", str37, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "France" + "'", str39, "France");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ap. J.-C." + "'", str40, "ap. J.-C.");
    }

    @Test
    public void test21585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21585");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime0.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusSeconds(360600000);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusMillis(1969);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusMillis(69790393);
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69799376 + "'", int1 == 69799376);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test21586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 5, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(52);
        org.joda.time.DateTime dateTime6 = dateTime4.withMillisOfDay(0);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test21587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21587");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) (short) 100);
        org.joda.time.DateTime.Property property32 = dateTime29.yearOfCentury();
        org.joda.time.DateTime.Property property33 = dateTime29.weekyear();
        org.joda.time.DateTime.Property property34 = dateTime29.millisOfSecond();
        org.joda.time.DateTime dateTime35 = property34.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test21588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21588");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 5, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusHours((-2022));
        org.joda.time.DateTime.Property property7 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate9 = dateTime8.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(575);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test21589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21589");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate21.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDate.Property property26 = localDate21.weekyear();
        int int27 = property26.getLeapAmount();
        org.joda.time.LocalDate localDate28 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate30 = property26.addToCopy(69222520);
        org.joda.time.LocalDate.Property property31 = localDate30.weekOfWeekyear();
        int int32 = localDate30.getMonthOfYear();
        org.joda.time.LocalDate.Property property33 = localDate30.yearOfCentury();
        org.joda.time.LocalDate.Property property34 = localDate30.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test21590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21590");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.minusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendTimeZoneShortName(strMap39);
        boolean boolean41 = dateTimeZone37.equals((java.lang.Object) strMap39);
        boolean boolean43 = dateTimeZone37.isStandardOffset((long) (byte) -1);
        long long46 = dateTimeZone37.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str47 = dateTimeZone37.getID();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone37);
        int int49 = localDate48.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property51 = localDate48.property(dateTimeFieldType50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap57 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendTimeZoneShortName(strMap57);
        boolean boolean59 = dateTimeZone55.equals((java.lang.Object) strMap57);
        boolean boolean61 = dateTimeZone55.isStandardOffset((long) (byte) -1);
        long long64 = dateTimeZone55.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str65 = dateTimeZone55.getID();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone55);
        int int67 = localDate66.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property69 = localDate66.property(dateTimeFieldType68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType68.getField(chronology70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((java.lang.Object) chronology70, chronology72);
        org.joda.time.Chronology chronology74 = localDate73.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.minutes();
        org.joda.time.DateTimeField dateTimeField76 = dateTimeFieldType50.getField(chronology74);
        java.util.Locale locale77 = java.util.Locale.JAPAN;
        java.lang.String str78 = locale77.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology74, locale77, (java.lang.Integer) 0, 54202800);
        boolean boolean82 = strList30.remove((java.lang.Object) chronology74);
        boolean boolean83 = dateTimeFieldType24.isSupported(chronology74);
        org.joda.time.LocalDate.Property property84 = localDate23.property(dateTimeFieldType24);
        org.joda.time.LocalDate.Property property85 = localDate23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField86 = property85.getField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-360599990L) + "'", long46 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+100:10" + "'", str47, "+100:10");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1970 + "'", int49 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-360599990L) + "'", long64 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+100:10" + "'", str65, "+100:10");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeField86);
    }

    @Test
    public void test21591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21591");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours(69205127);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        org.joda.time.DateTime dateTime34 = dateTime31.withYearOfCentury(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime37 = dateTime31.withField(dateTimeFieldType35, 70);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime40.add(readableDuration41, 0);
        mutableDateTime40.addWeekyears(0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.add((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime53 = property49.set("00");
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        mutableDateTime40.setZone(dateTimeZone54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) dateTime37, dateTimeZone54);
        org.joda.time.DateTime dateTime58 = dateTime37.plusSeconds(69264455);
        org.joda.time.DateTime dateTime60 = dateTime37.plus((long) (-97));
        int int61 = dateTime37.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone63);
        mutableDateTime64.setTime((long) (short) -1);
        java.util.GregorianCalendar gregorianCalendar67 = mutableDateTime64.toGregorianCalendar();
        boolean boolean68 = mutableDateTime64.isBeforeNow();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime71 = property69.addWrapField(274);
        int int72 = dateTime37.compareTo((org.joda.time.ReadableInstant) mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 23 + "'", int61 == 23);
        org.junit.Assert.assertNotNull(gregorianCalendar67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test21592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21592");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.lang.String> strCollection3 = null;
        java.util.List<java.lang.String> strList4 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "fra", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList23);
        boolean boolean27 = strList25.equals((java.lang.Object) (-1));
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList33);
        boolean boolean37 = strList35.equals((java.lang.Object) (-1));
        boolean boolean38 = strList25.retainAll((java.util.Collection<java.lang.String>) strList35);
        boolean boolean39 = strSet16.retainAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean40 = strList10.retainAll((java.util.Collection<java.lang.String>) strSet16);
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet16);
        boolean boolean43 = strSet16.add("fran\347ais (canada)");
        java.lang.Object[] objArray44 = strSet16.toArray();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[fran\347ais (canada)]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[fran\347ais (canada)]");
    }

    @Test
    public void test21593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(694224000012L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.plusMillis(69694706);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test21594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21594");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = mutableDateTime2.getMillis();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime2.add(readableDuration5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneShortName(strMap12);
        boolean boolean14 = dateTimeZone10.equals((java.lang.Object) strMap12);
        boolean boolean16 = dateTimeZone10.isStandardOffset((long) (byte) -1);
        long long19 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str20 = dateTimeZone10.getID();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int24 = mutableDateTime2.get(dateTimeFieldType23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 5, chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readableDuration28);
        org.joda.time.DateTime dateTime31 = dateTime27.minusHours((-2022));
        org.joda.time.DateTime.Property property32 = dateTime31.centuryOfEra();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property34 = dateTime31.hourOfDay();
        java.util.Date date35 = dateTime31.toDate();
        org.joda.time.DateTime dateTime37 = dateTime31.plusMonths(808);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360599990L) + "'", long19 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:10" + "'", str20, "+100:10");
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Mon Mar 30 10:10:00 GMT+:0:10 1970");
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test21595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21595");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap4);
        boolean boolean6 = dateTimeZone2.equals((java.lang.Object) strMap4);
        boolean boolean8 = dateTimeZone2.isStandardOffset((long) (byte) -1);
        java.lang.String str10 = dateTimeZone2.getShortName((long) 69203825);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:10" + "'", str10, "+100:10");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test21596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21596");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(0L);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfWeek();
        org.joda.time.LocalDate.Property property3 = localDate1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTimeZoneShortName(strMap9);
        boolean boolean11 = dateTimeZone7.equals((java.lang.Object) strMap9);
        boolean boolean13 = dateTimeZone7.isStandardOffset((long) (byte) -1);
        long long16 = dateTimeZone7.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str17 = dateTimeZone7.getID();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone7);
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight20 = localDate18.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendTimeZoneShortName(strMap26);
        boolean boolean28 = dateTimeZone24.equals((java.lang.Object) strMap26);
        boolean boolean30 = dateTimeZone24.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter21.withZone(dateTimeZone24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.DateTime dateTime33 = localDate18.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours(69205127);
        org.joda.time.DateTime.Property property36 = dateTime35.monthOfYear();
        boolean boolean37 = property36.isLeap();
        org.joda.time.DateTime dateTime39 = property36.addWrapFieldToCopy(69213798);
        org.joda.time.DateTime dateTime41 = dateTime39.plusDays(251);
        org.joda.time.DateTime.Property property42 = dateTime39.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap48 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendTimeZoneShortName(strMap48);
        boolean boolean50 = dateTimeZone46.equals((java.lang.Object) strMap48);
        boolean boolean52 = dateTimeZone46.isStandardOffset((long) (byte) -1);
        long long55 = dateTimeZone46.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str56 = dateTimeZone46.getID();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone46);
        org.joda.time.LocalDate.Property property58 = localDate57.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight59 = localDate57.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap65 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder64.appendTimeZoneShortName(strMap65);
        boolean boolean67 = dateTimeZone63.equals((java.lang.Object) strMap65);
        boolean boolean69 = dateTimeZone63.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter60.withZone(dateTimeZone63);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone63);
        org.joda.time.DateTime dateTime72 = localDate57.toDateTimeAtCurrentTime(dateTimeZone63);
        org.joda.time.DateTime dateTime74 = dateTime72.minusSeconds((int) (short) 100);
        org.joda.time.DateTime.Property property75 = dateTime72.yearOfCentury();
        org.joda.time.DateTime.Property property76 = dateTime72.weekyear();
        org.joda.time.DateTime dateTime77 = dateTime72.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate78 = org.joda.time.LocalDate.now();
        org.joda.time.DateTime dateTime79 = localDate78.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval80 = localDate78.toInterval();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalDate localDate82 = localDate78.plus(readablePeriod81);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone84);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime85.monthOfYear();
        int int87 = mutableDateTime85.getWeekOfWeekyear();
        mutableDateTime85.add((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean91 = mutableDateTime85.isSupported(dateTimeFieldType90);
        int int92 = localDate78.get(dateTimeFieldType90);
        org.joda.time.DateTime.Property property93 = dateTime77.property(dateTimeFieldType90);
        int int94 = dateTime39.get(dateTimeFieldType90);
        int int95 = property3.getDifference((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-360599990L) + "'", long16 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:10" + "'", str17, "+100:10");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-360599990L) + "'", long55 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+100:10" + "'", str56, "+100:10");
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateMidnight59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 56 + "'", int92 == 56);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 144 + "'", int94 == 144);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-78) + "'", int95 == (-78));
    }

    @Test
    public void test21597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21597");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.minuteOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfYear();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.set("70");
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.lang.String str14 = property9.getAsShortText(locale13);
        java.util.Locale.Builder builder15 = builder0.setLocale(locale13);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.addUnicodeLocaleAttribute("fra");
        java.util.Locale locale19 = builder18.build();
        java.util.Locale.Builder builder20 = builder0.setLocale(locale19);
        java.util.Locale.Builder builder22 = builder20.setVariant("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "70" + "'", str14, "70");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test21598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21598");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.year();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        int int14 = property13.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(69206843);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.set(41);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test21599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21599");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendSecondOfMinute((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendSignedDecimal(dateTimeFieldType4, (int) (byte) 10, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMillisOfSecond(9);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "fra", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList23);
        boolean boolean27 = strList25.equals((java.lang.Object) (-1));
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList33);
        boolean boolean37 = strList35.equals((java.lang.Object) (-1));
        boolean boolean38 = strList25.retainAll((java.util.Collection<java.lang.String>) strList35);
        boolean boolean39 = strSet16.retainAll((java.util.Collection<java.lang.String>) strList25);
        java.util.Locale.FilteringMode filteringMode40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList25, filteringMode40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder42.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder42.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser47 = dateTimeFormatterBuilder42.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder42.appendTwoDigitYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder42.appendFractionOfDay(59, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder42.appendMonthOfYearShortText();
        boolean boolean54 = strList25.equals((java.lang.Object) dateTimeFormatterBuilder53);
        dateTimeFormatterBuilder53.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder53.appendMinuteOfDay(65641);
        org.joda.time.format.DateTimeParser dateTimeParser58 = dateTimeFormatterBuilder57.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder9.appendOptional(dateTimeParser58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder9.appendSecondOfDay(69209217);
        org.joda.time.format.DateTimeParser dateTimeParser62 = dateTimeFormatterBuilder9.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder9.appendFractionOfDay(69306403, 69232402);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder9.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder66.appendHourOfDay(69715230);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeParser47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeParser58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeParser62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
    }

    @Test
    public void test21600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21600");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMinutes((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusWeeks(191509);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        int int9 = localDateTime7.getYear();
        int int10 = localDateTime7.size();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusSeconds(69291615);
        int int14 = localDateTime7.size();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.withWeekyear(69568334);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69799681 + "'", int1 == 69799681);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5692 + "'", int9 == 5692);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test21601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21601");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) chronology18, chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.minusDays(0);
        org.joda.time.LocalDate.Property property24 = localDate23.weekyear();
        boolean boolean26 = property24.equals((java.lang.Object) "secondOfMinute");
        org.joda.time.LocalDate localDate28 = property24.addWrapFieldToCopy(69210404);
        org.joda.time.LocalDate localDate30 = localDate28.minusDays(0);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.LocalDate.Property property32 = localDate30.weekOfWeekyear();
        java.lang.Object obj33 = null;
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap40 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendTimeZoneShortName(strMap40);
        boolean boolean42 = dateTimeZone38.equals((java.lang.Object) strMap40);
        boolean boolean44 = dateTimeZone38.isStandardOffset((long) (byte) -1);
        long long47 = dateTimeZone38.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str48 = dateTimeZone38.getID();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone38);
        int int50 = localDate49.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property52 = localDate49.property(dateTimeFieldType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType51.getField(chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) chronology53, chronology55);
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.minutes();
        boolean boolean59 = durationFieldType34.isSupported(chronology57);
        org.joda.time.DurationField durationField60 = chronology57.days();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(obj33, chronology57);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.monthOfYear();
        org.joda.time.DurationField durationField63 = dateTimeField62.getDurationField();
        java.util.Locale locale65 = java.util.Locale.ITALY;
        java.lang.String str66 = locale65.getScript();
        java.lang.String str67 = dateTimeField62.getAsText((long) 86399999, locale65);
        int int68 = property32.getMaximumShortTextLength(locale65);
        int int69 = property32.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField70 = property32.getField();
        org.joda.time.LocalDate localDate71 = property32.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-360599990L) + "'", long47 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+100:10" + "'", str48, "+100:10");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1970 + "'", int50 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "gennaio" + "'", str67, "gennaio");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(localDate71);
    }

    @Test
    public void test21602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21602");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.LocalDate.Property property16 = localDate14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        org.joda.time.LocalDate localDate19 = property16.addToCopy(69231246);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.LocalDate localDate22 = localDate19.minusYears(0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test21603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21603");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours(69205127);
        org.joda.time.DateTime dateTime33 = dateTime29.plusWeeks(69206284);
        java.util.Date date34 = dateTime29.toDate();
        org.joda.time.DateTime dateTime36 = dateTime29.minusSeconds(11);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMonths(69301);
        org.joda.time.DateTime dateTime40 = dateTime36.plusMonths(69250877);
        boolean boolean41 = dateTime36.isEqualNow();
        org.joda.time.YearMonthDay yearMonthDay42 = dateTime36.toYearMonthDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Mon Jan 05 19:23:19 GMT+:0:10 1970");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(yearMonthDay42);
    }

    @Test
    public void test21604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21604");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneShortName(strMap22);
        boolean boolean24 = dateTimeZone20.equals((java.lang.Object) strMap22);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime29 = localDate14.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours(69205127);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        boolean boolean33 = property32.isLeap();
        org.joda.time.DateTime dateTime35 = property32.addWrapFieldToCopy(69213798);
        org.joda.time.DateTime dateTime36 = property32.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property37 = dateTime36.year();
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet39 = locale38.getExtensionKeys();
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = locale38.getDisplayScript(locale40);
        java.lang.String str42 = property37.getAsText(locale38);
        org.joda.time.DateTime dateTime43 = property37.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime45 = dateTime43.plusHours(69398154);
        org.joda.time.DateTime dateTime47 = dateTime43.withWeekyear(69302858);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime43.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "9864" + "'", str42, "9864");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }
}
