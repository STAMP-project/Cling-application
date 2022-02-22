import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone4);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        boolean boolean9 = mutableInterval7.isBefore((long) 59);
        boolean boolean10 = mutableInterval7.containsNow();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone15);
        boolean boolean19 = interval17.isAfter(100L);
        long long20 = interval17.getEndMillis();
        org.joda.time.Interval interval21 = interval17.toInterval();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = interval21.withDurationBeforeEnd(readableDuration22);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType25 = periodType24.withMillisRemoved();
        org.joda.time.Period period26 = interval21.toPeriod(periodType25);
        org.joda.time.Chronology chronology27 = interval21.getChronology();
        mutableInterval7.setChronology(chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        boolean boolean39 = interval35.isAfter((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean40 = mutableInterval7.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Interval interval41 = mutableInterval7.toInterval();
        mutableInterval7.setDurationBeforeEnd(4459615861L);
        org.joda.time.MutableInterval mutableInterval44 = mutableInterval7.toMutableInterval();
        mutableInterval7.setDurationAfterStart((long) 5);
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval7);
        org.joda.time.Minutes minutes48 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval7);
        org.joda.time.Interval interval49 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology50 = mutableInterval7.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        mutablePeriod3.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.add(readableInterval6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = mutablePeriod3.get(durationFieldType8);
        boolean boolean10 = mutablePeriod1.isSupported(durationFieldType8);
        mutablePeriod1.setDays((int) (short) 100);
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod16 = days15.toMutablePeriod();
        mutablePeriod16.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval19 = null;
        mutablePeriod16.add(readableInterval19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.eras();
        int int22 = mutablePeriod16.get(durationFieldType21);
        mutablePeriod16.addWeeks((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval(obj27, chronology28);
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType26.getField(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.millis();
        mutablePeriod16.setPeriod((long) 2022, chronology30);
        mutablePeriod1.setPeriod((long) (-8), (long) (short) -1, chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = chronology30.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology30.getZone();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Collection<java.util.Locale> localeCollection12 = null;
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, localeCollection12, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-1L), dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone20.isLocalDateTimeGap(localDateTime22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime26 = dateTime24.withHourOfDay(0);
        int int27 = dateTime26.getDayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime26.plusYears((int) (short) 1);
        org.joda.time.DateTime.Property property30 = dateTime26.secondOfDay();
        org.joda.time.DateTime dateTime32 = property30.addWrapFieldToCopy((int) (short) 0);
        java.util.Locale locale34 = new java.util.Locale("P6DT35S");
        int int35 = property30.getMaximumShortTextLength(locale34);
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.util.Collection<java.util.Locale> localeCollection42 = null;
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, localeCollection42, filteringMode43);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet36, filteringMode43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, localeCollection12, filteringMode43);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.util.Collection<java.util.Locale> localeCollection53 = null;
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, localeCollection53, filteringMode54);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList55);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals(locale34.toString(), "p6dt35s");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(localeList56);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType21 = periodType20.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableInstant) dateTime19, periodType20);
        org.joda.time.Instant instant25 = instant9.withDurationAdded(10L, (int) (byte) -1);
        boolean boolean27 = instant9.isEqual((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod30 = days29.toMutablePeriod();
        org.joda.time.Duration duration31 = days29.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant28, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration33 = duration31.toDuration();
        org.joda.time.Instant instant34 = instant9.plus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Instant instant35 = instant34.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant35);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime3.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(86399);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Calendar calendar18 = dateTime16.toCalendar(locale17);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis((int) '4');
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.weekOfWeekyear();
        boolean boolean23 = durationFieldType12.isSupported(chronology21);
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime11.toMutableDateTime(dateTimeZone24);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod28.addWeeks(10);
        mutablePeriod28.addYears(11);
        org.joda.time.Period period33 = mutablePeriod28.toPeriod();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadablePeriod) mutablePeriod28);
        mutablePeriod28.addWeeks((-6000));
        mutablePeriod28.addMonths((-50));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((-1L), dateTimeZone3);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Calendar calendar6 = dateTime4.toCalendar(locale5);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = dateTime4.toLocalDateTime();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale10.getVariant();
        java.util.Calendar calendar12 = dateTime4.toCalendar(locale10);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale10);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.setScript("");
        java.util.Locale.Builder builder20 = builder16.setVariant("hours");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("2022-02-21T14:53:01.162Z/2022-02-21T14:53:01.162Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T14:53:01.162Z/2022-02-21T14:53:01.162Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone4);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval8 = interval6.toMutableInterval();
        boolean boolean9 = interval6.isAfterNow();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Days days17 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod18 = days17.toMutablePeriod();
        org.joda.time.Duration duration19 = days17.toStandardDuration();
        org.joda.time.Days days20 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod21 = days20.toMutablePeriod();
        org.joda.time.Duration duration22 = days20.toStandardDuration();
        boolean boolean23 = duration19.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod25 = days24.toMutablePeriod();
        org.joda.time.Duration duration26 = days24.toStandardDuration();
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((-1L), dateTimeZone31);
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Calendar calendar34 = dateTime32.toCalendar(locale33);
        org.joda.time.DateTime dateTime36 = dateTime32.plusMillis((int) '4');
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period39 = period37.minusMinutes((int) ' ');
        org.joda.time.Interval interval40 = interval6.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((-1L), dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone43.isLocalDateTimeGap(localDateTime45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = dateTime47.withHourOfDay(0);
        java.lang.String str51 = dateTime47.toString("52");
        org.joda.time.DateTime.Property property52 = dateTime47.dayOfMonth();
        boolean boolean53 = interval40.isBefore((org.joda.time.ReadableInstant) dateTime47);
        int int54 = dateTime47.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(mutableInterval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar34);
        org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "52" + "'", str51, "52");
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period12 = mutableInterval10.toPeriod(periodType11);
        int[] intArray15 = chronology8.get((org.joda.time.ReadablePeriod) period12, (long) (byte) 0, (long) 12);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((-1L), dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-1L), dateTimeZone27);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime33 = dateTime28.toLocalDateTime();
        boolean boolean34 = dateTimeZone21.isLocalDateTimeGap(localDateTime33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((-1L), dateTimeZone37);
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Calendar calendar40 = dateTime38.toCalendar(locale39);
        org.joda.time.DateTime dateTime42 = dateTime38.plusMillis((int) '4');
        org.joda.time.Chronology chronology43 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((-1L), dateTimeZone48);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime54 = dateTime49.toLocalDateTime();
        int[] intArray55 = null;
        int int56 = dateTimeField45.getMinimumValue((org.joda.time.ReadablePartial) localDateTime54, intArray55);
        boolean boolean57 = dateTimeZone21.isLocalDateTimeGap(localDateTime54);
        long long59 = chronology8.set((org.joda.time.ReadablePartial) localDateTime54, (long) (short) 1);
        org.joda.time.DateTimeField dateTimeField60 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField61 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology8.era();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 12]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar30);
        org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar51);
        org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((-1L), dateTimeZone3);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Calendar calendar6 = dateTime4.toCalendar(locale5);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis((int) '4');
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period13 = mutableInterval11.toPeriod(periodType12);
        int[] intArray16 = chronology9.get((org.joda.time.ReadablePeriod) period13, (long) (byte) 0, (long) 12);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.yearOfCentury();
        org.joda.time.Chronology chronology18 = chronology9.withUTC();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 366, chronology18);
        org.joda.time.Hours hours20 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours21 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours23 = hours21.plus((int) (byte) 100);
        org.joda.time.Hours hours25 = hours21.minus((int) (byte) 10);
        int int26 = hours25.getHours();
        org.joda.time.Hours hours27 = hours20.minus(hours25);
        org.joda.time.Hours hours29 = hours25.multipliedBy(4);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        boolean boolean34 = dateTime32.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property35 = dateTime32.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        java.util.GregorianCalendar gregorianCalendar39 = dateTime38.toGregorianCalendar();
        int int40 = dateTime38.getHourOfDay();
        java.util.Locale locale41 = java.util.Locale.CHINA;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale42.toLanguageTag();
        java.util.Calendar calendar44 = dateTime38.toCalendar(locale42);
        java.util.Locale locale47 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str48 = locale42.getDisplayVariant(locale47);
        int int49 = property35.getMaximumTextLength(locale47);
        org.joda.time.DurationField durationField50 = property35.getLeapDurationField();
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleKeys();
        java.lang.String str54 = property35.getAsShortText(locale52);
        org.joda.time.DateTime dateTime55 = property35.roundCeilingCopy();
        java.lang.String str56 = property35.getAsString();
        org.joda.time.DateTime dateTime57 = property35.withMaximumValue();
        org.joda.time.Hours hours58 = org.joda.time.Hours.TWO;
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadablePeriod) hours58);
        org.joda.time.Hours hours61 = hours58.plus(53);
        boolean boolean62 = hours25.isLessThan(hours58);
        int[] intArray65 = chronology18.get((org.joda.time.ReadablePeriod) hours25, 1645455024223L, 3304418L);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 12]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-8) + "'", int26 == (-8));
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(gregorianCalendar39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 14 + "'", int40 == 14);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1645455389788,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=29,MILLISECOND=788,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale47.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNull(durationField50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "788" + "'", str54, "788");
        org.junit.Assert.assertNotNull(dateTime55);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "788" + "'", str56, "788");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-457069]");
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = java.util.Locale.UK;
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withLocale(locale3);
        org.joda.time.PeriodType periodType5 = periodFormatter4.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter6 = null;
        org.joda.time.format.PeriodParser periodParser7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = new org.joda.time.format.PeriodFormatter(periodPrinter6, periodParser7);
        java.util.Locale locale9 = java.util.Locale.UK;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter10.withParseType(periodType12);
        org.joda.time.PeriodType periodType15 = periodFormatter14.getParseType();
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter4.withParseType(periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = periodFormatter4.parsePeriod("2900444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodFormatter16);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((-1L), dateTimeZone8);
        boolean boolean10 = dateTime3.equals((java.lang.Object) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        java.lang.String str14 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime15 = dateTime3.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfYear(19);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.seconds();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((-1L), dateTimeZone23);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Calendar calendar26 = dateTime24.toCalendar(locale25);
        org.joda.time.DateTime dateTime28 = dateTime24.plusMillis((int) '4');
        org.joda.time.Chronology chronology29 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.hourOfHalfday();
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) -1, periodType20, chronology29);
        boolean boolean32 = durationFieldType18.isSupported(chronology29);
        org.joda.time.Chronology chronology33 = chronology29.withUTC();
        org.joda.time.DateTime dateTime34 = dateTime17.withChronology(chronology33);
        long long38 = chronology33.add((long) 9, (long) 53409, 110);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = chronology33.getDateTimeMillis((-18349), 5279999, 18, 893, 498417, 53287970, 71);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5874999L + "'", long38 == 5874999L);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, (long) (byte) 0);
        mutablePeriod2.addSeconds((int) 'a');
        int int5 = mutablePeriod2.getMinutes();
        mutablePeriod2.setPeriod((-2147482209L), 0L);
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis(880L);
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Calendar calendar18 = dateTime16.toCalendar(locale17);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis((int) '4');
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfYear();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '#', chronology21);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekyearOfCentury();
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration10, chronology21);
        org.joda.time.DurationField durationField26 = chronology21.centuries();
        long long29 = durationField26.subtract((-228027916836681L), 41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-357411398436681L) + "'", long29 == (-357411398436681L));
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-1L), dateTimeZone5);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone5);
        boolean boolean9 = interval7.isAfter(100L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        boolean boolean23 = dateTime21.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean25 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime27 = dateTime13.plusHours(22);
        org.joda.time.Instant instant28 = dateTime27.toInstant();
        org.joda.time.DateTime dateTime29 = instant28.toDateTimeISO();
        org.joda.time.Instant instant32 = instant28.withDurationAdded(3327L, 496);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(readableDuration0, (org.joda.time.ReadableInstant) instant32);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(instant32);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.DateTime dateTime8 = interval6.getStart();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone13);
        org.joda.time.MutableInterval mutableInterval16 = interval15.toMutableInterval();
        boolean boolean17 = interval6.isBefore((org.joda.time.ReadableInterval) mutableInterval16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        boolean boolean22 = dateTime20.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime20.millisOfSecond();
        org.joda.time.DateTime dateTime24 = property23.getDateTime();
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        int int26 = dateTime24.getDayOfMonth();
        mutableInterval16.setEnd((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology28 = mutableInterval16.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableInterval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 21 + "'", int26 == 21);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 10);
        int int2 = period1.getSeconds();
        org.joda.time.Period period4 = period1.minusHours(100);
        int int5 = period4.getMillis();
        org.joda.time.Period period7 = period4.withWeeks((int) 'a');
        org.joda.time.Days days8 = period4.toStandardDays();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone13);
        boolean boolean17 = interval15.isAfter(100L);
        long long18 = interval15.getEndMillis();
        org.joda.time.Interval interval19 = interval15.toInterval();
        org.joda.time.Days days20 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval15);
        org.joda.time.Days days22 = days20.dividedBy(4);
        java.lang.String str23 = days20.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone28);
        boolean boolean32 = interval30.isAfter(100L);
        long long33 = interval30.getEndMillis();
        org.joda.time.Interval interval34 = interval30.toInterval();
        org.joda.time.Days days35 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Days days37 = days35.dividedBy(4);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((-1L), dateTimeZone42);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone42);
        boolean boolean46 = interval44.isAfter(100L);
        long long47 = interval44.getEndMillis();
        org.joda.time.Interval interval48 = interval44.toInterval();
        org.joda.time.Days days49 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval44);
        org.joda.time.Days days51 = days49.dividedBy(4);
        boolean boolean52 = days37.isLessThan(days49);
        org.joda.time.Days days53 = days20.minus(days49);
        org.joda.time.Days days54 = days8.plus(days20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P0D" + "'", str23, "P0D");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(days54);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone4);
        boolean boolean8 = interval6.isAfter(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        boolean boolean13 = dateTime11.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.millisOfSecond();
        org.joda.time.DateTime dateTime15 = property14.getDateTime();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.Period period21 = new org.joda.time.Period(6, (int) (short) -1, (int) (byte) 0, (int) ' ');
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadablePeriod) period21);
        boolean boolean23 = interval6.isBefore((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod25 = days24.toMutablePeriod();
        org.joda.time.Duration duration26 = days24.toStandardDuration();
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod28 = days27.toMutablePeriod();
        org.joda.time.Duration duration29 = days27.toStandardDuration();
        boolean boolean30 = duration26.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Days days31 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod32 = days31.toMutablePeriod();
        org.joda.time.Duration duration33 = days31.toStandardDuration();
        org.joda.time.Days days34 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod35 = days34.toMutablePeriod();
        org.joda.time.Duration duration36 = days34.toStandardDuration();
        boolean boolean37 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Days days38 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod39 = days38.toMutablePeriod();
        org.joda.time.Duration duration40 = days38.toStandardDuration();
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration29.isLongerThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Calendar calendar48 = dateTime46.toCalendar(locale47);
        org.joda.time.DateTime dateTime50 = dateTime46.plusMillis((int) '4');
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateTime50);
        boolean boolean52 = interval6.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval54 = interval6.withStart(readableInstant53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar48);
        org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.minutes();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withLocale(locale8);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter9.withParseType(periodType11);
        boolean boolean14 = periodFormatter13.isParser();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        boolean boolean19 = dateTime17.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime17.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        java.util.GregorianCalendar gregorianCalendar24 = dateTime23.toGregorianCalendar();
        int int25 = dateTime23.getHourOfDay();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Calendar calendar29 = dateTime23.toCalendar(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str33 = locale27.getDisplayVariant(locale32);
        int int34 = property20.getMaximumTextLength(locale32);
        org.joda.time.format.PeriodFormatter periodFormatter35 = periodFormatter13.withLocale(locale32);
        org.joda.time.format.PeriodFormatter periodFormatter36 = periodFormatter2.withLocale(locale32);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter2.withParseType(periodType37);
        org.joda.time.format.PeriodParser periodParser39 = periodFormatter38.getParser();
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale locale42 = java.util.Locale.getDefault(category40);
        java.util.Locale locale43 = java.util.Locale.getDefault(category40);
        java.util.Locale locale44 = java.util.Locale.getDefault(category40);
        boolean boolean45 = locale44.hasExtensions();
        org.joda.time.format.PeriodFormatter periodFormatter46 = periodFormatter38.withLocale(locale44);
        java.util.Locale locale47 = periodFormatter46.getLocale();
        java.lang.String str48 = locale47.getScript();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(gregorianCalendar24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 14 + "'", int25 == 14);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645455389954,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=29,MILLISECOND=954,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(periodFormatter35);
        org.junit.Assert.assertNotNull(periodFormatter36);
        org.junit.Assert.assertNotNull(periodFormatter38);
        org.junit.Assert.assertNull(periodParser39);
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(periodFormatter46);
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (-1), periodType2, chronology3);
        int int5 = mutablePeriod4.getSeconds();
        int int6 = mutablePeriod4.getYears();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.add(988, 19044, 532496, 53569, 36, 56, 10368000, 457070);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(71);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        boolean boolean4 = dateTime2.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        java.util.GregorianCalendar gregorianCalendar9 = dateTime8.toGregorianCalendar();
        int int10 = dateTime8.getHourOfDay();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Calendar calendar14 = dateTime8.toCalendar(locale12);
        java.util.Locale locale17 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str18 = locale12.getDisplayVariant(locale17);
        int int19 = property5.getMaximumTextLength(locale17);
        org.joda.time.DurationField durationField20 = property5.getLeapDurationField();
        long long21 = property5.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property5.getFieldType();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455389999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=29,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(durationField20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period12 = mutableInterval10.toPeriod(periodType11);
        int[] intArray15 = chronology8.get((org.joda.time.ReadablePeriod) period12, (long) (byte) 0, (long) 12);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfYear();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DurationField durationField20 = chronology8.minutes();
        long long23 = durationField20.getMillis(53546348, 1645454924763L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 12]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3212780880000L + "'", long23 == 3212780880000L);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis((int) '4');
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfWeek();
        org.joda.time.Period period12 = new org.joda.time.Period((long) 12, (long) 3, chronology10);
        org.joda.time.Period period14 = period12.minusMonths((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        boolean boolean19 = dateTime17.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime17.millisOfSecond();
        org.joda.time.Duration duration21 = period12.toDurationFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime25 = dateTime23.plus((long) 5);
        org.joda.time.Period period26 = duration21.toPeriodTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime28 = dateTime23.withYearOfCentury(31);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.lang.String str31 = locale30.getVariant();
        java.lang.String str32 = dateTime23.toString("214", locale30);
        org.joda.time.Duration duration34 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Duration duration36 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Duration duration37 = duration34.minus((org.joda.time.ReadableDuration) duration36);
        long long38 = duration34.getMillis();
        org.joda.time.Days days39 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod40 = days39.toMutablePeriod();
        org.joda.time.Duration duration41 = days39.toStandardDuration();
        org.joda.time.Days days42 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod43 = days42.toMutablePeriod();
        org.joda.time.Duration duration44 = days42.toStandardDuration();
        boolean boolean45 = duration41.isLongerThan((org.joda.time.ReadableDuration) duration44);
        long long46 = duration41.getStandardDays();
        org.joda.time.Duration duration47 = duration34.plus((org.joda.time.ReadableDuration) duration41);
        long long48 = duration47.getMillis();
        org.joda.time.Duration duration49 = duration47.toDuration();
        long long50 = duration49.getStandardDays();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "214" + "'", str32, "214");
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 6L + "'", long46 == 6L);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 518399999L + "'", long48 == 518399999L);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 5L + "'", long50 == 5L);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Hours hours8 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours10 = hours8.plus((int) (byte) 100);
        org.joda.time.Hours hours12 = hours8.minus((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod13 = hours8.toMutablePeriod();
        org.joda.time.DateTime dateTime14 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod13.addMonths(102);
        mutablePeriod13.setPeriod(1645455126589L, (-212319L));
        mutablePeriod13.addSeconds(11);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        java.io.IOException iOException2 = new java.io.IOException("Property[minuteOfDay]");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("53383465", (java.lang.Throwable) iOException4);
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: java.io.IOException: Property[minuteOfDay]" + "'", str6, "java.io.IOException: java.io.IOException: Property[minuteOfDay]");
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((-1L), dateTimeZone8);
        boolean boolean10 = dateTime3.equals((java.lang.Object) dateTime9);
        int int11 = dateTime3.getMillisOfSecond();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime3.toGregorianCalendar();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) 10368000);
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((-1L), dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Calendar calendar25 = dateTime23.toCalendar(locale24);
        org.joda.time.DateTime dateTime27 = dateTime23.plusMillis((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime23.secondOfMinute();
        org.joda.time.Duration duration29 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Calendar calendar35 = dateTime33.toCalendar(locale34);
        org.joda.time.DateTime dateTime37 = dateTime33.plusMillis((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime33.toDateTimeISO();
        org.joda.time.DateTime.Property property39 = dateTime33.weekOfWeekyear();
        org.joda.time.Period period40 = duration29.toPeriodFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period41 = duration29.toPeriod();
        org.joda.time.Seconds seconds42 = duration29.toStandardSeconds();
        org.joda.time.Duration duration43 = duration29.toDuration();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((-1L), dateTimeZone46);
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Calendar calendar49 = dateTime47.toCalendar(locale48);
        org.joda.time.DateTime dateTime51 = dateTime47.plusMillis((int) '4');
        org.joda.time.DateTime dateTime52 = dateTime47.toDateTimeISO();
        org.joda.time.DateTime.Property property53 = dateTime47.weekOfWeekyear();
        org.joda.time.DateTime dateTime55 = dateTime47.withSecondOfMinute(12);
        org.joda.time.DateTime dateTime57 = dateTime47.withWeekyear(53);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime47);
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) mutableInterval58);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 999 + "'", int11 == 999);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant24 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-1));
        boolean boolean26 = instant24.isBefore((long) (short) 10);
        org.joda.time.DateTime dateTime27 = instant24.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = dateTime27.toLocalDateTime();
        org.joda.time.DateTime dateTime30 = dateTime27.plusHours(404);
        boolean boolean31 = dateTime27.isEqualNow();
        org.joda.time.DateTime.Property property32 = dateTime27.yearOfEra();
        boolean boolean34 = dateTime27.isBefore(1645454906571L);
        org.joda.time.Duration duration36 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Duration duration38 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Duration duration39 = duration36.minus((org.joda.time.ReadableDuration) duration38);
        long long40 = duration36.getMillis();
        org.joda.time.Days days41 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod42 = days41.toMutablePeriod();
        org.joda.time.Duration duration43 = days41.toStandardDuration();
        org.joda.time.Days days44 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod45 = days44.toMutablePeriod();
        org.joda.time.Duration duration46 = days44.toStandardDuration();
        boolean boolean47 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration46);
        long long48 = duration43.getStandardDays();
        org.joda.time.Duration duration49 = duration36.plus((org.joda.time.ReadableDuration) duration43);
        long long50 = duration43.getStandardDays();
        long long51 = duration43.getStandardSeconds();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((-1L), dateTimeZone56);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone56);
        org.joda.time.Interval interval60 = duration43.toIntervalFrom((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime62 = dateTime59.minusMinutes(14);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 6L + "'", long48 == 6L);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 6L + "'", long50 == 6L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 518400L + "'", long51 == 518400L);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime62);
    }
}
