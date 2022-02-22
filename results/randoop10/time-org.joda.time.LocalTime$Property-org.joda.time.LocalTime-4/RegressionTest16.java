import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.Period period4 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period6 = period4.multipliedBy(0);
        org.joda.time.Period period8 = period4.withYears((int) (short) 1);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withDaysRemoved();
        java.lang.String str13 = periodType10.toString();
        org.joda.time.Period period14 = period4.normalizedStandard(periodType10);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) dateTimeZone1, periodType10);
        int int16 = mutablePeriod15.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Years" + "'", str11, "Years");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PeriodType[Years]" + "'", str13, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        java.lang.Object obj3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = periodType6.withWeeksRemoved();
        org.joda.time.Period period9 = new org.joda.time.Period(obj3, periodType8);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (byte) 1);
        org.joda.time.Chronology chronology14 = yearMonthDay13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(70919999999L, (long) (short) -1, chronology14);
        org.joda.time.Period period16 = new org.joda.time.Period(4320000000L, (long) (-51), periodType8, chronology14);
        org.joda.time.Period period17 = new org.joda.time.Period(1645514275997L, periodType8);
        int int18 = period17.getDays();
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        java.util.Locale locale20 = new java.util.Locale("hi!", "");
        java.util.Locale locale23 = new java.util.Locale("hi!", "");
        java.lang.String str24 = locale23.getISO3Country();
        java.lang.String str25 = locale20.getDisplayCountry(locale23);
        java.util.Calendar calendar26 = dateTime15.toCalendar(locale20);
        int int27 = calendar26.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromCalendarFields(calendar26);
        calendar26.setFirstDayOfWeek((-51));
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=-33078994,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+81:11:18.994,offset=292278994,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=-51,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=292278994,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category9, locale12);
        int int15 = property7.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime17 = property7.addCopy((long) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property7.getFieldType();
        org.joda.time.DateTimeField dateTimeField19 = property7.getField();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Chronology chronology26 = mutableInterval25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.millisOfSecond();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology26);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay29.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay31 = property30.withMaximumValue();
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.setVariant("months");
        java.util.Locale locale35 = builder34.build();
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = locale35.getDisplayScript();
        java.lang.String str38 = property30.getAsText(locale35);
        java.lang.String str39 = dateTimeField19.getAsShortText(38, locale35);
        java.lang.String str40 = locale35.getDisplayLanguage();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "38" + "'", str39, "38");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay11 = property9.addWrapFieldToCopy(1980);
        org.joda.time.TimeOfDay timeOfDay13 = property9.addToCopy(1970);
        java.lang.String str14 = property9.getAsText();
        java.lang.String str15 = property9.getAsString();
        org.joda.time.TimeOfDay timeOfDay17 = property9.addNoWrapToCopy(215);
        org.joda.time.Period period19 = org.joda.time.Period.days(99);
        int int20 = period19.getSeconds();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.minus((org.joda.time.ReadablePeriod) period19);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeOfDay21);
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(15);
        org.joda.time.LocalTime localTime13 = localTime11.withHourOfDay(0);
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfDay();
        org.joda.time.LocalTime localTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        mutablePeriod3.setPeriod((long) 15, chronology16);
        org.joda.time.DurationField durationField18 = chronology16.weeks();
        int int21 = durationField18.getDifference((long) 31, 8L);
        long long24 = durationField18.getMillis(999, (long) 625);
        long long27 = durationField18.add((long) 534, 250);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 604195200000L + "'", long24 == 604195200000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 151200000534L + "'", long27 == 151200000534L);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusMillis((int) (short) -1);
        int int10 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withDayOfYear(53);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withWeekyear(2000);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime2.withMillisOfDay(51);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime2.withMinuteOfHour(28);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withSecondOfMinute((int) (byte) 10);
        int int24 = localDateTime23.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.secondOfMinute();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfCeilingCopy();
        int int28 = localDateTime27.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime31.secondOfMinute();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(readableInstant37);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        boolean boolean41 = localDateTime2.isEqual((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.plusHours(80);
        int int44 = localDateTime39.getEra();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.plus(readablePeriod45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusYears(994);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusSeconds(0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        int int51 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate localDate53 = localDate31.plusYears(10);
        org.joda.time.LocalDate.Property property54 = localDate53.era();
        org.joda.time.LocalDate localDate56 = localDate53.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.LocalDate.Property property57 = localDate56.dayOfWeek();
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant58, readableInstant59, periodType60);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.years();
        mutablePeriod61.set(durationFieldType62, 2);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Interval interval68 = new org.joda.time.Interval(obj66, chronology67);
        org.joda.time.MutableInterval mutableInterval69 = interval68.toMutableInterval();
        org.joda.time.Chronology chronology70 = mutableInterval69.getChronology();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) 0, chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = localDate71.toDateTimeAtMidnight(dateTimeZone72);
        int int74 = dateTime73.getMinuteOfDay();
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod61, (org.joda.time.ReadableInstant) dateTime73);
        java.util.Locale locale78 = new java.util.Locale("hi!", "");
        java.util.Locale locale81 = new java.util.Locale("hi!", "");
        java.lang.String str82 = locale81.getISO3Country();
        java.lang.String str83 = locale78.getDisplayCountry(locale81);
        java.util.Calendar calendar84 = dateTime73.toCalendar(locale78);
        int int85 = property57.getMaximumShortTextLength(locale78);
        org.joda.time.LocalDate localDate86 = property57.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property87 = localDate86.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = localDate86.toString("2022-02-25T16:34:40.816+81:11:18.994/2022-02-25T16:34:40.816+81:11:18.994");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(calendar84);
// flaky:         org.junit.Assert.assertEquals(calendar84.toString(), "java.util.GregorianCalendar[time=-33078994,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+81:11:18.994,offset=292278994,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=292278994,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
        org.junit.Assert.assertNotNull(localDate86);
        org.junit.Assert.assertNotNull(property87);
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        int int55 = localDate31.getMonthOfYear();
        org.joda.time.LocalDate localDate57 = localDate31.withDayOfYear((int) (short) 1);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Interval interval62 = new org.joda.time.Interval(obj60, chronology61);
        org.joda.time.MutableInterval mutableInterval63 = interval62.toMutableInterval();
        org.joda.time.Chronology chronology64 = mutableInterval63.getChronology();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 0, chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.halfdayOfDay();
        org.joda.time.DurationField durationField67 = chronology64.halfdays();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 13, chronology64);
        mutableDateTime68.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime68.year();
        mutableDateTime68.setDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime68.setZone(dateTimeZone74);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = localDate31.toDateTimeAtStartOfDay(dateTimeZone74);
        org.joda.time.DateTime dateTime78 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime80 = dateTime78.minusMinutes(5);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(mutableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.Period period8 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period10 = period8.multipliedBy(0);
        org.joda.time.LocalTime localTime11 = localTime6.minus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.LocalTime localTime13 = localTime6.minusSeconds(2000);
        org.joda.time.LocalTime.Property property14 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(59440, 960, 2022, 600, 4, 33079515);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        java.util.Date date3 = new java.util.Date((int) (byte) 10, (int) (byte) 100, 0);
        int int4 = date3.getYear();
        date3.setDate(13);
        int int7 = date3.getDate();
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateMidnight dateMidnight9 = yearMonthDay8.toDateMidnight();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property11 = timeOfDay10.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.minusSeconds((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfDay(15);
        org.joda.time.LocalTime localTime20 = localTime16.plusSeconds(15);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        int int23 = timeZone21.getOffset((long) 51);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone21);
        int int25 = calendar24.getWeekYear();
        calendar24.roll((int) (short) 0, false);
        int int29 = calendar24.getMinimalDaysInFirstWeek();
        calendar24.setLenient(true);
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.fromCalendarFields(calendar24);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.plusMillis(17);
        int int35 = localTime16.compareTo((org.joda.time.ReadablePartial) timeOfDay32);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay32.minusMinutes(32772);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.plusSeconds(1439);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1980, (-1866239999999941L), periodType43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.millis();
        int int46 = periodType43.indexOf(durationFieldType45);
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay37.withFieldAdded(durationFieldType45, (-292275054));
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay10.withFieldAdded(durationFieldType45, 521);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay8.withFieldAdded(durationFieldType45, 33079515);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 13 00:00:00 GMT+00:00 1918");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=-125940760465212,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.001,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=34,MILLISECOND=789,ZONE_OFFSET=1,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(15);
        org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime6.withHourOfDay(0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        int int12 = localTime10.getMillisOfSecond();
        org.joda.time.LocalTime localTime14 = localTime10.minusMinutes(10);
        org.joda.time.LocalTime.Property property15 = localTime10.millisOfSecond();
        org.joda.time.LocalTime localTime16 = property15.roundCeilingCopy();
        int int17 = property1.compareTo((org.joda.time.ReadablePartial) localTime16);
        int int18 = property1.get();
        int int19 = property1.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField20 = property1.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property1.getFieldType();
        int int22 = property1.getMaximumValue();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType30 = periodType29.withSecondsRemoved();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate24, periodType30);
        org.joda.time.DateTime dateTime32 = dateTime8.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.DateTime.Property property33 = dateTime8.year();
        java.util.Locale.Category category35 = java.util.Locale.Category.DISPLAY;
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval(obj37, chronology38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Chronology chronology41 = mutableInterval40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtMidnight(dateTimeZone43);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval(obj46, chronology47);
        org.joda.time.MutableInterval mutableInterval49 = interval48.toMutableInterval();
        org.joda.time.Chronology chronology50 = mutableInterval49.getChronology();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate51.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType57 = periodType56.withSecondsRemoved();
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate42, (org.joda.time.ReadablePartial) localDate51, periodType57);
        java.util.Locale locale61 = new java.util.Locale("hi!", "");
        boolean boolean62 = localDate42.equals((java.lang.Object) locale61);
        java.util.Locale.setDefault(category35, locale61);
        org.joda.time.DateTime dateTime64 = property33.setCopy("17", locale61);
        org.joda.time.DateTime.Property property65 = dateTime64.era();
        org.joda.time.DateTime dateTime67 = property65.setCopy(0);
        org.joda.time.DateMidnight dateMidnight68 = dateTime67.toDateMidnight();
        org.joda.time.DateTime dateTime69 = dateTime67.toDateTime();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category35.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateMidnight68);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.secondOfDay();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        int int14 = dateTimeField11.getMaximumValue(948713999000L);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime17.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.plusHours(16);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean26 = localDateTime24.isSupported(dateTimeFieldType25);
        org.joda.time.Period period27 = new org.joda.time.Period();
        org.joda.time.Period period29 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType31 = period29.getFieldType((int) (short) 1);
        org.joda.time.Period period32 = period27.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.withPeriodAdded((org.joda.time.ReadablePeriod) period29, 26283);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withMillisOfSecond(7);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType41 = periodType40.withMillisRemoved();
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', (long) 5, periodType40);
        int[] intArray43 = period42.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = dateTimeField11.add((org.joda.time.ReadablePartial) localDateTime34, 754, intArray43, (-1645508580));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 86399 + "'", int14 == 86399);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, 0, 0, 0, -92]");
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(1962, 59724412, 1069200, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1962 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 6);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (-1), dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(15);
        org.joda.time.LocalTime localTime11 = localTime9.withHourOfDay(0);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.addWrapFieldToCopy(6);
        org.joda.time.LocalTime localTime15 = property12.roundHalfCeilingCopy();
        java.lang.String str16 = localTime15.toString();
        int int17 = localTime15.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean19 = localTime15.isSupported(dateTimeFieldType18);
        mutableDateTime4.set(dateTimeFieldType18, 12);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime4.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00:00:00.015" + "'", str16, "00:00:00.015");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1439, 5, 52, 6, 0, 52, 11, (int) (short) 0);
        mutablePeriod8.setPeriod(0L);
        mutablePeriod8.addMillis(447);
        int int13 = mutablePeriod8.getWeeks();
        mutablePeriod8.addMillis(33079515);
        int int16 = mutablePeriod8.getMinutes();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(15);
        org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(0);
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period12 = period10.multipliedBy(0);
        org.joda.time.LocalTime localTime13 = localTime8.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = period12.minusMillis(11);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay1.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay1.plusHours(15);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.years();
        mutablePeriod23.set(durationFieldType24, 2);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval(obj28, chronology29);
        org.joda.time.MutableInterval mutableInterval31 = interval30.toMutableInterval();
        org.joda.time.Chronology chronology32 = mutableInterval31.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        int int36 = dateTime35.getMinuteOfDay();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod23, (org.joda.time.ReadableInstant) dateTime35);
        int int38 = dateTime35.getMinuteOfHour();
        org.joda.time.DateTime.Property property39 = dateTime35.centuryOfEra();
        int int40 = property39.get();
        org.joda.time.DateTimeField dateTimeField41 = property39.getField();
        int int43 = dateTimeField41.getMinimumValue((long) 15);
        java.util.Locale locale44 = java.util.Locale.US;
        int int45 = dateTimeField41.getMaximumShortTextLength(locale44);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (byte) 1);
        org.joda.time.YearMonthDay.Property property48 = yearMonthDay47.year();
        int int49 = yearMonthDay47.getMonthOfYear();
        int int50 = dateTimeField41.getMaximumValue((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Period period52 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period54 = period52.withHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period57 = period52.withFieldAdded(durationFieldType55, (int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay47.withPeriodAdded((org.joda.time.ReadablePeriod) period57, 47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = timeOfDay1.isAfter((org.joda.time.ReadablePartial) yearMonthDay59);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(mutableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 19 + "'", int40 == 19);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2922789 + "'", int50 == 2922789);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(yearMonthDay59);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(773, 250, 39, 999);
        mutablePeriod4.add(1900, 0, 22, (-143), 408, 12608, 32, (-143));
        mutablePeriod4.setMillis(9);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay2 = property1.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusSeconds(52);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay2.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(15);
        org.joda.time.LocalTime.Property property11 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime13 = property11.addCopy(5);
        int int14 = property11.getMinimumValue();
        org.joda.time.LocalTime localTime15 = property11.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds(50400000);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) localTime15);
        int int19 = timeOfDay2.size();
        int int20 = timeOfDay2.getSecondOfMinute();
        int int21 = timeOfDay2.getHourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfDay();
        org.joda.time.Chronology chronology12 = chronology5.withUTC();
        org.joda.time.DurationField durationField13 = chronology5.millis();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        int int10 = localTime8.getMillisOfSecond();
        org.joda.time.LocalTime localTime12 = localTime8.minusMinutes(10);
        org.joda.time.LocalTime.Property property13 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property13.addWrapFieldToCopy(16);
        org.joda.time.LocalTime localTime18 = property13.addNoWrapToCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime19 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime21 = localTime19.minusMinutes(99);
        org.joda.time.LocalTime localTime23 = localTime19.minusMillis(790);
        org.joda.time.LocalTime.Property property24 = localTime19.secondOfMinute();
        org.joda.time.LocalTime.Property property25 = localTime19.hourOfDay();
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder29 = builder27.clearExtensions();
        java.util.Locale locale30 = builder27.build();
        java.util.Locale.Builder builder31 = builder27.clearExtensions();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Chronology chronology37 = mutableInterval36.getChronology();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 0, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate38.toDateTimeAtMidnight(dateTimeZone39);
        int int41 = dateTime40.getMinuteOfDay();
        int int42 = dateTime40.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime40.getZone();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval(obj46, chronology47);
        org.joda.time.MutableInterval mutableInterval49 = interval48.toMutableInterval();
        org.joda.time.Chronology chronology50 = mutableInterval49.getChronology();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.halfdayOfDay();
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay44.withChronologyRetainFields(chronology50);
        org.joda.time.YearMonthDay.Property property54 = yearMonthDay44.dayOfMonth();
        int int55 = property54.getMinimumValue();
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = property54.getAsText(locale56);
        java.util.Locale.Builder builder58 = builder27.setLocale(locale56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = localTime19.toString("P10YT10H", locale56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "25" + "'", str57, "25");
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        mutablePeriod6.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfDay(15);
        org.joda.time.LocalTime localTime16 = localTime14.withHourOfDay(0);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfDay();
        org.joda.time.LocalTime localTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        mutablePeriod6.setPeriod((long) 15, chronology19);
        org.joda.time.DurationField durationField21 = chronology19.weeks();
        org.joda.time.Period period22 = new org.joda.time.Period((long) 32770, (long) 101, periodType2, chronology19);
        java.lang.String str23 = period22.toString();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT-32.669S" + "'", str23, "PT-32.669S");
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter5.getParser();
        int int9 = dateTimeFormatter5.getDefaultYear();
        java.util.Locale locale10 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withLocale(locale10);
        int int12 = dateTimeFormatter11.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter11.parseLocalDate("java.util.GregorianCalendar[time=1645514320416,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.001,offset=18,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=18,SECOND=40,MILLISECOND=434,ZONE_OFFSET=18,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 11, dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(dateTimeZone1);
        int int4 = timeOfDay3.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.minusMillis((int) (byte) 0);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(15);
        org.joda.time.LocalTime localTime14 = localTime12.withHourOfDay(0);
        org.joda.time.LocalTime.Property property15 = localTime14.millisOfDay();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category17, locale20);
        int int23 = property15.getMaximumTextLength(locale20);
        org.joda.time.LocalTime localTime25 = property15.addCopy((long) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property15.getFieldType();
        org.joda.time.DateTimeField dateTimeField27 = property15.getField();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj30, chronology31);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.Chronology chronology34 = mutableInterval33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.millisOfSecond();
        org.joda.time.DurationField durationField36 = chronology34.weekyears();
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology34);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay39 = property38.withMaximumValue();
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder40.setVariant("months");
        java.util.Locale locale43 = builder42.build();
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale43.getDisplayScript();
        java.lang.String str46 = property38.getAsText(locale43);
        java.lang.String str47 = dateTimeField27.getAsShortText(38, locale43);
        int int48 = property7.getMaximumTextLength(locale43);
        int int49 = property7.get();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "38" + "'", str47, "38");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16 + "'", int49 == 16);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(28852010);
        org.joda.time.LocalDate.Property property9 = localDate6.centuryOfEra();
        org.joda.time.LocalDate localDate10 = property9.roundCeilingCopy();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        int int3 = localTime2.size();
        org.joda.time.LocalTime.Property property4 = localTime2.minuteOfHour();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.Interval interval7 = property4.toInterval();
        org.joda.time.LocalTime localTime8 = property4.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, 0, 117, (int) (short) 100);
        java.lang.Object obj5 = mutablePeriod4.clone();
        mutablePeriod4.addMonths(22);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField17 = chronology14.halfdays();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 13, chronology14);
        java.lang.String str19 = mutableDateTime18.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.property(dateTimeFieldType20);
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableInstant23, readableInstant24, periodType25);
        mutablePeriod26.addYears((int) (short) -1);
        mutableDateTime22.add((org.joda.time.ReadablePeriod) mutablePeriod26, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime22.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.addWrapField(27);
        boolean boolean34 = mutablePeriod4.equals((java.lang.Object) mutableDateTime33);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDayOfWeek(59443);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59443 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "P22MT10H117.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "P22MT10H117.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "P22MT10H117.100S");
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-04T09:11:19.007+81:11:18.994" + "'", str19, "1970-01-04T09:11:19.007+81:11:18.994");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        int int10 = localTime8.getMillisOfSecond();
        org.joda.time.LocalTime localTime12 = localTime8.minusMinutes(10);
        org.joda.time.LocalTime.Property property13 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property13.addWrapFieldToCopy(16);
        org.joda.time.LocalTime localTime18 = property13.addNoWrapToCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime19 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime21 = localTime19.minusMinutes(99);
        org.joda.time.LocalTime localTime23 = localTime19.minusMillis(790);
        int int24 = localTime23.getSecondOfMinute();
        int int25 = localTime23.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        mutableDateTime10.setDayOfYear(51);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.weekyear();
        mutableDateTime10.setYear(40);
        org.joda.time.DateTime dateTime16 = mutableDateTime10.toDateTime();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval(obj28, chronology29);
        org.joda.time.MutableInterval mutableInterval31 = interval30.toMutableInterval();
        org.joda.time.Chronology chronology32 = mutableInterval31.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval(obj37, chronology38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Chronology chronology41 = mutableInterval40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType48 = periodType47.withSecondsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate33, (org.joda.time.ReadablePartial) localDate42, periodType48);
        org.joda.time.DateTime dateTime50 = dateTime26.minus((org.joda.time.ReadablePeriod) period49);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        org.joda.time.MutableInterval mutableInterval55 = interval54.toMutableInterval();
        org.joda.time.Chronology chronology56 = mutableInterval55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 0, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate57.toDateTimeAtMidnight(dateTimeZone58);
        int int60 = dateTime59.getMinuteOfDay();
        int int61 = dateTime59.getYearOfEra();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDate localDate63 = dateTime59.toLocalDate();
        org.joda.time.LocalDate.Property property64 = localDate63.year();
        org.joda.time.LocalDate.Property property65 = localDate63.dayOfMonth();
        org.joda.time.LocalDate localDate67 = property65.addToCopy((int) (byte) 100);
        java.lang.String str68 = property65.getAsString();
        org.joda.time.LocalDate localDate69 = property65.withMaximumValue();
        org.joda.time.LocalDate localDate70 = property65.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDate67);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4" + "'", str68, "4");
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(localDate70);
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-11));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfDay();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 1969, chronology5);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        int int11 = localTime9.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone13);
        int int15 = localTime14.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime14.getFields();
        org.joda.time.LocalTime.Property property17 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime9.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime.Property property19 = localTime18.millisOfDay();
        org.joda.time.LocalTime localTime21 = property19.addWrapFieldToCopy(33070000);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(101, (-2718), 87);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = localTime8.plusMinutes(20);
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(64);
        java.lang.String str13 = localTime10.toString();
        org.joda.time.LocalTime localTime15 = localTime10.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime17 = localTime15.minusMillis(10);
        org.joda.time.LocalTime localTime19 = localTime15.minusMinutes(36000000);
        org.joda.time.LocalTime localTime21 = localTime19.minusHours(4);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00:20:00.015" + "'", str13, "00:20:00.015");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond(100);
        org.joda.time.LocalTime localTime6 = localTime4.minusMillis(22);
        org.joda.time.LocalTime.Property property7 = localTime4.millisOfDay();
        org.joda.time.LocalTime localTime9 = property7.addWrapFieldToCopy(102);
        org.joda.time.LocalTime localTime10 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property7.getLocalTime();
        java.util.Locale locale16 = new java.util.Locale("", "1970-06-04T00:00:00.017", "PT1645514180.484S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localTime11.toString("2022-02-22T07:22:18.074+00:00:00.015/2022-02-22T07:22:18.074+00:00:00.015", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals(locale16.toString(), "_1970-06-04T00:00:00.017_PT1645514180.484S");
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.addWrapFieldToCopy(9);
        org.joda.time.LocalTime localTime5 = localTime3.minusHours(521);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property6.addWrapFieldToCopy((-70919999));
        org.joda.time.LocalTime localTime9 = property6.roundFloorCopy();
        int int10 = localTime9.size();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(obj3, chronology4);
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        org.joda.time.Chronology chronology7 = mutableInterval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = chronology7.halfdays();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(432000000L, chronology7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1645514262128L, (long) 22, chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 10, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 2022, dateTimeZone17);
        long long21 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, (long) 4);
        org.joda.time.Chronology chronology22 = chronology7.withZone(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 15);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfDay(15);
        org.joda.time.LocalTime localTime16 = localTime14.withHourOfDay(0);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfDay();
        org.joda.time.LocalTime localTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        boolean boolean21 = dateTimeField19.isLeap((long) 1439);
        java.util.Locale locale24 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        int int26 = dateTimeField19.getMaximumTextLength(locale24);
        java.lang.String str27 = locale9.getDisplayLanguage(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter8.withLocale(locale24);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter8.getPrinter();
        boolean boolean30 = dateTimeFormatter8.isOffsetParsed();
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval(obj34, chronology35);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Chronology chronology38 = mutableInterval37.getChronology();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.halfdayOfDay();
        org.joda.time.DurationField durationField41 = chronology38.halfdays();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 13, chronology38);
        java.lang.String str43 = mutableDateTime42.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.property(dateTimeFieldType44);
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundFloor();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.getMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.property(dateTimeFieldType49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime48.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer31, (org.joda.time.ReadableInstant) mutableDateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "thu jan 01 00:00:00 utc 1970");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "thu jan 01 00:00:00 utc 1970" + "'", str27, "thu jan 01 00:00:00 utc 1970");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimePrinter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-04T09:11:19.007+81:11:18.994" + "'", str43, "1970-01-04T09:11:19.007+81:11:18.994");
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, periodType7, chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekyearOfCentury();
        mutablePeriod3.setPeriod((long) (byte) -1, (long) 'a', chronology14);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.era();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusWeeks(215);
        boolean boolean23 = dateMidnight22.isEqualNow();
        org.joda.time.DateMidnight.Property property24 = dateMidnight22.yearOfCentury();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        int int1 = timeOfDay0.size();
        org.joda.time.LocalTime localTime2 = timeOfDay0.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.minusHours(66143405);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay0.minusMillis(29);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale12 = new java.util.Locale("2022-02-22T07:15:52.426Z/2022-02-22T07:15:52.426Z", "+00:00");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale12);
        java.lang.String str14 = dateTimeField8.getAsShortText(1996, locale12);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale12.toString(), "2022-02-22t07:15:52.426z/2022-02-22t07:15:52.426z_+00:00");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645514739785,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=USA,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=39,MILLISECOND=786,ZONE_OFFSET=1,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1996" + "'", str14, "1996");
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 26239);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add(259201999L);
        org.joda.time.MutableDateTime mutableDateTime5 = property2.roundHalfEven();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setMinuteOfHour(66130000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66130000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-820798561L), chronology3);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.weekOfWeekyear();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((-126230400013L), 579600000L, chronology5);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology5);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        java.util.Date date5 = new java.util.Date(59460, 1380, 507, 26613, 0);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Jun 03 21:00:00 GMT+00:00 61479");
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.property(dateTimeFieldType12);
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        int int15 = mutableDateTime14.getSecondOfDay();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        mutablePeriod19.set(durationFieldType20, 2);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(obj24, chronology25);
        org.joda.time.MutableInterval mutableInterval27 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology28 = mutableInterval27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod19, (org.joda.time.ReadableInstant) dateTime31);
        int int34 = dateTime31.getMinuteOfHour();
        org.joda.time.DateTime.Property property35 = dateTime31.centuryOfEra();
        int int36 = dateTime31.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime31.toMutableDateTime();
        org.joda.time.Period period39 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period41 = period39.multipliedBy(0);
        org.joda.time.DateTime dateTime43 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) period39, 2);
        org.joda.time.DateTime dateTime45 = dateTime43.withDayOfYear(24);
        boolean boolean46 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property47 = dateTime45.dayOfMonth();
        org.joda.time.DateTime dateTime48 = property47.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-04T09:11:19.007+81:11:18.994" + "'", str11, "1970-01-04T09:11:19.007+81:11:18.994");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32400 + "'", int15 == 32400);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks((int) (byte) -1);
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime13 = property8.addToCopy((long) 14);
        org.joda.time.LocalDateTime localDateTime15 = property8.addToCopy((-518399999));
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(26314);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond(310);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone21);
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfDay(15);
        org.joda.time.LocalTime localTime26 = localTime24.withHourOfDay(0);
        org.joda.time.LocalTime.Property property27 = localTime26.millisOfDay();
        org.joda.time.LocalTime localTime28 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        org.joda.time.LocalTime localTime31 = property27.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime33 = property27.setCopy(52);
        org.joda.time.LocalTime localTime35 = property27.addCopy(1);
        org.joda.time.LocalTime localTime36 = property27.withMinimumValue();
        org.joda.time.LocalTime localTime37 = property27.roundCeilingCopy();
        org.joda.time.Period period46 = new org.joda.time.Period(203, 480, 33095004, 974, 26356882, 108, 719162, 64);
        org.joda.time.LocalTime localTime47 = localTime37.minus((org.joda.time.ReadablePeriod) period46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime17, (org.joda.time.ReadablePartial) localTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime47);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) ' ');
        org.joda.time.LocalTime localTime12 = localTime8.minusHours(26305);
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes(15);
        java.util.Locale locale16 = java.util.Locale.US;
        java.lang.String str17 = locale16.getISO3Language();
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.getDisplayVariant();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Chronology chronology26 = mutableInterval25.getChronology();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.halfdayOfDay();
        org.joda.time.DurationField durationField29 = chronology26.halfdays();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 13, chronology26);
        mutableDateTime30.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.year();
        java.util.Locale locale35 = new java.util.Locale("Years");
        int int36 = property33.getMaximumShortTextLength(locale35);
        java.lang.String str37 = locale16.getDisplayScript(locale35);
        java.lang.String str39 = locale16.getExtension('u');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = localTime12.toString("2022-02-22T07:22:19.635+00:00:00.015/2022-02-22T07:22:19.635+00:00:00.015", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-US" + "'", str18, "en-US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals(locale35.toString(), "years");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((-292275054), 32769, 600, 10);
        org.joda.time.Period period8 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period10 = period8.multipliedBy(0);
        int int11 = period8.getMonths();
        org.joda.time.Period period13 = period8.plusYears(0);
        org.joda.time.Period period15 = period8.plusHours(19);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime18.plus(readablePeriod19);
        org.joda.time.LocalTime localTime22 = localTime20.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.minuteOfDay();
        mutableDateTime24.setSecondOfDay((int) (short) 10);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.minuteOfHour();
        mutableDateTime24.add((long) 10);
        org.joda.time.DateTime dateTime31 = localTime20.toDateTime((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Chronology chronology37 = mutableInterval36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.minuteOfDay();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) 1969, chronology37);
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.now(chronology37);
        org.joda.time.DateTime dateTime42 = dateTime31.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(dateTimeZone43);
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period15, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        mutablePeriod5.setPeriod(994L, chronology46);
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology46);
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property50 = timeOfDay49.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone52);
        org.joda.time.LocalTime localTime55 = localTime53.withMillisOfDay(15);
        org.joda.time.LocalTime localTime57 = localTime55.withHourOfDay(0);
        org.joda.time.LocalTime localTime59 = localTime55.withHourOfDay(0);
        org.joda.time.Chronology chronology60 = localTime59.getChronology();
        int int61 = localTime59.getMillisOfSecond();
        org.joda.time.LocalTime localTime63 = localTime59.minusMinutes(10);
        org.joda.time.LocalTime.Property property64 = localTime59.millisOfSecond();
        org.joda.time.LocalTime localTime65 = property64.roundCeilingCopy();
        int int66 = property50.compareTo((org.joda.time.ReadablePartial) localTime65);
        java.lang.String str67 = property50.getAsString();
        org.joda.time.TimeOfDay timeOfDay68 = property50.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay69 = property50.withMaximumValue();
        int[] intArray71 = chronology46.get((org.joda.time.ReadablePartial) timeOfDay69, 1645521437303L);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 15 + "'", int61 == 15);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(intArray71);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[18, 28, 36, 297]");
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime9 = property7.addWrapFieldToCopy(6);
        org.joda.time.LocalTime localTime10 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime11 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property7.setCopy(26692);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, periodType7, chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekyearOfCentury();
        mutablePeriod3.setPeriod((long) (byte) -1, (long) 'a', chronology14);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.era();
        java.util.Locale locale23 = new java.util.Locale("hi!", "");
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        java.lang.String str27 = locale26.getISO3Country();
        java.lang.String str28 = locale23.getDisplayCountry(locale26);
        java.lang.String str29 = dateTimeField19.getAsShortText((long) (short) -1, locale23);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj30, chronology31);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = interval32.isBefore(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.years();
        mutablePeriod39.set(durationFieldType40, 2);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval(obj44, chronology45);
        org.joda.time.MutableInterval mutableInterval47 = interval46.toMutableInterval();
        org.joda.time.Chronology chronology48 = mutableInterval47.getChronology();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate49.toDateTimeAtMidnight(dateTimeZone50);
        int int52 = dateTime51.getMinuteOfDay();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod39, (org.joda.time.ReadableInstant) dateTime51);
        int int54 = dateTime51.getMinuteOfHour();
        int int55 = dateTime51.getMillisOfSecond();
        boolean boolean56 = interval32.isBefore((org.joda.time.ReadableInstant) dateTime51);
        java.util.Locale locale58 = java.util.Locale.UK;
        java.lang.String str59 = dateTime51.toString("0", locale58);
        java.lang.String str60 = locale23.getDisplayCountry(locale58);
        java.lang.String str61 = locale23.getVariant();
        java.lang.String str62 = locale23.getVariant();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AD" + "'", str29, "AD");
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(mutableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime6.minusHours((int) (byte) 0);
        int int9 = localTime6.getMinuteOfHour();
        int int10 = localTime6.getMillisOfSecond();
        org.joda.time.LocalTime localTime12 = localTime6.minusMillis(24);
        org.joda.time.LocalTime localTime14 = localTime6.plusMillis(10017);
        org.joda.time.Chronology chronology15 = localTime6.getChronology();
        org.joda.time.DateTime dateTime16 = localTime6.toDateTimeToday();
        org.joda.time.LocalTime localTime18 = localTime6.plusMillis(217);
        int int19 = localTime18.size();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        org.joda.time.ReadableDuration readableDuration0 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        int int10 = dateTime9.getMinuteOfDay();
        int int11 = dateTime9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime9.getZone();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        java.lang.String str15 = periodType14.getName();
        org.joda.time.PeriodType periodType16 = periodType14.withSecondsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime9, periodType16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.joda.time.DurationField durationField26 = chronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.yearOfCentury();
        org.joda.time.DateTime dateTime28 = dateTime9.toDateTime(chronology23);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval(obj31, chronology32);
        org.joda.time.MutableInterval mutableInterval34 = interval33.toMutableInterval();
        org.joda.time.Chronology chronology35 = mutableInterval34.getChronology();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.halfdayOfDay();
        org.joda.time.DurationField durationField38 = chronology35.halfdays();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 13, chronology35);
        java.lang.String str40 = mutableDateTime39.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.property(dateTimeFieldType41);
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundFloor();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.roundHalfEven();
        mutableDateTime46.setYear(1969);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime9.toMutableDateTime(dateTimeZone49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.year();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Years" + "'", str15, "Years");
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-04T09:11:19.007+81:11:18.994" + "'", str40, "1970-01-04T09:11:19.007+81:11:18.994");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 1969, chronology6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(25226197L, chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.centuryOfEra();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = property7.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime12 = property7.addCopy((long) (byte) -1);
        org.joda.time.LocalTime localTime13 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime15 = property7.addWrapFieldToCopy(1936);
        java.util.Locale locale19 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(obj24, chronology25);
        org.joda.time.MutableInterval mutableInterval27 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology28 = mutableInterval27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.DateTime.Property property33 = dateTime31.yearOfCentury();
        boolean boolean34 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property35 = dateTime31.dayOfMonth();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval(obj37, chronology38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Chronology chronology41 = mutableInterval40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtMidnight(dateTimeZone43);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval(obj46, chronology47);
        org.joda.time.MutableInterval mutableInterval49 = interval48.toMutableInterval();
        org.joda.time.Chronology chronology50 = mutableInterval49.getChronology();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate51.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType57 = periodType56.withSecondsRemoved();
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate42, (org.joda.time.ReadablePartial) localDate51, periodType57);
        java.util.Locale locale61 = new java.util.Locale("hi!", "");
        boolean boolean62 = localDate42.equals((java.lang.Object) locale61);
        int int63 = property35.getMaximumTextLength(locale61);
        java.lang.String str64 = locale19.getDisplayCountry(locale61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = localTime15.toString("2022-02-23T14:00:00.000+18:22:23.405", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.millisOfSecond();
        org.joda.time.DurationField durationField8 = chronology6.weekyears();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology6);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.weekyearOfCentury();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 50400000, chronology6);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(26257);
        org.joda.time.DateTime dateTime17 = dateTime15.withYear(59700925);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        int int11 = timeZone9.getOffset((long) 51);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj14, chronology15);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.Chronology chronology18 = mutableInterval17.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        org.joda.time.MutableInterval mutableInterval26 = interval25.toMutableInterval();
        org.joda.time.Chronology chronology27 = mutableInterval26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType34 = periodType33.withSecondsRemoved();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate28, periodType34);
        boolean boolean36 = calendar12.after((java.lang.Object) periodType34);
        java.lang.String str37 = periodType34.toString();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 'a', periodType34);
        org.joda.time.PeriodType periodType39 = periodType34.withMonthsRemoved();
        java.lang.String str40 = periodType39.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = new org.joda.time.Period(805, 0, 0, 280, 32787, 84400015, 27, 26583, periodType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645514740235,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=USA,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=40,MILLISECOND=236,ZONE_OFFSET=1,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PeriodType[Years]" + "'", str37, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Years" + "'", str40, "Years");
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) (byte) 10);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMillis(8);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis(11);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime10 = timeOfDay9.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.plusMillis(35510426);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusMinutes(10022);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField10 = chronology5.months();
        org.joda.time.DurationField durationField11 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.secondOfDay();
        int int14 = dateTimeField12.getMinimumValue((long) (byte) 1);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology7 = dateTimeFormatter6.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter6.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.parse("Mon Dec 30 16:09:00 GMT+00:00 802233", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(dateTimeParser9);
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(15);
        org.joda.time.LocalTime localTime11 = localTime9.withHourOfDay(0);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.Chronology chronology15 = localTime13.getChronology();
        org.joda.time.Period period16 = new org.joda.time.Period((long) 13, periodType4, chronology15);
        int int17 = periodType4.size();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Years" + "'", str3, "Years");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate15, periodType21);
        java.util.Locale locale25 = new java.util.Locale("hi!", "");
        boolean boolean26 = localDate6.equals((java.lang.Object) locale25);
        org.joda.time.LocalDate.Property property27 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.roundFloorCopy();
        org.joda.time.LocalDate.Property property29 = localDate28.weekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate28.withCenturyOfEra(9);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval(obj34, chronology35);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Chronology chronology38 = mutableInterval37.getChronology();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.halfdayOfDay();
        org.joda.time.DurationField durationField41 = chronology38.halfdays();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 13, chronology38);
        mutableDateTime42.setHourOfDay(7);
        mutableDateTime42.setTime((long) 86399999);
        mutableDateTime42.addMinutes(576);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 6);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) (-1), dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(117L, dateTimeZone53);
        mutableDateTime42.setZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime58 = localDate31.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(dateTimeZone53);
        long long63 = dateTimeZone53.convertLocalToUTC(99L, false, 255142800013L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-359901L) + "'", long63 == (-359901L));
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusYears(6);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minus((long) 10);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.minusWeeks(8);
        org.joda.time.DateTime dateTime61 = dateMidnight60.toDateTimeISO();
        org.joda.time.DateMidnight.Property property62 = dateMidnight60.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight64 = property62.addToCopy((int) (byte) 0);
        boolean boolean65 = dateMidnight64.isEqualNow();
        org.joda.time.DateTime dateTime66 = dateMidnight64.toDateTime();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTime66);
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 13, chronology8);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) ' ', chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 19, chronology8);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfDay();
        java.lang.String str17 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[+00:06]" + "'", str17, "ISOChronology[+00:06]");
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 51);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getWeekYear();
        calendar3.clear();
        calendar3.setFirstDayOfWeek(2);
        calendar3.setFirstDayOfWeek(100);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        org.joda.time.DateTimeField dateTimeField12 = localTime10.getField(0);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=USA,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=1,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) 10, dateTimeZone2);
        long long5 = dateTimeZone2.previousTransition((-189388798561L));
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) (short) 0, 86399999, (int) (short) 0, 45);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        int int13 = mutableDateTime12.getSecondOfMinute();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.halfdayOfDay();
        org.joda.time.DurationField durationField22 = chronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.yearOfCentury();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology19);
        org.joda.time.LocalDate localDate25 = dateTime24.toLocalDate();
        mutablePeriod11.setPeriod((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableInstant) dateTime24);
        mutableDateTime12.setSecondOfDay(102);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime6.addMinutes(521);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime6.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfCeiling();
        mutableDateTime33.setWeekOfWeekyear(39);
        mutableDateTime33.addWeekyears(18000013);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-189388798561L) + "'", long5 == (-189388798561L));
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 40 + "'", int13 == 40);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis(59487633);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusYears(6);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minus((long) 10);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.minusWeeks(8);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight60.withDurationAdded((long) 13, 0);
        org.joda.time.DateMidnight.Property property64 = dateMidnight60.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight65 = property64.roundHalfFloorCopy();
        org.joda.time.Interval interval66 = dateMidnight65.toInterval();
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay((long) 8);
        org.joda.time.YearMonthDay yearMonthDay70 = yearMonthDay68.minusMonths(19);
        org.joda.time.DateTime dateTime71 = yearMonthDay68.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval72 = yearMonthDay68.toInterval();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight65.withFields((org.joda.time.ReadablePartial) yearMonthDay68);
        java.lang.String str74 = yearMonthDay68.toString();
        org.joda.time.Interval interval75 = yearMonthDay68.toInterval();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(yearMonthDay70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1970-01-01" + "'", str74, "1970-01-01");
        org.junit.Assert.assertNotNull(interval75);
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone2);
        int int4 = localTime3.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localTime3.getFields();
        org.joda.time.LocalTime localTime7 = localTime3.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis((int) '4');
        org.joda.time.Chronology chronology10 = localTime7.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((-1866239999999941L), chronology10);
        org.joda.time.Period period13 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period15 = period13.withDays(0);
        int[] intArray16 = period13.getValues();
        org.joda.time.Period period18 = period13.plusMillis(6425345);
        org.joda.time.Period period20 = period13.minusYears(981);
        int[] intArray22 = chronology10.get((org.joda.time.ReadablePeriod) period20, 79200032L);
        org.joda.time.Period period24 = period20.withMinutes(505773);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 22, 0, 0, 32]");
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        int int10 = localTime8.getMillisOfSecond();
        org.joda.time.LocalTime localTime12 = localTime8.minusMinutes(10);
        org.joda.time.LocalTime.Property property13 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property13.addWrapFieldToCopy(16);
        org.joda.time.LocalTime localTime18 = property13.addCopy(910103041036801987L);
        org.joda.time.Period period20 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType22 = period20.getFieldType((int) (short) 1);
        org.joda.time.Period period24 = period20.minusWeeks((int) (byte) 1);
        int int25 = period24.getMillis();
        org.joda.time.Period period26 = period24.toPeriod();
        org.joda.time.LocalTime localTime27 = localTime18.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property29 = timeOfDay28.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay28.withFieldAdded(durationFieldType31, 2);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        org.joda.time.TimeOfDay timeOfDay37 = property34.setCopy(12);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str39 = durationFieldType38.getName();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay37.withFieldAdded(durationFieldType38, 447);
        org.joda.time.LocalTime localTime43 = localTime27.withFieldAdded(durationFieldType38, 993);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "minutes" + "'", str39, "minutes");
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(localTime43);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.MutableInterval mutableInterval3 = interval2.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = interval2.isBefore(readableInstant4);
        org.joda.time.Chronology chronology6 = interval2.getChronology();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate16 = localDate13.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval(obj17, chronology18);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Chronology chronology26 = mutableInterval25.getChronology();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.Interval interval30 = interval19.withStart((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = localDate13.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Chronology chronology37 = mutableInterval36.getChronology();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 0, chronology37);
        org.joda.time.DateTime dateTime39 = localDate38.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate41 = localDate38.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval(obj42, chronology43);
        org.joda.time.MutableInterval mutableInterval45 = interval44.toMutableInterval();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Interval interval49 = new org.joda.time.Interval(obj47, chronology48);
        org.joda.time.MutableInterval mutableInterval50 = interval49.toMutableInterval();
        org.joda.time.Chronology chronology51 = mutableInterval50.getChronology();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 0, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtMidnight(dateTimeZone53);
        org.joda.time.Interval interval55 = interval44.withStart((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = localDate38.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean57 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.LocalDate.Property property58 = localDate38.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight61 = localDate38.toDateMidnight(dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusYears(6);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight61.minus((long) 10);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusWeeks(8);
        org.joda.time.DateTime dateTime68 = dateMidnight67.toDateTimeISO();
        org.joda.time.DateMidnight.Property property69 = dateMidnight67.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight67.plusYears(32772);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight67.withWeekyear(10);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight73.plusWeeks(9);
        boolean boolean76 = interval2.isAfter((org.joda.time.ReadableInstant) dateMidnight75);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight75.plus((long) 1969);
        org.joda.time.DateMidnight.Property property79 = dateMidnight78.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight80 = property79.withMinimumValue();
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(mutableInterval45);
        org.junit.Assert.assertNotNull(mutableInterval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(dateMidnight75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(dateMidnight78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(dateMidnight80);
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor4 = strSet3.iterator();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusWeeks((int) (byte) -1);
        boolean boolean16 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        boolean boolean17 = strSet3.remove((java.lang.Object) localDateTime11);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withHoursRemoved();
        boolean boolean21 = strSet3.remove((java.lang.Object) periodType18);
        boolean boolean22 = strSet3.isEmpty();
        strSet3.clear();
        java.lang.Object[] objArray24 = strSet3.toArray();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime9 = property7.addWrapFieldToCopy(6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localTime9.toDateTimeToday(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        int int14 = timeOfDay13.getMillisOfSecond();
        int int15 = timeOfDay13.getHourOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(obj20, chronology21);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Chronology chronology24 = mutableInterval23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime15.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime29 = dateTime15.plusMinutes((int) (byte) 1);
        org.joda.time.Period period31 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period33 = period31.multipliedBy(0);
        org.joda.time.Period period35 = period33.withDays((int) (short) 0);
        org.joda.time.Period period37 = period33.withMillis(17);
        org.joda.time.DateTime dateTime38 = dateTime15.plus((org.joda.time.ReadablePeriod) period37);
        java.lang.String str39 = dateTime38.toString();
        org.joda.time.DateTime dateTime40 = dateTime38.withEarlierOffsetAtOverlap();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Interval interval43 = new org.joda.time.Interval(obj41, chronology42);
        org.joda.time.MutableInterval mutableInterval44 = interval43.toMutableInterval();
        org.joda.time.Chronology chronology45 = mutableInterval44.getChronology();
        java.lang.String str46 = mutableInterval44.toString();
        java.lang.String str47 = mutableInterval44.toString();
        org.joda.time.Period period48 = mutableInterval44.toPeriod();
        org.joda.time.Period period49 = mutableInterval44.toPeriod();
        org.joda.time.Period period51 = period49.plusWeeks(3600);
        org.joda.time.DateTime dateTime52 = dateTime38.plus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = dateTime38.withZone(dateTimeZone54);
        org.joda.time.YearMonthDay yearMonthDay57 = dateTime56.toYearMonthDay();
        org.joda.time.DateTime dateTime59 = dateTime56.minusMinutes(33);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01T00:00:00.017+00:06" + "'", str39, "1970-01-01T00:00:00.017+00:06");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(chronology45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2022-02-22T07:31:40.964+00:06/2022-02-22T07:31:40.964+00:06" + "'", str46, "2022-02-22T07:31:40.964+00:06/2022-02-22T07:31:40.964+00:06");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2022-02-22T07:31:40.964+00:06/2022-02-22T07:31:40.964+00:06" + "'", str47, "2022-02-22T07:31:40.964+00:06/2022-02-22T07:31:40.964+00:06");
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 9844);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes((int) (short) 1);
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("years", strMap7);
        java.util.Locale locale11 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList8, (java.util.Collection<java.lang.String>) strSet12);
        java.lang.String[] strArray25 = new java.lang.String[] { "1970-01-01T00:00:00.013Z", "secondOfDay", "22", "1970", "hi!", "1970-01-01T00:00:00.013Z", "yearOfCentury", "2022-02-22T07:15:50.135Z/2022-02-22T07:15:50.135Z", "2022-02-22T07:15:51.387Z/2022-02-22T07:15:51.387Z", "", "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone29);
        org.joda.time.LocalTime localTime32 = localTime30.withMillisOfDay(15);
        org.joda.time.LocalTime localTime34 = localTime32.withHourOfDay(0);
        org.joda.time.LocalTime localTime36 = localTime32.withHourOfDay(0);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        int int38 = localTime36.getMillisOfSecond();
        org.joda.time.LocalTime localTime40 = localTime36.minusMinutes(10);
        boolean boolean41 = strSet26.remove((java.lang.Object) localTime40);
        java.lang.String[] strArray43 = new java.lang.String[] { "+00:00" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        boolean boolean46 = strSet26.retainAll((java.util.Collection<java.lang.String>) strList44);
        boolean boolean47 = strSet12.retainAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder50 = builder48.setVariant("months");
        java.util.Locale.Builder builder52 = builder48.setVariant("");
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Locale locale54 = java.util.Locale.CHINA;
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.util.Locale.Builder builder56 = builder52.setLocale(locale53);
        boolean boolean57 = strSet26.contains((java.lang.Object) locale53);
        java.lang.String str58 = locale5.getDisplayName(locale53);
        java.lang.String str59 = dateTime1.toString("1969-01-01", locale53);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str55, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u65e5\u6587" + "'", str58, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-01-01" + "'", str59, "1969-01-01");
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType30 = periodType29.withSecondsRemoved();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate24, periodType30);
        org.joda.time.DateTime dateTime32 = dateTime8.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime32.toYearMonthDay();
        org.joda.time.Period period35 = new org.joda.time.Period((long) 31);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay33.withPeriodAdded((org.joda.time.ReadablePeriod) period35, (-292275054));
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.halfdayOfDay();
        org.joda.time.DurationField durationField47 = chronology44.halfdays();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) 13, chronology44);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval(obj50, chronology51);
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.Chronology chronology54 = mutableInterval53.getChronology();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 0, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDate55.toDateTimeAtMidnight(dateTimeZone56);
        int int58 = dateTime57.getMinuteOfDay();
        int int59 = dateTime57.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone60 = dateTime57.getZone();
        mutableDateTime48.setZone(dateTimeZone60);
        long long63 = dateTimeZone60.previousTransition((long) 1439);
        java.util.Locale locale67 = new java.util.Locale("hi!", "");
        java.util.Locale locale70 = new java.util.Locale("hi!", "");
        java.lang.String str71 = locale70.getISO3Country();
        java.lang.String str72 = locale67.getDisplayCountry(locale70);
        java.lang.String str73 = dateTimeZone60.getShortName((long) (short) 0, locale67);
        java.util.TimeZone timeZone74 = dateTimeZone60.toTimeZone();
        long long77 = dateTimeZone60.adjustOffset((long) 32770, true);
        org.joda.time.DateTime dateTime78 = yearMonthDay33.toDateTimeAtCurrentTime(dateTimeZone60);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime81 = dateTime78.withPeriodAdded(readablePeriod79, 924);
        org.joda.time.DateTime.Property property82 = dateTime78.year();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(mutableInterval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1970 + "'", int59 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1439L + "'", long63 == 1439L);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:06" + "'", str73, "+00:06");
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "GMT+00:06");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 32770L + "'", long77 == 32770L);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(property82);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) (byte) 10);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMillis(8);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis(11);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime10 = timeOfDay9.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusSeconds(5);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay9.minusSeconds(199);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfDay(15);
        org.joda.time.LocalTime localTime22 = localTime20.withHourOfDay(0);
        org.joda.time.LocalTime.Property property23 = localTime22.millisOfDay();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.LocalTime localTime26 = property23.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime28 = property23.addCopy((long) (byte) -1);
        org.joda.time.LocalTime localTime29 = property23.roundHalfCeilingCopy();
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = property23.getAsShortText(locale30);
        java.util.Set<java.lang.Character> charSet34 = locale30.getExtensionKeys();
        java.util.Locale locale35 = locale30.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = timeOfDay9.toString("2022-02-23T01:43:44.089+18:22:23.405/2022-02-23T01:43:44.089+18:22:23.405", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str32, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "15" + "'", str33, "15");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime13 = property7.setCopy(442);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property7.setCopy("usa");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"usa\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(obj6, chronology7);
        org.joda.time.MutableInterval mutableInterval9 = interval8.toMutableInterval();
        org.joda.time.Chronology chronology10 = mutableInterval9.getChronology();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 0, chronology10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) -1, chronology10);
        org.joda.time.DurationField durationField13 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(360, (int) (byte) -1, (-459442052), 622, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str9 = dateTimeZone8.getID();
        java.lang.String str10 = dateTimeZone8.toString();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((-31536000007L), dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(250, 53, 129600000, 26586641, (-5908082), 0, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26586641 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) (byte) 10);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay2.plusMillis(10);
        org.joda.time.LocalTime localTime7 = timeOfDay6.toLocalTime();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.property(dateTimeFieldType12);
        org.joda.time.Period period15 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (short) 1);
        org.joda.time.Period period19 = period15.minusWeeks((int) (byte) 1);
        mutableDateTime10.add((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = period19.getPeriodType();
        org.joda.time.Seconds seconds22 = period19.toStandardSeconds();
        int int23 = period19.getHours();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1970, (int) 'a', 52, (int) 'a');
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj30, chronology31);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.Chronology chronology34 = mutableInterval33.getChronology();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 0, chronology34);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra(822);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        org.joda.time.MutableInterval mutableInterval42 = interval41.toMutableInterval();
        org.joda.time.Chronology chronology43 = mutableInterval42.getChronology();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTimeAtMidnight(dateTimeZone45);
        int int47 = dateTime46.getMinuteOfDay();
        int int48 = dateTime46.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime46.getZone();
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(dateTimeZone49);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        org.joda.time.MutableInterval mutableInterval55 = interval54.toMutableInterval();
        org.joda.time.Chronology chronology56 = mutableInterval55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 0, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.halfdayOfDay();
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay50.withChronologyRetainFields(chronology56);
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay50.plusYears(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(readableInstant62, readableInstant63, periodType64);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.years();
        mutablePeriod65.set(durationFieldType66, 2);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Interval interval72 = new org.joda.time.Interval(obj70, chronology71);
        org.joda.time.MutableInterval mutableInterval73 = interval72.toMutableInterval();
        org.joda.time.Chronology chronology74 = mutableInterval73.getChronology();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) (short) 0, chronology74);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = localDate75.toDateTimeAtMidnight(dateTimeZone76);
        int int78 = dateTime77.getMinuteOfDay();
        org.joda.time.Interval interval79 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod65, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(readableInstant80, readableInstant81, periodType82);
        org.joda.time.DurationFieldType durationFieldType84 = org.joda.time.DurationFieldType.years();
        mutablePeriod83.set(durationFieldType84, 2);
        int int87 = mutablePeriod65.indexOf(durationFieldType84);
        org.joda.time.YearMonthDay yearMonthDay89 = yearMonthDay50.withFieldAdded(durationFieldType84, 45);
        org.joda.time.LocalDate localDate91 = localDate37.withFieldAdded(durationFieldType84, 1);
        mutablePeriod28.add(durationFieldType84, 40);
        boolean boolean94 = period19.isSupported(durationFieldType84);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:06:00.013+00:06" + "'", str11, "1970-01-01T00:06:00.013+00:06");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(mutableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertNotNull(mutableInterval73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay89);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1969, periodType3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.minuteOfDay();
        mutableDateTime8.setSecondOfDay((int) (short) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.minuteOfHour();
        mutableDateTime8.addMonths((int) (byte) 10);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(obj20, chronology21);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Chronology chronology24 = mutableInterval23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.Interval interval28 = interval17.withStart((org.joda.time.ReadableInstant) dateTime27);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj30, chronology31);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.Chronology chronology34 = mutableInterval33.getChronology();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 0, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        boolean boolean38 = interval28.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant39, readableInstant40, periodType41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        mutablePeriod42.set(durationFieldType43, 2);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Interval interval49 = new org.joda.time.Interval(obj47, chronology48);
        org.joda.time.MutableInterval mutableInterval50 = interval49.toMutableInterval();
        org.joda.time.Chronology chronology51 = mutableInterval50.getChronology();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 0, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtMidnight(dateTimeZone53);
        int int55 = dateTime54.getMinuteOfDay();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod42, (org.joda.time.ReadableInstant) dateTime54);
        int int57 = dateTime54.getMinuteOfHour();
        int int58 = dateTime54.getMillisOfSecond();
        boolean boolean59 = interval28.equals((java.lang.Object) dateTime54);
        org.joda.time.Interval interval61 = interval28.withStartMillis((-1L));
        org.joda.time.Duration duration62 = interval61.toDuration();
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = mutableDateTime8.isBeforeNow();
        mutableDateTime8.setMillisOfDay(6);
        mutableDateTime8.addDays(53);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Interval interval74 = new org.joda.time.Interval(obj72, chronology73);
        org.joda.time.MutableInterval mutableInterval75 = interval74.toMutableInterval();
        org.joda.time.Chronology chronology76 = mutableInterval75.getChronology();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((long) (short) 0, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.halfdayOfDay();
        org.joda.time.DurationField durationField79 = chronology76.halfdays();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((long) 13, chronology76);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) 2, chronology76);
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(chronology76);
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime8, chronology76);
        mutablePeriod5.add(7L, chronology76);
        org.joda.time.YearMonthDay yearMonthDay85 = new org.joda.time.YearMonthDay(0L, chronology76);
        org.joda.time.DateTimeField dateTimeField86 = chronology76.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField87 = chronology76.weekOfWeekyear();
        boolean boolean89 = dateTimeField87.isLeap(86313600000L);
        long long91 = dateTimeField87.roundFloor(33437316L);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Years" + "'", str4, "Years");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(mutableInterval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(mutableInterval75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-259560000L) + "'", long91 == (-259560000L));
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        java.lang.Object obj0 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1439, 5, 52, 6, 0, 52, 11, (int) (short) 0);
        org.joda.time.Period period11 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType13 = period11.getFieldType((int) (short) 1);
        org.joda.time.Period period15 = period11.minusWeeks((int) (byte) 1);
        int int16 = period15.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        boolean boolean18 = period15.isSupported(durationFieldType17);
        int int19 = mutablePeriod9.indexOf(durationFieldType17);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = new org.joda.time.Interval(obj21, chronology22);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Chronology chronology25 = mutableInterval24.getChronology();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.halfdayOfDay();
        org.joda.time.DurationField durationField28 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField30 = durationFieldType17.getField(chronology25);
        org.joda.time.Chronology chronology31 = chronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.minuteOfHour();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(obj0, chronology31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.Period period37 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType39 = period37.getFieldType((int) (short) 1);
        org.joda.time.Period period41 = period37.minusWeeks((int) (byte) 1);
        int int42 = period41.getMillis();
        org.joda.time.Period period43 = period41.toPeriod();
        org.joda.time.LocalTime localTime44 = localTime35.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property46 = timeOfDay45.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType47.getDurationType();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay45.withFieldAdded(durationFieldType48, 2);
        org.joda.time.TimeOfDay.Property property51 = timeOfDay45.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay53 = property51.setCopy(7);
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property55 = timeOfDay54.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay56 = property55.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay56.minusSeconds(52);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay58.getFieldTypes();
        org.joda.time.TimeOfDay.Property property60 = timeOfDay58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField61 = property60.getField();
        org.joda.time.TimeOfDay timeOfDay62 = property60.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property60.getFieldType();
        org.joda.time.TimeOfDay.Property property64 = timeOfDay53.property(dateTimeFieldType63);
        org.joda.time.LocalTime.Property property65 = localTime35.property(dateTimeFieldType63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property66 = localDate33.property(dateTimeFieldType63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        int int3 = localTime2.size();
        org.joda.time.LocalTime.Property property4 = localTime2.minuteOfHour();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.LocalTime localTime8 = property4.addWrapFieldToCopy(359);
        org.joda.time.DurationField durationField9 = property4.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.Period period8 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period10 = period8.multipliedBy(0);
        org.joda.time.LocalTime localTime11 = localTime6.minus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period13 = period10.minusMillis(11);
        org.joda.time.Period period15 = period13.plusMonths(980);
        int int16 = period15.getDays();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        mutableDateTime10.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.year();
        mutableDateTime10.setHourOfDay(1);
        mutableDateTime10.setYear((int) '4');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.add(59626351);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime12 = property7.roundHalfCeilingCopy();
        org.joda.time.Period period14 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period16 = period14.withHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period19 = period14.withFieldAdded(durationFieldType17, (int) (byte) 10);
        org.joda.time.LocalTime localTime20 = localTime12.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property22 = localTime12.property(dateTimeFieldType21);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusHours((int) (byte) 10);
        int[] intArray26 = timeOfDay25.getValues();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMillis(8);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis(11);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay30.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay33 = property31.addNoWrapToCopy(64);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.withMinuteOfHour(4);
        boolean boolean36 = localTime12.equals((java.lang.Object) timeOfDay33);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = new org.joda.time.Interval(obj38, chronology39);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Chronology chronology42 = mutableInterval41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.millisOfSecond();
        org.joda.time.DurationField durationField44 = chronology42.weekyears();
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology42);
        org.joda.time.TimeOfDay.Property property46 = timeOfDay45.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay48 = property46.addWrapFieldToCopy(1980);
        org.joda.time.TimeOfDay timeOfDay50 = property46.addToCopy(1970);
        org.joda.time.TimeOfDay timeOfDay51 = property46.getTimeOfDay();
        int int52 = timeOfDay51.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone54);
        org.joda.time.LocalTime localTime57 = localTime55.withMillisOfDay(15);
        org.joda.time.LocalTime localTime59 = localTime57.withHourOfDay(0);
        org.joda.time.LocalTime.Property property60 = localTime59.millisOfDay();
        org.joda.time.LocalTime localTime61 = property60.getLocalTime();
        java.util.Locale.Category category62 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale65 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category62, locale65);
        int int68 = property60.getMaximumTextLength(locale65);
        org.joda.time.LocalTime localTime70 = property60.addCopy((long) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property60.getFieldType();
        org.joda.time.DateTimeField dateTimeField72 = property60.getField();
        org.joda.time.LocalTime localTime73 = property60.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime75 = property60.addCopy((-2033769600000L));
        boolean boolean76 = timeOfDay51.isEqual((org.joda.time.ReadablePartial) localTime75);
        org.joda.time.LocalTime localTime77 = localTime12.withFields((org.joda.time.ReadablePartial) localTime75);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mutableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + category62 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category62.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(localTime77);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        int int10 = dateTimeField8.getMaximumValue((long) 11);
        boolean boolean12 = dateTimeField8.isLeap((-1L));
        int int14 = dateTimeField8.getMaximumValue(0L);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Interval interval18 = new org.joda.time.Interval(obj16, chronology17);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Chronology chronology20 = mutableInterval19.getChronology();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTimeAtMidnight(dateTimeZone22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Interval interval27 = new org.joda.time.Interval(obj25, chronology26);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Chronology chronology29 = mutableInterval28.getChronology();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate21, (org.joda.time.ReadablePartial) localDate30, periodType36);
        org.joda.time.LocalDate.Property property38 = localDate21.era();
        int[] intArray39 = new int[] {};
        int int40 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate21, intArray39);
        org.joda.time.DateTime dateTime41 = localDate21.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime42 = localDate21.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight43 = localDate21.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(15);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight43.withZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((-1798568L), dateTimeZone45);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateMidnight46);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.minuteOfDay();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime0);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime6 = localTime3.withMillisOfDay(31);
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime10 = localTime6.minusSeconds(33079515);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology5.halfdays();
        long long14 = durationField11.getMillis(3372, 28799371L);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 145670400000L + "'", long14 == 145670400000L);
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        org.joda.time.Interval interval2 = new org.joda.time.Interval(0L, (long) 4);
        org.joda.time.DateTime dateTime3 = interval2.getStart();
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = interval2.abuts(readableInterval4);
        org.joda.time.DateTime dateTime6 = interval2.getStart();
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear(49);
        org.joda.time.LocalTime localTime9 = dateTime6.toLocalTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant6 = null;
        boolean boolean7 = interval4.isBefore(readableInstant6);
        org.joda.time.Chronology chronology8 = interval4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeField10.getAsShortText((long) 70, locale13);
        java.lang.String str15 = locale0.getDisplayCountry(locale13);
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleKeys();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("years", strMap18);
        java.util.Locale locale22 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags(languageRangeList19, (java.util.Collection<java.lang.String>) strSet23);
        java.lang.String[] strArray36 = new java.lang.String[] { "1970-01-01T00:00:00.013Z", "secondOfDay", "22", "1970", "hi!", "1970-01-01T00:00:00.013Z", "yearOfCentury", "2022-02-22T07:15:50.135Z/2022-02-22T07:15:50.135Z", "2022-02-22T07:15:51.387Z/2022-02-22T07:15:51.387Z", "", "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone40);
        org.joda.time.LocalTime localTime43 = localTime41.withMillisOfDay(15);
        org.joda.time.LocalTime localTime45 = localTime43.withHourOfDay(0);
        org.joda.time.LocalTime localTime47 = localTime43.withHourOfDay(0);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        int int49 = localTime47.getMillisOfSecond();
        org.joda.time.LocalTime localTime51 = localTime47.minusMinutes(10);
        boolean boolean52 = strSet37.remove((java.lang.Object) localTime51);
        java.lang.String[] strArray54 = new java.lang.String[] { "+00:00" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = strSet37.retainAll((java.util.Collection<java.lang.String>) strList55);
        boolean boolean58 = strSet23.retainAll((java.util.Collection<java.lang.String>) strSet37);
        int int59 = strSet37.size();
        boolean boolean60 = strSet16.retainAll((java.util.Collection<java.lang.String>) strSet37);
        int int61 = strSet16.size();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "70" + "'", str14, "70");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "United States" + "'", str15, "United States");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        mutableDateTime10.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.year();
        mutableDateTime10.setDayOfMonth(4);
        int int16 = mutableDateTime10.getDayOfMonth();
        int int17 = mutableDateTime10.getRoundingMode();
        mutableDateTime10.setMillisOfDay((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        mutableDateTime20.addMonths(86399999);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        mutableDateTime20.setZone(dateTimeZone23);
        mutableDateTime10.setZoneRetainFields(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant5 = null;
        boolean boolean6 = interval3.isBefore(readableInstant5);
        org.joda.time.Chronology chronology7 = interval3.getChronology();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.Period period10 = interval3.toPeriod(periodType8);
        org.joda.time.DateTime dateTime11 = interval3.getStart();
        boolean boolean13 = interval3.isAfter(1645514167441L);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 100, (long) (short) 100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        boolean boolean18 = interval16.contains(readableInstant17);
        boolean boolean19 = interval3.isBefore((org.joda.time.ReadableInterval) interval16);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(obj20, chronology21);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant24 = null;
        boolean boolean25 = interval22.isBefore(readableInstant24);
        org.joda.time.Chronology chronology26 = interval22.getChronology();
        org.joda.time.Interval interval27 = interval3.withChronology(chronology26);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 26291, chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone30);
        int int32 = localTime31.size();
        org.joda.time.LocalTime localTime34 = localTime31.minusMillis(26182);
        org.joda.time.LocalTime localTime36 = localTime31.minusHours(26458);
        int[] intArray37 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology26.validate((org.joda.time.ReadablePartial) localTime36, intArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        java.util.Date date5 = new java.util.Date(26502707, 26311, (-7200052), 994, 0);
        int int6 = date5.getHours();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromDateFields(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Aug 14 10:00:00 GMT+00:00 26487086");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate6.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfCeilingCopy();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval(obj12, chronology13);
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.Chronology chronology16 = mutableInterval15.getChronology();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate17.property(dateTimeFieldType22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Interval interval27 = new org.joda.time.Interval(obj25, chronology26);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Chronology chronology29 = mutableInterval28.getChronology();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.halfdayOfDay();
        int int33 = dateTimeField31.getMaximumValue((long) 11);
        boolean boolean35 = dateTimeField31.isLeap((-1L));
        boolean boolean36 = localDate17.equals((java.lang.Object) boolean35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.years();
        boolean boolean38 = localDate17.isSupported(durationFieldType37);
        org.joda.time.LocalDate localDate40 = localDate10.withFieldAdded(durationFieldType37, 26245);
        org.joda.time.LocalDate.Property property41 = localDate40.era();
        org.joda.time.LocalDate localDate43 = localDate40.minusYears(59442);
        org.joda.time.LocalDate.Property property44 = localDate40.weekyear();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.addWrapFieldToCopy(9);
        org.joda.time.LocalTime localTime5 = localTime3.minusHours(521);
        org.joda.time.LocalTime localTime7 = localTime3.minusMillis(26191);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property8.setCopy("1970-01-04T10:27:00.000+81:11:18.994");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-04T10:27:00.000+81:11:18.994\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy(822);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfDay();
        int int11 = localTime9.getHourOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("days", strMap1);
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getLanguage();
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("years", strMap16);
        java.util.Locale locale20 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags(languageRangeList17, (java.util.Collection<java.lang.String>) strSet21);
        java.lang.String[] strArray34 = new java.lang.String[] { "1970-01-01T00:00:00.013Z", "secondOfDay", "22", "1970", "hi!", "1970-01-01T00:00:00.013Z", "yearOfCentury", "2022-02-22T07:15:50.135Z/2022-02-22T07:15:50.135Z", "2022-02-22T07:15:51.387Z/2022-02-22T07:15:51.387Z", "", "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone38);
        org.joda.time.LocalTime localTime41 = localTime39.withMillisOfDay(15);
        org.joda.time.LocalTime localTime43 = localTime41.withHourOfDay(0);
        org.joda.time.LocalTime localTime45 = localTime41.withHourOfDay(0);
        org.joda.time.Chronology chronology46 = localTime45.getChronology();
        int int47 = localTime45.getMillisOfSecond();
        org.joda.time.LocalTime localTime49 = localTime45.minusMinutes(10);
        boolean boolean50 = strSet35.remove((java.lang.Object) localTime49);
        java.lang.String[] strArray52 = new java.lang.String[] { "+00:00" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strSet35.retainAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean56 = strSet21.retainAll((java.util.Collection<java.lang.String>) strSet35);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet21, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9, filteringMode57);
        org.joda.time.Period period61 = org.joda.time.Period.minutes(37);
        org.joda.time.Period period63 = period61.plusMillis(1439);
        org.joda.time.PeriodType periodType64 = period63.getPeriodType();
        boolean boolean65 = strSet9.remove((java.lang.Object) periodType64);
        strSet9.clear();
        java.util.stream.Stream<java.lang.String> strStream67 = strSet9.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strStream67);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("YearWeekDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=yearweekday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(15);
        org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(0);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(3542400000L, 35510400000L, chronology11);
        boolean boolean15 = interval13.isAfter(26332153L);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate15, periodType21);
        java.util.Date date23 = localDate6.toDate();
        date23.setSeconds(2);
        int int26 = date23.getMonth();
        int int27 = date23.getMonth();
        java.lang.String str28 = date23.toLocaleString();
        date23.setDate(0);
        int int31 = date23.getSeconds();
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromDateFields(date23);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 00:00:02 GMT+00:00 1969");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Jan 1, 1970 12:00:02 AM" + "'", str28, "Jan 1, 1970 12:00:02 AM");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay32);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusYears(6);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minus((long) 10);
        org.joda.time.DateMidnight.Property property59 = dateMidnight54.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight61 = property59.addToCopy((long) 70);
        org.joda.time.DateMidnight dateMidnight63 = property59.addToCopy((long) 3);
        org.joda.time.DateMidnight dateMidnight65 = property59.addToCopy(32772);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minus(1036801980L);
        org.joda.time.DateMidnight.Property property68 = dateMidnight67.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight69 = property68.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateMidnight69);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property9 = localTime8.hourOfDay();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("2022-02-22T07:15:47.976Z/2022-02-22T07:15:47.976Z");
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale11.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet16 = locale12.getExtensionKeys();
        java.lang.String str17 = property9.getAsShortText(locale12);
        java.lang.String str18 = locale12.getISO3Language();
        java.lang.String str19 = locale12.getDisplayVariant();
        java.util.Locale locale20 = locale12.stripExtensions();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str14, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMinuteOfDay();
        int int10 = dateTime8.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime8.getZone();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj14, chronology15);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.Chronology chronology18 = mutableInterval17.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.halfdayOfDay();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay12.withChronologyRetainFields(chronology18);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay12.dayOfMonth();
        int int23 = property22.get();
        org.joda.time.DurationField durationField24 = property22.getDurationField();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Interval interval53 = new org.joda.time.Interval(obj51, chronology52);
        org.joda.time.MutableInterval mutableInterval54 = interval53.toMutableInterval();
        org.joda.time.Chronology chronology55 = mutableInterval54.getChronology();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) (short) 0, chronology55);
        org.joda.time.DateTime dateTime57 = localDate56.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate59 = localDate56.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Interval interval62 = new org.joda.time.Interval(obj60, chronology61);
        org.joda.time.MutableInterval mutableInterval63 = interval62.toMutableInterval();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Interval interval67 = new org.joda.time.Interval(obj65, chronology66);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Chronology chronology69 = mutableInterval68.getChronology();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 0, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtMidnight(dateTimeZone71);
        org.joda.time.Interval interval73 = interval62.withStart((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime74 = localDate56.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        boolean boolean75 = localDate31.isEqual((org.joda.time.ReadablePartial) localDate56);
        org.joda.time.LocalDate.Property property76 = localDate56.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight79 = localDate56.toDateMidnight(dateTimeZone78);
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.plus(readableDuration80);
        int int82 = property22.compareTo((org.joda.time.ReadableInstant) dateMidnight81);
        org.joda.time.YearMonthDay yearMonthDay84 = property22.addToCopy((int) (byte) -1);
        int int85 = property22.getMinimumValueOverall();
        java.lang.String str86 = property22.getName();
        java.util.Locale locale87 = java.util.Locale.CHINA;
        boolean boolean88 = locale87.hasExtensions();
        java.lang.String str89 = property22.getAsShortText(locale87);
        org.joda.time.YearMonthDay yearMonthDay91 = property22.addToCopy(5);
        org.joda.time.DurationField durationField92 = property22.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay94 = property22.setCopy("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(mutableInterval63);
        org.junit.Assert.assertNotNull(mutableInterval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertNotNull(dateMidnight79);
        org.junit.Assert.assertNotNull(dateMidnight81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "dayOfMonth" + "'", str86, "dayOfMonth");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "22" + "'", str89, "22");
        org.junit.Assert.assertNotNull(yearMonthDay91);
        org.junit.Assert.assertNotNull(durationField92);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime6.minusHours((int) (byte) 0);
        org.joda.time.LocalTime localTime10 = localTime6.plusMinutes(100);
        org.joda.time.LocalTime localTime12 = localTime6.plusHours(172800);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds(66);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        org.joda.time.Period period1 = new org.joda.time.Period((-1627685448000L));
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, 2);
        org.joda.time.Period period14 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period16 = period14.multipliedBy(0);
        int int17 = period14.getMonths();
        org.joda.time.Period period19 = period14.plusYears(0);
        org.joda.time.Duration duration20 = period19.toStandardDuration();
        org.joda.time.Period period22 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = period22.getFieldType((int) (short) 1);
        org.joda.time.Period period26 = period22.minusWeeks((int) (byte) 1);
        int int27 = period26.getMillis();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.hours();
        boolean boolean29 = period26.isSupported(durationFieldType28);
        org.joda.time.Period period30 = period19.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.LocalTime localTime31 = localTime12.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = period30.getFieldTypes();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.forFields(durationFieldTypeArray32);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((-1645514451), 3372, 330, 790, 26273, (-52), 62263706, 26543, periodType33);
        org.joda.time.PeriodType periodType35 = periodType33.withSecondsRemoved();
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusHours((int) (byte) 10);
        int[] intArray43 = timeOfDay42.getValues();
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay42.minusMillis(8);
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minusMillis(11);
        org.joda.time.TimeOfDay.Property property48 = timeOfDay47.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay50 = property48.addNoWrapToCopy(64);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay50.plusHours(32769);
        org.joda.time.Chronology chronology53 = timeOfDay52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(18L, 25011702050000L, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(38090L, 910103041036801987L, chronology53);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 600, (long) 250, periodType33, chronology53);
        org.joda.time.DurationField durationField57 = chronology53.millis();
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(durationField57);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate6.property(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = property12.addToCopy(2000);
        org.joda.time.LocalDate localDate16 = localDate14.withYear(239385);
        org.joda.time.LocalDate localDate18 = localDate14.withDayOfYear(40);
        int int19 = localDate14.getWeekyear();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3970 + "'", int19 == 3970);
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category9, locale12);
        int int15 = property7.getMaximumTextLength(locale12);
        java.lang.String str16 = property7.getName();
        org.joda.time.LocalTime localTime17 = property7.roundFloorCopy();
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = property18.addCopy(18L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "millisOfDay" + "'", str16, "millisOfDay");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        int int5 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusHours(35);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("years", strMap1);
        java.util.Locale locale5 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6);
        java.lang.String[] strArray19 = new java.lang.String[] { "1970-01-01T00:00:00.013Z", "secondOfDay", "22", "1970", "hi!", "1970-01-01T00:00:00.013Z", "yearOfCentury", "2022-02-22T07:15:50.135Z/2022-02-22T07:15:50.135Z", "2022-02-22T07:15:51.387Z/2022-02-22T07:15:51.387Z", "", "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.withMillisOfDay(15);
        org.joda.time.LocalTime localTime28 = localTime26.withHourOfDay(0);
        org.joda.time.LocalTime localTime30 = localTime26.withHourOfDay(0);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        int int32 = localTime30.getMillisOfSecond();
        org.joda.time.LocalTime localTime34 = localTime30.minusMinutes(10);
        boolean boolean35 = strSet20.remove((java.lang.Object) localTime34);
        java.lang.String[] strArray37 = new java.lang.String[] { "+00:00" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strSet20.retainAll((java.util.Collection<java.lang.String>) strList38);
        boolean boolean41 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder44 = builder42.setVariant("months");
        java.util.Locale.Builder builder46 = builder42.setVariant("");
        java.util.Locale locale47 = java.util.Locale.TAIWAN;
        java.util.Locale locale48 = java.util.Locale.CHINA;
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.util.Locale.Builder builder50 = builder46.setLocale(locale47);
        boolean boolean51 = strSet20.contains((java.lang.Object) locale47);
        boolean boolean53 = strSet20.add("2022-02-22T07:18:59.043+00:00:00.007/2022-02-22T07:18:59.043+00:00:00.007");
        java.util.stream.Stream<java.lang.String> strStream54 = strSet20.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str49, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strStream54);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("months");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval(obj7, chronology8);
        org.joda.time.MutableInterval mutableInterval10 = interval9.toMutableInterval();
        org.joda.time.Chronology chronology11 = mutableInterval10.getChronology();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 0, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.halfdayOfDay();
        int int15 = dateTimeField13.getMaximumValue((long) 11);
        boolean boolean17 = dateTimeField13.isLeap((-1L));
        int int18 = dateTimeField13.getMaximumValue();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        int int22 = dateTimeField13.getMaximumShortTextLength(locale19);
        java.util.Locale locale23 = locale19.stripExtensions();
        java.util.Locale.Builder builder24 = builder5.setLocale(locale19);
        java.util.Locale locale25 = builder5.build();
        java.lang.String str26 = locale25.getISO3Language();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale25);
        java.time.Instant instant28 = calendar27.toInstant();
        int int29 = calendar27.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar27.clear((-625));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -625");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mutableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str21, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514742347,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=348,ZONE_OFFSET=1,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 53 + "'", int29 == 53);
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = localTime8.plusMinutes(1);
        int int12 = localTime8.size();
        org.joda.time.LocalTime.Property property13 = localTime8.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property13.addNoWrapToCopy(11722);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        int int3 = localTime2.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localTime2.getFields();
        org.joda.time.LocalTime localTime6 = localTime2.minusHours((int) '#');
        org.joda.time.DateTime dateTime7 = localTime2.toDateTimeToday();
        int int8 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMillis((int) (byte) 0);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '4', (long) '#');
        org.joda.time.DateTime dateTime15 = dateTime11.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTime dateTime17 = dateTime11.plusSeconds(6);
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        org.joda.time.DateTime dateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.minusHours(447);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(250);
        java.lang.String str13 = localTime12.toString();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "09:00:00.250" + "'", str13, "09:00:00.250");
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        int int1 = timeOfDay0.size();
        org.joda.time.LocalTime localTime2 = timeOfDay0.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.minusHours(66143405);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay0.minusMillis(29);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay6.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = property7.addNoWrapToCopy(9844);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category9, locale12);
        int int15 = property7.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime17 = property7.addCopy((long) 4);
        org.joda.time.DateTimeField dateTimeField18 = property7.getField();
        org.joda.time.LocalTime localTime20 = property7.addCopy(16);
        org.joda.time.LocalTime localTime22 = localTime20.minusHours(102);
        org.joda.time.LocalTime localTime24 = localTime20.minusSeconds((-518399));
        org.joda.time.LocalTime localTime26 = localTime20.plusHours(340);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("DateTimeField[millisOfSecond]");
        int int2 = timeZone1.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(true, 531);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 531");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime.Property property5 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(5);
        int int8 = property5.getMinimumValue();
        org.joda.time.LocalTime localTime9 = property5.getLocalTime();
        org.joda.time.LocalTime localTime10 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property5.roundFloorCopy();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval(obj12, chronology13);
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.DateTime dateTime16 = interval14.getEnd();
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) (byte) 10);
        boolean boolean19 = localTime11.equals((java.lang.Object) dateTime18);
        org.joda.time.LocalTime.Property property20 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(obj5, chronology6);
        org.joda.time.MutableInterval mutableInterval8 = interval7.toMutableInterval();
        org.joda.time.Chronology chronology9 = mutableInterval8.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.halfdayOfDay();
        org.joda.time.DurationField durationField12 = chronology9.halfdays();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 13, chronology9);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) ' ', chronology9);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfCentury();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateMidnight dateMidnight17 = org.joda.time.DateMidnight.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology9.getZone();
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 1, (long) 1974, chronology9);
        org.joda.time.Period period21 = period19.withYears(33070000);
        org.joda.time.Period period22 = period21.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days23 = period22.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime12 = property7.roundHalfCeilingCopy();
        org.joda.time.Period period14 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period16 = period14.withHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period19 = period14.withFieldAdded(durationFieldType17, (int) (byte) 10);
        org.joda.time.LocalTime localTime20 = localTime12.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute(0);
        org.joda.time.LocalTime.Property property23 = localTime20.millisOfDay();
        org.joda.time.LocalTime localTime24 = property23.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        long long29 = dateTimeZone26.previousTransition((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone26);
        java.lang.String str33 = dateTimeZone26.getShortName((long) 994);
        org.joda.time.DateTime dateTime34 = localTime24.toDateTimeToday(dateTimeZone26);
        org.joda.time.LocalTime.Property property35 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.withMinimumValue();
        org.joda.time.LocalTime localTime38 = property35.addCopy((long) (-1036830771));
        org.joda.time.LocalTime localTime39 = property35.withMaximumValue();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.015" + "'", str33, "+00:00:00.015");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1970);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusMillis(2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(15);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = property6.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = property6.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(15);
        org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(0);
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period12 = period10.multipliedBy(0);
        org.joda.time.LocalTime localTime13 = localTime8.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = period12.minusMillis(11);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay1.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withMinutesRemoved();
        org.joda.time.Period period21 = period15.normalizedStandard(periodType19);
        org.joda.time.Days days22 = period21.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = period21.minusSeconds((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 11, dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property7 = dateTime5.property(dateTimeFieldType6);
        org.joda.time.DateTime.Property property8 = dateTime5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime5.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long13 = dateTimeZone11.previousTransition((long) 'x');
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withZone(dateTimeZone9);
        boolean boolean18 = dateTimeZone9.isStandardOffset(1734938298911L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 120L + "'", long13 == 120L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 24L + "'", long15 == 24L);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusMillis((int) (short) -1);
        int int10 = localDateTime2.getWeekyear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.minus(readableDuration11);
        int int13 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) '#');
        int int18 = localDateTime17.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfDay(66143405);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay(15);
        org.joda.time.LocalTime localTime27 = localTime25.withHourOfDay(0);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale33 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category30, locale33);
        int int36 = property28.getMaximumTextLength(locale33);
        org.joda.time.LocalTime localTime38 = property28.addCopy((long) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property28.getFieldType();
        org.joda.time.LocalTime localTime41 = property28.addWrapFieldToCopy(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period42 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime20, (org.joda.time.ReadablePartial) localTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localTime41);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        int int51 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate localDate53 = localDate31.plusYears(10);
        org.joda.time.LocalDate.Property property54 = localDate53.era();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.lang.String str59 = property54.getAsText(locale57);
        boolean boolean60 = property54.isLeap();
        org.joda.time.LocalDate localDate61 = property54.getLocalDate();
        org.joda.time.LocalDate.Property property62 = localDate61.monthOfYear();
        org.joda.time.LocalDate.Property property63 = localDate61.dayOfYear();
        org.joda.time.LocalDate localDate65 = property63.setCopy(51);
        org.joda.time.DurationField durationField66 = property63.getDurationField();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str58, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u516c\u5143" + "'", str59, "\u516c\u5143");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(durationField66);
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 11, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = property4.addToCopy(60L);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMonths(32770);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(9);
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(100L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.minuteOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.secondOfMinute();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime20.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime27.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.minusMillis((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime27.minusDays(100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime27.minusMillis((int) (short) 0);
        org.joda.time.Period period40 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period42 = period40.multipliedBy(0);
        int int43 = period40.getMonths();
        org.joda.time.Period period45 = period40.plusYears(0);
        org.joda.time.Duration duration46 = period45.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration46, 11);
        mutableDateTime24.add((org.joda.time.ReadableDuration) duration46, 32770);
        org.joda.time.Duration duration51 = duration46.toDuration();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime18.plus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Period period53 = duration46.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.minuteOfHour();
        org.joda.time.LocalDateTime.Property property60 = localDateTime58.hourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusDays(7);
        int int64 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.withYear(34);
        boolean boolean67 = duration46.equals((java.lang.Object) 34);
        java.lang.String str68 = duration46.toString();
        org.joda.time.DateTime dateTime69 = dateTime11.minus((org.joda.time.ReadableDuration) duration46);
        int int70 = dateTime11.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT36000S" + "'", str68, "PT36000S");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 600026 + "'", int70 == 600026);
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay2 = property1.withMaximumValue();
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        int int4 = timeOfDay2.getHourOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.secondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        int int10 = localTime8.getMillisOfSecond();
        org.joda.time.LocalTime localTime12 = localTime8.minusMinutes(10);
        org.joda.time.LocalTime.Property property13 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.LocalTime localTime16 = property13.withMinimumValue();
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds(0);
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.Period period21 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType23 = period21.getFieldType((int) (short) 1);
        org.joda.time.Period period24 = period19.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = period24.plusMillis(100);
        org.joda.time.Period period28 = period24.minusDays(2022);
        org.joda.time.LocalTime localTime30 = localTime16.withPeriodAdded((org.joda.time.ReadablePeriod) period28, 26229);
        org.joda.time.Period period32 = period28.plusHours(805);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        java.util.Locale locale2 = new java.util.Locale("Feb", "");
        org.junit.Assert.assertEquals(locale2.toString(), "feb");
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.MutableInterval mutableInterval3 = interval2.toMutableInterval();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(obj5, chronology6);
        org.joda.time.MutableInterval mutableInterval8 = interval7.toMutableInterval();
        org.joda.time.Chronology chronology9 = mutableInterval8.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.Interval interval13 = interval2.withStart((org.joda.time.ReadableInstant) dateTime12);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        boolean boolean23 = interval13.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant24, readableInstant25, periodType26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        mutablePeriod27.set(durationFieldType28, 2);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Interval interval34 = new org.joda.time.Interval(obj32, chronology33);
        org.joda.time.MutableInterval mutableInterval35 = interval34.toMutableInterval();
        org.joda.time.Chronology chronology36 = mutableInterval35.getChronology();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtMidnight(dateTimeZone38);
        int int40 = dateTime39.getMinuteOfDay();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod27, (org.joda.time.ReadableInstant) dateTime39);
        int int42 = dateTime39.getMinuteOfHour();
        int int43 = dateTime39.getMillisOfSecond();
        boolean boolean44 = interval13.equals((java.lang.Object) dateTime39);
        org.joda.time.Interval interval46 = interval13.withStartMillis((-1L));
        long long47 = interval46.getStartMillis();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Interval interval50 = new org.joda.time.Interval(obj48, chronology49);
        org.joda.time.MutableInterval mutableInterval51 = interval50.toMutableInterval();
        boolean boolean53 = mutableInterval51.equals((java.lang.Object) 8);
        org.joda.time.Interval interval54 = interval46.overlap((org.joda.time.ReadableInterval) mutableInterval51);
        long long55 = mutableInterval51.toDurationMillis();
        org.joda.time.ReadableDuration readableDuration56 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Interval interval60 = new org.joda.time.Interval(obj58, chronology59);
        org.joda.time.MutableInterval mutableInterval61 = interval60.toMutableInterval();
        org.joda.time.Chronology chronology62 = mutableInterval61.getChronology();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) 0, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDate63.toDateTimeAtMidnight(dateTimeZone64);
        int int66 = dateTime65.getMinuteOfDay();
        int int67 = dateTime65.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime65.getZone();
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType70 = periodType69.withSecondsRemoved();
        java.lang.String str71 = periodType70.getName();
        org.joda.time.PeriodType periodType72 = periodType70.withSecondsRemoved();
        org.joda.time.Period period73 = new org.joda.time.Period(readableDuration56, (org.joda.time.ReadableInstant) dateTime65, periodType72);
        boolean boolean74 = mutableInterval51.isBefore((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime.Property property75 = dateTime65.centuryOfEra();
        org.joda.time.DateTime dateTime77 = property75.addWrapFieldToCopy(33);
        org.joda.time.DateTime.Property property78 = dateTime77.dayOfYear();
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertNotNull(mutableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(mutableInterval51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(interval54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(mutableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Years" + "'", str71, "Years");
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(property78);
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(22L);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay4.hourOfDay();
        org.joda.time.LocalTime localTime7 = localTime1.withFields((org.joda.time.ReadablePartial) timeOfDay4);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay4.minusMinutes(102);
        int int10 = timeOfDay4.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay4.plusMinutes(31);
        org.joda.time.Period period17 = new org.joda.time.Period(2022, 70, 1439, 53);
        org.joda.time.DurationFieldType[] durationFieldTypeArray18 = period17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay12.plus((org.joda.time.ReadablePeriod) period17);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusMillis((int) (short) -1);
        int int10 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withDayOfYear(53);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withWeekyear(2000);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime2.withMillisOfDay(51);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime2.plusWeeks(22);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime2.plusMinutes(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.property(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusSeconds(16);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.plusWeeks((int) '4');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withSecondOfMinute((int) (byte) 10);
        int int42 = localDateTime41.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = property43.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withHourOfDay(10);
        int int47 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.Chronology chronology48 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(1672876800000L, chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.halfdayOfDay();
        org.joda.time.DurationField durationField52 = chronology48.halfdays();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType21.getField(chronology48);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "clockhourOfDay" + "'", str22, "clockhourOfDay");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "clockhourOfDay" + "'", str24, "clockhourOfDay");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 25 + "'", int42 == 25);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category9, locale12);
        int int15 = property7.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime17 = property7.addCopy((long) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property7.getFieldType();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor4 = strSet3.iterator();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusWeeks((int) (byte) -1);
        boolean boolean16 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        boolean boolean17 = strSet3.remove((java.lang.Object) localDateTime11);
        java.util.Spliterator<java.lang.String> strSpliterator18 = strSet3.spliterator();
        int int19 = strSet3.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = strSet3.spliterator();
        java.lang.Object[] objArray21 = strSet3.toArray();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet3.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream23 = strSet3.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream24 = strSet3.stream();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(strStream24);
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(15);
        org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(0);
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period12 = period10.multipliedBy(0);
        org.joda.time.LocalTime localTime13 = localTime8.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = period12.minusMillis(11);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay1.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withMillisOfSecond((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = timeOfDay18.toDateTimeToday(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.minusMillis(26305);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay18.plusMinutes(780);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusYears(6);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minus((long) 10);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withDayOfMonth(31);
        org.joda.time.DateMidnight.Property property61 = dateMidnight60.era();
        org.joda.time.DateTimeField dateTimeField62 = property61.getField();
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.lang.String str65 = property61.getAsText(locale64);
        org.joda.time.DateMidnight dateMidnight66 = property61.roundCeilingCopy();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u897f\u66a6" + "'", str65, "\u897f\u66a6");
        org.junit.Assert.assertNotNull(dateMidnight66);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime.Property property5 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(5);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property9.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay12 = property9.addToCopy(52);
        org.joda.time.TimeOfDay timeOfDay13 = property9.withMinimumValue();
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) timeOfDay13);
        int int15 = localTime7.getHourOfDay();
        org.joda.time.LocalTime.Property property16 = localTime7.secondOfMinute();
        org.joda.time.LocalTime.Property property17 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime18 = property17.roundCeilingCopy();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = new org.joda.time.Interval(obj21, chronology22);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Chronology chronology25 = mutableInterval24.getChronology();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        int int29 = dateTime28.getMinuteOfDay();
        int int30 = dateTime28.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime28.getZone();
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone31);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval(obj34, chronology35);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Chronology chronology38 = mutableInterval37.getChronology();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.halfdayOfDay();
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay32.withChronologyRetainFields(chronology38);
        org.joda.time.YearMonthDay.Property property42 = yearMonthDay32.dayOfMonth();
        java.lang.String str43 = property42.getAsText();
        java.util.Locale locale46 = new java.util.Locale("hi!", "");
        java.util.Locale locale49 = new java.util.Locale("hi!", "");
        java.lang.String str50 = locale49.getISO3Country();
        java.lang.String str51 = locale46.getDisplayCountry(locale49);
        java.util.Locale.setDefault(locale46);
        java.lang.String str53 = property42.getAsText(locale46);
        java.lang.String str54 = locale46.getDisplayLanguage();
        java.lang.String str55 = locale46.getDisplayName();
        java.util.Locale locale59 = new java.util.Locale("1970-01-05T00:00:00.000", "", "2022-02-22T07:18:21.139+00:00:00.007/2022-02-22T07:18:21.139+00:00:00.007");
        java.lang.String str60 = locale46.getDisplayName(locale59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime61 = property17.setCopy("clockhourOfHalfday", locale59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"clockhourOfHalfday\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "22" + "'", str43, "22");
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "22" + "'", str53, "22");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals(locale59.toString(), "1970-01-05t00:00:00.000__2022-02-22T07:18:21.139+00:00:00.007/2022-02-22T07:18:21.139+00:00:00.007");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = localTime8.plusMinutes(1);
        org.joda.time.LocalTime localTime13 = localTime8.plusMillis(0);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond(822);
        org.joda.time.LocalTime.Property property16 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        org.joda.time.Period period1 = org.joda.time.Period.millis(300);
        org.joda.time.Period period3 = period1.minusSeconds(99);
        org.joda.time.Period period5 = period1.plusMonths(26441);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(226126107L);
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        int int18 = dateTime15.getMinuteOfHour();
        org.joda.time.DateTime.Property property19 = dateTime15.centuryOfEra();
        int int20 = property19.get();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        int int23 = dateTimeField21.getMinimumValue((long) 15);
        java.util.Locale locale24 = java.util.Locale.US;
        int int25 = dateTimeField21.getMaximumShortTextLength(locale24);
        java.util.Locale locale26 = locale24.stripExtensions();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        int int2 = mutableDateTime1.getSecondOfDay();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) 27);
        org.joda.time.LocalDate localDate5 = dateMidnight4.toLocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfDay();
        mutableDateTime1.setChronology(chronology6);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(obj9, chronology10);
        org.joda.time.Interval interval12 = interval11.toInterval();
        org.joda.time.DateTime dateTime13 = interval11.getEnd();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj14, chronology15);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant18 = null;
        boolean boolean19 = interval16.isBefore(readableInstant18);
        org.joda.time.Chronology chronology20 = interval16.getChronology();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableInstant23, readableInstant24, periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 7, (-1L), periodType25);
        org.joda.time.format.PeriodFormatter periodFormatter28 = null;
        java.lang.String str29 = mutablePeriod27.toString(periodFormatter28);
        org.joda.time.Interval interval30 = interval16.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTime dateTime31 = dateTime13.minus((org.joda.time.ReadablePeriod) mutablePeriod27);
        java.lang.String str32 = mutablePeriod27.toString();
        int int33 = mutablePeriod27.getYears();
        int[] intArray34 = mutablePeriod27.getValues();
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod27, 2720);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26743 + "'", int2 == 26743);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P0Y" + "'", str29, "P0Y");
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "P0Y" + "'", str32, "P0Y");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0]");
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 11, dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(dateTimeZone1);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.minusMillis(1969);
        org.joda.time.LocalTime localTime7 = timeOfDay6.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.plusMillis(28);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 100);
        int int12 = dateTime11.getYear();
        int int13 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime16 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours(43);
        org.joda.time.DateTime dateTime20 = dateTime18.withMillis((long) (-2021));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (byte) 1);
        org.joda.time.DateTime dateTime2 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1970, (int) 'a', 52, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period12 = period10.withHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period15 = period10.withFieldAdded(durationFieldType13, (int) (byte) 10);
        org.joda.time.Period period17 = period10.withWeeks(86399999);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay1.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.minusYears(70);
        java.lang.String str21 = yearMonthDay18.toString();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusSeconds(16);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.plusWeeks((int) '4');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusYears(18);
        int int14 = localDateTime13.getDayOfMonth();
        int int15 = localDateTime13.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfDay(15);
        org.joda.time.LocalTime localTime22 = localTime20.withHourOfDay(0);
        org.joda.time.LocalTime.Property property23 = localTime22.millisOfDay();
        org.joda.time.LocalTime localTime24 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        org.joda.time.LocalTime localTime27 = property23.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime28 = property23.roundHalfCeilingCopy();
        org.joda.time.Period period30 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period32 = period30.withHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period35 = period30.withFieldAdded(durationFieldType33, (int) (byte) 10);
        org.joda.time.LocalTime localTime36 = localTime28.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.LocalTime localTime38 = localTime36.withSecondOfMinute(0);
        org.joda.time.LocalTime.Property property39 = localTime38.minuteOfHour();
        java.lang.String str40 = localTime38.toString();
        int int41 = localTime38.size();
        org.joda.time.LocalTime.Property property42 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property42.addWrapFieldToCopy((-518399999));
        // The following exception was thrown during execution in test generation
        try {
            int int45 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10:00:00.015" + "'", str40, "10:00:00.015");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime44);
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period3 = period1.multipliedBy(0);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period1.indexOf(durationFieldType4);
        org.joda.time.Period period7 = period1.minusMinutes((int) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter13.getZone();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.dayOfMonth();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusHours((int) (byte) 10);
        int[] intArray21 = timeOfDay20.getValues();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMillis(8);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis(11);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay27 = property26.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone29);
        int int31 = localTime30.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray32 = localTime30.getFields();
        org.joda.time.LocalTime localTime34 = localTime30.minusHours((int) '#');
        org.joda.time.DateTime dateTime35 = localTime30.toDateTimeToday();
        int int36 = dateTime35.getMinuteOfDay();
        org.joda.time.DateTime.Property property37 = dateTime35.centuryOfEra();
        org.joda.time.DateTime dateTime39 = dateTime35.minusMillis((int) (byte) 0);
        org.joda.time.Period period42 = new org.joda.time.Period((long) '4', (long) '#');
        org.joda.time.DateTime dateTime43 = dateTime39.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime44 = dateTime43.withTimeAtStartOfDay();
        boolean boolean45 = property26.equals((java.lang.Object) dateTime43);
        org.joda.time.DateTime dateTime47 = dateTime43.plusMonths(521);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableInstant) dateTime47, periodType48);
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period7, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime52 = dateTime47.minusDays((-13));
        int int53 = dateTime47.getYear();
        org.joda.time.DateTime dateTime54 = dateTime47.toDateTime();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2065 + "'", int53 == 2065);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.property(dateTimeFieldType12);
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        int int15 = mutableDateTime14.getSecondOfDay();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        mutablePeriod19.set(durationFieldType20, 2);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(obj24, chronology25);
        org.joda.time.MutableInterval mutableInterval27 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology28 = mutableInterval27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod19, (org.joda.time.ReadableInstant) dateTime31);
        int int34 = dateTime31.getMinuteOfHour();
        org.joda.time.DateTime.Property property35 = dateTime31.centuryOfEra();
        int int36 = dateTime31.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime31.toMutableDateTime();
        org.joda.time.Period period39 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period41 = period39.multipliedBy(0);
        org.joda.time.DateTime dateTime43 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) period39, 2);
        org.joda.time.DateTime dateTime45 = dateTime43.withDayOfYear(24);
        boolean boolean46 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property47 = dateTime45.minuteOfHour();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.028+00:00:00.015" + "'", str11, "1970-01-01T00:00:00.028+00:00:00.015");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        java.util.Date date3 = new java.util.Date((int) 'a', 0, (int) (short) 1);
        date3.setMinutes(822);
        int int6 = date3.getMonth();
        date3.setSeconds(114876);
        java.util.Date date12 = new java.util.Date((-518399999), (int) (short) -1, 16);
        int int13 = date12.getSeconds();
        java.lang.String str14 = date12.toLocaleString();
        date12.setSeconds(837);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromDateFields(date12);
        int int18 = date3.compareTo(date12);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 02 21:36:36 GMT 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 06 14:38:57 GMT 66145305");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Apr 6, 66145305 2:25:51 PM" + "'", str14, "Apr 6, 66145305 2:25:51 PM");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.era();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) 10, dateTimeZone11);
        org.joda.time.Chronology chronology13 = chronology5.withZone(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime14.setMillisOfDay(694);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1439, 5, 52, 6, 0, 52, 11, (int) (short) 0);
        org.joda.time.Period period27 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period29 = period27.multipliedBy(0);
        int int30 = period27.getMonths();
        org.joda.time.Period period32 = period27.plusYears(0);
        org.joda.time.Duration duration33 = period32.toStandardDuration();
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod25.setPeriod((org.joda.time.ReadableDuration) duration33, chronology34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval(obj37, chronology38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Chronology chronology41 = mutableInterval40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.DateTime dateTime43 = localDate42.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfMinute();
        int int45 = property44.getMinimumValueOverall();
        org.joda.time.DateTime dateTime46 = property44.roundHalfEvenCopy();
        int int47 = dateTime46.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int49 = dateTime46.get(dateTimeFieldType48);
        org.joda.time.DateTime dateTime51 = dateTime46.plusSeconds((int) '4');
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime51);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration33, 9775);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = localTime8.plusMinutes(1);
        org.joda.time.LocalTime localTime13 = localTime8.plusMillis(0);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond(822);
        org.joda.time.LocalTime localTime17 = localTime15.minusMillis((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime15.plus(readablePeriod18);
        org.joda.time.LocalTime localTime21 = localTime15.plusMinutes(555);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField23 = localTime15.getField(59509);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59509");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 51);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getWeekYear();
        calendar3.clear();
        calendar3.setFirstDayOfWeek(2);
        java.lang.String[] strArray19 = new java.lang.String[] { "1970-01-01T00:00:00.013Z", "secondOfDay", "22", "1970", "hi!", "1970-01-01T00:00:00.013Z", "yearOfCentury", "2022-02-22T07:15:50.135Z/2022-02-22T07:15:50.135Z", "2022-02-22T07:15:51.387Z/2022-02-22T07:15:51.387Z", "", "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.withMillisOfDay(15);
        org.joda.time.LocalTime localTime28 = localTime26.withHourOfDay(0);
        org.joda.time.LocalTime localTime30 = localTime26.withHourOfDay(0);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        int int32 = localTime30.getMillisOfSecond();
        org.joda.time.LocalTime localTime34 = localTime30.minusMinutes(10);
        boolean boolean35 = strSet20.remove((java.lang.Object) localTime34);
        boolean boolean36 = calendar3.before((java.lang.Object) localTime34);
        calendar3.set(1310773, 86414, 36660004);
        int int41 = calendar3.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=?,YEAR=1310773,MONTH=86414,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=36660004,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 2);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay0.millisOfSecond();
        int int7 = timeOfDay0.getSecondOfMinute();
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay0.plusSeconds((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay0.minusMillis(64800000);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(59, 15, 32770);
        java.util.Calendar.Builder builder8 = builder4.setDate((int) ' ', 32769, 292278993);
        java.util.Calendar.Builder builder12 = builder8.setWeekDate(22, 26182, (-1645514236));
        java.util.Calendar.Builder builder16 = builder12.setWeekDate(34, 17, 365);
        java.util.Calendar.Builder builder21 = builder12.setTimeOfDay(48, 2067, 98, 415);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.centuries();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.halfdayOfDay();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        org.joda.time.Period period1 = org.joda.time.Period.hours(3156923);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 13, chronology8);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 2, chronology8);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.clockhourOfDay();
        org.joda.time.Period period17 = new org.joda.time.Period(1645514158747L, chronology8);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        boolean boolean19 = period17.isSupported(durationFieldType18);
        org.joda.time.Period period21 = period17.minusHours((int) (short) 10);
        org.joda.time.Period period23 = period21.plusHours(26354);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
        java.util.Locale locale1 = new java.util.Locale("years");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage(locale3);
        java.lang.String str6 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "years");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str4, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "years" + "'", str5, "years");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) (byte) 10);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMillis(8);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis(11);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(64);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withMinuteOfHour(4);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay10.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay10.withMillisOfSecond(906);
        org.joda.time.LocalTime localTime16 = timeOfDay10.toLocalTime();
        int int17 = timeOfDay10.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = timeOfDay10.getField(979);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 979");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[14, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category9, locale12);
        int int15 = property7.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime17 = property7.addCopy((long) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property7.getFieldType();
        org.joda.time.DateTimeField dateTimeField19 = property7.getField();
        org.joda.time.LocalTime localTime20 = property7.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime22 = property7.addCopy(33);
        org.joda.time.LocalTime localTime23 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime24 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.LocalDate localDate56 = localDate31.plusDays((int) '4');
        int int57 = localDate56.getCenturyOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str59 = dateTimeFieldType58.toString();
        org.joda.time.LocalDate.Property property60 = localDate56.property(dateTimeFieldType58);
        org.joda.time.LocalDate localDate61 = property60.withMinimumValue();
        org.joda.time.LocalDate localDate62 = property60.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 19 + "'", int57 == 19);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "dayOfMonth" + "'", str59, "dayOfMonth");
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(localDate62);
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = localTime8.plusMinutes(1);
        org.joda.time.LocalTime localTime13 = localTime8.plusMillis(0);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond(822);
        org.joda.time.LocalTime localTime17 = localTime13.withSecondOfMinute(3);
        org.joda.time.LocalTime localTime19 = localTime13.minusMinutes(31);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(10022, (int) (byte) 10, 20, 7);
        org.joda.time.LocalTime localTime25 = localTime19.minus((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone27);
        int int29 = localTime28.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localTime28.getFields();
        org.joda.time.LocalTime localTime32 = localTime28.minusHours((int) '#');
        int int33 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime35 = localTime32.minusMillis(241200000);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.MutableInterval mutableInterval3 = interval2.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = interval2.isBefore(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        mutablePeriod9.set(durationFieldType10, 2);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj14, chronology15);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.Chronology chronology18 = mutableInterval17.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        int int22 = dateTime21.getMinuteOfDay();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod9, (org.joda.time.ReadableInstant) dateTime21);
        int int24 = dateTime21.getMinuteOfHour();
        int int25 = dateTime21.getMillisOfSecond();
        boolean boolean26 = interval2.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property27 = dateTime21.secondOfMinute();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval(obj31, chronology32);
        org.joda.time.MutableInterval mutableInterval34 = interval33.toMutableInterval();
        org.joda.time.Chronology chronology35 = mutableInterval34.getChronology();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.halfdayOfDay();
        org.joda.time.DurationField durationField38 = chronology35.halfdays();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 13, chronology35);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) ' ', chronology35);
        org.joda.time.DateTimeField dateTimeField41 = chronology35.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = chronology35.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology35);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Interval interval47 = new org.joda.time.Interval(obj45, chronology46);
        org.joda.time.MutableInterval mutableInterval48 = interval47.toMutableInterval();
        org.joda.time.Chronology chronology49 = mutableInterval48.getChronology();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtMidnight(dateTimeZone51);
        int int53 = dateTime52.getMinuteOfDay();
        int int54 = dateTime52.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime52.getZone();
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.Chronology chronology58 = chronology35.withZone(dateTimeZone55);
        org.joda.time.DateTime dateTime59 = dateTime21.toDateTime(dateTimeZone55);
        org.joda.time.tz.NameProvider nameProvider61 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.lang.String str65 = nameProvider61.getShortName(locale62, "months", "months");
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str69 = nameProvider61.getShortName(locale66, "2022-02-22T07:15:51.387Z/2022-02-22T07:15:51.387Z", "1970-01-01T00:00:00.020+00:00:00.007");
        java.lang.String str70 = dateTimeZone55.getName((long) 600, locale66);
        java.util.Locale locale71 = locale66.stripExtensions();
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(mutableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(nameProvider61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_CA");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00:00.015" + "'", str70, "+00:00:00.015");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_CA");
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = property7.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime12 = property7.addCopy((long) (byte) -1);
        org.joda.time.LocalTime localTime13 = property7.roundHalfCeilingCopy();
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = property7.getAsShortText(locale14);
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.util.Locale locale19 = locale14.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale19.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str16, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "15" + "'", str17, "15");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.MutableInterval mutableInterval3 = interval2.toMutableInterval();
        org.joda.time.Chronology chronology4 = mutableInterval3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology4.halfdays();
        org.joda.time.DurationField durationField7 = chronology4.weeks();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone11);
        int int13 = localTime12.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localTime12.getFields();
        org.joda.time.LocalTime localTime16 = localTime12.withMillisOfSecond(13);
        org.joda.time.LocalTime.Property property17 = localTime16.minuteOfHour();
        org.joda.time.LocalTime localTime19 = property17.addCopy(3);
        org.joda.time.DateTimeField dateTimeField20 = property17.getField();
        java.util.Locale locale25 = new java.util.Locale("", "\u516c\u5143", "2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007");
        java.lang.String str26 = dateTimeField20.getAsShortText(1439, locale25);
        java.util.Locale locale29 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet31 = locale29.getExtensionKeys();
        java.lang.String str32 = locale25.getDisplayName(locale29);
        java.lang.String str33 = dateTimeField8.getAsText(1645574400000L, locale25);
        java.lang.String str34 = locale25.getDisplayVariant();
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u516c\u5143_2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1439" + "'", str26, "1439");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u516c\u5143 (2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007)" + "'", str32, "\u516c\u5143 (2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "12" + "'", str33, "12");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007" + "'", str34, "2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007");
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.setSecondOfDay((int) (short) 10);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.addMonths((int) (byte) 10);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Interval interval15 = new org.joda.time.Interval(obj13, chronology14);
        org.joda.time.MutableInterval mutableInterval16 = interval15.toMutableInterval();
        org.joda.time.Chronology chronology17 = mutableInterval16.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.Interval interval21 = interval10.withStart((org.joda.time.ReadableInstant) dateTime20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        org.joda.time.MutableInterval mutableInterval26 = interval25.toMutableInterval();
        org.joda.time.Chronology chronology27 = mutableInterval26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        boolean boolean31 = interval21.isBefore((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant32, readableInstant33, periodType34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.years();
        mutablePeriod35.set(durationFieldType36, 2);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        int int48 = dateTime47.getMinuteOfDay();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod35, (org.joda.time.ReadableInstant) dateTime47);
        int int50 = dateTime47.getMinuteOfHour();
        int int51 = dateTime47.getMillisOfSecond();
        boolean boolean52 = interval21.equals((java.lang.Object) dateTime47);
        org.joda.time.Interval interval54 = interval21.withStartMillis((-1L));
        org.joda.time.Duration duration55 = interval54.toDuration();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = mutableDateTime1.isBeforeNow();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.set(28);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime63 = property61.add((long) 59);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Interval interval67 = new org.joda.time.Interval(obj65, chronology66);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Chronology chronology69 = mutableInterval68.getChronology();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 0, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.halfdayOfDay();
        int int73 = dateTimeField71.getMaximumValue((long) 11);
        boolean boolean75 = dateTimeField71.isLeap((-1L));
        int int76 = dateTimeField71.getMaximumValue();
        java.util.Locale locale77 = java.util.Locale.TAIWAN;
        java.util.Locale locale78 = java.util.Locale.CHINA;
        java.lang.String str79 = locale77.getDisplayCountry(locale78);
        int int80 = dateTimeField71.getMaximumShortTextLength(locale77);
        java.util.Locale locale82 = java.util.Locale.ENGLISH;
        java.util.Locale locale86 = new java.util.Locale("", "\u516c\u5143", "2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007");
        java.lang.String str87 = locale86.getScript();
        java.lang.String str88 = locale86.getScript();
        java.lang.String str89 = locale82.getDisplayLanguage(locale86);
        java.lang.String str90 = dateTimeField71.getAsShortText((long) 35, locale86);
        mutableDateTime63.setRounding(dateTimeField71);
        mutableDateTime63.setMillis(31449600000L);
        mutableDateTime63.addDays(1102);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(mutableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(mutableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(mutableInterval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str79, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en");
// flaky:         org.junit.Assert.assertEquals(locale86.toString(), "\u516c\u5143_2022-02-22T07:15:57.666+00:00:00.007/2022-02-22T07:15:57.666+00:00:00.007");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "English" + "'", str89, "English");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "AM" + "'", str90, "AM");
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("1970-01-01T00:00:00.000+18:22:23.405");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.000+18:22:23.405\" is malformed at \"70-01-01T00:00:00.000+18:22:23.405\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime2.plusSeconds(15);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 51);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone7);
        int int11 = calendar10.getWeekYear();
        calendar10.roll((int) (short) 0, false);
        int int15 = calendar10.getMinimalDaysInFirstWeek();
        calendar10.setLenient(true);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromCalendarFields(calendar10);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.plusMillis(17);
        int int21 = localTime2.compareTo((org.joda.time.ReadablePartial) timeOfDay18);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay18.minusMinutes(32772);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay18.secondOfMinute();
        int int25 = property24.get();
        org.joda.time.TimeOfDay timeOfDay26 = property24.getTimeOfDay();
        int int27 = property24.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-125940760455286,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=714,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 44 + "'", int25 == 44);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(obj3, chronology4);
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        org.joda.time.Chronology chronology7 = mutableInterval6.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.halfdayOfDay();
        org.joda.time.DurationField durationField10 = chronology7.halfdays();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 13, chronology7);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 2, chronology7);
        org.joda.time.Period period14 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period16 = period14.multipliedBy(0);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period19 = period14.withFieldAdded(durationFieldType17, 2);
        boolean boolean20 = mutablePeriod12.isSupported(durationFieldType17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(obj24, chronology25);
        org.joda.time.MutableInterval mutableInterval27 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology28 = mutableInterval27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        int int32 = dateTime31.getMinuteOfDay();
        int int33 = dateTime31.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime31.getZone();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        java.lang.String str37 = periodType36.getName();
        org.joda.time.PeriodType periodType38 = periodType36.withSecondsRemoved();
        org.joda.time.Period period39 = new org.joda.time.Period(readableDuration22, (org.joda.time.ReadableInstant) dateTime31, periodType38);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Interval interval43 = new org.joda.time.Interval(obj41, chronology42);
        org.joda.time.MutableInterval mutableInterval44 = interval43.toMutableInterval();
        org.joda.time.Chronology chronology45 = mutableInterval44.getChronology();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.halfdayOfDay();
        org.joda.time.DurationField durationField48 = chronology45.halfdays();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.yearOfCentury();
        org.joda.time.DateTime dateTime50 = dateTime31.toDateTime(chronology45);
        org.joda.time.Period period51 = new org.joda.time.Period();
        org.joda.time.Period period53 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType55 = period53.getFieldType((int) (short) 1);
        org.joda.time.Period period56 = period51.minus((org.joda.time.ReadablePeriod) period53);
        int[] intArray59 = chronology45.get((org.joda.time.ReadablePeriod) period56, (long) 17, (long) 6);
        mutablePeriod12.setPeriod(readableDuration21, chronology45);
        org.joda.time.DurationField durationField61 = chronology45.halfdays();
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateTimeZone dateTimeZone63 = dateMidnight62.getZone();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight62.plus((long) 50400000);
        boolean boolean66 = dateMidnight65.isEqualNow();
        org.joda.time.Period period75 = new org.joda.time.Period(13, 1969, 0, 32770, 32772, 1969, 100, 3);
        java.lang.Object obj78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Interval interval80 = new org.joda.time.Interval(obj78, chronology79);
        org.joda.time.MutableInterval mutableInterval81 = interval80.toMutableInterval();
        org.joda.time.Chronology chronology82 = mutableInterval81.getChronology();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((long) (short) 0, chronology82);
        org.joda.time.DateTimeField dateTimeField84 = chronology82.halfdayOfDay();
        org.joda.time.DurationField durationField85 = chronology82.halfdays();
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime((long) 13, chronology82);
        java.lang.String str87 = mutableDateTime86.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime86.property(dateTimeFieldType88);
        org.joda.time.Duration duration90 = period75.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime86);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime86.millisOfDay();
        org.joda.time.Chronology chronology92 = mutableDateTime86.getChronology();
        org.joda.time.DateTimeField dateTimeField93 = chronology92.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField94 = chronology92.millisOfDay();
        org.joda.time.DateTimeField dateTimeField95 = chronology92.clockhourOfHalfday();
        org.joda.time.DateMidnight dateMidnight96 = dateMidnight65.withChronology(chronology92);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Years" + "'", str37, "Years");
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, -11]");
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(mutableInterval81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(durationField85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1970-01-01T00:00:00.028+00:00:00.015" + "'", str87, "1970-01-01T00:00:00.028+00:00:00.015");
        org.junit.Assert.assertNotNull(dateTimeFieldType88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(duration90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(chronology92);
        org.junit.Assert.assertNotNull(dateTimeField93);
        org.junit.Assert.assertNotNull(dateTimeField94);
        org.junit.Assert.assertNotNull(dateTimeField95);
        org.junit.Assert.assertNotNull(dateMidnight96);
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime2.plusSeconds(15);
        int int7 = localTime2.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime2.toString("PT1645514589.909S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25 + "'", int7 == 25);
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfDay();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 1969, chronology5);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds(11722);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        java.lang.String str6 = property5.getAsShortText();
        java.util.Locale locale10 = new java.util.Locale("Jan 1, 1970 12:00:00 AM", "1970", "\u53f0\u6e7e\u5730\u533a");
        int int11 = property5.getMaximumTextLength(locale10);
        java.util.Locale locale14 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.lang.String str16 = locale10.getDisplayVariant(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale10.getUnicodeLocaleType("2075-02-15T07:20:15.833+81:11:18.994");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2075-02-15T07:20:15.833+81:11:18.994");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str16, "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate6.property(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate6.withYear(6);
        org.joda.time.LocalDate.Property property15 = localDate6.monthOfYear();
        int int16 = localDate6.getEra();
        java.util.Date date17 = localDate6.toDate();
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        org.joda.time.DateMidnight dateMidnight19 = localDate18.toDateMidnight();
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category9, locale12);
        int int15 = property7.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime17 = property7.addCopy((long) 4);
        org.joda.time.LocalTime localTime18 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime20 = localTime18.plusMinutes(292278994);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(147);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(130);
        org.junit.Assert.assertNotNull(strArray1);
    }
}
