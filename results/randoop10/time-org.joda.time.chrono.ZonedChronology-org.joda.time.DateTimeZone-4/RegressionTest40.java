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
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        int int6 = dateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusSeconds(53);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean12 = localDateTime7.isSupported(dateTimeFieldType11);
        int int13 = dateTime2.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime14 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder7 = builder3.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder9 = builder7.setLenient(false);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone14.toTimeZone();
        boolean boolean17 = timeZone11.hasSameRules(timeZone16);
        java.util.Calendar.Builder builder18 = builder7.setTimeZone(timeZone16);
        calendar1.setTimeZone(timeZone16);
        boolean boolean20 = timeZone16.observesDaylightTime();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone27 = dateTimeZone25.toTimeZone();
        boolean boolean28 = timeZone22.hasSameRules(timeZone27);
        boolean boolean29 = timeZone16.hasSameRules(timeZone27);
        java.time.ZoneId zoneId30 = timeZone16.toZoneId();
        java.lang.String str31 = timeZone16.getID();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514745712,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=712,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GMT" + "'", str31, "GMT");
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.era();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology21.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localTime3.getFieldType((int) (byte) 1);
        int int6 = localTime1.get(dateTimeFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(11770);
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfEvenCopy();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale.setDefault(category9, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category9);
        java.lang.String str15 = locale13.getExtension('u');
        java.lang.String str16 = property5.getAsShortText(locale13);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(1645154328484L);
        int int19 = property5.compareTo((org.joda.time.ReadableInstant) instant18);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property1.addToCopy(51);
        org.joda.time.DurationField durationField5 = property1.getDurationField();
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        int int7 = property1.getMaximumTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property1.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = property1.roundHalfEvenCopy();
        org.joda.time.tz.NameProvider nameProvider10 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider10);
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider12);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str17 = nameProvider12.getShortName(locale14, "1 Jan 1970 00:00:00 GMT", "1970/04/10 0:00:00");
        java.lang.String str18 = locale14.getVariant();
        java.lang.String str21 = nameProvider10.getShortName(locale14, "2017-02-22T07:18:48.892", "halfdayOfDay");
        int int22 = property1.getMaximumShortTextLength(locale14);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(nameProvider10);
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.LocalTime localTime13 = property10.setCopy("50");
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay(11790918);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet2 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(dateTimeZone6);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        java.lang.String str27 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(50);
        int int35 = localDate32.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate37 = localDate32.plusMonths(6);
        int int38 = localDate32.getYearOfEra();
        boolean boolean40 = localDate32.equals((java.lang.Object) "07:16:07.343");
        int int41 = localDate32.getDayOfYear();
        long long43 = zonedChronology21.set((org.joda.time.ReadablePartial) localDate32, 1645525855781L);
        int int44 = localDate32.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 100, dateTimeZone46);
        org.joda.time.LocalDate.Property property48 = localDate47.weekyear();
        org.joda.time.LocalDate localDate50 = property48.setCopy(2022);
        org.joda.time.Instant instant51 = new org.joda.time.Instant();
        org.joda.time.Instant instant53 = instant51.withMillis((long) 11);
        org.joda.time.Instant instant54 = instant53.toInstant();
        org.joda.time.Chronology chronology55 = instant53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 100, dateTimeZone58);
        int int60 = dateTimeField56.getMaximumValue((org.joda.time.ReadablePartial) localDate59);
        int int62 = localDate59.getValue(2);
        org.joda.time.DateMidnight dateMidnight63 = localDate59.toDateMidnight();
        org.joda.time.LocalDate localDate65 = localDate59.plusMonths(26160535);
        int int66 = localDate65.getYear();
        boolean boolean67 = property48.equals((java.lang.Object) localDate65);
        org.joda.time.DateTime dateTime68 = localDate65.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.DateTime dateTime71 = dateTime68.withPeriodAdded(readablePeriod69, 11761333);
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((java.lang.Object) readablePeriod69);
        org.joda.time.LocalDate localDate74 = localDate72.minusMonths((-195));
        org.joda.time.LocalDate.Property property75 = localDate72.centuryOfEra();
        org.joda.time.LocalDate localDate77 = property75.addToCopy(0);
        int int78 = localDate32.compareTo((org.joda.time.ReadablePartial) localDate77);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str27, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 37855781L + "'", long43 == 37855781L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 12 + "'", int60 == 12);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2182014 + "'", int66 == 2182014);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localDate77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField28 = zonedChronology21.halfdays();
        java.lang.String str29 = zonedChronology21.toString();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str29, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setRegion("CA");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale locale8 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_CA");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime13 = dateTime6.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(50);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfHour();
        org.joda.time.DateTime dateTime21 = dateTime13.toDateTime(chronology19);
        int int22 = dateTime13.getWeekyear();
        org.joda.time.DateTime.Property property23 = dateTime13.weekOfWeekyear();
        int int24 = dateTime13.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12345874 + "'", int4 == 12345874);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73644 + "'", int22 == 73644);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.weekyear();
        int int8 = dateTime2.getEra();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.DateTime dateTime11 = dateTime2.withFieldAdded(durationFieldType9, 11844408);
        org.joda.time.DateTime.Property property12 = dateTime2.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12345885 + "'", int4 == 12345885);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundFloorCopy();
        int int3 = localDateTime2.getMillisOfSecond();
        int int4 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withField(dateTimeFieldType7, (int) (short) 10);
        int int10 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime2.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime2.minusMillis(11926728);
        int int14 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusMinutes(26717681);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int10 = dateTime7.get(dateTimeFieldType9);
        int int11 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withChronology(chronology17);
        int int22 = dateTimeFormatter4.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter4.getParser();
        int int24 = dateTimeFormatter4.getDefaultYear();
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer25, (long) 740);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2000 + "'", int22 == 2000);
        org.junit.Assert.assertNull(dateTimeParser23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minus(0L);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis(26161850);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean8 = dateTime4.isSupported(dateTimeFieldType7);
        org.joda.time.DateTime.Property property9 = dateTime4.weekOfWeekyear();
        int int10 = dateTime4.getSecondOfDay();
        org.joda.time.DateTime.Property property11 = dateTime4.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12345 + "'", int10 == 12345);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate8.plusMonths(26160535);
        org.joda.time.LocalDate.Property property15 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate16 = property15.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate17 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime21 = property19.withMinimumValue();
        java.lang.String str22 = property19.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property19.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = localDate17.withField(dateTimeFieldType23, 12044431);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "25" + "'", str22, "25");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        java.lang.String str23 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.secondOfDay();
        java.lang.String str25 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.era();
        org.joda.time.DurationField durationField28 = zonedChronology21.millis();
        org.joda.time.DurationField durationField29 = zonedChronology21.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str23, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str25, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int3 = calendar1.getMinimum(1);
        calendar1.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        timeZone7.setRawOffset((int) (short) 0);
        java.util.TimeZone.setDefault(timeZone7);
        calendar1.setTimeZone(timeZone7);
        calendar1.set(50, 1970, 11826724);
        java.util.Calendar.Builder builder16 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder20 = builder16.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder22 = builder20.setLenient(false);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone27.toTimeZone();
        boolean boolean30 = timeZone24.hasSameRules(timeZone29);
        java.util.Calendar.Builder builder31 = builder20.setTimeZone(timeZone29);
        java.util.TimeZone.setDefault(timeZone29);
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        int int35 = calendar34.getWeeksInWeekYear();
        java.util.Calendar.Builder builder36 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder40 = builder36.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder42 = builder40.setLenient(false);
        java.util.TimeZone timeZone44 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        java.util.TimeZone timeZone49 = dateTimeZone47.toTimeZone();
        boolean boolean50 = timeZone44.hasSameRules(timeZone49);
        java.util.Calendar.Builder builder51 = builder40.setTimeZone(timeZone49);
        calendar34.setTimeZone(timeZone49);
        boolean boolean53 = timeZone29.hasSameRules(timeZone49);
        int int54 = timeZone49.getRawOffset();
        java.util.TimeZone.setDefault(timeZone49);
        calendar1.setTimeZone(timeZone49);
        calendar1.clear();
        int int58 = calendar1.getFirstDayOfWeek();
        java.util.Locale locale59 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(locale59);
        int int61 = calendar60.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate62 = org.joda.time.LocalDate.fromCalendarFields(calendar60);
        org.joda.time.LocalDate localDate63 = org.joda.time.LocalDate.fromCalendarFields(calendar60);
        org.joda.time.LocalDate localDate64 = org.joda.time.LocalDate.fromCalendarFields(calendar60);
        int int65 = calendar60.getWeeksInWeekYear();
        int int66 = calendar1.compareTo(calendar60);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1645514745948,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=948,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 53 + "'", int35 == 53);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar60);
// flaky:         org.junit.Assert.assertEquals(calendar60.toString(), "java.util.GregorianCalendar[time=1645514745948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=948,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 53 + "'", int61 == 53);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 53 + "'", int65 == 53);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        boolean boolean4 = timeZone3.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone3.getDisplayName(true, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 11880987);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale6);
        java.lang.String str8 = property5.getAsText(locale6);
        java.lang.String str10 = locale6.getExtension('x');
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale14);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale14.getDisplayCountry(locale17);
        java.lang.String str20 = locale14.getExtension('u');
        java.lang.String str21 = locale6.getDisplayName(locale14);
        java.util.Locale.setDefault(locale14);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645514745985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u661f\u671f\u4e94" + "'", str8, "\u661f\u671f\u4e94");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645514745985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str18, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str21, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder2 = builder0.setLocale(locale1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis((long) 11);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        int int12 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getValue(2);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        int int16 = localDate11.getDayOfWeek();
        java.util.Date date17 = localDate11.toDate();
        int int18 = date17.getYear();
        java.util.Calendar.Builder builder19 = builder2.setInstant(date17);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("gregory");
        java.util.TimeZone.setDefault(timeZone21);
        java.util.Calendar.Builder builder23 = builder19.setTimeZone(timeZone21);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        int int7 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusHours(26157373);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withMinuteOfHour(11835455);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11835455 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 100, dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.plusDays(50);
        int int34 = localDate31.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight35 = localDate31.toDateMidnight();
        int[] intArray37 = zonedChronology21.get((org.joda.time.ReadablePartial) localDate31, 4518998492L);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology21.year();
        org.joda.time.DurationField durationField39 = zonedChronology21.halfdays();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 100, dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.plusDays(50);
        int int45 = localDate42.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate47 = localDate42.plusMonths(6);
        int int48 = localDate42.getYearOfEra();
        int int49 = localDate42.getCenturyOfEra();
        int int50 = localDate42.getMonthOfYear();
        int int51 = localDate42.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate53 = localDate42.plusYears(11856325);
        org.joda.time.format.DateTimePrinter dateTimePrinter54 = null;
        org.joda.time.format.DateTimeParser dateTimeParser55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter54, dateTimeParser55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withPivotYear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale63);
        java.lang.String str66 = locale63.toLanguageTag();
        java.lang.String str67 = dateTimeZone61.getName((long) (byte) 1, locale63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter56.withZone(dateTimeZone61);
        org.joda.time.Interval interval69 = localDate53.toInterval(dateTimeZone61);
        org.joda.time.Chronology chronology70 = zonedChronology21.withZone(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField73 = zonedChronology21.seconds();
        long long76 = durationField73.subtract((long) 11898734, 41365L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2022L + "'", long27 == 2022L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1970, 2, 22]");
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 19 + "'", int49 == 19);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ja-JP" + "'", str66, "ja-JP");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+59:50" + "'", str67, "+59:50");
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-29466266L) + "'", long76 == (-29466266L));
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayScript();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone8 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(72000000L, dateTimeZone6);
        int int11 = dateTimeZone6.getStandardOffset((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        org.joda.time.DateTime dateTime18 = localDate17.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property19 = localDate17.yearOfEra();
        org.joda.time.LocalDate localDate20 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate21 = property19.roundHalfEvenCopy();
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        org.joda.time.LocalDate localDate24 = property19.setCopy("2017", locale23);
        java.lang.String str25 = dateTimeZone6.getName((long) 11764640, locale23);
        java.lang.String str26 = locale0.getDisplayVariant(locale23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN" + "'", str1, "CHN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 215400000 + "'", int11 == 215400000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+59:50" + "'", str25, "+59:50");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(72000000L, dateTimeZone4);
        int int9 = dateTimeZone4.getStandardOffset((long) 'u');
        java.lang.String str11 = dateTimeZone4.getName(1645142400000L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 11779950, dateTimeZone4);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(10);
        boolean boolean15 = dateTime14.isEqualNow();
        int int16 = dateTime14.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        int int20 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime19);
        int int22 = dateTimeZone18.getOffsetFromLocal((long) 26187981);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 11778505, dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int25 = localTime23.get(dateTimeFieldType24);
        int int26 = dateTime14.get(dateTimeFieldType24);
        boolean boolean27 = dateTime14.isEqualNow();
        org.joda.time.DateTime.Property property28 = dateTime14.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 215400000 + "'", int9 == 215400000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+59:50" + "'", str11, "+59:50");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((long) 49);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone0);
        int int5 = localTime4.getMillisOfSecond();
        org.joda.time.LocalTime localTime7 = localTime4.minusHours(11814974);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localTime4.getFieldTypes();
        org.joda.time.LocalTime localTime10 = localTime4.minusMinutes(26414);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.eras();
        java.lang.String str12 = durationFieldType11.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime10.withFieldAdded(durationFieldType11, 11896231);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 88 + "'", int5 == 88);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eras" + "'", str12, "eras");
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYear(11900235);
        int int12 = localDateTime11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        java.util.Date date1 = new java.util.Date((long) 3);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField26 = zonedChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        java.lang.String str30 = dateTimeField27.getAsText((long) 38460802);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        boolean boolean10 = localDate7.equals((java.lang.Object) strSet9);
        org.joda.time.Chronology chronology11 = localDate7.getChronology();
        int int12 = localDate7.getDayOfYear();
        org.joda.time.LocalDate.Property property13 = localDate7.dayOfMonth();
        org.joda.time.LocalDate localDate14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        int int16 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfDay(26652567);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.weekyear();
        java.lang.String str10 = property9.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundHalfFloorCopy();
        java.lang.String str12 = localDateTime11.toString();
        java.lang.String str13 = localDateTime11.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2017" + "'", str10, "2017");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2017-01-02T00:00:00.000" + "'", str12, "2017-01-02T00:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2017-01-02T00:00:00.000" + "'", str13, "2017-01-02T00:00:00.000");
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays(51);
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
        int int7 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate9 = localDate5.minusDays(11826129);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate5.getValue(12159057);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12159057");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate8.era();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        org.joda.time.LocalDate localDate16 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate17 = property15.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField18 = property15.getField();
        boolean boolean20 = dateTimeField18.isLeap((long) 54584);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("2017-02-22T07:17:39.147");
        java.lang.String str24 = locale23.getISO3Country();
        java.util.Locale locale27 = new java.util.Locale("AM", "2022-02-15T07:18:52.135");
        java.lang.String str28 = locale23.getDisplayVariant(locale27);
        java.lang.String str29 = dateTimeField18.getAsShortText((long) 12117088, locale23);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "am_2022-02-15T07:18:52.135");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970" + "'", str29, "1970");
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        int int5 = localDate2.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int8 = localDate7.getWeekyear();
        int int9 = localDate7.size();
        org.joda.time.LocalDate localDate11 = localDate7.minusDays(11958636);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) 11);
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.minus(readableDuration16);
        org.joda.time.DateTime dateTime18 = instant14.toDateTimeISO();
        boolean boolean19 = localDate7.equals((java.lang.Object) dateTime18);
        int int20 = dateTime18.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        java.lang.String str27 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.monthOfYear();
        org.joda.time.DurationField durationField32 = zonedChronology21.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str27, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(50);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.LocalDate.Property property31 = localDate29.era();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        org.joda.time.LocalDate localDate33 = property31.getLocalDate();
        org.joda.time.LocalDate localDate35 = localDate33.withYear(26160535);
        org.joda.time.LocalDate localDate37 = localDate35.minusYears(11766550);
        int[] intArray39 = zonedChronology21.get((org.joda.time.ReadablePartial) localDate37, (long) 11764640);
        java.lang.String str40 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology21.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1970, 1, 1]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str40, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        int int12 = localDateTime11.getMillisOfSecond();
        int int13 = localDateTime11.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusYears(11840035);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundFloorCopy();
        java.lang.String str20 = localDateTime18.toString("2");
        int int21 = localDateTime18.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = property23.addToCopy(51);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withField(dateTimeFieldType30, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusYears(5);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withField(dateTimeFieldType41, (int) (short) 10);
        boolean boolean44 = localDateTime35.isSupported(dateTimeFieldType41);
        boolean boolean45 = localDateTime34.isSupported(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType41.getDurationType();
        int int47 = localDateTime26.get(dateTimeFieldType41);
        int int48 = localDateTime18.indexOf(dateTimeFieldType41);
        int int49 = localDateTime11.get(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime8.withField(dateTimeFieldType41, 54595433);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.minuteOfHour();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2" + "'", str20, "2");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(durationFieldType46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 29806250 + "'", int47 == 29806250);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = zonedChronology21.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale2);
        calendar4.setTimeInMillis((long) 11793543);
        java.util.TimeZone timeZone7 = calendar4.getTimeZone();
        java.util.TimeZone.setDefault(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        java.lang.Object obj10 = timeZone7.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=11793543,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=16,SECOND=33,MILLISECOND=543,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        int int7 = localDateTime0.getYearOfCentury();
        org.joda.time.Chronology chronology8 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(26163273);
        org.joda.time.LocalDateTime.Property property11 = localDateTime0.millisOfSecond();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfHour();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(11767873);
        int int20 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.withWeekyear(11775531);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes(26180512);
        int int25 = property9.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.minusMillis(11845211);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        int int40 = localDate37.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate42 = localDate37.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        int int45 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateMidnight dateMidnight46 = localDate37.toDateMidnight(dateTimeZone43);
        long long48 = dateTimeZone43.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology33, dateTimeZone43);
        org.joda.time.DurationField durationField50 = zonedChronology49.weeks();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology49.weekyear();
        org.joda.time.DurationField durationField52 = zonedChronology49.weekyears();
        long long56 = zonedChronology49.add(0L, 11776486L, 0);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology49.era();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology49.monthOfYear();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology49.monthOfYear();
        org.joda.time.Chronology chronology60 = zonedChronology49.withUTC();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.millisOfSecond();
        org.joda.time.DateTime dateTime62 = dateTime24.toDateTime(chronology60);
        boolean boolean63 = dateTime62.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26746 + "'", int20 == 26746);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60000L + "'", long48 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(215400000);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter2.parseLocalTime("07:10:28.915_24");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeZone6);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime14.withHourOfDay(9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime9.getFieldType((int) (byte) 1);
        int int12 = localTime7.get(dateTimeFieldType11);
        org.joda.time.LocalTime.Property property13 = localTime5.property(dateTimeFieldType11);
        org.joda.time.LocalTime localTime14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime15 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = property13.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField19 = property13.getField();
        org.joda.time.LocalTime localTime20 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime22 = localTime20.minusHours(11753441);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime20.plus(readablePeriod23);
        org.joda.time.LocalTime localTime26 = localTime20.plusMinutes(11767873);
        boolean boolean27 = calendar2.before((java.lang.Object) localTime26);
        int int28 = localTime26.getMillisOfSecond();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str1, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645514746369,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=369,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder2 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder4 = builder0.setLenient(true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        long long11 = dateTimeZone6.convertLocalToUTC((long) 2017, false, (long) 0);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = dateTimeZone6.getName((long) 26160535, locale14);
        java.util.Calendar.Builder builder18 = builder4.setLocale(locale14);
        java.util.Calendar.Builder builder22 = builder18.setWeekDate(11783576, 589, 11764515);
        java.util.Calendar.Builder builder26 = builder18.setWeekDate(11780612, 11757696, (int) 'u');
        java.util.Calendar.Builder builder30 = builder26.setDate(54611236, 11937111, 12036419);
        java.util.Calendar.Builder builder35 = builder30.setTimeOfDay(26367630, 68977485, 11914598, 12085056);
        int[] intArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder37 = builder35.setFields(intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2017L + "'", long11 == 2017L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = localDate2.toString("14", locale5);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(11776486);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        java.lang.String str11 = dateTime9.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "14" + "'", str6, "14");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0626-07-19T02:00:00.000Z" + "'", str11, "0626-07-19T02:00:00.000Z");
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: clockhourOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate8.minus(readablePeriod10);
        int int12 = localDate8.getWeekyear();
        int int13 = localDate8.getDayOfYear();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        boolean boolean12 = date7.after(date11);
        boolean boolean13 = date3.before(date7);
        int int14 = date3.getHours();
        date3.setMinutes(26435022);
        date3.setSeconds(12131847);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Aug 24 01:39:27 GMT 2020");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(17);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minusSeconds((int) 'u');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.plusMinutes(11850685);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(163);
        java.lang.String str10 = localDateTime7.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2044-09-03T22:50:46.440" + "'", str10, "2044-09-03T22:50:46.440");
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra(11859345);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        int int9 = dateTime6.get(dateTimeFieldType7);
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        java.util.Locale locale11 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder12 = builder10.setLocale(locale11);
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder17 = builder13.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder19 = builder17.setLenient(false);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        java.util.TimeZone timeZone26 = dateTimeZone24.toTimeZone();
        boolean boolean27 = timeZone21.hasSameRules(timeZone26);
        java.util.Calendar.Builder builder28 = builder17.setTimeZone(timeZone26);
        java.util.Calendar.Builder builder29 = builder10.setTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str32 = dateTimeZone30.getShortName(37L);
        boolean boolean33 = dateTimeZone30.isFixed();
        long long35 = dateTimeZone30.previousTransition((-31209354765690115L));
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate36.plus(readablePeriod37);
        org.joda.time.Chronology chronology39 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType7.getField(chronology39);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-31209354765690115L) + "'", long35 == (-31209354765690115L));
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(53);
        org.joda.time.DateMidnight dateMidnight5 = localDate2.toDateMidnight();
        int int6 = localDate2.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate8 = localDate2.plusYears(11762);
        org.joda.time.LocalDate.Property property9 = localDate8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate8.minus(readablePeriod10);
        org.joda.time.Chronology chronology12 = localDate8.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField25 = zonedChronology21.days();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField29 = zonedChronology21.hours();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.centuries();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(11898794);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withField(dateTimeFieldType30, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusYears(5);
        int int35 = localDateTime28.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property36 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime.Property property37 = localDateTime28.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundHalfEvenCopy();
        java.lang.String str40 = localDateTime38.toString("1970-01-01");
        java.lang.String str41 = localDateTime38.toString();
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.Instant instant44 = instant42.withMillis((long) 11);
        org.joda.time.Instant instant45 = instant44.toInstant();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant44.minus(readableDuration46);
        org.joda.time.Instant instant48 = instant44.toInstant();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant44.plus(readableDuration49);
        org.joda.time.Instant instant51 = new org.joda.time.Instant();
        org.joda.time.Instant instant53 = instant51.withMillis((long) 11);
        org.joda.time.Instant instant54 = instant53.toInstant();
        org.joda.time.Chronology chronology55 = instant53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = instant53.toMutableDateTimeISO();
        boolean boolean57 = instant44.isAfter((org.joda.time.ReadableInstant) instant53);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.minuteOfHour();
        org.joda.time.LocalDateTime.Property property60 = localDateTime58.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property60.getFieldType();
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType61.getDurationType();
        boolean boolean63 = instant44.isSupported(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property64 = localDateTime38.property(dateTimeFieldType61);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = localDate27.get(dateTimeFieldType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2000-01-01T00:00:00.000" + "'", str41, "2000-01-01T00:00:00.000");
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(property64);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.LocalDate localDate8 = property6.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYear(26160535);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 100, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.plusDays(50);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.plusDays(50);
        int int23 = localDate20.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate25 = localDate20.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        int int28 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateMidnight dateMidnight29 = localDate20.toDateMidnight(dateTimeZone26);
        long long31 = dateTimeZone26.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology16, dateTimeZone26);
        org.joda.time.DurationField durationField33 = zonedChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.weekyear();
        org.joda.time.DurationField durationField35 = zonedChronology32.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology32, dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight40 = localDate10.toDateMidnight(dateTimeZone38);
        org.joda.time.LocalDate.Property property41 = localDate10.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60000L + "'", long31 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(zonedChronology39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property10.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField16 = property10.getField();
        org.joda.time.LocalTime localTime17 = property10.roundCeilingCopy();
        org.joda.time.LocalTime localTime19 = localTime17.minusHours(11753441);
        org.joda.time.LocalTime.Property property20 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime22 = property20.addCopy((long) 11760560);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime22.plus(readablePeriod23);
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale26);
        java.lang.String str29 = locale26.getDisplayScript();
        java.util.Locale locale30 = locale26.stripExtensions();
        java.lang.String str31 = localTime24.toString("11938519", locale26);
        org.joda.time.LocalTime.Property property32 = localTime24.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "11938519" + "'", str31, "11938519");
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 11897315);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusYears(11813676);
        org.joda.time.LocalDate localDate7 = localDate1.minusYears(12105496);
        org.joda.time.LocalDate.Property property8 = localDate7.dayOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        java.util.TimeZone timeZone28 = dateTimeZone26.toTimeZone();
        org.joda.time.Chronology chronology29 = zonedChronology21.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField30 = zonedChronology21.days();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.era();
        org.joda.time.DurationField durationField32 = zonedChronology21.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 11896);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getScript();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        int int17 = dateTimeField12.getMaximumTextLength(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter9.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withPivotYear(12268547);
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter20.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(dateTimeParser21);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(53);
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.Chronology chronology6 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property7 = localDate2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.joda.time.LocalDate localDate9 = property7.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withEra(11967575);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11967575 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withYearOfEra(17);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears(12240353);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12346596 + "'", int4 == 12346596);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField29 = zonedChronology21.centuries();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        boolean boolean34 = dateTimeZone32.isFixed();
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology21, dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology35.dayOfYear();
        org.joda.time.DurationField durationField37 = zonedChronology35.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(zonedChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField26 = zonedChronology21.weeks();
        org.joda.time.Chronology chronology27 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.monthOfYear();
        long long31 = dateTimeField28.add(11951321L, (-215399969L));
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate.Property property36 = localDate35.weekyear();
        org.joda.time.LocalDate localDate38 = localDate35.minusMonths(11753234);
        org.joda.time.tz.NameProvider nameProvider40 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 100, dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate44.plusDays(50);
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.millisOfDay();
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str54 = locale51.getDisplayLanguage(locale52);
        java.lang.String str55 = dateTimeField48.getAsShortText(26150856, locale52);
        java.lang.String str58 = nameProvider40.getName(locale52, "", "26150856");
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 100, dateTimeZone60);
        org.joda.time.LocalDate localDate63 = localDate61.minusYears(53);
        org.joda.time.Chronology chronology64 = localDate61.getChronology();
        org.joda.time.Chronology chronology65 = localDate61.getChronology();
        org.joda.time.LocalDate.Property property66 = localDate61.weekOfWeekyear();
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        int int68 = property66.getMaximumShortTextLength(locale67);
        java.lang.String str71 = nameProvider40.getName(locale67, "14", "DurationField[years]");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale74 = java.util.Locale.TAIWAN;
        java.lang.String str75 = locale73.getDisplayCountry(locale74);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(locale74);
        java.util.Locale locale77 = java.util.Locale.PRC;
        java.lang.String str78 = locale74.getDisplayCountry(locale77);
        java.lang.String str79 = locale74.getISO3Country();
        java.util.Locale.setDefault(locale74);
        java.lang.String str83 = nameProvider40.getShortName(locale74, "1970-01-01T00:00:00.010Z", "1970-4-10 0:00:00");
        java.lang.String str84 = localDate38.toString("72057722", locale74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = dateTimeField28.getAsText(26687, locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26687");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-566447206912848679L) + "'", long31 == (-566447206912848679L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(nameProvider40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "26150856" + "'", str55, "26150856");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(calendar76);
// flaky:         org.junit.Assert.assertEquals(calendar76.toString(), "java.util.GregorianCalendar[time=1645514746628,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=628,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str78, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "TWN" + "'", str79, "TWN");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "72057722" + "'", str84, "72057722");
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.millisOfDay();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale11 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale10.getDisplayLanguage(locale11);
        java.lang.String str14 = dateTimeField7.getAsShortText(26150856, locale11);
        java.util.Locale.Builder builder15 = builder0.setLocale(locale11);
        java.util.Locale.Builder builder17 = builder15.setVariant("Deutsch");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "26150856" + "'", str14, "26150856");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 2017, false, (long) 0);
        boolean boolean7 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertUTCToLocal((long) 11961495);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2017L + "'", long6 == 2017L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11961495L + "'", long9 == 11961495L);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = zonedChronology21.add(readablePeriod25, (long) 11774514, 11842080);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11774514L + "'", long28 == 11774514L);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus((long) 2);
        org.joda.time.Instant instant4 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant6 = instant0.minus((long) '#');
        org.joda.time.Instant instant9 = instant0.withDurationAdded(0L, 11844435);
        org.joda.time.Instant instant11 = instant9.minus(11839594L);
        java.util.Date date12 = instant9.toDate();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Feb 22 07:25:46 GMT 2022");
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-203597754L), dateTimeZone1);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.year();
        org.joda.time.DurationField durationField28 = zonedChronology21.days();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.era();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        java.util.TimeZone timeZone38 = dateTimeZone36.toTimeZone();
        boolean boolean39 = timeZone33.hasSameRules(timeZone38);
        boolean boolean40 = timeZone31.hasSameRules(timeZone33);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(11780467L, dateTimeZone41);
        boolean boolean43 = dateTimeZone41.isFixed();
        org.joda.time.Chronology chronology44 = zonedChronology21.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology21.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis((long) 11);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.Chronology chronology5 = instant3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '#', chronology5);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((-195));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusHours(11951233);
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.weekyear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withMillisOfDay(8);
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.yearOfCentury();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 26199);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(54590193);
        int int12 = localDateTime9.getYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28221 + "'", int12 == 28221);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property1.addToCopy(51);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime7 = property5.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime8 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusYears(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay(11915379);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy(12073867);
        java.lang.String str16 = localDateTime15.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35079-04-09T03:18:35.379" + "'", str16, "35079-04-09T03:18:35.379");
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale7);
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = locale7.getDisplayCountry(locale10);
        java.util.Locale.Builder builder12 = builder1.setLocale(locale7);
        java.util.Locale.Builder builder13 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("allemand (Allemagne)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: allemand (Allemagne) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645514746746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=746,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str11, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder2 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder4 = builder0.setLenient(true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        long long11 = dateTimeZone6.convertLocalToUTC((long) 2017, false, (long) 0);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = dateTimeZone6.getName((long) 26160535, locale14);
        java.util.Calendar.Builder builder18 = builder4.setLocale(locale14);
        java.util.Calendar.Builder builder22 = builder18.setWeekDate(11783576, 589, 11764515);
        java.util.Calendar.Builder builder26 = builder18.setWeekDate(11780612, 11757696, (int) 'u');
        java.util.Calendar.Builder builder30 = builder26.setDate(54611236, 11937111, 12036419);
        java.util.Calendar calendar31 = builder26.build();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.fromCalendarFields(calendar31);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = calendar31.getMinimum(54611002);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54611002");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2017L + "'", long11 == 2017L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1755733502217600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=55638949,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=307,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(8);
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes(26156834);
        org.joda.time.LocalTime.Property property8 = localTime5.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property8.addCopy((long) 12050086);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(4);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusDays(11776312);
        int int14 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(54624207);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField27 = zonedChronology21.seconds();
        java.lang.String str28 = zonedChronology21.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str28, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime8.plusDays(2);
        java.util.Date date13 = dateTime8.toDate();
        org.joda.time.DateTime.Property property14 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime16 = dateTime8.minusMonths(11764515);
        org.joda.time.DateTime dateTime17 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property18 = dateTime8.millisOfDay();
        org.joda.time.DateTime.Property property19 = dateTime8.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withField(dateTimeFieldType22, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.minusYears(5);
        int int27 = localDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology28 = localDateTime20.getChronology();
        java.util.Date date29 = localDateTime20.toDate();
        org.joda.time.LocalDateTime.Property property30 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property30.addWrapFieldToCopy(11934693);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.centuryOfEra();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusDays(11898488);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = property38.addWrapFieldToCopy(11756302);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plus(readableDuration41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withDurationAdded(readableDuration43, (int) (short) 1);
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime40.plusHours(11815565);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property51 = localDateTime40.property(dateTimeFieldType49);
        int int52 = localDateTime36.get(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime56 = property54.addWrapFieldToCopy(11756302);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plus(readableDuration57);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfEra();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime63 = property60.addToCopy((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property60.getFieldType();
        int int65 = localDateTime58.get(dateTimeFieldType64);
        boolean boolean66 = localDateTime36.isSupported(dateTimeFieldType64);
        org.joda.time.DateTime dateTime68 = dateTime8.withField(dateTimeFieldType64, 11760637);
        int int69 = localDateTime6.get(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Feb 22 07:25:46 GMT 2022");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Feb 22 07:25:46 GMT 2022");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(property51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 25 + "'", int52 == 25);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2022 + "'", int65 == 2022);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2022 + "'", int69 == 2022);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays(51);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withEra(12174988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12174988 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 11783576, 26163273);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.yearOfEra();
        org.joda.time.DurationField durationField32 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField33 = zonedChronology21.seconds();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str36 = dateTimeZone35.toString();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now(dateTimeZone35);
        org.joda.time.Chronology chronology38 = zonedChronology21.withZone(dateTimeZone35);
        org.joda.time.DurationField durationField39 = zonedChronology21.hours();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField41 = zonedChronology21.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11783576L + "'", long29 == 11783576L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        int int10 = localDateTime9.getSecondOfMinute();
        boolean boolean11 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withField(dateTimeFieldType14, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minusYears(5);
        java.lang.String str19 = localDateTime18.toString();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.plusSeconds(2022);
        java.lang.String str23 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime6.withSecondOfMinute(15);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withDurationAdded(readableDuration26, 11827568);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime29.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 46 + "'", int10 == 46);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2017-02-22T07:25:46.921" + "'", str19, "2017-02-22T07:25:46.921");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2017-02-22T07:25:46.921" + "'", str23, "2017-02-22T07:25:46.921");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(50);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.monthOfYear();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter2.withChronology(chronology13);
        org.joda.time.DurationField durationField15 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('x');
        java.lang.String str3 = locale0.getISO3Country();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale0);
        int int5 = calendar4.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar4.roll(26524, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TWN" + "'", str3, "TWN");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514746954,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=46,MILLISECOND=954,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.plus((long) 11757325);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        boolean boolean11 = instant3.isBefore((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime12 = instant3.toDateTimeISO();
        int int13 = dateTime12.getSecondOfMinute();
        long long14 = dateTime12.getMillis();
        org.joda.time.DateTime.Property property15 = dateTime12.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.plusDays(50);
        int int29 = localDate26.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate26.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        int int34 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateMidnight dateMidnight35 = localDate26.toDateMidnight(dateTimeZone32);
        long long37 = dateTimeZone32.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone32);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.year();
        org.joda.time.DateTimeZone dateTimeZone41 = zonedChronology38.getZone();
        org.joda.time.DurationField durationField42 = zonedChronology38.months();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology38.clockhourOfHalfday();
        org.joda.time.Instant instant44 = new org.joda.time.Instant();
        org.joda.time.Instant instant46 = instant44.withMillis((long) 11);
        org.joda.time.Instant instant47 = instant46.toInstant();
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 100, dateTimeZone51);
        int int53 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDate52);
        int int54 = dateTimeField49.getMinimumValue();
        boolean boolean55 = zonedChronology38.equals((java.lang.Object) int54);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology38.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone57 = zonedChronology38.getZone();
        org.joda.time.DateTimeZone dateTimeZone58 = zonedChronology38.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) property15, (org.joda.time.Chronology) zonedChronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60000L + "'", long37 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 12 + "'", int53 == 12);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int10 = localDate8.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight11 = localDate8.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate8.dayOfWeek();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime0.toGregorianCalendar();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 11);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 11760560, chronology11);
        org.joda.time.DateTime dateTime14 = dateTime0.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(11867232);
        boolean boolean18 = dateTime14.isEqual((long) 12074644);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays(32);
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minus(0L);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMillis(26161850);
        org.joda.time.DateTime dateTime16 = dateTime12.withMillisOfSecond(16);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withField(dateTimeFieldType23, (int) (short) 10);
        boolean boolean26 = localDateTime17.isSupported(dateTimeFieldType23);
        java.lang.String str27 = dateTimeFieldType23.getName();
        boolean boolean28 = dateTime12.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime6.withField(dateTimeFieldType23, 48);
        int int31 = localDateTime30.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.plusMonths(11868878);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfMonth();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "millisOfDay" + "'", str27, "millisOfDay");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        java.util.Date date7 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        java.util.Date date11 = localDate10.toDate();
        boolean boolean12 = date7.after(date11);
        boolean boolean13 = date3.before(date7);
        int int14 = date3.getDay();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        java.util.Date date19 = localDate18.toDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        java.util.Date date23 = localDate22.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        java.util.Date date27 = localDate26.toDate();
        boolean boolean28 = date23.after(date27);
        boolean boolean29 = date19.before(date23);
        date23.setDate(100);
        java.lang.String str32 = date23.toLocaleString();
        date23.setSeconds(20);
        boolean boolean35 = date3.before(date23);
        date3.setYear(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Jan 01 00:00:00 GMT 1900");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Apr 10 00:00:20 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e0a\u5348 12:00:00" + "'", str32, "\u4e0a\u5348 12:00:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plus(readablePeriod9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withPeriodAdded(readablePeriod11, 12254609);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        java.util.Locale locale3 = new java.util.Locale("2017-02-22T07:16:02.367", "07:25:56.236", "");
        org.junit.Assert.assertEquals(locale3.toString(), "2017-02-22t07:16:02.367_07:25:56.236");
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CN");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        int int9 = calendar8.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 100, dateTimeZone12);
        java.util.Date date14 = localDate13.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        java.util.Date date22 = localDate21.toDate();
        boolean boolean23 = date18.after(date22);
        boolean boolean24 = date14.before(date18);
        int int25 = date14.getDay();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromDateFields(date14);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 100, dateTimeZone28);
        java.util.Date date30 = localDate29.toDate();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        java.util.Date date34 = localDate33.toDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        java.util.Date date38 = localDate37.toDate();
        boolean boolean39 = date34.after(date38);
        boolean boolean40 = date30.before(date34);
        date34.setDate(100);
        java.lang.String str43 = date34.toLocaleString();
        date34.setSeconds(20);
        boolean boolean46 = date14.before(date34);
        calendar8.setTime(date14);
        java.util.TimeZone timeZone48 = calendar8.getTimeZone();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone48);
        boolean boolean50 = languageRange1.equals((java.lang.Object) calendar49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Fri Apr 10 00:00:20 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e0a\u5348 12:00:00" + "'", str43, "\u4e0a\u5348 12:00:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1645514747059,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=59,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate.Property property6 = localDate4.year();
        org.joda.time.LocalDate localDate7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property6.withMinimumValue();
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths(43);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate8 = property6.roundHalfEvenCopy();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        org.joda.time.LocalDate localDate11 = property6.setCopy("2017", locale10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(50);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property20 = localDate18.yearOfEra();
        org.joda.time.LocalDate localDate21 = property20.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate23 = property20.addToCopy((int) (short) 1);
        boolean boolean24 = localDate11.equals((java.lang.Object) property20);
        org.joda.time.LocalDate.Property property25 = localDate11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.yearOfEra();
        org.joda.time.DurationField durationField28 = zonedChronology21.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime3 = property1.addWrapFieldToCopy(11756302);
        org.joda.time.LocalDateTime localDateTime4 = property1.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withWeekyear(11900846);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek(12079198);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12079198 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = dateTime4.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.plusMonths(49);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.LocalDate.Property property17 = localDate16.monthOfYear();
        org.joda.time.LocalDate.Property property18 = localDate16.year();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(50);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.plusDays(50);
        int int31 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate33 = localDate28.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        int int36 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateMidnight dateMidnight37 = localDate28.toDateMidnight(dateTimeZone34);
        long long39 = dateTimeZone34.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone34);
        org.joda.time.DateTime dateTime41 = localDate16.toDateTimeAtStartOfDay(dateTimeZone34);
        java.lang.String str43 = dateTimeZone34.getName((-3155695200000L));
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.Interval interval45 = localDate11.toInterval(dateTimeZone34);
        org.joda.time.LocalDate localDate47 = localDate11.plusMonths(11842946);
        org.joda.time.LocalDate localDate49 = localDate11.withCenturyOfEra(26381);
        org.joda.time.LocalDate localDate51 = localDate11.minusYears(12092627);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 60000L + "'", long39 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundFloorCopy();
        int int3 = localDateTime2.getYearOfCentury();
        org.joda.time.DateTime dateTime4 = localDateTime2.toDateTime();
        int int5 = localDateTime2.getDayOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus(readablePeriod7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withField(dateTimeFieldType13, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minusYears(5);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.weekyear();
        java.lang.String str21 = property20.getAsString();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime24 = property20.addToCopy(32769);
        int int25 = property20.get();
        org.joda.time.DurationField durationField26 = property20.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime28 = property20.setCopy(54580168);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        int int30 = localDateTime8.getMonthOfYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2017" + "'", str21, "2017");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2017 + "'", int25 == 2017);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((long) 11);
        org.joda.time.Instant instant30 = instant29.toInstant();
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        int int36 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDate35);
        int int37 = dateTimeField32.getMinimumValue();
        boolean boolean38 = zonedChronology21.equals((java.lang.Object) int37);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField40 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField41 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology21.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12 + "'", int36 == 12);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        int int5 = localDateTime0.getMillisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = localDateTime0.getField(0);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 11);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withField(dateTimeFieldType17, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusYears(5);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withField(dateTimeFieldType28, (int) (short) 10);
        boolean boolean31 = localDateTime22.isSupported(dateTimeFieldType28);
        boolean boolean32 = localDateTime21.isSupported(dateTimeFieldType28);
        java.util.Locale locale33 = java.util.Locale.FRENCH;
        java.lang.String str34 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime21, locale33);
        java.lang.String str35 = dateTimeField7.getAsText(3155760000000L, locale33);
        long long37 = dateTimeField7.roundHalfEven((long) 38458657);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26747228 + "'", int5 == 26747228);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "445" + "'", str34, "445");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2070" + "'", str35, "2070");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField28 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology21.months();
        org.joda.time.DateTimeZone dateTimeZone33 = zonedChronology21.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = zonedChronology21.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 11753187);
        org.joda.time.Instant instant4 = instant2.withMillis(31556952000L);
        long long5 = instant2.getMillis();
        org.joda.time.DateTime dateTime6 = instant2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        java.util.Date date10 = localDate9.toDate();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight();
        java.lang.String str12 = localDate9.toString();
        org.joda.time.LocalDate localDate14 = localDate9.plusYears(26173023);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(72000000L, dateTimeZone19);
        int int24 = dateTimeZone19.getStandardOffset((long) 'u');
        java.lang.String str26 = dateTimeZone19.getName(1645142400000L);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 11779950, dateTimeZone19);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(10);
        boolean boolean30 = dateTime29.isEqualNow();
        org.joda.time.DateTime dateTime31 = localDate9.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withDurationAdded(readableDuration32, 54616082);
        boolean boolean35 = instant2.isEqual((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime37 = dateTime34.minusMonths(12312782);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645526500452L + "'", long5 == 1645526500452L);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 215400000 + "'", int24 == 215400000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+59:50" + "'", str26, "+59:50");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 2017, false, (long) 0);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        java.lang.String str12 = dateTimeZone1.getName((long) 26160535, locale9);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale9);
        java.util.TimeZone timeZone14 = calendar13.getTimeZone();
        int int16 = timeZone14.getOffset((-27418799L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        long long23 = dateTimeZone18.convertLocalToUTC((long) 2017, false, (long) 0);
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.lang.String str29 = dateTimeZone18.getName((long) 26160535, locale26);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale26);
        java.util.TimeZone timeZone31 = calendar30.getTimeZone();
        calendar30.set(978995, 11828707, 11803857, 11918747, 68989517);
        java.util.TimeZone timeZone38 = calendar30.getTimeZone();
        boolean boolean39 = timeZone14.hasSameRules(timeZone38);
        boolean boolean40 = timeZone14.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2017L + "'", long6 == 2017L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645514747290,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2017L + "'", long23 == 2017L);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=978995,MONTH=11828707,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=11803857,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=11918747,MINUTE=68989517,SECOND=47,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = localDate2.minusMonths(11753234);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(50);
        int int20 = localDate17.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate22 = localDate17.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateMidnight dateMidnight26 = localDate17.toDateMidnight(dateTimeZone23);
        long long28 = dateTimeZone23.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology13, dateTimeZone23);
        org.joda.time.DurationField durationField30 = zonedChronology29.weeks();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology29.weekyear();
        org.joda.time.DurationField durationField32 = zonedChronology29.weekyears();
        long long36 = zonedChronology29.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField37 = zonedChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology29.weekyearOfCentury();
        org.joda.time.Chronology chronology39 = zonedChronology29.withUTC();
        org.joda.time.DurationField durationField40 = zonedChronology29.halfdays();
        java.lang.String str41 = zonedChronology29.toString();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType7.getField((org.joda.time.Chronology) zonedChronology29);
        org.joda.time.DurationField durationField43 = zonedChronology29.millis();
        org.joda.time.DurationField durationField44 = zonedChronology29.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60000L + "'", long28 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str41, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField27 = zonedChronology21.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        java.util.Date date31 = localDate30.toDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        java.util.Date date35 = localDate34.toDate();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        java.util.Date date39 = localDate38.toDate();
        boolean boolean40 = date35.after(date39);
        boolean boolean41 = date31.before(date35);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 100, dateTimeZone43);
        java.util.Date date45 = localDate44.toDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        java.util.Date date49 = localDate48.toDate();
        boolean boolean50 = date45.after(date49);
        boolean boolean51 = date31.before(date45);
        java.util.Date date53 = new java.util.Date((long) 11756302);
        boolean boolean54 = date31.before(date53);
        boolean boolean55 = zonedChronology21.equals((java.lang.Object) date53);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = zonedChronology21.add(readablePeriod56, (long) 11896086, 11888568);
        org.joda.time.DateTimeZone dateTimeZone60 = zonedChronology21.getZone();
        boolean boolean61 = dateTimeZone60.isFixed();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 03:15:56 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 11896086L + "'", long59 == 11896086L);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        org.joda.time.DateTime dateTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime7 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusSeconds(11783369);
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime7.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.setCopy("2017-02-24T19:11:57.870");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2017-02-24T19:11:57.870\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        int int6 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime2.withChronology(chronology12);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.DateTimeZone dateTimeZone3 = instant0.getZone();
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant0.plus(readableDuration5);
        org.joda.time.Instant instant8 = instant6.withMillis((long) 54584910);
        org.joda.time.Instant instant10 = instant6.minus((long) 12068949);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(215400000);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 11770512);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(49);
        org.joda.time.DateTime dateTime14 = dateTime12.plus(10L);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime14.minusMonths((int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime17.plusSeconds(11781671);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(50);
        int int25 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate27 = localDate22.plusMonths(6);
        int int28 = localDate22.getYearOfEra();
        int int29 = localDate22.getCenturyOfEra();
        org.joda.time.LocalDate localDate31 = localDate22.withWeekOfWeekyear((int) '#');
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean34 = localDate31.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        java.util.TimeZone timeZone40 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(72000000L, dateTimeZone38);
        int int43 = dateTimeZone38.getStandardOffset((long) 'u');
        java.lang.String str45 = dateTimeZone38.getName(1645142400000L);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime47 = localDate31.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now(dateTimeZone38);
        java.util.Locale locale53 = new java.util.Locale("22", "11763-01-01", "dayOfYear");
        java.lang.String str54 = dateTimeZone38.getShortName((long) 41, locale53);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime17.toMutableDateTime(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = dateTimeFormatter8.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime55, "12150", 12089023);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 19 + "'", int29 == 19);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 215400000 + "'", int43 == 215400000);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+59:50" + "'", str45, "+59:50");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertEquals(locale53.toString(), "22_11763-01-01_dayOfYear");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+59:50" + "'", str54, "+59:50");
        org.junit.Assert.assertNotNull(mutableDateTime55);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        org.joda.time.LocalTime.Property property5 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime9 = property5.addCopy(12245230);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.halfdayOfDay();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.YearMonthDay yearMonthDay31 = dateTime30.toYearMonthDay();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        java.util.TimeZone timeZone40 = dateTimeZone38.toTimeZone();
        boolean boolean41 = timeZone35.hasSameRules(timeZone40);
        boolean boolean42 = timeZone33.hasSameRules(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(11780467L, dateTimeZone43);
        boolean boolean45 = dateTimeZone43.isFixed();
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale47);
        java.lang.String str50 = locale47.toLanguageTag();
        java.util.Set<java.lang.String> strSet51 = locale47.getUnicodeLocaleKeys();
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.lang.String str53 = locale52.getDisplayName();
        java.util.Locale.setDefault(locale52);
        java.lang.String str55 = locale47.getDisplayName(locale52);
        java.lang.String str56 = dateTimeZone43.getShortName(31L, locale47);
        java.util.Calendar calendar57 = dateTime30.toCalendar(locale47);
        org.joda.time.DateTime dateTime59 = dateTime30.plusMinutes(11847733);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2022L + "'", long27 == 2022L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ja-JP" + "'", str50, "ja-JP");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str53, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Japanisch (Japan)" + "'", str55, "Japanisch (Japan)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertNotNull(calendar57);
// flaky:         org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=1645514747431,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=431,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.setCopy(26156834);
        org.joda.time.DateTime dateTime8 = property4.addToCopy((long) 1970);
        org.joda.time.DateTimeField dateTimeField9 = property4.getField();
        org.joda.time.DateTime dateTime11 = property4.addWrapFieldToCopy(2023);
        org.joda.time.DateTime dateTime12 = property4.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds(10);
        org.joda.time.LocalTime.Property property18 = localTime17.minuteOfHour();
        org.joda.time.LocalTime localTime20 = property18.addCopy((long) 59);
        org.joda.time.LocalTime localTime21 = property18.roundCeilingCopy();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        org.joda.time.Chronology chronology25 = dateTime23.getChronology();
        boolean boolean26 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localTime33.getFieldType((int) (byte) 1);
        int int36 = localTime31.get(dateTimeFieldType35);
        org.joda.time.LocalTime.Property property37 = localTime29.property(dateTimeFieldType35);
        org.joda.time.LocalTime localTime38 = property37.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime39 = property37.getLocalTime();
        org.joda.time.LocalTime localTime40 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime42 = property37.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField43 = property37.getField();
        org.joda.time.LocalTime localTime44 = property37.roundCeilingCopy();
        org.joda.time.LocalTime localTime46 = localTime44.minusHours(11753441);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        int int49 = dateTimeZone47.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime50 = localTime46.toDateTimeToday(dateTimeZone47);
        org.joda.time.DateTime dateTime51 = dateTime22.withZone(dateTimeZone47);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime54 = dateTime22.withPeriodAdded(readablePeriod52, 54);
        org.joda.time.DateTime dateTime55 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = dateTime55.toDateTimeISO();
        org.joda.time.DateTime dateTime57 = dateTime55.toDateTime();
        boolean boolean58 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology25);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25 + "'", int36 == 25);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DurationField durationField29 = zonedChronology21.millis();
        org.joda.time.DurationField durationField30 = zonedChronology21.months();
        org.joda.time.DurationField durationField31 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField32 = zonedChronology21.days();
        org.joda.time.DurationField durationField33 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology21.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2022L + "'", long27 == 2022L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis((long) 11);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        int int12 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDate11);
        int int14 = localDate11.getValue(2);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        org.joda.time.LocalDate.Property property16 = localDate11.era();
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        int int19 = calendar18.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromCalendarFields(calendar18);
        java.util.TimeZone timeZone21 = calendar18.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 100, dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.minusYears(53);
        org.joda.time.DateMidnight dateMidnight27 = localDate24.toDateMidnight();
        int int28 = localDate24.getWeekOfWeekyear();
        java.util.Calendar.Builder builder29 = new java.util.Calendar.Builder();
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder31 = builder29.setLocale(locale30);
        java.util.Calendar.Builder builder32 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder36 = builder32.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder38 = builder36.setLenient(false);
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        java.util.TimeZone timeZone45 = dateTimeZone43.toTimeZone();
        boolean boolean46 = timeZone40.hasSameRules(timeZone45);
        java.util.Calendar.Builder builder47 = builder36.setTimeZone(timeZone45);
        java.util.Calendar.Builder builder48 = builder29.setTimeZone(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTime dateTime50 = localDate24.toDateTimeAtStartOfDay(dateTimeZone49);
        java.util.TimeZone timeZone51 = dateTimeZone49.toTimeZone();
        boolean boolean52 = timeZone21.hasSameRules(timeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime54 = localDate11.toDateTimeAtMidnight(dateTimeZone53);
        long long58 = dateTimeZone53.convertLocalToUTC((long) 11865564, false, (long) 11925070);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(1163205L, dateTimeZone53);
        org.joda.time.DateTime dateTime60 = dateTime0.toDateTime(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645514747522,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=522,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 11865564L + "'", long58 == 11865564L);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.setCopy(26156834);
        org.joda.time.DateTime dateTime8 = property4.addToCopy((long) 1970);
        org.joda.time.DateTime dateTime9 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property4.addWrapFieldToCopy(11753234);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(11764152);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        boolean boolean15 = dateTime13.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime13.minusMonths(11897353);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek(26168469);
        calendar1.setTimeInMillis((long) 11790335);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        java.util.Date date9 = localDate8.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        java.util.Date date13 = localDate12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        java.util.Date date17 = localDate16.toDate();
        boolean boolean18 = date13.after(date17);
        boolean boolean19 = date9.before(date13);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        java.util.Date date23 = localDate22.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        java.util.Date date27 = localDate26.toDate();
        boolean boolean28 = date23.after(date27);
        boolean boolean29 = date9.before(date23);
        int int30 = date23.getMinutes();
        java.time.Instant instant31 = date23.toInstant();
        java.util.Date date32 = java.util.Date.from(instant31);
        java.util.Date date33 = java.util.Date.from(instant31);
        calendar1.setTime(date33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        java.util.Date date38 = localDate37.toDate();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 100, dateTimeZone40);
        java.util.Date date42 = localDate41.toDate();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 100, dateTimeZone44);
        java.util.Date date46 = localDate45.toDate();
        boolean boolean47 = date42.after(date46);
        boolean boolean48 = date38.before(date42);
        date42.setDate(100);
        java.lang.String str51 = date42.toLocaleString();
        date42.setMonth(32772);
        boolean boolean54 = date33.before(date42);
        java.time.Instant instant55 = date42.toInstant();
        date42.setTime((long) 26639);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=26168469,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:26 GMT 1970");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10.04.1970 00:00:00" + "'", str51, "10.04.1970 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(instant55);
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        java.util.Date date3 = new java.util.Date(11778505, 86399999, 26241758);
        date3.setSeconds(12093509);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Oct 15 23:18:29 GMT 19052252");
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded(readableDuration11, 26394694);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(12085980);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) 11768869, 12081011);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12347600 + "'", int4 == 12347600);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("jpn");
        int int2 = timeZone1.getRawOffset();
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder7 = builder3.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder9 = builder7.setLenient(false);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone14.toTimeZone();
        boolean boolean17 = timeZone11.hasSameRules(timeZone16);
        java.util.Calendar.Builder builder18 = builder7.setTimeZone(timeZone16);
        java.util.TimeZone.setDefault(timeZone16);
        timeZone16.setRawOffset(11753234);
        java.lang.String str22 = timeZone16.getID();
        boolean boolean23 = timeZone1.hasSameRules(timeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(50);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.millisOfDay();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType24.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.dayOfMonth();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.lang.String str38 = dateTimeField35.getAsShortText(26336, locale37);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone1, locale37);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GMT" + "'", str22, "GMT");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "26336" + "'", str38, "26336");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1645514747609,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=47,MILLISECOND=609,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.minuteOfHour();
        org.joda.time.DurationField durationField27 = zonedChronology21.hours();
        org.joda.time.DurationField durationField28 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.era();
        org.joda.time.DurationField durationField32 = zonedChronology21.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears(26591084);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22" + "'", str3, "2022-02-22");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.plusDays(58);
        org.joda.time.DateTime dateTime12 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay16 = dateTime15.toTimeOfDay();
        org.joda.time.DateTime.Property property17 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay22 = dateTime21.toTimeOfDay();
        org.joda.time.DateTime.Property property23 = dateTime21.yearOfEra();
        org.joda.time.DateTime dateTime24 = property23.roundCeilingCopy();
        org.joda.time.DateTime dateTime25 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property23.getFieldType();
        org.joda.time.DateTime.Property property27 = dateTime18.property(dateTimeFieldType26);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType26.getRangeDurationType();
        org.joda.time.DateTime.Property property29 = dateTime4.property(dateTimeFieldType26);
        boolean boolean31 = dateTime4.isAfter((-7560269474L));
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.lang.String str5 = nameProvider0.getName(locale2, "Thu Jan 01 00:00:00 UTC 1970", "it");
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder7.build();
        java.lang.String str12 = nameProvider0.getName(locale9, "it", "1970");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale9);
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder18 = builder14.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder20 = builder18.setLenient(false);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone27 = dateTimeZone25.toTimeZone();
        boolean boolean28 = timeZone22.hasSameRules(timeZone27);
        java.util.Calendar.Builder builder29 = builder18.setTimeZone(timeZone27);
        java.util.TimeZone.setDefault(timeZone27);
        boolean boolean31 = timeZone27.observesDaylightTime();
        java.lang.String str32 = timeZone27.getID();
        calendar13.setTimeZone(timeZone27);
        timeZone27.setRawOffset(5759);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645514747668,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5759,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=41,SECOND=40,MILLISECOND=902,ZONE_OFFSET=11753234,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GMT" + "'", str32, "GMT");
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter6.parseLocalDate("11958000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property10.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField16 = property10.getField();
        org.joda.time.LocalTime localTime17 = property10.roundCeilingCopy();
        org.joda.time.LocalTime localTime18 = property10.getLocalTime();
        int int19 = localTime18.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 26747689 + "'", int19 == 26747689);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        org.joda.time.tz.NameProvider nameProvider2 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 100, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.plusDays(50);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        int int15 = localDate12.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate17 = localDate12.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        int int20 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateMidnight dateMidnight21 = localDate12.toDateMidnight(dateTimeZone18);
        long long23 = dateTimeZone18.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance(chronology8, dateTimeZone18);
        org.joda.time.DurationField durationField25 = zonedChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology24.weekyear();
        org.joda.time.DurationField durationField27 = zonedChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology24.year();
        org.joda.time.DateTimeZone dateTimeZone29 = zonedChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology24.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        org.joda.time.LocalDate.Property property34 = localDate33.weekyear();
        org.joda.time.LocalDate localDate36 = localDate33.plusDays(51);
        int int37 = localDate36.getWeekyear();
        org.joda.time.LocalDate.Property property38 = localDate36.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 100, dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.plusDays(50);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 100, dateTimeZone48);
        org.joda.time.LocalDate localDate51 = localDate49.plusDays(50);
        int int52 = localDate49.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate54 = localDate49.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        int int57 = dateTimeZone55.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateMidnight dateMidnight58 = localDate49.toDateMidnight(dateTimeZone55);
        long long60 = dateTimeZone55.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology45, dateTimeZone55);
        java.util.Locale locale64 = new java.util.Locale("2");
        java.lang.String str65 = dateTimeZone55.getName((long) 26211201, locale64);
        java.lang.String str66 = dateTimeField30.getAsShortText((org.joda.time.ReadablePartial) localDate36, 11771566, locale64);
        java.lang.String str69 = nameProvider2.getName(locale64, "Property[centuryOfEra]", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider2);
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str75 = nameProvider2.getShortName(locale71, "hourOfDay", "JP");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider2);
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder78 = builder77.clear();
        java.util.Locale.Builder builder79 = builder78.clearExtensions();
        java.util.Locale locale80 = builder78.build();
        java.util.Locale locale81 = builder78.build();
        java.util.Locale locale82 = builder78.build();
        java.lang.String str85 = nameProvider2.getName(locale82, "zh_CN", "\u4e2d\u6587\u53f0\u7063)");
        java.lang.String str86 = locale82.toLanguageTag();
        java.lang.String str87 = locale82.getDisplayName();
        boolean boolean88 = locale82.hasExtensions();
        java.lang.String str89 = locale0.getDisplayName(locale82);
        java.lang.Object obj90 = locale82.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(nameProvider2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60000L + "'", long23 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 60000L + "'", long60 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology61);
        org.junit.Assert.assertEquals(locale64.toString(), "2");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00" + "'", str65, "+00:00");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "11771566" + "'", str66, "11771566");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "de");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "und" + "'", str86, "und");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "German" + "'", str89, "German");
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "");
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str5 = locale1.getExtension('x');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readablePeriod9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusHours(11771697);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plus(readableDuration15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minus(readablePeriod17);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.withMinimumValue();
        java.lang.String str4 = property1.getAsShortText();
        org.joda.time.LocalDateTime localDateTime5 = property1.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusHours(26479101);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate.Property property6 = localDate4.yearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate4.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514747819,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5759,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=53,MILLISECOND=578,ZONE_OFFSET=5759,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 54595143);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField24 = zonedChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.Chronology chronology27 = zonedChronology21.withUTC();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 11);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        int int37 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate36.minus(readablePeriod38);
        java.util.Date date40 = localDate39.toDate();
        long long42 = zonedChronology21.set((org.joda.time.ReadablePartial) localDate39, (long) 11836898);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology21.yearOfCentury();
        long long45 = dateTimeField43.roundHalfFloor((long) 11830400);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 12 + "'", int37 == 12);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 11836898L + "'", long42 == 11836898L);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime.Property property3 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(50);
        int int9 = localDate6.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate11 = localDate6.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        int int14 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateMidnight dateMidnight15 = localDate6.toDateMidnight(dateTimeZone12);
        long long17 = dateTimeZone12.convertUTCToLocal(60000L);
        org.joda.time.DateTime dateTime18 = dateTime1.toDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime1.withDate(26690, 69265010, 11820840);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69265010 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60000L + "'", long17 == 60000L);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.hourOfHalfday();
        org.joda.time.DurationField durationField27 = zonedChronology21.hours();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyear();
        long long33 = dateTimeField30.addWrapField((long) 12303080, 12278855);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 387483238005903080L + "'", long33 == 387483238005903080L);
    }

    @Test
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        int int7 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear(26496);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMillisOfSecond(69262259);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69262259 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        long long6 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(4085613);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localTime16.getFieldType((int) (byte) 1);
        int int19 = localTime14.get(dateTimeFieldType18);
        org.joda.time.LocalTime.Property property20 = localTime12.property(dateTimeFieldType18);
        org.joda.time.LocalTime localTime22 = property20.addWrapFieldToCopy(11770);
        int int23 = localTime22.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 47907L + "'", long6 == 47907L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47 + "'", int23 == 47);
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone5 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(72000000L, dateTimeZone3);
        int int8 = dateTimeZone3.getStandardOffset((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property16 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate17 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfEvenCopy();
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        org.joda.time.LocalDate localDate21 = property16.setCopy("2017", locale20);
        java.lang.String str22 = dateTimeZone3.getName((long) 11764640, locale20);
        java.lang.String str23 = locale20.getISO3Language();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 215400000 + "'", int8 == 215400000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+59:50" + "'", str22, "+59:50");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        int int3 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime2);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) 26187981);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 11778505, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int8 = localTime6.get(dateTimeFieldType7);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localTime6.getFields();
        org.joda.time.LocalTime localTime11 = localTime6.plusSeconds(11913947);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime6.withMinuteOfHour(26700095);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26700095 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.monthOfYear();
        java.lang.String str10 = dateTimeField8.getAsText((long) 26287316);
        int int12 = dateTimeField8.getMaximumValue((long) 36524);
        boolean boolean13 = dateTimeField8.isSupported();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale19);
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = dateTimeZone17.getName((long) (byte) 1, locale19);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withField(dateTimeFieldType26, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property29 = localDateTime24.minuteOfHour();
        long long30 = property29.remainder();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        java.util.Calendar.Builder builder33 = new java.util.Calendar.Builder();
        java.util.Locale locale34 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder35 = builder33.setLocale(locale34);
        java.lang.String str36 = dateTimeField31.getAsText(11760560, locale34);
        long long39 = dateTimeField31.getDifferenceAsLong(42361048800120L, (long) 11762);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withField(dateTimeFieldType42, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property45 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.millisOfDay();
        org.joda.time.LocalDateTime.Property property47 = localDateTime40.millisOfSecond();
        int int48 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localDateTime40);
        boolean boolean49 = dateTimeZone17.equals((java.lang.Object) localDateTime40);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime53 = property52.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime55 = property52.addToCopy(51);
        org.joda.time.DurationField durationField56 = property52.getDurationField();
        org.joda.time.LocalDateTime localDateTime57 = property52.getLocalDateTime();
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale61 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str63 = locale60.getDisplayLanguage(locale61);
        java.lang.String str64 = localDateTime57.toString("15", locale61);
        java.lang.String str65 = dateTimeZone17.getName(1672531200000L, locale61);
        java.lang.String str66 = dateTimeField8.getAsShortText((long) 12269225, locale61);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6708" + "'", str10, "\u6708");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ja-JP" + "'", str22, "ja-JP");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+59:50" + "'", str23, "+59:50");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 47940L + "'", long30 == 47940L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "11760560" + "'", str36, "11760560");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 706017479L + "'", long39 == 706017479L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "15" + "'", str64, "15");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+59:50" + "'", str65, "+59:50");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1" + "'", str66, "1");
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear(11861632);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale8.getDisplayLanguage(locale9);
        java.lang.String str12 = locale8.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear(12324118);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        int int5 = localDateTime0.getMillisOfDay();
        int int6 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withSecondOfMinute(6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        int int11 = dateTimeZone9.getOffsetFromLocal((long) 'a');
        long long14 = dateTimeZone9.adjustOffset(9505L, true);
        org.joda.time.DateTime dateTime15 = localDateTime0.toDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = property18.setCopy(12174431);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12174431 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26747975 + "'", int5 == 26747975);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9505L + "'", long14 == 9505L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withYearOfEra(17);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(292278993);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(11756872);
        int int13 = dateTime12.getDayOfMonth();
        java.lang.String str15 = dateTime12.toString("+00:00");
        boolean boolean16 = dateTime12.isAfterNow();
        org.joda.time.DateTime.Property property17 = dateTime12.yearOfEra();
        org.joda.time.DateTime dateTime19 = dateTime12.withYear(54587);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTime();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12347987 + "'", int4 == 12347987);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTime1.getDayOfYear();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears(53);
        org.joda.time.DateMidnight dateMidnight10 = localDate7.toDateMidnight();
        int int11 = localDate7.getWeekOfWeekyear();
        java.util.Calendar.Builder builder12 = new java.util.Calendar.Builder();
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder14 = builder12.setLocale(locale13);
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder19 = builder15.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder21 = builder19.setLenient(false);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        java.util.TimeZone timeZone28 = dateTimeZone26.toTimeZone();
        boolean boolean29 = timeZone23.hasSameRules(timeZone28);
        java.util.Calendar.Builder builder30 = builder19.setTimeZone(timeZone28);
        java.util.Calendar.Builder builder31 = builder12.setTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime33 = localDate7.toDateTimeAtStartOfDay(dateTimeZone32);
        java.util.TimeZone timeZone34 = dateTimeZone32.toTimeZone();
        long long37 = dateTimeZone32.adjustOffset(1645514214684L, false);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime39 = dateTime1.toDateTime(dateTimeZone32);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 12129343, dateTimeZone32);
        java.lang.String str42 = dateTimeZone32.getNameKey(86400000L);
        java.lang.String str44 = dateTimeZone32.getName((long) 26602963);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1645514214684L + "'", long37 == 1645514214684L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        int int7 = localDateTime0.getYearOfCentury();
        org.joda.time.Chronology chronology8 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds(11767480);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minus(readableDuration12);
        int int14 = localDateTime13.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMonths(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.year();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withMillisOfDay(12277727);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        java.lang.String str7 = chronology4.toString();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
    }

    @Test
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayScript();
        org.joda.time.tz.NameProvider nameProvider2 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(50);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.millisOfDay();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale13.getDisplayLanguage(locale14);
        java.lang.String str17 = dateTimeField10.getAsShortText(26150856, locale14);
        java.lang.String str20 = nameProvider2.getName(locale14, "", "26150856");
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = nameProvider2.getName(locale21, "hi!", "1970");
        java.lang.String str25 = locale0.getDisplayVariant(locale21);
        java.util.Set<java.lang.Character> charSet26 = locale0.getExtensionKeys();
        java.lang.String str27 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(nameProvider2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "26150856" + "'", str17, "26150856");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(12147673);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime1.minus(readablePeriod4);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        java.lang.String str22 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str22, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(17);
        java.util.Date date4 = localDateTime3.toDate();
        int int5 = date4.getDay();
        long long6 = date4.getTime();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 05 07:25:48 GMT 2022");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1644045942322L + "'", long6 == 1644045942322L);
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(8);
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes(26156834);
        int int8 = localTime7.getMinuteOfHour();
        int int9 = localTime7.getMillisOfSecond();
        org.joda.time.LocalTime localTime11 = localTime7.plusHours(54572589);
        int[] intArray12 = localTime7.getValues();
        org.joda.time.LocalTime localTime14 = localTime7.minusMinutes(54586227);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime17 = localTime14.withMillisOfDay(24044527);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 39 + "'", int8 == 39);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[18, 39, 48, 96]");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.hourOfHalfday();
        org.joda.time.DurationField durationField27 = zonedChronology21.hours();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = zonedChronology21.getDateTimeMillis((long) 72076364, 54586125, 341, 2023, (-27418800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54586125 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology21.millis();
        org.joda.time.DurationField durationField31 = zonedChronology21.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(50);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        int int14 = localDate11.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate16 = localDate11.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        int int19 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateMidnight dateMidnight20 = localDate11.toDateMidnight(dateTimeZone17);
        long long22 = dateTimeZone17.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone17);
        org.joda.time.DurationField durationField24 = zonedChronology23.eras();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.minuteOfDay();
        org.joda.time.Chronology chronology26 = zonedChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.yearOfEra();
        boolean boolean29 = durationFieldType0.isSupported((org.joda.time.Chronology) zonedChronology23);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("minutes");
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.Chronology chronology33 = zonedChronology23.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone32);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuries" + "'", str1, "centuries");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60000L + "'", long22 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = dateTime2.plusMonths(11818465);
        boolean boolean7 = dateTime6.isAfterNow();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTimeISO();
        int int10 = dateTime6.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12348142 + "'", int10 == 12348142);
    }

    @Test
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology4.weekyears();
        long long10 = durationField7.getDifferenceAsLong(11778505L, (long) 26160835);
        int int13 = durationField7.getDifference((long) 11896231, (long) 404);
        java.lang.String str14 = durationField7.toString();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DurationField[weekyears]" + "'", str14, "DurationField[weekyears]");
    }

    @Test
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(50);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        int int18 = localDate15.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        int int23 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateMidnight dateMidnight24 = localDate15.toDateMidnight(dateTimeZone21);
        long long26 = dateTimeZone21.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology11, dateTimeZone21);
        org.joda.time.DurationField durationField28 = zonedChronology27.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology27.year();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology27.getZone();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getName(1048516494480000000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter5.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withPivotYear(11752861);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60000L + "'", long26 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DurationField durationField29 = zonedChronology21.millis();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = dateTimeField31.set((-374756161248000000L), 12140032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12140032 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2022L + "'", long27 == 2022L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = property3.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property3.setCopy(11946775);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11946775 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusWeeks(26160458);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMillis((int) '#');
        org.joda.time.DateTime dateTime18 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.withMillis((long) 26175513);
        boolean boolean21 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime23 = dateTime17.minusSeconds(11756872);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime.Property property25 = dateTime17.property(dateTimeFieldType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12348195 + "'", int15 == 12348195);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.minuteOfHour();
        org.joda.time.DurationField durationField8 = chronology4.millis();
        long long11 = durationField8.add(11937532L, (long) 26580000);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 38517532L + "'", long11 == 38517532L);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.DateTimeZone dateTimeZone3 = instant0.getZone();
        org.joda.time.DateTime dateTime4 = instant0.toDateTime();
        boolean boolean5 = instant0.isEqualNow();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.setCopy(26156834);
        org.joda.time.DateTime dateTime8 = property4.addToCopy((long) 1970);
        org.joda.time.DateTime dateTime9 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime10 = property4.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime11 = property4.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(26190814);
        org.joda.time.DateTime.Property property14 = dateTime11.era();
        org.joda.time.DateTime dateTime15 = property14.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = property14.setCopy(12091160);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12091160 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate8.era();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        org.joda.time.LocalDate.Property property16 = localDate14.dayOfYear();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(917);
        org.joda.time.LocalDate localDate19 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        int int33 = localDate30.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate35 = localDate30.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        int int38 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateMidnight dateMidnight39 = localDate30.toDateMidnight(dateTimeZone36);
        long long41 = dateTimeZone36.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology42 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology42.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology42.yearOfCentury();
        org.joda.time.DateTime dateTime46 = dateTime20.toDateTime((org.joda.time.Chronology) zonedChronology42);
        int int47 = dateTime46.getYear();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60000L + "'", long41 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-01-01T00:00:00.000");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) "2022-01-01T00:00:00.000");
        org.joda.time.Chronology chronology3 = dateTime2.getChronology();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(11771697);
        org.joda.time.DateTime dateTime16 = dateTime12.minusHours(11783576);
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded((long) 11787846, 47);
        org.joda.time.DateTime dateTime21 = dateTime16.minus((long) 26180236);
        int int22 = dateTime21.getSecondOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.minus(readablePeriod23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime27 = dateTime24.withDayOfYear(285);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12348257 + "'", int4 == 12348257);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43768 + "'", int22 == 43768);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale5);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.lang.String str10 = locale5.getISO3Country();
        java.util.Locale.Builder builder11 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet12 = locale5.getUnicodeLocaleKeys();
        boolean boolean13 = strSet12.isEmpty();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645514748272,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5759,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=54,MILLISECOND=31,ZONE_OFFSET=5759,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str9, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TWN" + "'", str10, "TWN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear(26175513);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(13);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readablePeriod13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.hourOfDay();
        java.lang.String str17 = localDateTime10.toString("11776486");
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.plus(readablePeriod18);
        java.lang.String str20 = localDateTime10.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11776486" + "'", str17, "11776486");
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "26175513-02-18T07:25:48.281" + "'", str20, "26175513-02-18T07:25:48.281");
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(50);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.millisOfDay();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale11.getDisplayLanguage(locale12);
        java.lang.String str15 = dateTimeField8.getAsShortText(26150856, locale12);
        java.lang.String str18 = nameProvider0.getName(locale12, "", "26150856");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "26150856" + "'", str15, "26150856");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.DateTimeField dateTimeField13 = property10.getField();
        org.joda.time.LocalTime localTime15 = property10.addWrapFieldToCopy(51);
        org.joda.time.LocalTime localTime16 = property10.getLocalTime();
        org.joda.time.DateTime dateTime17 = localTime16.toDateTimeToday();
        org.joda.time.LocalTime localTime19 = localTime16.minusMillis(377);
        org.joda.time.LocalTime localTime21 = localTime19.minusSeconds(11856099);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localTime21.getValue(54808600);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54808600");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        int int5 = localDate2.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int8 = localDate2.getYearOfEra();
        int int9 = localDate2.getCenturyOfEra();
        int int10 = localDate2.getMonthOfYear();
        int int11 = localDate2.getYearOfEra();
        org.joda.time.LocalDate localDate13 = localDate2.plusYears(11790918);
        org.joda.time.LocalDate.Property property14 = localDate13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = localDate13.getField(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField33 = zonedChronology21.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate8 = property6.roundHalfEvenCopy();
        long long9 = property6.remainder();
        org.joda.time.LocalDate localDate10 = property6.getLocalDate();
        org.joda.time.LocalDate localDate11 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property12 = localDate11.centuryOfEra();
        org.joda.time.LocalDate localDate14 = localDate11.minusYears(26441521);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate11.getValue((-11861520));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -11861520");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4320000000L + "'", long9 == 4320000000L);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
    }
}
