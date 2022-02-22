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
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        int int3 = mutableDateTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test21502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21502");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology2.getZone();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-95903));
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.minus(readablePeriod16);
        org.joda.time.DateMidnight dateMidnight18 = dateTime13.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int20 = dateMidnight18.get(dateTimeFieldType19);
        java.lang.String str21 = dateTimeFieldType19.toString();
        org.joda.time.LocalDate.Property property22 = localDate8.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate8.withCenturyOfEra(59505121);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59505121 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "weekOfWeekyear" + "'", str21, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test21503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21503");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear(436);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        int int13 = dateTime11.getYear();
        org.joda.time.DateTime dateTime14 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean18 = dateTimeZone17.isFixed();
        int int20 = dateTimeZone17.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime21 = dateTime14.withZoneRetainFields(dateTimeZone17);
        long long24 = dateTimeZone17.adjustOffset((long) 999, true);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime26 = localDate6.toDateTimeAtMidnight(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime26.withSecondOfMinute((-457037));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -457037 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 213120000 + "'", int20 == 213120000);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 999L + "'", long24 == 999L);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test21504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21504");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(11);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        int int14 = dateTime13.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = dateTime13.get(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property25 = dateTime13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime13.withZone(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime29 = localTime0.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime31 = dateTime13.withYearOfEra(1111);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test21505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21505");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.halfdayOfDay();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("34320035");
        java.lang.String str10 = dateTimeField6.getAsShortText(5555771430L, locale9);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("fr");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale14.getDisplayVariant();
        java.util.Locale.Builder builder16 = builder11.setLocale(locale14);
        java.util.Locale.Builder builder18 = builder11.setRegion("fr");
        java.util.Locale locale19 = builder18.build();
        java.lang.String str20 = locale9.getDisplayVariant(locale19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime23.toDateTimeToday(dateTimeZone26);
        boolean boolean29 = dateTime27.isAfter((long) 2);
        org.joda.time.DateTime dateTime31 = dateTime27.minusDays(1);
        org.joda.time.DateTime dateTime33 = dateTime27.minusHours((-1));
        java.lang.String str34 = dateTime27.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone36);
        org.joda.time.LocalTime localTime39 = localTime37.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localTime37.toDateTimeToday(dateTimeZone40);
        int int42 = dateTime41.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int44 = dateTime41.get(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone46);
        org.joda.time.LocalTime localTime49 = localTime47.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localTime47.toDateTimeToday(dateTimeZone50);
        int int52 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean53 = dateTime27.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime27.toMutableDateTimeISO();
        boolean boolean56 = dateTime27.isBefore((-5679974778000L));
        org.joda.time.DateTime.Property property57 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime59 = dateTime27.withYear(0);
        org.joda.time.DateTime.Property property60 = dateTime59.minuteOfHour();
        java.util.Locale locale62 = java.util.Locale.CHINA;
        boolean boolean63 = locale62.hasExtensions();
        java.util.Set<java.lang.String> strSet64 = locale62.getUnicodeLocaleAttributes();
        java.util.Locale locale65 = locale62.stripExtensions();
        org.joda.time.DateTime dateTime66 = property60.setCopy("12", locale62);
        java.lang.String str67 = locale9.getDisplayName(locale62);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PM" + "'", str10, "PM");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-24T11:11:59.999+59:12" + "'", str34, "2022-02-24T11:11:59.999+59:12");
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test21506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        int int6 = localDate4.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate4.minusYears(10);
        int[] intArray9 = localDate4.getValues();
        org.joda.time.LocalDate.Property property10 = localDate4.era();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property10.roundHalfCeilingCopy();
        int int13 = localDate12.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str15 = dateTimeFieldType14.toString();
        int int16 = localDate12.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime1.withField(dateTimeFieldType14, 0);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        java.util.Date date22 = localDate20.toDate();
        org.joda.time.LocalDate localDate24 = localDate20.minusMonths(292278993);
        int int25 = localDate20.getMonthOfYear();
        org.joda.time.LocalDate localDate27 = localDate20.plusWeeks(2131200);
        org.joda.time.DateTime dateTime28 = dateTime18.withFields((org.joda.time.ReadablePartial) localDate27);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "yearOfCentury" + "'", str15, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Thu Feb 24 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test21507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21507");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.DateMidnight dateMidnight5 = localDate2.toDateMidnight();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test21508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21508");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(4);
        org.joda.time.DateTime.Property property11 = dateTime8.minuteOfDay();
        boolean boolean12 = property11.isLeap();
        int int13 = property11.getMinimumValue();
        org.joda.time.DateTime dateTime15 = property11.addWrapFieldToCopy(40994);
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test21509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21509");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.dayOfWeek();
        int int7 = dateTimeField5.getLeapAmount(172800000L);
        int int9 = dateTimeField5.getMaximumValue(1646724242048L);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test21510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21510");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        java.util.Date date5 = localDate3.toDate();
        date5.setMonth(0);
        boolean boolean8 = date1.after(date5);
        date1.setHours(38);
        int int11 = date1.getDay();
        date1.setYear(26514633);
        int int14 = date1.getMinutes();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Mar 09 14:15:55 GMT 26516533");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Jan 24 00:00:00 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test21511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21511");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) 26162278);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        int int9 = localDateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMillis((int) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime14.secondOfMinute();
        boolean boolean20 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.plus(readableDuration21);
        int int23 = localDateTime22.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusWeeks(35);
        int int26 = localDateTime22.getEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime22.dayOfWeek();
        int int28 = localDateTime22.getMonthOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter31.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = localDateTime22.toString(dateTimeFormatter34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
    }

    @Test
    public void test21512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21512");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.year();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDurationAdded(readableDuration12, 26171150);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int16 = localDateTime10.get(dateTimeFieldType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.withDurationAdded(readableDuration17, (-1646723904));
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        int int21 = localDateTime19.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test21513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21513");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) 26162278);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        int int9 = localDateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMillis((int) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime14.secondOfMinute();
        boolean boolean20 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.plus(readableDuration21);
        int int23 = localDateTime22.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusWeeks(35);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusMillis(66618209);
        org.joda.time.ReadablePartial readablePartial28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localDateTime27.isEqual(readablePartial28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test21514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        long long5 = dateTime3.getMillis();
        org.joda.time.DateTime.Property property6 = dateTime3.millisOfDay();
        org.joda.time.DateTime dateTime8 = property6.setCopy(26669153);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645514744553L + "'", long5 == 1645514744553L);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test21515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21515");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        int int8 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        java.lang.String str11 = localDate10.toString();
        int int12 = localDate10.getEra();
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-24" + "'", str11, "2022-02-24");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test21516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21516");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray17 = new java.lang.String[] { "French", "", "hi!", "weekyear", "ISOChronology[UTC]", "French", "French", "97", "French", "2022-02-22T23:59:59.999Z", "2022", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        strSet18.clear();
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet18);
        boolean boolean23 = strSet18.add("20");
        java.util.Iterator<java.lang.String> strItor24 = strSet18.iterator();
        strSet18.clear();
        boolean boolean27 = strSet18.add("clockhourOfHalfday");
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test21517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21517");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1646723922299L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test21518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21518");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime dateTime9 = dateTime2.plus(1646723786980L);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime12 = dateTime9.plusDays(66594724);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        org.joda.time.DateTime dateTime19 = property18.roundCeilingCopy();
        org.joda.time.DateTime dateTime21 = dateTime19.withCenturyOfEra((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTimeISO();
        int int23 = mutableDateTime22.getMillisOfSecond();
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test21519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21519");
        java.util.Date date1 = new java.util.Date((long) 435);
        date1.setYear(23);
        java.util.Date date7 = new java.util.Date(2022, (int) (byte) -1, 2);
        int int8 = date7.getYear();
        java.lang.String str9 = date7.toLocaleString();
        date7.setDate(13);
        int int12 = date7.getDate();
        date7.setMonth(0);
        boolean boolean15 = date1.after(date7);
        java.lang.String str16 = date1.toString();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 01 00:00:00 GMT 1923");
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 13 00:00:00 GMT 3921");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2021 + "'", int8 == 2021);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dec 2, 3921 12:00:00 AM" + "'", str9, "Dec 2, 3921 12:00:00 AM");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Mon Jan 01 00:00:00 GMT 1923" + "'", str16, "Mon Jan 01 00:00:00 GMT 1923");
    }

    @Test
    public void test21520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21520");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("1970-01-01T00:00:00.467");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test21521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21521");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        java.lang.Class<?> wildcardClass8 = property7.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21522");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.years();
        org.joda.time.Chronology chronology11 = chronology2.withUTC();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtStartOfDay();
        int int16 = localDate14.size();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test21523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21523");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) (short) 100);
        int int12 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTimeISO();
        boolean boolean14 = dateTime13.isBeforeNow();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 213120000 + "'", int12 == 213120000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test21524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21524");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        org.joda.time.LocalDate.Property property19 = localDate14.dayOfYear();
        org.joda.time.LocalDate localDate21 = property19.addToCopy(66556173);
        org.joda.time.LocalDate localDate22 = property19.withMinimumValue();
        org.joda.time.LocalDate localDate23 = property19.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "24" + "'", str18, "24");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test21525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21525");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        java.lang.String str17 = dateTimeField10.getAsShortText((int) 'a', locale15);
        java.lang.String str18 = locale15.getDisplayLanguage();
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = new java.util.Locale("", "2022", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Locale.setDefault(category19, locale23);
        java.lang.String str27 = locale15.getDisplayScript(locale23);
        java.util.Locale.setDefault(locale23);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97" + "'", str17, "97");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French" + "'", str18, "French");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale23.toString(), "_2022");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test21526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21526");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        int int5 = localDateTime4.getYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(3);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(13);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property11.setCopy("millisOfDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfDay\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test21527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21527");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        int int4 = timeZone1.getOffset(379209600000L);
        java.time.ZoneId zoneId5 = timeZone1.toZoneId();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("2022");
        int int8 = timeZone7.getRawOffset();
        java.util.TimeZone.setDefault(timeZone7);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean12 = timeZone7.hasSameRules(timeZone11);
        boolean boolean13 = timeZone1.hasSameRules(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str15 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale17 = java.util.Locale.CHINA;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone1, locale17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.weekOfWeekyear();
        org.joda.time.DateTime dateTime28 = property27.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.plus(readableDuration31);
        boolean boolean33 = calendar20.before((java.lang.Object) dateTime30);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GMT" + "'", str15, "GMT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645514744689,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=689,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test21528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21528");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset((int) '4');
        boolean boolean7 = timeZone1.observesDaylightTime();
        java.lang.String str8 = timeZone1.getID();
        boolean boolean9 = timeZone1.observesDaylightTime();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        timeZone11.setRawOffset(0);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        int int18 = calendar16.getGreatestMinimum(11);
        calendar16.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("2022");
        int int28 = timeZone27.getRawOffset();
        calendar16.setTimeZone(timeZone27);
        boolean boolean30 = timeZone11.hasSameRules(timeZone27);
        java.time.ZoneId zoneId31 = timeZone11.toZoneId();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone(zoneId31);
        int int34 = timeZone32.getOffset((long) 26341);
        boolean boolean35 = timeZone1.hasSameRules(timeZone32);
        int int36 = timeZone32.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT" + "'", str8, "GMT");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645514744706,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=706,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=706,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test21529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21529");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test21530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21530");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        int int4 = localDate0.size();
        org.joda.time.LocalDate.Property property5 = localDate0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, 962);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 55);
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test21531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21531");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusSeconds(27445396);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        int int18 = property17.getMaximumValue();
        org.joda.time.DateTime dateTime19 = property17.roundCeilingCopy();
        org.joda.time.DateTime dateTime21 = property17.addWrapFieldToCopy((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int23 = dateTime21.get(dateTimeFieldType22);
        boolean boolean24 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.monthOfYear();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.dayOfYear();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.withPeriodAdded(readablePeriod34, 8);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime29.minusMillis(600032);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType41.getDurationType();
        int int45 = localDateTime38.get(dateTimeFieldType41);
        boolean boolean46 = dateTime21.isSupported(dateTimeFieldType41);
        org.joda.time.DateTime.Property property47 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime48 = property47.roundFloorCopy();
        org.joda.time.DateTime.Property property49 = dateTime48.year();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292278993 + "'", int18 == 292278993);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1429 + "'", int45 == 1429);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test21532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21532");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekyear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.millisOfDay();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) (short) 100);
        int int15 = dateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime14.minusMillis(66534241);
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds(872);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType24 = localDateTime22.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86399999 + "'", int9 == 86399999);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test21533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        long long4 = dateTime1.getMillis();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        long long11 = dateTime9.getMillis();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone13);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime14.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes((int) (short) 100);
        int int24 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = dateTime9.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(dateTimeZone32);
        boolean boolean34 = dateTime25.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime36 = dateTime31.withWeekyear(86399999);
        boolean boolean37 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime1.getSecondOfMinute();
        int int39 = dateTime1.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime1.withHourOfDay(80982);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 80982 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645514744776L + "'", long4 == 1645514744776L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646724344776L + "'", long11 == 1646724344776L);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 213120000 + "'", int24 == 213120000);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 44 + "'", int38 == 44);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
    }

    @Test
    public void test21534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21534");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        org.joda.time.LocalDate localDate16 = property14.roundHalfFloorCopy();
        java.lang.String str17 = property14.getAsText();
        int int18 = property14.getMinimumValueOverall();
        org.joda.time.LocalDate localDate19 = property14.roundHalfCeilingCopy();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale20.getVariant();
        java.util.Set<java.lang.String> strSet23 = locale20.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setLanguageTag("fr");
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.lang.String str28 = locale27.getDisplayVariant();
        java.util.Locale.Builder builder29 = builder24.setLocale(locale27);
        java.util.Locale.Builder builder31 = builder24.removeUnicodeLocaleAttribute("1439");
        java.util.Locale locale32 = builder24.build();
        java.util.Locale locale33 = builder24.build();
        java.lang.String str34 = locale20.getDisplayCountry(locale33);
        int int35 = property14.getMaximumShortTextLength(locale20);
        java.util.Set<java.lang.String> strSet36 = locale20.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AD" + "'", str17, "AD");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ub300\ub9cc" + "'", str34, "\ub300\ub9cc");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test21535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21535");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime6.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        int int20 = dateTime19.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int22 = dateTime19.get(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone24);
        org.joda.time.LocalTime localTime27 = localTime25.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localTime25.toDateTimeToday(dateTimeZone28);
        int int30 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime19.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime19.withZone(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone35);
        int int37 = localTime36.getSecondOfMinute();
        org.joda.time.LocalTime.Property property38 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime40 = localTime36.minusSeconds(15);
        org.joda.time.LocalTime.Property property41 = localTime36.millisOfSecond();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime43.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withZone(dateTimeZone46);
        org.joda.time.DateTime.Property property48 = dateTime47.weekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone50);
        org.joda.time.LocalTime localTime53 = localTime51.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localTime51.toDateTimeToday(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.withMillisOfSecond((int) (byte) 100);
        int int58 = property48.compareTo((org.joda.time.ReadableInstant) dateTime57);
        java.lang.String str60 = dateTime57.toString("97");
        java.lang.Object obj61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj61, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property66 = dateTime65.weekyear();
        long long67 = dateTime65.getMillis();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone69);
        org.joda.time.LocalTime localTime72 = localTime70.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = localTime70.toDateTimeToday(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime74.getZone();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime79 = dateTime77.minusMinutes((int) (short) 100);
        int int80 = dateTimeZone75.getOffset((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime81 = dateTime65.withZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime dateTime82 = dateTime57.withZone(dateTimeZone75);
        org.joda.time.DateTime dateTime83 = localTime36.toDateTimeToday(dateTimeZone75);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime33.toMutableDateTime(dateTimeZone75);
        java.lang.String str86 = dateTimeZone75.getShortName(1646723902811L);
        org.joda.time.DateTime dateTime87 = dateTime12.toDateTime(dateTimeZone75);
        org.joda.time.TimeOfDay timeOfDay88 = dateTime12.toTimeOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 59 + "'", int37 == 59);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "97" + "'", str60, "97");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(property66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1646724344809L + "'", long67 == 1646724344809L);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(dateTime79);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 213120000 + "'", int80 == 213120000);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(mutableDateTime84);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "+59:12" + "'", str86, "+59:12");
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(timeOfDay88);
    }

    @Test
    public void test21536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21536");
        java.util.Date date6 = new java.util.Date(567, 39600000, 26461576, (-232303), 26430650, 26336935);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromDateFields(date6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DurationField durationField13 = chronology10.eras();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) localTime7, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Fri Dec 02 03:38:55 GMT 3374940");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[UTC]" + "'", str14, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test21537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21537");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime();
        int int17 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 213120000 + "'", int17 == 213120000);
    }

    @Test
    public void test21538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21538");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(805, 40711, (-588186528));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 805 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21539");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears((-457423));
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.monthOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withPeriodAdded(readablePeriod17, 8);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfYear(16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMonths(25);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfYear(33);
        int int26 = localDateTime25.getWeekyear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.centuryOfEra();
        org.joda.time.DateTime dateTime28 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.era();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.monthOfYear();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.dayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withPeriodAdded(readablePeriod38, 8);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.minusMillis(600032);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusMillis(123);
        boolean boolean47 = localDateTime25.isBefore((org.joda.time.ReadablePartial) localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test21540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = property11.setCopy(40);
        org.joda.time.LocalDateTime localDateTime16 = property11.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test21541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21541");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        int int20 = dateTimeFormatter4.getDefaultYear();
        boolean boolean21 = dateTimeFormatter4.isParser();
        boolean boolean22 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 99);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000 + "'", int20 == 2000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test21542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21542");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(85);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21543");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(93);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 3600434, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test21544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21544");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withCenturyOfEra(100);
        int int7 = localDateTime6.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusYears(26175799);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.yearOfEra();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("fr");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale14.getDisplayVariant();
        java.util.Locale.Builder builder16 = builder11.setLocale(locale14);
        java.util.Locale.Builder builder18 = builder11.removeUnicodeLocaleAttribute("1439");
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.lang.String str23 = locale21.getDisplayVariant();
        java.lang.String str24 = locale19.getDisplayName(locale21);
        java.util.Locale.Builder builder25 = builder18.setLocale(locale21);
        java.util.Locale.Builder builder27 = builder25.setLanguageTag("CAN");
        java.util.Locale.Builder builder28 = builder27.clearExtensions();
        java.util.Locale.Builder builder29 = builder27.clearExtensions();
        java.util.Locale locale30 = builder29.build();
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = property10.getAsText(locale30);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en-CA" + "'", str22, "en-CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "can");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10070" + "'", str32, "10070");
    }

    @Test
    public void test21545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21545");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfDay();
        long long11 = dateTimeField8.addWrapField((long) 8, 34320035);
        boolean boolean12 = dateTimeField8.isLenient();
        java.lang.String str13 = dateTimeField8.toString();
        boolean boolean14 = dateTimeField8.isLenient();
        org.joda.time.DurationField durationField15 = dateTimeField8.getRangeDurationField();
        java.lang.String str17 = dateTimeField8.getAsShortText((long) 910);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600008L + "'", long11 == 39600008L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateTimeField[clockhourOfDay]" + "'", str13, "DateTimeField[clockhourOfDay]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24" + "'", str17, "24");
    }

    @Test
    public void test21546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21546");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate14.plusWeeks(32770);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears(671);
        org.joda.time.LocalDate.Property property19 = localDate16.era();
        org.joda.time.LocalDate localDate20 = property19.roundFloorCopy();
        int int21 = localDate20.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate20.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test21547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21547");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        org.joda.time.DateTime dateTime6 = dateTime2.withWeekOfWeekyear(11);
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.Instant instant11 = instant8.withDurationAdded((long) 9, 26064);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test21548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21548");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.weekOfWeekyear();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = property7.getAsShortText(locale8);
        java.lang.String str10 = locale8.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone0, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test21549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21549");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.Calendar calendar7 = builder6.build();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        org.joda.time.DateTime dateTime16 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime18 = property14.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime19 = property14.withMaximumValue();
        boolean boolean20 = calendar7.after((java.lang.Object) dateTime19);
        org.joda.time.DateTime.Property property21 = dateTime19.yearOfCentury();
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=360963053,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=16,SECOND=3,MILLISECOND=53,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test21550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21550");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        boolean boolean14 = dateTimeZone13.isFixed();
        java.lang.String str15 = dateTimeZone13.getID();
        long long18 = dateTimeZone13.adjustOffset(1646723847292L, false);
        org.joda.time.Chronology chronology19 = chronology5.withZone(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, 1646724285739L, 66735823);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+59:12" + "'", str15, "+59:12");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1646723847292L + "'", long18 == 1646723847292L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1646724285739L + "'", long23 == 1646724285739L);
    }

    @Test
    public void test21551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21551");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test21552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21552");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(8);
        int int8 = property5.getMaximumValueOverall();
        org.joda.time.LocalTime localTime9 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property5.withMaximumValue();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime10.plus(readablePeriod12);
        int int14 = localTime10.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 85065069 + "'", int14 == 85065069);
    }

    @Test
    public void test21553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21553");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale0);
        long long5 = calendar4.getTimeInMillis();
        calendar4.setFirstDayOfWeek(0);
        java.util.Date date8 = calendar4.getTime();
        calendar4.set(26648300, (-1646723904), 10069);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=26648300,MONTH=-1646723904,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=10069,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=79,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645514745079L + "'", long5 == 1645514745079L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Feb 22 07:25:45 GMT 2022");
    }

    @Test
    public void test21554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21554");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(55);
        org.joda.time.DateTime dateTime6 = dateTime4.withHourOfDay(10);
        org.joda.time.DateTime dateTime8 = dateTime4.withMillis(6000014L);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(26442);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.minusHours(26540330);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.withEra(66682188);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66682188 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "28412-01-03T12:52:00.014+59:12" + "'", str12, "28412-01-03T12:52:00.014+59:12");
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test21555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21555");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        long long11 = durationField9.getMillis(10L);
        long long14 = durationField9.getMillis(68424, 1646724079273L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 246326400000L + "'", long14 == 246326400000L);
    }

    @Test
    public void test21556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21556");
        java.util.Locale locale3 = new java.util.Locale("Japanese", "minuteOfDay", "2022-02-22T07:18:31.110+00:00:00.435");
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "japanese_MINUTEOFDAY_2022-02-22T07:18:31.110+00:00:00.435");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test21557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21557");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(55);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        java.lang.String str7 = chronology6.toString();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(1646723812200L, chronology6);
        long long12 = chronology6.add(1646724074156L, 1646724060433L, 1276166);
        org.joda.time.DurationField durationField13 = chronology6.centuries();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.era();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[+59:12]" + "'", str7, "ISOChronology[+59:12]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2101494904030614034L + "'", long12 == 2101494904030614034L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test21558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21558");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(23950084838400194L);
        org.joda.time.DateTime dateTime3 = dateTime1.minusYears(36);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test21559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21559");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        java.lang.String str9 = property8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalDateTime localDateTime16 = property13.addWrapFieldToCopy(1);
        java.util.Locale locale20 = new java.util.Locale("hi!", "", "");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = property13.getAsText(locale20);
        java.lang.String str23 = locale20.getDisplayCountry();
        boolean boolean24 = locale20.hasExtensions();
        java.util.Locale locale28 = new java.util.Locale("DateTimeField[monthOfYear]", "GMT", "7");
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale28);
        java.lang.String str31 = locale20.getDisplayLanguage(locale28);
        java.lang.String str32 = property8.getAsText(locale28);
        org.joda.time.DurationField durationField33 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[millisOfDay]" + "'", str9, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AD" + "'", str22, "AD");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals(locale28.toString(), "datetimefield[monthofyear]_GMT_7");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "67065124" + "'", str32, "67065124");
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test21560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21560");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField3 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.millisOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        int int13 = property11.get();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = property11.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate18 = localDate14.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.plus(readablePeriod19);
        org.joda.time.LocalDate localDate22 = localDate20.plusWeeks(32770);
        boolean boolean24 = localDate20.equals((java.lang.Object) 66574754);
        java.lang.String str25 = localDate20.toString();
        long long27 = chronology1.set((org.joda.time.ReadablePartial) localDate20, 164L);
        org.joda.time.DateTimeField dateTimeField28 = chronology1.dayOfYear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2024-01-25" + "'", str25, "2024-01-25");
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1706140800164L + "'", long27 == 1706140800164L);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test21561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21561");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        boolean boolean9 = durationFieldType5.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.dayOfYear();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test21562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1644542054766L, chronology1);
    }

    @Test
    public void test21563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21563");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        boolean boolean9 = localTime0.equals((java.lang.Object) dateTimeZone8);
        int int10 = localTime0.getMillisOfDay();
        org.joda.time.LocalTime.Property property11 = localTime0.millisOfSecond();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime12.withPeriodAdded(readablePeriod13, 13);
        org.joda.time.LocalTime localTime17 = localTime12.plusMinutes(66682188);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.era();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property21.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusSeconds(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean28 = localDateTime24.isSupported(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYear((int) ' ');
        int int31 = localDateTime30.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusYears(24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = localTime12.compareTo((org.joda.time.ReadablePartial) localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 67065165 + "'", int10 == 67065165);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test21564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21564");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime6.plus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.ReadableInstant readableInstant14 = null;
        boolean boolean15 = dateTime12.isEqual(readableInstant14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        boolean boolean25 = localTime16.equals((java.lang.Object) dateTimeZone24);
        int int26 = localTime16.getMillisOfDay();
        org.joda.time.LocalTime.Property property27 = localTime16.millisOfSecond();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.DateTime dateTime29 = dateTime12.withFields((org.joda.time.ReadablePartial) localTime28);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 67065178 + "'", int26 == 67065178);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test21565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21565");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.size();
        org.joda.time.DateTime dateTime12 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate8);
        java.lang.String str14 = localDate8.toString("97");
        org.joda.time.LocalDate localDate16 = localDate8.withWeekyear((int) (short) -1);
        org.joda.time.Interval interval17 = localDate16.toInterval();
        org.joda.time.LocalDate localDate19 = localDate16.withYear(40320000);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.plus(readablePeriod20);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97" + "'", str14, "97");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test21566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21566");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder0.setRegion("fr");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("DurationField[weeks]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DurationField[weeks] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_FR");
    }

    @Test
    public void test21567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21567");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate8 = localDate0.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate0.plus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate13 = localDate10.minusMonths(570);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        int int21 = property19.get();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        int int24 = property19.compareTo((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate localDate26 = localDate22.plusWeeks((int) (short) 100);
        boolean boolean28 = localDate26.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate30 = localDate26.withDayOfMonth(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getDurationType();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType31.getDurationType();
        boolean boolean34 = localDate26.isSupported(dateTimeFieldType31);
        int int35 = localDate10.indexOf(dateTimeFieldType31);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType31.getRangeDurationType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType31.getField(chronology37);
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test21568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21568");
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        int int11 = dateTime9.getYear();
        org.joda.time.DateTime dateTime12 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime9.withPeriodAdded(readablePeriod13, (int) '#');
        org.joda.time.DateTime dateTime17 = dateTime9.minusMillis(4);
        int int18 = dateTime9.getMonthOfYear();
        org.joda.time.DateTime dateTime20 = dateTime9.withYearOfEra((int) '#');
        org.joda.time.DateTime dateTime22 = dateTime20.plusDays(19059);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(dateTimeZone27);
        org.joda.time.DateTime.Property property29 = dateTime28.weekOfWeekyear();
        org.joda.time.DateTime dateTime30 = property29.roundCeilingCopy();
        org.joda.time.DateTime dateTime31 = property29.withMaximumValue();
        org.joda.time.DateTime dateTime32 = dateTime31.withEarlierOffsetAtOverlap();
        java.lang.Object obj33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj33, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property38 = dateTime37.weekyear();
        long long39 = dateTime37.getMillis();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone41);
        org.joda.time.LocalTime localTime44 = localTime42.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localTime42.toDateTimeToday(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTime46.getZone();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes((int) (short) 100);
        int int52 = dateTimeZone47.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = dateTime37.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime54 = dateTime31.toDateTime(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone56);
        org.joda.time.LocalTime localTime59 = localTime57.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = localTime57.toDateTimeToday(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTime61.getZone();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime66 = dateTime64.minusMinutes((int) (short) 100);
        int int67 = dateTimeZone62.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone62);
        long long70 = dateTimeZone47.getMillisKeepLocal(dateTimeZone62, (long) 16);
        org.joda.time.DateTime dateTime71 = dateTime20.toDateTime(dateTimeZone62);
        long long73 = dateTimeZone62.convertUTCToLocal(1646723942744L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(71670, 66514147, (-5999965), (-2), 40994, dateTimeZone62);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1646724345236L + "'", long39 == 1646724345236L);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 213120000 + "'", int52 == 213120000);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 213120000 + "'", int67 == 213120000);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 16L + "'", long70 == 16L);
        org.junit.Assert.assertNotNull(dateTime71);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1646937062744L + "'", long73 == 1646937062744L);
    }

    @Test
    public void test21569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21569");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime19 = property18.withMaximumValue();
        java.lang.String str20 = property18.toString();
        org.joda.time.DateTime dateTime22 = property18.addToCopy(1645514412712L);
        org.joda.time.DateTime dateTime23 = property18.getDateTime();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Property[millisOfSecond]" + "'", str20, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test21570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21570");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = dateTimeField8.getAsShortText((long) 'a', locale10);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        long long20 = chronology14.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField21 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology14.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        java.lang.String str30 = dateTimeField23.getAsShortText((int) 'a', locale28);
        java.lang.String str31 = dateTimeField8.getAsText((long) 26162278, locale28);
        int int33 = dateTimeField8.get((long) 1340);
        java.util.Locale locale38 = new java.util.Locale("hi!", "", "");
        java.util.Set<java.lang.Character> charSet39 = locale38.getExtensionKeys();
        java.lang.String str40 = locale38.getCountry();
        java.lang.String str41 = dateTimeField8.getAsShortText(122, locale38);
        java.lang.String str42 = locale38.toLanguageTag();
        java.util.Set<java.lang.Character> charSet43 = locale38.getExtensionKeys();
        java.util.Set<java.lang.String> strSet44 = locale38.getUnicodeLocaleKeys();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 32769, chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.clockhourOfDay();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(1645514555834L, chronology48);
        boolean boolean54 = strSet44.contains((java.lang.Object) chronology48);
        boolean boolean55 = strSet44.isEmpty();
        java.util.Collection<java.util.Locale> localeCollection56 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = strSet44.retainAll(localeCollection56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 971923363200000L + "'", long20 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "97" + "'", str30, "97");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "16" + "'", str31, "16");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "122" + "'", str41, "122");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "und" + "'", str42, "und");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test21571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21571");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.yearOfEra();
        org.joda.time.DurationField durationField15 = property14.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(durationField15);
    }

    @Test
    public void test21572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21572");
        java.lang.String[] strArray19 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale[] localeArray25 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList26, filteringMode28);
        boolean boolean30 = strSet20.removeAll((java.util.Collection<java.util.Locale>) localeList26);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Locale[] localeArray40 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.Locale.FilteringMode filteringMode43 = null;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList41, filteringMode43);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale[] localeArray50 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale.FilteringMode filteringMode53 = null;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.util.Locale>) localeList51, filteringMode53);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList54);
        boolean boolean56 = strSet20.containsAll((java.util.Collection<java.util.Locale>) localeList54);
        java.lang.Object obj57 = null;
        boolean boolean58 = strSet20.equals(obj57);
        boolean boolean60 = strSet20.add("Thu Feb 24 00:00:00 GMT+00:00 2022");
        strSet20.clear();
        int int62 = strSet20.size();
        java.util.Spliterator<java.lang.String> strSpliterator63 = strSet20.spliterator();
        boolean boolean64 = strSet20.isEmpty();
        strSet20.clear();
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(strSpliterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test21573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21573");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = localDateTime6.getField((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.minusHours(7);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withYear(366);
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        java.util.Calendar calendar23 = builder22.build();
        java.util.Calendar.Builder builder25 = builder22.setLenient(false);
        java.util.Calendar.Builder builder27 = builder25.setLenient(false);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder30 = builder25.setLocale(locale29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "", "");
        java.lang.String str35 = locale34.getDisplayScript();
        java.util.Locale locale39 = new java.util.Locale("hi!", "", "");
        java.lang.String str40 = locale34.getDisplayScript(locale39);
        java.lang.String str41 = locale34.getISO3Language();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str43 = locale34.getDisplayName(locale42);
        java.lang.String str44 = locale29.getDisplayName(locale42);
        boolean boolean45 = localDateTime17.equals((java.lang.Object) locale42);
        java.util.Locale.setDefault(locale42);
        java.lang.String str47 = locale42.getISO3Country();
        java.lang.String str48 = locale42.getCountry();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "TWN" + "'", str47, "TWN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "TW" + "'", str48, "TW");
    }

    @Test
    public void test21574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21574");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        int int5 = localDateTime4.getYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(3);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks(2000);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        int int17 = dateTime15.getYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(6);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        org.joda.time.DateTime dateTime25 = dateTime18.withTimeAtStartOfDay();
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        java.lang.String str32 = property31.getAsText();
        int int33 = property31.get();
        org.joda.time.DateTime dateTime34 = property31.withMaximumValue();
        int int35 = property31.getMinimumValue();
        org.joda.time.DateTime dateTime37 = property31.addWrapFieldToCopy(80956);
        org.joda.time.DateTime dateTime39 = property31.addToCopy((long) 66571079);
        org.joda.time.DateTime dateTime40 = property31.withMinimumValue();
        boolean boolean41 = dateTime25.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022" + "'", str32, "2022");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-292275054) + "'", int35 == (-292275054));
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test21575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21575");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-24T18:28:56.446+59:12");
        org.joda.time.tz.NameProvider nameProvider2 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str13 = nameProvider2.getName(locale9, "24", "yearOfCentury");
        java.util.Locale locale14 = null;
        java.lang.String str17 = nameProvider2.getName(locale14, "years", "Etc/UTC");
        java.util.Locale locale19 = new java.util.Locale("59");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale19.getDisplayScript();
        java.lang.String str24 = nameProvider2.getName(locale19, "Greenwich Mean Time", "years");
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone1, locale19);
        java.lang.Object obj26 = calendar25.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(nameProvider2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals(locale19.toString(), "59");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645514745354,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=354,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj26);
// flaky:         org.junit.Assert.assertEquals(obj26.toString(), "java.util.GregorianCalendar[time=1645514745354,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=354,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "java.util.GregorianCalendar[time=1645514745354,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=354,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "java.util.GregorianCalendar[time=1645514745354,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=354,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test21576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21576");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology1.days();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.centuryOfEra();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test21577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21577");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime.Property property14 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        int int16 = localDateTime15.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusWeeks((int) 'x');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusMonths(116);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMinutes(57);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusYears(223);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test21578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21578");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(8);
        int int15 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks(66586053);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime.Property property19 = localDateTime14.yearOfCentury();
        int int20 = property19.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test21579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21579");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.LocalTime localTime6 = localTime4.plusSeconds((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        java.lang.String str10 = localTime6.toString("18");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime6.withHourOfDay(457);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "18" + "'", str10, "18");
    }

    @Test
    public void test21580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21580");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withYearOfCentury(9);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readableDuration11);
        java.lang.String str14 = localDateTime10.toString("180");
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minus(readableDuration15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withWeekOfWeekyear((-284801052));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -284801052 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "180" + "'", str14, "180");
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test21581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21581");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.Chronology chronology3 = chronology1.withUTC();
        org.joda.time.DurationField durationField4 = chronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.hourOfDay();
        boolean boolean7 = dateTimeField6.isSupported();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test21582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21582");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.weekyear();
        long long9 = chronology1.add(0L, (long) 27445396, 66571079);
        org.joda.time.DateTimeField dateTimeField10 = chronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1827069625302284L + "'", long9 == 1827069625302284L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test21583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21583");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(16);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withPeriodAdded(readablePeriod7, 34);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMillisOfDay(672);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime11.toString("2022-02-25T18:35:13.025");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test21584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21584");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology2);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DurationField durationField6 = chronology2.days();
        int int8 = durationField6.getValue(1645514300441L);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfDay();
        boolean boolean13 = durationFieldType9.isSupported(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfHour();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DurationField durationField17 = chronology11.seconds();
        int int18 = durationField6.compareTo(durationField17);
        java.lang.String str19 = durationField6.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19045 + "'", int8 == 19045);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DurationField[days]" + "'", str19, "DurationField[days]");
    }

    @Test
    public void test21585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21585");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(55);
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfCentury(22);
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime();
        org.joda.time.DateTime dateTime10 = dateTime6.withMillisOfDay(66771);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test21586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21586");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = property5.getMaximumValue();
        org.joda.time.DateTime dateTime7 = property5.roundCeilingCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, 26312454);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime15.minusHours(2021);
        int int22 = localTime15.getSecondOfMinute();
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        java.lang.String str29 = property28.getAsText();
        org.joda.time.DurationField durationField30 = property28.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property28.getFieldType();
        java.lang.String str32 = dateTimeFieldType31.toString();
        boolean boolean33 = localTime15.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone35);
        org.joda.time.LocalTime localTime38 = localTime36.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localTime36.toDateTimeToday(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime43.minusMinutes((int) (short) 100);
        int int46 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime45);
        int int48 = dateTimeZone41.getStandardOffset((long) 7);
        org.joda.time.DateTime dateTime49 = localTime15.toDateTimeToday(dateTimeZone41);
        java.lang.Object obj50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj50, dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime52.toMutableDateTime();
        org.joda.time.DateTime dateTime54 = dateTime52.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.minus(readablePeriod55);
        org.joda.time.DateTime dateTime58 = dateTime56.withMillis(1678173362055L);
        int int59 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime9.toMutableDateTime(dateTimeZone41);
        org.joda.time.Chronology chronology61 = mutableDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.secondOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long71 = chronology61.getDateTimeMillis(26312454, 26574207, 1080, (int) 'x', 2363, 5957, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyear" + "'", str32, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 213120000 + "'", int46 == 213120000);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 213120000 + "'", int48 == 213120000);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 213120000 + "'", int59 == 213120000);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
    }

    @Test
    public void test21587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21587");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.monthOfYear();
        int int9 = localDateTime4.getValue(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minusSeconds(66514);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.minusMillis(2000);
        int int14 = localDateTime13.size();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.millisOfSecond();
        java.lang.String str16 = property15.getAsText();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32" + "'", str16, "32");
    }

    @Test
    public void test21588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21588");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        int int19 = localDate14.getWeekOfWeekyear();
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYear(7);
        org.joda.time.DateTime dateTime27 = dateTime23.withWeekOfWeekyear(11);
        org.joda.time.DateTime.Property property28 = dateTime27.hourOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.minuteOfDay();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology35);
        org.joda.time.DurationField durationField39 = chronology35.centuries();
        java.lang.String str40 = chronology35.toString();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.centuryOfEra();
        int int42 = dateTime27.get(dateTimeField41);
        org.joda.time.DurationField durationField43 = dateTimeField41.getRangeDurationField();
        boolean boolean44 = dateTimeField41.isLenient();
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = null;
        org.joda.time.format.DateTimeParser dateTimeParser46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter45, dateTimeParser46);
        java.util.Locale locale48 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withLocale(locale48);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.minuteOfDay();
        boolean boolean54 = durationFieldType50.isSupported(chronology52);
        org.joda.time.DateTimeField dateTimeField55 = chronology52.yearOfEra();
        org.joda.time.DateTimeField dateTimeField56 = chronology52.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField58 = chronology52.clockhourOfHalfday();
        java.util.Locale locale62 = new java.util.Locale("24", "hi!");
        java.lang.String str63 = dateTimeField58.getAsShortText(5555776727L, locale62);
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology67 = localDate66.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.minuteOfDay();
        boolean boolean69 = durationFieldType65.isSupported(chronology67);
        org.joda.time.DateTimeField dateTimeField70 = chronology67.yearOfEra();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = chronology67.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField73 = chronology67.clockhourOfHalfday();
        java.util.Locale locale77 = new java.util.Locale("24", "hi!");
        java.lang.String str78 = dateTimeField73.getAsShortText(5555776727L, locale77);
        java.lang.String str79 = dateTimeField58.getAsShortText(35, locale77);
        java.lang.String str80 = locale77.getLanguage();
        java.lang.String str81 = locale48.getDisplayScript(locale77);
        int int82 = dateTimeField41.getMaximumTextLength(locale77);
        java.lang.String str83 = locale77.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = localDate14.toString("2 Apr 3922 00:00:00 GMT", locale77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "24" + "'", str18, "24");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ISOChronology[UTC]" + "'", str40, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNull(durationField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertEquals(locale62.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "7" + "'", str63, "7");
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertEquals(locale77.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "7" + "'", str78, "7");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "35" + "'", str79, "35");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "24" + "'", str80, "24");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 7 + "'", int82 == 7);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "HI!" + "'", str83, "HI!");
    }

    @Test
    public void test21589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21589");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        int int8 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate0.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        boolean boolean11 = localDate0.isSupported(durationFieldType10);
        int int12 = localDate0.getYearOfCentury();
        int int13 = localDate0.getEra();
        org.joda.time.LocalDate localDate15 = localDate0.plusYears(66611409);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.clockhourOfDay();
        boolean boolean23 = dateTimeField22.isSupported();
        long long26 = dateTimeField22.getDifferenceAsLong(1645514207470L, 3482306069L);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.year();
        long long33 = dateTimeField31.roundHalfEven((-1L));
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfDay();
        java.util.Locale locale41 = new java.util.Locale("hi!", "", "");
        int int42 = dateTimeField37.getMaximumShortTextLength(locale41);
        java.lang.String str44 = locale41.getExtension('x');
        java.lang.String str45 = dateTimeField31.getAsText((-17975955), locale41);
        int int46 = dateTimeField22.getMaximumTextLength(locale41);
        java.lang.String str47 = locale41.getISO3Country();
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("DateTimeField[millisOfDay]");
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.lang.String str52 = locale49.getDisplayVariant(locale50);
        java.lang.String str53 = locale50.getDisplayCountry();
        java.lang.String str54 = locale41.getDisplayScript(locale50);
        java.lang.String str55 = localDate15.toString("\uc911\uad6d", locale41);
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "66613431-02-24" + "'", str16, "66613431-02-24");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 456119L + "'", long26 == 456119L);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-17975955" + "'", str45, "-17975955");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u570b" + "'", str53, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\uc911\uad6d" + "'", str55, "\uc911\uad6d");
    }

    @Test
    public void test21590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21590");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray17 = new java.lang.String[] { "French", "", "hi!", "weekyear", "ISOChronology[UTC]", "French", "French", "97", "French", "2022-02-22T23:59:59.999Z", "2022", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        strSet18.clear();
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale[] localeArray28 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale.FilteringMode filteringMode31 = null;
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList29, filteringMode31);
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList32);
        boolean boolean34 = strSet18.containsAll((java.util.Collection<java.util.Locale>) localeList33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField39 = chronology36.days();
        boolean boolean40 = strSet18.remove((java.lang.Object) chronology36);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology36.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = chronology36.clockhourOfHalfday();
        boolean boolean45 = dateTimeField44.isLenient();
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localeList32);
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test21591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21591");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime6.withZone(dateTimeZone19);
        int int21 = dateTime20.getMinuteOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.minusSeconds(32770);
        java.util.Calendar.Builder builder24 = new java.util.Calendar.Builder();
        java.util.Calendar calendar25 = builder24.build();
        java.util.Calendar.Builder builder27 = builder24.setLenient(false);
        java.util.Calendar.Builder builder29 = builder27.setLenient(false);
        java.util.Calendar.Builder builder34 = builder29.setTimeOfDay((int) 'a', 2012, (-52), 22);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("2022");
        int int37 = timeZone36.getRawOffset();
        timeZone36.setRawOffset(0);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone36);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("2022");
        int int43 = timeZone42.getRawOffset();
        timeZone42.setRawOffset(0);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone42);
        java.lang.String str47 = timeZone42.getID();
        java.util.TimeZone timeZone49 = java.util.TimeZone.getTimeZone("2022");
        timeZone49.setID("French");
        java.util.TimeZone.setDefault(timeZone49);
        boolean boolean53 = timeZone42.hasSameRules(timeZone49);
        calendar40.setTimeZone(timeZone42);
        java.util.TimeZone timeZone55 = calendar40.getTimeZone();
        java.util.Calendar.Builder builder56 = builder29.setTimeZone(timeZone55);
        java.util.Calendar.Builder builder59 = builder29.set(16, (-2));
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean63 = dateTimeZone62.isFixed();
        int int65 = dateTimeZone62.getStandardOffset((long) (-1));
        boolean boolean67 = dateTimeZone62.equals((java.lang.Object) (-292275054));
        java.util.Locale locale71 = new java.util.Locale("52", "2024-01-23");
        java.lang.String str72 = locale71.getDisplayVariant();
        java.lang.String str73 = dateTimeZone62.getName(1646723863664L, locale71);
        java.util.Set<java.lang.Character> charSet74 = locale71.getExtensionKeys();
        java.util.Calendar.Builder builder75 = builder29.setLocale(locale71);
        java.util.Calendar calendar76 = dateTime20.toCalendar(locale71);
        java.util.Locale locale77 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = locale71.getDisplayCountry(locale77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 671 + "'", int21 == 671);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=1645514745552,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=552,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1645514745552,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=552,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GMT" + "'", str47, "GMT");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 213120000 + "'", int65 == 213120000);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals(locale71.toString(), "52_2024-01-23");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+59:12" + "'", str73, "+59:12");
        org.junit.Assert.assertNotNull(charSet74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(calendar76);
// flaky:         org.junit.Assert.assertEquals(calendar76.toString(), "java.util.GregorianCalendar[time=1645487999999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test21592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21592");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.setCopy((int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withCenturyOfEra(1110);
        int int13 = localDateTime10.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test21593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21593");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.LocalTime localTime7 = property5.getLocalTime();
        org.joda.time.LocalTime localTime9 = property5.addNoWrapToCopy(5);
        int int10 = property5.get();
        org.joda.time.LocalTime localTime11 = property5.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "18" + "'", str6, "18");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test21594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21594");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "");
        int int8 = dateTimeField3.getMaximumShortTextLength(locale7);
        java.lang.String str11 = nameProvider0.getName(locale7, "24", "yearOfCentury");
        java.util.Locale locale12 = null;
        java.lang.String str15 = nameProvider0.getName(locale12, "years", "Etc/UTC");
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate localDate20 = localDate16.minusYears(10);
        int[] intArray21 = localDate16.getValues();
        org.joda.time.LocalDate.Property property22 = localDate16.era();
        org.joda.time.LocalDate localDate23 = property22.roundCeilingCopy();
        org.joda.time.LocalDate localDate25 = property22.addWrapFieldToCopy((-292275054));
        org.joda.time.DurationField durationField26 = property22.getRangeDurationField();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfDay();
        java.lang.String str32 = dateTimeField30.getAsShortText(0L);
        long long34 = dateTimeField30.roundHalfEven(1646723839960L);
        boolean boolean35 = property22.equals((java.lang.Object) dateTimeField30);
        java.util.Locale locale38 = new java.util.Locale("2");
        java.lang.String str39 = dateTimeField30.getAsShortText(1646724056083L, locale38);
        java.lang.String str42 = nameProvider0.getShortName(locale38, "438", "10 Aug 2585 23:59:59 GMT");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(chronology17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(intArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1646723820000L + "'", long34 == 1646723820000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals(locale38.toString(), "2");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "440" + "'", str39, "440");
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test21595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime10 = property6.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime12 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime13 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField14 = property6.getField();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        long long22 = chronology16.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        java.lang.String str29 = property28.getAsText();
        int int30 = property28.get();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        int int33 = property28.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        int int36 = localDate34.getDayOfWeek();
        org.joda.time.LocalDate localDate38 = localDate34.minusYears(10);
        int[] intArray39 = localDate34.getValues();
        chronology16.validate((org.joda.time.ReadablePartial) localDate31, intArray39);
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj41, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property46 = dateTime45.weekyear();
        java.lang.String str47 = property46.getAsText();
        int int48 = property46.get();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        int int51 = property46.compareTo((org.joda.time.ReadablePartial) localDate49);
        org.joda.time.LocalDate localDate53 = localDate49.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDate localDate55 = localDate53.plus(readablePeriod54);
        org.joda.time.DateTime dateTime56 = localDate53.toDateTimeAtCurrentTime();
        boolean boolean57 = localDate31.isAfter((org.joda.time.ReadablePartial) localDate53);
        org.joda.time.LocalDate localDate59 = localDate31.minusYears(26299625);
        org.joda.time.LocalDate localDate61 = localDate59.minusYears(910);
        org.joda.time.LocalDate localDate63 = localDate61.plusWeeks(66574754);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology67 = localDate66.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) 32769, chronology67);
        org.joda.time.DateTimeZone dateTimeZone70 = chronology67.getZone();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.year();
        org.joda.time.LocalDate localDate72 = org.joda.time.LocalDate.now(chronology67);
        org.joda.time.LocalDate localDate74 = localDate72.plusWeeks(439);
        int[] intArray75 = localDate72.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray77 = dateTimeField14.addWrapPartial((org.joda.time.ReadablePartial) localDate61, 66558195, intArray75, 876);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66558195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 971923363200000L + "'", long22 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chronology35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2022" + "'", str47, "2022");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2022 + "'", int48 == 2022);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[2022, 2, 22]");
    }

    @Test
    public void test21596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21596");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withDayOfYear(66571079);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66571079 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test21597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21597");
        java.lang.String[] strArray19 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale[] localeArray25 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList26, filteringMode28);
        boolean boolean30 = strSet20.removeAll((java.util.Collection<java.util.Locale>) localeList26);
        int int31 = strSet20.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean33 = strSet20.remove((java.lang.Object) dateTimeFieldType32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.minuteOfDay();
        java.lang.String str38 = chronology35.toString();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.weekyear();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType32.getField(chronology35);
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType32.getRangeDurationType();
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ISOChronology[UTC]" + "'", str38, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationFieldType43);
    }

    @Test
    public void test21598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21598");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        int int26 = property24.get();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = property24.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate31 = localDate27.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate32 = localDate18.withFields((org.joda.time.ReadablePartial) localDate27);
        int int33 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate.Property property34 = localDate27.dayOfYear();
        org.joda.time.LocalDate.Property property35 = localDate27.dayOfWeek();
        int int36 = localDate27.getYear();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        int int39 = localDate37.getDayOfWeek();
        org.joda.time.LocalDate localDate41 = localDate37.minusYears(10);
        int[] intArray42 = localDate37.getValues();
        org.joda.time.LocalDate.Property property43 = localDate37.era();
        org.joda.time.LocalDate localDate45 = localDate37.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDate localDate47 = localDate37.plus(readablePeriod46);
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfCentury();
        org.joda.time.LocalDate localDate50 = localDate47.minusMonths(570);
        org.joda.time.LocalDate localDate52 = localDate47.plusMonths(26462567);
        org.joda.time.DateTime dateTime53 = localDate52.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime54 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDate.Property property55 = localDate27.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(chronology38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(intArray42);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test21599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21599");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime4, dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays(100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(0);
        boolean boolean26 = dateTimeZone10.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusMinutes(52);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724345668L + "'", long6 == 1646724345668L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test21600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21600");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) category4);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.toLanguageTag();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Locale.setDefault(category4, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-CA" + "'", str7, "en-CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test21601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21601");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        org.joda.time.LocalDate.Property property19 = localDate14.dayOfMonth();
        org.joda.time.LocalDate.Property property20 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.roundFloorCopy();
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "24" + "'", str18, "24");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test21602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21602");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(12);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        boolean boolean16 = dateTime14.isAfter((long) 2);
        org.joda.time.DateTime dateTime18 = dateTime14.minusDays(1);
        org.joda.time.DateTime dateTime20 = dateTime14.minusHours((-1));
        java.lang.String str21 = dateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localTime24.toDateTimeToday(dateTimeZone27);
        int int29 = dateTime28.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int31 = dateTime28.get(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone33);
        org.joda.time.LocalTime localTime36 = localTime34.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime34.toDateTimeToday(dateTimeZone37);
        int int39 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean40 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime14.toMutableDateTimeISO();
        boolean boolean43 = dateTime14.isBefore((-5679974778000L));
        org.joda.time.Chronology chronology44 = dateTime14.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.centuries();
        org.joda.time.DurationField durationField46 = chronology44.weeks();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology44.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withChronology(chronology44);
        org.joda.time.Chronology chronology49 = dateTimeFormatter2.getChronolgy();
        int int50 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = dateTimeFormatter2.print((long) 27445396);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-02-24T11:11:59.999+59:12" + "'", str21, "2022-02-24T11:11:59.999+59:12");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 22 + "'", int31 == 22);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(chronology49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2000 + "'", int50 == 2000);
    }

    @Test
    public void test21603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21603");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) '4');
        java.lang.String str14 = dateTimeZone10.getNameKey(5443200001L);
        java.lang.String str16 = dateTimeZone10.getNameKey(1646724203169L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test21604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21604");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.setCopy((int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((-66523840));
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.millisOfSecond();
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar calendar14 = builder13.build();
        java.util.Calendar.Builder builder16 = builder13.setLenient(false);
        java.util.Calendar.Builder builder20 = builder16.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder25 = builder20.setTimeOfDay(16, 23, 32769, 0);
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(66512921, 40319999, 455544);
        boolean boolean30 = property12.equals((java.lang.Object) 40319999);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test21605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21605");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("59", "");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("kor");
        java.util.Locale locale12 = builder9.build();
        java.util.Locale.Builder builder14 = builder9.removeUnicodeLocaleAttribute("838");
        java.util.Locale.Builder builder15 = builder9.clearExtensions();
        java.util.Locale.Builder builder16 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setRegion("Fri Sep 08 07:15:55 GMT+00:00 2023");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Fri Sep 08 07:15:55 GMT+00:00 2023 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test21606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.LocalTime localTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime8 = property6.addNoWrapToCopy(85);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType9.getDurationType();
        org.joda.time.LocalTime localTime13 = localTime8.withFieldAdded(durationFieldType11, 10069);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test21607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21607");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra(439);
        org.joda.time.DateTime dateTime12 = dateTime8.withMillis(62135596800021L);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis(1646724124553L);
        int int15 = dateTime14.getDayOfYear();
        org.joda.time.DateTime.Property property16 = dateTime14.dayOfWeek();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        long long23 = dateTime21.getMillis();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes((int) (short) 100);
        int int36 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime37 = dateTime21.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMonths((int) (short) 100);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMillis((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.plus(readableDuration42);
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTimeISO();
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = null;
        org.joda.time.format.DateTimeParser dateTimeParser46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter45, dateTimeParser46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter47.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withZoneUTC();
        org.joda.time.Chronology chronology50 = dateTimeFormatter49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone52);
        org.joda.time.LocalTime localTime55 = localTime53.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localTime53.toDateTimeToday(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime62 = dateTime60.minusMinutes((int) (short) 100);
        int int63 = dateTimeZone58.getOffset((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter49.withZone(dateTimeZone58);
        java.lang.String str66 = dateTimeZone58.getShortName((long) 10);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone58);
        java.util.TimeZone timeZone68 = dateTimeZone58.toTimeZone();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime72 = dateTime44.toDateTime(dateTimeZone58);
        org.joda.time.DateTime.Property property73 = dateTime72.hourOfDay();
        boolean boolean74 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724345763L + "'", long6 == 1646724345763L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1646724345763L + "'", long23 == 1646724345763L);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 213120000 + "'", int36 == 213120000);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNull(chronology50);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 213120000 + "'", int63 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+59:12" + "'", str66, "+59:12");
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test21608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21608");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(435);
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withPivotYear(15);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test21609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21609");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1646723814995L);
    }

    @Test
    public void test21610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21610");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfDay(33);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withDurationAdded(readableDuration15, 26174796);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfYear(1971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test21611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime1.secondOfDay();
        int int5 = property4.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        boolean boolean14 = dateTime12.isAfter((long) 2);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(1);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks(2030);
        int int21 = property4.getDifference((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = property4.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 113145 + "'", int21 == 113145);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test21612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21612");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.LocalDateTime localDateTime9 = property6.addWrapFieldToCopy(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = property6.getAsText(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withLocale(locale13);
        java.lang.String str17 = locale13.getISO3Country();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AD" + "'", str15, "AD");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test21613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21613");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("1439");
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale8.getDisplayName(locale10);
        java.util.Locale.Builder builder14 = builder7.setLocale(locale10);
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("CAN");
        java.util.Locale.Builder builder17 = builder14.clear();
        java.util.Locale.Builder builder18 = builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setLanguageTag("0044-03-10T18:32:25.495+59:12");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 0044 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-CA" + "'", str11, "en-CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test21614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21614");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getYearOfEra();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfYear();
        org.joda.time.LocalDate.Property property6 = localDate0.year();
        org.joda.time.LocalDate.Property property7 = localDate0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test21615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21615");
        java.lang.String[] strArray12 = new java.lang.String[] { "French", "", "hi!", "weekyear", "ISOChronology[UTC]", "French", "French", "97", "French", "2022-02-22T23:59:59.999Z", "2022", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        strSet13.clear();
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale[] localeArray19 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList20, filteringMode22);
        boolean boolean24 = strSet13.retainAll((java.util.Collection<java.util.Locale>) localeList23);
        boolean boolean25 = strSet13.isEmpty();
        boolean boolean27 = strSet13.add("2024-01-23");
        boolean boolean29 = strSet13.add("2131200");
        int int30 = strSet13.size();
        boolean boolean32 = strSet13.add("292278990-09-14T22:20:00.467");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test21616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21616");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        org.joda.time.LocalDate localDate28 = property25.addToCopy(1340);
        org.joda.time.LocalDate localDate29 = property25.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime30 = localDate29.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate33 = localDate29.withPeriodAdded(readablePeriod31, (-457037));
        org.joda.time.LocalDate localDate35 = localDate33.plusYears((-27445));
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj40, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property45 = dateTime44.weekyear();
        java.lang.String str46 = property45.getAsText();
        org.joda.time.DurationField durationField47 = property45.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property45.getFieldType();
        int int49 = dateTime39.get(dateTimeFieldType48);
        org.joda.time.DateTime dateTime51 = dateTime39.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime52 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property53 = dateTime52.monthOfYear();
        int int54 = dateTime52.getHourOfDay();
        java.util.Locale locale58 = new java.util.Locale("hi!", "", "");
        java.lang.String str59 = locale58.getDisplayScript();
        java.util.Locale locale63 = new java.util.Locale("hi!", "", "");
        java.lang.String str64 = locale58.getDisplayScript(locale63);
        java.lang.String str65 = locale58.getISO3Language();
        boolean boolean66 = dateTime52.equals((java.lang.Object) str65);
        org.joda.time.DateTime dateTime68 = dateTime52.withMillis(1646723799801L);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = dateTime52.toDateTime(dateTimeZone69);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.year();
        java.lang.String str72 = dateTimeFieldType71.getName();
        int int73 = dateTime52.get(dateTimeFieldType71);
        org.joda.time.LocalDate.Property property74 = localDate35.property(dateTimeFieldType71);
        org.joda.time.LocalDate localDate75 = property74.roundHalfFloorCopy();
        org.joda.time.Interval interval76 = localDate75.toInterval();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2022" + "'", str46, "2022");
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2022 + "'", int49 == 2022);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "year" + "'", str72, "year");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2022 + "'", int73 == 2022);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(interval76);
    }

    @Test
    public void test21617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21617");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withPeriodAdded(readablePeriod9, 8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.minusMillis(600032);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMinutes(66512921);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.DateTime dateTime17 = localDateTime15.toDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plus(readableDuration18);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test21618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21618");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        gregorianCalendar7.set((int) 'a', (-457037), (int) (short) 10, 3, 34, 66556173);
        long long15 = gregorianCalendar7.getTimeInMillis();
        gregorianCalendar7.setFirstDayOfWeek(46319);
        java.util.TimeZone timeZone18 = gregorianCalendar7.getTimeZone();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfEra();
        org.joda.time.LocalDate localDate30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime31 = localDate30.toDateTimeAtMidnight();
        int int32 = property24.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime34 = property24.setCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property24.getFieldType();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfEra();
        org.joda.time.LocalDate localDate41 = localDate38.minusDays((int) '#');
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType35.getField(chronology42);
        int int45 = dateTimeField43.get(0L);
        java.lang.Object obj46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj46, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property51 = dateTime50.weekyear();
        java.lang.String str52 = property51.getAsText();
        int int53 = property51.get();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        int int56 = property51.compareTo((org.joda.time.ReadablePartial) localDate54);
        int[] intArray57 = localDate54.getValues();
        org.joda.time.LocalDate localDate59 = localDate54.minusMonths(40319999);
        org.joda.time.LocalDate.Property property60 = localDate59.dayOfYear();
        java.util.Locale locale65 = new java.util.Locale("2022-02-22T07:18:31.110+00:00:00.435", "hi!", "");
        java.lang.String str66 = dateTimeField43.getAsText((org.joda.time.ReadablePartial) localDate59, 26175799, locale65);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(locale65);
        java.util.Date date68 = calendar67.getTime();
        boolean boolean69 = timeZone18.inDaylightTime(date68);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1260954909386035L) + "'", long15 == (-1260954909386035L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2022" + "'", str52, "2022");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertEquals(locale65.toString(), "2022-02-22t07:18:31.110+00:00:00.435_HI!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "26175799" + "'", str66, "26175799");
        org.junit.Assert.assertNotNull(calendar67);
// flaky:         org.junit.Assert.assertEquals(calendar67.toString(), "java.util.GregorianCalendar[time=1645514745966,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=976,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Tue Feb 22 07:25:45 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test21619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21619");
        java.util.Date date1 = new java.util.Date(5555771430L);
        int int2 = date1.getSeconds();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Mar 06 07:16:11 GMT 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test21620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21620");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        int int7 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime2.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalTime.Property property10 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime14 = localTime12.plusHours(2022);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime17 = localTime14.withFieldAdded(durationFieldType15, (int) 'u');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DurationField durationField19 = durationFieldType15.getField(chronology18);
        boolean boolean20 = localTime9.isSupported(durationFieldType15);
        org.joda.time.LocalTime.Property property21 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime22 = property21.withMaximumValue();
        org.joda.time.LocalTime.Property property23 = localTime22.minuteOfHour();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test21621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21621");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DurationField durationField5 = chronology2.days();
        org.joda.time.DurationField durationField6 = chronology2.centuries();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 981, chronology2);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test21622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21622");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int26 = dateTime23.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localTime29.toDateTimeToday(dateTimeZone32);
        int int34 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime23.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime23.withZone(dateTimeZone36);
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.withMillis((long) (byte) 1);
        int int41 = dateTime37.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime43 = dateTime37.withCenturyOfEra(0);
        int int44 = dateTime43.getSecondOfMinute();
        org.joda.time.DateTime dateTime46 = dateTime43.withWeekyear(354);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = dateTime46.toString("Feb 11, 2022 1:14:14 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 59 + "'", int44 == 59);
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test21623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21623");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        org.joda.time.LocalDate localDate28 = property25.addToCopy(1340);
        org.joda.time.LocalDate.Property property29 = localDate28.weekyear();
        org.joda.time.LocalDate localDate30 = property29.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test21624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21624");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.time.Instant instant3 = calendar2.toInstant();
        calendar2.setLenient(true);
        long long6 = calendar2.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar2);
        calendar2.setTimeInMillis(1646723835553L);
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        java.util.Calendar calendar11 = builder10.build();
        java.util.Calendar.Builder builder13 = builder10.setLenient(false);
        java.util.Calendar.Builder builder17 = builder13.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder21 = builder13.setTimeOfDay(0, 33, 66534);
        java.util.Calendar.Builder builder23 = builder13.setLenient(true);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("2022");
        int int26 = timeZone25.getRawOffset();
        int int28 = timeZone25.getOffset(379209600000L);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25);
        java.util.TimeZone.setDefault(timeZone25);
        java.util.Calendar.Builder builder31 = builder13.setTimeZone(timeZone25);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("2022");
        int int34 = timeZone33.getRawOffset();
        int int36 = timeZone33.getOffset(379209600000L);
        java.time.ZoneId zoneId37 = timeZone33.toZoneId();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("2022");
        int int40 = timeZone39.getRawOffset();
        java.util.TimeZone.setDefault(timeZone39);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean44 = timeZone39.hasSameRules(timeZone43);
        boolean boolean45 = timeZone33.hasSameRules(timeZone39);
        timeZone33.setID("1 Jan 1970 00:00:00 GMT");
        java.util.Calendar.Builder builder48 = builder13.setTimeZone(timeZone33);
        calendar2.setTimeZone(timeZone33);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1646723835553,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1 Jan 1970 00:00:00 GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=17,SECOND=15,MILLISECOND=563,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645514746055L + "'", long6 == 1645514746055L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645514746055,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=55,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test21625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21625");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfWeek(217);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 217 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test21626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21626");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        boolean boolean9 = dateTime7.isAfter((long) 2);
        org.joda.time.DateTime dateTime11 = dateTime7.minusDays(1);
        org.joda.time.DateTime dateTime13 = dateTime7.minusHours((-1));
        java.lang.String str14 = dateTime7.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        int int22 = dateTime21.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime21.get(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone26);
        org.joda.time.LocalTime localTime29 = localTime27.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localTime27.toDateTimeToday(dateTimeZone30);
        int int32 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean33 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime7.toMutableDateTimeISO();
        boolean boolean36 = dateTime7.isBefore((-5679974778000L));
        org.joda.time.Chronology chronology37 = dateTime7.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.centuries();
        org.joda.time.DurationField durationField39 = chronology37.weeks();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = chronology37.get(readablePeriod43, 5556059513L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-24T11:11:59.999+59:12" + "'", str14, "2022-02-24T11:11:59.999+59:12");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test21627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21627");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        int int21 = dateTime20.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = dateTime20.get(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        int int31 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean32 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime34 = dateTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter37.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter37.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withDefaultYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter41.withPivotYear((java.lang.Integer) 66592207);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone47);
        org.joda.time.LocalTime localTime50 = localTime48.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localTime48.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime57 = dateTime55.minusMinutes((int) (short) 100);
        int int58 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime57);
        int int60 = dateTimeZone53.getStandardOffset((long) 7);
        java.lang.String str62 = dateTimeZone53.getShortName((long) 23);
        long long64 = dateTimeZone53.nextTransition(37440032L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter45.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime66 = dateTime34.toDateTime(dateTimeZone53);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-24T11:11:59.999+59:12" + "'", str13, "2022-02-24T11:11:59.999+59:12");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 213120000 + "'", int58 == 213120000);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 213120000 + "'", int60 == 213120000);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+59:12" + "'", str62, "+59:12");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 37440032L + "'", long64 == 37440032L);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTime66);
    }

    @Test
    public void test21628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21628");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        long long10 = dateTimeField2.add(1646723755047L, 23);
        java.util.Locale locale15 = new java.util.Locale("", "2022", "");
        java.lang.String str16 = dateTimeField2.getAsText((int) (short) 1, locale15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        int int23 = dateTime21.getYear();
        org.joda.time.DateTime dateTime24 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        boolean boolean27 = localDate25.isSupported(durationFieldType26);
        int int28 = localDate25.size();
        org.joda.time.DateTime dateTime29 = dateTime24.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate31 = localDate25.minusWeeks((int) (short) 0);
        java.lang.Object obj33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj33, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property38 = dateTime37.weekyear();
        java.util.Locale locale40 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime41 = property38.setCopy("0", locale40);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale40);
        java.util.Locale locale43 = java.util.Locale.UK;
        java.lang.String str44 = locale40.getDisplayCountry(locale43);
        java.lang.String str45 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate25, 292269054, locale43);
        org.joda.time.DurationField durationField46 = dateTimeField2.getRangeDurationField();
        long long49 = dateTimeField2.add(1646723796784L, 38);
        java.lang.String str50 = dateTimeField2.getName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1646725135047L + "'", long10 == 1646725135047L);
        org.junit.Assert.assertEquals(locale15.toString(), "_2022");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=1645514746122,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=122,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "292269054" + "'", str45, "292269054");
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1646726076784L + "'", long49 == 1646726076784L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "minuteOfDay" + "'", str50, "minuteOfDay");
    }

    @Test
    public void test21629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21629");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(457423);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test21630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21630");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) 26162278);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str10 = dateTimeFieldType9.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.secondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDateTime7.getFields();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
    }

    @Test
    public void test21631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21631");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfCentury(34);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYear(32770);
        int int7 = localDateTime2.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test21632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21632");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        java.util.Locale locale10 = new java.util.Locale("DateTimeField[monthOfYear]", "GMT", "7");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withLocale(locale10);
        java.lang.Integer int12 = dateTimeFormatter5.getPivotYear();
        java.lang.Integer int13 = dateTimeFormatter5.getPivotYear();
        org.joda.time.Chronology chronology14 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 2405);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.parse("China", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals(locale10.toString(), "datetimefield[monthofyear]_GMT_7");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test21633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21633");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology2);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.DateTime.Property property14 = dateTime12.era();
        int int15 = dateTime12.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime12.withSecondOfMinute(26501648);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26501648 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
    }

    @Test
    public void test21634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21634");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addWrapFieldToCopy(27445396);
        org.joda.time.LocalTime localTime14 = localTime12.withSecondOfMinute(20);
        org.joda.time.LocalTime localTime16 = localTime14.plusHours(67);
        org.joda.time.LocalTime.Property property17 = localTime14.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = property17.addNoWrapToCopy(55598399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test21635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21635");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology2.add(readablePeriod6, (long) 22, 2024);
        org.joda.time.DateTimeField dateTimeField10 = chronology2.minuteOfDay();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate.Property property12 = localDate11.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withDayOfWeek(2405);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2405 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 22L + "'", long9 == 22L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test21636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21636");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        int int9 = dateTimeField7.getLeapAmount(0L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test21637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21637");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMinutes(26175799);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        boolean boolean7 = localDateTime0.equals((java.lang.Object) instant5);
        org.joda.time.Chronology chronology8 = instant5.getChronology();
        org.joda.time.Instant instant10 = instant5.plus(1645514672138L);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test21638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21638");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField7 = chronology1.weeks();
        java.lang.String str8 = durationField7.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DurationField[weeks]" + "'", str8, "DurationField[weeks]");
    }

    @Test
    public void test21639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21639");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("2022");
        int int4 = timeZone3.getRawOffset();
        int int6 = timeZone3.getOffset(379209600000L);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone3);
        java.lang.String str8 = timeZone3.getID();
        java.util.Calendar.Builder builder9 = builder0.setTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder9.setCalendarType("Germany");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Germany");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645514746261,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=261,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT" + "'", str8, "GMT");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test21640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21640");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.set(1340, 86399, 12);
        gregorianCalendar7.setLenient(false);
        int int22 = gregorianCalendar7.getMinimalDaysInFirstWeek();
        gregorianCalendar7.set(17, (-292275054), 26182169, 0, 81223000, 15);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar7.setWeekDate(2024, 52, 768);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 768");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test21641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21641");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfDay(33);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withWeekyear(66871231);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plus(readablePeriod17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusSeconds(67020);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test21642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21642");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy(0);
        int int15 = localDateTime14.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfEra(59518200);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusHours(39);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(1543);
        int int22 = localDateTime19.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test21643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21643");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property5.setCopy((int) '#');
        org.joda.time.LocalTime localTime8 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property5.addCopy(1646723800223L);
        org.joda.time.LocalTime localTime12 = property5.addCopy(4320000000L);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test21644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21644");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        boolean boolean4 = localDate0.equals((java.lang.Object) 2022);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        int int11 = dateTime9.getYear();
        org.joda.time.DateTime dateTime12 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        boolean boolean15 = localDate13.isSupported(durationFieldType14);
        int int16 = localDate13.size();
        org.joda.time.DateTime dateTime17 = dateTime12.withFields((org.joda.time.ReadablePartial) localDate13);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DurationField durationField25 = property23.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property23.getFieldType();
        java.lang.String str27 = dateTimeFieldType26.toString();
        boolean boolean28 = dateTime12.isSupported(dateTimeFieldType26);
        int int29 = localDate0.indexOf(dateTimeFieldType26);
        org.joda.time.LocalDate.Property property30 = localDate0.yearOfEra();
        org.joda.time.Chronology chronology31 = localDate0.getChronology();
        org.joda.time.LocalDate localDate33 = localDate0.minusYears(970);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate0.withPeriodAdded(readablePeriod34, 0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "weekyear" + "'", str27, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test21645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21645");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(55);
        org.joda.time.DateTime dateTime6 = dateTime4.withHourOfDay(10);
        org.joda.time.DateTime dateTime8 = dateTime4.withMillis(6000014L);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(26442);
        org.joda.time.DateTime dateTime13 = property9.setCopy(3600434);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test21646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21646");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        int int26 = property24.get();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = property24.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate31 = localDate27.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate32 = localDate18.withFields((org.joda.time.ReadablePartial) localDate27);
        int int33 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate.Property property34 = localDate12.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = property34.addToCopy(66574754);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        org.joda.time.DateTimeField dateTimeField38 = property34.getField();
        org.joda.time.LocalDate localDate39 = property34.roundCeilingCopy();
        org.joda.time.LocalDate localDate40 = property34.roundFloorCopy();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        int int42 = property34.getMaximumTextLength(locale41);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test21647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21647");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property5.setCopy((int) '#');
        org.joda.time.LocalTime localTime9 = property5.addNoWrapToCopy(28);
        org.joda.time.LocalTime localTime10 = property5.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test21648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21648");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        int int5 = dateTimeField2.getDifference(1646723820000L, (long) 959);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("1970");
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str11 = dateTimeField2.getAsShortText(395, locale8);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645514746357,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=357,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "395" + "'", str11, "395");
    }

    @Test
    public void test21649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21649");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test21650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21650");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfCentury(34);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYear(32770);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withPeriodAdded(readablePeriod7, 213120000);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((-17975955));
        org.joda.time.DateTime.Property property13 = dateTime10.millisOfSecond();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        long long16 = durationField15.getUnitMillis();
        int int18 = durationField15.getValue((long) 62424);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 43200000L + "'", long16 == 43200000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test21651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21651");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        int int13 = localDate12.getWeekyear();
        int[] intArray14 = localDate12.getValues();
        int int15 = localDate12.getCenturyOfEra();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        boolean boolean23 = dateTime19.isAfter((long) 4);
        org.joda.time.DateTime dateTime25 = dateTime19.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime19.getZone();
        org.joda.time.DateTime dateTime27 = localDate12.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(900);
        java.lang.Object obj30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj30, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property35 = dateTime34.weekyear();
        java.util.Locale locale37 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime38 = property35.setCopy("0", locale37);
        org.joda.time.DateTime dateTime39 = property35.withMaximumValue();
        org.joda.time.DateTime dateTime41 = property35.setCopy(66514);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfEra();
        int int43 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime45 = dateTime41.plusMonths(116);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(66594065L, dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime45.withFields((org.joda.time.ReadablePartial) localDate48);
        org.joda.time.DateTime dateTime50 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property51 = dateTime49.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2024 + "'", int13 == 2024);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2024, 1, 25]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test21652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21652");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.withMinuteOfHour(2);
        boolean boolean8 = dateTime6.isBefore((long) 2012);
        org.joda.time.DateTime dateTime10 = dateTime6.withYearOfCentury(0);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfDay(66482);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test21653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21653");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter4.getZone();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer8, (long) 392);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test21654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21654");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.yearOfCentury();
        long long15 = dateTimeField12.add(1646724246168L, (long) 7200007);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 227211922049046168L + "'", long15 == 227211922049046168L);
    }

    @Test
    public void test21655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21655");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) (-213119948L));
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfSecond();
        java.lang.String str3 = property2.getName();
        org.joda.time.Interval interval4 = property2.toInterval();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "millisOfSecond" + "'", str3, "millisOfSecond");
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test21656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21656");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        gregorianCalendar7.set((int) 'a', (-457037), (int) (short) 10, 3, 34, 66556173);
        gregorianCalendar7.set(659, 80998, 33);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        gregorianCalendar7.set(66929, 0, 26542973, 292278922, 69720490, 10);
        java.lang.String str27 = gregorianCalendar7.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=66929,MONTH=0,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=26542973,DAY_OF_YEAR=66,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=292278922,MINUTE=69720490,SECOND=10,MILLISECOND=453,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str27, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=66929,MONTH=0,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=26542973,DAY_OF_YEAR=66,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=292278922,MINUTE=69720490,SECOND=10,MILLISECOND=453,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test21657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21657");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("China");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet7 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet8 = provider0.getAvailableIDs();
        boolean boolean9 = strSet8.isEmpty();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21658");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale4 = dateTimeFormatter3.getLocale();
        int int5 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZoneUTC();
        java.lang.Integer int7 = dateTimeFormatter3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter3.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test21659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21659");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        java.lang.String str8 = property7.getAsText();
        int int9 = property7.get();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = property7.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate14 = localDate10.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate15 = localDate1.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate17 = localDate1.plusYears(20);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate1.withPeriodAdded(readablePeriod18, 4);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra(5);
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra(437);
        org.joda.time.LocalDate.Property property25 = localDate24.year();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test21660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21660");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) '4');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        boolean boolean26 = dateTime24.isAfter((long) 2);
        org.joda.time.DateTime dateTime28 = dateTime24.minusDays(1);
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean34 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone36);
        org.joda.time.LocalTime localTime39 = localTime37.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localTime37.toDateTimeToday(dateTimeZone40);
        int int42 = dateTime41.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int44 = dateTime41.get(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone46);
        org.joda.time.LocalTime localTime49 = localTime47.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localTime47.toDateTimeToday(dateTimeZone50);
        int int52 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime.Property property53 = dateTime41.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime41.withZone(dateTimeZone54);
        int int56 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime55.plus((long) 3);
        java.util.GregorianCalendar gregorianCalendar59 = dateTime55.toGregorianCalendar();
        java.lang.String str60 = gregorianCalendar59.getCalendarType();
        gregorianCalendar59.set(0, 40319999, (-5540824), 26180752, 182311, (-457079));
        java.util.Calendar.Builder builder68 = new java.util.Calendar.Builder();
        java.util.Calendar calendar69 = builder68.build();
        java.util.Calendar.Builder builder74 = builder68.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone76 = java.util.TimeZone.getTimeZone("2022");
        timeZone76.setID("French");
        java.util.Calendar.Builder builder79 = builder74.setTimeZone(timeZone76);
        gregorianCalendar59.setTimeZone(timeZone76);
        java.util.Locale locale84 = new java.util.Locale("hi!", "", "");
        java.util.Set<java.lang.Character> charSet85 = locale84.getExtensionKeys();
        java.lang.String str86 = locale84.getVariant();
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone76, locale84);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime88 = property16.setCopy("2024-01-23", locale84);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2024-01-23\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(gregorianCalendar59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "gregory" + "'", str60, "gregory");
        org.junit.Assert.assertNotNull(calendar69);
        org.junit.Assert.assertEquals(calendar69.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(calendar87);
// flaky:         org.junit.Assert.assertEquals(calendar87.toString(), "java.util.GregorianCalendar[time=1645514746494,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=494,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test21661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21661");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate14.plusWeeks(32770);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears(671);
        org.joda.time.LocalDate localDate20 = localDate16.minusMonths(80998);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate16.getValue(40918);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 40918");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test21662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21662");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.size();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusWeeks(8540);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(572);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(66521);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(59);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withWeekyear(32772);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.monthOfYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = localDateTime20.getFieldTypes();
        java.util.Date date25 = localDateTime20.toDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Jan 20 04:29:00 GMT 165");
    }

    @Test
    public void test21663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21663");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate0.getFields();
        org.joda.time.LocalDate localDate7 = localDate0.withYearOfEra(5);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate0.minus(readablePeriod8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis(29);
        int int13 = dateTime10.getYearOfEra();
        long long14 = dateTime10.getMillis();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645447680000L + "'", long14 == 1645447680000L);
    }

    @Test
    public void test21664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21664");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "");
        int int8 = dateTimeField3.getMaximumShortTextLength(locale7);
        java.lang.String str11 = nameProvider0.getName(locale7, "24", "yearOfCentury");
        java.util.Locale locale12 = null;
        java.lang.String str15 = nameProvider0.getShortName(locale12, "", "DateTimeField[secondOfMinute]");
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfDay();
        boolean boolean20 = durationFieldType16.isSupported(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.millisOfSecond();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.yearOfCentury();
        java.lang.String str27 = dateTimeField26.toString();
        boolean boolean29 = dateTimeField26.isLeap(26891009280000L);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.minuteOfDay();
        boolean boolean36 = durationFieldType32.isSupported(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.clockhourOfHalfday();
        java.util.Locale locale44 = new java.util.Locale("24", "hi!");
        java.lang.String str45 = dateTimeField40.getAsShortText(5555776727L, locale44);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.minuteOfDay();
        boolean boolean51 = durationFieldType47.isSupported(chronology49);
        org.joda.time.DateTimeField dateTimeField52 = chronology49.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology49.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField55 = chronology49.clockhourOfHalfday();
        java.util.Locale locale59 = new java.util.Locale("24", "hi!");
        java.lang.String str60 = dateTimeField55.getAsShortText(5555776727L, locale59);
        java.lang.String str61 = dateTimeField40.getAsShortText(35, locale59);
        java.lang.String str62 = locale59.getLanguage();
        java.util.Locale locale63 = locale59.stripExtensions();
        java.lang.String str65 = locale59.getExtension('a');
        long long66 = dateTimeField26.set(1646723960289L, "31", locale59);
        java.lang.String str67 = locale59.getLanguage();
        java.lang.String str70 = nameProvider0.getName(locale59, "35", "07:22:47.188");
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology72 = localDate71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.minuteOfDay();
        java.util.Locale locale77 = new java.util.Locale("hi!", "", "");
        int int78 = dateTimeField73.getMaximumShortTextLength(locale77);
        long long80 = dateTimeField73.roundHalfCeiling((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = dateTimeField73.getType();
        java.util.Locale locale86 = new java.util.Locale("French", "0", "+00:00");
        java.lang.String str87 = dateTimeField73.getAsText((long) ' ', locale86);
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleAttributes();
        java.lang.String str91 = nameProvider0.getShortName(locale86, "18:36:15.999", "Feb 24, 0007 7:20:46 AM");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateTimeField[yearOfCentury]" + "'", str27, "DateTimeField[yearOfCentury]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "7" + "'", str45, "7");
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertEquals(locale59.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "7" + "'", str60, "7");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "35" + "'", str61, "35");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "24" + "'", str62, "24");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "24_HI!");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1930720760289L + "'", long66 == 1930720760289L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "24" + "'", str67, "24");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertEquals(locale86.toString(), "french_0_+00:00");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "0" + "'", str87, "0");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test21665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21665");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        java.lang.String str9 = property8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withPeriodAdded(readablePeriod19, 8);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.minusMillis(600032);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds((int) (short) 100);
        int int26 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        int int27 = localDateTime25.size();
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property28.addToCopy(26498425);
        int int31 = localDateTime30.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[millisOfDay]" + "'", str9, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 85899968 + "'", int31 == 85899968);
    }

    @Test
    public void test21666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21666");
        java.util.Date date1 = new java.util.Date((long) 435);
        date1.setYear(23);
        int int4 = date1.getMonth();
        java.util.Date date6 = new java.util.Date(1646723755766L);
        boolean boolean7 = date1.before(date6);
        int int8 = date1.getMinutes();
        int int9 = date1.getDate();
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 01 00:00:00 GMT 1923");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test21667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21667");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate5 = localDate2.minusDays((int) '#');
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfMonth();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test21668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21668");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.size();
        int int13 = localDateTime11.getEra();
        int int14 = localDateTime11.size();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusDays(26176839);
        int int17 = localDateTime16.getWeekyear();
        int int18 = localDateTime16.getMillisOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 71670 + "'", int17 == 71670);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 85680000 + "'", int18 == 85680000);
    }

    @Test
    public void test21669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21669");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtCurrentTime();
        boolean boolean3 = dateTime2.isAfterNow();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test21670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21670");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillis(2101505712710400000L);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test21671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21671");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("years");
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet5 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet6 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("DateTimeField[era]");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test21672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21672");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusMinutes(59);
        int int12 = localDateTime11.getEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMillisOfDay(66810369);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusMillis((int) '4');
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test21673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21673");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        boolean boolean4 = localDate0.equals((java.lang.Object) 2022);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str7 = dateTimeZone5.getNameKey(0L);
        org.joda.time.DateTime dateTime8 = localDate0.toDateTimeAtStartOfDay(dateTimeZone5);
        int int9 = dateTime8.getSecondOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        org.joda.time.DateTime.Property property11 = dateTime8.minuteOfDay();
        org.joda.time.Instant instant12 = dateTime8.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test21674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21674");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime();
        org.joda.time.DateTime.Property property6 = dateTime1.minuteOfHour();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone13);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime14.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter11.withZone(dateTimeZone22);
        int int27 = dateTimeZone22.getOffsetFromLocal(1646724193486L);
        org.joda.time.DateTime dateTime28 = dateTime1.toDateTime(dateTimeZone22);
        int int29 = dateTime1.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 213120000 + "'", int27 == 213120000);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
    }

    @Test
    public void test21675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21675");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        int int8 = calendar6.getGreatestMinimum(11);
        calendar6.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("2022");
        int int18 = timeZone17.getRawOffset();
        calendar6.setTimeZone(timeZone17);
        boolean boolean20 = timeZone1.hasSameRules(timeZone17);
        java.util.TimeZone.setDefault(timeZone17);
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale23);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone17, locale23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DurationField durationField31 = chronology27.days();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology27.add(readablePeriod32, 1646723777197L, 19059);
        org.joda.time.Chronology chronology36 = chronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.util.Calendar.Builder builder43 = new java.util.Calendar.Builder();
        java.util.Calendar calendar44 = builder43.build();
        java.util.Calendar.Builder builder46 = builder43.setLenient(false);
        java.util.Locale locale50 = new java.util.Locale("hi!", "", "");
        java.lang.String str51 = locale50.getDisplayScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter54.withLocale(locale55);
        java.lang.String str57 = locale50.getDisplayName(locale55);
        java.util.Calendar.Builder builder58 = builder46.setLocale(locale55);
        java.lang.String str59 = dateTimeZone41.getShortName(35L, locale55);
        java.util.Locale locale63 = new java.util.Locale("hi!", "", "");
        java.lang.String str64 = locale63.getDisplayScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter65 = null;
        org.joda.time.format.DateTimeParser dateTimeParser66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter65, dateTimeParser66);
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter67.withLocale(locale68);
        java.lang.String str70 = locale63.getDisplayName(locale68);
        java.lang.String str71 = locale55.getDisplayScript(locale63);
        java.lang.String str72 = locale55.getDisplayCountry();
        java.lang.String str73 = dateTimeField38.getAsShortText(2097969282864000L, locale55);
        java.lang.String str74 = locale23.getDisplayName(locale55);
        java.lang.String str75 = locale23.getScript();
        java.lang.String str76 = locale23.toString();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514746702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645514746702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1646723777197L + "'", long35 == 1646723777197L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(calendar44);
        org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "51" + "'", str73, "51");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test21676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21676");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        int int4 = timeZone1.getOffset(379209600000L);
        java.time.ZoneId zoneId5 = timeZone1.toZoneId();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("2022");
        int int8 = timeZone7.getRawOffset();
        java.util.TimeZone.setDefault(timeZone7);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean12 = timeZone7.hasSameRules(timeZone11);
        boolean boolean13 = timeZone1.hasSameRules(timeZone7);
        timeZone7.setID("1439");
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        int int19 = timeZone7.getOffset((-3029443199428L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1439' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645514746724,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1439\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=724,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test21677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21677");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        int int8 = dateTime6.getMonthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime6.minusMonths(66598254);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        long long15 = dateTime12.getMillis();
        boolean boolean16 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime12);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime6.toGregorianCalendar();
        int int18 = gregorianCalendar17.getWeeksInWeekYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1645514746735L + "'", long15 == 1645514746735L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test21678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21678");
        java.util.Date date5 = new java.util.Date(732, 0, (int) (short) -1, 512, 8741953);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 03 03:13:00 GMT+00:00 2648");
    }

    @Test
    public void test21679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21679");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear(436);
        int int7 = localDate4.getDayOfMonth();
        int int8 = localDate4.getDayOfWeek();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        int int15 = dateTime13.getYear();
        org.joda.time.DateTime dateTime16 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.hours();
        boolean boolean19 = localDate17.isSupported(durationFieldType18);
        int int20 = localDate17.size();
        org.joda.time.DateTime dateTime21 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate localDate23 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int25 = localDate17.get(dateTimeFieldType24);
        org.joda.time.LocalDate localDate27 = localDate17.withWeekyear(26162278);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        int int30 = localDate28.getDayOfWeek();
        org.joda.time.LocalDate localDate32 = localDate28.minusYears(10);
        int[] intArray33 = localDate28.getValues();
        org.joda.time.LocalDate.Property property34 = localDate28.era();
        org.joda.time.LocalDate localDate35 = property34.roundCeilingCopy();
        org.joda.time.LocalDate localDate37 = property34.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate38 = property34.getLocalDate();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        int int41 = localDate39.getDayOfWeek();
        org.joda.time.LocalDate localDate43 = localDate39.minusYears(10);
        int[] intArray44 = localDate39.getValues();
        org.joda.time.LocalDate.Property property45 = localDate39.era();
        org.joda.time.LocalDate localDate46 = property45.roundCeilingCopy();
        org.joda.time.LocalDate localDate48 = property45.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate49 = property45.getLocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.withYear(34);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = localDate51.getFieldType(0);
        boolean boolean54 = localDate38.isSupported(dateTimeFieldType53);
        int int55 = localDate27.get(dateTimeFieldType53);
        org.joda.time.LocalDate.Property property56 = localDate4.property(dateTimeFieldType53);
        org.joda.time.LocalDate localDate58 = property56.setCopy(900);
        org.joda.time.LocalDate localDate59 = property56.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight60 = localDate59.toDateMidnight();
        org.joda.time.LocalDate localDate62 = localDate59.withYearOfEra(938);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 55 + "'", int25 == 55);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 26162278 + "'", int55 == 26162278);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(localDate62);
    }

    @Test
    public void test21680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21680");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        java.util.Date date2 = localDate0.toDate();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(292278993);
        org.joda.time.LocalDate localDate6 = localDate0.withYearOfEra(26176839);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear(57);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Feb 24 00:00:00 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test21681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21681");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 40319999);
        org.joda.time.DateTime dateTime2 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay(0);
        org.joda.time.DateTime.Property property5 = dateTime2.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test21682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21682");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.util.GregorianCalendar[time=1645514420060,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=20,SECOND=20,MILLISECOND=60,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.util.gregoriancalendar[time=1645514420060,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"gmt\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=2022,month=1,week_of_year=9,week_of_month=4,day_of_month=22,day_of_year=53,day_of_week=3,day_of_week_in_month=4,am_pm=0,hour=7,hour_of_day=7,minute=20,second=20,millisecond=60,zone_offset=0,dst_offset=0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21683");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        calendar0.setTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(23);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        boolean boolean17 = timeZone11.hasSameRules(timeZone16);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("en-ca");
        java.lang.String str20 = timeZone19.getID();
        boolean boolean21 = timeZone19.observesDaylightTime();
        boolean boolean22 = timeZone11.hasSameRules(timeZone19);
        java.lang.String str23 = timeZone19.getID();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        timeZone19.setID("Coordinated Universal Time");
        timeZone19.setID("weekyear");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId29 = timeZone19.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: weekyear");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+23:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GMT" + "'", str20, "GMT");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GMT" + "'", str23, "GMT");
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test21684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21684");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.DateMidnight dateMidnight17 = localDate12.toDateMidnight();
        org.joda.time.LocalDate localDate19 = localDate12.plusWeeks(959);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test21685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21685");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMillis((int) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        int int18 = localDateTime15.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusHours((int) (byte) 0);
        boolean boolean21 = localDateTime10.isEqual((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime10.withMillisOfSecond(714);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = localDate24.isSupported(durationFieldType25);
        int int27 = localDate24.size();
        org.joda.time.LocalDate localDate29 = localDate24.plusYears((int) 'a');
        org.joda.time.DateTime dateTime30 = localDate29.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra(66556989);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate29.minus(readablePeriod33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = localDateTime10.isEqual((org.joda.time.ReadablePartial) localDate29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test21686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21686");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((-4400281234485837165L));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test21687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21687");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean10 = dateTime8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.minusMillis((int) (short) 0);
        java.lang.String str13 = dateTime8.toString();
        org.joda.time.DateTime dateTime15 = dateTime8.plusHours(12);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-24T11:11:59.999+59:12" + "'", str13, "2022-02-24T11:11:59.999+59:12");
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test21688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21688");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "");
        int int8 = dateTimeField3.getMaximumShortTextLength(locale7);
        java.lang.String str11 = nameProvider0.getName(locale7, "24", "yearOfCentury");
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str17 = nameProvider0.getShortName(locale12, "Property[weekyear]", "10");
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale18.getDisplayLanguage(locale20);
        java.lang.String str24 = nameProvider0.getShortName(locale18, "", "7");
        java.util.Locale locale28 = new java.util.Locale("hi!", "", "");
        java.lang.String str29 = locale28.getDisplayScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        java.util.Locale locale33 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withLocale(locale33);
        java.lang.String str35 = locale28.getDisplayName(locale33);
        boolean boolean36 = locale28.hasExtensions();
        java.util.Locale locale40 = new java.util.Locale("French", "0", "+00:00");
        java.lang.String str41 = locale28.getDisplayName(locale40);
        java.lang.String str44 = nameProvider0.getName(locale28, "en", "java.util.GregorianCalendar[time=1645514210170,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1439\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=50,MILLISECOND=170,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-CA" + "'", str13, "en-CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals(locale28.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals(locale40.toString(), "french_0_+00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test21689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21689");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMinuteOfHour((int) (short) 0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(71670);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMillis(0);
        org.joda.time.LocalTime localTime13 = localTime11.minusHours((int) ' ');
        org.joda.time.LocalTime localTime15 = localTime13.plusSeconds((int) (byte) 1);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfSecond();
        org.joda.time.LocalTime localTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        boolean boolean26 = dateTime24.isAfter((long) 2);
        org.joda.time.DateTime dateTime28 = dateTime24.minusDays(1);
        org.joda.time.DateTime dateTime30 = dateTime24.minusHours((-1));
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.DateTime dateTime33 = dateTime30.plusMillis((int) '4');
        org.joda.time.DateTime.Property property34 = dateTime30.weekOfWeekyear();
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("0");
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = property34.getAsShortText(locale37);
        java.lang.String str39 = property16.getAsText(locale37);
        java.lang.String str40 = locale37.getDisplayCountry();
        java.util.Locale locale41 = locale37.stripExtensions();
        boolean boolean42 = locale37.hasExtensions();
        java.util.Locale.setDefault(locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = localDateTime7.toString("minuteOfHour", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 24 + "'", int31 == 24);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "8" + "'", str38, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "890" + "'", str39, "890");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test21690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21690");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime6.weekOfWeekyear();
        int int21 = property20.getMaximumValue();
        org.joda.time.DateTime dateTime22 = property20.roundFloorCopy();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test21691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21691");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1);
        int int11 = localDateTime8.getWeekyear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(21);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfEra(66514147);
        int int19 = localDateTime15.getDayOfMonth();
        int[] intArray20 = localDateTime15.getValues();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[20, 4, 3, 40320132]");
    }

    @Test
    public void test21692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21692");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy(213120000);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test21693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21693");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.year();
        long long15 = dateTimeField12.add(1646723958857L, 33520231);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1057797967418358857L + "'", long15 == 1057797967418358857L);
    }

    @Test
    public void test21694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21694");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.weeks();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(694252944000L, chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfHour();
        org.joda.time.Chronology chronology9 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfEra();
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test21695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21695");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        int int11 = localDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfCentury();
        int int14 = localDateTime10.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 362 + "'", int11 == 362);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test21696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21696");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        int int8 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra(292269054);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test21697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21697");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getStandardOffset((long) (-1));
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) (-292275054));
        java.util.Locale locale11 = new java.util.Locale("52", "2024-01-23");
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = dateTimeZone2.getName(1646723863664L, locale11);
        int int15 = dateTimeZone2.getStandardOffset(1646723937616L);
        long long19 = dateTimeZone2.convertLocalToUTC((-54523359679189854L), false, 1646723869221L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 213120000 + "'", int5 == 213120000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "52_2024-01-23");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+59:12" + "'", str13, "+59:12");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213120000 + "'", int15 == 213120000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-54523359892309854L) + "'", long19 == (-54523359892309854L));
    }

    @Test
    public void test21698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21698");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime28 = dateTime14.plusWeeks(4);
        org.joda.time.Instant instant30 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant30.minus(readableDuration31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant35 = instant32.withDurationAdded(readableDuration33, 58);
        org.joda.time.Instant instant37 = instant35.minus(1646723986438L);
        boolean boolean38 = dateTime28.isAfter((org.joda.time.ReadableInstant) instant37);
        org.joda.time.DateTime dateTime40 = dateTime28.withMillis((long) 194);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724346977L + "'", long6 == 1646724346977L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1117 + "'", int7 == 1117);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test21699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21699");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        int int13 = localDate12.getWeekyear();
        org.joda.time.LocalDate.Property property14 = localDate12.weekOfWeekyear();
        org.joda.time.LocalDate localDate15 = property14.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2024 + "'", int13 == 2024);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test21700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21700");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = chronology2.add(readablePeriod8, 1646724326776L, 26654463);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646724326776L + "'", long11 == 1646724326776L);
    }

    @Test
    public void test21701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21701");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.Integer int20 = dateTimeFormatter19.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withPivotYear(786);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.lang.String str34 = locale33.getISO3Country();
        java.lang.String str35 = dateTimeZone31.getName((long) 'u', locale33);
        java.lang.String str36 = dateTimeZone31.toString();
        long long39 = dateTimeZone31.adjustOffset(39958L, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter19.withZone(dateTimeZone31);
        java.util.Locale locale41 = dateTimeFormatter19.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+59:12" + "'", str35, "+59:12");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+59:12" + "'", str36, "+59:12");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 39958L + "'", long39 == 39958L);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNull(locale41);
    }

    @Test
    public void test21702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21702");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.hourOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.weekyearOfCentury();
        int int9 = dateTimeField8.getMinimumValue();
        java.lang.String str11 = dateTimeField8.getAsShortText((long) 2030);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "70" + "'", str11, "70");
    }

    @Test
    public void test21703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21703");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        java.lang.String str8 = property7.getAsText();
        int int9 = property7.get();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = property7.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate14 = localDate10.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate15 = localDate1.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test21704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21704");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        int int26 = property24.get();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = property24.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate31 = localDate27.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate32 = localDate18.withFields((org.joda.time.ReadablePartial) localDate27);
        int int33 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate27);
        int int34 = localDate27.size();
        int int35 = localDate27.getWeekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.seconds();
        boolean boolean37 = localDate27.isSupported(durationFieldType36);
        org.joda.time.LocalDate localDate39 = localDate27.plusMonths(12);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.minuteOfDay();
        boolean boolean44 = durationFieldType40.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int49 = dateTimeZone47.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.minuteOfDay();
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale56.toLanguageTag();
        java.lang.String str58 = locale56.getDisplayVariant();
        java.lang.String str59 = dateTimeField54.getAsText((long) (short) 100, locale56);
        java.util.Set<java.lang.Character> charSet60 = locale56.getExtensionKeys();
        java.lang.String str61 = dateTimeZone47.getShortName((long) 66514147, locale56);
        org.joda.time.Chronology chronology62 = chronology42.withZone(dateTimeZone47);
        org.joda.time.DateTime dateTime63 = localDate27.toDateTimeAtMidnight(dateTimeZone47);
        java.util.Locale locale64 = java.util.Locale.UK;
        java.lang.String str65 = locale64.getLanguage();
        java.util.Calendar calendar66 = dateTime63.toCalendar(locale64);
        calendar66.set(66534241, 66609315, 66555151, 66534241, 163, 2922690);
        calendar66.setTimeInMillis((long) 565);
        calendar66.set(26464873, 0, 3120, (-2000), 26714679);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 435 + "'", int49 == 435);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en-CA" + "'", str57, "en-CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.435" + "'", str61, "+00:00:00.435");
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "en" + "'", str65, "en");
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.435,offset=435,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=26464873,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3120,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=-2000,MINUTE=26714679,SECOND=1,MILLISECOND=0,ZONE_OFFSET=435,DST_OFFSET=0]");
    }

    @Test
    public void test21705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21705");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        java.lang.String str9 = property8.getAsText();
        int int10 = property8.get();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.joda.time.LocalDate localDate19 = localDate17.plusWeeks(32770);
        org.joda.time.LocalDate localDate20 = localDate0.withFields((org.joda.time.ReadablePartial) localDate19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = property26.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.Instant instant33 = dateTime31.toInstant();
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long40 = chronology34.getDateTimeMillis(1646723917987L, 66753663, 362, 33519514, 66980665);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66753663 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Feb 10 07:25:47 GMT 2652");
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test21706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21706");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, false, (long) '#');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone2);
        long long11 = dateTimeZone2.previousTransition(1646724171145L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-213120000L) + "'", long8 == (-213120000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646724171145L + "'", long11 == 1646724171145L);
    }

    @Test
    public void test21707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21707");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = gregorianCalendar7.getGreatestMinimum(92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 92");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test21708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21708");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYearOfCentury();
        int int7 = dateTime4.getSecondOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.plusDays((int) (short) 100);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale11.getCountry();
        java.util.Calendar calendar14 = dateTime4.toCalendar(locale11);
        calendar14.set(116, 894, 771, 0, 66612862, 54);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 67067 + "'", int7 == 67067);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=116,MONTH=894,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=771,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=0,MINUTE=66612862,SECOND=54,MILLISECOND=109,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test21709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21709");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime.Property property14 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMillis(292278993);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime24 = dateTime20.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime25 = dateTime20.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withDurationAdded(readableDuration26, 82800000);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusDays(28);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withWeekyear(38);
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        int int34 = localDateTime32.getWeekOfWeekyear();
        boolean boolean35 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.era();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test21710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21710");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(8);
        org.joda.time.LocalTime localTime8 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime11 = property10.withMinimumValue();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        long long18 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone20);
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime21.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) (short) 100);
        int int31 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = dateTime16.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths((int) (short) 100);
        int int35 = dateTime32.getDayOfMonth();
        long long36 = dateTime32.getMillis();
        org.joda.time.DateTime dateTime38 = dateTime32.minusHours(22);
        boolean boolean39 = property10.equals((java.lang.Object) dateTime38);
        org.joda.time.LocalTime localTime40 = property10.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime41 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime43 = property10.addCopy(14);
        int int44 = localTime43.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1646724347137L + "'", long18 == 1646724347137L);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 213120000 + "'", int31 == 213120000);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1646724347137L + "'", long36 == 1646724347137L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test21711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21711");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(192);
        java.lang.String str3 = dateTimeZone1.getName(1646723885360L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long6 = dateTimeZone1.previousTransition(1646724039395L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+192:00" + "'", str3, "+192:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724039395L + "'", long6 == 1646724039395L);
    }

    @Test
    public void test21712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21712");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        java.util.Date date25 = new java.util.Date(1646723755766L);
        gregorianCalendar7.setTime(date25);
        gregorianCalendar7.setLenient(false);
        gregorianCalendar7.setFirstDayOfWeek(2100467);
        java.time.Instant instant31 = gregorianCalendar7.toInstant();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 3, 2]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertNotNull(instant31);
    }

    @Test
    public void test21713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21713");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.setCopy((int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property5.roundHalfFloorCopy();
        java.lang.String str12 = property5.toString();
        org.joda.time.LocalDateTime localDateTime14 = property5.addToCopy(40010);
        org.joda.time.LocalDateTime localDateTime15 = property5.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[dayOfYear]" + "'", str12, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test21714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21714");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder3.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder11 = builder3.setTimeOfDay(0, 33, 66534);
        java.util.Calendar.Builder builder13 = builder3.setLenient(true);
        java.util.Calendar.Builder builder17 = builder3.setWeekDate(66536, (int) '4', 66512921);
        java.util.Calendar.Builder builder19 = builder17.setLenient(true);
        java.util.Calendar.Builder builder23 = builder17.setWeekDate(144, 0, 732);
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test21715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21715");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isParser();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "");
        int int12 = dateTimeField7.getMaximumShortTextLength(locale11);
        long long15 = dateTimeField7.add(1646723755047L, 23);
        java.util.Locale locale20 = new java.util.Locale("", "2022", "");
        java.lang.String str21 = dateTimeField7.getAsText((int) (short) 1, locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter3.withLocale(locale20);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setLanguageTag("fr");
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale26.getDisplayVariant();
        java.util.Locale.Builder builder28 = builder23.setLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter22.withLocale(locale26);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter29.getZone();
        int int31 = dateTimeFormatter29.getDefaultYear();
        boolean boolean32 = dateTimeFormatter29.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1646725135047L + "'", long15 == 1646725135047L);
        org.junit.Assert.assertEquals(locale20.toString(), "_2022");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2000 + "'", int31 == 2000);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test21716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21716");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfCentury(51);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime17 = property15.addToCopy(9);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(7);
        int int23 = dateTime22.getMonthOfYear();
        int int24 = dateTime22.getDayOfMonth();
        int int25 = property15.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.minus(readableDuration26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minus(readablePeriod33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.centuries();
        boolean boolean38 = localDateTime34.isSupported(durationFieldType37);
        org.joda.time.DateTime dateTime40 = dateTime22.withFieldAdded(durationFieldType37, (int) 'x');
        org.joda.time.DateTime dateTime42 = dateTime9.withFieldAdded(durationFieldType37, 38);
        org.joda.time.DateTime dateTime44 = dateTime9.plusDays(213120000);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.DateTime dateTime47 = property45.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime49 = dateTime47.plusSeconds(66796190);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test21717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21717");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.yearOfEra();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getDisplayScript();
        java.lang.String str13 = dateTimeField8.getAsShortText(34320035, locale10);
        int int15 = dateTimeField8.getMaximumValue(55145318400000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = dateTimeField8.getType();
        int int18 = dateTimeField8.getMinimumValue(15973736284800000L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "34320035" + "'", str13, "34320035");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test21718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21718");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        boolean boolean9 = dateTime8.isBeforeNow();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate14 = localDate10.minusYears(10);
        int[] intArray15 = localDate10.getValues();
        org.joda.time.LocalDate.Property property16 = localDate10.era();
        org.joda.time.LocalDate.Property property17 = localDate10.dayOfYear();
        org.joda.time.DateTime dateTime18 = dateTime8.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property19 = localDate10.dayOfWeek();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes((int) (short) 100);
        int int24 = dateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfDay(86399);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        java.lang.String str33 = property32.getAsText();
        int int34 = property32.get();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        int int37 = property32.compareTo((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.LocalDate localDate39 = localDate35.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.plus(readablePeriod40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate39.plus(readablePeriod42);
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj46, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property51 = dateTime50.weekyear();
        java.lang.String str52 = property51.getAsText();
        int int53 = property51.get();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        int int56 = property51.compareTo((org.joda.time.ReadablePartial) localDate54);
        org.joda.time.LocalDate localDate58 = localDate54.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate59 = localDate45.withFields((org.joda.time.ReadablePartial) localDate54);
        int int60 = localDate39.compareTo((org.joda.time.ReadablePartial) localDate54);
        int int61 = localDate54.size();
        int int62 = localDate54.getWeekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.seconds();
        boolean boolean64 = localDate54.isSupported(durationFieldType63);
        org.joda.time.DateTime dateTime66 = dateTime26.withFieldAdded(durationFieldType63, (int) (short) 10);
        org.joda.time.DateTime.Property property67 = dateTime66.yearOfEra();
        boolean boolean68 = localDate10.equals((java.lang.Object) dateTime66);
        org.joda.time.YearMonthDay yearMonthDay69 = dateTime66.toYearMonthDay();
        org.joda.time.Instant instant71 = new org.joda.time.Instant(0L);
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Instant instant74 = instant71.withDurationAdded(readableDuration72, 434);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Instant instant77 = instant74.withDurationAdded(readableDuration75, 66796190);
        boolean boolean78 = dateTime66.isEqual((org.joda.time.ReadableInstant) instant77);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 3, 2]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022" + "'", str33, "2022");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2022" + "'", str52, "2022");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(instant74);
        org.junit.Assert.assertNotNull(instant77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test21719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21719");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u4e0a\u5348 07:25:07");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test21720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21720");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        int int21 = dateTime20.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = dateTime20.get(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        int int31 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean32 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime6.toMutableDateTimeISO();
        boolean boolean35 = dateTime6.isBefore((-5679974778000L));
        org.joda.time.DateTime.Property property36 = dateTime6.dayOfMonth();
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("0");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale37.getDisplayScript(locale41);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale37);
        int int44 = property36.getMaximumShortTextLength(locale37);
        java.lang.String str45 = locale37.getISO3Language();
        java.lang.String str46 = locale37.getDisplayScript();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-03-02T23:59:59.999+192:00" + "'", str13, "2022-03-02T23:59:59.999+192:00");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1645514747297,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=307,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "zho" + "'", str45, "zho");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test21721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21721");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        boolean boolean9 = dateTime7.isAfter((long) 2);
        org.joda.time.DateTime dateTime11 = dateTime7.minusDays(1);
        org.joda.time.DateTime dateTime13 = dateTime7.minusHours((-1));
        java.lang.String str14 = dateTime7.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        int int22 = dateTime21.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime21.get(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone26);
        org.joda.time.LocalTime localTime29 = localTime27.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localTime27.toDateTimeToday(dateTimeZone30);
        int int32 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean33 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime7.toMutableDateTimeISO();
        boolean boolean36 = dateTime7.isBefore((-5679974778000L));
        org.joda.time.Chronology chronology37 = dateTime7.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.centuries();
        org.joda.time.DurationField durationField39 = chronology37.weeks();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology37);
        org.joda.time.LocalTime localTime42 = localTime40.minusSeconds(25);
        org.joda.time.LocalTime localTime44 = localTime42.minusMinutes(66871288);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-03-02T23:59:59.999+192:00" + "'", str14, "2022-03-02T23:59:59.999+192:00");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
    }

    @Test
    public void test21722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21722");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Chinese (Taiwan)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21723");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 2072, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 126000000 + "'", int4 == 126000000);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test21724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21724");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(100);
        int int12 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withYear((-1));
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime9.getField((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime9.minusHours(7);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds((int) (short) 10);
        int int23 = localDateTime20.getEra();
        org.joda.time.DateTime dateTime24 = dateTime2.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime.Property property25 = localDateTime20.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = property25.setCopy((-457048));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -457048 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test21725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21725");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 213120000);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        int int3 = localDate1.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate1.withPeriodAdded(readablePeriod4, 558);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate9 = localDate6.plusYears(41);
        org.joda.time.LocalDate.Property property10 = localDate6.era();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test21726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21726");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfHour();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDate6.getFieldType((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate6.withYear(40010);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test21727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21727");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = chronology1.days();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField9.getMillis(1645514665620L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645514665620 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test21728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21728");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DurationField durationField9 = chronology1.millis();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.hourOfHalfday();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = dateTimeField10.getAsShortText((int) (byte) 10, locale12);
        org.joda.time.DurationField durationField15 = dateTimeField10.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = dateTimeField10.getType();
        int int18 = dateTimeField10.getMinimumValue(1646723778642L);
        long long20 = dateTimeField10.roundHalfCeiling((-2158237116000L));
        long long22 = dateTimeField10.roundCeiling(1646510679589L);
        java.lang.String str23 = dateTimeField10.getName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-CA" + "'", str13, "en-CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-2158236000000L) + "'", long20 == (-2158236000000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1646514000000L + "'", long22 == 1646514000000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hourOfHalfday" + "'", str23, "hourOfHalfday");
    }

    @Test
    public void test21729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21729");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime.Property property14 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        int int16 = localDateTime15.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withWeekyear(66532200);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear(438);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minusYears(66694859);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test21730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21730");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.DateTime dateTime6 = property5.withMaximumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime9 = property7.setCopy("36");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test21731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21731");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 26302, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long8 = dateTimeZone2.adjustOffset((long) 470, true);
        java.lang.String str10 = dateTimeZone2.getNameKey((long) 13);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 470L + "'", long8 == 470L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test21732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21732");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English (Canada)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21733");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(122, 0);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test21734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21734");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withYearOfCentury(19);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime12.plusMinutes(86399);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks(1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.year();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withDurationAdded(readableDuration31, 26171150);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int35 = localDateTime29.get(dateTimeFieldType34);
        org.joda.time.DateTime.Property property36 = dateTime18.property(dateTimeFieldType34);
        boolean boolean37 = localDateTime9.isSupported(dateTimeFieldType34);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType34.getDurationType();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(durationFieldType38);
    }

    @Test
    public void test21735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21735");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        int int8 = calendar6.getGreatestMinimum(11);
        calendar6.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("2022");
        int int18 = timeZone17.getRawOffset();
        calendar6.setTimeZone(timeZone17);
        boolean boolean20 = timeZone1.hasSameRules(timeZone17);
        java.time.ZoneId zoneId21 = timeZone1.toZoneId();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone(zoneId21);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514747457,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=457,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=467,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test21736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21736");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.hourOfHalfday();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = localDate15.getDayOfWeek();
        org.joda.time.LocalDate localDate19 = localDate15.minusYears(10);
        int[] intArray20 = localDate15.getValues();
        org.joda.time.LocalDate.Property property21 = localDate15.era();
        org.joda.time.LocalDate localDate22 = property21.roundCeilingCopy();
        org.joda.time.LocalDate localDate24 = property21.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate25 = property21.getLocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate25.withPeriodAdded(readablePeriod27, 1109);
        int[] intArray31 = chronology9.get((org.joda.time.ReadablePartial) localDate25, 1646723762055L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter6.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withDefaultYear(26329469);
        boolean boolean35 = dateTimeFormatter34.isParser();
        java.lang.Appendable appendable36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minus(readablePeriod42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMillis(100);
        int int46 = localDateTime43.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.withYear((-1));
        org.joda.time.LocalDateTime.Property property49 = localDateTime43.millisOfSecond();
        org.joda.time.LocalDateTime.Property property50 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime.Property property51 = localDateTime43.yearOfEra();
        org.joda.time.LocalDateTime localDateTime52 = property51.withMaximumValue();
        int int53 = localDateTime52.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minusWeeks((int) 'x');
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusMinutes(1340);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusSeconds(150);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.plusMillis(40726);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter34.printTo(appendable36, (org.joda.time.ReadablePartial) localDateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2022, 3, 8]");
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
    }

    @Test
    public void test21737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21737");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) '4');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(194);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test21738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21738");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology1.hours();
        org.joda.time.DurationField durationField5 = chronology1.minutes();
        org.joda.time.DurationField durationField6 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField7 = chronology1.yearOfEra();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test21739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21739");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        int int8 = localDateTime7.getSecondOfMinute();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.plusMinutes(86399);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(7);
        int int23 = dateTime22.getMonthOfYear();
        int int24 = dateTime22.getDayOfMonth();
        boolean boolean25 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime22.withYearOfCentury(20);
        org.joda.time.DateTime dateTime28 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property29 = dateTime27.era();
        org.joda.time.DateTime dateTime30 = dateTime27.withEarlierOffsetAtOverlap();
        int int31 = dateTime27.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 47 + "'", int8 == 47);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 47 + "'", int31 == 47);
    }

    @Test
    public void test21740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21740");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        int int5 = localDateTime4.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.centuryOfEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(22);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays(6);
        int int19 = localDateTime18.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYear(26182169);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusMinutes(21);
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.dayOfYear();
        int int25 = localDateTime18.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 360 + "'", int19 == 360);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 467 + "'", int25 == 467);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test21741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21741");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.halfdays();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DurationField durationField11 = chronology8.weeks();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test21742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21742");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(2022);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime6 = localTime3.withFieldAdded(durationFieldType4, (int) 'u');
        org.joda.time.LocalTime localTime8 = localTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime11 = property9.setCopy(99);
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime14 = property12.addCopy((-2));
        org.joda.time.Interval interval15 = property12.toInterval();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        long long23 = chronology17.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withLocale(locale31);
        java.lang.String str33 = dateTimeField26.getAsShortText((int) 'a', locale31);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfDay();
        long long42 = chronology36.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField43 = chronology36.minuteOfHour();
        org.joda.time.DurationField durationField44 = chronology36.millis();
        org.joda.time.DateTimeField dateTimeField45 = chronology36.hourOfHalfday();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale47.toLanguageTag();
        java.lang.String str49 = dateTimeField45.getAsShortText((int) (byte) 10, locale47);
        org.joda.time.DurationField durationField50 = dateTimeField45.getRangeDurationField();
        org.joda.time.DurationField durationField51 = dateTimeField45.getDurationField();
        int int53 = dateTimeField45.getMaximumValue(1646723799218L);
        java.util.Locale locale57 = new java.util.Locale("hi!", "", "");
        java.lang.String str58 = locale57.getDisplayScript();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology60 = localDate59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.minuteOfDay();
        java.util.Locale locale64 = java.util.Locale.CANADA;
        java.lang.String str65 = locale64.toLanguageTag();
        java.lang.String str66 = locale64.getDisplayVariant();
        java.lang.String str67 = dateTimeField62.getAsText((long) (short) 100, locale64);
        java.util.Set<java.lang.Character> charSet68 = locale64.getExtensionKeys();
        java.lang.String str69 = locale57.getDisplayCountry(locale64);
        int int70 = dateTimeField45.getMaximumShortTextLength(locale64);
        java.lang.String str71 = dateTimeField26.getAsText((-51), locale64);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = dateTimeField26.getType();
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology74 = localDate73.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.minuteOfDay();
        long long80 = chronology74.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField81 = chronology74.minuteOfHour();
        org.joda.time.DurationField durationField82 = chronology74.millis();
        org.joda.time.DateTimeField dateTimeField83 = chronology74.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField84 = chronology74.millisOfDay();
        boolean boolean85 = dateTimeFieldType72.isSupported(chronology74);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime((java.lang.Object) interval15, chronology74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 971923363200000L + "'", long23 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "97" + "'", str33, "97");
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 971923363200000L + "'", long42 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en-CA" + "'", str48, "en-CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "10" + "'", str49, "10");
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 11 + "'", int53 == 11);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "en-CA" + "'", str65, "en-CA");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "-51" + "'", str71, "-51");
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 971923363200000L + "'", long80 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(durationField82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test21743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21743");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("23");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test21744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21744");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        int int13 = localDate12.getWeekyear();
        java.lang.String str14 = localDate12.toString();
        org.joda.time.LocalDate localDate16 = localDate12.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate12.withYearOfCentury(26329469);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26329469 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2024 + "'", int13 == 2024);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2024-01-23" + "'", str14, "2024-01-23");
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test21745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21745");
        java.util.Locale locale2 = new java.util.Locale("0022-01-08T00:00:00.132", "66700352");
        org.junit.Assert.assertEquals(locale2.toString(), "0022-01-08t00:00:00.132_66700352");
    }

    @Test
    public void test21746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21746");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology2);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.minuteOfDay();
        java.lang.String str11 = chronology8.toString();
        org.joda.time.DateTime dateTime12 = dateTime6.withChronology(chronology8);
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ISOChronology[UTC]" + "'", str11, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test21747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21747");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        org.joda.time.LocalDate localDate16 = property14.roundHalfFloorCopy();
        java.lang.String str17 = property14.getAsText();
        int int18 = property14.getMinimumValueOverall();
        org.joda.time.LocalDate localDate19 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(0);
        org.joda.time.LocalDate localDate23 = localDate19.plusYears((-284801002));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AD" + "'", str17, "AD");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test21748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21748");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        int int8 = property5.getMinimumValue();
        org.joda.time.DurationField durationField9 = property5.getLeapDurationField();
        long long12 = durationField9.add(1646723758506L, 40895);
        long long15 = durationField9.getDifferenceAsLong(1646723985962L, 1646723937369L);
        long long18 = durationField9.subtract(5343056763L, 164);
        java.lang.String str19 = durationField9.toString();
        long long21 = durationField9.getValueAsLong(1646740800000L);
        long long24 = durationField9.getDifferenceAsLong(8371466825400000L, 230955932720000L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-292275054) + "'", int8 == (-292275054));
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 26380019758506L + "'", long12 == 26380019758506L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-93844143237L) + "'", long18 == (-93844143237L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DurationField[weeks]" + "'", str19, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2722L + "'", long21 == 2722L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 13459839L + "'", long24 == 13459839L);
    }

    @Test
    public void test21749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21749");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate4 = property3.withMinimumValue();
        boolean boolean5 = property3.isLeap();
        org.joda.time.LocalDate localDate7 = property3.setCopy("122");
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("DateTimeField[millisOfDay]");
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        org.joda.time.LocalDate localDate14 = property3.setCopy("86399999", locale10);
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar calendar16 = builder15.build();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        int int19 = calendar17.getGreatestMinimum(11);
        calendar17.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("2022");
        int int29 = timeZone28.getRawOffset();
        calendar17.setTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(23);
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        boolean boolean34 = timeZone28.hasSameRules(timeZone33);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("en-ca");
        java.lang.String str37 = timeZone36.getID();
        boolean boolean38 = timeZone36.observesDaylightTime();
        boolean boolean39 = timeZone28.hasSameRules(timeZone36);
        java.lang.String str40 = timeZone36.getID();
        calendar16.setTimeZone(timeZone36);
        java.util.TimeZone timeZone42 = calendar16.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str45 = locale44.getISO3Language();
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale44.getDisplayLanguage(locale46);
        boolean boolean48 = locale44.hasExtensions();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone42, locale44);
        java.lang.String str50 = locale10.getDisplayCountry(locale44);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance();
        calendar51.set(10, (int) (short) 0, (int) ' ');
        calendar51.set(1340, 437, 66555151);
        boolean boolean60 = locale44.equals((java.lang.Object) 66555151);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=617,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+23:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "GMT" + "'", str37, "GMT");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GMT" + "'", str40, "GMT");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "zho" + "'", str45, "zho");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chinese" + "'", str47, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1645514747607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=607,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(calendar51);
// flaky:         org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1340,MONTH=437,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=66555151,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=617,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test21750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21750");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfEra((int) 'a');
        int int11 = localDateTime10.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfSecond(53);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusMinutes(0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test21751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21751");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        int int4 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfDay(86399);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        int int14 = property12.get();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = property12.compareTo((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate19 = localDate15.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.plus(readablePeriod20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate19.plus(readablePeriod22);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        java.lang.String str32 = property31.getAsText();
        int int33 = property31.get();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        int int36 = property31.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate localDate38 = localDate34.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate39 = localDate25.withFields((org.joda.time.ReadablePartial) localDate34);
        int int40 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate34);
        int int41 = localDate34.size();
        int int42 = localDate34.getWeekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.seconds();
        boolean boolean44 = localDate34.isSupported(durationFieldType43);
        org.joda.time.DateTime dateTime46 = dateTime6.withFieldAdded(durationFieldType43, (int) (short) 10);
        org.joda.time.DateTime dateTime48 = dateTime6.withSecondOfMinute(0);
        java.lang.String str49 = dateTime6.toString();
        org.joda.time.DateTime dateTime51 = dateTime6.minusWeeks(26730001);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022" + "'", str32, "2022");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31T00:01:26.399+00:00:00.435" + "'", str49, "1969-12-31T00:01:26.399+00:00:00.435");
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test21752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21752");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMinutes(26175799);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(6);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        boolean boolean9 = dateTimeFieldType0.isSupported(chronology8);
        java.lang.String str10 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "weekOfWeekyear" + "'", str10, "weekOfWeekyear");
    }

    @Test
    public void test21753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21753");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.util.Date date17 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) date17);
        gregorianCalendar7.setTime(date17);
        java.util.Date date21 = new java.util.Date((long) 435);
        date21.setYear(23);
        date21.setHours(292278993);
        java.time.Instant instant26 = date21.toInstant();
        gregorianCalendar7.setTime(date21);
        gregorianCalendar7.set(33, 32770, 21, (-51), 2022);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        gregorianCalendar7.setTimeInMillis((long) 61010);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar7.add(26313308, 7720);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Mar 08 07:15:55 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sun Jan 10 09:00:00 GMT 35266");
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test21754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21754");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        org.joda.time.LocalDate localDate16 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate17 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate18 = property14.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localDate18.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
    }

    @Test
    public void test21755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21755");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(16);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withPeriodAdded(readablePeriod7, 34);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(33);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(66514);
        org.joda.time.DateTime dateTime14 = localDateTime11.toDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusWeeks((-1970));
        int int17 = localDateTime11.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33467 + "'", int17 == 33467);
    }

    @Test
    public void test21756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21756");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(2022);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime6 = localTime3.withFieldAdded(durationFieldType4, (int) 'u');
        org.joda.time.LocalTime localTime8 = localTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime3.millisOfDay();
        org.joda.time.DateTime dateTime10 = localTime3.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        java.lang.String str12 = property11.toString();
        org.joda.time.DateTime dateTime14 = property11.addWrapFieldToCopy(66594065);
        org.joda.time.DateTime dateTime15 = property11.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = property11.setCopy("292278994-08-17T07:12:55.807+59:12");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"292278994-08-17T07:12:55.807+59:12\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test21757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21757");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime10 = property6.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime12 = property6.addToCopy(71670);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra(26312454);
        boolean boolean15 = dateTime14.isEqualNow();
        org.joda.time.DateTime.Property property16 = dateTime14.dayOfMonth();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property16.setCopy("DurationField[seconds]", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DurationField[seconds]\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
    }

    @Test
    public void test21758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21758");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        boolean boolean13 = gregorianCalendar7.before((java.lang.Object) property11);
        org.joda.time.DateTimeField dateTimeField14 = property11.getField();
        org.joda.time.LocalDateTime localDateTime15 = property11.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        org.joda.time.LocalDateTime localDateTime17 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = property11.addToCopy(635770);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test21759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21759");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        java.lang.String str5 = chronology2.toString();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(1645075117979L, chronology2);
        org.joda.time.DateTimeField dateTimeField9 = chronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test21760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21760");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withPeriodAdded(readablePeriod9, 8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfYear(16);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withWeekOfWeekyear(51);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay(66555151);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test21761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21761");
        java.util.Date date5 = new java.util.Date((-38118), 2922690, 439, 481, 67043206);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 21 19:46:00 GMT 207468");
    }

    @Test
    public void test21762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21762");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) (short) 100);
        int int19 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime4.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(dateTimeZone27);
        boolean boolean29 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime26);
        java.util.Locale locale33 = new java.util.Locale("+122:00", "java.util.GregorianCalendar[time=1646723755766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=15,SECOND=55,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]", "French");
        java.util.Calendar calendar34 = dateTime20.toCalendar(locale33);
        boolean boolean35 = calendar34.isWeekDateSupported();
        int int36 = calendar34.getWeeksInWeekYear();
        long long37 = calendar34.getTimeInMillis();
        java.lang.Object obj38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj38, dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property43 = dateTime42.weekyear();
        long long44 = dateTime42.getMillis();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone46);
        org.joda.time.LocalTime localTime49 = localTime47.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localTime47.toDateTimeToday(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime51.getZone();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes((int) (short) 100);
        int int57 = dateTimeZone52.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = dateTime42.withZoneRetainFields(dateTimeZone52);
        int int59 = dateTime42.getMillisOfDay();
        java.lang.String str60 = dateTime42.toString();
        boolean boolean61 = calendar34.after((java.lang.Object) dateTime42);
        java.lang.Object obj62 = calendar34.clone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724347767L + "'", long6 == 1646724347767L);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 435 + "'", int19 == 435);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals(locale33.toString(), "+122:00_JAVA.UTIL.GREGORIANCALENDAR[TIME=1646723755766,AREFIELDSSET=TRUE,AREALLFIELDSSET=TRUE,LENIENT=TRUE,ZONE=SUN.UTIL.CALENDAR.ZONEINFO[ID=\"GMT\",OFFSET=0,DSTSAVINGS=0,USEDAYLIGHT=FALSE,TRANSITIONS=0,LASTRULE=NULL],FIRSTDAYOFWEEK=1,MINIMALDAYSINFIRSTWEEK=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=15,SECOND=55,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]_French");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1646724347767,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.435,offset=435,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=48,MILLISECOND=202,ZONE_OFFSET=435,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 53 + "'", int36 == 53);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1646724347767L + "'", long37 == 1646724347767L);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1646724347767L + "'", long44 == 1646724347767L);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 435 + "'", int57 == 435);
        org.junit.Assert.assertNotNull(dateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 26748202 + "'", int59 == 26748202);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2022-03-08T07:25:48.202+00:00:00.435" + "'", str60, "2022-03-08T07:25:48.202+00:00:00.435");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj62);
// flaky:         org.junit.Assert.assertEquals(obj62.toString(), "java.util.GregorianCalendar[time=1646724347767,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.435,offset=435,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=48,MILLISECOND=202,ZONE_OFFSET=435,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "java.util.GregorianCalendar[time=1646724347767,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.435,offset=435,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=48,MILLISECOND=202,ZONE_OFFSET=435,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "java.util.GregorianCalendar[time=1646724347767,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.435,offset=435,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=48,MILLISECOND=202,ZONE_OFFSET=435,DST_OFFSET=0]");
    }

    @Test
    public void test21763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21763");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        int int3 = localDateTime2.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withDate(55258759, 74, 26540163);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 74 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test21764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21764");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime dateTime9 = dateTime2.plus(1646723786980L);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = dateTime9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.era();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withPeriodAdded(readablePeriod22, 8);
        int int25 = localDateTime24.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withWeekyear(141);
        int int28 = localDateTime24.size();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYear(22);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withYearOfCentury(9);
        int[] intArray38 = localDateTime33.getValues();
        chronology12.validate((org.joda.time.ReadablePartial) localDateTime24, intArray38);
        java.lang.String str40 = localDateTime24.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[22, 1, 1, 467]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0001-01-01T00:00:00.000" + "'", str40, "0001-01-01T00:00:00.000");
    }

    @Test
    public void test21765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21765");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology1.days();
        org.joda.time.DurationField durationField5 = chronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.yearOfCentury();
        long long9 = dateTimeField6.add(725593176000L, 66605001);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        java.lang.String str18 = property17.getAsText();
        int int19 = property17.get();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        int int22 = property17.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate24 = localDate20.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate25 = localDate11.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate27 = localDate11.plusYears(20);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate11.withPeriodAdded(readablePeriod28, 4);
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra(5);
        org.joda.time.LocalDate localDate34 = localDate32.withCenturyOfEra(437);
        org.joda.time.LocalDate.Property property35 = localDate34.centuryOfEra();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.minuteOfDay();
        java.lang.String str41 = chronology38.toString();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = chronology38.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology38.clockhourOfDay();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        int int48 = localDate46.getDayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate46.weekyear();
        org.joda.time.LocalDate localDate50 = property49.withMinimumValue();
        java.lang.Object obj51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj51, dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property56 = dateTime55.weekyear();
        int int57 = dateTime55.getYear();
        org.joda.time.DateTime dateTime58 = dateTime55.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.DateTime dateTime61 = dateTime55.withPeriodAdded(readablePeriod59, (int) '#');
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology63 = localDate62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.year();
        org.joda.time.DateTime dateTime67 = dateTime55.withChronology(chronology63);
        org.joda.time.LocalDate localDate69 = org.joda.time.LocalDate.parse("0");
        org.joda.time.LocalDate localDate71 = localDate69.plusYears(66525863);
        int[] intArray73 = chronology63.get((org.joda.time.ReadablePartial) localDate69, (-343407230L));
        int int74 = dateTimeField45.getMaximumValue((org.joda.time.ReadablePartial) localDate50, intArray73);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray76 = dateTimeField6.add((org.joda.time.ReadablePartial) localDate34, 2119, intArray73, 66514657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2119");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2101851545132376000L + "'", long9 == 2101851545132376000L);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022" + "'", str18, "2022");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ISOChronology[UTC]" + "'", str41, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1969, 12, 28]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 24 + "'", int74 == 24);
    }

    @Test
    public void test21766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21766");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withPeriodAdded(readablePeriod9, 8);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds((int) (byte) -1);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withFields(readablePartial16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYear(22);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour(10);
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.weekyear();
        long long31 = dateTime29.getMillis();
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime29, dateTimeZone35);
        int int37 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime22.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = property38.addWrapFieldToCopy(1108);
        boolean boolean41 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withDayOfMonth(64925339);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64925339 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1646724347852L + "'", long31 == 1646724347852L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test21767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21767");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) '4');
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime6.withMillisOfSecond(786);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime29.toGregorianCalendar();
        gregorianCalendar30.set(66548193, 26567, 683, (-4), 828);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = gregorianCalendar30.getMinimum(66810369);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66810369");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-22T00:00:00.434+00:00:00.435" + "'", str13, "2022-02-22T00:00:00.434+00:00:00.435");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-213119513L) + "'", long26 == (-213119513L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
    }

    @Test
    public void test21768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21768");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addWrapFieldToCopy(27445396);
        org.joda.time.LocalTime localTime13 = property10.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime13.plus(readablePeriod14);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test21769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21769");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(66671, 736, (-457068), 8741953);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66671 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21770");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate0.getFields();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDate0.getFieldTypes();
        org.joda.time.LocalDate localDate8 = localDate0.plusMonths(0);
        org.joda.time.LocalDate localDate10 = localDate8.minusDays((-27445));
        int int11 = localDate8.getMonthOfYear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test21771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21771");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.util.Date date17 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) date17);
        gregorianCalendar7.setTime(date17);
        java.util.Date date21 = new java.util.Date((long) 435);
        date21.setYear(23);
        date21.setHours(292278993);
        java.time.Instant instant26 = date21.toInstant();
        gregorianCalendar7.setTime(date21);
        gregorianCalendar7.set(33, 32770, 21, (-51), 2022);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar7.add(66902537, 434);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Mar 08 07:15:55 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sun Jan 10 09:00:00 GMT 35266");
        org.junit.Assert.assertNotNull(instant26);
    }

    @Test
    public void test21772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21772");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology6);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(0);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime9.withDurationAdded((-12622694400001L), 26403463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -12622694400001 * 26403463");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test21773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21773");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology2.add(readablePeriod6, (long) 22, 2024);
        org.joda.time.DateTimeField dateTimeField10 = chronology2.minuteOfDay();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate.Property property12 = localDate11.era();
        org.joda.time.LocalDate localDate13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 22L + "'", long9 == 22L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test21774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21774");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.dayOfMonth();
        long long8 = dateTimeField5.addWrapField(1645514550575L, 17267435);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645773750575L + "'", long8 == 1645773750575L);
    }

    @Test
    public void test21775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21775");
        java.util.Date date1 = new java.util.Date((long) 26312454);
        java.util.Date date3 = new java.util.Date((long) 1109);
        boolean boolean4 = date1.after(date3);
        int int5 = date3.getDay();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 07:18:32 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:01 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test21776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21776");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(11);
        org.joda.time.LocalTime.Property property7 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(66741);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test21777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21777");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(0);
        org.joda.time.LocalTime localTime5 = localTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property6 = localTime1.hourOfDay();
        java.lang.String str7 = property6.getAsShortText();
        org.joda.time.LocalTime localTime8 = property6.getLocalTime();
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        long long14 = chronology9.add(1646723817623L, 1646723867348L, 50);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 66618209, chronology9);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7" + "'", str7, "7");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 83982917185023L + "'", long14 == 83982917185023L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test21778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21778");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int3 = dateTimeZone1.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = dateTimeField8.getAsText((long) (short) 100, locale10);
        java.util.Set<java.lang.Character> charSet14 = locale10.getExtensionKeys();
        java.lang.String str15 = dateTimeZone1.getShortName((long) 66514147, locale10);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.getDefault(category17);
        java.util.Calendar.Builder builder20 = new java.util.Calendar.Builder();
        java.util.Calendar calendar21 = builder20.build();
        java.util.Calendar.Builder builder23 = builder20.setLenient(false);
        java.util.Calendar.Builder builder25 = builder23.setLenient(false);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder28 = builder23.setLocale(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi!", "", "");
        java.lang.String str33 = locale32.getDisplayScript();
        java.util.Locale locale37 = new java.util.Locale("hi!", "", "");
        java.lang.String str38 = locale32.getDisplayScript(locale37);
        java.lang.String str39 = locale32.getISO3Language();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = locale32.getDisplayName(locale40);
        java.lang.String str42 = locale27.getDisplayName(locale40);
        java.util.Locale.setDefault(category17, locale27);
        java.lang.String str44 = dateTimeZone1.getShortName((long) 1649, locale27);
        java.util.Locale locale45 = locale27.stripExtensions();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.minuteOfDay();
        int int50 = dateTimeField48.get((long) 29);
        long long52 = dateTimeField48.roundHalfFloor((-62135630322000L));
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField48.getType();
        java.lang.Object obj55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(obj55, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property60 = dateTime59.weekyear();
        java.util.Locale locale62 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime63 = property60.setCopy("0", locale62);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.minuteOfDay();
        boolean boolean68 = durationFieldType64.isSupported(chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.yearOfEra();
        org.joda.time.DateTimeField dateTimeField70 = chronology66.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField71 = chronology66.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField72 = chronology66.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField73 = chronology66.monthOfYear();
        org.joda.time.DateTimeField dateTimeField74 = chronology66.yearOfEra();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology76 = localDate75.getChronology();
        int int77 = localDate75.getDayOfWeek();
        int int78 = localDate75.getWeekOfWeekyear();
        java.util.Locale locale80 = java.util.Locale.ROOT;
        java.lang.String str81 = locale80.getISO3Country();
        java.util.Locale locale82 = java.util.Locale.CANADA;
        java.lang.String str83 = locale82.toLanguageTag();
        java.lang.String str84 = locale82.getDisplayVariant();
        java.lang.String str85 = locale80.getDisplayName(locale82);
        java.lang.String str86 = dateTimeField74.getAsText((org.joda.time.ReadablePartial) localDate75, 26175799, locale80);
        int int87 = property60.getMaximumTextLength(locale80);
        java.util.Locale locale88 = locale80.stripExtensions();
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleAttributes();
        java.lang.String str90 = dateTimeField48.getAsText(6812, locale88);
        java.lang.String str91 = locale45.getDisplayName(locale88);
        java.lang.String str92 = locale88.getISO3Country();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435 + "'", int3 == 435);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-CA" + "'", str11, "en-CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.435" + "'", str15, "+00:00:00.435");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.435" + "'", str44, "+00:00:00.435");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-62135630340000L) + "'", long52 == (-62135630340000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 8 + "'", int78 == 8);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "en-CA" + "'", str83, "en-CA");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "26175799" + "'", str86, "26175799");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 9 + "'", int87 == 9);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "6812" + "'", str90, "6812");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test21779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21779");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 32769, chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfDay();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test21780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21780");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = localDateTime6.getField((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.minusHours(7);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withPeriodAdded(readablePeriod18, 53);
        int int21 = localDateTime20.getWeekyear();
        int int22 = localDateTime20.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusMinutes((-17224268));
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.minusWeeks(455547);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test21781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21781");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfEra();
        org.joda.time.LocalDate localDate12 = localDate9.minusDays((int) '#');
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTime dateTime14 = property5.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(1645514470565L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.435" + "'", str17, "+00:00:00.435");
    }

    @Test
    public void test21782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21782");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        int int5 = localDateTime4.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.centuryOfEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(34320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34320 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test21783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21783");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 52);
        int int2 = localTime1.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime1.getValue(1439);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1439");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21784");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.yearOfCentury();
        int int14 = dateTimeField12.getMinimumValue((long) 755);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test21785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21785");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("1439");
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale locale10 = builder7.build();
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter15.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter15.withPivotYear(435);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str25 = locale24.getDisplayScript();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withLocale(locale24);
        java.util.Locale locale27 = locale24.stripExtensions();
        java.util.Locale.Builder builder28 = builder11.setLocale(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder28.addUnicodeLocaleAttribute("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test21786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21786");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 435);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        int int14 = dateTime13.getWeekyear();
        int int15 = dateTime13.getSecondOfDay();
        boolean boolean17 = dateTime13.isBefore(1646723767611L);
        int int18 = dateTime13.getEra();
        org.joda.time.DateTime dateTime20 = dateTime13.withYearOfCentury(49);
        boolean boolean22 = dateTime20.isEqual((long) 'a');
        boolean boolean23 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime20);
        java.lang.Object obj24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj24, dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.minus(readablePeriod29);
        java.util.Date date31 = dateTime30.toDate();
        boolean boolean32 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalTime localTime33 = dateTime20.toLocalTime();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis(0);
        org.joda.time.LocalTime localTime38 = localTime34.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property39 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime41 = property39.addWrapFieldToCopy(34);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalTime localTime44 = localTime41.withFieldAdded(durationFieldType42, 66753914);
        java.lang.String str45 = durationFieldType42.getName();
        boolean boolean46 = localTime33.isSupported(durationFieldType42);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj51, dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property56 = dateTime55.weekyear();
        java.lang.String str57 = property56.getAsText();
        org.joda.time.DurationField durationField58 = property56.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property56.getFieldType();
        int int60 = dateTime50.get(dateTimeFieldType59);
        org.joda.time.DateTime dateTime62 = dateTime50.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime63 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property64 = dateTime63.monthOfYear();
        int int65 = dateTime63.getHourOfDay();
        org.joda.time.DateTime.Property property66 = dateTime63.centuryOfEra();
        org.joda.time.DateTime dateTime68 = property66.addWrapFieldToCopy(8);
        org.joda.time.DateTime.Property property69 = dateTime68.dayOfWeek();
        org.joda.time.Chronology chronology70 = dateTime68.getChronology();
        org.joda.time.LocalTime localTime71 = org.joda.time.LocalTime.now(chronology70);
        org.joda.time.DurationField durationField72 = chronology70.hours();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.hourOfHalfday();
        org.joda.time.DurationField durationField74 = durationFieldType42.getField(chronology70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = strSet4.remove((java.lang.Object) chronology70);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.chrono.ISOChronology cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Feb 22 07:25:48 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "millis" + "'", str45, "millis");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2022" + "'", str57, "2022");
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2022 + "'", int60 == 2022);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(durationField74);
    }

    @Test
    public void test21787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21787");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(26);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        int int12 = dateTime11.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = dateTime11.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = dateTime11.getChronology();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalTime localTime20 = localTime2.plusMillis(570);
        org.joda.time.LocalTime.Property property21 = localTime2.minuteOfHour();
        int int22 = localTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
    }

    @Test
    public void test21788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21788");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime28 = dateTime14.plusWeeks(4);
        org.joda.time.DateTime.Property property29 = dateTime14.minuteOfDay();
        org.joda.time.DateTime.Property property30 = dateTime14.year();
        org.joda.time.DateTime dateTime31 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime33 = dateTime14.withMillisOfDay(2652);
        org.joda.time.DateTime.Property property34 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime35 = property34.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724348145L + "'", long6 == 1646724348145L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 445 + "'", int7 == 445);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test21789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21789");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter4.getPrinter();
        int int21 = dateTimeFormatter4.getDefaultYear();
        boolean boolean22 = dateTimeFormatter4.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 40);
        org.joda.time.Chronology chronology25 = dateTimeFormatter4.getChronolgy();
        boolean boolean26 = dateTimeFormatter4.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 435 + "'", int18 == 435);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimePrinter20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2000 + "'", int21 == 2000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test21790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21790");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology1.getZone();
        long long9 = dateTimeZone5.convertLocalToUTC(604800000L, false, (long) 2001);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZone(dateTimeZone14);
        int int16 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime13);
        long long18 = dateTimeZone5.nextTransition(1645514177279L);
        int int20 = dateTimeZone5.getStandardOffset((long) 66718200);
        boolean boolean21 = dateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 604800000L + "'", long9 == 604800000L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645514177279L + "'", long18 == 1645514177279L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test21791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21791");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        org.joda.time.DateMidnight dateMidnight19 = localDate14.toDateMidnight();
        int int20 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = localDate21.getDayOfWeek();
        boolean boolean25 = localDate21.equals((java.lang.Object) 2022);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        int int32 = dateTime30.getYear();
        org.joda.time.DateTime dateTime33 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.hours();
        boolean boolean36 = localDate34.isSupported(durationFieldType35);
        int int37 = localDate34.size();
        org.joda.time.DateTime dateTime38 = dateTime33.withFields((org.joda.time.ReadablePartial) localDate34);
        java.lang.Object obj39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj39, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property44 = dateTime43.weekyear();
        java.lang.String str45 = property44.getAsText();
        org.joda.time.DurationField durationField46 = property44.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        java.lang.String str48 = dateTimeFieldType47.toString();
        boolean boolean49 = dateTime33.isSupported(dateTimeFieldType47);
        int int50 = localDate21.indexOf(dateTimeFieldType47);
        boolean boolean51 = localDate14.isSupported(dateTimeFieldType47);
        int int52 = localDate14.getMonthOfYear();
        org.joda.time.LocalDate localDate54 = localDate14.withDayOfYear(74);
        int int55 = localDate14.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "24" + "'", str18, "24");
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022" + "'", str45, "2022");
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "weekyear" + "'", str48, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2024 + "'", int55 == 2024);
    }

    @Test
    public void test21792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21792");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        int int21 = dateTime20.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = dateTime20.get(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        int int31 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean32 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime6.toMutableDateTimeISO();
        boolean boolean35 = dateTime6.isBefore((-5679974778000L));
        org.joda.time.DateTime.Property property36 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime6.withYear(0);
        long long39 = dateTime6.getMillis();
        org.joda.time.DateTime.Property property40 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property41 = dateTime6.monthOfYear();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone44);
        org.joda.time.LocalTime localTime47 = localTime45.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localTime45.toDateTimeToday(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        boolean boolean51 = localTime42.equals((java.lang.Object) dateTimeZone50);
        int int52 = localTime42.getMillisOfDay();
        org.joda.time.LocalTime.Property property53 = localTime42.millisOfSecond();
        org.joda.time.LocalTime.Property property54 = localTime42.hourOfDay();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        org.joda.time.LocalTime localTime56 = property54.withMinimumValue();
        org.joda.time.DateTime dateTime57 = dateTime6.withFields((org.joda.time.ReadablePartial) localTime56);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-22T00:00:00.434+00:00:00.435" + "'", str13, "2022-02-22T00:00:00.434+00:00:00.435");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1645487999999L + "'", long39 == 1645487999999L);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 26748646 + "'", int52 == 26748646);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test21793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21793");
        java.util.Date date1 = new java.util.Date((long) 435);
        int int2 = date1.getHours();
        date1.setDate(12);
        long long5 = date1.getTime();
        date1.setHours(520);
        java.lang.String str8 = date1.toGMTString();
        int int9 = date1.getSeconds();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 02 16:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 950400435L + "'", long5 == 950400435L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2 Feb 1970 16:00:00 GMT" + "'", str8, "2 Feb 1970 16:00:00 GMT");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test21794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21794");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(23);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 0);
        long long7 = dateTimeZone1.convertLocalToUTC(112906008L, true, 5728864041L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 30106008L + "'", long7 == 30106008L);
    }

    @Test
    public void test21795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21795");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(16);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withPeriodAdded(readablePeriod7, 34);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMillis(25);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        java.lang.String str15 = durationFieldType14.toString();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withFieldAdded(durationFieldType14, 71670);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "seconds" + "'", str15, "seconds");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test21796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21796");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy(34320);
        org.joda.time.LocalDateTime localDateTime10 = property7.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean14 = dateTimeZone13.isFixed();
        int int16 = dateTimeZone13.getStandardOffset((long) (-1));
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) (-292275054));
        java.util.Locale locale22 = new java.util.Locale("52", "2024-01-23");
        java.lang.String str23 = locale22.getDisplayVariant();
        java.lang.String str24 = dateTimeZone13.getName(1646723863664L, locale22);
        int int26 = dateTimeZone13.getStandardOffset(1646723937616L);
        org.joda.time.DateTime dateTime27 = localDateTime10.toDateTime(dateTimeZone13);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 213120000 + "'", int16 == 213120000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals(locale22.toString(), "52_2024-01-23");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+59:12" + "'", str24, "+59:12");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 213120000 + "'", int26 == 213120000);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test21797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21797");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-841512), 66907000, 26180752, 81223000, 457, 97434);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 81223000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21798");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField5 = chronology1.days();
        long long7 = durationField5.getValueAsLong((long) 26314344);
        long long9 = durationField5.getValueAsLong(1646724103475L);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        long long18 = chronology12.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField19 = durationFieldType10.getField(chronology12);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) long9, chronology12);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19059L + "'", long9 == 19059L);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 971923363200000L + "'", long18 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test21799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21799");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime28 = dateTime14.plusWeeks(4);
        org.joda.time.DateTime.Property property29 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime31 = dateTime14.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        java.lang.String str42 = property41.getAsText();
        org.joda.time.DurationField durationField43 = property41.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property41.getFieldType();
        int int45 = dateTime35.get(dateTimeFieldType44);
        org.joda.time.DateTime.Property property46 = dateTime31.property(dateTimeFieldType44);
        org.joda.time.DateTime dateTime47 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.plus(readablePeriod48);
        org.joda.time.DateTime dateTime51 = dateTime47.minusHours(221);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646724348303L + "'", long6 == 1646724348303L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 445 + "'", int7 == 445);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022" + "'", str42, "2022");
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test21800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21800");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.util.Locale locale7 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime8 = property5.setCopy("0", locale7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale7);
        int int10 = calendar9.getWeekYear();
        calendar9.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar9.getActualMinimum(66694574);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66694574");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
    }

    @Test
    public void test21801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21801");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((long) 26162278);
        org.joda.time.LocalDateTime localDateTime9 = property6.withMaximumValue();
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(1646723925443L, dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType13.getDurationType();
        int int17 = dateTime12.get(dateTimeFieldType13);
        int int18 = dateTime12.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime12.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 438 + "'", int17 == 438);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test21802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21802");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfMonth(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withField(dateTimeFieldType13, 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.minusWeeks(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test21803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21803");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 32769, chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.weekOfWeekyear();
        boolean boolean7 = dateTimeField5.isLeap((long) 52);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfSecond();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DurationField durationField15 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.clockhourOfDay();
        long long19 = dateTimeField16.addWrapField((long) 8, 34320035);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType20.getField(chronology22);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology22);
        java.util.Date date26 = localDate25.toDate();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate25.plus(readablePeriod27);
        int int29 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.era();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays(100);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withEra(0);
        int int43 = localDateTime42.size();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusWeeks(8540);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withYearOfEra(572);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.plusMinutes(66521);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusMinutes(80956);
        int[] intArray52 = localDateTime49.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray54 = dateTimeField5.add((org.joda.time.ReadablePartial) localDate25, 49577658, intArray52, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49577658");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[UTC]" + "'", str14, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 39600008L + "'", long19 == 39600008L);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Tue Feb 22 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 24 + "'", int29 == 24);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-163, 3, 8, 16140000]");
    }

    @Test
    public void test21804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21804");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(16);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withPeriodAdded(readablePeriod7, 34);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withYearOfEra(8540);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusMinutes(391);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test21805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21805");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.LocalTime localTime6 = localTime4.plusSeconds((int) (byte) 1);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        org.joda.time.LocalTime localTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property7.addWrapFieldToCopy(15);
        org.joda.time.LocalTime localTime11 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime14 = property7.addNoWrapToCopy(541);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        long long16 = property15.remainder();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 365L + "'", long16 == 365L);
    }

    @Test
    public void test21806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21806");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(292278993);
        org.joda.time.DateTime dateTime9 = dateTime3.plusMinutes(67);
        org.joda.time.DateTime.Property property10 = dateTime3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.era();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withPeriodAdded(readablePeriod20, 8);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.minusMillis(600032);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.minus(readablePeriod25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime15.withPeriodAdded(readablePeriod27, 33);
        org.joda.time.Chronology chronology30 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime3, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test21807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21807");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(66512921);
        org.joda.time.Chronology chronology10 = chronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = chronology2.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.hourOfDay();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test21808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21808");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        java.lang.String str19 = dateTimeFieldType18.toString();
        boolean boolean20 = localTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = localTime2.toDateTimeToday();
        org.joda.time.LocalTime.Property property22 = localTime2.millisOfSecond();
        org.joda.time.LocalTime localTime24 = property22.setCopy(28);
        org.joda.time.LocalTime localTime26 = property22.addCopy(34320035);
        int int27 = localTime26.size();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weekyear" + "'", str19, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test21809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21809");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology5);
        boolean boolean8 = durationFieldType1.isSupported(chronology5);
        java.util.Date date10 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((java.lang.Object) date10);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = durationFieldType1.getField(chronology12);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        org.joda.time.Chronology chronology18 = chronology16.withUTC();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 19, chronology18);
        org.joda.time.DurationField durationField20 = chronology18.months();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.yearOfCentury();
        boolean boolean22 = durationFieldType1.isSupported(chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.era();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate localDate28 = localDate24.minusYears(10);
        int[] intArray29 = localDate24.getValues();
        org.joda.time.LocalDate.Property property30 = localDate24.era();
        org.joda.time.Chronology chronology31 = localDate24.getChronology();
        int int32 = localDate24.getYearOfCentury();
        org.joda.time.LocalDate.Property property33 = localDate24.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.seconds();
        boolean boolean35 = localDate24.isSupported(durationFieldType34);
        int int36 = localDate24.getYearOfCentury();
        int int37 = localDate24.getEra();
        org.joda.time.LocalDate localDate39 = localDate24.plusYears(66611409);
        org.joda.time.LocalDate.Property property40 = localDate39.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone43);
        int int45 = localTime44.getSecondOfMinute();
        org.joda.time.LocalTime.Property property46 = localTime44.hourOfDay();
        org.joda.time.LocalTime localTime48 = localTime44.minusSeconds(15);
        org.joda.time.LocalTime.Property property49 = localTime44.millisOfSecond();
        org.joda.time.LocalTime localTime51 = property49.setCopy(59);
        org.joda.time.LocalTime localTime53 = property49.addWrapFieldToCopy((-284887110));
        org.joda.time.LocalTime localTime55 = localTime53.minusMillis(2030);
        int[] intArray56 = localTime55.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray58 = dateTimeField23.add((org.joda.time.ReadablePartial) localDate39, 0, intArray56, 50400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 22 + "'", int32 == 22);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[23, 59, 58, 294]");
    }

    @Test
    public void test21810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21810");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.minus(readablePeriod5);
        int int7 = dateTime2.getMillisOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        long long15 = chronology9.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField17 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.minuteOfHour();
        org.joda.time.Chronology chronology21 = chronology9.withUTC();
        org.joda.time.DateTime dateTime22 = dateTime2.toDateTime(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = chronology21.get(readablePeriod23, 0L, 47952000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26748880 + "'", int7 == 26748880);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 971923363200000L + "'", long15 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test21811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21811");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.minus(readablePeriod8);
        boolean boolean10 = dateTime7.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime7.plusMinutes(81159);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes(665258);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMonths(67043);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test21812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21812");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.monthOfYear();
        long long11 = dateTimeField9.roundHalfFloor((long) 194);
        int int14 = dateTimeField9.getDifference((long) 122, (-213119513L));
        int int16 = dateTimeField9.getMinimumValue(26891009280000L);
        java.util.Locale locale21 = new java.util.Locale("hi!", "", "");
        java.lang.String str22 = locale21.getDisplayScript();
        java.util.Locale locale26 = new java.util.Locale("hi!", "", "");
        java.lang.String str27 = locale21.getDisplayScript(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.lang.String str29 = locale26.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTimeField9.getAsShortText(66959739, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66959739");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test21813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21813");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        int int3 = localDate0.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate localDate7 = localDate5.plusMonths(26601939);
        org.joda.time.DateMidnight dateMidnight8 = localDate7.toDateMidnight();
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test21814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21814");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime10.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        boolean boolean15 = dateTime10.isSupported(dateTimeFieldType14);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime10.toMutableDateTime(chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology21);
        org.joda.time.Chronology chronology24 = dateTimeFormatter23.getChronolgy();
        java.util.Locale locale25 = dateTimeFormatter23.getLocale();
        int int26 = dateTimeFormatter23.getDefaultYear();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withCenturyOfEra(55);
        org.joda.time.DateTime dateTime33 = dateTime31.withHourOfDay(10);
        org.joda.time.DateTime dateTime35 = dateTime31.withMillis(6000014L);
        org.joda.time.DateTime.Property property36 = dateTime35.year();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTimeFormatter23.print((org.joda.time.ReadableInstant) dateTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2000 + "'", int26 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test21815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21815");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(66512921);
        org.joda.time.Chronology chronology10 = chronology2.withZone(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeField dateTimeField12 = chronology2.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology2.getDateTimeMillis(66598254, 66555151, 2182012, 344, (-457416), 67048948, 229);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 344 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test21816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21816");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalDate localDate27 = property25.roundCeilingCopy();
        java.lang.Object obj28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj28, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property33 = dateTime32.weekyear();
        int int34 = dateTime32.getYear();
        org.joda.time.DateTime dateTime35 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        boolean boolean38 = localDate36.isSupported(durationFieldType37);
        int int39 = localDate36.size();
        org.joda.time.DateTime dateTime40 = dateTime35.withFields((org.joda.time.ReadablePartial) localDate36);
        java.lang.String str42 = localDate36.toString("97");
        org.joda.time.LocalDate localDate44 = localDate36.withWeekyear((int) (short) -1);
        org.joda.time.Interval interval45 = localDate44.toInterval();
        org.joda.time.LocalDate localDate47 = localDate44.withYear(40320000);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate50 = localDate47.withPeriodAdded(readablePeriod48, 600);
        int int51 = localDate27.compareTo((org.joda.time.ReadablePartial) localDate47);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "97" + "'", str42, "97");
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test21817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21817");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.util.Date date17 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) date17);
        gregorianCalendar7.setTime(date17);
        java.util.Date date21 = new java.util.Date((long) 435);
        date21.setYear(23);
        date21.setHours(292278993);
        java.time.Instant instant26 = date21.toInstant();
        gregorianCalendar7.setTime(date21);
        int int29 = gregorianCalendar7.getMaximum(13);
        boolean boolean30 = gregorianCalendar7.isWeekDateSupported();
        long long31 = gregorianCalendar7.getTimeInMillis();
        long long32 = gregorianCalendar7.getTimeInMillis();
        int int33 = gregorianCalendar7.getMinimalDaysInFirstWeek();
        int int34 = gregorianCalendar7.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Mar 08 07:15:55 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sun Jan 10 09:00:00 GMT 35266");
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 59 + "'", int29 == 59);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1050721146000435L + "'", long31 == 1050721146000435L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1050721146000435L + "'", long32 == 1050721146000435L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test21818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21818");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology1.hours();
        org.joda.time.DurationField durationField5 = chronology1.hours();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeField dateTimeField7 = chronology1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(22);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = property15.addWrapFieldToCopy(213120000);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plus(readableDuration18);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = localDateTime19.getFields();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setLanguageTag("fr");
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale.Builder builder27 = builder22.setLocale(locale25);
        java.util.Locale.Builder builder29 = builder22.removeUnicodeLocaleAttribute("1439");
        java.util.Locale locale30 = java.util.Locale.ROOT;
        java.lang.String str31 = locale30.getISO3Country();
        java.util.Locale locale32 = java.util.Locale.CANADA;
        java.lang.String str33 = locale32.toLanguageTag();
        java.lang.String str34 = locale32.getDisplayVariant();
        java.lang.String str35 = locale30.getDisplayName(locale32);
        java.util.Locale.Builder builder36 = builder29.setLocale(locale32);
        java.util.Locale locale40 = new java.util.Locale("DateTimeField[monthOfYear]", "GMT", "7");
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str42 = locale32.getDisplayName(locale40);
        java.lang.String str43 = locale32.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDateTime19, 80400470, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80400470");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-CA" + "'", str33, "en-CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals(locale40.toString(), "datetimefield[monthofyear]_GMT_7");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English (Canada)" + "'", str42, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "inglese" + "'", str43, "inglese");
    }
}
