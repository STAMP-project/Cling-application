import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        long long8 = durationField5.add((long) 53628, (long) 53627827);
        long long11 = durationField5.getDifferenceAsLong((long) (-53626948), (long) 365);
        long long13 = durationField5.getMillis(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        java.lang.String str16 = dateTimeFieldType14.toString();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDurationAdded(readableDuration20, 7);
        org.joda.time.Chronology chronology23 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType14.getField(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.seconds();
        int int28 = durationField25.getDifference(10000L, 4642L);
        int int29 = durationField5.compareTo(durationField25);
        boolean boolean30 = durationField25.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 141027563462453628L + "'", long8 == 141027563462453628L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 15778476000L + "'", long13 == 15778476000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "clockhourOfHalfday" + "'", str16, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(5097600032L);
        org.joda.time.DateTime dateTime3 = dateTime1.withSecondOfMinute(30);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis(53754);
        org.joda.time.DateTime dateTime7 = dateTime3.plusSeconds(53722089);
        org.joda.time.DateTime.Property property8 = dateTime3.millisOfSecond();
        org.joda.time.Chronology chronology9 = dateTime3.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime3.toDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(2);
        org.joda.time.DateTime.Property property15 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime17 = property15.addToCopy(1645401600100L);
        org.joda.time.DateTime dateTime19 = property15.addToCopy((long) 53781856);
        org.joda.time.DateTime dateTime21 = property15.addWrapFieldToCopy(53879449);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property15.getFieldType();
        int int23 = dateTime10.get(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 30032 + "'", int23 == 30032);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withYear((int) '#');
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = localDateTime6.toString("6", locale8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMillis(53674314);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime6.plusMinutes(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime6.year();
        org.joda.time.LocalDateTime.Property property18 = localDateTime6.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str9, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6" + "'", str10, "6");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        timeZone4.setID("+00:00");
        timeZone4.setRawOffset(2);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        timeZone11.setID("+00:00");
        boolean boolean14 = timeZone4.hasSameRules(timeZone11);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone4, locale15);
        java.lang.String str17 = locale15.getLanguage();
        java.lang.String str20 = nameProvider0.getName(locale15, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        int int25 = dateTime24.getEra();
        org.joda.time.DateTime.Property property26 = dateTime24.secondOfMinute();
        java.lang.String str27 = property26.getAsString();
        org.joda.time.DateTime dateTime29 = property26.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime30 = property26.getDateTime();
        org.joda.time.DateTimeField dateTimeField31 = property26.getField();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        int int40 = dateTimeZone37.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone37);
        int int42 = localDate41.size();
        int int43 = localDate41.getWeekOfWeekyear();
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        java.lang.String str46 = dateTimeZone45.toString();
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter35.withZone(dateTimeZone45);
        org.joda.time.tz.NameProvider nameProvider49 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider49);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        timeZone53.setID("+00:00");
        timeZone53.setRawOffset(2);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        java.util.TimeZone timeZone60 = dateTimeZone59.toTimeZone();
        timeZone60.setID("+00:00");
        boolean boolean63 = timeZone53.hasSameRules(timeZone60);
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone53, locale64);
        java.lang.String str66 = locale64.getLanguage();
        java.lang.String str69 = nameProvider49.getName(locale64, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.lang.String str72 = locale71.getISO3Country();
        java.util.Locale locale73 = locale71.stripExtensions();
        java.lang.String str74 = locale71.getScript();
        java.lang.String str76 = locale71.getUnicodeLocaleType("57");
        java.lang.String str79 = nameProvider49.getShortName(locale71, "49", "GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter48.withLocale(locale71);
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.lang.String str82 = locale81.getDisplayName();
        java.util.Locale locale84 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str85 = locale81.getDisplayLanguage(locale84);
        java.lang.String str86 = locale71.getDisplayScript(locale84);
        java.lang.String str88 = locale84.getExtension('a');
        java.lang.String str89 = dateTimeField31.getAsText(53815131, locale84);
        java.lang.String str90 = locale84.getDisplayVariant();
        java.lang.String str93 = nameProvider0.getName(locale84, "2022-02-21T14:58:17.191Z", "2022-02-21T14:55:53.000Z");
        java.lang.String str94 = locale84.getDisplayCountry();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455822829,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=42,MILLISECOND=831,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "42" + "'", str27, "42");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Etc/UTC" + "'", str46, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(nameProvider49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar65);
// flaky:         org.junit.Assert.assertEquals(calendar65.toString(), "java.util.GregorianCalendar[time=1645455822829,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=42,MILLISECOND=831,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zh" + "'", str66, "zh");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str82, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals(locale84.toString(), "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Korean" + "'", str85, "Korean");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "53815131" + "'", str89, "53815131");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = dateTime4.get(dateTimeFieldType5);
        int int7 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0, dateTimeZone2);
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate12 = localDate10.minusDays(53643);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime dateTime9 = property3.addToCopy(101);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property11 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        int int17 = dateTime13.getMillisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusYears(12);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        boolean boolean31 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property32 = dateTime30.hourOfDay();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        int int34 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime36 = dateTime33.plus(827L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "42" + "'", str4, "42");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 54222868 + "'", int17 == 54222868);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54222 + "'", int21 == 54222);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        calendar0.clear();
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar0.getMinimum(53897341);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53897341");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=53875,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, 53);
        org.joda.time.LocalDate.Property property18 = localDate17.weekyear();
        java.util.Locale locale21 = new java.util.Locale("2022-02-21T14:54:47.855Z");
        org.joda.time.LocalDate localDate22 = property18.setCopy("13", locale21);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks(575);
        org.joda.time.LocalDate localDate26 = localDate22.minusYears(53638);
        org.joda.time.LocalDate localDate28 = localDate22.withYear(53646261);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals(locale21.toString(), "2022-02-21t14:54:47.855z");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 10);
        org.joda.time.Instant instant3 = instant1.minus(1645455254089L);
        org.joda.time.Instant instant5 = instant3.withMillis((long) 53783187);
        org.joda.time.Instant instant7 = instant5.minus((long) 370);
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-21T14:59:01.914Z");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMinutes(53);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.dayOfWeek();
        int int9 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute(12);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology4.add(readablePeriod5, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField9 = chronology4.minuteOfHour();
        java.lang.String str10 = chronology4.toString();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusSeconds(6);
        java.util.Date date21 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int22 = date21.getTimezoneOffset();
        java.util.Date date28 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean29 = date21.before(date28);
        java.time.Instant instant30 = date28.toInstant();
        date28.setSeconds((int) (short) 0);
        int int33 = date28.getMinutes();
        boolean boolean34 = localDateTime17.equals((java.lang.Object) int33);
        java.lang.String str35 = localDateTime17.toString();
        int int36 = dateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField11.getType();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 53633152L + "'", long8 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str10, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Nov 29 00:00:00 GMT 1909");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Sun Dec 31 09:35:00 GMT 1899");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:06.001" + "'", str35, "1970-01-01T00:00:06.001");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property4 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate7 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property8 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.roundCeilingCopy();
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(54083);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        long long9 = chronology4.add((long) 53669, (long) 53632, 0);
        org.joda.time.DateTimeField dateTimeField10 = chronology4.millisOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        timeZone14.setID("+00:00");
        int int18 = timeZone14.getOffset((long) 365);
        java.lang.String str19 = timeZone14.getID();
        timeZone14.setRawOffset(53691906);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getEra();
        org.joda.time.DateTime.Property property25 = dateTime23.secondOfMinute();
        java.lang.String str26 = property25.getAsString();
        org.joda.time.DateTimeField dateTimeField27 = property25.getField();
        int int30 = dateTimeField27.getDifference(606L, (long) 1970);
        long long32 = dateTimeField27.remainder((long) (short) 1);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeField27.getAsShortText(53635, locale34);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.lang.String str38 = locale37.getDisplayName();
        java.util.Locale locale40 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str41 = locale37.getDisplayLanguage(locale40);
        java.lang.String str42 = dateTimeField27.getAsShortText((int) (byte) -1, locale40);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale40.getDisplayVariant(locale43);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone14, locale40);
        java.lang.String str46 = dateTimeField10.getAsText(53728213, locale40);
        java.lang.String str47 = locale40.getDisplayVariant();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53669L + "'", long9 == 53669L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+14:54");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "42" + "'", str26, "42");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "53635" + "'", str35, "53635");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str38, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals(locale40.toString(), "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Korean" + "'", str41, "Korean");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1645455822962,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=53691906,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=58,SECOND=34,MILLISECOND=868,ZONE_OFFSET=53691906,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "53728213" + "'", str46, "53728213");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.toString();
        int int8 = dateTimeZone5.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtMidnight(dateTimeZone5);
        java.lang.String str11 = dateTimeZone5.getShortName(422L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DateTime dateTime17 = property15.roundCeilingCopy();
        long long18 = dateTime17.getMillis();
        java.lang.String str19 = dateTime17.toString();
        org.joda.time.DateTime dateTime21 = dateTime17.minusHours(575);
        int int22 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime17);
        int int23 = dateTime17.getDayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime17.withYear(290);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime25.withYearOfCentury(54044);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54044 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "42" + "'", str16, "42");
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645455823000L + "'", long18 == 1645455823000L);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022-02-21T15:03:43.000Z" + "'", str19, "2022-02-21T15:03:43.000Z");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMillis(53655035);
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks(53673913);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(53630);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readableDuration19);
        int int21 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.era();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = property22.addToCopy(54053);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "42" + "'", str16, "42");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMinutes(53);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.centuryOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfMinute();
        java.lang.String str14 = property13.getAsString();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        int int17 = dateTimeField15.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plusSeconds(6);
        int int24 = localDateTime19.getYear();
        int[] intArray31 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int32 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime19, intArray31);
        java.lang.String str33 = dateTimeField15.getName();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy((long) 3);
        int[] intArray40 = new int[] { '#' };
        int int41 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime38, intArray40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withWeekyear(53632);
        int int44 = localDateTime43.getYear();
        int int45 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.withPeriodAdded(readablePeriod46, 53747);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withWeekyear(53898216);
        int int51 = localDateTime48.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "43" + "'", str14, "43");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "secondOfMinute" + "'", str33, "secondOfMinute");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 59 + "'", int41 == 59);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 53632 + "'", int44 == 53632);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate15 = localDate4.withCenturyOfEra((int) 'a');
        org.joda.time.tz.Provider provider16 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone18 = provider16.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate4.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.LocalDate.Property property21 = localDate4.year();
        int int22 = property21.getLeapAmount();
        org.joda.time.LocalDate localDate23 = property21.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.minuteOfHour();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        java.lang.String[] strArray4 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        java.lang.Object[] objArray8 = strSet5.toArray();
        java.util.Set<java.lang.String> strSet9 = java.util.Calendar.getAvailableCalendarTypes();
        boolean boolean10 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList16);
        java.util.stream.Stream<java.lang.String> strStream19 = strList18.stream();
        boolean boolean20 = strSet5.removeAll((java.util.Collection<java.lang.String>) strList18);
        java.util.Spliterator<java.lang.String> strSpliterator21 = strSet5.spliterator();
        java.lang.String[] strArray23 = new java.lang.String[] { "2022-02-21T14:54:47.855Z" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = strSet24.isEmpty();
        boolean boolean27 = strSet24.isEmpty();
        boolean boolean28 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean30 = strSet5.add("1 Jan 53632 01:59:59 GMT");
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.parse("50");
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withCenturyOfEra(2);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter35.withChronology(chronology40);
        boolean boolean42 = dateTimeFormatter35.isParser();
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.lang.String str45 = dateTimeZone44.toString();
        int int47 = dateTimeZone44.getOffsetFromLocal((long) (short) -1);
        int int49 = dateTimeZone44.getStandardOffset((long) 13);
        long long52 = dateTimeZone44.convertLocalToUTC((long) 53641, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter35.withZone(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) "50", dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withPeriodAdded(readablePeriod60, 53625);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.year();
        org.joda.time.LocalDateTime.Property property64 = localDateTime62.secondOfMinute();
        java.util.Locale locale67 = new java.util.Locale("hi!");
        java.lang.String str68 = locale67.getISO3Country();
        java.util.Locale locale69 = locale67.stripExtensions();
        org.joda.time.LocalDateTime localDateTime70 = property64.setCopy("8", locale67);
        java.lang.String str71 = dateTimeZone44.getShortName(53657L, locale67);
        java.util.Locale locale73 = java.util.Locale.CHINA;
        java.lang.String str74 = dateTimeZone44.getShortName((long) 53685045, locale73);
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleAttributes();
        boolean boolean76 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet75);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Etc/UTC" + "'", str45, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 53641L + "'", long52 == 53641L);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "+00:00" + "'", str71, "+00:00");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00" + "'", str74, "+00:00");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53753);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455823102,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:53.753,offset=53753,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=4,SECOND=36,MILLISECOND=855,ZONE_OFFSET=53753,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(2);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withChronology(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withPivotYear((java.lang.Integer) 53677);
        boolean boolean30 = dateTimeFormatter27.isPrinter();
        org.joda.time.Chronology chronology31 = dateTimeFormatter27.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter27.getParser();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter27.withLocale(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter27.withZoneUTC();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        timeZone38.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone38);
        int int43 = timeZone38.getOffset((long) 53626);
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        java.lang.String str47 = locale45.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter27.withLocale(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime51 = dateTimeFormatter48.parseLocalTime("14:56:15.116");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53633152L + "'", long24 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(chronology31);
        org.junit.Assert.assertNull(dateTimeParser32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1645455823123,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=123,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime7.getFieldTypes();
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.weekOfWeekyear();
        boolean boolean18 = dateTimeFieldType4.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = chronology10.weeks();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.year();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder23.clear();
        java.util.Locale.Builder builder25 = builder24.clear();
        java.util.Locale.Builder builder26 = builder24.clear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfMinute();
        java.lang.String str31 = property30.getAsString();
        org.joda.time.DateTime dateTime33 = property30.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime34 = property30.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime36 = dateTime34.minusSeconds(2922789);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.lang.String str38 = locale37.getDisplayName();
        java.lang.String str39 = locale37.getISO3Country();
        java.util.Locale locale40 = locale37.stripExtensions();
        java.util.Calendar calendar41 = dateTime34.toCalendar(locale37);
        java.util.Locale.Builder builder42 = builder26.setLocale(locale37);
        java.util.Locale locale43 = builder42.build();
        java.util.Locale locale44 = builder42.build();
        java.lang.String str45 = dateTimeField21.getAsShortText(0L, locale44);
        java.lang.String str46 = locale44.toLanguageTag();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "43" + "'", str31, "43");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str38, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "KOR" + "'", str39, "KOR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar41);
// flaky:         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=1645455823000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970" + "'", str45, "1970");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ko-KR" + "'", str46, "ko-KR");
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis(53625);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        int int5 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withDurationAdded((long) 16575, 53926221);
        org.joda.time.DateTime.Property property9 = dateTime3.millisOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfEvenCopy();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder14 = builder11.setLocale(locale13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        timeZone17.setID("+00:00");
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone17, locale20);
        java.util.Locale.Builder builder22 = builder11.setLocale(locale20);
        org.joda.time.LocalDateTime localDateTime23 = property5.setCopy("46", locale20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.era();
        org.joda.time.DurationField durationField25 = property24.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645455823169,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=169,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNull(durationField25);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        calendar0.set((-53626948), 53629, 53632, 53633, 53632);
        calendar0.set((int) (short) 1, (int) ' ', 53630324, 53629404, 5);
        int int18 = calendar0.getWeeksInWeekYear();
        calendar0.set(365, 23, 53670067);
        java.util.TimeZone timeZone23 = calendar0.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        timeZone26.setID("+00:00");
        timeZone26.setRawOffset(2);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        timeZone33.setID("+00:00");
        boolean boolean36 = timeZone26.hasSameRules(timeZone33);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone26, locale37);
        calendar0.setTimeZone(timeZone26);
        int int40 = calendar0.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=365,MONTH=23,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=53670067,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=53629404,MINUTE=5,SECOND=43,MILLISECOND=180,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar38);
// flaky:         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1645455823180,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=182,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds(292275056);
        int int8 = localDateTime4.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        org.joda.time.DateTime.Property property7 = dateTime6.centuryOfEra();
        int int8 = dateTime6.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 5);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(575);
        int int12 = dateTime11.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime11.getZone();
        java.util.Date date14 = dateTime11.toDate();
        org.joda.time.DateTime.Property property15 = dateTime11.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54223 + "'", int12 == 54223);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Thu Mar 21 15:03:43 GMT+00:00 1974");
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology4.add(readablePeriod5, (long) 53633152, 99);
        org.joda.time.DurationField durationField9 = chronology4.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.millisOfSecond();
        org.joda.time.DurationField durationField11 = chronology4.years();
        int int13 = durationField11.getValue((long) 53714);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime15.getFieldTypes();
        org.joda.time.Chronology chronology18 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.months();
        long long22 = durationField19.add((long) 53628, (long) 53627827);
        long long25 = durationField19.add((long) (-53626975), (int) (short) -1);
        long long28 = durationField19.getMillis(53628560, (long) 53636);
        long long31 = durationField19.subtract((long) 56, 0L);
        boolean boolean32 = durationField19.isSupported();
        long long35 = durationField19.subtract(0L, (long) 53799);
        boolean boolean36 = durationField19.isPrecise();
        int int37 = durationField11.compareTo(durationField19);
        int int40 = durationField19.getDifference((long) 54142530, (long) 53657004);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 53633152L + "'", long8 == 53633152L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 141027563462453628L + "'", long22 == 141027563462453628L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-2732026975L) + "'", long25 == (-2732026975L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 141029491132800000L + "'", long28 == 141029491132800000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 56L + "'", long31 == 56L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-141477753600000L) + "'", long35 == (-141477753600000L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        boolean boolean28 = instant26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = instant26.toDateTimeISO();
        org.joda.time.DateTime dateTime30 = instant26.toDateTime();
        org.joda.time.Instant instant31 = instant26.toInstant();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54223232 + "'", int5 == 54223232);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54223 + "'", int9 == 54223);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Etc/UTC" + "'", str19, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(instant31);
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, 53626975);
        org.joda.time.DateTime dateTime11 = dateTime5.withDurationAdded((long) 2922789, (int) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(53691674);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime11.getZone();
        java.util.Locale locale19 = new java.util.Locale("months", "2022-02-21T14:57:07.000Z", "55");
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = dateTimeZone14.getShortName((long) 53793620, locale19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54223 + "'", int3 == 54223);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals(locale19.toString(), "months_2022-02-21T14:57:07.000Z_55");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "months (2022-02-21T14:57:07.000Z,55)" + "'", str20, "months (2022-02-21T14:57:07.000Z,55)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        calendar0.setLenient(true);
        int int6 = calendar0.getWeeksInWeekYear();
        calendar0.setMinimalDaysInFirstWeek(53698);
        calendar0.setLenient(false);
        java.util.TimeZone timeZone11 = calendar0.getTimeZone();
        java.util.Date date18 = new java.util.Date(14, (int) (short) 100, 11, 53643, 53635, (int) (byte) 1);
        date18.setMinutes(53792);
        date18.setDate(53988019);
        date18.setHours(54176);
        boolean boolean25 = timeZone11.inDaylightTime(date18);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455823255,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=53698,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=255,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals(date18.toString(), "Fri Dec 13 16:32:01 GMT+00:00 149748");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology9.add(readablePeriod15, 1645455275000L, 53666699);
        org.joda.time.Chronology chronology19 = chronology9.withUTC();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusWeeks(9);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusSeconds(53627827);
        org.joda.time.LocalDateTime.Property property27 = localDateTime21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.era();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusMinutes(1969);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.minus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.minusDays(53848);
        int[] intArray37 = chronology19.get((org.joda.time.ReadablePartial) localDateTime35, (long) 53859898);
        org.joda.time.DateTimeField dateTimeField38 = chronology19.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645455275000L + "'", long18 == 1645455275000L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1970, 1, 1, 53859898]");
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        date6.setSeconds((int) ' ');
        java.time.Instant instant11 = date6.toInstant();
        date6.setHours(12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, 53775116);
        org.joda.time.LocalDate localDate19 = localDate14.withYearOfEra(53811);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 12:01:32 GMT+00:00 1901");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayName();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int5 = dateTime3.get(dateTimeFieldType4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTimeISO();
        int int7 = dateTime3.getMillisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getEra();
        int int11 = dateTime9.getSecondOfDay();
        org.joda.time.DateTime dateTime13 = dateTime9.minusYears(12);
        boolean boolean14 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime16 = dateTime13.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = dateTime16.plusMillis(14);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        int int26 = dateTime25.getEra();
        org.joda.time.DateTime dateTime27 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalTime localTime29 = localTime23.plusMillis((-1));
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime29.withPeriodAdded(readablePeriod32, (int) '4');
        org.joda.time.LocalTime.Property property35 = localTime34.millisOfSecond();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        int int38 = dateTime37.getEra();
        org.joda.time.DateTime.Property property39 = dateTime37.secondOfMinute();
        java.lang.String str40 = property39.getAsString();
        org.joda.time.DateTime dateTime41 = property39.roundCeilingCopy();
        int int42 = property35.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField43 = property35.getField();
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.util.TimeZone timeZone47 = dateTimeZone46.toTimeZone();
        int int49 = dateTimeZone46.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) 0, dateTimeZone46);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime localTime53 = localTime51.minusSeconds((int) (byte) 1);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.util.TimeZone timeZone56 = dateTimeZone55.toTimeZone();
        timeZone56.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone56);
        int int61 = timeZone56.getOffset((long) 53626);
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone56, locale63);
        java.lang.String str65 = dateTimeField43.getAsText((org.joda.time.ReadablePartial) localTime53, locale63);
        java.lang.String str66 = dateTime16.toString("37", locale63);
        java.lang.String str67 = locale63.getDisplayLanguage();
        java.lang.String str68 = locale0.getDisplayVariant(locale63);
        java.lang.String str69 = locale0.getISO3Language();
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = locale70.getDisplayName();
        java.lang.String str72 = locale70.getDisplayLanguage();
        boolean boolean73 = locale70.hasExtensions();
        java.lang.String str74 = locale0.getDisplayCountry(locale70);
        java.lang.String str75 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet76 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str77 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)" + "'", str1, "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54223282 + "'", int7 == 54223282);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54223 + "'", int11 == 54223);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "43" + "'", str40, "43");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar64);
// flaky:         org.junit.Assert.assertEquals(calendar64.toString(), "java.util.GregorianCalendar[time=1645455823282,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=282,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "282" + "'", str65, "282");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "37" + "'", str66, "37");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "fra" + "'", str69, "fra");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str71, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str72, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\ud504\ub791\uc2a4" + "'", str74, "\ud504\ub791\uc2a4");
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)" + "'", str75, "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(2);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology5.add(readablePeriod6, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfHour();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) 53662L, chronology5);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology5);
        int int14 = localTime13.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53633152L + "'", long9 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalDate.Property property5 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, 54138255);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime17 = property15.setCopy("58");
        org.joda.time.DateTime dateTime19 = property15.addToCopy(53688349L);
        org.joda.time.DateTime dateTime20 = property15.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime22 = dateTime20.minusYears(54081607);
        org.joda.time.DateMidnight dateMidnight23 = dateTime20.toDateMidnight();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        int int26 = dateTime25.getEra();
        org.joda.time.DateTime.Property property27 = dateTime25.secondOfMinute();
        java.lang.String str28 = property27.getAsString();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getEra();
        int int33 = dateTime31.getSecondOfDay();
        org.joda.time.DateTime dateTime35 = dateTime31.minusYears(12);
        org.joda.time.DateTime dateTime37 = dateTime31.minusMinutes((-1));
        long long38 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime41 = dateTime37.withDurationAdded((long) 53627827, 21);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime44.withCenturyOfEra(2);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        long long51 = chronology47.add(readablePeriod48, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.minuteOfHour();
        org.joda.time.DurationField durationField53 = durationFieldType42.getField(chronology47);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.Chronology chronology56 = chronology47.withZone(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = dateTime37.toDateTime(chronology56);
        int int58 = dateTime57.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType59.getRangeDurationType();
        boolean boolean61 = dateTime57.isSupported(dateTimeFieldType59);
        org.joda.time.DateTime.Property property62 = dateTime57.yearOfCentury();
        org.joda.time.DateTime dateTime64 = dateTime57.plusDays(187);
        org.joda.time.DateTime.Property property65 = dateTime57.era();
        boolean boolean66 = dateMidnight23.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54223322 + "'", int5 == 54223322);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54223 + "'", int9 == 54223);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "43" + "'", str28, "43");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 54223 + "'", int33 == 54223);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-60L) + "'", long38 == (-60L));
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 53633152L + "'", long51 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Fri Feb 08 23:01:00 GMT+00:00 1901");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 53847295, dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        gregorianCalendar10.setTimeInMillis(141027563462453628L);
        int int13 = gregorianCalendar10.getWeeksInWeekYear();
        java.time.Instant instant14 = gregorianCalendar10.toInstant();
        gregorianCalendar10.set(53636369, 12, 34, 18, 32772);
        gregorianCalendar10.setMinimalDaysInFirstWeek(53687973);
        java.util.Date date23 = gregorianCalendar10.getTime();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Feb 26 12:12:53 GMT+00:00 53636370");
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        calendar14.setFirstDayOfWeek(53635206);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromCalendarFields(calendar14);
        java.util.Date date24 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date24.setYear(1);
        int int27 = date24.getMinutes();
        calendar14.setTime(date24);
        calendar14.setLenient(false);
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getISO3Country();
        java.util.Locale locale34 = locale32.stripExtensions();
        boolean boolean35 = calendar14.after((java.lang.Object) locale34);
        java.lang.String str36 = locale34.getDisplayLanguage();
        java.util.Locale locale38 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str39 = locale38.getDisplayName();
        java.lang.String str40 = locale38.getCountry();
        java.lang.String str41 = locale34.getDisplayScript(locale38);
        java.lang.String str42 = locale38.toLanguageTag();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-2174086740000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=53635206,minimalDaysInFirstWeek=1,ERA=1,YEAR=1901,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=39,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=1,SECOND=0,MILLISECOND=2,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Feb 08 23:01:00 GMT+00:00 1901");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals(locale38.toString(), "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "clockhourofhalfday" + "'", str39, "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "und" + "'", str42, "und");
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property3 = localDate1.monthOfYear();
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property5 = localDate1.dayOfYear();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks(53687487);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.size();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(53707128);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra(12);
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTime(localTime15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        java.lang.String str21 = dateTimeZone18.getShortName((long) 5);
        boolean boolean22 = localDate14.equals((java.lang.Object) str21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate14.minus(readablePeriod23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withCenturyOfEra(2);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTime.Property property30 = dateTime28.dayOfYear();
        org.joda.time.DateTime dateTime32 = property30.setCopy("59");
        org.joda.time.DateTime dateTime34 = property30.setCopy("46");
        org.joda.time.DateTime dateTime35 = property30.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime38.withCenturyOfEra(2);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.minuteOfDay();
        java.lang.String str43 = chronology41.toString();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.weekyear();
        boolean boolean45 = dateTimeFieldType36.isSupported(chronology41);
        int int46 = dateTime35.get(dateTimeFieldType36);
        boolean boolean47 = localDate14.isSupported(dateTimeFieldType36);
        boolean boolean48 = localDate9.isSupported(dateTimeFieldType36);
        org.joda.time.LocalDate.Property property49 = localDate9.year();
        java.lang.String str50 = property49.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str43, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "53707128" + "'", str50, "53707128");
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMinutes(53);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withWeekyear(20);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property12.addWrapFieldToCopy(53831854);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (-53637188));
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(53870062);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime1.getValue(54019631);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54019631");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int4 = date3.getTimezoneOffset();
        java.util.Date date10 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean11 = date3.before(date10);
        java.time.Instant instant12 = date10.toInstant();
        int int13 = date10.getHours();
        java.lang.String str14 = date10.toGMTString();
        long long15 = date10.getTime();
        org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Dec 31 09:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "31 Dec 1899 09:35:00 GMT" + "'", str14, "31 Dec 1899 09:35:00 GMT");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2209040700000L) + "'", long15 == (-2209040700000L));
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53860149);
        long long4 = dateTimeZone1.adjustOffset(4287826412L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4287826412L + "'", long4 == 4287826412L);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths(53628);
        org.joda.time.LocalDate localDate9 = localDate7.minusDays(53630);
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate9.withPeriodAdded(readablePeriod12, 10);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear(746);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate14.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDate localDate20 = localDate14.plusWeeks(53698249);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.year();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53792450, 58176502, 54202372);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53792450 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 5);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(575);
        org.joda.time.DateTime dateTime13 = dateTime9.plusWeeks(53906814);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(108769446);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfMinute();
        boolean boolean18 = dateTimeField17.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(2);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter3.getChronology();
        boolean boolean11 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53683509);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int18 = dateTime16.get(dateTimeFieldType17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTimeISO();
        int int20 = dateTime16.getMillisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        int int23 = dateTime22.getEra();
        int int24 = dateTime22.getSecondOfDay();
        org.joda.time.DateTime dateTime26 = dateTime22.minusYears(12);
        boolean boolean27 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfYear((int) (byte) 100);
        int int31 = localDate28.getDayOfWeek();
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str34 = dateTimeZone33.toString();
        int int36 = dateTimeZone33.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime37 = localDate28.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime16.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime40 = dateTime16.minusDays(0);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfCentury(35);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMinutes(53688);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime42.getZone();
        int int47 = dateTimeZone45.getOffsetFromLocal((-31536000000L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter3.withZone(dateTimeZone45);
        java.lang.String str50 = dateTimeZone45.getShortName(0L);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(820L, dateTimeZone45);
        org.joda.time.DateTime dateTime53 = dateTime51.plusWeeks(0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 54223512 + "'", int20 == 54223512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 54223 + "'", int24 == 54223);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Etc/UTC" + "'", str34, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withMinuteOfHour(53783);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53783 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusMillis(53626975);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) dateTime5);
        java.util.Date date7 = dateTime5.toDate();
        int int8 = date7.getHours();
        int int9 = date7.getHours();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 00:09:56 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(2);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter3.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 0);
        boolean boolean13 = dateTimeFormatter12.isParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        java.lang.String str16 = dateTimeFieldType14.toString();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDurationAdded(readableDuration20, 7);
        org.joda.time.Chronology chronology23 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType14.getField(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.seconds();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter12.withChronology(chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withPivotYear(29);
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withLocale(locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.parse("2022-02-21T15:01:36.838Z", dateTimeFormatter30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "clockhourOfHalfday" + "'", str16, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str32, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1645455389000L);
        org.joda.time.LocalDate localDate3 = localDate1.withYear(53772);
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53642);
        java.util.Locale locale11 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra(2);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology17.add(readablePeriod18, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DurationField durationField24 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology17.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withChronology(chronology17);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int33 = dateTime31.get(dateTimeFieldType32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime31.toMutableDateTimeISO();
        int int35 = dateTime31.getMillisOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        int int38 = dateTime37.getEra();
        int int39 = dateTime37.getSecondOfDay();
        org.joda.time.DateTime dateTime41 = dateTime37.minusYears(12);
        boolean boolean42 = dateTime31.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime44 = dateTime41.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfHour();
        org.joda.time.DateTime dateTime47 = property45.setCopy("58");
        org.joda.time.DateTime dateTime48 = property45.roundHalfCeilingCopy();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DateTime dateTime53 = dateTime51.withCenturyOfEra(2);
        org.joda.time.Chronology chronology54 = dateTime53.getChronology();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(obj49, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.weekOfWeekyear();
        org.joda.time.DateTime dateTime57 = dateTime48.toDateTime(chronology54);
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.now(chronology54);
        org.joda.time.DateTimeField dateTimeField59 = chronology54.millisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter2.withChronology(chronology54);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 53633152L + "'", long21 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 54223569 + "'", int35 == 54223569);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 54223 + "'", int39 == 54223);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property7 = localDate6.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate6.property(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType8.getField(chronology10);
        int int12 = localDate5.get(dateTimeFieldType8);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withCenturyOfEra(2);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfDay();
        java.lang.String str20 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekyear();
        boolean boolean22 = dateTimeFieldType13.isSupported(chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.yearOfCentury();
        boolean boolean24 = localDate5.equals((java.lang.Object) chronology18);
        org.joda.time.DurationField durationField25 = chronology18.minutes();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str20, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime17 = property15.setCopy("58");
        org.joda.time.DateTime dateTime18 = property15.roundHalfCeilingCopy();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra(2);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(obj19, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.weekOfWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime18.toDateTime(chronology24);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMonths(53815);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds(53909456);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54223612 + "'", int5 == 54223612);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54223 + "'", int9 == 54223);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        java.lang.String str8 = dateTime6.toString("+00:00");
        org.joda.time.DateTime.Property property9 = dateTime6.millisOfDay();
        org.joda.time.DateTime.Property property10 = dateTime6.dayOfYear();
        int int11 = property10.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.DateTime dateTime13 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis(53905319);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) 0, dateTimeZone18);
        int int23 = localTime22.size();
        org.joda.time.Chronology chronology24 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField25.getType();
        java.lang.String str27 = dateTimeFieldType26.getName();
        boolean boolean28 = dateTime13.isSupported(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "millisOfDay" + "'", str27, "millisOfDay");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyear();
        int int7 = dateTimeField5.getMaximumValue((long) 53684);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale12 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str13 = locale9.getDisplayLanguage(locale12);
        java.lang.String str14 = locale12.getDisplayName();
        java.lang.String str15 = dateTimeField5.getAsShortText(53636369, locale12);
        java.lang.String str16 = locale12.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale12.getUnicodeLocaleType("0035-12-31T23:59:59.999");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 0035-12-31T23:59:59.999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str10, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals(locale12.toString(), "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Korean" + "'", str13, "Korean");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "clockhourofhalfday" + "'", str14, "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "53636369" + "'", str15, "53636369");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("516");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=516");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime dateTime8 = property3.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withPeriodAdded(readablePeriod9, 53878901);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int13 = dateTime8.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime8.withTime(53940, 98, 59, 53947714);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53940 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "43" + "'", str4, "43");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone2);
        int int7 = timeZone2.getOffset((long) 53626);
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone2, locale9);
        int int11 = calendar10.getWeeksInWeekYear();
        java.util.Date date15 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int16 = date15.getTimezoneOffset();
        java.util.Date date22 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean23 = date15.before(date22);
        java.time.Instant instant24 = date22.toInstant();
        date22.setSeconds((int) (short) 0);
        int int27 = date22.getMinutes();
        calendar10.setTime(date22);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromCalendarFields(calendar10);
        // The following exception was thrown during execution in test generation
        try {
            calendar10.setWeekDate(53845524, 69, 54107526);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 54107526");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-2209040700000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1899,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Dec 31 09:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusWeeks(9);
        java.util.Date date8 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant9 = date8.toInstant();
        boolean boolean10 = localDateTime4.equals((java.lang.Object) instant9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plusHours(2022);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withCenturyOfEra(53816);
        java.util.Date date17 = localDateTime14.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 22 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(66L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType2.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType2.getDurationType();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withFieldAdded(durationFieldType5, 55);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withYearOfCentury(9);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNull(durationFieldType3);
        org.junit.Assert.assertNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DurationField durationField11 = chronology9.seconds();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property13 = dateTime12.year();
        org.joda.time.DateTime dateTime15 = dateTime12.minusYears(53803);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime dateTime18 = dateTime12.withField(dateTimeFieldType16, 53845524);
        org.joda.time.DateTime dateTime19 = dateTime12.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        int int7 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime9 = dateTime6.minusHours(53771428);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        int int13 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.minusYears(12);
        org.joda.time.DateTime dateTime17 = dateTime11.minusMinutes((-1));
        boolean boolean18 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime20 = dateTime11.plusMillis(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property22 = dateTime11.property(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 712 + "'", int5 == 712);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54223 + "'", int13 == 54223);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar.Builder builder10 = builder0.setTimeOfDay((int) (short) -1, 53629404, 53629, 0);
        java.util.Calendar.Builder builder12 = builder0.setLenient(false);
        java.util.Calendar.Builder builder14 = builder12.setLenient(false);
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder20 = builder15.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar21 = builder20.build();
        java.util.Calendar calendar22 = builder20.build();
        java.util.Calendar.Builder builder26 = builder20.setDate(605139, 14, 20);
        java.util.Calendar.Builder builder28 = builder26.setLenient(true);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        timeZone31.setID("+00:00");
        timeZone31.setRawOffset(2);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        timeZone38.setID("+00:00");
        boolean boolean41 = timeZone31.hasSameRules(timeZone38);
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone31, locale42);
        java.util.TimeZone.setDefault(timeZone31);
        java.util.Calendar.Builder builder45 = builder26.setTimeZone(timeZone31);
        int int46 = timeZone31.getRawOffset();
        java.time.ZoneId zoneId47 = timeZone31.toZoneId();
        java.util.Calendar.Builder builder48 = builder12.setTimeZone(timeZone31);
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder50 = builder49.clear();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder53 = builder50.setLocale(locale52);
        java.util.Locale locale54 = builder50.build();
        java.util.Calendar.Builder builder55 = builder12.setLocale(locale54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        int int61 = dateTime60.getEra();
        org.joda.time.DateTime dateTime62 = localTime58.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        int int65 = dateTime64.getEra();
        int int66 = dateTime64.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTime dateTime68 = dateTime64.plus(readableDuration67);
        boolean boolean69 = dateTime60.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime71 = dateTime60.minusMonths(53628014);
        org.joda.time.DateTime.Property property72 = dateTime60.yearOfCentury();
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.joda.time.DateTime dateTime75 = dateTime60.toDateTime(dateTimeZone74);
        java.util.TimeZone timeZone76 = dateTimeZone74.toTimeZone();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(chronology77);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int80 = dateTime78.get(dateTimeFieldType79);
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime78.toMutableDateTimeISO();
        org.joda.time.tz.Provider provider82 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone84 = provider82.getZone("Etc/UTC");
        org.joda.time.MutableDateTime mutableDateTime85 = dateTime78.toMutableDateTime(dateTimeZone84);
        java.util.TimeZone timeZone86 = dateTimeZone84.toTimeZone();
        boolean boolean87 = timeZone76.hasSameRules(timeZone86);
        java.util.Calendar.Builder builder88 = builder55.setTimeZone(timeZone76);
        timeZone76.setID("");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1645455823724,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=43,MILLISECOND=726,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 54223 + "'", int66 == 54223);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertNotNull(provider82);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertNotNull(mutableDateTime85);
        org.junit.Assert.assertNotNull(timeZone86);
// flaky:         org.junit.Assert.assertEquals(timeZone86.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(builder88);
    }
}
