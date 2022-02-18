import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(17);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus(readableDuration10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withFieldAdded(durationFieldType12, 0);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight18 = property15.addToCopy(0L);
        org.joda.time.DateMidnight dateMidnight19 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight21 = property15.addToCopy(52848785);
        int int22 = property5.compareTo((org.joda.time.ReadableInstant) dateMidnight21);
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        calendar25.setMinimalDaysInFirstWeek(7);
        long long28 = calendar25.getTimeInMillis();
        calendar25.setTimeInMillis(28425600004L);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromCalendarFields(calendar25);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusDays(1);
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.DateTime dateTime36 = dateTime35.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime41 = dateTime36.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int43 = dateTime36.get(dateTimeFieldType42);
        org.joda.time.DateTime.Property property44 = dateTime36.year();
        org.joda.time.DateTime dateTime45 = property44.roundHalfEvenCopy();
        boolean boolean46 = dateTime45.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, (int) '#');
        int[] intArray54 = localDateTime50.getValues();
        boolean boolean55 = dateTimeZone49.isLocalDateTimeGap(localDateTime50);
        org.joda.time.LocalDateTime.Property property56 = localDateTime50.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundHalfFloorCopy();
        int int58 = localDateTime57.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withPeriodAdded(readablePeriod63, (int) '#');
        int[] intArray66 = localDateTime62.getValues();
        boolean boolean67 = dateTimeZone61.isLocalDateTimeGap(localDateTime62);
        org.joda.time.LocalDateTime.Property property68 = localDateTime62.millisOfDay();
        org.joda.time.LocalDateTime localDateTime69 = property68.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime71 = property70.withMaximumValue();
        org.joda.time.DateTime dateTime72 = localDateTime71.toDateTime();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.withYear(900);
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Interval interval77 = new org.joda.time.Interval(obj75, chronology76);
        boolean boolean78 = interval77.containsNow();
        org.joda.time.Duration duration79 = interval77.toDuration();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime74.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime57.withDurationAdded((org.joda.time.ReadableDuration) duration79, 32769);
        org.joda.time.DateTime dateTime83 = dateTime45.minus((org.joda.time.ReadableDuration) duration79);
        java.lang.Object obj84 = null;
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Interval interval86 = new org.joda.time.Interval(obj84, chronology85);
        long long87 = interval86.toDurationMillis();
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = interval86.toPeriod(periodType88);
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean92 = interval86.isAfter((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime94 = dateTime91.plusMonths(142);
        org.joda.time.DateTime.Property property95 = dateTime94.millisOfSecond();
        org.joda.time.Interval interval96 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration79, (org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime31.plus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Interval interval98 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight21, (org.joda.time.ReadableDuration) duration79);
        java.lang.String str99 = interval98.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=28425600004,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=7,ERA=1,YEAR=1970,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=330,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=4,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1644573461969L + "'", long28 == 1644573461969L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(intArray54);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[2022, 2, 15, 53381969]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 7 + "'", int58 == 7);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(intArray66);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[2022, 2, 15, 53381969]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertNotNull(localDateTime97);
// flaky:         org.junit.Assert.assertEquals("'" + str99 + "' != '" + "52850755-01-10T00:00:00.000+100:52/52850755-01-10T00:00:00.000+100:52" + "'", str99, "52850755-01-10T00:00:00.000+100:52/52850755-01-10T00:00:00.000+100:52");
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekyear();
        org.joda.time.DurationField durationField18 = chronology12.days();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyearOfCentury();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573462006,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.lang.String str5 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        boolean boolean4 = interval2.containsNow();
        org.joda.time.Chronology chronology5 = interval2.getChronology();
        boolean boolean7 = interval2.contains((long) 491);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.hourMinute();
        boolean boolean2 = dateTimeFormatter1.isOffsetParsed();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        int int4 = localTime3.getSecondOfMinute();
        java.lang.String str5 = dateTimeFormatter1.print((org.joda.time.ReadablePartial) localTime3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.parse("2022-02-15T14:49:01.602", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-15T14:49:01.602\" is malformed at \"22-02-15T14:49:01.602\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 42 + "'", int4 == 42);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14:49" + "'", str5, "14:49");
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addWrapFieldToCopy(35268191);
        org.joda.time.LocalTime localTime6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.getLocalTime();
        org.joda.time.LocalTime localTime8 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property3.addCopy(2084);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTime dateTime13 = dateTime11.minusSeconds(71);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(502);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:49:42.056" + "'", str2, "14:49:42.056");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        int int8 = localDate6.getWeekyear();
        org.joda.time.LocalDate localDate10 = localDate6.withEra((int) (short) 0);
        int int11 = property2.compareTo((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.Interval interval12 = property2.toInterval();
        org.joda.time.LocalDate localDate13 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField14 = property2.getField();
        org.joda.time.DateTimeField dateTimeField15 = property2.getField();
        org.joda.time.LocalDate localDate16 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale.Builder builder19 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder0.setRegion("8045-05-14T06:47:44.864");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 8045-05-14T06:47:44.864 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 53382083]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(4, 0);
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay(7, 69, 32770);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("8");
        java.lang.String str12 = locale8.getDisplayVariant(locale11);
        java.util.Calendar.Builder builder13 = builder3.setLocale(locale8);
        java.util.Calendar calendar14 = builder13.build();
        java.util.Calendar.Builder builder16 = builder13.setLenient(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-888290000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=355,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=15,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.withField(dateTimeFieldType5, 2022);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withDurationAdded(readableDuration9, 2022);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.minus(readableDuration16);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        boolean boolean30 = calendar21.after((java.lang.Object) localDateTime27);
        org.joda.time.Chronology chronology31 = localDateTime27.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 100, chronology31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        long long36 = interval35.toDurationMillis();
        org.joda.time.Period period37 = interval35.toPeriod();
        java.lang.String str38 = period37.toString();
        long long41 = chronology31.add((org.joda.time.ReadablePeriod) period37, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight17.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.MutablePeriod mutablePeriod43 = period37.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod43, 32769);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology47);
        java.util.Date date49 = dateTime48.toDate();
        org.joda.time.DateTime dateTime51 = dateTime48.withYearOfEra(1);
        org.joda.time.DateTime dateTime53 = dateTime51.withDayOfMonth(12);
        org.joda.time.DateTime dateTime55 = dateTime53.withMillis((long) 32);
        boolean boolean56 = dateMidnight11.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Chronology chronology57 = dateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.weekOfWeekyear();
        int int60 = dateTimeField58.getMaximumValue(62383600822000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter62 = dateTimeFormatter61.getPrinter();
        org.joda.time.Chronology chronology63 = dateTimeFormatter61.getChronology();
        boolean boolean64 = dateTimeFormatter61.isPrinter();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusDays(1);
        org.joda.time.DateTime dateTime68 = localDateTime67.toDateTime();
        org.joda.time.DateTime dateTime69 = dateTime68.withEarlierOffsetAtOverlap();
        int int70 = dateTime68.getWeekyear();
        org.joda.time.DateTime.Property property71 = dateTime68.weekOfWeekyear();
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getDisplayLanguage();
        int int75 = property71.getMaximumShortTextLength(locale73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter61.withLocale(locale73);
        java.util.Locale.setDefault(locale73);
        int int78 = dateTimeField58.getMaximumTextLength(locale73);
        java.util.Locale locale79 = java.util.Locale.PRC;
        java.lang.String str80 = locale73.getDisplayCountry(locale79);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644573462103,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=103,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0S" + "'", str38, "PT0S");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimePrinter62);
        org.junit.Assert.assertNull(chronology63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays(1);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DurationField durationField14 = durationFieldType12.getField(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFieldAdded(durationFieldType12, 35268191);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean21 = localDateTime17.isSupported(dateTimeFieldType20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight16.property(dateTimeFieldType20);
        org.joda.time.DateTime.Property property23 = dateTime5.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        java.lang.String str26 = property23.getAsString();
        org.joda.time.DateTime dateTime27 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime27.plusSeconds(0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minus(readableDuration4);
        int int6 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusMillis(23);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53382157 + "'", int6 == 53382157);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(3);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property4.addNoWrapToCopy(4);
        org.joda.time.LocalTime localTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.dayOfYear();
        org.joda.time.DurationField durationField18 = chronology13.centuries();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.millisOfSecond();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.DateTime.Property property21 = dateTime20.monthOfYear();
        org.joda.time.DurationField durationField22 = property21.getLeapDurationField();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573462175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=175,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        calendar2.setFirstDayOfWeek(12);
        int int21 = calendar2.getFirstDayOfWeek();
        calendar2.roll(5, false);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, chronology26);
        java.util.Date date28 = dateTime27.toDate();
        java.time.Instant instant29 = date28.toInstant();
        int int30 = date28.getTimezoneOffset();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromDateFields(date28);
        int int32 = date28.getMinutes();
        calendar2.setTime(date28);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=12,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573462191,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=191,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int5 = localDate3.get(dateTimeFieldType4);
        int int6 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.LocalDate.Property property7 = localDate1.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        int int9 = localDate8.getMonthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate8.centuryOfEra();
        org.joda.time.LocalDate localDate11 = property10.roundFloorCopy();
        org.joda.time.LocalDate localDate12 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DurationField durationField16 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology13);
        int int18 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusMillis((-1073453520));
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.yearOfEra();
        org.joda.time.DurationField durationField22 = property21.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573462220,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=220,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 221 + "'", int18 == 221);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        java.lang.String str13 = localDateTime12.toString();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withCenturyOfEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour(19);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53382238]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-16T00:00:00.000" + "'", str13, "2022-02-16T00:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withDurationAdded(readableDuration7, 0);
        org.joda.time.LocalDate localDate10 = dateMidnight6.toLocalDate();
        int int11 = dateMidnight6.getHourOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 12);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval(obj17, chronology18);
        long long20 = interval19.toDurationMillis();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = interval19.toPeriod(periodType21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean25 = interval19.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime24.weekOfWeekyear();
        int int27 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone13);
        boolean boolean29 = dateMidnight6.equals((java.lang.Object) dateTimeZone13);
        boolean boolean30 = dateMidnight6.isBeforeNow();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight6.withDurationAdded(1644572915873L, 358);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minus(1644573418752L);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateMidnight14);
// flaky:         org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 363120000 + "'", int27 == 363120000);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        int[] intArray8 = localDateTime4.getValues();
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(dateTimeZone3);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight14 = property12.addToCopy((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        java.lang.String str16 = dateTimeField15.toString();
        long long18 = dateTimeField15.roundHalfEven((long) 292);
        boolean boolean19 = dateTimeField15.isSupported();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withPeriodAdded(readablePeriod31, (int) '#');
        int[] intArray34 = localDateTime30.getValues();
        boolean boolean35 = dateTimeZone29.isLocalDateTimeGap(localDateTime30);
        int int37 = dateTimeZone29.getOffsetFromLocal((long) 4);
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = dateTimeZone29.getName((long) 9, locale40);
        java.lang.String str42 = locale26.getDisplayLanguage(locale40);
        java.lang.String str43 = locale22.getDisplayCountry(locale40);
        java.util.Set<java.lang.String> strSet44 = locale22.getUnicodeLocaleKeys();
        java.lang.String str45 = locale22.getDisplayCountry();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withPeriodAdded(readablePeriod50, (int) '#');
        int[] intArray53 = localDateTime49.getValues();
        boolean boolean54 = dateTimeZone48.isLocalDateTimeGap(localDateTime49);
        org.joda.time.LocalDateTime.Property property55 = localDateTime49.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundHalfCeilingCopy();
        java.util.Locale locale58 = java.util.Locale.KOREA;
        org.joda.time.LocalDateTime localDateTime59 = property55.setCopy("35271248", locale58);
        java.lang.String str60 = locale58.getLanguage();
        java.util.Set<java.lang.String> strSet61 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str62 = locale22.getDisplayLanguage(locale58);
        long long63 = dateTimeField15.set(63433187381975L, "7", locale22);
        java.lang.String str64 = locale22.getDisplayScript();
        java.util.Set<java.lang.String> strSet65 = locale22.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 15, 53382268]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateTimeField[dayOfWeek]" + "'", str16, "DateTimeField[dayOfWeek]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-17520000L) + "'", long18 == (-17520000L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[2022, 2, 15, 53382268]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 363120000 + "'", int37 == 363120000);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+100:52" + "'", str41, "+100:52");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Japanese" + "'", str42, "Japanese");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "South Korea" + "'", str43, "South Korea");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "South Korea" + "'", str45, "South Korea");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(intArray53);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[2022, 2, 15, 53382268]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ko" + "'", str60, "ko");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str62, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 63433187381975L + "'", long63 == 63433187381975L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strSet65);
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.minus(readableDuration4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays(28);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusDays(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.weekyear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withYearOfCentury(12);
        org.joda.time.Interval interval18 = dateMidnight12.toInterval();
        boolean boolean19 = dateMidnight12.isBeforeNow();
        java.lang.String str20 = dateMidnight12.toString();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight12.minusWeeks(11);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, (int) '#');
        int[] intArray30 = localDateTime26.getValues();
        boolean boolean31 = dateTimeZone25.isLocalDateTimeGap(localDateTime26);
        org.joda.time.LocalDateTime.Property property32 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime35 = property34.withMaximumValue();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYear(900);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        boolean boolean42 = interval41.containsNow();
        org.joda.time.Duration duration43 = interval41.toDuration();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight12.plus((org.joda.time.ReadableDuration) duration43);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval(obj46, chronology47);
        long long49 = interval48.toDurationMillis();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = interval48.toPeriod(periodType50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight12.withPeriodAdded((org.joda.time.ReadablePeriod) period51, 14);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight5.withPeriodAdded((org.joda.time.ReadablePeriod) period51, 52836254);
        org.joda.time.Period period56 = period51.toPeriod();
        org.joda.time.PeriodType periodType57 = period51.getPeriodType();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-16T00:00:00.000+100:52" + "'", str20, "2022-02-16T00:00:00.000+100:52");
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(intArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[2022, 2, 15, 53382293]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis((int) ' ');
        org.joda.time.LocalTime localTime9 = localTime5.plusHours(69);
        org.joda.time.LocalTime.Property property10 = localTime5.hourOfDay();
        org.joda.time.LocalTime.Property property11 = localTime5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        int int13 = property11.get();
        org.joda.time.LocalTime localTime15 = property11.addCopy(1644573390908L);
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        int int9 = localDateTime4.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        int int14 = localDateTime4.get(dateTimeFieldType12);
        java.lang.String str15 = dateTimeFieldType12.getName();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, (int) '#');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.minuteOfHour();
        boolean boolean27 = calendar18.after((java.lang.Object) localDateTime24);
        org.joda.time.Chronology chronology28 = localDateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.secondOfMinute();
        boolean boolean32 = dateTimeFieldType12.isSupported(chronology28);
        org.joda.time.DurationField durationField33 = chronology28.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long37 = chronology28.add((long) 52807920, 46058207969475L, 53186858);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 46058207969475 * 53186858");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "clockhourOfHalfday" + "'", str15, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1644573462335,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=335,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        int int7 = localDate4.getWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.hour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        boolean boolean10 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter8.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(31536000000L, dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter8.withZone(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = localDate4.toDateMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate4.withPeriodAdded(readablePeriod18, 39);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(13);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(31536000000L, dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDate20.toDateTimeAtStartOfDay(dateTimeZone23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime5.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.withMinimumValue();
        org.joda.time.LocalTime.Property property11 = localTime10.hourOfDay();
        org.joda.time.LocalTime localTime12 = property11.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfDay(53076923);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags(languageRangeList11, (java.util.Collection<java.lang.String>) strSet14, filteringMode15);
        strList16.clear();
        boolean boolean18 = strList16.isEmpty();
        boolean boolean20 = strList16.add("clockhourOfDay");
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = null;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(0L, dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusYears((int) (short) 1);
        int int48 = localDateTime47.getEra();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.plusSeconds(5);
        boolean boolean51 = strList39.remove((java.lang.Object) localDateTime47);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList39);
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.util.Locale locale54 = locale53.stripExtensions();
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(locale54);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withPeriodAdded(readablePeriod57, (int) '#');
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfDay();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.minuteOfHour();
        org.joda.time.LocalDateTime.Property property63 = localDateTime61.minuteOfHour();
        boolean boolean64 = calendar55.after((java.lang.Object) localDateTime61);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.withYear(35268191);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withMinuteOfHour(47);
        boolean boolean70 = strList52.remove((java.lang.Object) localDateTime69);
        boolean boolean71 = strList16.removeAll((java.util.Collection<java.lang.String>) strList52);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar55);
// flaky:         org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=1644573462384,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=384,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(localDateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 14 + "'", int67 == 14);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType3, dateTimeFieldType5, dateTimeFieldType6, dateTimeFieldType7 };
        java.util.ArrayList<org.joda.time.DateTimeFieldType> dateTimeFieldTypeList9 = new java.util.ArrayList<org.joda.time.DateTimeFieldType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList9, dateTimeFieldTypeArray8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList9, true, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList9, true, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList9, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No valid format for fields: [yearOfEra]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        java.util.Locale locale1 = new java.util.Locale("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(6);
        org.joda.time.LocalDate localDate5 = localDate1.minusWeeks(7);
        int int6 = localDate5.getDayOfYear();
        org.joda.time.LocalDate localDate8 = localDate5.plusDays((int) (short) 10);
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(360);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property9.setCopy("\u97d3\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 362 + "'", int6 == 362);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = locale14.stripExtensions();
        int int16 = dateTimeField13.getMaximumTextLength(locale14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeField13.getAsShortText(53135, locale18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573462455,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=455,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "53135" + "'", str19, "53135");
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 3992);
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        java.lang.String str12 = date10.toLocaleString();
        int int13 = date10.getDay();
        java.time.Instant instant14 = date10.toInstant();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromDateFields(date10);
        java.lang.String str17 = date10.toLocaleString();
        long long18 = date10.getTime();
        int int19 = date10.getTimezoneOffset();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feb 15, 2022 12:00:00 AM" + "'", str12, "Feb 15, 2022 12:00:00 AM");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feb 15, 2022 12:00:00 AM" + "'", str17, "Feb 15, 2022 12:00:00 AM");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644883200000L + "'", long18 == 1644883200000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean4 = localDateTime0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.plusMinutes(98531);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekyear(220);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(35268191);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withWeekyear(20);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        int[] intArray19 = localDateTime15.getValues();
        boolean boolean20 = dateTimeZone14.isLocalDateTimeGap(localDateTime15);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight11.withField(dateTimeFieldType23, 35268191);
        int int26 = dateMidnight11.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withPeriodAdded(readablePeriod28, (int) '#');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.minuteOfHour();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval(obj34, chronology35);
        long long37 = interval36.toDurationMillis();
        org.joda.time.Period period38 = interval36.toPeriod();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.minus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight11.minus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.MutablePeriod mutablePeriod41 = period38.toMutablePeriod();
        java.lang.String str42 = mutablePeriod41.toString();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withPeriodAdded(readablePeriod44, (int) '#');
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.minus(readableDuration47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.minusMinutes(35270798);
        int int51 = localDateTime43.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property52 = localDateTime43.dayOfMonth();
        org.joda.time.DateTime dateTime53 = localDateTime43.toDateTime();
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod41, (org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2022, 2, 15, 53382523]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0S" + "'", str42, "PT0S");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20 + "'", int51 == 20);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.year();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime25 = dateTime22.withField(dateTimeFieldType23, 2022);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, (int) '#');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        long long36 = interval35.toDurationMillis();
        org.joda.time.Period period37 = interval35.toPeriod();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime39 = dateTime22.minus((org.joda.time.ReadablePeriod) period37);
        java.lang.String str40 = period37.toString();
        int[] intArray43 = chronology13.get((org.joda.time.ReadablePeriod) period37, (long) 'a', 0L);
        long long47 = chronology13.add((long) 15, 946684800000L, 2022);
        org.joda.time.DateTimeField dateTimeField48 = chronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField49 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = chronology13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573462547,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=547,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, 0, 0, 0, 0, -97]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1914196665600015L + "'", long47 == 1914196665600015L);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone4);
        java.util.TimeZone timeZone6 = dateTimeZone4.toTimeZone();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks(6);
        org.joda.time.LocalDate localDate13 = localDate9.minusWeeks(7);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalDate localDate16 = localDate13.plusDays((int) (short) 10);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 12);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        long long26 = interval25.toDurationMillis();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = interval25.toPeriod(periodType27);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean31 = interval25.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property32 = dateTime30.weekOfWeekyear();
        int int33 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone19);
        org.joda.time.DateTime dateTime35 = localDate13.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight36 = localDate7.toDateMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone19);
        java.lang.String str38 = dateTimeZone19.getID();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 362 + "'", int14 == 362);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateMidnight20);
// flaky:         org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 363120000 + "'", int33 == 363120000);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:52" + "'", str38, "+100:52");
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType5.getField(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withFieldAdded(durationFieldType5, 35268191);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean14 = localDateTime10.isSupported(dateTimeFieldType13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight9.property(dateTimeFieldType13);
        org.joda.time.DateMidnight dateMidnight16 = property15.getDateMidnight();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = property15.getAsShortText(locale17);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 10, chronology24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYear(12);
        org.joda.time.Interval interval28 = new org.joda.time.Interval(readableDuration22, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusDays(1);
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateMidnight dateMidnight33 = dateTime32.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DurationField durationField36 = durationFieldType34.getField(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight33.withFieldAdded(durationFieldType34, 35268191);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean43 = localDateTime39.isSupported(dateTimeFieldType42);
        org.joda.time.DateMidnight.Property property44 = dateMidnight38.property(dateTimeFieldType42);
        org.joda.time.DateTime.Property property45 = dateTime27.property(dateTimeFieldType42);
        long long46 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateMidnight dateMidnight47 = property15.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight48 = property15.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight50 = property15.addWrapFieldToCopy(1014692);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) 10, chronology52);
        org.joda.time.DateTime dateTime55 = dateTime53.withYear(12);
        int int56 = dateTime55.getMillisOfSecond();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime55.toMutableDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime55.plusMinutes((int) '4');
        org.joda.time.DateTime dateTime61 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime63 = dateTime61.withMillisOfSecond(900);
        org.joda.time.DateMidnight dateMidnight64 = dateTime61.toDateMidnight();
        boolean boolean65 = dateMidnight50.isAfter((org.joda.time.ReadableInstant) dateMidnight64);
        int int66 = dateMidnight50.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud654" + "'", str21, "\ud654");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1074187699L + "'", long46 == 1074187699L);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.withDayOfYear(100);
        org.joda.time.DateTime dateTime9 = dateTime4.plusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime11 = dateTime4.withMillisOfDay(32769);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        long long17 = dateTimeZone13.adjustOffset(225608213L, true);
        boolean boolean18 = dateTimeZone13.isFixed();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths(292278993);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.weekOfWeekyear();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime21);
        int int25 = dateTime21.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 225608213L + "'", long17 == 225608213L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime8 = dateTime4.minusMonths(358);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime11 = dateTime8.withFieldAdded(durationFieldType9, 0);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(locale13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        boolean boolean23 = calendar14.after((java.lang.Object) localDateTime20);
        org.joda.time.Chronology chronology24 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology24);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.monthOfYear();
        org.joda.time.DateMidnight dateMidnight28 = property27.roundHalfEvenCopy();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Interval interval31 = new org.joda.time.Interval(obj29, chronology30);
        long long32 = interval31.toDurationMillis();
        org.joda.time.Period period33 = interval31.toPeriod();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 10, chronology35);
        java.util.Date date37 = dateTime36.toDate();
        org.joda.time.DateTime dateTime39 = dateTime36.withYearOfEra(1);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withPeriodAdded(readablePeriod44, (int) '#');
        int[] intArray47 = localDateTime43.getValues();
        boolean boolean48 = dateTimeZone42.isLocalDateTimeGap(localDateTime43);
        org.joda.time.LocalDateTime.Property property49 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfFloorCopy();
        int int51 = localDateTime50.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withPeriodAdded(readablePeriod56, (int) '#');
        int[] intArray59 = localDateTime55.getValues();
        boolean boolean60 = dateTimeZone54.isLocalDateTimeGap(localDateTime55);
        org.joda.time.LocalDateTime.Property property61 = localDateTime55.millisOfDay();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime64 = property63.withMaximumValue();
        org.joda.time.DateTime dateTime65 = localDateTime64.toDateTime();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withYear(900);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Interval interval70 = new org.joda.time.Interval(obj68, chronology69);
        boolean boolean71 = interval70.containsNow();
        org.joda.time.Duration duration72 = interval70.toDuration();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.minus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime50.withDurationAdded((org.joda.time.ReadableDuration) duration72, 32769);
        org.joda.time.DateTime dateTime76 = dateTime39.plus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Interval interval77 = interval31.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration72);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight28.plus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.DateTime dateTime80 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration72, 607);
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.withWeekyear(2021);
        org.joda.time.DateMidnight dateMidnight85 = dateMidnight83.withWeekyear(1970);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight83.plus(readablePeriod86);
        org.joda.time.Interval interval88 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration72, (org.joda.time.ReadableInstant) dateMidnight87);
        org.joda.time.Chronology chronology89 = dateMidnight87.getChronology();
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight87.withDurationAdded((long) 2941038, (int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight94 = dateMidnight92.withMillis(1644573305674L);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1644573462641,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=641,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(intArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[2022, 2, 15, 53382641]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(intArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[2022, 2, 15, 53382641]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateMidnight78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateMidnight83);
        org.junit.Assert.assertNotNull(dateMidnight85);
        org.junit.Assert.assertNotNull(dateMidnight87);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertNotNull(dateMidnight92);
        org.junit.Assert.assertNotNull(dateMidnight94);
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        java.lang.Object obj4 = null;
        boolean boolean5 = interval2.equals(obj4);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.plus(readableDuration8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withFieldAdded(durationFieldType10, 0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.withDurationAdded(readableDuration13, 0);
        org.joda.time.Interval interval16 = interval2.withStart((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 10, chronology18);
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime dateTime22 = dateTime19.withYearOfEra(1);
        org.joda.time.DateMidnight dateMidnight23 = dateTime19.toDateMidnight();
        org.joda.time.Interval interval24 = interval2.withStart((org.joda.time.ReadableInstant) dateTime19);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime19.withFields((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.DateTime.Property property29 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime30 = property29.roundFloorCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.plusWeeks(52926644);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime30.withTime(1366, 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(35268191);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        boolean boolean21 = calendar12.after((java.lang.Object) localDateTime18);
        org.joda.time.Chronology chronology22 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.weekOfWeekyear();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale26);
        java.lang.String str28 = dateTimeField23.getAsShortText((long) 100, locale26);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        int int30 = dateTimeField23.getMaximumShortTextLength(locale29);
        boolean boolean31 = locale29.hasExtensions();
        java.util.Locale locale32 = locale29.stripExtensions();
        java.lang.String str33 = locale29.getLanguage();
        java.util.Calendar calendar34 = dateMidnight6.toCalendar(locale29);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1644573462713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=713,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1644573462713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=713,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fr" + "'", str33, "fr");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=-17520000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=363120000,DST_OFFSET=0]");
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfMinute();
        int int17 = dateTimeField15.getMaximumValue(1644573020132L);
        boolean boolean18 = dateTimeField15.isSupported();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573462754,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=754,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399999);
        org.joda.time.LocalTime localTime3 = localTime1.plusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime5 = localTime3.minusHours(8);
        int int6 = localTime3.getMillisOfSecond();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        boolean boolean20 = calendar11.after((java.lang.Object) localDateTime17);
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.year();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) -1, chronology21);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField26 = chronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.clockhourOfHalfday();
        java.lang.String str29 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology21.dayOfMonth();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withPeriodAdded(readablePeriod37, (int) '#');
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.minuteOfHour();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.minuteOfHour();
        boolean boolean44 = calendar35.after((java.lang.Object) localDateTime41);
        org.joda.time.Chronology chronology45 = localDateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.secondOfMinute();
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("8");
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withPeriodAdded(readablePeriod57, (int) '#');
        int[] intArray60 = localDateTime56.getValues();
        boolean boolean61 = dateTimeZone55.isLocalDateTimeGap(localDateTime56);
        int int63 = dateTimeZone55.getOffsetFromLocal((long) 4);
        java.util.Locale locale66 = new java.util.Locale("");
        java.lang.String str67 = dateTimeZone55.getName((long) 9, locale66);
        java.lang.String str68 = locale52.getDisplayLanguage(locale66);
        java.util.Locale locale69 = java.util.Locale.ENGLISH;
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.lang.String str72 = locale70.getDisplayVariant();
        java.lang.String str73 = locale52.getDisplayScript(locale70);
        java.lang.String str74 = locale51.getDisplayName(locale52);
        int int75 = dateTimeField49.getMaximumShortTextLength(locale52);
        java.lang.String str76 = dateTimeField31.getAsShortText((long) 52906561, locale52);
        java.lang.String str77 = locale52.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = localTime3.toString("Italy", locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 999 + "'", int6 == 999);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644573462766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ISOChronology[UTC]" + "'", str29, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar35);
// flaky:         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1644573462766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(intArray60);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[2022, 2, 15, 53382766]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 363120000 + "'", int63 == 363120000);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+100:52" + "'", str67, "+100:52");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Japanese" + "'", str68, "Japanese");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1" + "'", str76, "1");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "ja-JP" + "'", str77, "ja-JP");
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(0L, dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, (int) '#');
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        boolean boolean32 = localDateTime23.isAfter((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.centuries();
        boolean boolean34 = localDateTime29.isSupported(durationFieldType33);
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withPeriodAdded(readablePeriod43, (int) '#');
        int[] intArray46 = localDateTime42.getValues();
        boolean boolean47 = dateTimeZone41.isLocalDateTimeGap(localDateTime42);
        int int49 = dateTimeZone41.getOffsetFromLocal((long) 4);
        java.util.Locale locale52 = new java.util.Locale("");
        java.lang.String str53 = dateTimeZone41.getName((long) 9, locale52);
        java.lang.String str54 = locale38.getDisplayLanguage(locale52);
        java.lang.String str55 = locale36.getDisplayLanguage(locale52);
        java.lang.String str56 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDateTime29, locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withPivotYear((int) '#');
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.util.Locale locale62 = locale61.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter60.withLocale(locale62);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withPeriodAdded(readablePeriod68, (int) '#');
        int[] intArray71 = localDateTime67.getValues();
        boolean boolean72 = dateTimeZone66.isLocalDateTimeGap(localDateTime67);
        org.joda.time.DateMidnight dateMidnight73 = org.joda.time.DateMidnight.now(dateTimeZone66);
        java.lang.String str74 = dateTimeFormatter63.print((org.joda.time.ReadableInstant) dateMidnight73);
        java.util.Locale locale75 = dateTimeFormatter63.getLocale();
        java.lang.String str76 = locale75.getScript();
        java.lang.String str77 = locale75.getScript();
        java.lang.String str78 = dateTimeField18.getAsText((-1), locale75);
        java.lang.String str80 = locale75.getExtension('x');
        java.util.Locale locale83 = new java.util.Locale("8045-05-14T06:40:28.065", "52821583");
        java.lang.String str84 = locale75.getDisplayCountry(locale83);
        java.lang.String str85 = locale83.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573462790,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=790,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[2022, 2, 15, 53382791]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 363120000 + "'", int49 == 363120000);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+100:52" + "'", str53, "+100:52");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Japanese" + "'", str54, "Japanese");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "English" + "'", str55, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "15" + "'", str56, "15");
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(intArray71);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[2022, 2, 15, 53382791]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "2022-046T00:00:00.000+100:52" + "'", str74, "2022-046T00:00:00.000+100:52");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "-1" + "'", str78, "-1");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertEquals(locale83.toString(), "8045-05-14t06:40:28.065_52821583");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "South Korea" + "'", str84, "South Korea");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "52821583" + "'", str85, "52821583");
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        java.time.Instant instant4 = date3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long11 = dateTimeZone7.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusMillis((int) (short) 10);
        boolean boolean21 = dateTimeZone7.isLocalDateTimeGap(localDateTime16);
        long long23 = dateTimeZone7.convertUTCToLocal(0L);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date25 = localDateTime24.toDate();
        date25.setTime(63432115200000L);
        int int28 = date25.getDate();
        boolean boolean29 = date3.before(date25);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-327851809L) + "'", long11 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 363120000L + "'", long23 == 363120000L);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Feb 01 00:00:00 UTC 3980");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        org.joda.time.DurationField durationField19 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.millisOfDay();
        java.lang.String str22 = chronology16.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573462838,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=838,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long20 = dateTimeZone16.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusMillis((int) (short) 10);
        boolean boolean30 = dateTimeZone16.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.plusMinutes((int) (short) 1);
        long long34 = chronology12.set((org.joda.time.ReadablePartial) localDateTime32, (long) 32);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        int int37 = localDateTime36.getMillisOfDay();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573462852,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=852,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-327851809L) + "'", long20 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-31172820000L) + "'", long34 == (-31172820000L));
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17580000 + "'", int37 == 17580000);
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        java.lang.String str12 = calendar2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573462872,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=872,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.util.GregorianCalendar[time=1644573462872,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=872,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str12, "java.util.GregorianCalendar[time=1644573462872,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=872,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 70);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withCenturyOfEra((int) '#');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minus(readableDuration19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusDays(1);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime31 = dateTime26.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int33 = dateTime26.get(dateTimeFieldType32);
        org.joda.time.DateTime.Property property34 = dateTime26.year();
        org.joda.time.DateTime dateTime35 = property34.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime37 = dateTime35.minusMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime38 = dateTime37.toLocalDateTime();
        org.joda.time.DateTime dateTime40 = dateTime37.withYear(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime.Property property42 = dateTime37.property(dateTimeFieldType41);
        int int43 = localDateTime20.get(dateTimeFieldType41);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withPeriodAdded(readablePeriod48, (int) '#');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfDay();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.minuteOfHour();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.minuteOfHour();
        boolean boolean55 = calendar46.after((java.lang.Object) localDateTime52);
        org.joda.time.Chronology chronology56 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.clockhourOfHalfday();
        org.joda.time.DurationField durationField60 = chronology56.minutes();
        org.joda.time.DateTimeField dateTimeField61 = chronology56.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology56.hours();
        org.joda.time.DateTimeField dateTimeField63 = chronology56.minuteOfDay();
        boolean boolean64 = dateTimeFieldType41.isSupported(chronology56);
        org.joda.time.DateTime dateTime66 = dateTime1.withField(dateTimeFieldType41, 69);
        int int67 = dateTime66.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 53382885]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 22 + "'", int43 == 22);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1644573462885,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=885,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 5 + "'", int67 == 5);
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(1);
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateMidnight dateMidnight13 = dateTime12.toDateMidnight();
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.weekyear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withChronology(chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withPeriodAdded(readablePeriod21, (int) '#');
        int[] intArray24 = localDateTime20.getValues();
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime20);
        org.joda.time.LocalDateTime.Property property26 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight13.withField(dateTimeFieldType28, (int) (short) 10);
        org.joda.time.DateTime dateTime31 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime8.minusYears(0);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusDays(1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.ReadablePartial readablePartial37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = localDateTime33.compareTo(readablePartial37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[2022, 2, 15, 53382920]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int7 = localDate4.get(dateTimeFieldType6);
        org.joda.time.LocalDate localDate9 = localDate4.minusMonths(363120000);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.halfdayOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight1.withDurationAdded((long) (short) 0, 7);
        org.joda.time.DateMidnight.Property property10 = dateMidnight1.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = property10.addWrapFieldToCopy(11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 1970);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateMidnight12.toDateTime(dateTimeZone15);
        boolean boolean17 = dateTime16.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withDefaultYear(3);
        boolean boolean21 = dateTimeFormatter18.isOffsetParsed();
        java.util.Locale locale22 = dateTimeFormatter18.getLocale();
        java.lang.String str23 = dateTime16.toString(dateTimeFormatter18);
        org.joda.time.DateTime dateTime25 = dateTime16.plusWeeks(103);
        org.joda.time.DateTime.Property property26 = dateTime16.minuteOfHour();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(locale22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-W13" + "'", str23, "1970-W13");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        boolean boolean9 = dateTime5.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime5.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.DateTime dateTime16 = property14.setCopy(42);
        org.joda.time.DateTime dateTime17 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime18 = property14.getDateTime();
        org.joda.time.DateTime dateTime20 = property14.setCopy(100);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.year();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime25 = dateTime22.withField(dateTimeFieldType23, 2022);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, (int) '#');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        long long36 = interval35.toDurationMillis();
        org.joda.time.Period period37 = interval35.toPeriod();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime39 = dateTime22.minus((org.joda.time.ReadablePeriod) period37);
        java.lang.String str40 = period37.toString();
        int[] intArray43 = chronology13.get((org.joda.time.ReadablePeriod) period37, (long) 'a', 0L);
        org.joda.time.DateTimeField dateTimeField44 = chronology13.minuteOfHour();
        int int45 = dateTimeField44.getMinimumValue();
        long long48 = dateTimeField44.getDifferenceAsLong(28800000L, 999L);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573462986,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=42,MILLISECOND=986,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, 0, 0, 0, 0, -97]");
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 479L + "'", long48 == 479L);
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property11 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime4.withField(dateTimeFieldType12, 86399999);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMonths(17520);
        boolean boolean17 = dateTime14.isAfterNow();
        boolean boolean19 = dateTime14.isEqual((long) 292278993);
        org.joda.time.DateTime.Property property20 = dateTime14.yearOfEra();
        int int21 = property20.getMinimumValue();
        org.joda.time.DateTime dateTime22 = property20.getDateTime();
        int int23 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTimeISO();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        java.util.Date date5 = new java.util.Date(0, (int) 'a', 69, 5, 10);
        date5.setSeconds(298);
        date5.setSeconds(52873785);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date5);
        date5.setSeconds(52895692);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Aug 16 09:33:52 UTC 1911");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        calendar2.setTimeZone(timeZone18);
        calendar2.setTimeInMillis(467276225L);
        calendar2.set(3522, 1073453519, 98531);
        boolean boolean26 = calendar2.isWeekDateSupported();
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(locale28);
        calendar29.clear();
        calendar29.roll(363120000, (int) (short) 0);
        int int34 = calendar29.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        java.util.Date date37 = localDate36.toDate();
        calendar29.setTime(date37);
        java.lang.String str39 = date37.toLocaleString();
        int int40 = date37.getDay();
        java.time.Instant instant41 = date37.toInstant();
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.fromDateFields(date37);
        calendar2.setTime(date37);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=50,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=52,SECOND=0,MILLISECOND=0,ZONE_OFFSET=363120000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Feb 15 00:00:00 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feb 15, 2022 12:00:00 AM" + "'", str39, "Feb 15, 2022 12:00:00 AM");
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(localDate42);
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate7 = localDate4.minusWeeks(19);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long14 = dateTimeZone10.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone10.isLocalDateTimeGap(localDateTime15);
        java.lang.String str17 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime18 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        int int20 = dateTimeZone10.getOffset((long) 52846932);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        int int23 = dateTimeZone10.getStandardOffset((long) 58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-327851809L) + "'", long14 == (-327851809L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:52" + "'", str17, "+100:52");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 363120000 + "'", int20 == 363120000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 363120000 + "'", int23 == 363120000);
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.era();
        org.joda.time.DurationField durationField19 = chronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.yearOfEra();
        org.joda.time.DurationField durationField21 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology13.dayOfWeek();
        org.joda.time.DurationField durationField23 = chronology13.halfdays();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573463066,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=66,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(13);
        org.joda.time.DateTime.Property property7 = dateTime2.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(55);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(993);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(4, 0);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale4.getDisplayVariant(locale9);
        java.lang.String str11 = locale4.getDisplayName();
        java.util.Calendar.Builder builder12 = builder3.setLocale(locale4);
        java.util.Calendar.Builder builder16 = builder12.setDate(0, 1439, 122);
        java.util.Calendar.Builder builder20 = builder12.setDate(46, 74, (int) (byte) 1);
        java.util.Calendar calendar21 = builder12.build();
        java.util.Calendar.Builder builder26 = builder12.setTimeOfDay(10, 17520010, 52807920, 52870427);
        java.util.Calendar.Builder builder30 = builder26.setWeekDate(15, 52851532, (int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, (int) '#');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        boolean boolean43 = calendar34.after((java.lang.Object) localDateTime40);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.year();
        boolean boolean46 = dateTimeFieldType31.isSupported(chronology44);
        org.joda.time.DurationField durationField47 = chronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.secondOfDay();
        org.joda.time.DurationField durationField49 = chronology44.days();
        org.joda.time.DateTimeField dateTimeField50 = chronology44.millisOfSecond();
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Locale locale55 = locale53.stripExtensions();
        java.lang.String str56 = dateTimeField50.getAsText(2, locale55);
        java.util.Calendar.Builder builder57 = builder30.setLocale(locale55);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "German" + "'", str11, "German");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-60521212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=52,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=61,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1644573463095,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=95,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2" + "'", str56, "2");
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury(12);
        org.joda.time.Interval interval10 = dateMidnight4.toInterval();
        boolean boolean11 = dateMidnight4.isBeforeNow();
        java.lang.String str12 = dateMidnight4.toString();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight4.minusWeeks(11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, (int) '#');
        int[] intArray22 = localDateTime18.getValues();
        boolean boolean23 = dateTimeZone17.isLocalDateTimeGap(localDateTime18);
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property26.withMaximumValue();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYear(900);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval(obj31, chronology32);
        boolean boolean34 = interval33.containsNow();
        org.joda.time.Duration duration35 = interval33.toDuration();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight4.plus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Interval interval38 = dateMidnight4.toInterval();
        long long39 = interval38.toDurationMillis();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        boolean boolean43 = interval42.containsNow();
        org.joda.time.DateTime dateTime44 = interval42.getStart();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        long long55 = interval54.toDurationMillis();
        org.joda.time.Period period56 = interval54.toPeriod();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.PeriodType periodType58 = period56.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod59 = period56.toMutablePeriod();
        org.joda.time.Interval interval60 = interval42.withPeriodAfterStart((org.joda.time.ReadablePeriod) period56);
        boolean boolean61 = interval38.contains((org.joda.time.ReadableInterval) interval42);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-16T00:00:00.000+100:52" + "'", str12, "2022-02-16T00:00:00.000+100:52");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 2, 15, 53383118]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 86400000L + "'", long39 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        java.util.Date date4 = dateTime3.toDate();
        org.joda.time.DateTime dateTime6 = dateTime3.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((-1953900028000L), 10);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.DateTime dateTime12 = dateTime3.withDayOfYear(10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusDays(1);
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.DateMidnight dateMidnight28 = dateTime27.toDateMidnight();
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withChronology(chronology30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, (int) '#');
        int[] intArray39 = localDateTime35.getValues();
        boolean boolean40 = dateTimeZone34.isLocalDateTimeGap(localDateTime35);
        org.joda.time.LocalDateTime.Property property41 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight28.withField(dateTimeFieldType43, (int) (short) 10);
        org.joda.time.DateTime dateTime46 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withPeriodAdded(readablePeriod48, (int) '#');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfDay();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.minuteOfHour();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Interval interval56 = new org.joda.time.Interval(obj54, chronology55);
        long long57 = interval56.toDurationMillis();
        org.joda.time.Period period58 = interval56.toPeriod();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime52.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight45.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.DateTime dateTime61 = dateTime14.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.DurationFieldType durationFieldType63 = period58.getFieldType((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusDays(1);
        org.joda.time.DateTime dateTime67 = localDateTime66.toDateTime();
        org.joda.time.DateMidnight dateMidnight68 = dateTime67.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DurationField durationField71 = durationFieldType69.getField(chronology70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight68.withFieldAdded(durationFieldType69, 35268191);
        org.joda.time.LocalDateTime localDateTime74 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean78 = localDateTime74.isSupported(dateTimeFieldType77);
        org.joda.time.DateMidnight.Property property79 = dateMidnight73.property(dateTimeFieldType77);
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType77.getDurationType();
        int int81 = period58.get(durationFieldType80);
        org.joda.time.DateTime dateTime82 = dateTime12.plus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.DateTime dateTime84 = dateTime82.minusHours(23);
        org.joda.time.Chronology chronology85 = dateTime84.getChronology();
        org.joda.time.Chronology chronology86 = dateTime84.getChronology();
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight((long) 53107039, chronology86);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2022, 2, 15, 53383145]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateMidnight68);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(chronology86);
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-15T14:44:06.821");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-15T14:44:06.821\" is malformed at \"T14:44:06.821\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long7 = dateTimeZone3.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(0L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusMillis((int) (short) 10);
        boolean boolean17 = dateTimeZone3.isLocalDateTimeGap(localDateTime12);
        long long19 = dateTimeZone3.convertUTCToLocal(0L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) 1644572892998L, dateTimeZone3);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = chronology22.getDateTimeMillis(52984795, 35268191, 53013582, (-52941033), (int) '#', 53330465, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52941033 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-327851809L) + "'", long7 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 363120000L + "'", long19 == 363120000L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withField(dateTimeFieldType12, 2022);
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType12.getRangeDurationType();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, (int) '#');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.minuteOfHour();
        boolean boolean27 = calendar18.after((java.lang.Object) localDateTime24);
        org.joda.time.Chronology chronology28 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.months();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long36 = dateTimeZone32.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0L, dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        boolean boolean43 = localDateTime41.isSupported(dateTimeFieldType42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minusMillis((int) (short) 10);
        boolean boolean46 = dateTimeZone32.isLocalDateTimeGap(localDateTime41);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime41.plusMinutes((int) (short) 1);
        long long50 = chronology28.set((org.joda.time.ReadablePartial) localDateTime48, (long) 32);
        org.joda.time.DurationField durationField51 = chronology28.minutes();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType12.getField(chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(96, 882, 52848, (int) (byte) -1, 124, 97, 52951322, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1644573463224,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=224,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-327851809L) + "'", long36 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-31172820000L) + "'", long50 == (-31172820000L));
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long20 = dateTimeZone16.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusMillis((int) (short) 10);
        boolean boolean30 = dateTimeZone16.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.plusMinutes((int) (short) 1);
        long long34 = chronology12.set((org.joda.time.ReadablePartial) localDateTime32, (long) 32);
        org.joda.time.DateTimeZone dateTimeZone35 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField36 = chronology12.hourOfHalfday();
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.util.Locale locale41 = locale39.stripExtensions();
        java.lang.String str42 = dateTimeField36.getAsText((long) (byte) 100, locale41);
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleKeys();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = locale46.stripExtensions();
        java.lang.String str48 = locale44.getDisplayLanguage(locale46);
        int int49 = dateTimeField36.getMaximumShortTextLength(locale44);
        long long51 = dateTimeField36.roundHalfEven((long) 52816456);
        java.lang.String str52 = dateTimeField36.getName();
        long long54 = dateTimeField36.roundHalfFloor((long) 52952593);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573463241,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=241,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-327851809L) + "'", long20 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-31172820000L) + "'", long34 == (-31172820000L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 54000000L + "'", long51 == 54000000L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hourOfHalfday" + "'", str52, "hourOfHalfday");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 54000000L + "'", long54 == 54000000L);
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        java.util.Date date5 = new java.util.Date(57, 47, 17520000, 32770, 13);
        java.util.Date date12 = new java.util.Date((int) '#', 70, (int) 'u', 9, 7, 8);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        boolean boolean14 = date5.before(date12);
        int int15 = date5.getMinutes();
        java.time.Instant instant16 = date5.toInstant();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Oct 13 10:13:00 UTC 49932");
        org.junit.Assert.assertEquals(date12.toString(), "Tue Feb 25 09:07:08 UTC 1941");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusWeeks(41039990);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withWeekyear(344);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53383270]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        int int10 = property9.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.minus(readableDuration16);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        boolean boolean30 = calendar21.after((java.lang.Object) localDateTime27);
        org.joda.time.Chronology chronology31 = localDateTime27.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 100, chronology31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        long long36 = interval35.toDurationMillis();
        org.joda.time.Period period37 = interval35.toPeriod();
        java.lang.String str38 = period37.toString();
        long long41 = chronology31.add((org.joda.time.ReadablePeriod) period37, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight17.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.MutablePeriod mutablePeriod43 = period37.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean45 = mutablePeriod43.isSupported(durationFieldType44);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime11.minus((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withPeriodAdded(readablePeriod53, (int) '#');
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.minuteOfHour();
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.minuteOfHour();
        boolean boolean60 = localDateTime51.isAfter((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.centuries();
        boolean boolean62 = localDateTime57.isSupported(durationFieldType61);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime46.withFields((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime.Property property64 = localDateTime57.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime57.withMillisOfDay(821);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53383284]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644573463284,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=284,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0S" + "'", str38, "PT0S");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDateTime66);
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        java.lang.Object obj4 = null;
        boolean boolean5 = interval2.equals(obj4);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.plus(readableDuration8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withFieldAdded(durationFieldType10, 0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.withDurationAdded(readableDuration13, 0);
        org.joda.time.Interval interval16 = interval2.withStart((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Interval interval18 = interval16.withDurationBeforeEnd(readableDuration17);
        boolean boolean20 = interval18.isAfter((long) 8);
        org.joda.time.Interval interval22 = interval18.withStartMillis((-17520000L));
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        long long26 = interval25.toDurationMillis();
        java.lang.Object obj27 = null;
        boolean boolean28 = interval25.equals(obj27);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plus(readableDuration31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.withFieldAdded(durationFieldType33, 0);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight35.withDurationAdded(readableDuration36, 0);
        org.joda.time.Interval interval39 = interval25.withStart((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 10, chronology41);
        java.util.Date date43 = dateTime42.toDate();
        org.joda.time.DateTime dateTime45 = dateTime42.withYearOfEra(1);
        org.joda.time.DateMidnight dateMidnight46 = dateTime42.toDateMidnight();
        org.joda.time.Interval interval47 = interval25.withStart((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Interval interval48 = interval18.gap((org.joda.time.ReadableInterval) interval47);
        boolean boolean50 = interval47.isBefore((long) 39);
        long long51 = interval47.getStartMillis();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNull(interval48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.centuryOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime19 = dateTime17.plus((long) 53101864);
        org.joda.time.DateTime dateTime21 = dateTime19.withYear(7222);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(220);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withDayOfYear(142);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int[] intArray15 = localDateTime13.getValues();
        int int16 = localDateTime13.getYearOfEra();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573463372,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=372,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 5, 22, 53383372]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator5 = strSet4.spliterator();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSpliterator5);
    }

    @Test
    public void test19575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19575");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = property5.addToCopy((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusYears((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(1);
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear(12);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        java.lang.String str19 = dateTimeFormatter10.print((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withOffsetParsed();
        java.lang.String str22 = dateMidnight9.toString(dateTimeFormatter20);
        org.joda.time.DateMidnight.Property property23 = dateMidnight9.era();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusDays(1);
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.DateTime dateTime28 = dateTime27.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime33 = dateTime28.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property34 = dateTime28.minuteOfHour();
        org.joda.time.DateTime.Property property35 = dateTime28.weekOfWeekyear();
        org.joda.time.DateTime dateTime37 = dateTime28.withMillisOfDay(35268191);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.plus(readableDuration41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight40.withFieldAdded(durationFieldType43, 0);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.weekyear();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight45.plusDays(35268191);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.withWeekyear(20);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withPeriodAdded(readablePeriod55, (int) '#');
        int[] intArray58 = localDateTime54.getValues();
        boolean boolean59 = dateTimeZone53.isLocalDateTimeGap(localDateTime54);
        org.joda.time.LocalDateTime.Property property60 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property60.getFieldType();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight50.withField(dateTimeFieldType62, 35268191);
        int int65 = dateMidnight50.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withPeriodAdded(readablePeriod67, (int) '#');
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfDay();
        org.joda.time.LocalDateTime localDateTime71 = property70.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.minuteOfHour();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Interval interval75 = new org.joda.time.Interval(obj73, chronology74);
        long long76 = interval75.toDurationMillis();
        org.joda.time.Period period77 = interval75.toPeriod();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime71.minus((org.joda.time.ReadablePeriod) period77);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight50.minus((org.joda.time.ReadablePeriod) period77);
        org.joda.time.DateTime dateTime80 = dateTime37.minus((org.joda.time.ReadablePeriod) period77);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight9.minus((org.joda.time.ReadablePeriod) period77);
        java.util.Date date82 = dateMidnight81.toDate();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "14:49:43.393" + "'", str19, "14:49:43.393");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00:00:00.000" + "'", str22, "00:00:00.000");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(intArray58);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[2022, 2, 15, 53383393]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(dateMidnight79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateMidnight81);
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Feb 11 19:08:00 UTC 2021");
    }

    @Test
    public void test19576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19576");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53271530, 53152233, 592, 0, 365, 2069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19577");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.hourOfHalfday();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime21 = dateTime19.plusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        boolean boolean28 = property26.isLeap();
        org.joda.time.LocalDateTime localDateTime29 = property26.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime31 = property26.addToCopy(52854475);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, (int) '#');
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = property37.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusDays(1);
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.DateMidnight dateMidnight44 = dateTime43.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DurationField durationField47 = durationFieldType45.getField(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight44.withFieldAdded(durationFieldType45, 35268191);
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean54 = localDateTime50.isSupported(dateTimeFieldType53);
        org.joda.time.DateMidnight.Property property55 = dateMidnight49.property(dateTimeFieldType53);
        org.joda.time.DateMidnight dateMidnight57 = property55.addToCopy(11);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withPeriodAdded(readablePeriod62, (int) '#');
        int[] intArray65 = localDateTime61.getValues();
        boolean boolean66 = dateTimeZone60.isLocalDateTimeGap(localDateTime61);
        org.joda.time.LocalDateTime.Property property67 = localDateTime61.millisOfDay();
        org.joda.time.LocalDateTime localDateTime68 = property67.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property67.getFieldType();
        int int70 = dateMidnight57.get(dateTimeFieldType69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime39.property(dateTimeFieldType69);
        org.joda.time.LocalDateTime.Property property72 = localDateTime31.property(dateTimeFieldType69);
        org.joda.time.DateTime dateTime74 = dateTime21.withField(dateTimeFieldType69, 52848);
        java.util.Locale locale75 = java.util.Locale.KOREA;
        java.util.Locale locale76 = locale75.stripExtensions();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale76);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.withPeriodAdded(readablePeriod79, (int) '#');
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.millisOfDay();
        org.joda.time.LocalDateTime localDateTime83 = property82.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.minuteOfHour();
        org.joda.time.LocalDateTime.Property property85 = localDateTime83.minuteOfHour();
        boolean boolean86 = calendar77.after((java.lang.Object) localDateTime83);
        org.joda.time.Chronology chronology87 = localDateTime83.getChronology();
        org.joda.time.DateTimeField dateTimeField88 = chronology87.weekOfWeekyear();
        org.joda.time.DurationField durationField89 = chronology87.weeks();
        org.joda.time.DurationField durationField90 = chronology87.millis();
        org.joda.time.DateTime dateTime91 = dateTime74.toDateTime(chronology87);
        org.joda.time.DurationField durationField92 = chronology87.years();
        org.joda.time.DateTimeField dateTimeField93 = chronology87.secondOfMinute();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573463453,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=453,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(intArray65);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[2022, 2, 15, 53383454]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar77);
// flaky:         org.junit.Assert.assertEquals(calendar77.toString(), "java.util.GregorianCalendar[time=1644573463454,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=454,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(dateTimeField93);
    }

    @Test
    public void test19578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19578");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(352662);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property14.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays(1);
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateMidnight dateMidnight20 = dateTime19.toDateMidnight();
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.weekyear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight20.withYearOfCentury(12);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale27);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withPeriodAdded(readablePeriod30, (int) '#');
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.minuteOfHour();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.minuteOfHour();
        boolean boolean37 = calendar28.after((java.lang.Object) localDateTime34);
        org.joda.time.Chronology chronology38 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight25.withChronology(chronology38);
        org.joda.time.DurationField durationField42 = chronology38.weeks();
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = locale43.stripExtensions();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withPeriodAdded(readablePeriod47, (int) '#');
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.minuteOfHour();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.minuteOfHour();
        boolean boolean54 = calendar45.after((java.lang.Object) localDateTime51);
        org.joda.time.Chronology chronology55 = localDateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight57 = org.joda.time.DateMidnight.now(chronology55);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight59.minus(readableDuration62);
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(locale66);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withPeriodAdded(readablePeriod69, (int) '#');
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.millisOfDay();
        org.joda.time.LocalDateTime localDateTime73 = property72.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.minuteOfHour();
        org.joda.time.LocalDateTime.Property property75 = localDateTime73.minuteOfHour();
        boolean boolean76 = calendar67.after((java.lang.Object) localDateTime73);
        org.joda.time.Chronology chronology77 = localDateTime73.getChronology();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) (byte) 100, chronology77);
        java.lang.Object obj79 = null;
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Interval interval81 = new org.joda.time.Interval(obj79, chronology80);
        long long82 = interval81.toDurationMillis();
        org.joda.time.Period period83 = interval81.toPeriod();
        java.lang.String str84 = period83.toString();
        long long87 = chronology77.add((org.joda.time.ReadablePeriod) period83, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight63.minus((org.joda.time.ReadablePeriod) period83);
        int[] intArray91 = chronology55.get((org.joda.time.ReadablePeriod) period83, (long) 47, 3801600000L);
        int[] intArray94 = chronology38.get((org.joda.time.ReadablePeriod) period83, (long) (short) 100, 1L);
        org.joda.time.LocalDateTime localDateTime96 = localDateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period83, 100);
        org.joda.time.PeriodType periodType97 = period83.getPeriodType();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573463507,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=507,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1644573463507,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=507,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1644573463507,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=507,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar67);
// flaky:         org.junit.Assert.assertEquals(calendar67.toString(), "java.util.GregorianCalendar[time=1644573463507,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=507,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PT0S" + "'", str84, "PT0S");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 100L + "'", long87 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight88);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0, 1, 1, 5, 23, 59, 59, 953]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[0, 0, 0, 0, 0, 0, 0, -99]");
        org.junit.Assert.assertNotNull(localDateTime96);
        org.junit.Assert.assertNotNull(periodType97);
    }

    @Test
    public void test19579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        int int4 = date3.getYear();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.LocalDate localDate7 = localDate5.withYear(1970);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(46);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        int int11 = localDate9.getYearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate9.era();
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test19580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.plus(readableDuration5);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(1);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(2021);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(52836254);
        int int14 = dateTime13.getCenturyOfEra();
        org.joda.time.LocalDate localDate15 = dateTime13.toLocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.minusDays(2);
        org.joda.time.LocalDate localDate19 = localDate15.withYear((-3655));
        org.joda.time.LocalDate localDate21 = localDate15.plusMonths((-11));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-05T04:52:00.010+100:52" + "'", str7, "1970-01-05T04:52:00.010+100:52");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 18 + "'", int14 == 18);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test19581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19581");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 70);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis((int) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMinutes(100);
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(12);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTimeISO();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        boolean boolean25 = interval24.containsNow();
        org.joda.time.Duration duration26 = interval24.toDuration();
        org.joda.time.DateTime dateTime27 = dateTime20.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.withMillis(1644573339062L);
        org.joda.time.DateTime.Property property31 = dateTime27.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53383573]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test19582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19582");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        int int10 = localDateTime3.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.plusWeeks(2084);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusHours(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53383591]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test19583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19583");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        calendar2.setLenient(false);
        calendar2.setTimeInMillis((long) (-1));
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        int int12 = calendar2.getWeekYear();
        java.util.TimeZone timeZone13 = calendar2.getTimeZone();
        java.util.TimeZone timeZone14 = calendar2.getTimeZone();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test19584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19584");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("32770");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.now(dateTimeZone4);
        java.lang.String str7 = dateTimeZone4.getNameKey((long) 12);
        java.lang.String str9 = dateTimeZone4.getNameKey((long) 'u');
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone4);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("32770");
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale13.getDisplayScript(locale15);
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleKeys();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale22);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, (int) '#');
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        boolean boolean32 = calendar23.after((java.lang.Object) localDateTime29);
        org.joda.time.Chronology chronology33 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.year();
        boolean boolean35 = dateTimeFieldType20.isSupported(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField38 = chronology33.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology33.millisOfSecond();
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.util.Locale locale42 = java.util.Locale.ENGLISH;
        java.lang.String str43 = locale41.getDisplayVariant(locale42);
        java.util.Locale locale44 = locale42.stripExtensions();
        java.lang.String str45 = dateTimeField39.getAsText(2, locale44);
        java.lang.String str46 = locale13.getDisplayScript(locale44);
        boolean boolean47 = locale44.hasExtensions();
        java.lang.String str48 = dateTimeZone4.getShortName((long) 53147, locale44);
        java.lang.String str49 = locale1.getDisplayCountry(locale44);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1644573463616,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=616,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2" + "'", str45, "2");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+100:52" + "'", str48, "+100:52");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test19585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19585");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfMinute();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.lang.String str25 = locale21.getDisplayScript(locale24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone20, locale24);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withPeriodAdded(readablePeriod33, (int) '#');
        int[] intArray36 = localDateTime32.getValues();
        boolean boolean37 = dateTimeZone31.isLocalDateTimeGap(localDateTime32);
        int int39 = dateTimeZone31.getOffsetFromLocal((long) 4);
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = dateTimeZone31.getName((long) 9, locale42);
        java.lang.String str44 = locale28.getDisplayLanguage(locale42);
        java.util.Locale.Builder builder45 = builder27.setLocale(locale42);
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = locale46.getDisplayVariant(locale47);
        java.util.Locale.Builder builder50 = builder27.setLocale(locale46);
        java.util.Locale locale51 = builder50.build();
        java.lang.String str52 = locale24.getDisplayScript(locale51);
        java.lang.String str53 = locale24.getScript();
        java.util.Calendar calendar54 = dateTime11.toCalendar(locale24);
        org.joda.time.DateMidnight dateMidnight55 = dateTime11.toDateMidnight();
        org.joda.time.DateTime.Property property56 = dateTime11.dayOfYear();
        org.joda.time.DateTime dateTime57 = property56.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1644573463639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=49,SECOND=43,MILLISECOND=639,ZONE_OFFSET=363120000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(intArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[2022, 2, 15, 53383639]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 363120000 + "'", int39 == 363120000);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+100:52" + "'", str43, "+100:52");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Japanese" + "'", str44, "Japanese");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(calendar54);
        org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=-61847902247994,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=50,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=1,SECOND=12,MILLISECOND=6,ZONE_OFFSET=363120000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test19586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19586");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekyear();
        org.joda.time.DurationField durationField18 = chronology12.days();
        org.joda.time.DurationField durationField19 = chronology12.centuries();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573463673,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=673,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test19587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19587");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withCenturyOfEra((int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minus(readableDuration17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusHours(0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYear(25);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53383685]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test19588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19588");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("14:46:41.180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay(899);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 899 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test19589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19589");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 59);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addWrapFieldToCopy(4401471);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test19590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19590");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1644572987105L);
    }

    @Test
    public void test19591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19591");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusDays(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime5.getFields();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(1);
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime19 = dateTime14.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int21 = dateTime14.get(dateTimeFieldType20);
        org.joda.time.DateTime.Property property22 = dateTime14.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime25 = dateTime23.minusMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime26 = dateTime25.toLocalDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime.Property property30 = dateTime25.property(dateTimeFieldType29);
        org.joda.time.DateTime.Property property31 = dateTime25.weekOfWeekyear();
        org.joda.time.DateTime dateTime33 = dateTime25.withYear((int) '#');
        org.joda.time.DateTime dateTime34 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime36 = dateTime33.plusWeeks(103);
        org.joda.time.DateTime.Property property37 = dateTime33.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test19592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(13);
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, (int) '#');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        boolean boolean18 = calendar9.after((java.lang.Object) localDateTime15);
        org.joda.time.Chronology chronology19 = localDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        boolean boolean22 = dateTime6.equals((java.lang.Object) chronology19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long29 = dateTimeZone25.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(0L, dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = localDateTime34.isSupported(dateTimeFieldType35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusMillis((int) (short) 10);
        boolean boolean39 = dateTimeZone25.isLocalDateTimeGap(localDateTime34);
        long long41 = dateTimeZone25.convertUTCToLocal(0L);
        org.joda.time.Chronology chronology42 = chronology19.withZone(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone25);
        long long46 = dateTimeZone25.adjustOffset((long) 185, false);
        java.util.TimeZone timeZone47 = dateTimeZone25.toTimeZone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1644573463763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=763,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-327851809L) + "'", long29 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 363120000L + "'", long41 == 363120000L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 185L + "'", long46 == 185L);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "GMT+:0:52");
    }

    @Test
    public void test19593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19593");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minus((long) 12);
        int int10 = dateMidnight9.getDayOfWeek();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 10, chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime18 = dateTime15.withField(dateTimeFieldType16, 2022);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, (int) '#');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        long long29 = interval28.toDurationMillis();
        org.joda.time.Period period30 = interval28.toPeriod();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime24.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DateTime dateTime32 = dateTime15.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DateTime dateTime33 = dateTime15.withLaterOffsetAtOverlap();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval(obj34, chronology35);
        long long37 = interval36.toDurationMillis();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = interval36.toPeriod(periodType38);
        int int40 = period39.size();
        org.joda.time.DateTime dateTime41 = dateTime33.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight9.minus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight9.withWeekyear((-22438));
        org.joda.time.DateMidnight.Property property45 = dateMidnight9.weekyear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight9.minusDays(5107);
        int int48 = dateMidnight47.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight50 = dateMidnight47.withCenturyOfEra(53101471);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53101471 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2008 + "'", int48 == 2008);
    }

    @Test
    public void test19594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19594");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(4, 0);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale4.getDisplayVariant(locale9);
        java.lang.String str11 = locale4.getDisplayName();
        java.util.Calendar.Builder builder12 = builder3.setLocale(locale4);
        java.util.Calendar.Builder builder16 = builder3.setTimeOfDay((int) (byte) -1, 8, (int) (byte) 100);
        java.util.Calendar.Builder builder20 = builder3.setWeekDate(0, 74, 6);
        java.util.Calendar.Builder builder24 = builder3.setDate(32, (int) '4', (int) 'x');
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, (int) '#');
        int[] intArray37 = localDateTime33.getValues();
        boolean boolean38 = dateTimeZone32.isLocalDateTimeGap(localDateTime33);
        int int40 = dateTimeZone32.getOffsetFromLocal((long) 4);
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = dateTimeZone32.getName((long) 9, locale43);
        java.lang.String str45 = locale29.getDisplayLanguage(locale43);
        java.lang.String str46 = locale25.getDisplayCountry(locale43);
        java.util.Set<java.lang.String> strSet47 = locale25.getUnicodeLocaleKeys();
        java.lang.String str48 = locale25.getDisplayCountry();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withPeriodAdded(readablePeriod53, (int) '#');
        int[] intArray56 = localDateTime52.getValues();
        boolean boolean57 = dateTimeZone51.isLocalDateTimeGap(localDateTime52);
        org.joda.time.LocalDateTime.Property property58 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundHalfCeilingCopy();
        java.util.Locale locale61 = java.util.Locale.KOREA;
        org.joda.time.LocalDateTime localDateTime62 = property58.setCopy("35271248", locale61);
        java.lang.String str63 = locale61.getLanguage();
        java.util.Set<java.lang.String> strSet64 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str65 = locale25.getDisplayLanguage(locale61);
        java.util.Calendar.Builder builder66 = builder3.setLocale(locale25);
        java.util.Calendar.Builder builder68 = builder66.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder70 = builder68.setInstant((long) 456825);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "German" + "'", str11, "German");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2022, 2, 15, 53383806]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 363120000 + "'", int40 == 363120000);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+100:52" + "'", str44, "+100:52");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Japanese" + "'", str45, "Japanese");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "South Korea" + "'", str46, "South Korea");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "South Korea" + "'", str48, "South Korea");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(intArray56);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[2022, 2, 15, 53383806]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ko" + "'", str63, "ko");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str65, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test19595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19595");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology12.hours();
        java.lang.String str19 = chronology12.toString();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.Chronology chronology21 = chronology12.withUTC();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573463827,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=827,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[UTC]" + "'", str19, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test19596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19596");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        boolean boolean8 = interval6.contains((long) 52809235);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(obj9, chronology10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval(obj12, chronology13);
        boolean boolean15 = interval14.containsNow();
        org.joda.time.DateTime dateTime16 = interval14.getStart();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateMidnight dateMidnight21 = dateTime20.toDateMidnight();
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.weekyear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withChronology(chronology23);
        boolean boolean25 = interval14.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        boolean boolean26 = interval11.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withPeriodAdded(readablePeriod31, (int) '#');
        int[] intArray34 = localDateTime30.getValues();
        boolean boolean35 = dateTimeZone29.isLocalDateTimeGap(localDateTime30);
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(dateTimeZone29);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.yearOfCentury();
        boolean boolean38 = interval14.isBefore((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight40.minus(readableDuration43);
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = locale46.stripExtensions();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale47);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime54 = property53.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.minuteOfHour();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.minuteOfHour();
        boolean boolean57 = calendar48.after((java.lang.Object) localDateTime54);
        org.joda.time.Chronology chronology58 = localDateTime54.getChronology();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 100, chronology58);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Interval interval62 = new org.joda.time.Interval(obj60, chronology61);
        long long63 = interval62.toDurationMillis();
        org.joda.time.Period period64 = interval62.toPeriod();
        java.lang.String str65 = period64.toString();
        long long68 = chronology58.add((org.joda.time.ReadablePeriod) period64, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight44.minus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.MutablePeriod mutablePeriod70 = period64.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType71 = org.joda.time.DurationFieldType.centuries();
        boolean boolean72 = mutablePeriod70.isSupported(durationFieldType71);
        org.joda.time.PeriodType periodType73 = mutablePeriod70.getPeriodType();
        org.joda.time.Period period74 = interval14.toPeriod(periodType73);
        org.joda.time.Interval interval75 = interval6.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period74);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale77 = java.util.Locale.KOREA;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale78);
        org.joda.time.LocalDateTime localDateTime80 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.withPeriodAdded(readablePeriod81, (int) '#');
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.millisOfDay();
        org.joda.time.LocalDateTime localDateTime85 = property84.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property86 = localDateTime85.minuteOfHour();
        org.joda.time.LocalDateTime.Property property87 = localDateTime85.minuteOfHour();
        boolean boolean88 = calendar79.after((java.lang.Object) localDateTime85);
        org.joda.time.Chronology chronology89 = localDateTime85.getChronology();
        org.joda.time.DateTimeField dateTimeField90 = chronology89.year();
        boolean boolean91 = dateTimeFieldType76.isSupported(chronology89);
        org.joda.time.DurationField durationField92 = chronology89.weekyears();
        org.joda.time.DurationField durationField93 = chronology89.weekyears();
        org.joda.time.Interval interval94 = interval75.withChronology(chronology89);
        boolean boolean95 = interval75.containsNow();
        org.joda.time.MutableInterval mutableInterval96 = interval75.toMutableInterval();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[2022, 2, 15, 53383843]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar48);
// flaky:         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=1644573463843,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=843,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PT0S" + "'", str65, "PT0S");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 100L + "'", long68 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertNotNull(mutablePeriod70);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar79);
// flaky:         org.junit.Assert.assertEquals(calendar79.toString(), "java.util.GregorianCalendar[time=1644573463844,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=844,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(durationField93);
        org.junit.Assert.assertNotNull(interval94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(mutableInterval96);
    }

    @Test
    public void test19597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19597");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.minusMinutes(398424834);
        org.joda.time.LocalTime localTime4 = localTime2.plusMillis(586);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test19598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19598");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(1644936120000L);
    }

    @Test
    public void test19599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19599");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguageTag("months");
        java.util.Locale.Builder builder22 = builder19.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setScript("14:45:02.430");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 14:45:02.430 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 53383907]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test19600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19600");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(3);
        int int14 = localDate4.getDayOfYear();
        org.joda.time.LocalDate localDate16 = localDate4.withCenturyOfEra(8);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone22.toTimeZone();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) 8, dateTimeZone22);
        java.lang.String str27 = dateTimeZone22.getShortName((-1953900028000L));
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.Interval interval29 = localDate16.toInterval(dateTimeZone22);
        org.joda.time.LocalDate localDate31 = localDate16.withCenturyOfEra(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+100:52" + "'", str27, "+100:52");
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test19601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19601");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        org.joda.time.DurationField durationField19 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        long long22 = dateTimeField20.remainder(1644572929000L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573463933,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=933,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test19602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19602");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        boolean boolean3 = interval2.containsNow();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        boolean boolean10 = property9.isLeap();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((-292275054));
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDateTime localDateTime14 = property9.roundHalfFloorCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYear(12);
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds(13);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withPeriodAdded(readablePeriod26, (int) '#');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        boolean boolean33 = calendar24.after((java.lang.Object) localDateTime30);
        org.joda.time.Chronology chronology34 = localDateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.weekOfWeekyear();
        org.joda.time.DurationField durationField36 = chronology34.eras();
        boolean boolean37 = dateTime21.equals((java.lang.Object) chronology34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long44 = dateTimeZone40.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(0L, dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = localDateTime49.isSupported(dateTimeFieldType50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.minusMillis((int) (short) 10);
        boolean boolean54 = dateTimeZone40.isLocalDateTimeGap(localDateTime49);
        long long56 = dateTimeZone40.convertUTCToLocal(0L);
        org.joda.time.Chronology chronology57 = chronology34.withZone(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(dateTimeZone40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime60 = null;
        boolean boolean61 = dateTimeZone40.isLocalDateTimeGap(localDateTime60);
        long long64 = dateTimeZone40.adjustOffset(1644572931511L, true);
        boolean boolean65 = dateTimeZone40.isFixed();
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(dateTimeZone40);
        long long67 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight66);
        int int68 = dateMidnight66.getMillisOfSecond();
        boolean boolean69 = interval2.contains((org.joda.time.ReadableInstant) dateMidnight66);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1644573463949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=43,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-327851809L) + "'", long44 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 363120000L + "'", long56 == 363120000L);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1644572931511L + "'", long64 == 1644572931511L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 416503949L + "'", long67 == 416503949L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test19603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19603");
        java.util.Locale locale1 = new java.util.Locale("1970-01-05T04:52:00.010+100:52/1970-01-05T04:52:00.010+100:52");
        org.junit.Assert.assertEquals(locale1.toString(), "1970-01-05t04:52:00.010+100:52/1970-01-05t04:52:00.010+100:52");
    }

    @Test
    public void test19604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19604");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(63433187586657L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test19605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19605");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.minusSeconds(5);
        org.joda.time.LocalTime.Property property3 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        java.lang.String str5 = property3.getAsShortText();
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test19606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19606");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 35268191);
        org.joda.time.LocalDate localDate3 = localDate1.minusDays(35268191);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfMonth();
        int int5 = localDate1.getMonthOfYear();
        org.joda.time.DateTime dateTime6 = localDate1.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime6.withMonthOfYear(2069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2069 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test19607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19607");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(13);
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        int int8 = dateTime2.getMinuteOfDay();
        org.joda.time.DateTime dateTime10 = dateTime2.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime2.withWeekOfWeekyear(53176137);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53176137 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292 + "'", int8 == 292);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test19608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19608");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate6 = localDate4.plusYears((int) '4');
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(7);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate11 = localDate8.plusWeeks((-1073453520));
        org.joda.time.LocalDate localDate13 = localDate11.minusYears(15);
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        java.util.Locale locale16 = new java.util.Locale("15 Feb 2022 14:40:15 GMT");
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = property14.getAsShortText(locale16);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("2022-02-15T14:40:00.635");
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = locale16.getDisplayLanguage(locale20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals(locale16.toString(), "15 feb 2022 14:40:15 gmt");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "20571044" + "'", str18, "20571044");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "15 feb 2022 14:40:15 gmt" + "'", str22, "15 feb 2022 14:40:15 gmt");
    }

    @Test
    public void test19609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19609");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusDays(1);
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime4.withEarlierOffsetAtOverlap();
        int int6 = dateTime4.getWeekyear();
        org.joda.time.DateTime.Property property7 = dateTime4.weekOfWeekyear();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        int int11 = property7.getMaximumShortTextLength(locale9);
        java.lang.String str12 = locale9.getScript();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale9);
        java.util.Calendar.Builder builder17 = builder0.setTimeOfDay((-22438), 52848392, 2022);
        java.util.Calendar.Builder builder19 = builder17.setLenient(true);
        java.util.Calendar.Builder builder23 = builder19.setTimeOfDay(52848, 2084, 398974842);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test19610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19610");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfMonth(12);
        int int8 = dateTime5.getDayOfWeek();
        org.joda.time.DateTime.Property property9 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime10 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfSecond(11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long19 = dateTimeZone15.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDateTime24.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusMillis((int) (short) 10);
        boolean boolean29 = dateTimeZone15.isLocalDateTimeGap(localDateTime24);
        long long31 = dateTimeZone15.convertUTCToLocal(0L);
        boolean boolean32 = dateTimeZone15.isFixed();
        java.lang.String str33 = dateTimeZone15.getID();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime35 = dateTime12.withZone(dateTimeZone15);
        org.joda.time.DateTime.Property property36 = dateTime35.monthOfYear();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-327851809L) + "'", long19 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 363120000L + "'", long31 == 363120000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+100:52" + "'", str33, "+100:52");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test19611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19611");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = chronology12.weeks();
        org.joda.time.Chronology chronology15 = chronology12.withUTC();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.DurationField durationField17 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology12.getDateTimeMillis(1644573410333L, 295, 491, 52968252, 53122591);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 295 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573464076,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=76,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test19612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19612");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean4 = localDateTime0.isSupported(dateTimeFieldType3);
        boolean boolean6 = localDateTime0.equals((java.lang.Object) 10.0f);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test19613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19613");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(chronology5);
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime10 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = property7.getLocalTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 10, chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withField(dateTimeFieldType17, 2022);
        boolean boolean20 = localTime11.isSupported(dateTimeFieldType17);
        org.joda.time.Chronology chronology21 = localTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(53321, 53197456, 32769, (-1), 398573298, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test19614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.withDayOfYear(100);
        org.joda.time.DateTime dateTime9 = dateTime4.plusSeconds(362);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(1);
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = dateTime9.get(dateTimeField16);
        java.lang.String str18 = dateTimeField16.toString();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        boolean boolean30 = calendar21.after((java.lang.Object) localDateTime27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withYear(35268191);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withPeriodAdded(readablePeriod38, (int) '#');
        int[] intArray41 = localDateTime37.getValues();
        boolean boolean42 = dateTimeZone36.isLocalDateTimeGap(localDateTime37);
        org.joda.time.LocalDateTime.Property property43 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property43.getFieldType();
        boolean boolean46 = localDateTime32.isSupported(dateTimeFieldType45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime32.monthOfYear();
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.lang.String str49 = locale48.getDisplayCountry();
        java.lang.String str50 = property47.getAsShortText(locale48);
        int int51 = dateTimeField16.getMaximumShortTextLength(locale48);
        java.util.Set<java.lang.String> strSet52 = locale48.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateTimeField[weekyear]" + "'", str18, "DateTimeField[weekyear]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644573464116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=116,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(intArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[2022, 2, 15, 53384116]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "France" + "'", str49, "France");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "f\351vr." + "'", str50, "f\351vr.");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertNotNull(strSet52);
    }

    @Test
    public void test19615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19615");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(3);
        int int14 = localDate4.getYear();
        org.joda.time.LocalDate.Property property15 = localDate4.dayOfYear();
        int[] intArray16 = localDate4.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 2, 15]");
    }

    @Test
    public void test19616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19616");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long11 = dateTimeZone7.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.Interval interval12 = localDate4.toInterval(dateTimeZone7);
        int int13 = localDate4.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate4.minusWeeks(0);
        int int16 = localDate15.getWeekOfWeekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate.Property property19 = localDate18.weekyear();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate21.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.LocalDate localDate30 = localDate21.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDate15.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime33.plusYears(74);
        org.joda.time.DateTime dateTime37 = dateTime35.minusYears(70);
        int int38 = dateTime35.getMillisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime35.plusHours(52879599);
        org.joda.time.DateTime dateTime41 = dateTime35.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-327851809L) + "'", long11 == (-327851809L));
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test19617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19617");
        java.lang.Object obj0 = null;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj0, chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.weekyear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime25 = dateTime22.withField(dateTimeFieldType23, 2022);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, (int) '#');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        long long36 = interval35.toDurationMillis();
        org.joda.time.Period period37 = interval35.toPeriod();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime39 = dateTime22.minus((org.joda.time.ReadablePeriod) period37);
        int int40 = period37.size();
        long long43 = chronology13.add((org.joda.time.ReadablePeriod) period37, 1644573049868L, 404);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573464179,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=179,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1644573049868L + "'", long43 == 1644573049868L);
    }

    @Test
    public void test19618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19618");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.plus(readableDuration5);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(1);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(2021);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plus(readableDuration14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withFieldAdded(durationFieldType16, 0);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.weekyear();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.plusDays(35268191);
        org.joda.time.Interval interval22 = dateMidnight21.toInterval();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        long long26 = interval25.toDurationMillis();
        org.joda.time.Period period27 = interval25.toPeriod();
        org.joda.time.Interval interval28 = interval22.withPeriodAfterStart((org.joda.time.ReadablePeriod) period27);
        org.joda.time.DateTime dateTime30 = dateTime9.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 292278993);
        org.joda.time.LocalDate localDate31 = dateTime30.toLocalDate();
        int int32 = localDate31.size();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekyear(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-05T04:52:00.010+100:52" + "'", str7, "1970-01-05T04:52:00.010+100:52");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test19619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19619");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long11 = dateTimeZone7.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.Interval interval12 = localDate4.toInterval(dateTimeZone7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear(15);
        int int15 = localDate14.getEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long22 = dateTimeZone18.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.LocalDate.Property property26 = localDate14.yearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-327851809L) + "'", long11 == (-327851809L));
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-327851809L) + "'", long22 == (-327851809L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test19620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19620");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 72, dateTimeZone2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 10, chronology5);
        java.util.Date date7 = dateTime6.toDate();
        org.joda.time.DateTime dateTime9 = dateTime6.withYearOfEra(1);
        org.joda.time.DateTime dateTime12 = dateTime6.withDurationAdded((-1953900028000L), 10);
        org.joda.time.DateTime.Property property13 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime15 = dateTime6.withDayOfYear(10);
        org.joda.time.DateTime dateTime17 = dateTime6.withYearOfEra(19);
        int int18 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusDays(1);
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime23.withEarlierOffsetAtOverlap();
        int int25 = dateTime23.getWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime23.weekOfWeekyear();
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getDisplayLanguage();
        int int30 = property26.getMaximumShortTextLength(locale28);
        java.util.Set<java.lang.String> strSet31 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale locale32 = locale28.stripExtensions();
        java.lang.String str33 = dateTimeZone2.getName(35365462L, locale28);
        java.lang.String str35 = dateTimeZone2.getShortName(1644573031906L);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = localDateTime40.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plusYears((-1));
        int int47 = localDateTime40.getDayOfYear();
        boolean boolean48 = dateTimeZone2.isLocalDateTimeGap(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.120" + "'", str33, "+00:00:00.120");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.120" + "'", str35, "+00:00:00.120");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test19621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19621");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test19622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19622");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property6.addWrapFieldToCopy((int) 'x');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(15300298);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-15T14:49:44.271" + "'", str3, "2022-02-15T14:49:44.271");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test19623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19623");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(53003315);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusDays(1);
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DurationField durationField10 = durationFieldType8.getField(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withFieldAdded(durationFieldType8, 35268191);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean17 = localDateTime13.isSupported(dateTimeFieldType16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight12.property(dateTimeFieldType16);
        org.joda.time.DateMidnight dateMidnight19 = property18.getDateMidnight();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.lang.String str24 = property18.getAsShortText(locale20);
        org.joda.time.DateMidnight dateMidnight25 = property18.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minus((long) 17520);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval(obj28, chronology29);
        boolean boolean31 = interval30.containsNow();
        org.joda.time.DateTime dateTime32 = interval30.getStart();
        org.joda.time.DateTime dateTime34 = dateTime32.plusYears((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property36 = dateTime32.property(dateTimeFieldType35);
        java.lang.String str37 = dateTimeFieldType35.getName();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType35.getDurationType();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight27.withFieldAdded(durationFieldType38, 35270798);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.plusWeeks(34);
        java.lang.String str43 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withDefaultYear(841);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\ud654" + "'", str24, "\ud654");
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "dayOfYear" + "'", str37, "dayOfYear");
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3037606W454" + "'", str43, "3037606W454");
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
    }

    @Test
    public void test19624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19624");
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTime();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays(1);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minus((long) 12);
        int int17 = dateMidnight5.compareTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withPeriodAdded(readablePeriod22, (int) '#');
        int[] intArray25 = localDateTime21.getValues();
        boolean boolean26 = dateTimeZone20.isLocalDateTimeGap(localDateTime21);
        org.joda.time.LocalDateTime.Property property27 = localDateTime21.millisOfDay();
        int int28 = property27.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = property27.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight31.minus(readableDuration34);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale38);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withPeriodAdded(readablePeriod41, (int) '#');
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.minuteOfHour();
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.minuteOfHour();
        boolean boolean48 = calendar39.after((java.lang.Object) localDateTime45);
        org.joda.time.Chronology chronology49 = localDateTime45.getChronology();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 100, chronology49);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Interval interval53 = new org.joda.time.Interval(obj51, chronology52);
        long long54 = interval53.toDurationMillis();
        org.joda.time.Period period55 = interval53.toPeriod();
        java.lang.String str56 = period55.toString();
        long long59 = chronology49.add((org.joda.time.ReadablePeriod) period55, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight35.minus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.MutablePeriod mutablePeriod61 = period55.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean63 = mutablePeriod61.isSupported(durationFieldType62);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime29.minus((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight5.plus((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight5.withYear(0);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays(82800000);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.plus(readableDuration70);
        java.util.Locale.Builder builder72 = new java.util.Locale.Builder();
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withPeriodAdded(readablePeriod78, (int) '#');
        int[] intArray81 = localDateTime77.getValues();
        boolean boolean82 = dateTimeZone76.isLocalDateTimeGap(localDateTime77);
        int int84 = dateTimeZone76.getOffsetFromLocal((long) 4);
        java.util.Locale locale87 = new java.util.Locale("");
        java.lang.String str88 = dateTimeZone76.getName((long) 9, locale87);
        java.lang.String str89 = locale73.getDisplayLanguage(locale87);
        java.util.Locale.Builder builder90 = builder72.setLocale(locale87);
        java.util.Locale.Builder builder91 = builder90.clear();
        java.util.Locale.Builder builder93 = builder91.setLanguageTag("months");
        java.util.Locale.Builder builder94 = builder91.clear();
        boolean boolean95 = dateMidnight71.equals((java.lang.Object) builder94);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[2022, 2, 15, 53384303]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644573464303,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=303,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0S" + "'", str56, "PT0S");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(mutablePeriod61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(intArray81);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[2022, 2, 15, 53384304]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 363120000 + "'", int84 == 363120000);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+100:52" + "'", str88, "+100:52");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Japanese" + "'", str89, "Japanese");
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test19625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19625");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.year();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(35);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(82800000);
        org.joda.time.DateTime.Property property8 = dateTime7.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = dateTime7.toLocalDateTime();
        org.joda.time.DateTime.Property property10 = dateTime7.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.minusYears(398938011);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -398936041 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test19626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19626");
        java.util.Locale locale3 = new java.util.Locale("52913452", "2022-08-15T14:41:12.777", "14:40:53.978");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "52913452_2022-08-15T14:41:12.777_14:40:53.978");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "14:40:53.978" + "'", str4, "14:40:53.978");
    }

    @Test
    public void test19627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19627");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(35268191);
        org.joda.time.DateMidnight.Property property10 = dateMidnight6.dayOfMonth();
        org.joda.time.DurationField durationField11 = property10.getLeapDurationField();
        org.joda.time.DateMidnight dateMidnight12 = property10.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField13 = property10.getField();
        boolean boolean14 = dateTimeField13.isSupported();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19628");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(6);
        org.joda.time.LocalDate localDate5 = localDate1.minusWeeks(7);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate1.minus(readablePeriod6);
        org.joda.time.LocalDate localDate9 = localDate1.minusMonths(52798648);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property10.setCopy("German");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"German\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test19629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19629");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        calendar2.setLenient(false);
        java.util.TimeZone timeZone21 = calendar2.getTimeZone();
        long long22 = calendar2.getTimeInMillis();
        calendar2.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.clear(398946474);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573464383,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=383,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test19630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19630");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) 'x');
        org.joda.time.LocalTime.Property property6 = localTime3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(0L, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusMillis((int) (short) 10);
        int int16 = localDateTime11.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        int int21 = localDateTime11.get(dateTimeFieldType19);
        java.lang.String str22 = dateTimeFieldType19.getName();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, (int) '#');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.minuteOfHour();
        boolean boolean34 = calendar25.after((java.lang.Object) localDateTime31);
        org.joda.time.Chronology chronology35 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        org.joda.time.DurationField durationField37 = chronology35.hours();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.secondOfMinute();
        boolean boolean39 = dateTimeFieldType19.isSupported(chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime41 = localTime3.withField(dateTimeFieldType19, 53021718);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53021718 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "clockhourOfHalfday" + "'", str22, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1644573464399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=399,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test19631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19631");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        java.time.Instant instant4 = date3.toInstant();
        int int5 = date3.getTimezoneOffset();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date3);
        date3.setMonth(139);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromDateFields(date3);
        int int10 = date3.getSeconds();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Aug 01 00:00:00 UTC 1981");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test19632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19632");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addCopy((-1L));
        org.joda.time.LocalTime localTime6 = property3.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField7 = property3.getField();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:49:44.428" + "'", str2, "14:49:44.428");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test19633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19633");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.dayOfMonth();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(472, 99999, 51109273, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573464435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=435,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test19634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19634");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        calendar2.roll(4, true);
        long long12 = calendar2.getTimeInMillis();
        int int13 = calendar2.getWeeksInWeekYear();
        int int14 = calendar2.getWeeksInWeekYear();
        calendar2.setLenient(true);
        calendar2.set(53085282, 98531, 52933, 17520, 52865905, 52987691);
        calendar2.set(35645329, (-2033), 53131823);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=35645329,MONTH=-2033,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=53131823,DAY_OF_YEAR=8,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=17520,MINUTE=52865905,SECOND=52987691,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 604800000L + "'", long12 == 604800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test19635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(35268191);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withPeriodAdded(readablePeriod9, (int) '#');
        int[] intArray12 = localDateTime8.getValues();
        boolean boolean13 = dateTimeZone7.isLocalDateTimeGap(localDateTime8);
        org.joda.time.LocalDateTime.Property property14 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        java.util.Date date16 = localDateTime15.toDate();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromDateFields(date16);
        java.lang.String str18 = date16.toGMTString();
        int int19 = date16.getTimezoneOffset();
        int int20 = date16.getDay();
        int int21 = date16.getHours();
        calendar4.setTime(date16);
        long long23 = date16.getTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+09:47");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573464468,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+09:47:48.191,offset=35268191,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=45,SECOND=32,MILLISECOND=659,ZONE_OFFSET=35268191,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644936584468,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+09:47:48.191,offset=35268191,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=37,SECOND=32,MILLISECOND=659,ZONE_OFFSET=35268191,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2022, 2, 15, 53384468]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Feb 15 14:49:44 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "15 Feb 2022 14:49:44 GMT" + "'", str18, "15 Feb 2022 14:49:44 GMT");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1644936584468L + "'", long23 == 1644936584468L);
    }

    @Test
    public void test19636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19636");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 35268191);
        org.joda.time.LocalDate localDate3 = localDate1.minusDays(35268191);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfMonth();
        int int5 = localDate1.getMonthOfYear();
        org.joda.time.DateTime dateTime6 = localDate1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = dateTime6.minusMonths(51069804);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withEra(215);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 215 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test19637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19637");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter0.getZone();
        boolean boolean3 = dateTimeFormatter0.isPrinter();
        java.util.Locale locale4 = dateTimeFormatter0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = dateTimeFormatter0.parseLocalDate("53139183");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"53139183\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test19638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19638");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(1);
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateMidnight dateMidnight13 = dateTime12.toDateMidnight();
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.weekyear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withChronology(chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withPeriodAdded(readablePeriod21, (int) '#');
        int[] intArray24 = localDateTime20.getValues();
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime20);
        org.joda.time.LocalDateTime.Property property26 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight13.withField(dateTimeFieldType28, (int) (short) 10);
        org.joda.time.DateTime dateTime31 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime8.minusYears(0);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusDays(1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = property36.withMinimumValue();
        java.lang.String str38 = property36.getAsShortText();
        org.joda.time.LocalDateTime localDateTime39 = property36.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime40 = property36.withMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[2022, 2, 15, 53384505]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4" + "'", str38, "4");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
    }

    @Test
    public void test19639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19639");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfMinute();
        long long18 = dateTimeField15.add(1305073831391000L, 86400000L);
        long long20 = dateTimeField15.roundHalfCeiling((long) 70);
        long long22 = dateTimeField15.roundHalfFloor((long) 12000000);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573464528,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=528,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1305160231391000L + "'", long18 == 1305160231391000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 12000000L + "'", long22 == 12000000L);
    }

    @Test
    public void test19640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19640");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale3 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder8 = builder1.setLocale(locale5);
        java.util.Locale locale9 = builder1.build();
        java.util.Locale.Builder builder10 = builder1.clear();
        java.util.Locale.Builder builder12 = builder1.setVariant("minutes");
        java.util.Locale.Builder builder14 = builder1.setVariant("52882468");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((int) '#');
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = locale18.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withLocale(locale19);
        java.util.Locale locale21 = dateTimeFormatter20.getLocale();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale21.getDisplayName(locale23);
        java.util.Locale.Builder builder25 = builder1.setLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.removeUnicodeLocaleAttribute("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=352662,MONTH=9,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=72006,DAY_OF_YEAR=8,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=141,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=352662,MONTH=9,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=72006,DAY_OF_YEAR=8,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=141,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str24, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test19641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19641");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.minusMinutes((int) '#');
        org.joda.time.LocalTime.Property property6 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime8 = property6.addCopy(0L);
        org.joda.time.LocalTime localTime9 = property6.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test19642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19642");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        boolean boolean12 = dateTime11.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19643");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withDurationAdded(readableDuration7, 0);
        org.joda.time.LocalDate localDate10 = dateMidnight6.toLocalDate();
        int int11 = dateMidnight6.getHourOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 12);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval(obj17, chronology18);
        long long20 = interval19.toDurationMillis();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = interval19.toPeriod(periodType21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean25 = interval19.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime24.weekOfWeekyear();
        int int27 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone13);
        boolean boolean29 = dateMidnight6.equals((java.lang.Object) dateTimeZone13);
        org.joda.time.DateMidnight.Property property30 = dateMidnight6.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight31 = property30.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight32 = property30.roundFloorCopy();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        java.util.Date date35 = localDate34.toDate();
        org.joda.time.LocalDate localDate37 = localDate34.plusMonths(0);
        int int38 = property30.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 363120000 + "'", int27 == 363120000);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test19644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19644");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone8.toTimeZone();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 8, dateTimeZone8);
        boolean boolean12 = dateTimeZone8.isFixed();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.lang.String str18 = locale14.getDisplayScript(locale17);
        java.lang.String str19 = dateTimeZone8.getShortName((long) (byte) -1, locale14);
        java.lang.String str20 = dateTimeZone1.getName(2021L, locale14);
        java.lang.String str22 = dateTimeZone1.getShortName(1644572929223L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:52" + "'", str19, "+100:52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.120" + "'", str20, "+00:00:00.120");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.120" + "'", str22, "+00:00:00.120");
    }

    @Test
    public void test19645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19645");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.centuryOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test19646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        org.joda.time.LocalDate localDate5 = localDate1.withFieldAdded(durationFieldType2, 900);
        org.joda.time.LocalDate localDate7 = localDate1.withCenturyOfEra(900);
        org.joda.time.LocalDate.Property property8 = localDate1.yearOfCentury();
        java.lang.String str9 = localDate1.toString();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        long long13 = interval12.toDurationMillis();
        org.joda.time.Period period14 = interval12.toPeriod();
        java.lang.String str15 = period14.toString();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.withFieldAdded(durationFieldType19, 0);
        int int22 = period14.get(durationFieldType19);
        org.joda.time.LocalDate localDate24 = localDate1.withPeriodAdded((org.joda.time.ReadablePeriod) period14, 53152313);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-15" + "'", str9, "2022-02-15");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0S" + "'", str15, "PT0S");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test19647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19647");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        boolean boolean13 = calendar4.after((java.lang.Object) localDateTime10);
        org.joda.time.Chronology chronology14 = localDateTime10.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 100, chronology14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Interval interval18 = new org.joda.time.Interval(obj16, chronology17);
        long long19 = interval18.toDurationMillis();
        org.joda.time.Period period20 = interval18.toPeriod();
        java.lang.String str21 = period20.toString();
        long long24 = chronology14.add((org.joda.time.ReadablePeriod) period20, (long) (byte) 100, 0);
        boolean boolean25 = durationFieldType0.isSupported(chronology14);
        org.joda.time.DurationField durationField26 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField27 = chronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.secondOfDay();
        int int30 = dateTimeField28.getMinimumValue((long) 35503174);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, (int) '#');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        boolean boolean43 = calendar34.after((java.lang.Object) localDateTime40);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.year();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (short) -1, chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField49 = chronology44.dayOfMonth();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(chronology44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) 35503174, chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644573464640,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=640,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0S" + "'", str21, "PT0S");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1644573464640,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=640,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test19648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19648");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getNameKey((long) 12);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(obj6, chronology7);
        long long9 = interval8.toDurationMillis();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = interval8.toPeriod(periodType10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean14 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property15 = dateTime13.weekOfWeekyear();
        int int16 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone2);
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property18.setCopy(52921306);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52921306 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 363120000 + "'", int16 == 363120000);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test19649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19649");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        int int7 = property5.getMaximumValueOverall();
        int int8 = property5.getMinimumValueOverall();
        org.joda.time.LocalDate localDate9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = localDate9.plusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears(365);
        int int14 = localDate11.getMonthOfYear();
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.lang.String str19 = localDate11.toString("53014072", locale17);
        org.joda.time.LocalDate.Property property20 = localDate11.era();
        org.joda.time.LocalDate localDate21 = property20.roundHalfCeilingCopy();
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.util.Locale locale26 = locale24.stripExtensions();
        java.lang.String str27 = locale26.getISO3Language();
        java.lang.String str28 = localDate21.toString("53266592", locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = localDate21.withYearOfEra((-6780000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6780000 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "53014072" + "'", str19, "53014072");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "eng" + "'", str27, "eng");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "53266592" + "'", str28, "53266592");
    }

    @Test
    public void test19650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19650");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        boolean boolean17 = dateTimeFieldType2.isSupported(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology15);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 10, (long) 358, chronology15);
        org.joda.time.DateTimeField dateTimeField21 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField22 = chronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology15.getZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644573464683,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=683,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test19651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19651");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.minuteOfHour();
        int int7 = localDateTime5.getMillisOfDay();
        int[] intArray8 = localDateTime5.getValues();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusYears((int) (short) 1);
        int int14 = localDateTime13.getEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusSeconds(5);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfCentury();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusDays(1);
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withEra(0);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusDays(1);
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateMidnight dateMidnight32 = dateTime31.toDateMidnight();
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.weekyear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.withYearOfCentury(12);
        org.joda.time.Interval interval38 = dateMidnight32.toInterval();
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        boolean boolean43 = interval42.containsNow();
        org.joda.time.Duration duration44 = interval42.toDuration();
        org.joda.time.Interval interval45 = interval38.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration44);
        org.joda.time.DateTime dateTime47 = dateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration44, 11);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime19.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime5.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withCenturyOfEra(592);
        int int52 = localDateTime49.getYear();
        org.joda.time.LocalDateTime.Property property53 = localDateTime49.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53384697 + "'", int7 == 53384697);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 15, 53384697]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
        org.junit.Assert.assertNotNull(property53);
    }

    @Test
    public void test19652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19652");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.Interval interval3 = localDate1.toInterval();
        int int4 = localDate1.getEra();
        org.joda.time.LocalDate localDate6 = localDate1.withYear(142);
        org.joda.time.LocalDate localDate8 = localDate1.plusMonths(1192);
        int int9 = localDate8.getEra();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test19653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19653");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime13 = property10.addWrapFieldToCopy(336);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis(1644572987105L);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test19654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19654");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekOfWeekyear(6);
        org.joda.time.LocalDate localDate7 = localDate3.plusYears(1970);
        org.joda.time.DateTime dateTime8 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property9 = localDate7.era();
        org.joda.time.LocalDate localDate10 = property9.withMaximumValue();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test19655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19655");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (byte) 10, dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone4);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 6, dateTimeZone4);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear(14);
        org.joda.time.DateTime dateTime17 = dateTime15.withMillis((long) 45);
        org.joda.time.DateTime dateTime19 = dateTime15.withYear(53159304);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays(52846932);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 53384767]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test19656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19656");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int2 = localDate0.get(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.era();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtCurrentTime();
        java.lang.String str5 = localDate0.toString();
        int int6 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate.Property property7 = localDate0.monthOfYear();
        int int8 = property7.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-15" + "'", str5, "2022-02-15");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test19657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19657");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        int int10 = localDateTime3.getYearOfEra();
        int int11 = localDateTime3.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53384802]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test19658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19658");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 70);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis((int) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMinutes(100);
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(12);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTimeISO();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        boolean boolean25 = interval24.containsNow();
        org.joda.time.Duration duration26 = interval24.toDuration();
        org.joda.time.DateTime dateTime27 = dateTime20.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime.Property property28 = dateTime20.year();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53384812]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test19659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19659");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        boolean boolean17 = dateTimeFieldType2.isSupported(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.secondOfDay();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology15);
        org.joda.time.Interval interval21 = new org.joda.time.Interval(1644572995195L, 64695491360437L, chronology15);
        org.joda.time.DateTimeField dateTimeField22 = chronology15.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644573464830,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=830,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test19660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19660");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.setMinimalDaysInFirstWeek(7);
        java.util.Date date5 = calendar2.getTime();
        calendar2.setFirstDayOfWeek(32);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573464843,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=32,minimalDaysInFirstWeek=7,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=843,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 11 09:57:44 UTC 2022");
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test19661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19661");
        java.util.Date date6 = new java.util.Date((-30259900), 53304277, 53186575, 398964645, 358, 0);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Sep 22 02:58:00 UTC 25624849");
    }

    @Test
    public void test19662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19662");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = property5.addToCopy((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight9 = property5.addToCopy(70);
        java.util.GregorianCalendar gregorianCalendar10 = dateMidnight9.toGregorianCalendar();
        org.joda.time.DateMidnight.Property property11 = dateMidnight9.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withWeekyear(2000);
        org.joda.time.DateMidnight.Property property14 = dateMidnight9.era();
        org.joda.time.DateMidnight.Property property15 = dateMidnight9.dayOfMonth();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test19663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19663");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        int int6 = property5.getLeapAmount();
        org.joda.time.LocalDate localDate7 = property5.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = localDate7.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test19664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19664");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight1.withDurationAdded((long) (short) 0, 7);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight1.plusYears((int) 'x');
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean21 = localDateTime17.isSupported(dateTimeFieldType20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight11.withField(dateTimeFieldType20, 0);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight11.withMillis(225608213L);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight11.minusYears(53020981);
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight11.getZone();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withPeriodAdded(readablePeriod30, (int) '#');
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundCeilingCopy();
        boolean boolean35 = property33.isLeap();
        org.joda.time.LocalDateTime localDateTime36 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime38 = property33.addToCopy(52854475);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withPeriodAdded(readablePeriod41, (int) '#');
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime46 = property44.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusDays(1);
        org.joda.time.DateTime dateTime50 = localDateTime49.toDateTime();
        org.joda.time.DateMidnight dateMidnight51 = dateTime50.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DurationField durationField54 = durationFieldType52.getField(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight51.withFieldAdded(durationFieldType52, 35268191);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean61 = localDateTime57.isSupported(dateTimeFieldType60);
        org.joda.time.DateMidnight.Property property62 = dateMidnight56.property(dateTimeFieldType60);
        org.joda.time.DateMidnight dateMidnight64 = property62.addToCopy(11);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withPeriodAdded(readablePeriod69, (int) '#');
        int[] intArray72 = localDateTime68.getValues();
        boolean boolean73 = dateTimeZone67.isLocalDateTimeGap(localDateTime68);
        org.joda.time.LocalDateTime.Property property74 = localDateTime68.millisOfDay();
        org.joda.time.LocalDateTime localDateTime75 = property74.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property74.getFieldType();
        int int77 = dateMidnight64.get(dateTimeFieldType76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime46.property(dateTimeFieldType76);
        org.joda.time.LocalDateTime.Property property79 = localDateTime38.property(dateTimeFieldType76);
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType76.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType81 = dateTimeFieldType76.getRangeDurationType();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight11.withFieldAdded(durationFieldType81, 52798648);
        org.joda.time.DateMidnight dateMidnight85 = dateMidnight83.plusDays(53215885);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(intArray72);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[2022, 2, 15, 53384880]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertNotNull(dateMidnight83);
        org.junit.Assert.assertNotNull(dateMidnight85);
    }

    @Test
    public void test19665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19665");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(9223247946853949616L);
        boolean boolean3 = localTime1.equals((java.lang.Object) "2022-02-15T14:47:34.232");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19666");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        boolean boolean10 = property9.isLeap();
        int int11 = property9.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = property9.addToCopy(1439);
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours(5107);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYearOfCentury(40);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears(52931);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53384936]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test19667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19667");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1, chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField25 = chronology16.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(44014, 0, 17520000, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573464949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=44,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test19668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19668");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        java.util.Date date11 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = localDateTime12.toString("35271248", locale15);
        org.joda.time.Chronology chronology17 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.plusYears(0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53384982]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 15 14:49:44 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35271248" + "'", str16, "35271248");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test19669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19669");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(1L, dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 32769, dateTimeZone4);
        boolean boolean8 = dateTimeZone4.isStandardOffset((long) 2022);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillis(68880000L);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test19670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19670");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        long long13 = interval12.toDurationMillis();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj14, chronology15);
        long long17 = interval16.toDurationMillis();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval(obj18, chronology19);
        long long21 = interval20.toDurationMillis();
        org.joda.time.Period period22 = interval20.toPeriod();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        boolean boolean26 = interval25.containsNow();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval(obj27, chronology28);
        boolean boolean30 = interval29.containsNow();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval(obj31, chronology32);
        org.joda.time.ReadableInterval[] readableIntervalArray34 = new org.joda.time.ReadableInterval[] { interval12, interval16, interval20, interval25, interval29, interval33 };
        org.joda.time.ReadableInterval[] readableIntervalArray35 = strList9.toArray(readableIntervalArray34);
        java.util.stream.Stream<java.lang.String> strStream36 = strList9.parallelStream();
        java.util.Set<java.lang.String> strSet37 = java.util.Calendar.getAvailableCalendarTypes();
        boolean boolean38 = strList9.removeAll((java.util.Collection<java.lang.String>) strSet37);
        java.lang.Object[] objArray39 = strList9.toArray();
        int int40 = strList9.size();
        java.lang.Object[] objArray41 = strList9.toArray();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(readableIntervalArray34);
        org.junit.Assert.assertNotNull(readableIntervalArray35);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
    }

    @Test
    public void test19671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19671");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.now(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((long) 12);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(obj5, chronology6);
        long long8 = interval7.toDurationMillis();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = interval7.toPeriod(periodType9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean13 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property14 = dateTime12.weekOfWeekyear();
        int int15 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int21 = localDate19.get(dateTimeFieldType20);
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType20.getDurationType();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight16.withFieldAdded(durationFieldType22, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight16.minus((long) 292);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight26);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime30 = dateTime28.plusWeeks(46);
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("32770");
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.util.Locale locale36 = locale34.stripExtensions();
        java.lang.String str37 = locale32.getDisplayScript(locale34);
        java.util.Set<java.lang.String> strSet38 = locale32.getUnicodeLocaleKeys();
        java.util.Calendar calendar39 = dateTime28.toCalendar(locale32);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = calendar39.getGreatestMinimum(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363120000 + "'", int15 == 363120000);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(calendar39);
        org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644433680000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=363120000,DST_OFFSET=0]");
    }

    @Test
    public void test19672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19672");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(3);
        int int14 = localDate4.getDayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        java.util.Date date18 = dateTime17.toDate();
        int int19 = date18.getYear();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.LocalDate localDate22 = localDate20.withYear(1970);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        long long26 = interval25.toDurationMillis();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = interval25.toPeriod(periodType27);
        org.joda.time.LocalDate localDate29 = localDate22.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = localDate4.withPeriodAdded((org.joda.time.ReadablePeriod) period28, 363120000);
        org.joda.time.LocalDate.Property property32 = localDate31.era();
        org.joda.time.Chronology chronology33 = localDate31.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localDate31.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
    }

    @Test
    public void test19673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19673");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(35268191);
        org.joda.time.Interval interval10 = dateMidnight9.toInterval();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval(obj11, chronology12);
        long long14 = interval13.toDurationMillis();
        org.joda.time.Period period15 = interval13.toPeriod();
        org.joda.time.Interval interval16 = interval10.withPeriodAfterStart((org.joda.time.ReadablePeriod) period15);
        boolean boolean18 = interval10.contains((long) 12000000);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.era();
        org.joda.time.DateMidnight dateMidnight21 = property20.withMaximumValue();
        java.lang.String str22 = property20.getName();
        org.joda.time.DateMidnight dateMidnight23 = property20.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight24 = property20.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withDayOfMonth(12);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.era();
        org.joda.time.DateMidnight dateMidnight28 = property27.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight29 = property27.roundCeilingCopy();
        boolean boolean30 = interval10.isBefore((org.joda.time.ReadableInstant) dateMidnight29);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "era" + "'", str22, "era");
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test19674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19674");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DurationField durationField16 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField18 = chronology13.halfdays();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644573465078,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=78,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test19675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19675");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(6);
        org.joda.time.LocalDate localDate5 = localDate1.withWeekyear(17520032);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test19676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19676");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        org.joda.time.DurationField durationField19 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.Chronology chronology21 = chronology16.withUTC();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDateTime22.getValue(53242);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53242");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573465098,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=98,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test19677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19677");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withYear(35268191);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMinutes((int) (short) 1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean21 = localDateTime17.isSupported(dateTimeFieldType20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 10, chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime29 = dateTime26.withField(dateTimeFieldType27, 2022);
        boolean boolean30 = localDateTime17.isSupported(dateTimeFieldType27);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, (int) '#');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        boolean boolean43 = calendar34.after((java.lang.Object) localDateTime40);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 100, chronology44);
        boolean boolean46 = dateTimeFieldType27.isSupported(chronology44);
        boolean boolean47 = localDateTime15.isSupported(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime15.plusWeeks(52839);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(chronology50);
        org.joda.time.LocalTime.Property property52 = localTime51.minuteOfHour();
        org.joda.time.LocalTime localTime54 = property52.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime55 = property52.roundCeilingCopy();
        org.joda.time.LocalTime localTime56 = property52.getLocalTime();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.DateTime dateTime61 = dateTime59.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime64 = dateTime61.withField(dateTimeFieldType62, 2022);
        boolean boolean65 = localTime56.isSupported(dateTimeFieldType62);
        org.joda.time.LocalTime localTime67 = localTime56.plusSeconds(0);
        org.joda.time.Chronology chronology68 = localTime67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval70 = new org.joda.time.Interval((java.lang.Object) localDateTime15, chronology68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573465112,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=112,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1644573465112,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=112,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField69);
    }

    @Test
    public void test19678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19678");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(52810033);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter1.getPrinter();
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.parse("52981322", dateTimeFormatter1);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withDurationAdded((long) (-292275054), 15000000);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.plusWeeks(53311093);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test19679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19679");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.withMaximumValue();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) dateMidnight2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight2.centuryOfEra();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        java.util.Locale.setDefault(category5, locale7);
        java.lang.String str10 = property4.getAsShortText(locale7);
        org.joda.time.DateMidnight dateMidnight11 = property4.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644573465153,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=153,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20" + "'", str10, "20");
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test19680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19680");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder5 = builder2.setExtension('x', "52820336");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("2022-02-15T14:41:55.145");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-15T14:41:55.145 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19681");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        int int13 = calendar2.getMinimum(15);
        java.lang.String str14 = calendar2.getCalendarType();
        java.time.Instant instant15 = calendar2.toInstant();
        int int17 = calendar2.getMaximum(0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar2.getGreatestMinimum(57699999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 57699999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573465175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=175,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-46800000) + "'", int13 == (-46800000));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gregory" + "'", str14, "gregory");
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test19682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19682");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        boolean boolean14 = dateTimeField13.isLenient();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, (int) '#');
        int[] intArray22 = localDateTime18.getValues();
        boolean boolean23 = dateTimeZone17.isLocalDateTimeGap(localDateTime18);
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.withMonthOfYear(8);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.minusMinutes((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withPeriodAdded(readablePeriod30, (int) '#');
        int[] intArray33 = localDateTime29.getValues();
        int int34 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDateTime18, intArray33);
        int int35 = localDateTime18.size();
        org.joda.time.Chronology chronology36 = localDateTime18.getChronology();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644573465189,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=189,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 2, 15, 53385189]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2022, 2, 15, 53385189]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 292278993 + "'", int34 == 292278993);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test19683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19683");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        int int10 = property9.getMinimumValue();
        java.lang.String str11 = property9.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property9.withMaximumValue();
        int[] intArray13 = localDateTime12.getValues();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusMillis(72);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusWeeks(352662);
        int int20 = localDateTime16.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 53385220]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53385220" + "'", str11, "53385220");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 15, 86399999]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test19684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19684");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.util.Locale.Builder builder23 = builder0.setLocale(locale19);
        java.util.Locale.Builder builder24 = builder0.clearExtensions();
        java.util.Locale.Builder builder25 = builder24.clear();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale.Builder builder28 = builder27.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder28.setScript("2022-02-15T14:44:08.909");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-15T14:44:08.909 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 53385239]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test19685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19685");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property11 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime4.withField(dateTimeFieldType12, 86399999);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear((int) (short) 10);
        org.joda.time.DateTime.Property property18 = dateTime14.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
    }

    @Test
    public void test19686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19686");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate6 = localDate4.plusYears((int) '4');
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(7);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate11 = localDate8.plusWeeks((-1073453520));
        org.joda.time.LocalDate localDate13 = localDate11.minusYears(15);
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        int int15 = localDate13.getYearOfEra();
        int[] intArray16 = localDate13.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20571044 + "'", int15 == 20571044);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-20571043, 9, 24]");
    }

    @Test
    public void test19687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19687");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(35268191);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test19688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19688");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList11);
        strList11.clear();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test19689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19689");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury(12);
        org.joda.time.Interval interval10 = dateMidnight4.toInterval();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(locale13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        boolean boolean23 = calendar14.after((java.lang.Object) localDateTime20);
        org.joda.time.Chronology chronology24 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.year();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) -1, chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.year();
        org.joda.time.DateTimeField dateTimeField29 = chronology24.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.hourOfHalfday();
        org.joda.time.Interval interval32 = interval10.withChronology(chronology24);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology34);
        java.util.Date date36 = dateTime35.toDate();
        org.joda.time.DateTime dateTime38 = dateTime35.withYearOfEra(1);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfMonth(12);
        int int41 = dateTime38.getDayOfWeek();
        org.joda.time.DateTime dateTime43 = dateTime38.withHourOfDay(2);
        org.joda.time.DateTime dateTime45 = dateTime43.withMillisOfDay(362);
        boolean boolean46 = interval32.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime47 = interval32.getEnd();
        org.joda.time.DateTime.Property property48 = dateTime47.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1644573465328,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=57,SECOND=45,MILLISECOND=328,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
    }
}
