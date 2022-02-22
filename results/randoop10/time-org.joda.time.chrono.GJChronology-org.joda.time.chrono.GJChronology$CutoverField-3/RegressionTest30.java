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
        java.util.Locale locale1 = new java.util.Locale("GJChronology[Etc/UTC,mdfw=1]");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertEquals(locale1.toString(), "gjchronology[etc/utc,mdfw=1]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.dayOfWeek();
        org.joda.time.LocalDateTime.Property property19 = localDateTime12.dayOfWeek();
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale22.getDisplayScript();
        java.lang.String str24 = locale21.getDisplayCountry(locale22);
        java.lang.String str25 = locale20.getDisplayName(locale22);
        int int26 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime28 = instant27.toMutableDateTimeISO();
        mutableDateTime28.addWeeks(53620);
        boolean boolean31 = mutableDateTime28.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology35.getZone();
        long long42 = dateTimeZone39.adjustOffset((long) 'a', true);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = dateTimeZone39.getName((long) 53625, locale44);
        long long49 = dateTimeZone39.convertLocalToUTC((long) (byte) 10, false, 4200530946L);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime28.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        int int53 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 157766399999L + "'", long10 == 157766399999L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Deutschland" + "'", str24, "Deutschland");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinesisch" + "'", str25, "Chinesisch");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        mutableDateTime1.setTime(10L);
        org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(2);
        org.joda.time.DateTime.Property property8 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        boolean boolean5 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime3);
        java.lang.String str6 = mutableDateTime1.toString();
        int int7 = mutableDateTime1.getCenturyOfEra();
        int int8 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.year();
        java.lang.String str10 = mutableDateTime1.toString();
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime1.getRoundingField();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime1.add(readablePeriod12, 53789);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-21T15:03:34.304Z" + "'", str6, "2022-02-21T15:03:34.304Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T15:03:34.304Z" + "'", str10, "2022-02-21T15:03:34.304Z");
        org.junit.Assert.assertNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2022-02-21T14:58:26.897");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        int int17 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withPeriodAdded(readablePeriod22, 0);
        int int25 = dateTime20.getSecondOfDay();
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean27 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str28 = dateTime20.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int30 = dateTime20.get(dateTimeFieldType29);
        java.lang.String str31 = dateTimeFieldType29.toString();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType29.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, readableInstant34, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Chronology chronology39 = gJChronology36.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology36.dayOfMonth();
        org.joda.time.DurationField durationField41 = durationFieldType32.getField((org.joda.time.Chronology) gJChronology36);
        long long44 = durationField41.getValueAsLong((long) 53682816, 1649602547520L);
        int int47 = durationField41.getValue((long) 53712778, (long) 53964);
        org.joda.time.DurationFieldType durationFieldType48 = durationField41.getType();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 54214 + "'", int25 == 54214);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-21T15:03:34.322Z" + "'", str28, "2022-02-21T15:03:34.322Z");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22 + "'", int30 == 22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "yearOfCentury" + "'", str31, "yearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(durationFieldType48);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.minus(0L);
        org.joda.time.DateTime dateTime18 = dateTime8.withMillis((long) 590);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime8.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant20.withDurationAdded(readableDuration22, (int) (byte) 0);
        org.joda.time.DateTime dateTime25 = instant20.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = mutableDateTime27.toDateTimeISO();
        org.joda.time.DateTime.Property property29 = dateTime28.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withPeriodAdded(readablePeriod30, 0);
        org.joda.time.Instant instant33 = dateTime32.toInstant();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        int int37 = dateTimeZone35.getOffsetFromLocal((long) 53621);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(97L, dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime40 = instant33.toDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime41 = instant33.toMutableDateTime();
        int int42 = dateTime25.compareTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTime dateTime43 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeField dateTimeField45 = gJChronology44.weekyear();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = gJChronology44.add(readablePeriod46, 1645455671245L, 53892);
        org.joda.time.Chronology chronology50 = gJChronology44.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54214 + "'", int13 == 54214);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1645455671245L + "'", long49 == 1645455671245L);
        org.junit.Assert.assertNotNull(chronology50);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean4 = dateTimeFormatter2.isParser();
        boolean boolean5 = dateTimeFormatter2.isParser();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(category6, locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter12.parseLocalDateTime("\u661f\u671f\u56db");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        int int3 = dateTime2.getYearOfEra();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Calendar calendar5 = dateTime2.toCalendar(locale4);
        java.lang.String str6 = locale4.getScript();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455814376,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=34,MILLISECOND=376,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField8 = gJChronology3.centuries();
        org.joda.time.DurationField durationField9 = gJChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        int int15 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime11.getZone();
        long long20 = dateTimeZone16.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = mutableDateTime24.toDateTimeISO();
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundCeilingCopy();
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds(59);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = mutableDateTime33.toDateTimeISO();
        int int35 = mutableDateTime31.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime31.getZone();
        long long40 = dateTimeZone36.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime29, dateTimeZone36);
        int int45 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology46 = gJChronology3.withZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = mutableDateTime49.toDateTimeISO();
        org.joda.time.DateTime.Property property51 = dateTime50.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.withPeriodAdded(readablePeriod52, 0);
        org.joda.time.Instant instant55 = dateTime54.toInstant();
        org.joda.time.DateTime.Property property56 = dateTime54.minuteOfHour();
        org.joda.time.DateTime dateTime58 = dateTime54.plusYears(53652);
        org.joda.time.DateTime dateTime60 = dateTime54.plusYears(28);
        org.joda.time.DateTime dateTime62 = dateTime54.minusMonths(8);
        boolean boolean63 = mutableDateTime47.equals((java.lang.Object) dateTime54);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 157766399999L + "'", long20 == 157766399999L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 157766399999L + "'", long40 == 157766399999L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        int int2 = localDateTime0.get(dateTimeFieldType1);
        int int3 = localDateTime0.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant5, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology7.weekyears();
        org.joda.time.DurationField durationField11 = gJChronology7.halfdays();
        boolean boolean12 = localDateTime0.equals((java.lang.Object) gJChronology7);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime0.plusYears(53632926);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMillis(53740);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField10 = gJChronology4.minutes();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology20);
        int int23 = localDateTime22.getDayOfWeek();
        long long25 = gJChronology15.set((org.joda.time.ReadablePartial) localDateTime22, (long) 7);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusWeeks((int) 'a');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.withMillisOfSecond((int) '#');
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime22.minus(readableDuration30);
        int[] intArray33 = gJChronology4.get((org.joda.time.ReadablePartial) localDateTime22, 169227310795200000L);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime22.withYearOfCentury(27);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime22.withCenturyOfEra(53620);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusYears(53898347);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minus(readablePeriod40);
        int int42 = localDateTime41.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[5364569, 12, 31, 43200000]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.year();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology12.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (long) 43, 7);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18, (int) (short) 1);
        java.lang.String str21 = gJChronology20.toString();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.monthOfYear();
        org.joda.time.Instant instant24 = gJChronology20.getGregorianCutover();
        org.joda.time.DateTime dateTime25 = instant24.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime25.withYear((int) '#');
        org.joda.time.DateTime dateTime28 = dateTime27.withLaterOffsetAtOverlap();
        int int29 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime27);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property31 = dateTime27.yearOfEra();
        org.joda.time.DateTime dateTime33 = property31.addWrapFieldToCopy(53747);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMonths(53865);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        boolean boolean41 = mutableDateTime37.isBefore((org.joda.time.ReadableInstant) mutableDateTime39);
        java.lang.String str42 = mutableDateTime37.toString();
        int int43 = mutableDateTime37.getCenturyOfEra();
        int int44 = mutableDateTime37.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.year();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.addWrapField(53648);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime47.add(readableDuration48, 53778623);
        java.lang.String str51 = mutableDateTime47.toString();
        boolean boolean52 = dateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, readableInstant55, (int) (short) 1);
        java.lang.String str58 = gJChronology57.toString();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology57.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology57.monthOfYear();
        org.joda.time.Instant instant61 = gJChronology57.getGregorianCutover();
        org.joda.time.DateTime dateTime62 = instant61.toDateTimeISO();
        org.joda.time.DateTime dateTime64 = dateTime62.withYear((int) '#');
        org.joda.time.YearMonthDay yearMonthDay65 = dateTime62.toYearMonthDay();
        int[] intArray67 = gJChronology53.get((org.joda.time.ReadablePartial) yearMonthDay65, 18619060278993L);
        org.joda.time.DateTimeField dateTimeField68 = gJChronology53.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology53.era();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology53.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime33.toMutableDateTime((org.joda.time.Chronology) gJChronology53);
        org.joda.time.DateTime dateTime73 = dateTime33.withMillisOfDay(54105);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str21, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022-02-21T15:03:34.485Z" + "'", str42, "2022-02-21T15:03:34.485Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20 + "'", int43 == 20);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime47);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "55670-02-21T15:03:34.485Z" + "'", str51, "55670-02-21T15:03:34.485Z");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str58, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[2560, 1, 6]");
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology4);
        int int7 = localDateTime6.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusDays(53619);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long6 = gJChronology0.getDateTimeMillis(10L, (int) (byte) 1, 20, (int) (short) 1, 5);
        org.joda.time.DurationField durationField7 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField13 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4801005L + "'", long6 == 4801005L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 0);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.withMillisOfDay((int) '4');
        int int10 = dateTime6.getYear();
        int int11 = dateTime6.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime6.minusWeeks(53891);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology17.weekyear();
        org.joda.time.DurationField durationField24 = gJChronology17.days();
        org.joda.time.DateTime dateTime25 = dateTime6.withChronology((org.joda.time.Chronology) gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (long) 43, 7);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        org.joda.time.DurationField durationField9 = gJChronology7.hours();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = gJChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology7.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        int int12 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        int int13 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) mutableDateTime8);
        long long16 = dateTimeZone6.adjustOffset(10L, false);
        java.util.TimeZone timeZone17 = dateTimeZone6.toTimeZone();
        int int19 = dateTimeZone6.getOffset(1645455403885L);
        long long23 = dateTimeZone6.convertLocalToUTC((long) 53621, true, 32508000000000L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = mutableDateTime27.toDateTimeISO();
        int int29 = mutableDateTime25.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        org.joda.time.DateTime.Property property33 = dateTime32.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.withPeriodAdded(readablePeriod34, 0);
        int int37 = dateTime32.getSecondOfDay();
        mutableDateTime27.setDate((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime40 = dateTime32.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = mutableDateTime42.toDateTimeISO();
        org.joda.time.DateTime.Property property44 = dateTime43.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.withPeriodAdded(readablePeriod45, 0);
        int int48 = dateTime43.getSecondOfDay();
        org.joda.time.DateTime.Property property49 = dateTime43.minuteOfHour();
        org.joda.time.DateTime dateTime50 = property49.roundCeilingCopy();
        boolean boolean51 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime50.toMutableDateTime();
        int int53 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53621L + "'", long23 == 53621L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 54214 + "'", int37 == 54214);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 54214 + "'", int48 == 54214);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology8);
        int int11 = localDateTime10.getDayOfWeek();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 7);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.minuteOfDay();
        org.joda.time.DurationField durationField25 = gJChronology19.millis();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology19.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) gJChronology30);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusHours(59);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.minus(readablePeriod36);
        java.util.Locale locale38 = java.util.Locale.CHINA;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40, (int) (short) 1);
        java.lang.String str43 = gJChronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology42.year();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology42.secondOfMinute();
        java.util.Locale locale49 = java.util.Locale.JAPANESE;
        java.lang.String str50 = dateTimeField47.getAsText(53634, locale49);
        java.lang.String str51 = locale38.getDisplayLanguage(locale49);
        java.lang.String str52 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime33, locale38);
        int int53 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime33);
        java.lang.String str55 = localDateTime33.toString("-292269055");
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime33.minus(readablePeriod56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime59 = localDateTime33.withDayOfMonth(34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str43, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "53634" + "'", str50, "53634");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str51, "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "592" + "'", str52, "592");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 292278993 + "'", int53 == 292278993);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-292269055" + "'", str55, "-292269055");
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.monthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = mutableDateTime17.toDateTimeISO();
        int int19 = mutableDateTime15.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withPeriodAdded(readablePeriod24, 0);
        int int27 = dateTime22.getSecondOfDay();
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) dateTime22);
        mutableDateTime17.setMillisOfDay((int) (byte) 0);
        mutableDateTime17.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime17.yearOfEra();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime17.hourOfDay();
        boolean boolean35 = property13.equals((java.lang.Object) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology39.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology39.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology39.yearOfCentury();
        long long45 = dateTimeField42.add(0L, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone47, readableInstant48, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone51 = gJChronology50.getZone();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology50);
        int int53 = localDateTime52.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withDayOfMonth(7);
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.lang.String str58 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localDateTime55, 43, locale57);
        int int59 = property13.getMaximumTextLength(locale57);
        org.joda.time.DateTime dateTime61 = property13.addToCopy((long) 86399999);
        org.joda.time.DateTime dateTime62 = dateTime61.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = mutableDateTime66.toDateTimeISO();
        int int68 = mutableDateTime64.compareTo((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime64.getZone();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime74 = mutableDateTime73.toDateTimeISO();
        int int75 = mutableDateTime71.compareTo((org.joda.time.ReadableInstant) mutableDateTime73);
        int int76 = dateTimeZone69.getOffset((org.joda.time.ReadableInstant) mutableDateTime71);
        long long79 = dateTimeZone69.adjustOffset(10L, false);
        java.util.TimeZone timeZone80 = dateTimeZone69.toTimeZone();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime82 = dateTime62.toDateTime(dateTimeZone69);
        boolean boolean84 = dateTime82.isBefore(0L);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime86 = org.joda.time.MutableDateTime.now(dateTimeZone85);
        org.joda.time.DateTime dateTime87 = mutableDateTime86.toDateTimeISO();
        org.joda.time.DateTime.Property property88 = dateTime87.centuryOfEra();
        org.joda.time.DurationField durationField89 = property88.getDurationField();
        org.joda.time.DateTime dateTime91 = property88.addToCopy((long) (short) 100);
        org.joda.time.Instant instant92 = dateTime91.toInstant();
        org.joda.time.Instant instant94 = instant92.minus(44933695L);
        boolean boolean95 = dateTime82.isAfter((org.joda.time.ReadableInstant) instant92);
        org.joda.time.MutableDateTime mutableDateTime96 = instant92.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54214 + "'", int27 == 54214);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1640995200000L + "'", long45 == 1640995200000L);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "43" + "'", str58, "43");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10L + "'", long79 == 10L);
        org.junit.Assert.assertNotNull(timeZone80);
// flaky:         org.junit.Assert.assertEquals(timeZone80.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(dateTimeZone85);
        org.junit.Assert.assertNotNull(mutableDateTime86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(instant92);
        org.junit.Assert.assertNotNull(instant94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(mutableDateTime96);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology4);
        int int7 = localDateTime6.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDayOfMonth(7);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        java.util.Locale locale14 = new java.util.Locale("Property[millisOfDay]", "2022-02-21T14:01:51.240Z");
        java.lang.String str15 = locale14.getLanguage();
        int int16 = property10.getMaximumTextLength(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property10.setCopy(53697);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53697 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals(locale14.toString(), "property[millisofday]_2022-02-21T14:01:51.240Z");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "property[millisofday]" + "'", str15, "property[millisofday]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology10);
        int int13 = localDateTime12.getDayOfWeek();
        int int14 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusMinutes(53635);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusHours(11);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusSeconds(53852);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("UTC");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder2.setLocale(locale3);
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale10.getDisplayScript();
        java.lang.String str12 = locale9.getDisplayCountry(locale10);
        java.lang.String str13 = locale8.getDisplayName(locale10);
        java.lang.String str14 = locale8.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale8.getDisplayVariant(locale15);
        java.util.Locale.Builder builder18 = builder6.setLocale(locale8);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology22.getZone();
        org.joda.time.Chronology chronology27 = gJChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology22.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        int int34 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime30.getZone();
        long long39 = dateTimeZone35.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekOfWeekyear();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.lang.String str44 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime41, locale43);
        java.lang.String str45 = locale43.getCountry();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.secondOfDay();
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.lang.String str51 = locale50.getDisplayName();
        java.lang.String str52 = dateTimeField48.getAsText(604800000L, locale50);
        java.lang.String str53 = locale43.getDisplayLanguage(locale50);
        java.lang.String str54 = locale50.getDisplayVariant();
        java.util.Locale.Builder builder55 = builder6.setLocale(locale50);
        java.lang.String str56 = locale50.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deutschland" + "'", str12, "Deutschland");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinesisch" + "'", str13, "Chinesisch");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch" + "'", str14, "Chinesisch");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 157766399999L + "'", long39 == 157766399999L);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "54214" + "'", str44, "54214");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Italienisch" + "'", str51, "Italienisch");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "cinese" + "'", str53, "cinese");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = gJChronology3.get(readablePeriod6, 1645455442170L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((-292275054));
        org.joda.time.DateTime.Property property13 = dateTime10.year();
        org.joda.time.DateTime dateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime22.toDateTimeISO();
        org.joda.time.DateTime.Property property24 = dateTime23.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withPeriodAdded(readablePeriod25, 0);
        int int28 = dateTime23.getSecondOfDay();
        mutableDateTime18.setDate((org.joda.time.ReadableInstant) dateTime23);
        mutableDateTime18.setMillisOfDay((int) (byte) 0);
        mutableDateTime18.addMillis(53620);
        int int34 = mutableDateTime18.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str36 = dateTimeZone35.getID();
        boolean boolean37 = dateTimeZone35.isFixed();
        java.lang.String str38 = dateTimeZone35.getID();
        mutableDateTime18.setZoneRetainFields(dateTimeZone35);
        boolean boolean40 = dateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = mutableDateTime43.toDateTimeISO();
        org.joda.time.DateTime.Property property45 = dateTime44.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withPeriodAdded(readablePeriod46, 0);
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        int int53 = dateTimeZone51.getOffsetFromLocal((long) 53621);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(97L, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime56 = instant49.toDateTime(dateTimeZone51);
        org.joda.time.Instant instant58 = instant49.withMillis((long) (short) 0);
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.MutableDateTime mutableDateTime60 = instant49.toMutableDateTimeISO();
        boolean boolean61 = instant49.isBeforeNow();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 54214 + "'", int28 == 54214);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
// flaky:         org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusDays(4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime7.getFieldTypes();
        java.util.Date date9 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusSeconds(53766);
        int int12 = localDateTime11.getYear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Dec 31 15:03:34 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        java.util.Locale locale2 = new java.util.Locale("53923075", "2022-02-21T14:57:03.742Z");
        org.junit.Assert.assertEquals(locale2.toString(), "53923075_2022-02-21T14:57:03.742Z");
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) (byte) 0);
        mutableDateTime3.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.yearOfEra();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime3.hourOfDay();
        int int21 = mutableDateTime3.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime22 = mutableDateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        int int27 = localDateTime25.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusDays((int) (byte) 100);
        int int30 = localDateTime25.getYear();
        org.joda.time.LocalDateTime.Property property31 = localDateTime25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.weekyear();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology37.year();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType33.getField((org.joda.time.Chronology) gJChronology37);
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = dateTimeField44.getAsText(3, locale46);
        java.lang.String str49 = locale46.getLanguage();
        java.lang.String str50 = property31.getAsText(locale46);
        org.joda.time.LocalDateTime localDateTime51 = property31.getLocalDateTime();
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("53969695");
        java.lang.String str54 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDateTime51, locale53);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54214 + "'", int13 == 54214);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2022 + "'", int27 == 2022);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "DEU" + "'", str47, "DEU");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "3" + "'", str48, "3");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "de" + "'", str49, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "34" + "'", str50, "34");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022" + "'", str54, "2022");
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long11 = gJChronology5.getDateTimeMillis(10L, (int) (byte) 1, 20, (int) (short) 1, 5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        int int18 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime20.toDateTimeISO();
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withPeriodAdded(readablePeriod23, 0);
        int int26 = dateTime21.getSecondOfDay();
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime16.setSecondOfDay(1);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime16.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime16.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology35.getZone();
        java.lang.String str40 = dateTimeZone39.getID();
        java.lang.String str42 = dateTimeZone39.getName(0L);
        mutableDateTime31.setZoneRetainFields(dateTimeZone39);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.millisOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology49.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology49.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone53 = gJChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType45.getField((org.joda.time.Chronology) gJChronology49);
        org.joda.time.DateTimeField dateTimeField55 = gJChronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56, readableInstant57, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField60 = gJChronology59.millisOfDay();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology59.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology59.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone63 = gJChronology59.getZone();
        org.joda.time.Chronology chronology64 = gJChronology49.withZone(dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        long long68 = chronology64.add(readablePeriod65, 0L, 43);
        org.joda.time.DateTimeField dateTimeField69 = chronology64.weekyear();
        org.joda.time.DateTimeField dateTimeField70 = chronology64.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime74 = mutableDateTime73.toDateTimeISO();
        org.joda.time.DateTime.Property property75 = dateTime74.millisOfDay();
        org.joda.time.DateTime.Property property76 = dateTime74.millisOfDay();
        org.joda.time.DateTime dateTime77 = property76.roundHalfCeilingCopy();
        int int78 = property76.getMaximumValue();
        java.util.Locale locale79 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str80 = property76.getAsShortText(locale79);
        boolean boolean81 = locale79.hasExtensions();
        java.lang.String str82 = dateTimeField70.getAsShortText(53690, locale79);
        java.lang.String str83 = dateTimeZone39.getName((-53635L), locale79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter2.withLocale(locale79);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate86 = dateTimeFormatter2.parseLocalDate("2022-02-21T14:56:31.646");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4801005L + "'", long11 == 4801005L);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 54214 + "'", int26 == 54214);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 86399999 + "'", int78 == 86399999);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "54214840" + "'", str80, "54214840");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "53690" + "'", str82, "53690");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+00:00" + "'", str83, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter84);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime.Property property6 = dateTime5.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readablePeriod7);
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology8);
        int int11 = localDateTime10.getDayOfWeek();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusWeeks((int) 'a');
        int int16 = localDateTime10.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.plus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology27);
        int int30 = localDateTime29.getDayOfWeek();
        long long32 = gJChronology22.set((org.joda.time.ReadablePartial) localDateTime29, (long) 7);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusWeeks((int) 'a');
        boolean boolean35 = localDateTime10.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime10.minus(readablePeriod36);
        int int38 = localDateTime10.getMinuteOfHour();
        int int39 = localDateTime10.size();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime10.withPeriodAdded(readablePeriod40, 48);
        org.joda.time.LocalDateTime.Property property43 = localDateTime10.hourOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology8);
        int int11 = localDateTime10.getDayOfWeek();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusWeeks((int) 'a');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfSecond((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.minusMillis(53651);
        org.joda.time.LocalDateTime.Property property20 = localDateTime10.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.withMillisOfDay(53713);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime10.plusSeconds(664);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime10.minusMillis(53810683);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        boolean boolean29 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusDays(4);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.minusSeconds(100);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plus(readableDuration35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withPeriodAdded(readablePeriod37, 53625);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.plusMonths(53641);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusDays(590);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusMinutes(15);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.secondOfMinute();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.year();
        int int50 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.minus(0L);
        org.joda.time.DateTime dateTime18 = dateTime8.withMillis((long) 590);
        org.joda.time.DateTime dateTime19 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property20 = dateTime8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime8.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis(1645455343707L);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54214 + "'", int13 == 54214);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime6 = dateTime4.minusSeconds(59);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        int int12 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        long long17 = dateTimeZone13.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime6, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        java.lang.Object obj24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = mutableDateTime28.toDateTimeISO();
        int int30 = mutableDateTime26.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime26.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = mutableDateTime35.toDateTimeISO();
        int int37 = mutableDateTime33.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        int int38 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) mutableDateTime33);
        long long41 = dateTimeZone31.adjustOffset(10L, false);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj24, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(1649602439355L, dateTimeZone31);
        mutableDateTime43.setDate((long) 53714);
        int int46 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) mutableDateTime43);
        mutableDateTime43.setMillisOfDay(53830739);
        long long49 = mutableDateTime43.getMillis();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.addWrapField(4);
        org.joda.time.MutableDateTime mutableDateTime55 = property52.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str57 = dateTimeFieldType56.toString();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime55.property(dateTimeFieldType56);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime43.property(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 157766399999L + "'", long17 == 157766399999L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 53830739L + "'", long49 == 53830739L);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "secondOfMinute" + "'", str57, "secondOfMinute");
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property59);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology4);
        int int7 = localDateTime6.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDayOfMonth(7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        int int15 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime11.getZone();
        long long20 = dateTimeZone16.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = localDateTime6.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime6.minusMinutes(59);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusSeconds(43);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 157766399999L + "'", long20 == 157766399999L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        mutableDateTime1.setTime(10L);
        org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = property6.set("2022-02-21T14:57:09.792Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:57:09.792Z\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DurationField durationField5 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant8 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField9 = gJChronology3.months();
        long long11 = durationField9.getValueAsLong((long) 449);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology8);
        int int11 = localDateTime10.getDayOfWeek();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 7);
        int int14 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusSeconds(53624);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime20.toDateTimeISO();
        int int22 = mutableDateTime18.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime18.getZone();
        long long27 = dateTimeZone23.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 14);
        boolean boolean33 = dateTimeZone23.isLocalDateTimeGap(localDateTime32);
        org.joda.time.DateTime dateTime34 = localDateTime10.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.weekOfWeekyear();
        int int38 = mutableDateTime36.getDayOfWeek();
        int int39 = mutableDateTime36.getMonthOfYear();
        mutableDateTime36.add((-12219292800000L));
        int int42 = mutableDateTime36.getYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime36.weekyear();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 157766399999L + "'", long27 == 157766399999L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1634 + "'", int42 == 1634);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(gJChronology44);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (long) 43, 7);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        org.joda.time.DurationField durationField9 = gJChronology7.hours();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology7.centuryOfEra();
        org.joda.time.DurationField durationField12 = gJChronology7.years();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15, (int) (short) 1);
        java.lang.String str18 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.monthOfYear();
        org.joda.time.Instant instant21 = gJChronology17.getGregorianCutover();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.withYear((int) '#');
        org.joda.time.DateTime.Property property25 = dateTime24.centuryOfEra();
        org.joda.time.DateTime.Property property26 = dateTime24.monthOfYear();
        org.joda.time.DateTime.Property property27 = dateTime24.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        int int33 = mutableDateTime29.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = mutableDateTime35.toDateTimeISO();
        org.joda.time.DateTime.Property property37 = dateTime36.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.withPeriodAdded(readablePeriod38, 0);
        int int41 = dateTime36.getSecondOfDay();
        mutableDateTime31.setDate((org.joda.time.ReadableInstant) dateTime36);
        mutableDateTime31.setMillisOfDay((int) (byte) 0);
        mutableDateTime31.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime31.yearOfEra();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime31.hourOfDay();
        boolean boolean49 = property27.equals((java.lang.Object) mutableDateTime31);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getRangeDurationType();
        mutableDateTime31.add(durationFieldType51, (int) (byte) 100);
        mutableDateTime31.setMillis(53672L);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56, readableInstant57, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61, readableInstant62, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = gJChronology64.getZone();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology64);
        int int67 = localDateTime66.getDayOfWeek();
        long long69 = gJChronology59.set((org.joda.time.ReadablePartial) localDateTime66, (long) 7);
        org.joda.time.DurationField durationField70 = gJChronology59.days();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology59.millisOfSecond();
        mutableDateTime31.setRounding(dateTimeField72, 0);
        org.joda.time.Chronology chronology75 = mutableDateTime31.getChronology();
        boolean boolean76 = gJChronology7.equals((java.lang.Object) mutableDateTime31);
        org.joda.time.ReadableDuration readableDuration77 = null;
        mutableDateTime31.add(readableDuration77, 619);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str18, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 54215 + "'", int41 == 54215);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.monthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime10.toDateTime();
        int int15 = dateTime14.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime14.minuteOfHour();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withOffsetParsed();
        java.util.Locale locale23 = dateTimeFormatter21.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withPivotYear(2022);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology31.getZone();
        java.lang.String str36 = dateTimeZone35.getID();
        java.lang.String str38 = dateTimeZone35.getName(0L);
        long long41 = dateTimeZone35.convertLocalToUTC((long) 53622, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter27.withZone(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter27.withZone(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime14.toMutableDateTime(dateTimeZone43);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.centuries();
        mutableDateTime45.add(durationFieldType46, 53640);
        int int49 = mutableDateTime45.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.era();
        int int51 = property50.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 53622L + "'", long41 == 53622L);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.seconds();
        org.joda.time.DurationField durationField11 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField12 = gJChronology3.seconds();
        org.joda.time.Chronology chronology13 = gJChronology3.withUTC();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        java.lang.String str5 = gJChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.dayOfWeek();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj0, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.year();
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str5, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        java.lang.String str11 = gJChronology10.toString();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.monthOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.millisOfDay();
        boolean boolean17 = gJChronology3.equals((java.lang.Object) gJChronology10);
        org.joda.time.DurationField durationField18 = gJChronology10.weeks();
        org.joda.time.DurationField durationField19 = gJChronology10.millis();
        org.joda.time.Instant instant20 = gJChronology10.getGregorianCutover();
        org.joda.time.DurationField durationField21 = gJChronology10.days();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        int int27 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        int int34 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        int int35 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) mutableDateTime30);
        long long38 = dateTimeZone28.adjustOffset(10L, false);
        java.util.TimeZone timeZone39 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41, readableInstant42, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField45 = gJChronology44.millisOfDay();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology44.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology44.yearOfCentury();
        org.joda.time.DurationField durationField48 = gJChronology44.millis();
        java.lang.String str49 = gJChronology44.toString();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology44.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = gJChronology44.getZone();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        boolean boolean54 = localDateTime52.isBefore((org.joda.time.ReadablePartial) localDateTime53);
        int int55 = localDateTime52.getCenturyOfEra();
        int int56 = localDateTime52.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = localDateTime52.toDateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone57);
        long long61 = dateTimeZone51.getMillisKeepLocal(dateTimeZone57, (long) 53785);
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime63 = dateTime40.toDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology64 = gJChronology10.withZone(dateTimeZone51);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str11, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str49, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20 + "'", int55 == 20);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 53785L + "'", long61 == 53785L);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        int int12 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        int int13 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) mutableDateTime8);
        long long16 = dateTimeZone6.adjustOffset(10L, false);
        java.util.TimeZone timeZone17 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        int int23 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = mutableDateTime28.toDateTimeISO();
        int int30 = mutableDateTime26.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        int int31 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) mutableDateTime26);
        long long34 = dateTimeZone24.adjustOffset(10L, false);
        java.util.TimeZone timeZone35 = dateTimeZone24.toTimeZone();
        boolean boolean36 = timeZone17.hasSameRules(timeZone35);
        int int37 = timeZone17.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.year();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology12.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (long) 43, 7);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18, (int) (short) 1);
        java.lang.String str21 = gJChronology20.toString();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.monthOfYear();
        org.joda.time.Instant instant24 = gJChronology20.getGregorianCutover();
        org.joda.time.DateTime dateTime25 = instant24.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime25.withYear((int) '#');
        org.joda.time.DateTime dateTime28 = dateTime27.withLaterOffsetAtOverlap();
        int int29 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime27);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) dateTime27);
        int int31 = dateTime27.getMinuteOfDay();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean34 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        int int37 = localDateTime35.get(dateTimeFieldType36);
        boolean boolean38 = localDateTime33.isAfter((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime33.era();
        int int40 = localDateTime33.getEra();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.plusWeeks(15);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime33.plus(readableDuration43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusYears(21);
        java.lang.Object obj47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = mutableDateTime51.toDateTimeISO();
        int int53 = mutableDateTime49.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime49.getZone();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = mutableDateTime58.toDateTimeISO();
        int int60 = mutableDateTime56.compareTo((org.joda.time.ReadableInstant) mutableDateTime58);
        int int61 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) mutableDateTime56);
        long long64 = dateTimeZone54.adjustOffset(10L, false);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj47, dateTimeZone54);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone54);
        int int68 = dateTimeZone54.getOffset((-1L));
        org.joda.time.DateTime dateTime69 = localDateTime44.toDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime();
        boolean boolean72 = localDateTime70.isBefore((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime74 = property73.getLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.chrono.GJChronology gJChronology79 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone76, readableInstant77, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField80 = gJChronology79.millisOfDay();
        org.joda.time.DateTimeField dateTimeField81 = gJChronology79.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology79.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone83 = gJChronology79.getZone();
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType75.getField((org.joda.time.Chronology) gJChronology79);
        int int85 = localDateTime74.indexOf(dateTimeFieldType75);
        int int86 = dateTime69.get(dateTimeFieldType75);
        java.lang.String str87 = dateTimeFieldType75.toString();
        org.joda.time.DateTime.Property property88 = dateTime27.property(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str21, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(gJChronology79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2022 + "'", int86 == 2022);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "weekyear" + "'", str87, "weekyear");
        org.junit.Assert.assertNotNull(property88);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        boolean boolean5 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime3);
        mutableDateTime1.setMinuteOfDay((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime1.add(readableDuration8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((-292275054));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime22 = dateTime14.withZone(dateTimeZone21);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        long long25 = dateTimeZone21.convertUTCToLocal((-1104311164030L));
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone21);
        long long28 = dateTimeZone21.previousTransition((long) 53883332);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1104311164030L) + "'", long25 == (-1104311164030L));
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 53883332L + "'", long28 == 53883332L);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        int int17 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withPeriodAdded(readablePeriod22, 0);
        int int25 = dateTime20.getSecondOfDay();
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean27 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str28 = dateTime20.toString();
        org.joda.time.DateTime.Property property29 = dateTime20.yearOfEra();
        org.joda.time.DateTime dateTime31 = property29.addWrapFieldToCopy(12);
        org.joda.time.LocalDate localDate32 = dateTime31.toLocalDate();
        boolean boolean33 = dateTime31.isEqualNow();
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = property34.setCopy(53845);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53845 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 54215 + "'", int25 == 54215);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-21T15:03:35.199Z" + "'", str28, "2022-02-21T15:03:35.199Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType0.getField((org.joda.time.Chronology) gJChronology13);
        java.lang.String str19 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        int int22 = dateTimeZone20.getOffsetFromLocal((long) 53621);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = mutableDateTime24.toDateTimeISO();
        org.joda.time.DateTime.Property property26 = dateTime25.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withPeriodAdded(readablePeriod27, 0);
        int int30 = dateTime25.getSecondOfDay();
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DurationField durationField32 = gJChronology31.minutes();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType0.getField((org.joda.time.Chronology) gJChronology31);
        org.joda.time.DurationField durationField34 = gJChronology31.days();
        org.joda.time.DurationField durationField35 = gJChronology31.years();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weekyear" + "'", str19, "weekyear");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 54215 + "'", int30 == 54215);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withPeriodAdded(readablePeriod21, 0);
        int int24 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime.Property property25 = dateTime19.minuteOfHour();
        boolean boolean26 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime19);
        java.util.Date date27 = dateTime8.toDate();
        org.joda.time.DateTime.Property property28 = dateTime8.dayOfWeek();
        int int29 = dateTime8.getMillisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime8.withYearOfEra(9);
        int int32 = dateTime8.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = mutableDateTime36.toDateTimeISO();
        int int38 = mutableDateTime34.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = mutableDateTime40.toDateTimeISO();
        org.joda.time.DateTime.Property property42 = dateTime41.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime41.withPeriodAdded(readablePeriod43, 0);
        int int46 = dateTime41.getSecondOfDay();
        mutableDateTime36.setDate((org.joda.time.ReadableInstant) dateTime41);
        mutableDateTime36.setMillisOfDay((int) (byte) 0);
        mutableDateTime36.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime36.yearOfEra();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime36.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone55, readableInstant56, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField59 = gJChronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology58.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology58.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone62 = gJChronology58.getZone();
        java.lang.String str63 = dateTimeZone62.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(4633512832926L, dateTimeZone62);
        org.joda.time.DateTime dateTime66 = mutableDateTime36.toDateTime(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime8, dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54215 + "'", int13 == 54215);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 54215 + "'", int24 == 54215);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Mon Feb 21 15:03:35 GMT 2022");
        org.junit.Assert.assertNotNull(property28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 54215229 + "'", int29 == 54215229);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 903 + "'", int32 == 903);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 54215 + "'", int46 == 54215);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(gJChronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTC" + "'", str63, "UTC");
        org.junit.Assert.assertNotNull(dateTime66);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        int int6 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        int int13 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        int int14 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) mutableDateTime9);
        long long17 = dateTimeZone7.adjustOffset(10L, false);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj0, dateTimeZone7);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone7);
        long long22 = dateTimeZone7.convertUTCToLocal(53638L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = mutableDateTime26.toDateTimeISO();
        int int28 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = mutableDateTime30.toDateTimeISO();
        org.joda.time.DateTime.Property property32 = dateTime31.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded(readablePeriod33, 0);
        int int36 = dateTime31.getSecondOfDay();
        mutableDateTime26.setDate((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime39 = dateTime31.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = mutableDateTime41.toDateTimeISO();
        org.joda.time.DateTime.Property property43 = dateTime42.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.withPeriodAdded(readablePeriod44, 0);
        int int47 = dateTime42.getSecondOfDay();
        org.joda.time.DateTime.Property property48 = dateTime42.minuteOfHour();
        org.joda.time.DateTime dateTime49 = property48.roundCeilingCopy();
        boolean boolean50 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime52 = dateTime49.withCenturyOfEra((int) (short) 1);
        int int53 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime55 = dateTime52.withYear(5603575);
        org.joda.time.DateTime dateTime56 = dateTime52.withLaterOffsetAtOverlap();
        int int57 = dateTime56.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 53638L + "'", long22 == 53638L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 54215 + "'", int36 == 54215);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 54215 + "'", int47 == 54215);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = gJChronology3.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField11 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology3.getDateTimeMillis(53637, 54207, 53994325, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("UTC");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        int int8 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withPeriodAdded(readablePeriod13, 0);
        int int16 = dateTime11.getSecondOfDay();
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateTime11);
        mutableDateTime6.setMillisOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime6.era();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale22.getDisplayScript();
        java.lang.String str24 = locale21.getDisplayCountry(locale22);
        boolean boolean25 = locale21.hasExtensions();
        int int26 = property20.getMaximumShortTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime27 = property20.roundHalfFloor();
        java.lang.String str28 = property20.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property20.getFieldType();
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = property20.getAsText(locale30);
        java.util.Locale.Builder builder33 = builder2.setLocale(locale30);
        java.util.Locale.Builder builder34 = builder2.clear();
        java.util.Locale.Builder builder35 = builder34.clear();
        java.util.Locale.Builder builder37 = builder35.setVariant("7250416");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder37.setVariant("2022-02-21T14:57:19.117Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2022-02-21T14:57:19.117Z [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54215 + "'", int16 == 54215);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Deutschland" + "'", str24, "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "era" + "'", str28, "era");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ap. J.-C." + "'", str32, "ap. J.-C.");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        boolean boolean10 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        int int13 = localDateTime11.get(dateTimeFieldType12);
        boolean boolean14 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        java.lang.String str22 = gJChronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        boolean boolean27 = localDateTime25.isBefore((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusDays(4);
        org.joda.time.LocalDateTime.Property property31 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = mutableDateTime34.toDateTimeISO();
        int int36 = dateTime35.getYearOfEra();
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.util.Calendar calendar38 = dateTime35.toCalendar(locale37);
        java.lang.String str39 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime25, 53621, locale37);
        java.lang.String str40 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDateTime9, locale37);
        org.joda.time.DateTime dateTime41 = localDateTime9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = mutableDateTime43.toDateTimeISO();
        int int45 = dateTime44.getYearOfEra();
        boolean boolean47 = dateTime44.isAfter((long) 53647);
        org.joda.time.DateTime dateTime48 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime50 = dateTime48.withCenturyOfEra(53855);
        org.joda.time.DateTime dateTime51 = dateTime50.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str22, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar38);
// flaky:         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1645455815353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=353,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "53621" + "'", str39, "53621");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "3" + "'", str40, "3");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField7 = gJChronology3.seconds();
        org.joda.time.DurationField durationField8 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField9 = gJChronology3.weeks();
        org.joda.time.DurationField durationField10 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField8 = gJChronology3.centuries();
        org.joda.time.DurationField durationField9 = gJChronology3.minutes();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.DurationField durationField11 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10, (int) (short) 1);
        java.lang.String str13 = gJChronology12.toString();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.monthOfYear();
        org.joda.time.Instant instant16 = gJChronology12.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology12.secondOfMinute();
        org.joda.time.DurationField durationField20 = gJChronology12.months();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology12.millisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter8.withChronology((org.joda.time.Chronology) gJChronology12);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        java.util.Locale locale24 = dateTimeFormatter22.getLocale();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = mutableDateTime28.toDateTimeISO();
        int int30 = mutableDateTime26.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime26.getZone();
        long long35 = dateTimeZone31.convertLocalToUTC(157766399999L, true, (long) 53620);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str41 = locale38.getDisplayCountry(locale39);
        java.lang.String str42 = locale37.getDisplayName(locale39);
        java.lang.String str43 = locale37.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale44);
        java.lang.String str46 = locale37.getDisplayVariant(locale44);
        java.lang.String str47 = dateTimeZone31.getName((long) 55653, locale37);
        long long49 = dateTimeZone31.nextTransition((long) 4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter22.withZone(dateTimeZone31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(53921039, 53727, (-52), 54083108, 842, dateTimeZone31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54083108 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str13, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 157766399999L + "'", long35 == 157766399999L);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Deutschland" + "'", str41, "Deutschland");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Chinesisch" + "'", str42, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chinesisch" + "'", str43, "Chinesisch");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 4L + "'", long49 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) (byte) 0);
        mutableDateTime3.addMillis(53620);
        int int19 = mutableDateTime3.getMinuteOfDay();
        org.joda.time.Instant instant20 = mutableDateTime3.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType21.getField((org.joda.time.Chronology) gJChronology25);
        org.joda.time.DurationField durationField31 = gJChronology25.hours();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology25.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology25.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime3, (org.joda.time.Chronology) gJChronology25);
        java.lang.String str37 = localDateTime36.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54215 + "'", int13 == 54215);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2022-02-21T00:00:53.620" + "'", str37, "2022-02-21T00:00:53.620");
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.secondOfMinute();
        org.joda.time.DurationField durationField9 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.era();
        org.joda.time.DurationField durationField11 = gJChronology3.millis();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.halfdays();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property7.addWrapFieldToCopy(53705);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("UTC");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.getScript();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale18);
        java.lang.String str20 = locale18.getDisplayScript();
        java.lang.String str21 = locale16.getDisplayVariant(locale18);
        java.lang.String str22 = property7.getAsShortText(locale18);
        java.lang.String str23 = locale18.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale18.getUnicodeLocaleType("2022-02-21T15:01:03.554Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-21T15:01:03.554Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "21" + "'", str22, "21");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "deu" + "'", str23, "deu");
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("UTC");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("53752569");
        java.util.Locale.Builder builder7 = builder5.setRegion("");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (long) 43, 7);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setLanguageTag("UTC");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = mutableDateTime23.toDateTimeISO();
        int int25 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = mutableDateTime27.toDateTimeISO();
        org.joda.time.DateTime.Property property29 = dateTime28.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withPeriodAdded(readablePeriod30, 0);
        int int33 = dateTime28.getSecondOfDay();
        mutableDateTime23.setDate((org.joda.time.ReadableInstant) dateTime28);
        mutableDateTime23.setMillisOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime23.era();
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str41 = locale38.getDisplayCountry(locale39);
        boolean boolean42 = locale38.hasExtensions();
        int int43 = property37.getMaximumShortTextLength(locale38);
        org.joda.time.MutableDateTime mutableDateTime44 = property37.roundHalfFloor();
        java.lang.String str45 = property37.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property37.getFieldType();
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.lang.String str48 = locale47.getScript();
        java.lang.String str49 = property37.getAsText(locale47);
        java.util.Locale.Builder builder50 = builder19.setLocale(locale47);
        java.lang.String str51 = dateTimeZone12.getName((long) 53636, locale47);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53, (int) (short) 1);
        java.lang.String str56 = gJChronology55.toString();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.monthOfYear();
        org.joda.time.Instant instant59 = gJChronology55.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology55.weekOfWeekyear();
        java.util.Locale locale61 = java.util.Locale.PRC;
        java.lang.String str62 = locale61.toLanguageTag();
        int int63 = dateTimeField60.getMaximumTextLength(locale61);
        boolean boolean64 = locale61.hasExtensions();
        java.lang.String str65 = locale47.getDisplayVariant(locale61);
        java.util.Locale.Builder builder66 = builder5.setLocale(locale61);
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder68 = builder66.setLocale(locale67);
        java.util.Locale locale69 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale69);
        java.util.Locale.Builder builder71 = builder66.setLocale(locale69);
        java.util.Locale.Builder builder73 = builder66.setLanguageTag("PM");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder75 = builder66.setScript("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 54215 + "'", int33 == 54215);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Deutschland" + "'", str41, "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 7 + "'", int43 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "era" + "'", str45, "era");
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ap. J.-C." + "'", str49, "ap. J.-C.");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str56, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.monthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime10.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology23);
        int int26 = localDateTime25.getDayOfWeek();
        long long28 = gJChronology18.set((org.joda.time.ReadablePartial) localDateTime25, (long) 7);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusWeeks((int) 'a');
        int int31 = localDateTime25.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.plus(readablePeriod32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfWeek();
        org.joda.time.DateTime dateTime35 = dateTime10.withFields((org.joda.time.ReadablePartial) localDateTime33);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology5.year();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField((org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType0.getField((org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (long) 43, 7);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        int int25 = localDateTime23.get(dateTimeFieldType24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minusDays((int) (byte) 100);
        int int28 = localDateTime23.getYear();
        int int29 = localDateTime23.getYearOfEra();
        int[] intArray31 = gJChronology21.get((org.joda.time.ReadablePartial) localDateTime23, 0L);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology21.halfdayOfDay();
        boolean boolean33 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1969, 12, 19, 0]");
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        java.lang.String str11 = gJChronology10.toString();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField13 = gJChronology10.eras();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        int int18 = dateTime17.getYearOfEra();
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.util.Calendar calendar20 = dateTime17.toCalendar(locale19);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromCalendarFields(calendar20);
        int int22 = localDateTime21.size();
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime21);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withPeriodAdded(readablePeriod24, 53731);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.property(dateTimeFieldType28);
        int int30 = localDateTime21.get(dateTimeFieldType28);
        int int31 = localDateTime21.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime21.plus(readablePeriod32);
        int[] intArray35 = gJChronology3.get((org.joda.time.ReadablePartial) localDateTime33, 1645455499624L);
        int int36 = localDateTime33.getMinuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str11, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455815527,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=527,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 22 + "'", int31 == 22);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[2022, 2, 21, 53899624]");
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        java.util.Locale locale3 = new java.util.Locale("jpn", "53971", "0022-02-21T14:54:31.594");
        org.junit.Assert.assertEquals(locale3.toString(), "jpn_53971_0022-02-21T14:54:31.594");
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekOfWeekyear();
        int int3 = mutableDateTime1.getMillisOfDay();
        boolean boolean4 = mutableDateTime1.isAfterNow();
        mutableDateTime1.setMinuteOfDay(0);
        long long7 = mutableDateTime1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.monthOfYear();
        java.lang.String str10 = property9.getName();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54215560 + "'", int3 == 54215560);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645401635560L + "'", long7 == 1645401635560L);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53649);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withDefaultYear(0);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable8, 1645455388223L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology4.getZone();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone6);
        int int8 = localDateTime7.getMonthOfYear();
        int int9 = localDateTime7.getEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withYear(970);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDurationAdded(readableDuration13, 54071);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long6 = gJChronology0.getDateTimeMillis(10L, (int) (byte) 1, 20, (int) (short) 1, 5);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.days();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology0.getDateTimeMillis((int) (byte) 0, 54124773, (-96008), 53850, 53828, 53759397, 54127);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53850 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4801005L + "'", long6 == 4801005L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        boolean boolean7 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusDays(4);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.dayOfYear();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime5, (long) '#');
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        java.lang.String str17 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.hourOfDay();
        org.joda.time.DurationField durationField19 = gJChronology3.months();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1645455815594L + "'", long13 == 1645455815594L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str17, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Chronology chronology8 = gJChronology3.withUTC();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology15);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.era();
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime((org.joda.time.Chronology) gJChronology15);
        java.lang.String str20 = gJChronology15.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str20, "GJChronology[UTC,mdfw=1]");
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusDays(4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = mutableDateTime9.toDateTimeISO();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime.Property property12 = dateTime10.millisOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withDurationAdded(readableDuration13, 21);
        int int16 = dateTime10.getSecondOfDay();
        long long17 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        boolean boolean19 = dateTime10.isEqual(18619060278993L);
        org.joda.time.DateTime dateTime21 = dateTime10.withYearOfEra(53633);
        org.joda.time.DateTime dateTime23 = dateTime10.minusMonths(53653);
        org.joda.time.DateMidnight dateMidnight24 = dateTime23.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime23.getZone();
        java.lang.String str26 = dateTimeZone25.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54215 + "'", int16 == 54215);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((-292275054));
        org.joda.time.DateTime.Property property13 = dateTime10.year();
        org.joda.time.DateTime dateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime22.toDateTimeISO();
        org.joda.time.DateTime.Property property24 = dateTime23.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withPeriodAdded(readablePeriod25, 0);
        int int28 = dateTime23.getSecondOfDay();
        mutableDateTime18.setDate((org.joda.time.ReadableInstant) dateTime23);
        mutableDateTime18.setMillisOfDay((int) (byte) 0);
        mutableDateTime18.addMillis(53620);
        int int34 = mutableDateTime18.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str36 = dateTimeZone35.getID();
        boolean boolean37 = dateTimeZone35.isFixed();
        java.lang.String str38 = dateTimeZone35.getID();
        mutableDateTime18.setZoneRetainFields(dateTimeZone35);
        boolean boolean40 = dateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime18.secondOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime18.weekyear();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.getMutableDateTime();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 54215 + "'", int28 == 54215);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("UTC");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder2.setLocale(locale3);
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale10.getDisplayScript();
        java.lang.String str12 = locale9.getDisplayCountry(locale10);
        java.lang.String str13 = locale8.getDisplayName(locale10);
        java.lang.String str14 = locale8.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale8.getDisplayVariant(locale15);
        java.util.Locale.Builder builder18 = builder6.setLocale(locale8);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology22.getZone();
        org.joda.time.Chronology chronology27 = gJChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology22.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        int int34 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime30.getZone();
        long long39 = dateTimeZone35.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekOfWeekyear();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.lang.String str44 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime41, locale43);
        java.lang.String str45 = locale43.getCountry();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.secondOfDay();
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.lang.String str51 = locale50.getDisplayName();
        java.lang.String str52 = dateTimeField48.getAsText(604800000L, locale50);
        java.lang.String str53 = locale43.getDisplayLanguage(locale50);
        java.lang.String str54 = locale50.getDisplayVariant();
        java.util.Locale.Builder builder55 = builder6.setLocale(locale50);
        java.util.Locale.Builder builder57 = builder55.setVariant("54041673");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deutschland" + "'", str12, "Deutschland");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinesisch" + "'", str13, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 157766399999L + "'", long39 == 157766399999L);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "54215" + "'", str44, "54215");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Italienisch" + "'", str51, "Italienisch");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "cinese" + "'", str53, "cinese");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((int) '#');
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.monthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = mutableDateTime17.toDateTimeISO();
        int int19 = mutableDateTime15.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withPeriodAdded(readablePeriod24, 0);
        int int27 = dateTime22.getSecondOfDay();
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) dateTime22);
        mutableDateTime17.setMillisOfDay((int) (byte) 0);
        mutableDateTime17.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime17.yearOfEra();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime17.hourOfDay();
        boolean boolean35 = property13.equals((java.lang.Object) mutableDateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType36.getRangeDurationType();
        mutableDateTime17.add(durationFieldType37, (int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime17.add(readableDuration40, 0);
        int int43 = mutableDateTime17.getRoundingMode();
        int int44 = mutableDateTime17.getYearOfEra();
        int int45 = mutableDateTime17.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime17.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54215 + "'", int27 == 54215);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10052 + "'", int44 == 10052);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology4.getZone();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone6);
        int int8 = localDateTime7.getMonthOfYear();
        int int9 = localDateTime7.getEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withYear(970);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withTime(636, 53890, 53680416, 53729);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 636 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("UTC");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder2.setLocale(locale3);
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("7043325");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        boolean boolean5 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime3);
        mutableDateTime1.setMinuteOfDay((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime1.add(readableDuration8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((-292275054));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime22 = dateTime14.withZone(dateTimeZone21);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        long long25 = dateTimeZone21.convertUTCToLocal((-1104311164030L));
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, readableInstant27, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology29.dayOfYear();
        org.joda.time.DurationField durationField36 = gJChronology29.years();
        boolean boolean37 = dateTimeZone21.equals((java.lang.Object) durationField36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = mutableDateTime41.toDateTimeISO();
        int int43 = mutableDateTime39.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = mutableDateTime45.toDateTimeISO();
        org.joda.time.DateTime.Property property47 = dateTime46.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime50 = dateTime46.withPeriodAdded(readablePeriod48, 0);
        int int51 = dateTime46.getSecondOfDay();
        mutableDateTime41.setDate((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime54 = dateTime46.minus(0L);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime55.toMutableDateTimeISO();
        boolean boolean57 = dateTime54.isAfter((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime56.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableDateTime56.add(readablePeriod59);
        mutableDateTime56.addSeconds(991);
        int int63 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime56.copy();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1104311164030L) + "'", long25 == (-1104311164030L));
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 54215 + "'", int51 == 54215);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime64);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology8);
        int int11 = localDateTime10.getDayOfWeek();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 7);
        org.joda.time.DurationField durationField14 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        java.lang.String str5 = gJChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.dayOfMonth();
        org.joda.time.DurationField durationField8 = gJChronology4.millis();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1645455183, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField10 = gJChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField14 = gJChronology4.hours();
        long long17 = durationField14.getMillis(53845, (long) 94);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str5, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 193842000000L + "'", long17 == 193842000000L);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusSeconds((int) (byte) 10);
        java.lang.String str11 = localDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean13 = localDateTime10.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfMonth(5);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        int int21 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime17.getZone();
        long long26 = dateTimeZone22.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime29 = localDateTime15.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology30 = gJChronology3.withZone(dateTimeZone22);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21T15:03:25.763" + "'", str11, "2022-02-21T15:03:25.763");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 157766399999L + "'", long26 == 157766399999L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        boolean boolean7 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusDays(4);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.minusMillis(10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime16.getZone();
        long long25 = dateTimeZone21.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusSeconds(21);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfDay();
        org.joda.time.DateTime.Property property34 = dateTime32.millisOfDay();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withDurationAdded(readableDuration35, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, readableInstant39, (int) (short) 1);
        java.lang.String str42 = gJChronology41.toString();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology41.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology41.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        boolean boolean47 = localDateTime45.isBefore((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.plusDays(4);
        org.joda.time.LocalDateTime.Property property51 = localDateTime45.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = mutableDateTime54.toDateTimeISO();
        int int56 = dateTime55.getYearOfEra();
        java.util.Locale locale57 = java.util.Locale.GERMANY;
        java.util.Calendar calendar58 = dateTime55.toCalendar(locale57);
        java.lang.String str59 = dateTimeField44.getAsText((org.joda.time.ReadablePartial) localDateTime45, 53621, locale57);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = dateTimeField44.getType();
        boolean boolean61 = dateTime32.isSupported(dateTimeFieldType60);
        boolean boolean62 = localDateTime29.isSupported(dateTimeFieldType60);
        int int63 = localDateTime14.indexOf(dateTimeFieldType60);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime14.minus(readableDuration64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime14.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime67 = property66.withMaximumValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 157766399999L + "'", long25 == 157766399999L);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str42, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar58);
// flaky:         org.junit.Assert.assertEquals(calendar58.toString(), "java.util.GregorianCalendar[time=1645455815778,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=778,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "53621" + "'", str59, "53621");
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime(dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.withDurationAdded(readableDuration18, 18);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 157766399999L + "'", long10 == 157766399999L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) (byte) 0);
        mutableDateTime3.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.yearOfEra();
        int int20 = property19.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.add(53630);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property19.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime25 = property19.add((long) (byte) -1);
        mutableDateTime25.addHours(28);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54215 + "'", int13 == 54215);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withDayOfYear((int) (short) 100);
        org.joda.time.DateTime dateTime6 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusSeconds(53629);
        int int9 = localDateTime8.getYearOfEra();
        int int10 = localDateTime8.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfYear(53873363);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53873363 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology8);
        int int11 = localDateTime10.getDayOfWeek();
        long long13 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusWeeks((int) 'a');
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology20.getZone();
        long long27 = dateTimeZone24.adjustOffset((long) 'a', true);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.lang.String str30 = dateTimeZone24.getName((long) 53625, locale29);
        long long34 = dateTimeZone24.convertLocalToUTC((long) (byte) 10, false, 4200530946L);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37, (int) (short) 1);
        java.lang.String str40 = gJChronology39.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology39.hourOfHalfday();
        org.joda.time.DurationField durationField42 = gJChronology39.eras();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology39.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = dateTimeField43.getType();
        long long47 = dateTimeField43.add((long) 53636, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48, readableInstant49, (int) (short) 1);
        java.lang.String str52 = gJChronology51.toString();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology51.hourOfHalfday();
        org.joda.time.DurationField durationField54 = gJChronology51.eras();
        org.joda.time.DateTimeZone dateTimeZone55 = gJChronology51.getZone();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = mutableDateTime57.toDateTimeISO();
        int int59 = dateTime58.getYearOfEra();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Calendar calendar61 = dateTime58.toCalendar(locale60);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.fromCalendarFields(calendar61);
        int int63 = localDateTime62.size();
        boolean boolean64 = dateTimeZone55.isLocalDateTimeGap(localDateTime62);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime62.withPeriodAdded(readablePeriod65, 53731);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime62.plusMillis(53757836);
        java.util.Locale locale72 = new java.util.Locale("2022-02-21T14:54:17.751");
        java.lang.String str73 = locale72.getDisplayCountry();
        java.lang.String str74 = dateTimeField43.getAsText((org.joda.time.ReadablePartial) localDateTime69, 53649388, locale72);
        boolean boolean75 = dateTimeZone24.isLocalDateTimeGap(localDateTime69);
        int int76 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime69.minusYears(483);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str40, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53636L + "'", long47 == 53636L);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str52, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar61);
// flaky:         org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=1645455815857,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=857,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertEquals(locale72.toString(), "2022-02-21t14:54:17.751");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "53649388" + "'", str74, "53649388");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(localDateTime78);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 0);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant9 = instant7.withMillis(0L);
        org.joda.time.Instant instant12 = instant7.withDurationAdded((-43200000L), 53676398);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.minus(readableDuration13);
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        mutableDateTime15.setSecondOfDay(603);
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime15.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayName();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.Chronology chronology11 = gJChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        int int18 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime14.getZone();
        long long23 = dateTimeZone19.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekOfWeekyear();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.lang.String str28 = dateTimeField12.getAsText((org.joda.time.ReadablePartial) localDateTime25, locale27);
        java.lang.String str29 = locale27.getCountry();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.secondOfDay();
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale34.getDisplayName();
        java.lang.String str36 = dateTimeField32.getAsText(604800000L, locale34);
        java.lang.String str37 = locale27.getDisplayLanguage(locale34);
        java.lang.String str38 = locale1.getDisplayName(locale27);
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale41);
        java.lang.String str43 = locale41.getVariant();
        java.util.Set<java.lang.String> strSet44 = locale41.getUnicodeLocaleKeys();
        java.lang.String str45 = locale39.getDisplayCountry(locale41);
        java.lang.String str46 = locale27.getDisplayCountry(locale41);
        java.lang.String str47 = locale41.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsch (Deutschland)" + "'", str2, "Deutsch (Deutschland)");
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 157766399999L + "'", long23 == 157766399999L);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "54215" + "'", str28, "54215");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Italienisch" + "'", str35, "Italienisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "cinese" + "'", str37, "cinese");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str38, "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Taiwan" + "'", str45, "Taiwan");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "de_DE" + "'", str47, "de_DE");
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(2022);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology4);
        int int7 = localDateTime6.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDayOfMonth(7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        int int15 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime11.getZone();
        long long20 = dateTimeZone16.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = localDateTime6.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime6.minusMinutes(59);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime6.plusWeeks(35);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readableDuration27);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 157766399999L + "'", long20 == 157766399999L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-21T14:59:25.423Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-21T14:59:25.423Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime6 = property4.getDateTime();
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 7, 53619);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        org.joda.time.DateTime dateTime17 = dateTime15.minusSeconds(59);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        int int23 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime17, dateTimeZone24);
        boolean boolean33 = dateTimeZone10.equals((java.lang.Object) localDateTime32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        boolean boolean36 = localDateTime34.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusDays(4);
        org.joda.time.DurationFieldType durationFieldType40 = null;
        boolean boolean41 = localDateTime39.isSupported(durationFieldType40);
        int int42 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime32.withWeekyear(53765059);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime47 = property45.addToCopy(88365903634950241L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 88365903634950241");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 157766399999L + "'", long28 == 157766399999L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        long long11 = gJChronology5.getDateTimeMillis(10L, (int) (byte) 1, 20, (int) (short) 1, 5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) gJChronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 53699801);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear(208);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4801005L + "'", long11 == 4801005L);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        boolean boolean6 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime2.setMinuteOfDay((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime2.add(readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((-292275054));
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        int int21 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime17.getZone();
        org.joda.time.DateTime dateTime23 = dateTime15.withZone(dateTimeZone22);
        mutableDateTime2.setZoneRetainFields(dateTimeZone22);
        long long26 = dateTimeZone22.convertUTCToLocal((-1104311164030L));
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone22);
        java.lang.String str28 = dateTimeZone22.toString();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj0, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        boolean boolean33 = localDateTime31.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.plusDays(53723412);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, readableInstant38, (int) (short) 1);
        java.lang.String str41 = gJChronology40.toString();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.era();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology40.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology40.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(113624L, (org.joda.time.Chronology) gJChronology40);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekyear();
        int int51 = localDateTime49.get(dateTimeFieldType50);
        int int52 = localDateTime49.getSecondOfMinute();
        int int53 = localDateTime49.getEra();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, readableInstant55, (int) (short) 1);
        java.lang.String str58 = gJChronology57.toString();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology57.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology57.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime();
        boolean boolean63 = localDateTime61.isBefore((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime61.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.plusDays(4);
        org.joda.time.LocalDateTime.Property property67 = localDateTime61.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = mutableDateTime70.toDateTimeISO();
        int int72 = dateTime71.getYearOfEra();
        java.util.Locale locale73 = java.util.Locale.GERMANY;
        java.util.Calendar calendar74 = dateTime71.toCalendar(locale73);
        java.lang.String str75 = dateTimeField60.getAsText((org.joda.time.ReadablePartial) localDateTime61, 53621, locale73);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = dateTimeField60.getType();
        int int77 = localDateTime49.get(dateTimeFieldType76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime48.property(dateTimeFieldType76);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime80 = org.joda.time.MutableDateTime.now(dateTimeZone79);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime83 = mutableDateTime82.toDateTimeISO();
        boolean boolean84 = mutableDateTime80.isBefore((org.joda.time.ReadableInstant) mutableDateTime82);
        mutableDateTime82.setMillisOfSecond((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime82.year();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime82.era();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime82.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = property89.getFieldType();
        int int91 = localDateTime48.get(dateTimeFieldType90);
        org.joda.time.LocalDateTime.Property property92 = localDateTime35.property(dateTimeFieldType90);
        java.lang.String str93 = dateTimeFieldType90.getName();
        boolean boolean94 = mutableDateTime30.isSupported(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1104311164030L) + "'", long26 == (-1104311164030L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str41, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2022 + "'", int51 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str58, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2022 + "'", int72 == 2022);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar74);
// flaky:         org.junit.Assert.assertEquals(calendar74.toString(), "java.util.GregorianCalendar[time=1645455815969,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=969,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "53621" + "'", str75, "53621");
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 21 + "'", int77 == 21);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 53 + "'", int91 == 53);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "secondOfMinute" + "'", str93, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setSecondOfDay(1);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime3.year();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime3.minuteOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.era();
        mutableDateTime3.setMillis(62531664L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("GMT", strMap1);
        java.util.Set<java.lang.String> strSet3 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet3.clear();
        java.util.List<java.lang.String> strList5 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap8);
        org.joda.time.tz.Provider provider10 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet11 = provider10.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strSet11, filteringMode12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("GMT", strMap19);
        java.util.Set<java.lang.String> strSet21 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet21.clear();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList20, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Set<java.lang.String> strSet29 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str30 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Collection<java.util.Locale> localeCollection31 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.parse("GMT", strMap33);
        java.util.Set<java.lang.String> strSet35 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet35.clear();
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strSet35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList34, strMap38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList39, strMap40);
        org.joda.time.tz.Provider provider42 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet43 = provider42.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strSet43, filteringMode44);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, localeCollection31, filteringMode44);
        java.util.stream.Stream<java.util.Locale> localeStream47 = localeList46.parallelStream();
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.stream.Stream<java.util.Locale> localeStream49 = localeList48.stream();
        java.util.Locale locale50 = java.util.Locale.lookup(languageRangeList15, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Set<java.lang.String> strSet57 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strSet57);
        java.lang.String str59 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strSet57);
        int int60 = strSet57.size();
        boolean boolean62 = strSet57.add("2022-02-21T14:53:56.237Z");
        java.lang.Object[] objArray63 = strSet57.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator64 = strSet57.spliterator();
        java.lang.String str65 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet57);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(provider10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode12.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(provider42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode44.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeStream47);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(localeStream49);
        org.junit.Assert.assertNull(locale50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[2022-02-21T14:53:56.237Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[2022-02-21T14:53:56.237Z]");
        org.junit.Assert.assertNotNull(strSpliterator64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusDays(4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMinimumValue();
        int int8 = localDateTime7.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime10.getValue(314);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 314");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 0);
        int int7 = dateTime2.getSecondOfDay();
        org.joda.time.DateTime.Property property8 = dateTime2.minuteOfHour();
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfWeek();
        int int10 = property9.get();
        org.joda.time.DateTime dateTime11 = property9.getDateTime();
        org.joda.time.DateTime dateTime12 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54216 + "'", int7 == 54216);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) (byte) 0);
        mutableDateTime3.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.yearOfEra();
        int int20 = property19.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.add(53630);
        mutableDateTime22.setMillis((long) 12);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        java.lang.String[] strArray13 = new java.lang.String[] { "UTC", "2022-02-21T14:53:41.525", "Deutsch", "7", "secondOfMinute", "Heure de Greenwich", "2022-02-21T14:53:47.633Z", "secondOfMinute", "", "2022-02-21T14:53:53.370Z", "2022-02-21T14:53:33.782", "DurationField[hours]", "2022-02-21T14:53:33.782" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.Object[] objArray16 = strSet14.toArray();
        int int17 = strSet14.size();
        strSet14.clear();
        boolean boolean19 = strSet14.isEmpty();
        java.util.Iterator<java.lang.String> strItor20 = strSet14.iterator();
        boolean boolean22 = strSet14.add("2022-02-21T15:02:04.159");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[UTC, 2022-02-21T14:53:41.525, Deutsch, 7, secondOfMinute, Heure de Greenwich, 2022-02-21T14:53:47.633Z, , 2022-02-21T14:53:53.370Z, 2022-02-21T14:53:33.782, DurationField[hours]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[UTC, 2022-02-21T14:53:41.525, Deutsch, 7, secondOfMinute, Heure de Greenwich, 2022-02-21T14:53:47.633Z, , 2022-02-21T14:53:53.370Z, 2022-02-21T14:53:33.782, DurationField[hours]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.era();
        int int8 = localDateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusWeeks(15);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(53644);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfMonth(53892);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53892 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("UTC");
        java.lang.String str6 = languageRange5.getRange();
        double double7 = languageRange5.getWeight();
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("UTC");
        double double10 = languageRange9.getWeight();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("gmt");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange9, languageRange12 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("GMT", strMap19);
        java.util.Set<java.lang.String> strSet21 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet21.clear();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList20, strMap24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList25, strMap26);
        org.joda.time.tz.Provider provider28 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet29 = provider28.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList25, (java.util.Collection<java.lang.String>) strSet29, filteringMode30);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet29);
        strSet29.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "utc" + "'", str2, "utc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "utc" + "'", str3, "utc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "utc" + "'", str6, "utc");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(provider28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode30.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(53654);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) gJChronology10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime22.toDateTimeISO();
        org.joda.time.DateTime.Property property24 = dateTime23.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withPeriodAdded(readablePeriod25, 0);
        int int28 = dateTime23.getSecondOfDay();
        mutableDateTime18.setDate((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime31 = dateTime23.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTime dateTime33 = dateTime23.withMinuteOfHour(4);
        boolean boolean35 = dateTime23.isEqual(1640995200000L);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = mutableDateTime40.toDateTimeISO();
        int int42 = mutableDateTime38.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime38.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = mutableDateTime47.toDateTimeISO();
        int int49 = mutableDateTime45.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        int int50 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) mutableDateTime45);
        long long53 = dateTimeZone43.adjustOffset(10L, false);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj36, dateTimeZone43);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime56 = dateTime23.withZoneRetainFields(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter2.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = mutableDateTime59.toDateTimeISO();
        org.joda.time.DateTime.Property property61 = dateTime60.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.DateTime dateTime64 = dateTime60.withPeriodAdded(readablePeriod62, 0);
        org.joda.time.Instant instant65 = dateTime64.toInstant();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.UTC;
        int int69 = dateTimeZone67.getOffsetFromLocal((long) 53621);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(97L, dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime72 = instant65.toDateTime(dateTimeZone67);
        org.joda.time.Instant instant74 = instant65.withMillis((long) (short) 0);
        org.joda.time.Instant instant76 = instant74.withMillis((long) 292278993);
        org.joda.time.DateTimeZone dateTimeZone77 = instant76.getZone();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter2.withZone(dateTimeZone77);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate81 = dateTimeFormatter2.parseLocalDate("2022-02-21T14:59:50.177Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 54216 + "'", int28 == 54216);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(instant74);
        org.junit.Assert.assertNotNull(instant76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter3.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.minuteOfHour();
        org.joda.time.DurationField durationField14 = gJChronology9.centuries();
        org.joda.time.DurationField durationField15 = gJChronology9.months();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gJChronology9);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter3.withChronology((org.joda.time.Chronology) gJChronology9);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter18.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = dateTimeFormatter18.parseLocalDateTime("2050-02-21T14:59:51.336Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeParser19);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField5 = gJChronology3.halfdays();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        int int10 = dateTimeZone8.getOffsetFromLocal((long) 53621);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(97L, dateTimeZone8);
        boolean boolean12 = dateTimeZone6.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.year();
        int int14 = localDateTime11.getMinuteOfHour();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("hi!");
        int int17 = timeZone16.getRawOffset();
        java.lang.String str18 = timeZone16.getID();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology34.getZone();
        long long41 = dateTimeZone38.adjustOffset((long) 'a', true);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.lang.String str44 = dateTimeZone38.getName((long) 53625, locale43);
        long long48 = dateTimeZone38.convertLocalToUTC((long) (byte) 10, false, 4200530946L);
        org.joda.time.Chronology chronology49 = gJChronology24.withZone(dateTimeZone38);
        long long51 = dateTimeZone19.getMillisKeepLocal(dateTimeZone38, 67623L);
        int int53 = dateTimeZone19.getOffsetFromLocal((long) 664);
        long long55 = dateTimeZone19.previousTransition((long) 53873363);
        org.joda.time.DateTime dateTime56 = localDateTime11.toDateTime(dateTimeZone19);
        int int57 = localDateTime11.getCenturyOfEra();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GMT" + "'", str18, "GMT");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 67623L + "'", long51 == 67623L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 53873363L + "'", long55 == 53873363L);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 19 + "'", int57 == 19);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        boolean boolean2 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getCenturyOfEra();
        int int4 = localDateTime0.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.Interval interval7 = property5.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.minus(0L);
        org.joda.time.DateTime dateTime18 = dateTime8.plusMillis(21);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime21 = dateTime18.minusMonths(53775);
        int int22 = dateTime21.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withPeriodAdded(readablePeriod23, 53737);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean19 = property17.equals((java.lang.Object) dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.add(16592L);
        org.joda.time.MutableDateTime mutableDateTime23 = property17.set(53910);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime23.setDayOfYear(53658);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53658 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.minus(0L);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.toMutableDateTimeISO();
        boolean boolean19 = dateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        int int20 = mutableDateTime18.getHourOfDay();
        long long21 = mutableDateTime18.getMillis();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        int int27 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        long long32 = dateTimeZone28.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusSeconds(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = localDateTime36.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.plusYears(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str42 = dateTimeFieldType41.getName();
        boolean boolean43 = localDateTime36.isSupported(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType41.getDurationType();
        mutableDateTime18.add(durationFieldType44, 53701);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime18.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundCeiling();
        org.joda.time.DurationField durationField49 = property47.getRangeDurationField();
        int int50 = property47.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1645455816237L + "'", long21 == 1645455816237L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 157766399999L + "'", long32 == 157766399999L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "clockhourOfHalfday" + "'", str42, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1439 + "'", int50 == 1439);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime7.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime.Property property14 = dateTime12.millisOfDay();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 21);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(53683);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMinutes(53703714);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readableDuration22);
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        boolean boolean25 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.clockhourOfHalfday();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.clockhourOfHalfday();
        int int10 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        boolean boolean14 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        int int17 = localDateTime15.get(dateTimeFieldType16);
        boolean boolean18 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property19 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy(12);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(11);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plus(readableDuration24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withWeekyear(988);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology31.dayOfYear();
        long long38 = dateTimeField36.roundHalfEven(1645455226648L);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        boolean boolean41 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusDays(4);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.minusSeconds(100);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plus(readableDuration47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withPeriodAdded(readablePeriod49, 53625);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53, (int) (short) 1);
        java.lang.String str56 = gJChronology55.toString();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime();
        boolean boolean60 = localDateTime58.isBefore((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyear();
        int int63 = localDateTime61.get(dateTimeFieldType62);
        boolean boolean64 = localDateTime59.isAfter((org.joda.time.ReadablePartial) localDateTime61);
        org.joda.time.LocalDateTime.Property property65 = localDateTime59.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime67 = property65.addToCopy(12);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks(11);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime();
        boolean boolean72 = localDateTime70.isBefore((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime70.plusDays(4);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime70.minusSeconds(100);
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.plus(readableDuration78);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime77.withPeriodAdded(readablePeriod80, 53625);
        int[] intArray83 = localDateTime77.getValues();
        gJChronology55.validate((org.joda.time.ReadablePartial) localDateTime69, intArray83);
        int int85 = dateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) localDateTime51, intArray83);
        int int86 = dateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) localDateTime27, intArray83);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1645488000000L + "'", long38 == 1645488000000L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str56, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2022 + "'", int63 == 2022);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(intArray83);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[2022, 2, 21, 54116277]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-292269054) + "'", int86 == (-292269054));
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) (byte) 0);
        mutableDateTime3.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.yearOfEra();
        int int20 = property19.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.add(53630);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property19.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime25 = property19.set(292278993);
        org.joda.time.MutableDateTime mutableDateTime26 = property19.roundFloor();
        boolean boolean28 = mutableDateTime26.isAfter((-52L));
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology5);
        int int8 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDayOfMonth(7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = mutableDateTime14.toDateTimeISO();
        int int16 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime12.getZone();
        long long21 = dateTimeZone17.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.DateTime dateTime23 = localDateTime7.toDateTime(dateTimeZone17);
        long long26 = dateTimeZone17.convertLocalToUTC(18619060278993L, false);
        int int28 = dateTimeZone17.getOffsetFromLocal((long) 53697);
        long long30 = dateTimeZone17.convertUTCToLocal(1645455321236L);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 86404506, dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDateTime31.getFieldType(53749);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53749");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 157766399999L + "'", long21 == 157766399999L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 18619060278993L + "'", long26 == 18619060278993L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1645455321236L + "'", long30 == 1645455321236L);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(53654);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) gJChronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = dateTimeFormatter14.parseLocalDateTime("2022-04-10T15:03:15.279");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology5);
        org.joda.time.DurationField durationField8 = durationFieldType0.getField((org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = mutableDateTime14.toDateTimeISO();
        int int16 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withPeriodAdded(readablePeriod21, 0);
        int int24 = dateTime19.getSecondOfDay();
        mutableDateTime14.setDate((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime27 = dateTime19.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology32.getZone();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) gJChronology32);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.millisOfDay();
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str41 = locale38.getDisplayCountry(locale39);
        java.lang.String str42 = locale37.getDisplayName(locale39);
        java.lang.String str43 = locale37.getDisplayLanguage();
        java.lang.String str44 = dateTimeField35.getAsText((long) 53630, locale37);
        int int45 = dateTime27.get(dateTimeField35);
        org.joda.time.DateTime dateTime46 = dateTime27.toDateTimeISO();
        java.lang.String str47 = dateTime27.toString();
        boolean boolean48 = dateTimeZone10.equals((java.lang.Object) dateTime27);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 54216 + "'", int24 == 54216);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Deutschland" + "'", str41, "Deutschland");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Chinesisch" + "'", str42, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chinesisch" + "'", str43, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "53630" + "'", str44, "53630");
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 54190378 + "'", int45 == 54190378);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2022-02-21T15:03:10.378Z" + "'", str47, "2022-02-21T15:03:10.378Z");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withDayOfYear((int) (short) 100);
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withWeekyear(1970);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.secondOfDay();
        int int12 = mutableDateTime10.getRoundingMode();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.Instant instant15 = mutableDateTime10.toInstant();
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) instant15);
        int int17 = localDateTime8.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime8.withDurationAdded(readableDuration18, 55653);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime8.withCenturyOfEra(53697);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withCenturyOfEra(53737649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53737649 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Sun Apr 10 15:03:36 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        java.lang.String str5 = gJChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        boolean boolean9 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        int int12 = localDateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy(12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks(11);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        boolean boolean21 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusDays(4);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.minusSeconds(100);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readableDuration27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withPeriodAdded(readablePeriod29, 53625);
        int[] intArray32 = localDateTime26.getValues();
        gJChronology4.validate((org.joda.time.ReadablePartial) localDateTime18, intArray32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology4.clockhourOfDay();
        org.joda.time.DurationField durationField35 = gJChronology4.minutes();
        boolean boolean36 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology4.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = mutableDateTime41.toDateTimeISO();
        int int43 = mutableDateTime39.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime39.getZone();
        long long48 = dateTimeZone44.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = localDateTime50.toDateTime(dateTimeZone53);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.minus(readablePeriod56);
        org.joda.time.DateTime dateTime59 = dateTime55.plusMonths(53638);
        org.joda.time.DateTime dateTime61 = dateTime55.withMillisOfDay(0);
        int int62 = dateTime61.getYearOfEra();
        org.joda.time.DateTime dateTime63 = dateTime61.withLaterOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime64 = dateTime61.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone65, readableInstant66, (int) (short) 1);
        java.lang.String str69 = gJChronology68.toString();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology68.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology68.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology68.year();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology68.secondOfMinute();
        java.util.Locale locale75 = java.util.Locale.JAPANESE;
        java.lang.String str76 = dateTimeField73.getAsText(53634, locale75);
        java.lang.String str77 = locale75.getDisplayName();
        java.lang.String str79 = locale75.getExtension('u');
        java.lang.String str80 = dateTimeField37.getAsShortText((org.joda.time.ReadablePartial) localDateTime64, locale75);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str5, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(intArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[2022, 2, 21, 54116429]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 157766399999L + "'", long48 == 157766399999L);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2022 + "'", int62 == 2022);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(gJChronology68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str69, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "53634" + "'", str76, "53634");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Japanisch" + "'", str77, "Japanisch");
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "2022" + "'", str80, "2022");
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        java.lang.String str5 = gJChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.monthOfYear();
        org.joda.time.Instant instant8 = gJChronology4.getGregorianCutover();
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.withYear((int) '#');
        org.joda.time.YearMonthDay yearMonthDay12 = dateTime9.toYearMonthDay();
        int[] intArray14 = gJChronology0.get((org.joda.time.ReadablePartial) yearMonthDay12, 18619060278993L);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        int int23 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        org.joda.time.DateTime.Property property27 = dateTime26.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withPeriodAdded(readablePeriod28, 0);
        int int31 = dateTime26.getSecondOfDay();
        mutableDateTime21.setDate((org.joda.time.ReadableInstant) dateTime26);
        mutableDateTime21.setMillisOfDay((int) (byte) 0);
        mutableDateTime21.setWeekyear((int) '4');
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime21.yearOfEra();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime21.hourOfDay();
        int int39 = mutableDateTime21.getWeekOfWeekyear();
        int int40 = mutableDateTime21.getSecondOfDay();
        java.util.Locale locale41 = java.util.Locale.JAPAN;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet43 = locale41.getExtensionKeys();
        java.util.Calendar calendar44 = mutableDateTime21.toCalendar(locale41);
        java.lang.String str45 = dateTimeField16.getAsText((long) 483, locale41);
        java.lang.String str47 = dateTimeField16.getAsText((long) 53905186);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str5, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2560, 1, 6]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 54216 + "'", int31 == 54216);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Japanisch" + "'", str42, "Japanisch");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertNotNull(calendar44);
        org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=-60521990400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u897f\u66a6" + "'", str45, "\u897f\u66a6");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "n. Chr." + "'", str47, "n. Chr.");
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant5, (int) (short) 1);
        java.lang.String str8 = gJChronology7.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.monthOfYear();
        org.joda.time.Instant instant11 = gJChronology7.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology7.secondOfMinute();
        org.joda.time.DurationField durationField15 = gJChronology7.months();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology7.millisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter3.withChronology((org.joda.time.Chronology) gJChronology7);
        org.joda.time.Chronology chronology18 = dateTimeFormatter17.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter17.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = dateTimeFormatter17.parseLocalDateTime("2022-02-21T14:59:15.403");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str8, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeParser20);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        int int2 = localDateTime0.get(dateTimeFieldType1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusDays((int) (byte) 100);
        int int5 = localDateTime0.getYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusWeeks(53772);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withWeekyear(54060);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths(53638);
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(53685);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.plus(readablePeriod24);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 157766399999L + "'", long10 == 157766399999L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        int int12 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        int int13 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) mutableDateTime8);
        long long16 = dateTimeZone6.adjustOffset(10L, false);
        long long18 = dateTimeZone6.previousTransition((long) 53880);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 53880L + "'", long18 == 53880L);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        boolean boolean15 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        mutableDateTime13.addWeekyears((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime13.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        int int27 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        int int34 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        int int35 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) mutableDateTime30);
        long long38 = dateTimeZone28.adjustOffset(10L, false);
        mutableDateTime21.setZoneRetainFields(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology41 = gJChronology3.withZone(dateTimeZone28);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        int int2 = localDateTime0.get(dateTimeFieldType1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusSeconds((int) (byte) 10);
        java.lang.String str5 = localDateTime4.toString();
        int int6 = localDateTime4.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withWeekOfWeekyear(11);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours(2);
        int int11 = localDateTime8.getYear();
        java.util.Date date12 = localDateTime8.toDate();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T15:03:26.590" + "'", str5, "2022-02-21T15:03:26.590");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Mar 14 15:03:26 GMT 2022");
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.weekyear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        boolean boolean5 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime3);
        mutableDateTime1.setMinuteOfDay((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime1.add(readableDuration8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((-292275054));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        int int20 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime22 = dateTime14.withZone(dateTimeZone21);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str25 = dateTimeZone24.getID();
        boolean boolean26 = dateTimeZone24.isFixed();
        java.lang.String str27 = dateTimeZone24.getID();
        org.joda.time.DateTime dateTime28 = mutableDateTime1.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = gJChronology33.getZone();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, (long) 43, 7);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder41 = builder39.setLanguageTag("UTC");
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = mutableDateTime45.toDateTimeISO();
        int int47 = mutableDateTime43.compareTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = mutableDateTime49.toDateTimeISO();
        org.joda.time.DateTime.Property property51 = dateTime50.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.withPeriodAdded(readablePeriod52, 0);
        int int55 = dateTime50.getSecondOfDay();
        mutableDateTime45.setDate((org.joda.time.ReadableInstant) dateTime50);
        mutableDateTime45.setMillisOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime45.era();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.lang.String str62 = locale61.getDisplayScript();
        java.lang.String str63 = locale60.getDisplayCountry(locale61);
        boolean boolean64 = locale60.hasExtensions();
        int int65 = property59.getMaximumShortTextLength(locale60);
        org.joda.time.MutableDateTime mutableDateTime66 = property59.roundHalfFloor();
        java.lang.String str67 = property59.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property59.getFieldType();
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.lang.String str70 = locale69.getScript();
        java.lang.String str71 = property59.getAsText(locale69);
        java.util.Locale.Builder builder72 = builder41.setLocale(locale69);
        java.lang.String str73 = dateTimeZone34.getName((long) 53636, locale69);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.chrono.GJChronology gJChronology77 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone74, readableInstant75, (int) (short) 1);
        java.lang.String str78 = gJChronology77.toString();
        org.joda.time.DateTimeField dateTimeField79 = gJChronology77.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField80 = gJChronology77.monthOfYear();
        org.joda.time.Instant instant81 = gJChronology77.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology77.weekOfWeekyear();
        java.util.Locale locale83 = java.util.Locale.PRC;
        java.lang.String str84 = locale83.toLanguageTag();
        int int85 = dateTimeField82.getMaximumTextLength(locale83);
        boolean boolean86 = locale83.hasExtensions();
        java.lang.String str87 = locale69.getDisplayVariant(locale83);
        int int88 = property29.getMaximumShortTextLength(locale83);
        boolean boolean89 = property29.isLeap();
        org.joda.time.MutableDateTime mutableDateTime91 = property29.add(996);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 54216 + "'", int55 == 54216);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Deutschland" + "'", str63, "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 7 + "'", int65 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "era" + "'", str67, "era");
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ap. J.-C." + "'", str71, "ap. J.-C.");
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:00" + "'", str73, "+00:00");
        org.junit.Assert.assertNotNull(gJChronology77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str78, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "zh-CN" + "'", str84, "zh-CN");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(mutableDateTime91);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime8.plus(readableDuration15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        java.lang.String str19 = property17.getAsText();
        org.joda.time.DateTime dateTime20 = property17.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54216 + "'", int13 == 54216);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "22" + "'", str19, "22");
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 53712778);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.secondOfDay();
        boolean boolean6 = mutableDateTime3.isEqual((long) 4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.minuteOfHour();
        mutableDateTime3.setDate(5L);
        mutableDateTime3.addMinutes(53807);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        int int17 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime13.getZone();
        long long22 = dateTimeZone18.convertLocalToUTC(157766399999L, true, (long) 53620);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusSeconds(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime26.getFieldType(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy(938L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = mutableDateTime35.toDateTimeISO();
        int int37 = mutableDateTime33.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        org.joda.time.DateTime.Property property41 = dateTime40.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withPeriodAdded(readablePeriod42, 0);
        int int45 = dateTime40.getSecondOfDay();
        mutableDateTime35.setDate((org.joda.time.ReadableInstant) dateTime40);
        mutableDateTime35.setMillisOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime35.era();
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.lang.String str52 = locale51.getDisplayScript();
        java.lang.String str53 = locale50.getDisplayCountry(locale51);
        boolean boolean54 = locale50.hasExtensions();
        int int55 = property49.getMaximumShortTextLength(locale50);
        org.joda.time.MutableDateTime mutableDateTime56 = property49.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property49.getFieldType();
        int int58 = localDateTime31.indexOf(dateTimeFieldType57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime3.property(dateTimeFieldType57);
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType57.getDurationType();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime1.property(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 157766399999L + "'", long22 == 157766399999L);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 54216 + "'", int45 == 54216);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Deutschland" + "'", str53, "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 7 + "'", int55 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertNotNull(property61);
    }
}
