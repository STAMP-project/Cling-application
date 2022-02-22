import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

    public static boolean debug = false;

    @Test
    public void test22001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22001");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMinutes((int) 'u');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26275);
        int int9 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withEra(1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test22002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22002");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType7, 26279, 522, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26279 for secondOfMinute must be in the range [522,2022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test22003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22003");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant4 = date3.toInstant();
        java.util.Date date5 = java.util.Date.from(instant4);
        int int6 = date5.getMinutes();
        java.util.Date date8 = new java.util.Date((long) '4');
        java.util.Date date12 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int13 = date12.getTimezoneOffset();
        date12.setMonth((int) '#');
        int int16 = date12.getMonth();
        date12.setSeconds(26166);
        date12.setSeconds((int) (short) 0);
        date12.setDate(26166);
        boolean boolean23 = date8.before(date12);
        date8.setYear(32772);
        java.util.Date date27 = new java.util.Date((long) '4');
        java.util.Date date31 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int32 = date31.getTimezoneOffset();
        date31.setMonth((int) '#');
        int int35 = date31.getMonth();
        date31.setSeconds(26166);
        date31.setSeconds((int) (short) 0);
        date31.setDate(26166);
        boolean boolean42 = date27.before(date31);
        date27.setYear(32772);
        boolean boolean45 = date8.before(date27);
        java.time.Instant instant46 = date8.toInstant();
        date8.setMonth(26186);
        int int49 = date8.getMinutes();
        java.util.Date date55 = new java.util.Date(0, 0, 0, 9, (int) '#');
        int int56 = date55.getMonth();
        date55.setDate(0);
        boolean boolean59 = date8.before(date55);
        boolean boolean60 = date5.after(date8);
        java.lang.String str61 = date5.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 UTC 1909");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 29 00:00:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 01 00:00:00 UTC 36854");
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 21 00:00:00 UTC 1983");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals(date27.toString(), "Mon Jan 01 00:00:00 UTC 34672");
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jul 21 00:00:00 UTC 1983");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Nov 30 09:35:00 UTC 1899");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 11 + "'", int56 == 11);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Mon Nov 29 00:00:00 UTC 1909" + "'", str61, "Mon Nov 29 00:00:00 UTC 1909");
    }

    @Test
    public void test22004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22004");
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        java.util.Locale locale11 = new java.util.Locale("+00:00");
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter9.withPivotYear(26211);
        java.lang.Integer int18 = dateTimeFormatter9.getPivotYear();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter9.withZone(dateTimeZone20);
        java.lang.String str24 = dateTimeZone20.toString();
        java.lang.String str25 = dateTimeZone20.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(26601, (-26317), 36000000, 1936, 26361, 26261364, 26170864, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1936 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale11.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test22005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(26476);
        long long4 = dateTimeZone1.adjustOffset(26297168L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 26297168L + "'", long4 == 26297168L);
    }

    @Test
    public void test22006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22006");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.Chronology chronology6 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime2.plus(readablePeriod7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.minusYears((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfSecond(59);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        boolean boolean21 = dateTime18.isSupported(dateTimeFieldType19);
        boolean boolean22 = localTime2.isSupported(dateTimeFieldType19);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear(35);
        org.joda.time.Chronology chronology29 = dateTimeFormatter28.getChronology();
        java.util.Locale locale30 = dateTimeFormatter28.getLocale();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readablePeriod33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property37 = dateTime34.minuteOfDay();
        java.util.Locale locale39 = new java.util.Locale("+00:00");
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale39.getDisplayName(locale42);
        java.util.Locale.setDefault(locale42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology45);
        int int47 = dateTime46.getEra();
        org.joda.time.DateTime.Property property48 = dateTime46.secondOfMinute();
        org.joda.time.DateTime dateTime50 = dateTime46.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property51 = dateTime50.secondOfDay();
        java.util.Locale locale52 = java.util.Locale.PRC;
        boolean boolean53 = dateTime50.equals((java.lang.Object) locale52);
        java.lang.String str54 = locale42.getDisplayCountry(locale52);
        java.util.Calendar calendar55 = dateTime34.toCalendar(locale52);
        java.lang.String str56 = locale52.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter28.withLocale(locale52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = localTime2.toString("2025-01-22T00:00:21.981Z", locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26758 + "'", int12 == 26758);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(chronology29);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals(locale39.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(calendar55);
// flaky:         org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=1645514758683,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=58,MILLISECOND=683,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u6587" + "'", str56, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
    }

    @Test
    public void test22007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22007");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property2.setCopy(26173491);
        org.joda.time.LocalDateTime localDateTime10 = property2.setCopy(26725);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 86399999 + "'", int6 == 86399999);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test22008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22008");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale2.getISO3Language();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setLanguage("Wed");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        java.util.TimeZone timeZone15 = dateTimeZone13.toTimeZone();
        timeZone15.setID("Etc/UTC");
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone15, locale18);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale18.getDisplayVariant(locale21);
        java.lang.String str23 = locale18.getVariant();
        java.util.Locale locale25 = new java.util.Locale("+00:00");
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale18.getDisplayScript(locale26);
        java.util.Locale.Builder builder29 = builder10.setLocale(locale18);
        java.lang.String str30 = locale0.getDisplayScript(locale18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deu" + "'", str3, "deu");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5fb7\u56fd" + "'", str4, "\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Taiwan" + "'", str5, "Taiwan");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645514758713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=58,MILLISECOND=713,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale25.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test22009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22009");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(6);
        int int10 = property6.getMinimumValueOverall();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        long long15 = property14.remainder();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.lang.String str17 = property14.getAsShortText(locale16);
        java.lang.String str18 = property6.getAsShortText(locale16);
        java.lang.String str19 = locale16.getScript();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale16.getDisplayName(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale20.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 725L + "'", long15 == 725L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "58" + "'", str17, "58");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u516c\u5143" + "'", str18, "\u516c\u5143");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str22, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
    }

    @Test
    public void test22010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22010");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale4 = new java.util.Locale("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale9 = new java.util.Locale("Etc/UTC");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear(13);
        org.joda.time.Chronology chronology13 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime17.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime21 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getEra();
        int int25 = dateTime23.getSecondOfDay();
        org.joda.time.DateTime dateTime27 = dateTime23.minusMonths((int) 'a');
        boolean boolean28 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology29 = dateTime21.getChronology();
        org.joda.time.DateTime.Property property30 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime31 = property30.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.minus(readablePeriod36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 1645514178685L, dateTimeZone40);
        org.joda.time.Chronology chronology42 = chronology32.withZone(dateTimeZone40);
        boolean boolean44 = dateTimeZone40.isStandardOffset((long) 2023);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter15.withZone(dateTimeZone40);
        boolean boolean47 = dateTimeZone40.isStandardOffset(97970L);
        java.util.TimeZone timeZone48 = dateTimeZone40.toTimeZone();
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(locale9.toString(), "etc/utc");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26758 + "'", int25 == 26758);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test22011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22011");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds(2000);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = dateTime9.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withHourOfDay((-70));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26758 + "'", int3 == 26758);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test22012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        int int6 = property3.getMaximumValueOverall();
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        org.joda.time.DateTime dateTime8 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.plusDays(26311131);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "58" + "'", str4, "58");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test22013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22013");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.getLocalDate();
        org.joda.time.LocalDate localDate5 = property1.addWrapFieldToCopy(26267);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property7 = localDate6.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) localDate9, dateTimeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str21 = dateTimeZone19.getNameKey(0L);
        org.joda.time.DateTime dateTime22 = localDate17.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property29 = dateTime26.minuteOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.toDateTime(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.minus(readableDuration32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded(readableDuration34, (-25262));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime33.toMutableDateTime();
        int int38 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime33);
        long long40 = dateTimeZone19.convertUTCToLocal((long) 26183);
        org.joda.time.DateTime dateTime41 = localDate5.toDateTimeAtStartOfDay(dateTimeZone19);
        java.lang.String str43 = dateTimeZone19.getNameKey((-1514392801294L));
        java.lang.String str44 = dateTimeZone19.getID();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 26183L + "'", long40 == 26183L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
    }

    @Test
    public void test22014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22014");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(26204714);
        org.joda.time.LocalDate.Property property7 = localDate0.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((-26300));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test22015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (short) 100);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours(59);
        org.joda.time.DateTime.Property property12 = dateTime9.yearOfEra();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        int int19 = dateTimeZone16.getOffsetFromLocal(34839L);
        java.lang.String str21 = dateTimeZone16.getShortName((long) 26299);
        java.lang.String str22 = dateTimeZone16.getID();
        long long25 = dateTimeZone16.adjustOffset((-826287177599993L), false);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) dateTime13, dateTimeZone16);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-826287177599993L) + "'", long25 == (-826287177599993L));
    }

    @Test
    public void test22016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22016");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 6);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.getWeekOfWeekyear();
        int int7 = localDate5.size();
        org.joda.time.LocalDate.Property property8 = localDate5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(26535);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26535 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test22017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22017");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTime dateTime16 = property13.addWrapFieldToCopy(3222);
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getEra();
        int int29 = dateTime27.getSecondOfDay();
        org.joda.time.DateTime dateTime31 = dateTime27.minusMonths((int) 'a');
        boolean boolean32 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property33 = dateTime25.year();
        org.joda.time.DateTime dateTime34 = property33.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        int int38 = dateTimeZone35.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        java.lang.String str44 = property43.getAsText();
        org.joda.time.DateTimeField dateTimeField45 = property43.getField();
        long long47 = dateTimeField45.roundFloor((long) (byte) 10);
        java.lang.String str48 = dateTimeField45.getName();
        java.lang.String str49 = dateTimeField45.toString();
        int int50 = dateTimeField45.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = dateTimeField45.getType();
        int int53 = dateTimeField45.getMinimumValue((long) ' ');
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale locale56 = builder55.build();
        java.util.Locale locale57 = builder55.build();
        java.lang.String str58 = locale57.getDisplayScript();
        java.lang.String str59 = dateTimeField45.getAsShortText(8, locale57);
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.lang.String str62 = locale61.getISO3Country();
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale locale64 = builder63.build();
        java.lang.String str65 = locale61.getDisplayCountry(locale64);
        java.util.Locale locale66 = locale61.stripExtensions();
        java.lang.String str67 = locale61.getDisplayName();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale61.getDisplayCountry(locale68);
        java.lang.String str71 = locale68.getExtension('u');
        java.lang.String str72 = locale57.getDisplayName(locale68);
        java.lang.String str73 = dateTimeZone35.getName((long) 54, locale57);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int77 = dateTime75.get(dateTimeFieldType76);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime75.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime79 = dateTime75.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(chronology80);
        int int82 = dateTime81.getEra();
        int int83 = dateTime81.getSecondOfDay();
        org.joda.time.DateTime dateTime85 = dateTime81.minusMonths((int) 'a');
        boolean boolean86 = dateTime79.isEqual((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime.Property property87 = dateTime79.year();
        org.joda.time.DateTime dateTime88 = property87.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone89 = dateTime88.getZone();
        java.lang.String str90 = dateTimeZone89.getID();
        long long92 = dateTimeZone35.getMillisKeepLocal(dateTimeZone89, 717L);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime((long) 26340, dateTimeZone35);
        int int94 = property18.getDifference((org.joda.time.ReadableInstant) dateTime93);
        int int95 = dateTime93.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26758 + "'", int9 == 26758);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 26758 + "'", int29 == 26758);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "58" + "'", str44, "58");
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "secondOfMinute" + "'", str48, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "DateTimeField[secondOfMinute]" + "'", str49, "DateTimeField[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 59 + "'", int50 == 59);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "8" + "'", str59, "8");
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:00" + "'", str73, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 7 + "'", int77 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 26758 + "'", int83 == 26758);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTimeZone89);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "UTC" + "'", str90, "UTC");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 717L + "'", long92 == 717L);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1722032639 + "'", int94 == 1722032639);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test22018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22018");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(22, 13);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        long long7 = durationField4.getValueAsLong(0L, 421L);
        long long10 = durationField4.getMillis(26418059, (long) 26463);
        boolean boolean11 = durationField4.isPrecise();
        long long14 = durationField4.subtract(801L, 448L);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 833673419856000000L + "'", long10 == 833673419856000000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-14137545599199L) + "'", long14 == (-14137545599199L));
    }

    @Test
    public void test22019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22019");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.millisOfSecond();
        org.joda.time.LocalTime localTime3 = property1.setCopy("39");
        org.joda.time.LocalTime localTime5 = property1.addCopy(26296);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property1.setCopy(26593);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26593 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test22020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22020");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean5 = timeZone2.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        java.util.TimeZone timeZone11 = dateTimeZone9.toTimeZone();
        timeZone11.setID("Etc/UTC");
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean15 = timeZone2.hasSameRules(timeZone11);
        boolean boolean16 = timeZone2.observesDaylightTime();
        int int17 = timeZone2.getRawOffset();
        timeZone2.setRawOffset(19142);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645514758884,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=58,MILLISECOND=884,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22021");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(6);
        calendar0.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(26668, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test22022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22022");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(22, 13);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.LocalTime.Property property4 = localTime2.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime2.withPeriodAdded(readablePeriod5, 26367857);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test22023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.setCopy(5);
        org.joda.time.LocalTime localTime9 = property5.addCopy((long) 26168398);
        org.joda.time.LocalTime localTime10 = property5.roundCeilingCopy();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        org.joda.time.LocalTime localTime15 = property5.setCopy("26176946", locale14);
        org.joda.time.LocalTime localTime16 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = localTime16.minusSeconds(26311131);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        int int22 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime dateTime24 = dateTime20.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime24.toMutableDateTime(chronology25);
        org.joda.time.DateTime.Property property27 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime29 = property27.addWrapFieldToCopy(0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getEra();
        int int33 = dateTime31.getSecondOfDay();
        org.joda.time.DateTime dateTime35 = dateTime31.minusMonths((int) 'a');
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfCentury((int) (byte) 0);
        long long38 = dateTime37.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int40 = dateTime37.get(dateTimeFieldType39);
        int int41 = dateTime29.get(dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType39.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType39.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime45 = localTime18.withFieldAdded(durationFieldType43, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26758 + "'", int22 == 26758);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 26758 + "'", int33 == 26758);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 948525958909L + "'", long38 == 948525958909L);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(durationFieldType43);
    }

    @Test
    public void test22024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22024");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusDays(7);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.millisOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        java.lang.String str7 = property5.getAsText();
        org.joda.time.LocalDateTime localDateTime8 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(26324);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "86399999" + "'", str7, "86399999");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test22025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22025");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        java.lang.String str8 = dateTimeFieldType6.toString();
        int int9 = dateTime5.get(dateTimeFieldType6);
        int int10 = dateTime5.getMonthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        org.joda.time.DateTime dateTime16 = dateTime12.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime12.withWeekyear(26170);
        org.joda.time.DateTime.Property property19 = dateTime12.dayOfMonth();
        boolean boolean20 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime21 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.YearMonthDay yearMonthDay22 = dateTime12.toYearMonthDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMonths(26164319);
        org.joda.time.DateTime.Property property29 = dateTime26.weekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime26.getZone();
        long long32 = dateTimeZone30.nextTransition(603L);
        org.joda.time.DateTime dateTime33 = dateTime12.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime dateTime35 = dateTime12.plusDays(801);
        org.joda.time.DateTime dateTime36 = dateTime35.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "clockhourOfHalfday" + "'", str8, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 603L + "'", long32 == 603L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test22026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22026");
        java.util.Date date12 = new java.util.Date(15, (int) '4', 26167, (int) (short) 1, 26167);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromDateFields(date12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        long long20 = dateTimeZone15.convertLocalToUTC((long) ' ', false, 530L);
        java.lang.String str22 = dateTimeZone15.getShortName((long) 'u');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        long long25 = dateTimeZone15.convertUTCToLocal((-1104364800000L));
        org.joda.time.DateMidnight dateMidnight26 = localDate13.toDateMidnight(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((int) (byte) 10, 26639, 1898, (-62), 26329, 0, 26284, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -62 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 07 05:07:00 UTC 1991");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1104364800000L) + "'", long25 == (-1104364800000L));
        org.junit.Assert.assertNotNull(dateMidnight26);
    }

    @Test
    public void test22027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22027");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("8");
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 26171, chronology9);
        org.joda.time.DurationField durationField12 = durationFieldType3.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 649, chronology9);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfWeek();
        int int16 = dateTime14.getSecondOfDay();
        boolean boolean17 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test22028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22028");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 36299999);
        int int2 = localDateTime1.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test22029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22029");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.set(0, (-41), 23600, 26205, 26188, 26175);
        java.util.TimeZone timeZone11 = calendar0.getTimeZone();
        int int12 = calendar0.getFirstDayOfWeek();
        java.time.Instant instant13 = calendar0.toInstant();
        java.lang.String str14 = calendar0.getCalendarType();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        java.lang.String str18 = timeZone17.getID();
        timeZone17.setRawOffset(10);
        timeZone17.setRawOffset((int) 'a');
        calendar0.setTimeZone(timeZone17);
        calendar0.setFirstDayOfWeek(26471);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-60140330164018,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=97,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=26471,minimalDaysInFirstWeek=4,ERA=1,YEAR=64,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=86,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=44,SECOND=15,MILLISECOND=124,ZONE_OFFSET=19142,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gregory" + "'", str14, "gregory");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test22030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22030");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("0001-01-01");
        java.util.Date date8 = new java.util.Date(15, (int) '4', 26167, (int) (short) 1, 26167);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        long long16 = dateTimeZone11.convertLocalToUTC((long) ' ', false, 530L);
        java.lang.String str18 = dateTimeZone11.getShortName((long) 'u');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long21 = dateTimeZone11.convertUTCToLocal((-1104364800000L));
        org.joda.time.DateMidnight dateMidnight22 = localDate9.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-634507200000L), dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime1.toMutableDateTime(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 07 05:07:00 UTC 1991");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1104364800000L) + "'", long21 == (-1104364800000L));
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test22031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22031");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property14 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime17 = dateTime15.plusWeeks((-2600));
        org.joda.time.DateTime dateTime19 = dateTime15.plusDays(26684);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26759 + "'", int9 == 26759);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test22032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22032");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundFloorCopy();
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfWeek(5);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays(2022);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant11 = new org.joda.time.Instant((java.lang.Object) chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test22033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZone(dateTimeZone9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter4.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter4.getPrinter();
        java.util.Locale locale13 = dateTimeFormatter4.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime16.toMutableDateTime(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter4.withZone(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 26238);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = dateTimeFormatter32.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter32.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withPivotYear((java.lang.Integer) 26536);
        boolean boolean39 = dateTimeFormatter38.isPrinter();
        org.joda.time.Chronology chronology40 = dateTimeFormatter38.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNull(dateTimePrinter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(chronology40);
    }

    @Test
    public void test22034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22034");
        java.util.Locale locale2 = new java.util.Locale("8 Sep 34887659 23:00:59 GMT", "26336");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readablePeriod5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime8.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfMinute();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        long long17 = dateTimeField15.roundFloor((long) (byte) 10);
        java.lang.String str18 = dateTimeField15.getName();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getEra();
        org.joda.time.DateTime.Property property25 = dateTime23.secondOfMinute();
        org.joda.time.DateTime dateTime27 = dateTime23.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfDay();
        java.util.Locale locale29 = java.util.Locale.PRC;
        boolean boolean30 = dateTime27.equals((java.lang.Object) locale29);
        java.lang.String str31 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) localTime21, locale29);
        java.util.Calendar calendar32 = dateTime8.toCalendar(locale29);
        java.lang.String str33 = locale29.getLanguage();
        java.lang.String str34 = locale29.toLanguageTag();
        java.lang.String str35 = locale29.getDisplayScript();
        java.lang.String str36 = locale2.getDisplayName(locale29);
        org.junit.Assert.assertEquals(locale2.toString(), "8 sep 34887659 23:00:59 gmt_26336");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "59" + "'", str14, "59");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "secondOfMinute" + "'", str18, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645601159051,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=54,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=59,MILLISECOND=51,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "8 sep 34887659 23:00:59 gmt (26336)" + "'", str36, "8 sep 34887659 23:00:59 gmt (26336)");
    }

    @Test
    public void test22035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(53);
        org.joda.time.LocalTime localTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = property5.addCopy(9);
        org.joda.time.DateTimeField dateTimeField11 = property5.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property5.getFieldType();
        org.joda.time.LocalTime localTime13 = property5.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime13.minus(readablePeriod14);
        org.joda.time.LocalTime.Property property16 = localTime13.hourOfDay();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test22036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22036");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 22, dateTimeZone1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readablePeriod5);
        org.joda.time.DateTime.Property property7 = dateTime4.weekyear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        long long16 = dateTimeZone14.nextTransition((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime4.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTime.Property property18 = dateTime4.minuteOfHour();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DurationField durationField24 = property22.getDurationField();
        long long27 = durationField24.getDifferenceAsLong((long) 6, (long) 26163);
        long long30 = durationField24.subtract((long) 35, (int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = durationField24.getType();
        org.joda.time.DateTime dateTime33 = dateTime4.withFieldAdded(durationFieldType31, 26190);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        int int37 = localDateTime35.getDayOfYear();
        org.joda.time.Chronology chronology38 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfEra();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = durationFieldType31.getField(chronology38);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime2.toMutableDateTime(chronology38);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = chronology38.getDateTimeMillis(1060, 50, 26431, 26622, (-685340037), 26756430, (-17));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26622 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "59" + "'", str23, "59");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-26L) + "'", long27 == (-26L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-99965L) + "'", long30 == (-99965L));
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 365 + "'", int37 == 365);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
    }

    @Test
    public void test22037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder12 = builder8.setDate((int) (byte) 0, 2, 26179);
        java.util.Calendar.Builder builder17 = builder8.setTimeOfDay(3222, (int) (byte) 1, (int) (byte) 100, 26173);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Calendar.Builder builder19 = builder8.setLocale(locale18);
        java.lang.String str20 = locale18.getDisplayCountry();
        int int21 = dateTimeField6.getMaximumShortTextLength(locale18);
        int int23 = dateTimeField6.getMaximumValue(536457626201L);
        long long25 = dateTimeField6.roundCeiling(26166L);
        long long27 = dateTimeField6.roundHalfEven((long) 26669);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60000L + "'", long25 == 60000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test22038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22038");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        java.lang.String str11 = property9.getAsString();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        java.lang.String str14 = localDateTime12.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.000" + "'", str14, "1970-01-01T00:00:00.000");
    }

    @Test
    public void test22039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22039");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfMonth();
        int int10 = localDateTime8.getHourOfDay();
        int int11 = localDateTime8.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusMillis(26304);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.minusWeeks(45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test22040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22040");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfDay();
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(18000100L, chronology5);
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test22041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22041");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.clear();
        calendar0.clear();
        calendar0.roll(10, true);
        calendar0.setTimeInMillis((long) 7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.LocalDate.Property property16 = localDate13.year();
        boolean boolean17 = calendar0.before((java.lang.Object) property16);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfMonth();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property21 = localDate20.centuryOfEra();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.LocalDate localDate23 = property21.roundCeilingCopy();
        org.joda.time.LocalDate localDate24 = property21.withMinimumValue();
        org.joda.time.LocalDate localDate26 = property21.addWrapFieldToCopy(3222);
        java.util.Locale locale28 = new java.util.Locale("hi!");
        java.lang.String str29 = locale28.getISO3Country();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = builder30.build();
        java.lang.String str32 = locale28.getDisplayCountry(locale31);
        java.util.Locale locale33 = locale28.stripExtensions();
        int int34 = property21.getMaximumShortTextLength(locale28);
        java.util.Locale locale36 = new java.util.Locale("+00:00");
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = locale36.getDisplayName(locale39);
        java.lang.String str41 = locale36.getISO3Country();
        java.lang.String str42 = locale28.getDisplayCountry(locale36);
        int int43 = property19.getMaximumTextLength(locale36);
        org.joda.time.DateTimeField dateTimeField44 = property19.getField();
        java.lang.String str46 = dateTimeField44.getAsShortText((-59002878930216L));
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=7,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=19,MILLISECOND=149,ZONE_OFFSET=19142,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645514759133,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=18,MILLISECOND=275,ZONE_OFFSET=19142,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertEquals(locale28.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertEquals(locale36.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "10" + "'", str46, "10");
    }

    @Test
    public void test22042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22042");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology5.centuries();
        org.joda.time.DurationField durationField11 = chronology5.minutes();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test22043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DurationField durationField6 = chronology4.months();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology4);
        long long11 = chronology4.add((long) 1910, (long) 26341, 26657814);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 702193480484L + "'", long11 == 702193480484L);
    }

    @Test
    public void test22044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22044");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime6 = localTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(8);
        org.joda.time.LocalTime.Property property9 = localTime6.secondOfMinute();
        org.joda.time.Chronology chronology10 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfYear();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology10);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.DateTime dateTime15 = localTime13.toDateTimeToday();
        org.joda.time.DateTime.Property property16 = dateTime15.centuryOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.millisOfDay();
        org.joda.time.LocalTime localTime18 = dateTime15.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime18.withHourOfDay(36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test22045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 32772);
        long long6 = dateTimeZone1.previousTransition((long) (byte) 100);
        java.lang.String str8 = dateTimeZone1.getShortName(1000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        int int18 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.minusMonths((int) 'a');
        boolean boolean21 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property22 = dateTime14.year();
        org.joda.time.DateTime dateTime24 = property22.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.minusHours(52);
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTimeISO();
        int int29 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology31);
        org.joda.time.LocalTime localTime34 = localTime32.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property35 = localTime32.millisOfDay();
        org.joda.time.LocalTime localTime37 = property35.addCopy(53);
        org.joda.time.LocalTime localTime38 = property35.roundHalfCeilingCopy();
        org.joda.time.Interval interval39 = property35.toInterval();
        org.joda.time.LocalTime localTime40 = property35.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime41 = property35.withMaximumValue();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology43);
        org.joda.time.LocalTime localTime46 = localTime44.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property47 = localTime44.millisOfDay();
        org.joda.time.LocalTime localTime49 = property47.setCopy(5);
        org.joda.time.LocalTime localTime51 = property47.addCopy((long) 26168398);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        int int54 = dateTime53.getEra();
        org.joda.time.DateTime.Property property55 = dateTime53.secondOfMinute();
        org.joda.time.DateTime dateTime57 = dateTime53.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType58.getDurationType();
        java.lang.String str60 = dateTimeFieldType58.toString();
        int int61 = dateTime57.get(dateTimeFieldType58);
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType58.getDurationType();
        int int63 = localTime51.get(dateTimeFieldType58);
        boolean boolean64 = localTime41.isSupported(dateTimeFieldType58);
        java.lang.String str65 = dateTimeFieldType58.getName();
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType58.getRangeDurationType();
        java.lang.String str67 = durationFieldType66.toString();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalTime localTime70 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalTime localTime73 = localTime70.withPeriodAdded(readablePeriod71, (int) (short) 100);
        org.joda.time.LocalTime localTime75 = localTime73.plusMillis(8);
        org.joda.time.LocalTime localTime77 = localTime73.minusMillis(14);
        org.joda.time.DateTimeField[] dateTimeFieldArray78 = localTime73.getFields();
        org.joda.time.LocalTime localTime80 = localTime73.minusHours(32772);
        org.joda.time.Chronology chronology81 = localTime80.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = chronology81.yearOfCentury();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(chronology83);
        int int85 = dateTime84.getEra();
        org.joda.time.DateTime.Property property86 = dateTime84.secondOfMinute();
        org.joda.time.DateTime dateTime88 = dateTime84.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property89 = dateTime88.secondOfDay();
        boolean boolean90 = org.joda.time.field.FieldUtils.equals((java.lang.Object) chronology81, (java.lang.Object) property89);
        boolean boolean91 = durationFieldType66.isSupported(chronology81);
        org.joda.time.DateTime dateTime93 = dateTime27.withFieldAdded(durationFieldType66, 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26759 + "'", int18 == 26759);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "clockhourOfHalfday" + "'", str60, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "clockhourOfHalfday" + "'", str65, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "halfdays" + "'", str67, "halfdays");
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(dateTimeFieldArray78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(dateTime93);
    }

    @Test
    public void test22046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22046");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        int int14 = dateTime10.get(dateTimeFieldType11);
        int int15 = dateTime10.getMonthOfYear();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property18 = dateTime10.property(dateTimeFieldType17);
        org.joda.time.DateTime dateTime20 = dateTime10.plusHours(3);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded(readableDuration21, (int) (byte) 100);
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime26 = instant24.toMutableDateTimeISO();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) 26275);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant28.minus(readableDuration29);
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTimeISO();
        boolean boolean32 = instant24.isBefore((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime dateTime33 = instant30.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "clockhourOfHalfday" + "'", str13, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test22047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22047");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Thu", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test22048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22048");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        java.lang.String str15 = dateTimeFieldType13.toString();
        org.joda.time.DateTime.Property property16 = dateTime7.property(dateTimeFieldType13);
        org.joda.time.DateTime dateTime18 = property16.addWrapFieldToCopy(26206);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears(291);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26759 + "'", int9 == 26759);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "clockhourOfHalfday" + "'", str15, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test22049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22049");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.util.stream.Stream<java.lang.String> strStream14 = strList13.stream();
        boolean boolean15 = strSet5.containsAll((java.util.Collection<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.stream();
        boolean boolean34 = strSet24.containsAll((java.util.Collection<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder44 = builder40.setTimeOfDay(4, (-25262), (-1));
        java.util.Calendar.Builder builder48 = builder44.setDate(26178, 8, 14);
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        boolean boolean52 = timeZone51.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        boolean boolean54 = timeZone51.observesDaylightTime();
        java.util.Calendar.Builder builder55 = builder48.setTimeZone(timeZone51);
        java.util.Calendar.Builder builder59 = builder55.setDate(53, (int) '4', 26187);
        boolean boolean60 = strSet39.contains((java.lang.Object) builder59);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strSet39);
        int int62 = strSet39.size();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test22050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22050");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 32772);
        int int6 = dateTimeZone1.getOffset(1036800000L);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        int int12 = localDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, chronology13);
        long long19 = chronology13.add(18000100L, 3024000000L, 23);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology13);
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) chronology13);
        org.joda.time.DateTimeField dateTimeField22 = chronology13.weekyear();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        boolean boolean27 = localDateTime24.equals((java.lang.Object) "");
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minus(readableDuration28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.hourOfDay();
        int int34 = localDateTime32.getDayOfYear();
        org.joda.time.Chronology chronology35 = localDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.minuteOfHour();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.minus(readablePeriod40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property44 = dateTime41.minuteOfDay();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.toDateTime(chronology45);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        long long51 = dateTimeZone48.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime46.toMutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology53 = chronology35.withZone(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField54 = chronology35.clockhourOfDay();
        org.joda.time.DurationField durationField55 = chronology35.hours();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime29, chronology35);
        java.lang.Object obj57 = null;
        boolean boolean58 = localDateTime29.equals(obj57);
        java.util.Locale.Category category60 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale61 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(category60, locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault(category60);
        java.util.Locale locale64 = java.util.Locale.getDefault(category60);
        java.util.Locale locale65 = java.util.Locale.getDefault(category60);
        java.util.Locale locale66 = java.util.Locale.getDefault(category60);
        java.util.Locale locale67 = java.util.Locale.getDefault(category60);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        int int70 = dateTime69.getEra();
        org.joda.time.DateTime.Property property71 = dateTime69.secondOfMinute();
        java.lang.String str72 = property71.getAsText();
        org.joda.time.DateTimeField dateTimeField73 = property71.getField();
        long long75 = dateTimeField73.roundFloor((long) (byte) 10);
        long long77 = dateTimeField73.roundHalfCeiling((long) '#');
        java.lang.String str78 = dateTimeField73.getName();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.millisOfDay();
        boolean boolean83 = localDateTime80.equals((java.lang.Object) "");
        org.joda.time.ReadableDuration readableDuration84 = null;
        org.joda.time.LocalDateTime localDateTime85 = localDateTime80.minus(readableDuration84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.withWeekOfWeekyear(4);
        java.util.Locale locale88 = java.util.Locale.CHINA;
        java.lang.String str89 = dateTimeField73.getAsText((org.joda.time.ReadablePartial) localDateTime85, locale88);
        java.util.Set<java.lang.String> strSet90 = locale88.getUnicodeLocaleAttributes();
        java.lang.String str91 = locale88.getLanguage();
        java.lang.String str92 = locale88.getCountry();
        java.lang.String str93 = locale67.getDisplayLanguage(locale88);
        java.util.Calendar calendar94 = java.util.Calendar.getInstance(locale67);
        java.lang.String str95 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime29, 26225, locale67);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 69570000100L + "'", long19 == 69570000100L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 365 + "'", int34 == 365);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 117L + "'", long51 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + category60 + "' != '" + java.util.Locale.Category.FORMAT + "'", category60.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "it");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(property71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "59" + "'", str72, "59");
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "secondOfMinute" + "'", str78, "secondOfMinute");
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "0" + "'", str89, "0");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "zh" + "'", str91, "zh");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "CN" + "'", str92, "CN");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str93, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(calendar94);
// flaky:         org.junit.Assert.assertEquals(calendar94.toString(), "java.util.GregorianCalendar[time=1645514759307,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=18,MILLISECOND=449,ZONE_OFFSET=19142,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "26225" + "'", str95, "26225");
    }

    @Test
    public void test22051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22051");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMillis(7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(26164);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.monthOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.secondOfMinute();
        int int15 = localDateTime12.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minus(readableDuration16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test22052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22052");
        java.util.Date date3 = new java.util.Date((int) (byte) 10, 53, (int) ' ');
        java.util.Date date7 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int8 = date7.getTimezoneOffset();
        date7.setMonth((int) '#');
        int int11 = date7.getMonth();
        date7.setSeconds(26166);
        date7.setSeconds((int) (short) 0);
        boolean boolean16 = date3.before(date7);
        int int17 = date3.getMonth();
        date3.setDate((int) (short) 1);
        java.lang.Object obj20 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Wed Jul 01 00:00:00 UTC 1914");
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 29 00:00:00 UTC 1911");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "Wed Jul 01 00:00:00 UTC 1914");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "Wed Jul 01 00:00:00 UTC 1914");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "Wed Jul 01 00:00:00 UTC 1914");
    }

    @Test
    public void test22053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22053");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.minusDays((int) (byte) 100);
        org.joda.time.DateTime dateTime15 = dateTime10.minusMonths(26171);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(28585);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property24 = dateTime21.minuteOfDay();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology31);
        org.joda.time.DateTime dateTime33 = dateTime27.withFields((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime35 = localTime32.plusMillis(4);
        org.joda.time.DateTime dateTime36 = localTime32.toDateTimeToday();
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfHour();
        org.joda.time.DateTime dateTime39 = dateTime36.minusDays((int) (byte) 100);
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime();
        org.joda.time.Instant instant41 = dateTime36.toInstant();
        boolean boolean42 = dateTime25.isBefore((org.joda.time.ReadableInstant) instant41);
        boolean boolean43 = dateTime15.isBefore((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Instant instant44 = instant41.toInstant();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(instant44);
    }

    @Test
    public void test22054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22054");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((long) 32772);
        java.lang.String str8 = dateTimeZone3.getName((long) 26275);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 'x', dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 75, dateTimeZone3);
        int int11 = localDateTime10.size();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test22055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22055");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusMonths(26163);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.minutes();
        org.joda.time.DurationField durationField12 = chronology10.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test22056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22056");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.DateTime dateTime9 = dateTime1.minusMonths(26164);
        int int10 = dateTime1.getMinuteOfHour();
        org.joda.time.DateTime.Property property11 = dateTime1.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test22057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22057");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = dateTime4.get(dateTimeFieldType5);
        int int7 = property2.compareTo((org.joda.time.ReadableInstant) dateTime4);
        int int8 = property2.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        long long18 = dateTimeField16.roundFloor((long) (byte) 10);
        java.lang.String str19 = dateTimeField16.getName();
        java.lang.String str20 = dateTimeField16.toString();
        int int21 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField16.getType();
        int int24 = dateTimeField16.getMinimumValue((long) ' ');
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale locale27 = builder26.build();
        java.util.Locale locale28 = builder26.build();
        java.lang.String str29 = locale28.getDisplayScript();
        java.lang.String str30 = dateTimeField16.getAsShortText(8, locale28);
        java.lang.String str31 = dateTimeField9.getAsText((long) 12, locale28);
        java.lang.String str32 = locale28.getScript();
        java.lang.String str33 = locale28.getDisplayCountry();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 86399999 + "'", int8 == 86399999);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "59" + "'", str15, "59");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "secondOfMinute" + "'", str19, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateTimeField[secondOfMinute]" + "'", str20, "DateTimeField[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "8" + "'", str30, "8");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "12" + "'", str31, "12");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test22058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        boolean boolean4 = localDateTime1.equals((java.lang.Object) "");
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readableDuration5);
        int int7 = localDateTime6.size();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours(26355);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        int int13 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime20 = property18.addWrapFieldToCopy(0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        int int23 = dateTime22.getEra();
        int int24 = dateTime22.getSecondOfDay();
        org.joda.time.DateTime dateTime26 = dateTime22.minusMonths((int) 'a');
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfCentury((int) (byte) 0);
        long long29 = dateTime28.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int31 = dateTime28.get(dateTimeFieldType30);
        int int32 = dateTime20.get(dateTimeFieldType30);
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType30.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property34 = localDateTime9.property(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26759 + "'", int13 == 26759);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26759 + "'", int24 == 26759);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 948525959447L + "'", long29 == 948525959447L);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test22059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22059");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int4 = date3.getTimezoneOffset();
        long long5 = date3.getTime();
        date3.setYear(26185);
        int int8 = date3.getDate();
        long long9 = date3.getTime();
        org.junit.Assert.assertEquals(date3.toString(), "Thu Nov 29 00:00:00 UTC 28085");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1896307219142L) + "'", long5 == (-1896307219142L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 824138582380858L + "'", long9 == 824138582380858L);
    }

    @Test
    public void test22060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = timeZone2.getID();
        timeZone2.setRawOffset(10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        timeZone2.setRawOffset(26474);
        timeZone2.setID("1 Jan 1970 00:00:26 GMT");
        int int11 = timeZone2.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test22061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22061");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("15");
        java.lang.Object obj2 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test22062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22062");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDate1.getFieldTypes();
        org.joda.time.LocalDate.Property property4 = localDate1.yearOfEra();
        org.joda.time.LocalDate.Property property5 = localDate1.dayOfYear();
        java.util.Locale locale9 = new java.util.Locale("44", "2022-02-22T07:16:14.603Z");
        java.lang.String str10 = locale9.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property5.setCopy("2022-02-22T07:25:38.785Z", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:25:38.785Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514759487,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=18,MILLISECOND=629,ZONE_OFFSET=19142,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals(locale9.toString(), "44_2022-02-22T07:16:14.603Z");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44 (2022-02-22T07:16:14.603Z)" + "'", str10, "44 (2022-02-22T07:16:14.603Z)");
    }

    @Test
    public void test22063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22063");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate8 = property6.roundHalfFloorCopy();
        int int9 = localDate8.size();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        org.joda.time.DateTime dateTime16 = dateTime12.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears(70);
        boolean boolean19 = property10.equals((java.lang.Object) dateTime16);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime16.withPeriodAdded(readablePeriod20, 26331);
        org.joda.time.DateTime dateTime24 = dateTime22.minusDays(26374);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withDayOfWeek(26446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26446 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test22064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22064");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property15 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        int int25 = dateTime24.getEra();
        int int26 = dateTime24.getSecondOfDay();
        org.joda.time.DateTime dateTime28 = dateTime24.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime28.toMutableDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusSeconds(2000);
        int int33 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter2.withZone(dateTimeZone21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter34.withOffsetParsed();
        java.lang.Appendable appendable36 = null;
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay(1645488000100L);
        int int39 = localTime38.size();
        org.joda.time.LocalTime localTime41 = localTime38.minusMinutes(26166);
        org.joda.time.LocalTime.Property property42 = localTime41.minuteOfHour();
        org.joda.time.LocalTime localTime43 = property42.roundHalfEvenCopy();
        org.joda.time.DurationField durationField44 = property42.getDurationField();
        org.joda.time.DateTimeField dateTimeField45 = property42.getField();
        org.joda.time.LocalTime localTime46 = property42.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter35.printTo(appendable36, (org.joda.time.ReadablePartial) localTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26759 + "'", int26 == 26759);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(localTime46);
    }

    @Test
    public void test22065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22065");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getShortName((long) 32772);
        java.lang.String str7 = dateTimeZone2.getName((long) 26275);
        org.joda.time.DateTime dateTime8 = localDate0.toDateTimeAtStartOfDay(dateTimeZone2);
        org.joda.time.LocalDate localDate10 = localDate0.plusYears(26225);
        int int11 = localDate10.getDayOfYear();
        int int12 = localDate10.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28247 + "'", int12 == 28247);
    }

    @Test
    public void test22066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22066");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.minusMonths(7);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.LocalDate localDate9 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate11 = property7.addWrapFieldToCopy((-52));
        org.joda.time.LocalDate localDate13 = localDate11.plusYears(2280100);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u661f\u671f\u56db" + "'", str8, "\u661f\u671f\u56db");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test22067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22067");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.toDateTime(chronology15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        long long21 = dateTimeZone18.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology23 = chronology5.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField24 = chronology23.hours();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology23);
        boolean boolean27 = durationFieldType0.isSupported(chronology23);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.hourOfDay();
        int int31 = localDateTime29.getDayOfYear();
        org.joda.time.Chronology chronology32 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.clockhourOfHalfday();
        boolean boolean36 = durationFieldType0.isSupported(chronology32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.hourOfDay();
        int int40 = localDateTime38.getDayOfYear();
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.minuteOfHour();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.minus(readablePeriod46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property50 = dateTime47.minuteOfDay();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.toDateTime(chronology51);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.util.TimeZone timeZone55 = dateTimeZone54.toTimeZone();
        long long57 = dateTimeZone54.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime52.toMutableDateTime(dateTimeZone54);
        org.joda.time.Chronology chronology59 = chronology41.withZone(dateTimeZone54);
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.DurationField durationField61 = chronology59.years();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.Chronology chronology63 = chronology59.withUTC();
        org.joda.time.DateTimeField dateTimeField64 = chronology59.dayOfYear();
        org.joda.time.DurationField durationField65 = durationFieldType0.getField(chronology59);
        boolean boolean66 = durationField65.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 117L + "'", long21 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 365 + "'", int31 == 365);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 365 + "'", int40 == 365);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 117L + "'", long57 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test22068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22068");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale4 = new java.util.Locale("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale10 = new java.util.Locale("8", "Chinese");
        java.lang.String str11 = locale10.getDisplayScript();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear(52507);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra(100);
        org.joda.time.LocalDate localDate21 = localDate17.minusWeeks(13);
        org.joda.time.LocalDate localDate23 = localDate17.withYear(26164319);
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(2);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.LocalDate localDate28 = localDate25.minusWeeks(26263263);
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtCurrentTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withPivotYear(35);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter34.withZone(dateTimeZone39);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone39);
        java.lang.String str43 = dateTimeZone39.getNameKey((long) 7);
        org.joda.time.Interval interval44 = localDate25.toInterval(dateTimeZone39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter12.withZone(dateTimeZone39);
        org.joda.time.Chronology chronology46 = dateTimeFormatter12.getChronology();
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(locale10.toString(), "8_CHINESE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNull(chronology46);
    }

    @Test
    public void test22069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22069");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList32);
        java.util.stream.Stream<java.lang.String> strStream35 = strList34.stream();
        boolean boolean36 = strSet26.containsAll((java.util.Collection<java.lang.String>) strList34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale44 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51);
        java.util.stream.Stream<java.lang.String> strStream54 = strList53.stream();
        boolean boolean55 = strSet45.containsAll((java.util.Collection<java.lang.String>) strList53);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList53);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList66);
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList68);
        java.util.Collection<java.util.Locale> localeCollection70 = null;
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, localeCollection70, filteringMode71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList81);
        java.lang.String str84 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList83);
        java.util.Collection<java.util.Locale> localeCollection85 = null;
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, localeCollection85, filteringMode86);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList39, localeCollection70, filteringMode86);
        java.util.Locale.FilteringMode filteringMode89 = null;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList20, localeCollection70, filteringMode89);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList6, localeCollection70);
        java.util.Locale locale93 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet94 = locale93.getUnicodeLocaleKeys();
        boolean boolean96 = strSet94.remove((java.lang.Object) "7");
        int int97 = strSet94.size();
        java.lang.Object[] objArray98 = strSet94.toArray();
        java.util.List<java.lang.String> strList99 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode71.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertEquals(locale93.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(objArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray98), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray98), "[]");
        org.junit.Assert.assertNotNull(strList99);
    }

    @Test
    public void test22070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22070");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMonths(26164319);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone7.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime11 = dateTime5.withZoneRetainFields(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime5.plus(readableDuration12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime5.withPeriodAdded(readablePeriod14, 26288);
        org.joda.time.DateTime dateTime18 = dateTime5.minus(117L);
        org.joda.time.DateTime dateTime20 = dateTime5.minusYears(41);
        org.joda.time.DateTime.Property property21 = dateTime5.year();
        org.joda.time.DateTime.Property property22 = dateTime5.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime5.toMutableDateTime(dateTimeZone23);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        int int26 = timeZone25.getRawOffset();
        timeZone25.setID("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        boolean boolean29 = timeZone25.observesDaylightTime();
        boolean boolean30 = timeZone25.observesDaylightTime();
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.lang.String str32 = locale31.getISO3Language();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone25, locale31);
        java.lang.String str34 = locale31.getDisplayName();
        java.util.Set<java.lang.String> strSet35 = locale31.getUnicodeLocaleAttributes();
        java.util.Calendar calendar36 = mutableDateTime24.toCalendar(locale31);
        calendar36.setFirstDayOfWeek(840);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = calendar36.isSet(26330);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26330");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19142 + "'", int26 == 19142);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "deu" + "'", str32, "deu");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=18,MILLISECOND=860,ZONE_OFFSET=19142,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str34, "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=-68803867902840282,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=840,minimalDaysInFirstWeek=4,ERA=0,YEAR=2178295,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=350,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=59,MILLISECOND=718,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test22071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22071");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        boolean boolean6 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter2.getPrinter();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval12 = localDate9.toInterval();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate9.minus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readablePeriod13);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfYear(100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusHours(26203);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfDay();
        org.joda.time.Chronology chronology22 = chronology20.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology20);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test22072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22072");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withFieldAdded(durationFieldType6, 0);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        int int12 = localDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfHour();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property22 = dateTime19.minuteOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.toDateTime(chronology23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        long long29 = dateTimeZone26.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime24.toMutableDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology31 = chronology13.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField32 = chronology31.hours();
        boolean boolean33 = durationFieldType6.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.millisOfSecond();
        org.joda.time.DurationField durationField36 = chronology31.centuries();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.weekyearOfCentury();
        int int39 = dateTimeField37.getLeapAmount((long) 26168842);
        boolean boolean41 = dateTimeField37.isLeap(985950L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 117L + "'", long29 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test22073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22073");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 26204714);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear(26550);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter9.print(1645514724697L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test22074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22074");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate4 = property1.withMinimumValue();
        org.joda.time.LocalDate localDate6 = property1.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDate localDate7 = property1.roundFloorCopy();
        org.joda.time.LocalDate.Property property8 = localDate7.weekyear();
        org.joda.time.LocalDate localDate10 = property8.setCopy(26334);
        java.lang.String str11 = localDate10.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "26334-12-29" + "'", str11, "26334-12-29");
    }

    @Test
    public void test22075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22075");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = instant0.toDateTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test22076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22076");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        int int3 = calendar0.getWeekYear();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear(355);
        int int7 = localDate6.getEra();
        int int8 = localDate6.getMonthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate6.withEra(26410);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26410 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514759779,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=19142,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=13,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=18,MILLISECOND=921,ZONE_OFFSET=19142,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test22077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22077");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 1);
        java.lang.String str5 = localDateTime4.toString();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.centuryOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        int int18 = localDateTime16.getDayOfYear();
        org.joda.time.Chronology chronology19 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        int int23 = localDateTime21.getDayOfYear();
        org.joda.time.Chronology chronology24 = localDateTime21.getChronology();
        int[] intArray26 = chronology19.get((org.joda.time.ReadablePartial) localDateTime21, (long) 1);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.dayOfWeek();
        java.lang.String str29 = dateTimeField27.getAsShortText((long) (-1));
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getISO3Country();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale locale35 = builder34.build();
        java.lang.String str36 = locale32.getDisplayCountry(locale35);
        java.util.Locale locale37 = locale32.stripExtensions();
        java.lang.String str38 = dateTimeField27.getAsText(117L, locale32);
        java.lang.String str39 = property13.getAsShortText(locale32);
        org.joda.time.DateTime dateTime40 = property13.roundFloorCopy();
        org.joda.time.DateTime dateTime41 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime4.plusMonths((-924));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.001" + "'", str5, "1970-01-01T00:00:00.001");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 365 + "'", int23 == 365);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u661f\u671f\u4e09" + "'", str29, "\u661f\u671f\u4e09");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Thursday" + "'", str38, "Thursday");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "445" + "'", str39, "445");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test22078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime14 = dateTime7.plusWeeks(32769);
        org.joda.time.DateTime dateTime15 = dateTime7.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26759 + "'", int9 == 26759);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test22079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22079");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(6);
        org.joda.time.LocalDate localDate10 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate11 = property6.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField12 = property6.getField();
        org.joda.time.LocalDate localDate13 = property6.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test22080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22080");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra((int) (short) 0);
        int int10 = localDateTime9.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minus(readablePeriod11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property19 = dateTime16.minuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.toDateTime(chronology20);
        long long22 = dateTime16.getMillis();
        org.joda.time.DateTime dateTime24 = dateTime16.minusDays(22);
        org.joda.time.DateTime dateTime25 = dateTime16.toDateTime();
        int int26 = dateTime25.getMillisOfDay();
        org.joda.time.DateTime dateTime27 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = dateTime25.isSupported(dateTimeFieldType28);
        int int30 = dateTime25.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645514759832L + "'", long22 == 1645514759832L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26759832 + "'", int26 == 26759832);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
    }

    @Test
    public void test22081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22081");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        long long8 = durationField5.getDifferenceAsLong((long) 6, (long) 26163);
        long long11 = durationField5.subtract((long) 35, (int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = durationField5.getType();
        org.joda.time.DurationFieldType durationFieldType13 = durationField5.getType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths(69);
        org.joda.time.DateTime.Property property20 = dateTime15.monthOfYear();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DurationField durationField23 = durationFieldType13.getField(chronology22);
        java.lang.String str24 = durationFieldType13.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "59" + "'", str4, "59");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-26L) + "'", long8 == (-26L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-99965L) + "'", long11 == (-99965L));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "seconds" + "'", str24, "seconds");
    }

    @Test
    public void test22082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22082");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (short) 100);
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(8);
        org.joda.time.LocalTime localTime9 = localTime5.minusMillis(14);
        org.joda.time.LocalTime localTime11 = localTime9.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime15 = localTime11.withMillisOfDay(29);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.LocalTime.Property property17 = localTime11.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime11.withHourOfDay(26577);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26577 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test22083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22083");
        java.util.Date date5 = new java.util.Date(26309509, 26173, 43, 0, 32770);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology11);
        org.joda.time.DateTime dateTime13 = dateTime7.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime localTime15 = localTime12.plusMillis(4);
        java.util.Date date22 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date22.setYear(1);
        boolean boolean25 = localTime15.equals((java.lang.Object) date22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology31);
        org.joda.time.DateTime dateTime33 = dateTime27.withFields((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime35 = localTime32.plusMillis(4);
        java.util.Date date42 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date42.setYear(1);
        boolean boolean45 = localTime35.equals((java.lang.Object) date42);
        int int46 = date42.getMonth();
        boolean boolean47 = date22.before(date42);
        int int48 = date22.getDay();
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.fromDateFields(date22);
        int int50 = date22.getSeconds();
        date22.setSeconds(26617912);
        int int53 = date22.getSeconds();
        boolean boolean54 = date5.before(date22);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Apr 06 18:10:00 UTC 26313590");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Dec 14 00:52:52 UTC 1901");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Feb 08 23:01:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test22084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22084");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(0);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded((long) 8854920, (-661182326));
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime7.withPeriodAdded(readablePeriod14, 26356);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime7.plus(readablePeriod17);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test22085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22085");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZone(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(41);
        org.joda.time.LocalTime localTime15 = localTime11.plusMinutes((-2178338));
        org.joda.time.LocalTime localTime17 = localTime11.plusHours(26738);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test22086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22086");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime8 = localTime5.withPeriodAdded(readablePeriod6, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean10 = localTime8.isSupported(dateTimeFieldType9);
        int[] intArray11 = localTime8.getValues();
        org.joda.time.LocalTime localTime13 = localTime8.plusHours(26190);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = localTime8.toDateTimeToday(dateTimeZone14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(26759832, 26655583, 26603, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26655583 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test22087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22087");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(100);
        org.joda.time.LocalDate localDate6 = localDate2.minusWeeks(13);
        org.joda.time.LocalDate localDate8 = localDate2.minusDays((int) (short) 10);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths(26177);
        java.util.Date date11 = localDate10.toDate();
        date11.setDate(3222);
        java.time.Instant instant14 = date11.toInstant();
        java.lang.String str15 = date11.toLocaleString();
        long long16 = date11.getTime();
        int int17 = date11.getSeconds();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Jun 26 00:00:00 UTC 4212");
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "26-giu-4212 0.00.00" + "'", str15, "26-giu-4212 0.00.00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 70765919980858L + "'", long16 == 70765919980858L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22088");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.minusMonths(7);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(26169);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        int int18 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.minusMonths((int) 'a');
        boolean boolean21 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property22 = dateTime14.year();
        org.joda.time.Instant instant23 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime24 = localDate8.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTimeZone dateTimeZone25 = instant23.getZone();
        org.joda.time.Instant instant27 = instant23.plus((long) 71400100);
        org.joda.time.MutableDateTime mutableDateTime28 = instant27.toMutableDateTime();
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26759 + "'", int18 == 26759);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test22089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22089");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale4 = new java.util.Locale("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale9 = new java.util.Locale("Etc/UTC");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear(13);
        org.joda.time.Chronology chronology13 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter10.withDefaultYear(26263263);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((-26244));
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(locale9.toString(), "etc/utc");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test22090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22090");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        int int4 = property1.get();
        org.joda.time.LocalDate localDate5 = property1.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = property6.setCopy(26297168);
        int int9 = localDate8.getWeekyear();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("+00:00");
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale11.getDisplayLanguage(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDate8.toString("2022-02-22T07:22:01.470Z", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26297168 + "'", int9 == 26297168);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals(locale14.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese" + "'", str17, "Chinese");
    }

    @Test
    public void test22091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22091");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime19 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        int int23 = dateTime21.getSecondOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.minusMonths((int) 'a');
        boolean boolean26 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property27 = dateTime19.year();
        org.joda.time.DateTime dateTime29 = property27.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.secondOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.minusHours(52);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.DateTime dateTime36 = dateTime5.withField(dateTimeFieldType33, 3);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((-2022));
        int int39 = dateTime38.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26760 + "'", int9 == 26760);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26760 + "'", int23 == 26760);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1200 + "'", int34 == 1200);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64980000 + "'", int39 == 64980000);
    }

    @Test
    public void test22092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale4 = new java.util.Locale("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale10 = new java.util.Locale("8", "Chinese");
        java.lang.String str11 = locale10.getDisplayScript();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withDefaultYear(26189);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear(41);
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter14.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withOffsetParsed();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.Instant instant21 = instant19.plus((long) 2032);
        org.joda.time.Instant instant23 = instant19.withMillis((long) (-52));
        org.joda.time.Chronology chronology24 = instant19.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter14.withChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.yearOfCentury();
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(locale10.toString(), "8_CHINESE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test22093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22093");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0L, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.weeks();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfDay();
        int int13 = dateTimeField11.get(1645514529911L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test22094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22094");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes(438);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(2922789);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withFieldAdded(durationFieldType24, 0);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        int int30 = localDateTime28.getDayOfYear();
        org.joda.time.Chronology chronology31 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.minuteOfHour();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.minus(readablePeriod36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property40 = dateTime37.minuteOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.toDateTime(chronology41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        long long47 = dateTimeZone44.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime42.toMutableDateTime(dateTimeZone44);
        org.joda.time.Chronology chronology49 = chronology31.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField50 = chronology49.hours();
        boolean boolean51 = durationFieldType24.isSupported(chronology49);
        org.joda.time.DateTimeField dateTimeField52 = chronology49.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology49.getZone();
        org.joda.time.DateTime dateTime55 = localDateTime14.toDateTime(dateTimeZone54);
        org.joda.time.DateTime.Property property56 = dateTime55.dayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 117L + "'", long47 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
    }

    @Test
    public void test22095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22095");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfYear(12);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusYears(7);
        int int6 = localDateTime3.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.monthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(1969);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYear((-1));
        int int13 = localDateTime8.getEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test22096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22096");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.DateTime dateTime15 = property13.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfDay();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        int int18 = dateTime17.getMillisOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        int int23 = localDateTime21.getDayOfYear();
        org.joda.time.Chronology chronology24 = localDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property33 = dateTime30.minuteOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTime(chronology34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        long long40 = dateTimeZone37.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime35.toMutableDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology42 = chronology24.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField43 = chronology42.hours();
        org.joda.time.DurationField durationField44 = chronology42.years();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology42);
        boolean boolean46 = durationFieldType19.isSupported(chronology42);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.hourOfDay();
        int int50 = localDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology51 = localDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.clockhourOfHalfday();
        boolean boolean55 = durationFieldType19.isSupported(chronology51);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.hourOfDay();
        int int59 = localDateTime57.getDayOfYear();
        org.joda.time.Chronology chronology60 = localDateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfEra();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.minuteOfHour();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime66 = dateTime64.minus(readablePeriod65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property69 = dateTime66.minuteOfDay();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateTime66.toDateTime(chronology70);
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        java.util.TimeZone timeZone74 = dateTimeZone73.toTimeZone();
        long long76 = dateTimeZone73.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime71.toMutableDateTime(dateTimeZone73);
        org.joda.time.Chronology chronology78 = chronology60.withZone(dateTimeZone73);
        org.joda.time.DurationField durationField79 = chronology78.hours();
        org.joda.time.DurationField durationField80 = chronology78.years();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(chronology78);
        org.joda.time.Chronology chronology82 = chronology78.withUTC();
        org.joda.time.DateTimeField dateTimeField83 = chronology78.dayOfYear();
        org.joda.time.DurationField durationField84 = durationFieldType19.getField(chronology78);
        org.joda.time.DateTimeField dateTimeField85 = chronology78.hourOfDay();
        org.joda.time.DateTimeField dateTimeField86 = chronology78.secondOfDay();
        org.joda.time.DurationField durationField87 = chronology78.hours();
        org.joda.time.DurationField durationField88 = chronology78.millis();
        org.joda.time.DurationField durationField89 = chronology78.centuries();
        org.joda.time.DateTime dateTime90 = dateTime17.toDateTime(chronology78);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26760 + "'", int9 == 26760);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86399000 + "'", int18 == 86399000);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 365 + "'", int23 == 365);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 117L + "'", long40 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 365 + "'", int50 == 365);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 365 + "'", int59 == 365);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 117L + "'", long76 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(durationField80);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(durationField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(durationField87);
        org.junit.Assert.assertNotNull(durationField88);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertNotNull(dateTime90);
    }

    @Test
    public void test22097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22097");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = timeZone2.getID();
        timeZone2.setRawOffset(10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        int int7 = timeZone2.getRawOffset();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645514760147,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=0,MILLISECOND=157,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test22098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22098");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        int int6 = localDateTime4.getDayOfYear();
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime9.getChronology();
        int[] intArray14 = chronology7.get((org.joda.time.ReadablePartial) localDateTime9, (long) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int[] intArray19 = chronology7.get((org.joda.time.ReadablePartial) localDateTime17, (long) 8);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime17);
        int int21 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime2.plusMinutes(26196);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone.setDefault(timeZone26);
        boolean boolean30 = timeZone26.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime32 = localDateTime2.toDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusDays(26329);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.dayOfMonth();
        int int37 = localDateTime33.size();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1970, 1, 1, 8]");
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test22099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22099");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField27 = dateTimeField26.getRangeDurationField();
        int int28 = dateTimeField26.getMaximumValue();
        boolean boolean29 = dateTimeField26.isLenient();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 117L + "'", long20 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test22100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22100");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        boolean boolean4 = localDateTime1.equals((java.lang.Object) "");
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekOfWeekyear(4);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMinutes(333);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfSecond(5);
        int int15 = localDateTime12.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test22101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        int int10 = dateTime8.getSecondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime8.minusMonths((int) 'a');
        boolean boolean13 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology14);
        org.joda.time.DurationField durationField16 = chronology14.seconds();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.monthOfYear();
        org.joda.time.Chronology chronology20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) dateTimeField19, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJMonthOfYearDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26760 + "'", int10 == 26760);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test22102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22102");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long6 = dateTimeZone1.convertLocalToUTC((long) ' ', false, 530L);
        java.lang.String str8 = dateTimeZone1.getShortName((long) 'u');
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(26190);
        org.joda.time.LocalTime localTime13 = localTime9.minusMillis(26260074);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, (-26168841));
        org.joda.time.LocalTime localTime18 = localTime13.withHourOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime20 = localTime13.minusMinutes(84487284);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime13.plus(readablePeriod21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test22103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22103");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property5 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate7 = property5.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = property5.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property5.addWrapFieldToCopy(3222);
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale locale15 = builder14.build();
        java.lang.String str16 = locale12.getDisplayCountry(locale15);
        java.util.Locale locale17 = locale12.stripExtensions();
        int int18 = property5.getMaximumShortTextLength(locale12);
        java.util.Locale locale20 = new java.util.Locale("+00:00");
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale20.getDisplayName(locale23);
        java.lang.String str25 = locale20.getISO3Country();
        java.lang.String str26 = locale12.getDisplayCountry(locale20);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone3, locale12);
        java.lang.String str28 = calendar27.getCalendarType();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals(locale20.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514760230,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=0,MILLISECOND=230,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "gregory" + "'", str28, "gregory");
    }

    @Test
    public void test22104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22104");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology22);
        int int26 = localDateTime25.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withField(dateTimeFieldType27, 5);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusWeeks(26185);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusYears((-17));
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusMillis(52);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        org.joda.time.DateTime.Property property40 = dateTime37.weekyear();
        java.lang.String str41 = dateTime37.toString();
        org.joda.time.ReadableInstant readableInstant42 = null;
        boolean boolean43 = dateTime37.isAfter(readableInstant42);
        java.util.GregorianCalendar gregorianCalendar44 = dateTime37.toGregorianCalendar();
        org.joda.time.DateMidnight dateMidnight45 = dateTime37.toDateMidnight();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plus(readableDuration47);
        java.lang.String str49 = localDateTime48.toString();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.hourOfDay();
        int int53 = localDateTime51.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.plusMinutes((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType56.getDurationType();
        boolean boolean58 = localDateTime55.isSupported(dateTimeFieldType56);
        int int59 = localDateTime48.get(dateTimeFieldType56);
        boolean boolean60 = dateTime37.isSupported(dateTimeFieldType56);
        org.joda.time.LocalDateTime.Property property61 = localDateTime31.property(dateTimeFieldType56);
        org.joda.time.Chronology chronology62 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime31.plusMinutes((-26597598));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 117L + "'", long20 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2022-02-22T07:26:00.244Z" + "'", str41, "2022-02-22T07:26:00.244Z");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022-02-22T07:26:00.244" + "'", str49, "2022-02-22T07:26:00.244");
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 365 + "'", int53 == 365);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 7 + "'", int59 == 7);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(localDateTime64);
    }

    @Test
    public void test22105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22105");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        java.lang.String str8 = dateTimeFieldType6.toString();
        int int9 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime5.getZone();
        org.joda.time.DateTime.Property property11 = dateTime5.minuteOfHour();
        org.joda.time.DateTime.Property property12 = dateTime5.dayOfWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withPeriodAdded(readablePeriod21, 26163);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = localDateTime23.toString(dateTimeFormatter24);
        boolean boolean26 = dateTimeZone14.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) dateTime5, dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime5.minus(readablePeriod29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "clockhourOfHalfday" + "'", str8, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:00.001" + "'", str25, "1970-01-01T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test22106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22106");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(100);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        int int16 = dateTime14.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.minusMonths((int) 'a');
        boolean boolean19 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property20 = dateTime12.year();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((int) (short) 10);
        boolean boolean23 = localDate4.equals((java.lang.Object) (short) 10);
        int int24 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate localDate26 = localDate4.minusYears(1969);
        org.joda.time.LocalDate localDate28 = localDate4.plusDays(32772);
        org.joda.time.LocalDate localDate30 = localDate28.minusYears(26204714);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        int int33 = dateTime32.getEra();
        org.joda.time.DateTime.Property property34 = dateTime32.secondOfMinute();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) dateTime32);
        org.joda.time.DateTime dateTime37 = dateTime32.plusMonths(26376);
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate41 = localDate39.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra(100);
        org.joda.time.LocalTime localTime44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTime(localTime44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int49 = dateTime47.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime51 = dateTime47.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        int int54 = dateTime53.getEra();
        int int55 = dateTime53.getSecondOfDay();
        org.joda.time.DateTime dateTime57 = dateTime53.minusMonths((int) 'a');
        boolean boolean58 = dateTime51.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime.Property property59 = dateTime51.year();
        org.joda.time.DateTime dateTime61 = property59.addToCopy((int) (short) 10);
        boolean boolean62 = localDate43.equals((java.lang.Object) (short) 10);
        org.joda.time.LocalDate localDate64 = localDate43.plusYears(26212);
        org.joda.time.LocalDate.Property property65 = localDate64.dayOfYear();
        org.joda.time.LocalDate localDate67 = localDate64.withWeekyear((-26204714));
        org.joda.time.LocalDate localDate69 = localDate64.withYear((-37985));
        org.joda.time.LocalDate localDate71 = localDate64.plusMonths(26261);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str73 = dateTimeFieldType72.getName();
        boolean boolean74 = localDate64.isSupported(dateTimeFieldType72);
        boolean boolean75 = dateTime37.isSupported(dateTimeFieldType72);
        boolean boolean76 = localDate28.isSupported(dateTimeFieldType72);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((java.lang.Object) localDate28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26760 + "'", int16 == 26760);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 7 + "'", int49 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 26760 + "'", int55 == 26760);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "millisOfSecond" + "'", str73, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test22107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22107");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime8.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime8.withYear(26176946);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime8.withPeriodAdded(readablePeriod20, (-26204714));
        int int23 = dateTime8.getMillisOfSecond();
        org.joda.time.DateTime.Property property24 = dateTime8.yearOfCentury();
        org.joda.time.TimeOfDay timeOfDay25 = dateTime8.toTimeOfDay();
        org.joda.time.Chronology chronology26 = dateTime8.getChronology();
        org.joda.time.Chronology chronology27 = dateTime8.getChronology();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 315 + "'", int23 == 315);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test22108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22108");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1645488000100L);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.minusMinutes(26166);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        boolean boolean8 = durationField7.isPrecise();
        long long10 = durationField7.getMillis(660L);
        long long13 = durationField7.getMillis(530240000L, (-60140330144354L));
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 39600000L + "'", long10 == 39600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31814400000000L + "'", long13 == 31814400000000L);
    }

    @Test
    public void test22109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        int int5 = localDateTime4.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusHours(2);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test22110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22110");
        java.util.Date date5 = new java.util.Date(183, 86371, 58, 41, 26181);
        java.lang.Object obj6 = date5.clone();
        org.junit.Assert.assertEquals(date5.toString(), "Wed Oct 16 21:21:00 UTC 9280");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "Wed Oct 16 21:21:00 UTC 9280");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Wed Oct 16 21:21:00 UTC 9280");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Wed Oct 16 21:21:00 UTC 9280");
    }

    @Test
    public void test22111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        int int10 = dateTime8.getSecondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime8.minusMonths((int) 'a');
        boolean boolean13 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology14);
        org.joda.time.Chronology chronology16 = chronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26760 + "'", int10 == 26760);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22112");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(859, 86367230, 26679038, 671, 26605, 35, 26732, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 671 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime19 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        int int23 = dateTime21.getSecondOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.minusMonths((int) 'a');
        boolean boolean26 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property27 = dateTime19.year();
        org.joda.time.DateTime dateTime29 = property27.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.secondOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.minusHours(52);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.DateTime dateTime36 = dateTime5.withField(dateTimeFieldType33, 3);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((-2022));
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.hourOfDay();
        int int42 = localDateTime40.getDayOfYear();
        org.joda.time.Chronology chronology43 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfEra();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.minuteOfHour();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.minus(readablePeriod48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property52 = dateTime49.minuteOfDay();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime49.toDateTime(chronology53);
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        long long59 = dateTimeZone56.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime54.toMutableDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology61 = chronology43.withZone(dateTimeZone56);
        org.joda.time.DurationField durationField62 = chronology61.hours();
        org.joda.time.DurationField durationField63 = chronology61.years();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.dayOfMonth();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology61);
        org.joda.time.DateTime dateTime66 = dateTime38.withChronology(chronology61);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.DateTime dateTime68 = dateTime66.minus(readablePeriod67);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26760 + "'", int9 == 26760);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26760 + "'", int23 == 26760);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1200 + "'", int34 == 1200);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 365 + "'", int42 == 365);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 117L + "'", long59 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
    }

    @Test
    public void test22114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22114");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        int int6 = dateTime5.getWeekOfWeekyear();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime5.toGregorianCalendar();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26760 + "'", int3 == 26760);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
    }

    @Test
    public void test22115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22115");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime5.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.DateTime dateTime12 = property8.addWrapFieldToCopy(26297);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property19 = dateTime16.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTime();
        boolean boolean22 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26760 + "'", int3 == 26760);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test22116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22116");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale4 = new java.util.Locale("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology12);
        org.joda.time.DurationField durationField17 = chronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.yearOfEra();
        org.joda.time.DurationField durationField19 = chronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.dayOfWeek();
        long long22 = dateTimeField20.roundHalfFloor((long) 26355);
        int int23 = dateTimeField20.getMaximumValue();
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test22117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22117");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusMonths(26163);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.era();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test22118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22118");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        int int6 = localDateTime4.getDayOfYear();
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime9.getChronology();
        int[] intArray14 = chronology7.get((org.joda.time.ReadablePartial) localDateTime9, (long) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int[] intArray19 = chronology7.get((org.joda.time.ReadablePartial) localDateTime17, (long) 8);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime17);
        int int21 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property22 = localDateTime2.weekyear();
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = localDateTime2.getFields();
        int int24 = localDateTime2.getEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime2.yearOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = property25.getDifference(readableInstant26);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1970, 1, 1, 8]");
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4044) + "'", int27 == (-4044));
    }

    @Test
    public void test22119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22119");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        int[] intArray11 = chronology4.get((org.joda.time.ReadablePartial) localDateTime6, (long) 1);
        org.joda.time.DateTimeField dateTimeField12 = chronology4.dayOfWeek();
        org.joda.time.DurationField durationField13 = chronology4.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        int int22 = localDateTime20.getDayOfYear();
        org.joda.time.Chronology chronology23 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        int int27 = localDateTime25.getDayOfYear();
        org.joda.time.Chronology chronology28 = localDateTime25.getChronology();
        int[] intArray30 = chronology23.get((org.joda.time.ReadablePartial) localDateTime25, (long) 1);
        org.joda.time.DateTimeField dateTimeField31 = chronology23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int[] intArray35 = chronology23.get((org.joda.time.ReadablePartial) localDateTime33, (long) 8);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime33);
        int int37 = localDateTime18.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime18.plusMinutes(26196);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.year();
        int int41 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withEra(678);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 678 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 365 + "'", int22 == 365);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 365 + "'", int27 == 365);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1970, 1, 1, 8]");
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 11 + "'", int41 == 11);
    }

    @Test
    public void test22120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22120");
        java.lang.String[] strArray23 = new java.lang.String[] { "6", "0", "secondOfMinute", "13", "14", "13", "2022-02-22T07:16:14.603Z", "hi!", "9", "UTC", "16", "clockhourOfHalfday", "Etc/UTC", "Nov 29, 1909 12:00:00 AM", "0", "6", "deu", "Etc/UTC", "hours", "4", "Nov 29, 1909 12:00:00 AM", "16", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.Date date31 = new java.util.Date(15, (int) '4', 26167, (int) (short) 1, 26167);
        boolean boolean32 = strSet24.contains((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList38.stream();
        boolean boolean42 = strSet24.retainAll((java.util.Collection<java.lang.String>) strList38);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.hourOfDay();
        int int46 = localDateTime44.getDayOfYear();
        org.joda.time.Chronology chronology47 = localDateTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.hourOfDay();
        org.joda.time.DurationField durationField50 = chronology47.weekyears();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology47.getZone();
        org.joda.time.DurationField durationField52 = chronology47.millis();
        boolean boolean53 = strSet24.equals((java.lang.Object) chronology47);
        java.util.Calendar.Builder[] builderArray54 = new java.util.Calendar.Builder[] {};
        java.util.Calendar.Builder[] builderArray55 = strSet24.toArray(builderArray54);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Jan 07 05:07:00 UTC 1991");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 365 + "'", int46 == 365);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(builderArray54);
        org.junit.Assert.assertNotNull(builderArray55);
    }

    @Test
    public void test22121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22121");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        int int4 = property1.get();
        org.joda.time.LocalDate localDate5 = property1.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime8.weekyear();
        java.lang.String str12 = dateTime8.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        boolean boolean14 = dateTime8.isAfter(readableInstant13);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withPivotYear(35);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withZone(dateTimeZone24);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime8.toMutableDateTime(dateTimeZone24);
        long long29 = dateTimeZone24.nextTransition((long) 16445);
        long long31 = dateTimeZone24.convertUTCToLocal((long) (-2022));
        org.joda.time.DateTime dateTime32 = localDate5.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekyear(26170867);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-22T07:26:00.526Z" + "'", str12, "2022-02-22T07:26:00.526Z");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 16445L + "'", long29 == 16445L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-2022L) + "'", long31 == (-2022L));
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test22122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22122");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        int int8 = property6.getLeapAmount();
        org.joda.time.DateTime dateTime10 = property6.addToCopy(1970);
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTime.Property property16 = dateTime14.secondOfMinute();
        long long17 = property16.remainder();
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = property16.getAsShortText(locale18);
        org.joda.time.DateTime dateTime21 = property16.setCopy(7);
        boolean boolean22 = instant11.equals((java.lang.Object) property16);
        java.lang.String str23 = property16.getName();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 547L + "'", long17 == 547L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "secondOfMinute" + "'", str23, "secondOfMinute");
    }

    @Test
    public void test22123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.Chronology chronology6 = localTime2.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(chronology6);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) '4');
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(26252);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(26233);
        int int14 = localTime13.getHourOfDay();
        org.joda.time.LocalTime.Property property15 = localTime13.millisOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundFloorCopy();
        int int17 = property15.getLeapAmount();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22124");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime1.minuteOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra(100);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTime(localTime10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        int int15 = dateTime13.getSecondOfDay();
        org.joda.time.DateTime.Property property16 = dateTime13.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime dateTime19 = dateTime13.withField(dateTimeFieldType17, 3);
        int int20 = dateTime1.get(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22125");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusMonths(26163);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime11.minusWeeks(26218893);
        long long15 = dateTime11.getMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1645514760584L + "'", long15 == 1645514760584L);
    }

    @Test
    public void test22126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22126");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.year();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.dayOfMonth();
        int int10 = dateTimeField7.getDifference(1645514532960L, (long) 26658);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19045 + "'", int10 == 19045);
    }

    @Test
    public void test22127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22127");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("46");
        org.joda.time.LocalDateTime localDateTime9 = property5.withMinimumValue();
        org.joda.time.DurationField durationField10 = property5.getLeapDurationField();
        java.lang.String str11 = property5.getAsString();
        org.joda.time.LocalDateTime localDateTime12 = property5.withMinimumValue();
        java.lang.String str13 = property5.toString();
        org.joda.time.LocalDateTime localDateTime14 = property5.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[weekOfWeekyear]" + "'", str13, "Property[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test22128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property14 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.millisOfDay();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField19.set((long) 110, "26349");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26349 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26760 + "'", int9 == 26760);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[UTC]" + "'", str18, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test22129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22129");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(chronology7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute((int) (short) 0);
        int int16 = localDateTime15.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int18 = localDateTime15.get(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withWeekyear(26166);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.Chronology chronology22 = localDateTime20.getChronology();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plus(readablePeriod23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusSeconds(110);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.era();
        int int28 = localDateTime24.get(dateTimeFieldType27);
        int int29 = dateTime8.get(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType27, 26656, 26644, 367);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26656 for era must be in the range [26644,367]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test22130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22130");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        int int17 = localDateTime15.getDayOfYear();
        org.joda.time.Chronology chronology18 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        int int22 = localDateTime20.getDayOfYear();
        org.joda.time.Chronology chronology23 = localDateTime20.getChronology();
        int[] intArray25 = chronology18.get((org.joda.time.ReadablePartial) localDateTime20, (long) 1);
        chronology4.validate((org.joda.time.ReadablePartial) localDateTime7, intArray25);
        org.joda.time.DateTimeField dateTimeField27 = chronology4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.hourOfDay();
        int int31 = localDateTime29.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withDate(6, (int) (short) 10, 15);
        org.joda.time.LocalDateTime.Property property36 = localDateTime29.yearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfEvenCopy();
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.lang.String str39 = locale38.getISO3Language();
        java.lang.String str40 = locale38.getDisplayCountry();
        java.lang.String str41 = dateTimeField27.getAsText((org.joda.time.ReadablePartial) localDateTime37, locale38);
        java.util.Date date42 = localDateTime37.toDate();
        int int43 = date42.getDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 365 + "'", int17 == 365);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 365 + "'", int22 == 365);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 365 + "'", int31 == 365);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "deu" + "'", str39, "deu");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u5fb7\u56fd" + "'", str40, "\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test22131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22131");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Jun 26, 4212 12:00:00 AM");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test22132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22132");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate5 = property4.withMaximumValue();
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra(15);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        java.lang.String str15 = dateTimeZone12.getShortName((long) 32772);
        java.lang.String str17 = dateTimeZone12.getName((long) 26275);
        org.joda.time.DateTime dateTime18 = localDate10.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.LocalDate localDate20 = localDate10.plusYears(26225);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        long long27 = dateTimeZone22.convertLocalToUTC((long) ' ', false, 530L);
        java.lang.String str29 = dateTimeZone22.getShortName((long) 'u');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long32 = dateTimeZone22.convertUTCToLocal((-1104364800000L));
        org.joda.time.Interval interval33 = localDate10.toInterval(dateTimeZone22);
        java.lang.String str35 = dateTimeZone22.getShortName((long) 26293);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight37 = localDate9.toDateMidnight(dateTimeZone22);
        long long39 = dateTimeZone22.nextTransition(272770L);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis(26571111);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1104364800000L) + "'", long32 == (-1104364800000L));
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 272770L + "'", long39 == 272770L);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test22133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22133");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test22134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22134");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears(26168842);
        org.joda.time.DateTime dateTime10 = dateTime3.plusDays(26303);
        org.joda.time.Instant instant11 = dateTime3.toInstant();
        org.joda.time.ReadableInstant readableInstant12 = null;
        boolean boolean13 = instant11.isAfter(readableInstant12);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22135");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("hours");
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale locale5 = builder1.build();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setLanguageTag("07:25:44.194");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 07:25:44.194 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test22136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22136");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime6 = localTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(8);
        org.joda.time.LocalTime.Property property9 = localTime6.secondOfMinute();
        org.joda.time.Chronology chronology10 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfYear();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology10);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        java.lang.String str19 = dateTimeZone16.getShortName((long) 32772);
        long long21 = dateTimeZone16.previousTransition((long) (byte) 100);
        java.util.Locale locale26 = new java.util.Locale("\u65e5\u672c\u8a9e", "20", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str27 = dateTimeZone16.getShortName((long) 31, locale26);
        org.joda.time.DateTime dateTime28 = localTime13.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime.Property property29 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime31 = localTime13.withMillisOfDay(26263278);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYear(56);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours(26393968);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) 26281705);
        boolean boolean42 = localDateTime39.equals((java.lang.Object) instant41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.minusWeeks(8661);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = localTime31.compareTo((org.joda.time.ReadablePartial) localDateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "\u65e5\u672c\u8a9e\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test22137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22137");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.clockhourOfHalfday();
        int int7 = dateTimeField6.getMaximumValue();
        int int8 = dateTimeField6.getMaximumValue();
        int int9 = dateTimeField6.getMaximumValue();
        boolean boolean10 = dateTimeField6.isLenient();
        int int12 = dateTimeField6.getMaximumValue(864000000L);
        java.lang.String str14 = dateTimeField6.getAsShortText((long) 26634);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "12" + "'", str14, "12");
    }

    @Test
    public void test22138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22138");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (-25262), (-1));
        java.util.Calendar.Builder builder8 = builder4.setDate(26178, 8, 14);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        boolean boolean14 = timeZone11.observesDaylightTime();
        java.util.Calendar.Builder builder15 = builder8.setTimeZone(timeZone11);
        java.util.Calendar.Builder builder19 = builder8.setWeekDate(365, (-2600), 436);
        java.util.Calendar.Builder builder23 = builder19.setWeekDate(26397, 26248, 26180);
        java.util.Calendar.Builder builder27 = builder23.setDate(26238, 529, 26168398);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        boolean boolean31 = timeZone30.observesDaylightTime();
        int int32 = timeZone30.getRawOffset();
        java.util.Calendar.Builder builder33 = builder27.setTimeZone(timeZone30);
        java.util.Calendar.Builder builder35 = builder27.setLenient(true);
        java.util.Calendar.Builder builder39 = builder27.setTimeOfDay(26428, 26616423, 296);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test22139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22139");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime15 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property16 = dateTime15.centuryOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        int int19 = property17.getLeapAmount();
        org.joda.time.DateTime dateTime20 = property17.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test22140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22140");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear(35);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMonths(26427);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test22141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22141");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        java.util.Date date2 = localDate0.toDate();
        int int3 = localDate0.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test22142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22142");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(183);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(26453);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test22143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale4 = new java.util.Locale("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.Chronology chronology8 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter2.getZone();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        int int14 = localDateTime12.getDayOfYear();
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withPeriodAdded(readablePeriod24, 26163);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = localDateTime26.toString(dateTimeFormatter27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        int int30 = localDateTime26.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withPeriodAdded(readablePeriod31, 1);
        long long35 = chronology15.set((org.joda.time.ReadablePartial) localDateTime33, (long) 26196657);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter2.withChronology(chronology15);
        org.joda.time.Chronology chronology37 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter2.withDefaultYear(26207);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.hourOfDay();
        int int44 = localDateTime42.getDayOfYear();
        org.joda.time.Chronology chronology45 = localDateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfEra();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(0L, chronology45);
        org.joda.time.DurationField durationField48 = chronology45.weeks();
        org.joda.time.Chronology chronology49 = chronology45.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter2.withChronology(chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter50.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = dateTimeFormatter50.parseLocalTime("-1016-09-13T14:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 365 + "'", int14 == 365);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T00:00:00.001" + "'", str28, "1970-01-01T00:00:00.001");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 365 + "'", int44 == 365);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
    }

    @Test
    public void test22144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22144");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.minusDays(52);
        org.joda.time.LocalDate localDate8 = localDate0.withYear(436);
        int int9 = localDate0.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate0.withEra(26349);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26349 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test22145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22145");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfMinute();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        long long14 = dateTimeField12.roundFloor((long) (byte) 10);
        java.lang.String str15 = dateTimeField12.getName();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime24 = dateTime20.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        java.util.Locale locale26 = java.util.Locale.PRC;
        boolean boolean27 = dateTime24.equals((java.lang.Object) locale26);
        java.lang.String str28 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) localTime18, locale26);
        java.util.Calendar calendar29 = dateTime5.toCalendar(locale26);
        org.joda.time.DateMidnight dateMidnight30 = dateTime5.toDateMidnight();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        int int33 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime32);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.toString();
        long long40 = dateTimeZone35.convertLocalToUTC((long) ' ', false, 530L);
        long long43 = dateTimeZone35.adjustOffset((long) '#', true);
        org.joda.time.DateTime dateTime44 = dateTime32.withZone(dateTimeZone35);
        int int46 = dateTimeZone35.getStandardOffset(339L);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondOfMinute" + "'", str15, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645601160803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=54,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=0,MILLISECOND=803,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test22146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22146");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getDayOfYear();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withChronology(chronology14);
        boolean boolean19 = dateTimeFormatter18.isOffsetParsed();
        boolean boolean20 = dateTimeFormatter18.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22147");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundHalfFloorCopy();
        int int6 = localDate5.size();
        org.joda.time.Chronology chronology7 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval12 = localDate9.toInterval();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate9.minus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate9.withDayOfYear(4);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute((int) (short) 0);
        int int23 = localDateTime22.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int25 = localDateTime22.get(dateTimeFieldType24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusMonths(26182);
        int[] intArray28 = localDateTime22.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField8.add((org.joda.time.ReadablePartial) localDate9, 26475227, intArray28, 26553);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26475227");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 70 + "'", int25 == 70);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1970, 1, 1, 1]");
    }

    @Test
    public void test22148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22148");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        int int8 = localDateTime6.getYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1969 + "'", int8 == 1969);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test22149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22149");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (-292275054));
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis((-37985));
        int int4 = localTime1.getHourOfDay();
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond(399);
        org.joda.time.LocalTime localTime8 = localTime1.plusSeconds(26392896);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime1.getFieldType(26404722);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26404722");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test22150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22150");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        int int9 = localDateTime7.getDayOfYear();
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        int[] intArray12 = chronology5.get((org.joda.time.ReadablePartial) localDateTime7, (long) 1);
        org.joda.time.DateTimeField dateTimeField13 = chronology5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int[] intArray17 = chronology5.get((org.joda.time.ReadablePartial) localDateTime15, (long) 8);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(0L, chronology5);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1970, 1, 1, 8]");
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test22151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22151");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        java.util.TimeZone timeZone11 = dateTimeZone9.toTimeZone();
        timeZone11.setID("Etc/UTC");
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone11, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.lang.String str19 = locale17.getScript();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        long long27 = dateTimeField25.roundFloor((long) (byte) 10);
        long long29 = dateTimeField25.roundHalfCeiling((long) '#');
        java.lang.String str30 = dateTimeField25.getName();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        boolean boolean35 = localDateTime32.equals((java.lang.Object) "");
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.minus(readableDuration36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withWeekOfWeekyear(4);
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.lang.String str41 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime37, locale40);
        java.lang.String str42 = locale17.getDisplayCountry(locale40);
        java.util.Locale.Builder builder43 = builder7.setLocale(locale40);
        java.util.Locale.Builder builder44 = builder43.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645514760877,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=0,MILLISECOND=877,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "secondOfMinute" + "'", str30, "secondOfMinute");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test22152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22152");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(100);
        org.joda.time.Interval interval5 = localDate2.toInterval();
        int int6 = localDate2.getMonthOfYear();
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime7);
        int int9 = localDate2.size();
        int int10 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate2.plusDays(366);
        org.joda.time.LocalDate localDate14 = localDate2.plusYears(26334);
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDate localDate17 = property15.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test22153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22153");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZone(dateTimeZone9);
        boolean boolean11 = dateTimeFormatter4.isPrinter();
        int int12 = dateTimeFormatter4.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter4.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 26338);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test22154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22154");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime.Property property4 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime6 = property4.addToCopy((long) 220);
        org.joda.time.DateTime dateTime7 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime8 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime9 = property4.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26760 + "'", int3 == 26760);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test22155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        int int14 = dateTime10.get(dateTimeFieldType11);
        int int15 = dateTime10.getMonthOfYear();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime18 = property2.addToCopy((long) 26168398);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy(2023);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        int int30 = dateTime29.getEra();
        int int31 = dateTime29.getSecondOfDay();
        org.joda.time.DateTime dateTime33 = dateTime29.minusMonths((int) 'a');
        boolean boolean34 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime27.minus(readableDuration35);
        org.joda.time.DateTime dateTime37 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.plusDays(98931);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "clockhourOfHalfday" + "'", str13, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 26760 + "'", int31 == 26760);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test22156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (short) 100);
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(8);
        org.joda.time.LocalTime localTime9 = localTime5.minusMillis(14);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localTime5.getFields();
        org.joda.time.LocalTime localTime12 = localTime5.minusHours(32772);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime12.minus(readablePeriod15);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test22157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22157");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.LocalTime localTime8 = localTime6.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property9 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(53);
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime13 = property9.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (org.joda.time.ReadablePartial) localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test22158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22158");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfYear(12);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusYears(7);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.monthOfYear();
        java.lang.String str7 = property6.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        int int13 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.minusMonths((int) 'a');
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withPeriodAdded(readablePeriod24, 26163);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime19.plusMillis(7);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusSeconds(26164);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int32 = localDateTime28.get(dateTimeFieldType31);
        int int33 = dateTime15.get(dateTimeFieldType31);
        org.joda.time.DateTime dateTime35 = dateTime15.minusMinutes((int) (byte) 0);
        int int36 = property6.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime38 = property6.addToCopy(8661);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        int int40 = localDateTime38.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfDay(26554);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26760 + "'", int13 == 26760);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 285 + "'", int40 == 285);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test22159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22159");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int4 = date3.getTimezoneOffset();
        date3.setMonth((int) '#');
        int int7 = date3.getMonth();
        date3.setSeconds(26166);
        date3.setSeconds((int) (short) 0);
        int int12 = date3.getMinutes();
        int int13 = date3.getHours();
        int int14 = date3.getDate();
        java.util.Date date18 = new java.util.Date(10, (int) (byte) -1, (-1));
        date18.setHours((int) (byte) 0);
        int int21 = date18.getHours();
        int int22 = date18.getDate();
        java.time.Instant instant23 = date18.toInstant();
        boolean boolean24 = date3.after(date18);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Dec 29 00:00:00 UTC 1911");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Nov 29 00:00:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test22160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22160");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime5.plusWeeks(23);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.plus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime5.minusWeeks(26371);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (short) 100);
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis(8);
        org.joda.time.LocalTime.Property property22 = localTime19.secondOfMinute();
        org.joda.time.Chronology chronology23 = localTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfYear();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology23);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now(chronology23);
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.lang.String str32 = dateTimeZone29.getShortName((long) 32772);
        long long34 = dateTimeZone29.previousTransition((long) (byte) 100);
        java.util.Locale locale39 = new java.util.Locale("\u65e5\u672c\u8a9e", "20", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str40 = dateTimeZone29.getShortName((long) 31, locale39);
        org.joda.time.DateTime dateTime41 = localTime26.toDateTimeToday(dateTimeZone29);
        org.joda.time.LocalTime.Property property42 = localTime26.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property42.getFieldType();
        int int44 = dateTime12.get(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "\u65e5\u672c\u8a9e\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
    }

    @Test
    public void test22161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22161");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMillis(7);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        int int17 = localDateTime15.getDayOfYear();
        org.joda.time.Chronology chronology18 = localDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(0L, chronology18);
        org.joda.time.DurationField durationField21 = chronology18.weeks();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime12.toMutableDateTime(chronology18);
        int int23 = dateTime12.getMinuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime12.withYearOfEra(2306332);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 365 + "'", int17 == 365);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test22162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22162");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.year();
        org.joda.time.Chronology chronology7 = chronology4.withUTC();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        int int18 = localDateTime16.getDayOfYear();
        org.joda.time.Chronology chronology19 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plus(readableDuration27);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.hourOfDay();
        int int32 = localDateTime30.getDayOfYear();
        org.joda.time.Chronology chronology33 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        int int37 = localDateTime35.getDayOfYear();
        org.joda.time.Chronology chronology38 = localDateTime35.getChronology();
        int[] intArray40 = chronology33.get((org.joda.time.ReadablePartial) localDateTime35, (long) 1);
        chronology19.validate((org.joda.time.ReadablePartial) localDateTime22, intArray40);
        chronology4.validate((org.joda.time.ReadablePartial) localDateTime14, intArray40);
        org.joda.time.DateTimeField dateTimeField43 = chronology4.monthOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = null;
        org.joda.time.format.DateTimeParser dateTimeParser46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter45, dateTimeParser46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withPivotYear(35);
        int int50 = dateTimeFormatter47.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter47.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter52.withOffsetParsed();
        java.util.Locale locale56 = new java.util.Locale("8", "Chinese");
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.lang.String str59 = locale58.getISO3Country();
        java.util.Locale.Builder builder60 = new java.util.Locale.Builder();
        java.util.Locale locale61 = builder60.build();
        java.lang.String str62 = locale58.getDisplayCountry(locale61);
        java.lang.String str63 = locale56.getDisplayScript(locale61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter52.withLocale(locale56);
        java.lang.String str65 = locale56.getDisplayVariant();
        java.lang.String str66 = dateTimeField43.getAsShortText(1645514190095L, locale56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 365 + "'", int32 == 365);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 365 + "'", int37 == 365);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2000 + "'", int50 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertEquals(locale56.toString(), "8_CHINESE");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Feb" + "'", str66, "Feb");
    }

    @Test
    public void test22163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22163");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        java.lang.String str6 = dateTimeZone4.getID();
        boolean boolean7 = dateTimeZone4.isFixed();
        java.util.TimeZone timeZone8 = dateTimeZone4.toTimeZone();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str10 = locale9.getCountry();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale9);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone8, locale9);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (short) 100);
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis(8);
        org.joda.time.LocalTime localTime23 = localTime19.minusMillis(14);
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfSecond();
        org.joda.time.LocalTime localTime25 = property24.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime27 = property24.addCopy(0);
        org.joda.time.LocalTime localTime28 = property24.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime29 = property24.roundCeilingCopy();
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale30.getScript();
        java.lang.String str34 = property24.getAsText(locale30);
        java.lang.String str35 = locale9.getDisplayScript(locale30);
        java.util.Locale.Builder builder36 = builder2.setLocale(locale30);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TW" + "'", str10, "TW");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645514761068,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=68,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645514761068,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=68,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645514761068,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=68,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "86" + "'", str34, "86");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test22164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22164");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(53);
        org.joda.time.LocalTime localTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = property5.addWrapFieldToCopy(32769);
        org.joda.time.LocalTime localTime11 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property5.roundHalfEvenCopy();
        org.joda.time.DurationField durationField13 = property5.getDurationField();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22165");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMinutes((int) 'u');
        int int7 = localDateTime5.getValue(2);
        java.util.Date date8 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minusDays(32780);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(436);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        int int14 = localDateTime12.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withYearOfEra(32);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        int int21 = localDateTime19.getDayOfYear();
        org.joda.time.Chronology chronology22 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 26173, chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.yearOfEra();
        org.joda.time.DurationField durationField27 = chronology22.weekyears();
        org.joda.time.DurationFieldType durationFieldType28 = durationField27.getType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime34 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getEra();
        int int38 = dateTime36.getSecondOfDay();
        org.joda.time.DateTime dateTime40 = dateTime36.minusMonths((int) 'a');
        boolean boolean41 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        boolean boolean43 = durationFieldType28.isSupported(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        int int47 = localDateTime45.getDayOfYear();
        org.joda.time.Chronology chronology48 = localDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.hourOfDay();
        org.joda.time.DurationField durationField51 = chronology48.weekyears();
        boolean boolean52 = durationFieldType28.isSupported(chronology48);
        boolean boolean53 = localDateTime12.isSupported(durationFieldType28);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime12.minusDays(8854920);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:56:59 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 365 + "'", int21 == 365);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 26761 + "'", int38 == 26761);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 365 + "'", int47 == 365);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test22166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22166");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (short) 100);
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(8);
        org.joda.time.LocalTime localTime9 = localTime5.minusMillis(14);
        org.joda.time.LocalTime localTime11 = localTime9.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime15 = localTime11.withMillisOfDay(29);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology17);
        org.joda.time.LocalTime localTime20 = localTime18.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property21 = localTime18.millisOfDay();
        org.joda.time.LocalTime localTime23 = property21.setCopy(5);
        org.joda.time.LocalTime localTime25 = property21.addCopy((long) 26168398);
        java.lang.String str26 = localTime25.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime32 = localTime29.withPeriodAdded(readablePeriod30, (int) (short) 100);
        org.joda.time.LocalTime localTime34 = localTime32.plusMillis(8);
        org.joda.time.LocalTime localTime36 = localTime32.minusMillis(14);
        org.joda.time.LocalTime localTime38 = localTime36.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime40 = localTime36.minusHours(29);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.minus(readablePeriod43);
        org.joda.time.DateTime dateTime46 = dateTime44.minusMonths(26164319);
        boolean boolean47 = dateTime46.isEqualNow();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        int int50 = dateTime49.getEra();
        org.joda.time.DateTime.Property property51 = dateTime49.secondOfMinute();
        org.joda.time.DateTime dateTime53 = dateTime49.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getDurationType();
        java.lang.String str56 = dateTimeFieldType54.toString();
        int int57 = dateTime53.get(dateTimeFieldType54);
        org.joda.time.DateTime dateTime59 = dateTime53.withYearOfCentury(17);
        boolean boolean60 = dateTime46.isEqual((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = dateTime46.toDateTime();
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.fromMillisOfDay(1645488000100L);
        int int64 = localTime63.size();
        org.joda.time.LocalTime localTime66 = localTime63.minusMinutes(26166);
        org.joda.time.LocalTime.Property property67 = localTime66.minuteOfHour();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        int int70 = dateTime69.getEra();
        org.joda.time.DateTime.Property property71 = dateTime69.secondOfMinute();
        org.joda.time.DateTime dateTime73 = dateTime69.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getDurationType();
        java.lang.String str76 = dateTimeFieldType74.toString();
        int int77 = dateTime73.get(dateTimeFieldType74);
        int int78 = localTime66.get(dateTimeFieldType74);
        int int79 = dateTime61.get(dateTimeFieldType74);
        boolean boolean80 = localTime40.isSupported(dateTimeFieldType74);
        org.joda.time.DurationFieldType durationFieldType81 = org.joda.time.DurationFieldType.years();
        boolean boolean82 = localTime40.isSupported(durationFieldType81);
        boolean boolean83 = localTime25.isSupported(durationFieldType81);
        boolean boolean84 = localTime15.isSupported(durationFieldType81);
        int int85 = localTime15.size();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "07:16:08.498" + "'", str26, "07:16:08.498");
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "clockhourOfHalfday" + "'", str56, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 7 + "'", int57 == 7);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "clockhourOfHalfday" + "'", str76, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 7 + "'", int77 == 7);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 7 + "'", int78 == 7);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 7 + "'", int79 == 7);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
    }

    @Test
    public void test22167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22167");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(6);
        org.joda.time.LocalDate localDate10 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(59);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra(100);
        org.joda.time.LocalTime localTime18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTime(localTime18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekOfWeekyear();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property22.getFieldType();
        org.joda.time.LocalDate.Property property26 = localDate12.property(dateTimeFieldType25);
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        int int28 = localDate27.getCenturyOfEra();
        org.joda.time.LocalDate localDate30 = localDate27.plusYears(26367);
        org.joda.time.LocalDate localDate32 = localDate27.withYear(26677);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property34 = localDate33.centuryOfEra();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.LocalDate localDate36 = property34.roundCeilingCopy();
        org.joda.time.LocalDate localDate37 = property34.withMinimumValue();
        org.joda.time.LocalDate localDate39 = localDate37.withCenturyOfEra(100);
        org.joda.time.LocalDate.Property property40 = localDate37.monthOfYear();
        org.joda.time.LocalDate localDate41 = property40.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate42 = property40.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property43 = localDate42.monthOfYear();
        org.joda.time.LocalDate localDate45 = property43.addToCopy(36);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate48 = localDate46.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra(100);
        org.joda.time.LocalDate localDate52 = localDate48.minusWeeks(13);
        int int53 = localDate52.getYearOfCentury();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int57 = dateTime55.get(dateTimeFieldType56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime55.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime59 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(chronology60);
        int int62 = dateTime61.getEra();
        int int63 = dateTime61.getSecondOfDay();
        org.joda.time.DateTime dateTime65 = dateTime61.minusMonths((int) 'a');
        boolean boolean66 = dateTime59.isEqual((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime.Property property67 = dateTime59.year();
        org.joda.time.DateTime dateTime68 = property67.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime68.getZone();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((java.lang.Object) localDate52, dateTimeZone69);
        org.joda.time.DateMidnight dateMidnight71 = localDate45.toDateMidnight(dateTimeZone69);
        long long73 = dateTimeZone69.nextTransition((long) 26623748);
        org.joda.time.DateTime dateTime74 = localDate32.toDateTimeAtMidnight(dateTimeZone69);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 22 + "'", int53 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 7 + "'", int57 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 26761 + "'", int63 == 26761);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 26623748L + "'", long73 == 26623748L);
        org.junit.Assert.assertNotNull(dateTime74);
    }

    @Test
    public void test22168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22168");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.clear();
        calendar0.clear();
        calendar0.setMinimalDaysInFirstWeek((int) (short) 1);
        java.time.Instant instant8 = calendar0.toInstant();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int10 = localDate9.getYearOfCentury();
        java.util.Date date11 = localDate9.toDate();
        date11.setYear(26283);
        int int14 = date11.getTimezoneOffset();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Jan 01 00:00:00 UTC 28183");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test22169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22169");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy(26196);
        org.joda.time.LocalDateTime localDateTime9 = property5.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test22170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22170");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTimeISO();
        int int9 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        boolean boolean10 = dateTime1.isAfterNow();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, (int) (short) 100);
        org.joda.time.LocalTime localTime18 = localTime16.plusMillis(8);
        org.joda.time.LocalTime localTime20 = localTime16.minusMillis(14);
        org.joda.time.LocalTime localTime22 = localTime20.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime26 = localTime22.withMillisOfDay(29);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime1.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology27.millis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(26393968);
        org.joda.time.Chronology chronology33 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField34 = chronology33.centuries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test22171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22171");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(1677050183401L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int5 = dateTime3.get(dateTimeFieldType4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getEra();
        int int11 = dateTime9.getSecondOfDay();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMonths((int) 'a');
        boolean boolean14 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property15 = dateTime7.year();
        org.joda.time.DateTime dateTime17 = property15.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime17.minusHours(52);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.LocalTime localTime24 = localTime1.withField(dateTimeFieldType21, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType25, 26202, 26166, 26204714);
        boolean boolean30 = localTime1.isSupported(dateTimeFieldType25);
        org.joda.time.LocalTime localTime32 = localTime1.plusMinutes(26172);
        org.joda.time.LocalTime.Property property33 = localTime32.millisOfDay();
        org.joda.time.LocalTime.Property property34 = localTime32.secondOfMinute();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(100);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTime(localTime40);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime.Property property44 = dateTime43.weekOfWeekyear();
        org.joda.time.DateTime dateTime46 = dateTime43.plusSeconds(38);
        org.joda.time.DateTime dateTime48 = dateTime43.minusYears(26250);
        org.joda.time.DateTime dateTime50 = dateTime48.plusMinutes((int) '#');
        org.joda.time.DateTime dateTime52 = dateTime48.plusSeconds(685340037);
        int int53 = dateTime52.getDayOfWeek();
        org.joda.time.DateTime dateTime55 = dateTime52.plusSeconds((int) 'a');
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int59 = dateTime57.get(dateTimeFieldType58);
        boolean boolean60 = dateTime55.isSupported(dateTimeFieldType58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime62 = localTime32.withField(dateTimeFieldType58, 26718800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26718800 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26761 + "'", int11 == 26761);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1200 + "'", int22 == 1200);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 7 + "'", int59 == 7);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test22172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22172");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        int int11 = dateTimeField8.get((long) 26275);
        long long14 = dateTimeField8.addWrapField((long) 26183, 26147298);
        long long16 = dateTimeField8.remainder((long) 97970);
        long long18 = dateTimeField8.roundHalfCeiling((long) (-19013));
        long long21 = dateTimeField8.add((long) 335, 26406);
        boolean boolean22 = dateTimeField8.isSupported();
        int int23 = dateTimeField8.getMinimumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 64826183L + "'", long14 == 64826183L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97970L + "'", long16 == 97970L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 95061600335L + "'", long21 == 95061600335L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test22173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22173");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMonths(26197);
        int int8 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withYear((-18992));
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.plusDays(26227289);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime5.getValue(26694);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26694");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test22174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22174");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfEra();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval8 = localDate5.toInterval();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate5.minus(readablePeriod9);
        org.joda.time.LocalDate localDate12 = localDate5.withDayOfYear(4);
        org.joda.time.LocalDate localDate14 = localDate12.withYear((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        java.lang.String str17 = dateTimeFieldType15.toString();
        org.joda.time.LocalDate.Property property18 = localDate3.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property19 = localDate3.dayOfWeek();
        org.joda.time.LocalDate localDate21 = localDate3.minusWeeks(153);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "dayOfYear" + "'", str17, "dayOfYear");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test22175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22175");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (short) 100);
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(8);
        org.joda.time.LocalTime localTime9 = localTime5.minusMillis(14);
        org.joda.time.LocalTime localTime11 = localTime9.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime15 = localTime11.withMillisOfDay(29);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.LocalTime.Property property17 = localTime11.minuteOfHour();
        java.lang.String str18 = localTime11.toString();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "23:58:20.086" + "'", str18, "23:58:20.086");
    }

    @Test
    public void test22176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22176");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusDays(1970);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra(100);
        org.joda.time.LocalTime localTime18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTime(localTime18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekOfWeekyear();
        int int23 = dateTime21.getDayOfMonth();
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.lang.String str25 = locale24.getISO3Language();
        java.util.Calendar calendar26 = dateTime21.toCalendar(locale24);
        java.lang.String str27 = locale24.getDisplayVariant();
        java.util.Set<java.lang.String> strSet28 = locale24.getUnicodeLocaleAttributes();
        org.joda.time.tz.NameProvider nameProvider29 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.lang.String str34 = nameProvider29.getName(locale30, "3", "hours");
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str38 = nameProvider29.getName(locale35, "57", "");
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.lang.String str42 = nameProvider29.getName(locale39, "100", "24");
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("2022-02-22T07:16:28.351Z");
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate47 = localDate45.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval48 = localDate45.toInterval();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate45.minus(readablePeriod49);
        org.joda.time.LocalDate.Property property51 = localDate45.era();
        boolean boolean52 = property51.isLeap();
        org.joda.time.LocalDate localDate54 = property51.addWrapFieldToCopy(6);
        org.joda.time.LocalDate localDate55 = property51.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property56 = localDate55.yearOfEra();
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate59 = localDate57.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval60 = localDate57.toInterval();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDate localDate62 = localDate57.minus(readablePeriod61);
        org.joda.time.LocalDate localDate64 = localDate57.withDayOfYear(4);
        org.joda.time.LocalDate localDate66 = localDate64.withYear((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean68 = localDate64.isSupported(dateTimeFieldType67);
        org.joda.time.LocalDate.Property property69 = localDate64.yearOfEra();
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Locale locale73 = locale72.stripExtensions();
        org.joda.time.LocalDate localDate74 = property69.setCopy("30", locale72);
        int int75 = property56.getMaximumShortTextLength(locale72);
        java.lang.String str76 = locale44.getDisplayLanguage(locale72);
        java.lang.String str79 = nameProvider29.getShortName(locale44, "Donnerstag", "6");
        java.lang.String str80 = locale24.getDisplayName(locale44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime81 = property11.setCopy("2025-01-22T00:00:34.123Z", locale44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2025-01-22T00:00:34.123Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "deu" + "'", str25, "deu");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=-59002905599990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=102,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(nameProvider29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italian" + "'", str31, "Italian");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "German (Germany)" + "'", str80, "German (Germany)");
    }

    @Test
    public void test22177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22177");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.LocalTime localTime11 = localTime9.withMinuteOfHour(15);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime11.plus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime14.minusHours(24);
        org.joda.time.LocalTime localTime18 = localTime16.plusMinutes((-26168841));
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property21 = localDate20.centuryOfEra();
        int int22 = localDate20.getDayOfMonth();
        org.joda.time.LocalDate.Property property23 = localDate20.centuryOfEra();
        org.joda.time.LocalDate localDate24 = property23.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test22178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22178");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        java.lang.String str9 = localDateTime1.toString();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minus(readablePeriod10);
        int int12 = localDateTime1.getYearOfCentury();
        int int13 = localDateTime1.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime1.withPeriodAdded(readablePeriod14, 26208);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        int int21 = localDateTime19.getDayOfYear();
        org.joda.time.Chronology chronology22 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear(56);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getEra();
        org.joda.time.DateTime.Property property33 = dateTime31.secondOfMinute();
        java.lang.String str34 = property33.getAsText();
        org.joda.time.DateTimeField dateTimeField35 = property33.getField();
        long long37 = dateTimeField35.roundFloor((long) (byte) 10);
        java.lang.String str38 = dateTimeField35.getName();
        java.lang.String str39 = dateTimeField35.toString();
        long long42 = dateTimeField35.add((long) 1, 0L);
        int int44 = dateTimeField35.getMinimumValue((long) 26170);
        java.util.Locale locale47 = new java.util.Locale("+00:00");
        java.lang.String str48 = dateTimeField35.getAsText((long) 0, locale47);
        long long50 = dateTimeField35.roundFloor((long) 220);
        long long52 = dateTimeField35.roundHalfFloor((long) 835);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property60 = localDateTime56.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.plus(readableDuration61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusHours(100);
        int[] intArray65 = localDateTime62.getValues();
        int[] intArray67 = dateTimeField35.addWrapPartial(readablePartial53, 20, intArray65, 0);
        chronology22.validate((org.joda.time.ReadablePartial) localDateTime26, intArray65);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime26.withDurationAdded(readableDuration69, 261643);
        org.joda.time.LocalDateTime.Property property72 = localDateTime26.millisOfDay();
        org.joda.time.Chronology chronology73 = localDateTime26.getChronology();
        int int74 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime26.minusYears(2032);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:00.001" + "'", str9, "1970-01-01T00:00:00.001");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 365 + "'", int21 == 365);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "secondOfMinute" + "'", str38, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "DateTimeField[secondOfMinute]" + "'", str39, "DateTimeField[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals(locale47.toString(), "+00:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1000L + "'", long52 == 1000L);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(localDateTime76);
    }

    @Test
    public void test22179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22179");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        boolean boolean6 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property9 = localDate8.centuryOfEra();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.LocalDate localDate11 = property9.roundHalfEvenCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readablePeriod14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) localDate11, dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter7.withZone(dateTimeZone18);
        java.util.Date date26 = new java.util.Date(15, (int) '4', 26167, (int) (short) 1, 26167);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter7.withChronology(chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter7.withDefaultYear(26221041);
        java.io.Writer writer33 = null;
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property35 = localDate34.centuryOfEra();
        org.joda.time.LocalDate localDate36 = property35.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate38 = property35.setCopy("24");
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate41 = localDate39.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra(100);
        org.joda.time.LocalTime localTime44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTime(localTime44);
        org.joda.time.DateTime dateTime47 = dateTime45.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime dateTime48 = localDate38.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer33, (org.joda.time.ReadablePartial) localDate38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals(date26.toString(), "Mon Jan 07 05:07:00 UTC 1991");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test22180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22180");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 2032);
        org.joda.time.Instant instant4 = instant0.minus((long) 26206);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, (int) (short) 100);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis(8);
        org.joda.time.LocalTime.Property property14 = localTime11.secondOfMinute();
        org.joda.time.Chronology chronology15 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfYear();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology15);
        org.joda.time.DateTime dateTime18 = instant4.toDateTime(chronology15);
        org.joda.time.Instant instant19 = instant4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime20 = instant4.toMutableDateTime();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test22181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22181");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.minusDays((int) (byte) 100);
        org.joda.time.DateTime dateTime15 = dateTime10.plusMinutes(3);
        org.joda.time.DateTime dateTime17 = dateTime15.withEra(0);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes(26332);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMonths(67);
        boolean boolean24 = dateTime22.isAfter((long) 26508);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22182");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime8 = localTime5.withPeriodAdded(readablePeriod6, (int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis(8);
        org.joda.time.LocalTime.Property property11 = localTime8.secondOfMinute();
        org.joda.time.Chronology chronology12 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfYear();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology12);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.minutes();
        org.joda.time.DurationField durationField17 = chronology12.hours();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar1, chronology12);
        calendar1.set(26550666, 26633, 26468);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=26550666,MONTH=26633,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=26468,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=492,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test22183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22183");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(53);
        org.joda.time.LocalTime localTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.Interval interval9 = property5.toInterval();
        org.joda.time.LocalTime localTime10 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime12 = property5.addNoWrapToCopy(26340);
        org.joda.time.LocalTime.Property property13 = localTime12.hourOfDay();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test22184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22184");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        int[] intArray11 = chronology4.get((org.joda.time.ReadablePartial) localDateTime6, (long) 1);
        org.joda.time.DateTimeField dateTimeField12 = chronology4.dayOfWeek();
        long long15 = dateTimeField12.addWrapField((long) ' ', (int) (short) 0);
        int int18 = dateTimeField12.getDifference((long) 26194, (-765065162809000L));
        boolean boolean20 = dateTimeField12.isLeap((long) (-1898));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8854920 + "'", int18 == 8854920);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "12");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("2022");
        java.util.Locale.Builder builder7 = builder0.setScript("");
        java.util.Locale.Builder builder9 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder10 = builder0.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setExtension('a', "26259082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setLanguage("1352");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1352 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test22186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22186");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        int int8 = dateTime5.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26761 + "'", int3 == 26761);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test22187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22187");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        int[] intArray11 = chronology4.get((org.joda.time.ReadablePartial) localDateTime6, (long) 1);
        org.joda.time.DateTimeField dateTimeField12 = chronology4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int[] intArray16 = chronology4.get((org.joda.time.ReadablePartial) localDateTime14, (long) 8);
        org.joda.time.DateTimeField dateTimeField17 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology4.weekyear();
        org.joda.time.DurationField durationField19 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology4.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = chronology4.get(readablePeriod22, 1983153690000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1970, 1, 1, 8]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test22188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22188");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (-25262), (-1));
        java.util.Calendar.Builder builder8 = builder4.setDate(26178, 8, 14);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        boolean boolean14 = timeZone11.observesDaylightTime();
        java.util.Calendar.Builder builder15 = builder8.setTimeZone(timeZone11);
        java.util.Calendar.Builder builder19 = builder8.setWeekDate(365, (-2600), 436);
        java.util.Calendar.Builder builder24 = builder19.setTimeOfDay(26388823, 58, 26205, 26226);
        java.util.Calendar.Builder builder28 = builder24.setWeekDate(26673549, 26257, 26449);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime34 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getEra();
        int int38 = dateTime36.getSecondOfDay();
        org.joda.time.DateTime dateTime40 = dateTime36.minusMonths((int) 'a');
        boolean boolean41 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTime.Property property43 = dateTime34.dayOfMonth();
        org.joda.time.DateTime dateTime44 = property43.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology45 = dateTime44.getChronology();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.minus(readablePeriod49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((java.lang.Object) 1645514178685L, dateTimeZone53);
        org.joda.time.Chronology chronology55 = chronology45.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField56 = chronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology45.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((java.lang.Object) 26257, chronology45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 26761 + "'", int38 == 26761);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test22189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22189");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime8.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(26164319);
        boolean boolean20 = dateTime16.isEqual((long) 0);
        org.joda.time.DateTime.Property property21 = dateTime16.monthOfYear();
        int int22 = property21.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22190");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField7 = dateTimeField6.getRangeDurationField();
        long long10 = dateTimeField6.getDifferenceAsLong((-2182719659000L), 1L);
        java.lang.String str11 = dateTimeField6.toString();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        int int14 = timeZone13.getRawOffset();
        timeZone13.setID("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        boolean boolean17 = timeZone13.observesDaylightTime();
        boolean boolean18 = timeZone13.observesDaylightTime();
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone13, locale19);
        java.lang.String str22 = locale19.getDisplayName();
        java.lang.String str23 = dateTimeField6.getAsShortText(32772, locale19);
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-606311L) + "'", long10 == (-606311L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateTimeField[hourOfDay]" + "'", str11, "DateTimeField[hourOfDay]");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "deu" + "'", str20, "deu");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=608,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "German (Germany)" + "'", str22, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32772" + "'", str23, "32772");
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test22191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22191");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        int int8 = dateTime5.getMillisOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withFields(readablePartial9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.addToCopy(9581615);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26761 + "'", int3 == 26761);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26761627 + "'", int8 == 26761627);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test22192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22192");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        boolean boolean8 = property6.isLeap();
        int int9 = property6.getMaximumValue();
        org.joda.time.LocalDate localDate10 = property6.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.plus(readablePeriod11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test22193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22193");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTimeISO();
        int int9 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        boolean boolean10 = dateTime1.isAfterNow();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, (int) (short) 100);
        org.joda.time.LocalTime localTime18 = localTime16.plusMillis(8);
        org.joda.time.LocalTime localTime20 = localTime16.minusMillis(14);
        org.joda.time.LocalTime localTime22 = localTime20.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime26 = localTime22.withMillisOfDay(29);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime1.toDateTime(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime1.toMutableDateTimeISO();
        int int31 = mutableDateTime30.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = mutableDateTime30.toString("2022-02-22T07:24:51.052Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 26761 + "'", int31 == 26761);
    }

    @Test
    public void test22194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22194");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(26693777, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 26693777 * 89");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22195");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant10 = instant8.minus((long) (-25262));
        org.joda.time.Instant instant12 = instant8.plus((long) 54);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval16 = localDate13.toInterval();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate13.minus(readablePeriod17);
        org.joda.time.LocalDate.Property property19 = localDate13.era();
        boolean boolean20 = property19.isLeap();
        org.joda.time.LocalDate localDate22 = property19.addWrapFieldToCopy(6);
        org.joda.time.LocalDate localDate23 = property19.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate25 = localDate23.plusMonths(59);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.LocalDate localDate27 = localDate23.withFields(readablePartial26);
        org.joda.time.DateTime dateTime28 = localDate23.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfDay();
        boolean boolean30 = instant12.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test22196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22196");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate8 = property6.roundHalfFloorCopy();
        int int9 = localDate8.size();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property10.roundHalfEvenCopy();
        int int12 = localDate11.getDayOfWeek();
        org.joda.time.LocalDate.Property property13 = localDate11.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test22197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22197");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZone(dateTimeZone9);
        boolean boolean11 = dateTimeFormatter4.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 26206);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        int int20 = localDateTime18.getDayOfYear();
        org.joda.time.Chronology chronology21 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology21.seconds();
        org.joda.time.Chronology chronology25 = chronology21.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter16.withChronology(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = dateTimeFormatter16.parseMillis("2022-02-22T07:24:58.138Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test22198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22198");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology13);
        org.joda.time.DateTime dateTime15 = dateTime9.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusMillis(4);
        org.joda.time.DateTime dateTime18 = localTime14.toDateTimeToday();
        org.joda.time.DateTime dateTime19 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime.Property property20 = localTime14.millisOfSecond();
        org.joda.time.LocalTime localTime21 = property20.withMinimumValue();
        org.joda.time.LocalTime localTime23 = property20.addWrapFieldToCopy(26495);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26761 + "'", int3 == 26761);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test22199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22199");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property5.getLocalTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        long long22 = dateTimeField20.roundFloor((long) (byte) 10);
        java.lang.String str23 = dateTimeField20.getName();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfMinute();
        org.joda.time.DateTime dateTime32 = dateTime28.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property33 = dateTime32.secondOfDay();
        java.util.Locale locale34 = java.util.Locale.PRC;
        boolean boolean35 = dateTime32.equals((java.lang.Object) locale34);
        java.lang.String str36 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime26, locale34);
        java.util.Calendar calendar37 = dateTime13.toCalendar(locale34);
        java.lang.String str38 = locale34.getLanguage();
        boolean boolean39 = locale34.hasExtensions();
        java.lang.String str40 = property5.getAsShortText(locale34);
        org.joda.time.LocalTime localTime41 = property5.withMaximumValue();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "secondOfMinute" + "'", str23, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645601161750,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=54,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=750,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh" + "'", str38, "zh");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "100" + "'", str40, "100");
        org.junit.Assert.assertNotNull(localTime41);
    }

    @Test
    public void test22200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22200");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(100);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        org.joda.time.DateTime dateTime8 = dateTime6.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = dateTime8.plusSeconds(38);
        org.joda.time.DateTime dateTime13 = dateTime8.minusYears(26250);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) '#');
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds(685340037);
        int int18 = dateTime17.getDayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime17.plusSeconds((int) 'a');
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        int int25 = dateTimeZone22.getOffsetFromLocal((long) 6);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone22);
        int int27 = localDate26.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property28 = localDate26.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate26.plus(readablePeriod29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readablePeriod33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property37 = dateTime34.minuteOfDay();
        org.joda.time.DateTime dateTime38 = property37.getDateTime();
        org.joda.time.LocalDate localDate39 = dateTime38.toLocalDate();
        int int40 = localDate39.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate44 = localDate42.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval45 = localDate42.toInterval();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDate localDate47 = localDate42.minus(readablePeriod46);
        org.joda.time.LocalDate localDate49 = localDate42.withDayOfYear(4);
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = dateTimeField51.getType();
        boolean boolean53 = localDate39.isSupported(dateTimeFieldType52);
        org.joda.time.LocalDate.Property property54 = localDate26.property(dateTimeFieldType52);
        java.lang.String str55 = dateTimeFieldType52.getName();
        org.joda.time.DateTime dateTime57 = dateTime17.withField(dateTimeFieldType52, 26204714);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMinutes(582);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "year" + "'", str55, "year");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test22201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22201");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale locale15 = builder14.build();
        java.lang.String str16 = locale12.getDisplayCountry(locale15);
        java.util.Locale locale17 = locale12.stripExtensions();
        java.lang.String str18 = locale12.getDisplayName();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale12.getDisplayCountry(locale19);
        java.lang.String str21 = property10.getAsText(locale19);
        org.joda.time.LocalDateTime localDateTime22 = property10.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = property10.setCopy("12");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test22202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22202");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        int int14 = dateTime10.get(dateTimeFieldType11);
        int int15 = dateTime10.getMonthOfYear();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime18 = property2.addToCopy((long) 26168398);
        org.joda.time.LocalDateTime localDateTime19 = property2.roundCeilingCopy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        org.joda.time.DateTime dateTime26 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withSecondOfMinute((int) (short) 0);
        int int32 = localDateTime31.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int34 = localDateTime31.get(dateTimeFieldType33);
        int int35 = dateTime26.get(dateTimeFieldType33);
        org.joda.time.DateTime dateTime36 = dateTime26.toDateTime();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.withDurationAdded(readableDuration37, (int) (short) 0);
        org.joda.time.DateTime dateTime41 = dateTime39.plusWeeks((-21));
        long long42 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime44 = dateTime39.withWeekyear(26494);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "clockhourOfHalfday" + "'", str13, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 70 + "'", int34 == 70);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1645514761999L) + "'", long42 == (-1645514761999L));
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test22203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22203");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.Locale locale5 = new java.util.Locale("+00:00");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withLocale(locale5);
        java.util.Locale locale10 = new java.util.Locale("Etc/UTC");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear(13);
        java.util.Locale locale14 = dateTimeFormatter11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.parse("2022-02-22T07:21:26.583Z", dateTimeFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "+00:00");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertEquals(locale10.toString(), "etc/utc");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "etc/utc");
    }

    @Test
    public void test22204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22204");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        long long4 = property3.remainder();
        org.joda.time.LocalDate localDate6 = property3.addWrapFieldToCopy(31);
        org.joda.time.LocalDate localDate7 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4320000000L + "'", long4 == 4320000000L);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test22205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22205");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) 26168398);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(1L, dateTimeZone2);
        long long9 = dateTimeZone2.convertLocalToUTC(0L, true, (long) 'u');
        java.lang.String str11 = dateTimeZone2.getName((long) 100);
        int int13 = dateTimeZone2.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22206");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        int int5 = localDateTime4.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int7 = localDateTime4.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withWeekyear(26166);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        int int11 = localDateTime9.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 261 + "'", int11 == 261);
    }

    @Test
    public void test22207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22207");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra(100);
        int int6 = localDate5.getEra();
        boolean boolean7 = strSet0.contains((java.lang.Object) localDate5);
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.setCopy(26518670);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26518670 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test22208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22208");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = property3.addToCopy((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.LocalDate localDate7 = dateTime5.toLocalDate();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = dateTime10.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime14.plusWeeks(23);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.plus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime14.minusWeeks(26371);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime14.plus(readableDuration22);
        boolean boolean24 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22209");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        int int6 = date5.getYear();
        date5.setMonth((-2014));
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514761906,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=906,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Mar 22 00:00:00 UTC 1854");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 122 + "'", int6 == 122);
    }

    @Test
    public void test22210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22210");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfEra();
        org.joda.time.DurationField durationField11 = chronology9.months();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = chronology9.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(26603, 175, 812, 26477, (int) 'a', chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26477 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test22211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22211");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate4 = property1.withMinimumValue();
        org.joda.time.LocalDate localDate6 = localDate4.withCenturyOfEra(100);
        org.joda.time.LocalDate.Property property7 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.getLocalDate();
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        org.joda.time.DateTimeField dateTimeField12 = property7.getField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22212");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime7.toMutableDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        int int17 = dateTime15.getSecondOfDay();
        org.joda.time.DateTime dateTime19 = dateTime15.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.plusSeconds(2000);
        int int24 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime26 = dateTime19.minus((long) (byte) 1);
        org.joda.time.DateTime.Property property27 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime28 = property27.roundHalfFloorCopy();
        int int29 = dateTime28.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 26761 + "'", int17 == 26761);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 53 + "'", int29 == 53);
    }

    @Test
    public void test22213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguageTag("2022-02-22T07:19:09.509Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test22214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22214");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 112, (long) 83699999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9374399888");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22215");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 32772);
        int int6 = dateTimeZone1.getOffset(1036800000L);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone1);
        int int8 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays((int) 'u');
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.plus(readablePeriod11);
        org.joda.time.DateTime.Property property13 = dateTime7.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test22216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22216");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate((int) (byte) 0, 2, 26179);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(3222, (int) (byte) 1, (int) (byte) 100, 26173);
        java.util.Calendar.Builder builder11 = builder9.setLenient(true);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology17);
        org.joda.time.DateTime dateTime19 = dateTime13.withFields((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime21 = localTime18.plusMillis(4);
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday();
        org.joda.time.LocalTime.Property property23 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.roundHalfEvenCopy();
        int[] intArray25 = localTime24.getValues();
        java.util.Calendar.Builder builder26 = builder11.setFields(intArray25);
        java.util.Calendar.Builder builder27 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder31 = builder27.setTimeOfDay(4, (-25262), (-1));
        java.util.Calendar.Builder builder35 = builder31.setDate(26178, 8, 14);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        boolean boolean39 = timeZone38.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        boolean boolean41 = timeZone38.observesDaylightTime();
        java.util.Calendar.Builder builder42 = builder35.setTimeZone(timeZone38);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.util.TimeZone.setDefault(timeZone45);
        boolean boolean49 = timeZone45.observesDaylightTime();
        boolean boolean50 = timeZone38.hasSameRules(timeZone45);
        java.util.Calendar.Builder builder51 = builder11.setTimeZone(timeZone38);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate53 = org.joda.time.LocalDate.fromCalendarFields(calendar52);
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.fromCalendarFields(calendar52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDate54.toDateTimeAtCurrentTime(dateTimeZone55);
        java.util.Date date57 = localDate54.toDate();
        date57.setTime((-97046742616981107L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder60 = builder51.setInstant(date57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(calendar52);
// flaky:         org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=1645514761972,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=1,MILLISECOND=972,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Apr 06 07:16:58 UTC 3073257");
    }

    @Test
    public void test22217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22217");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate4 = property1.withMinimumValue();
        org.joda.time.LocalDate localDate6 = property1.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDate localDate7 = property1.withMinimumValue();
        int int8 = localDate7.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property9 = localDate7.weekyear();
        org.joda.time.LocalDate localDate11 = localDate7.plusYears(26454);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test22218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22218");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.seconds();
        org.joda.time.DurationField durationField24 = chronology22.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) durationField24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 117L + "'", long20 == 117L);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
    }
}
