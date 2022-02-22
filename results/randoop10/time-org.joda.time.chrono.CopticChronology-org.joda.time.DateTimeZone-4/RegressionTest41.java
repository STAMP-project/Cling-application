import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeeksInWeekYear();
        calendar0.add((int) (short) 0, (int) (short) 1);
        calendar0.clear();
        calendar0.clear((int) (byte) 1);
        int int8 = calendar0.getWeekYear();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int10 = localDateTime9.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime9.getValue(818);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 818");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"2022-02-22T07:16:17.933Z\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        boolean boolean6 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property23 = localDateTime5.secondOfMinute();
        int int24 = localDateTime5.getEra();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime5.plusYears(720);
        org.joda.time.LocalDateTime.Property property27 = localDateTime5.era();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        java.util.Date date7 = dateTime4.toDate();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, 856);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField16.getType();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime21.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfMonth(10);
        org.joda.time.DateTime dateTime28 = dateTime24.minusHours((int) (short) 100);
        int int29 = dateTime28.getCenturyOfEra();
        int int30 = dateTime28.getDayOfMonth();
        java.lang.String str31 = dateTime28.toString();
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(0L, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType17.getField(chronology32);
        int int35 = dateTime10.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime37 = dateTime10.plusMillis(0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Feb 22 00:00:00 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17 + "'", int30 == 17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-17T20:00:00.010Z" + "'", str31, "2022-02-17T20:00:00.010Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("384");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime3.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withDayOfMonth(10);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale.setDefault(category12, locale13);
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale16);
        java.lang.String str18 = locale16.getDisplayName();
        boolean boolean19 = locale16.hasExtensions();
        java.lang.String str20 = locale16.getCountry();
        java.lang.String str21 = locale16.getDisplayVariant();
        java.util.Locale.setDefault(category12, locale16);
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(category12, locale23);
        java.lang.String str25 = property10.getAsText(locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale23);
        int int28 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ja" + "'", str14, "ja");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English (Canada)" + "'", str18, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CA" + "'", str20, "CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u516c\u5143" + "'", str25, "\u516c\u5143");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514741605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=41,MILLISECOND=605,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(134);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField10 = copticChronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology25.getZone();
        long long29 = dateTimeZone26.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology30 = copticChronology9.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone26);
        java.lang.String str33 = dateTimeZone26.getName((long) 72);
        int int35 = dateTimeZone26.getOffsetFromLocal((long) 6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter8.withZone(dateTimeZone26);
        java.util.Locale locale37 = dateTimeFormatter8.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter8.withDefaultYear(649);
        java.lang.StringBuffer stringBuffer41 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(2, 7, 16, 4, (int) (byte) 10);
        org.joda.time.DateTime dateTime49 = dateTime47.minusHours(23);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer41, (org.joda.time.ReadableInstant) dateTime49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNull(dateTimePrinter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        int int9 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int10 = localDateTime6.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minus(readableDuration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        java.util.Date date14 = localDateTime12.toDate();
        int int15 = date14.getHours();
        java.util.Calendar.Builder builder16 = builder0.setInstant(date14);
        java.util.Calendar.Builder builder18 = builder16.setLenient(false);
        java.util.Calendar.Builder builder20 = builder18.setLenient(false);
        java.util.Calendar.Builder builder24 = builder18.setWeekDate(57, 543, 177);
        java.util.Calendar.Builder builder28 = builder18.setTimeOfDay(82, 64799999, 106);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("ja");
        java.time.ZoneId zoneId31 = timeZone30.toZoneId();
        int int33 = timeZone30.getOffset((long) 3);
        java.util.Calendar.Builder builder34 = builder18.setTimeZone(timeZone30);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("ja");
        java.time.ZoneId zoneId37 = timeZone36.toZoneId();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getTimeZone(zoneId37);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone(zoneId37);
        java.util.TimeZone.setDefault(timeZone39);
        java.util.Calendar.Builder builder41 = builder18.setTimeZone(timeZone39);
        java.time.ZoneId zoneId42 = timeZone39.toZoneId();
        java.time.ZoneId zoneId43 = timeZone39.toZoneId();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 642 + "'", int10 == 642);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Feb 22 07:25:41 GMT 2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertNotNull(zoneId43);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.set((-9936000), 497, 70);
        int int6 = calendar0.getWeekYear();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int8 = calendar0.getWeekYear();
        int int9 = calendar0.getWeekYear();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-313617168030858344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=9935960,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=221,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=41,MILLISECOND=656,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9935959) + "'", int6 == (-9935959));
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9935959) + "'", int8 == (-9935959));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9935959) + "'", int9 == (-9935959));
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        int int9 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int10 = localDateTime6.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minus(readableDuration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        java.util.Date date14 = localDateTime12.toDate();
        int int15 = date14.getHours();
        java.util.Calendar.Builder builder16 = builder0.setInstant(date14);
        java.util.Calendar.Builder builder18 = builder16.setLenient(false);
        java.util.Calendar calendar19 = builder16.build();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        boolean boolean21 = calendar20.isWeekDateSupported();
        calendar20.clear();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("ja");
        java.time.ZoneId zoneId25 = timeZone24.toZoneId();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone(zoneId25);
        int int28 = timeZone26.getOffset((long) '#');
        calendar20.setTimeZone(timeZone26);
        java.util.Calendar.Builder builder30 = builder16.setTimeZone(timeZone26);
        java.util.Calendar.Builder builder32 = builder16.setInstant(1080000L);
        java.util.Calendar.Builder builder34 = builder16.setInstant(872L);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField36 = copticChronology35.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology35.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withEra(1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withEra(1);
        int int48 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.Chronology chronology49 = localDateTime45.getChronology();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withEra(1);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withEra(1);
        int int59 = localDateTime52.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        int int60 = localDateTime56.getMillisOfSecond();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withEra(1);
        int int65 = localDateTime64.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime64.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime56.withField(dateTimeFieldType67, 7);
        int[] intArray71 = chronology49.get((org.joda.time.ReadablePartial) localDateTime69, (long) (byte) 10);
        int int72 = dateTimeField38.getMaximumValue((org.joda.time.ReadablePartial) localDateTime39, intArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder73 = builder34.setFields(intArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 669 + "'", int10 == 669);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Feb 22 07:25:41 GMT 2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645514741669,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=41,MILLISECOND=669,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(copticChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 669 + "'", int60 == 669);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1970, 1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1439 + "'", int72 == 1439);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.yearOfEra();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[UTC]" + "'", str3, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[UTC]" + "'", str7, "CopticChronology[UTC]");
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime5.getMillisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(1);
        int int14 = localDateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = localDateTime13.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withField(dateTimeFieldType16, 7);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.plus(readablePeriod19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime5.plus(readablePeriod21);
        int int23 = localDateTime5.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime5.minusWeeks(0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withYearOfCentury(57);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfEra(99);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.centuryOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 701 + "'", int9 == 701);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26741701 + "'", int23 == 26741701);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(134);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField10 = copticChronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology25.getZone();
        long long29 = dateTimeZone26.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology30 = copticChronology9.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone26);
        java.lang.String str33 = dateTimeZone26.getName((long) 72);
        int int35 = dateTimeZone26.getOffsetFromLocal((long) 6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter8.withZone(dateTimeZone26);
        int int37 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withPivotYear((java.lang.Integer) 2031);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 134 + "'", int37 == 134);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        java.util.Date date1 = new java.util.Date((long) 10);
        java.util.Date date2 = new java.util.Date();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromDateFields(date2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay(6);
        int int8 = localTime7.getMillisOfSecond();
        org.joda.time.LocalTime localTime10 = localTime7.withMillisOfSecond(730);
        boolean boolean11 = date1.equals((java.lang.Object) localTime7);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Tue Feb 22 07:25:41 GMT 2022");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField2 = copticChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 869, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("11");
        org.joda.time.DateTime dateTime10 = dateTime8.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTime dateTime11 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.Instant instant15 = dateTime13.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant15.withDurationAdded(readableDuration16, (int) (byte) -1);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        boolean boolean15 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertLocalToUTC((long) 987, true, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(161);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfCentury(70);
        int int26 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime23);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("ja");
        timeZone28.setID("ja");
        timeZone28.setID("eras");
        timeZone28.setRawOffset((int) (byte) 1);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("ja");
        timeZone36.setID("UTC");
        boolean boolean39 = timeZone28.hasSameRules(timeZone36);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone("ja");
        timeZone41.setID("UTC");
        java.lang.String str44 = timeZone41.getID();
        boolean boolean45 = timeZone28.hasSameRules(timeZone41);
        java.time.ZoneId zoneId46 = timeZone41.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withEra(1);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        boolean boolean55 = localDateTime52.isAfter((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withEra(1);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(chronology60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withEra(1);
        int int64 = localDateTime57.compareTo((org.joda.time.ReadablePartial) localDateTime61);
        org.joda.time.Chronology chronology65 = localDateTime61.getChronology();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.plusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime71 = localDateTime54.withFields((org.joda.time.ReadablePartial) localDateTime66);
        int int72 = localDateTime54.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime54.withYear(3);
        boolean boolean75 = dateTimeZone47.isLocalDateTimeGap(localDateTime54);
        long long77 = dateTimeZone14.getMillisKeepLocal(dateTimeZone47, 1645514326743L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 987L + "'", long19 == 987L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime71);
// flaky:         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 41 + "'", int72 == 41);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1645514326743L + "'", long77 == 1645514326743L);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.set((-9936000), 497, 70);
        calendar0.setLenient(true);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("ja");
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        calendar0.setTimeZone(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = timeZone9.getDisplayName(false, 211);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 211");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=-9936000,MONTH=497,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=70,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=41,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField10 = copticChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.hourOfHalfday();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology9);
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) 10);
        int int15 = localDate14.getWeekyear();
        int int16 = localDate14.getEra();
        org.joda.time.LocalDate localDate18 = localDate14.minusMonths(53);
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalDate localDate21 = localDate18.minusDays(692);
        int int22 = localDate18.getWeekyear();
        org.joda.time.LocalDate localDate24 = localDate18.plusWeeks(23);
        org.joda.time.LocalDate.Property property25 = localDate24.weekyear();
        org.joda.time.LocalDate.Property property26 = localDate24.year();
        org.joda.time.LocalDate localDate28 = localDate24.minusDays(0);
        int[] intArray30 = copticChronology0.get((org.joda.time.ReadablePartial) localDate24, (long) 943);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField32 = copticChronology0.centuries();
        org.joda.time.Chronology chronology33 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1737 + "'", int15 == 1737);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 225 + "'", int19 == 225);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1733 + "'", int22 == 1733);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1686, 4, 23]");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(0);
        boolean boolean16 = localDateTime5.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withMillisOfDay(0);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField20 = copticChronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField25 = copticChronology19.days();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        int int28 = localDateTime27.getWeekyear();
        int int29 = localDateTime27.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.era();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withWeekOfWeekyear(22);
        int[] intArray34 = copticChronology19.get((org.joda.time.ReadablePartial) localDateTime27, (-9936000000L));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) chronology35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.property(dateTimeFieldType41);
        boolean boolean43 = localDateTime27.isSupported(dateTimeFieldType41);
        int int44 = localDateTime5.get(dateTimeFieldType41);
        java.util.Locale locale48 = new java.util.Locale("00:00:00.010", "CopticChronology[+500:00]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = localDateTime5.toString("2022-02-22T07:21:11.440", locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1685, 13, 3, 0]");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertEquals(locale48.toString(), "00:00:00.010_COPTICCHRONOLOGY[+500:00]");
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        long long14 = durationField11.subtract(1645514467929L, 248);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-6180770332071L) + "'", long14 == (-6180770332071L));
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readablePeriod9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        boolean boolean14 = dateTime12.isBefore((long) 605);
        org.joda.time.DateTime dateTime16 = dateTime12.plusHours(3);
        org.joda.time.DateTime.Property property17 = dateTime12.millisOfDay();
        org.joda.time.DateTime.Property property18 = dateTime12.dayOfMonth();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime20.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withDayOfMonth(10);
        org.joda.time.DateTime dateTime27 = dateTime23.minusHours((int) (short) 100);
        int int28 = dateTime27.getCenturyOfEra();
        boolean boolean29 = dateTime27.isEqualNow();
        org.joda.time.DateTime dateTime31 = dateTime27.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime dateTime33 = dateTime31.plusSeconds(7);
        org.joda.time.DateTime dateTime35 = dateTime31.plusMinutes((int) (short) 0);
        boolean boolean36 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property37 = dateTime31.secondOfMinute();
        org.joda.time.DateTime dateTime38 = property37.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime39 = property37.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(0);
        boolean boolean16 = localDateTime5.isSupported(dateTimeFieldType15);
        int int17 = localDateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime20 = property18.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        int int24 = localDate23.getDayOfWeek();
        int int25 = localDate23.getDayOfYear();
        org.joda.time.LocalDate localDate27 = localDate23.minusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 879 + "'", int17 == 879);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53 + "'", int25 == 53);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        int int7 = localDate5.getEra();
        org.joda.time.LocalDate localDate9 = localDate5.minusMonths(53);
        org.joda.time.LocalDate localDate11 = localDate5.minusMonths(29);
        int int12 = localDate11.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate11.minusWeeks(764);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfYear();
        org.joda.time.LocalDate.Property property19 = localDate17.weekyear();
        org.joda.time.LocalDate localDate21 = localDate17.minusYears(1970);
        org.joda.time.LocalDate.Property property22 = localDate17.year();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = dateTimeField23.getType();
        org.joda.time.LocalDate localDate26 = localDate11.withField(dateTimeFieldType24, 742);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24 + "'", int12 == 24);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 4, 2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology0.withZone(dateTimeZone11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.LocalDate.Property property14 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate15 = property14.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        int int18 = localDate15.getDayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(48);
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (long) 26580922);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        boolean boolean15 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertLocalToUTC((long) 987, true, (long) (byte) 1);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14, 4);
        org.joda.time.DurationField durationField22 = copticChronology21.years();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 987L + "'", long19 == 987L);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.minuteOfDay();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.DateTime dateTime11 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime13 = property8.addToCopy(1645514199398L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology0);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDurationAdded(readableDuration7, 348);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 158);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfSecond(865);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = instant14.toDateTime(dateTimeZone15);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = instant17.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withSecondOfMinute(2);
        int int22 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean23 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean25 = dateTime16.isSupported(dateTimeFieldType24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime9.property(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        int int20 = dateTimeZone17.getOffset((long) 12);
        boolean boolean22 = dateTimeZone17.isStandardOffset((-3628800000L));
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.Chronology chronology24 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra(1);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withEra(1);
        int int33 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.Chronology chronology34 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        int int42 = dateTimeZone39.getOffset((long) 12);
        org.joda.time.Chronology chronology43 = copticChronology0.withZone(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone44 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField46 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((-1L));
        org.joda.time.LocalDate localDate3 = localDate1.withYear(12);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate3.getValue(280);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 280");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.secondOfMinute();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime20.getFieldType(0);
        boolean boolean24 = localDateTime13.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime13.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getRangeDurationType();
        boolean boolean29 = localDateTime13.isSupported(dateTimeFieldType27);
        int int30 = localDateTime3.get(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime3.minusMillis(1738);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean34 = localDateTime32.isSupported(dateTimeFieldType33);
        java.lang.String str35 = localDateTime32.toString();
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = localDateTime32.getValue(182);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 182");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2022-02-22T07:25:40.274" + "'", str35, "2022-02-22T07:25:40.274");
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = instant1.toDateTime(dateTimeZone2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfEra();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) chronology6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.property(dateTimeFieldType12);
        boolean boolean14 = dateTime3.isSupported(dateTimeFieldType12);
        long long15 = dateTime3.getMillis();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime3.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(1L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears(18);
        int int20 = dateTime17.getYearOfEra();
        org.joda.time.DateTime dateTime22 = dateTime17.plusMonths(412);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1645514742026L + "'", long15 == 1645514742026L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeeksInWeekYear();
        calendar0.add((int) (short) 0, (int) (short) 1);
        calendar0.clear();
        java.lang.String str6 = calendar0.getCalendarType();
        calendar0.set(9, 416, 556);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.clear();
        calendar0.set(575, 972, 422, 0, 412);
        boolean boolean19 = calendar0.isWeekDateSupported();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=575,MONTH=972,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=422,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=412,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gregory" + "'", str6, "gregory");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime11 = localTime9.withMinuteOfHour(2);
        int int12 = localTime9.size();
        org.joda.time.LocalTime.Property property13 = localTime9.millisOfDay();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime15 = property13.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond(762);
        long long19 = copticChronology0.set((org.joda.time.ReadablePartial) localTime15, (long) 23);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField21 = copticChronology0.months();
        org.joda.time.DurationField durationField22 = copticChronology0.hours();
        long long25 = durationField22.subtract((long) 785, 0L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 785L + "'", long25 == 785L);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        boolean boolean6 = dateTime2.equals((java.lang.Object) 10);
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime2.withEarlierOffsetAtOverlap();
        int int9 = dateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology6 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfWeek();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(1645514331471L, chronology6);
        org.joda.time.DurationField durationField10 = chronology6.centuries();
        long long14 = chronology6.add((long) 84960010, (long) 26489591, 2067);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 54838944607L + "'", long14 == 54838944607L);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        java.util.Date date1 = new java.util.Date((long) 737);
        date1.setSeconds(853);
        int int4 = date1.getDate();
        java.util.Date date10 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        java.util.Date date16 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date16.setSeconds(20);
        int int19 = date16.getDay();
        date16.setYear((int) (byte) -1);
        boolean boolean22 = date10.after(date16);
        date10.setYear(72000010);
        boolean boolean25 = date1.before(date10);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:14:13 GMT 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Apr 28 23:16:00 GMT 72001910");
        org.junit.Assert.assertEquals(date16.toString(), "Fri Apr 28 23:16:20 GMT 1899");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        org.joda.time.DateTime.Property property10 = dateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusDays(49);
        int int16 = dateTime13.getYearOfCentury();
        org.joda.time.DateTime dateTime18 = dateTime13.plusMinutes(587);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.era();
        java.lang.String str25 = copticChronology19.toString();
        org.joda.time.DurationField durationField26 = copticChronology19.halfdays();
        org.joda.time.DurationField durationField27 = copticChronology19.weekyears();
        org.joda.time.DateTime dateTime28 = dateTime13.toDateTime((org.joda.time.Chronology) copticChronology19);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = copticChronology19.getDateTimeMillis(1031891008580000L, 250, 213, 209, 202);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 250 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CopticChronology[UTC]" + "'", str25, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = instant1.toDateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withSecondOfMinute(2);
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime8.getZone();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 1461116880000000L, dateTimeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone9);
        java.lang.String str13 = dateTimeZone9.toString();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property5.getLocalTime();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime10.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfMonth(10);
        org.joda.time.DateTime dateTime17 = dateTime13.minusHours((int) (short) 100);
        int int18 = dateTime17.getCenturyOfEra();
        int int19 = dateTime17.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean21 = dateTime17.isSupported(dateTimeFieldType20);
        boolean boolean22 = localTime8.isSupported(dateTimeFieldType20);
        java.lang.String str23 = localTime8.toString();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        boolean boolean25 = calendar24.isWeekDateSupported();
        calendar24.setTimeInMillis((long) (byte) 10);
        long long28 = calendar24.getTimeInMillis();
        boolean boolean29 = localTime8.equals((java.lang.Object) calendar24);
        java.util.Calendar.Builder builder30 = new java.util.Calendar.Builder();
        java.util.Date date36 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        java.util.Date date42 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date42.setSeconds(20);
        int int45 = date42.getDay();
        date42.setYear((int) (byte) -1);
        boolean boolean48 = date36.after(date42);
        int int49 = date42.getHours();
        java.util.Calendar.Builder builder50 = builder30.setInstant(date42);
        calendar24.setTime(date42);
        calendar24.set(573, 500, 574);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00:00:00.010" + "'", str23, "00:00:00.010");
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=573,MONTH=500,WEEK_OF_YEAR=17,WEEK_OF_MONTH=5,DAY_OF_MONTH=574,DAY_OF_YEAR=118,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=16,SECOND=20,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Apr 28 23:16:00 GMT 1915");
        org.junit.Assert.assertEquals(date42.toString(), "Fri Apr 28 23:16:20 GMT 1899");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 23 + "'", int49 == 23);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(756, 778, 403, 683);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 756 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        int int10 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.dayOfYear();
        boolean boolean13 = property12.isLeap();
        org.joda.time.LocalDateTime localDateTime15 = property12.addToCopy(221);
        java.lang.String str16 = property12.getName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfYear" + "'", str16, "dayOfYear");
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(380);
        org.joda.time.DateTime dateTime3 = localDateTime0.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.secondOfDay();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property4.getFieldType();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        long long18 = dateTimeZone14.convertLocalToUTC((long) 169, true);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = instant22.toDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTime dateTime27 = dateTime24.withCenturyOfEra(100);
        boolean boolean28 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField30 = copticChronology29.eras();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.weekOfWeekyear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withEra(1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withEra(1);
        int int40 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.Chronology chronology41 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology45.getZone();
        long long49 = dateTimeZone46.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology50 = copticChronology29.withZone(dateTimeZone46);
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone46);
        java.lang.String str53 = dateTimeZone46.getNameKey((long) 2);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withEra(1);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withEra(1);
        int int62 = localDateTime55.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.Chronology chronology63 = localDateTime59.getChronology();
        java.lang.String str64 = localDateTime59.toString();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime59.minusMinutes(1);
        boolean boolean67 = dateTimeZone46.isLocalDateTimeGap(localDateTime59);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime24.toMutableDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime70 = dateTime24.withYear((int) '#');
        org.joda.time.DateTime dateTime71 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.chrono.CopticChronology copticChronology72 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField73 = copticChronology72.eras();
        org.joda.time.DateTimeField dateTimeField74 = copticChronology72.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology72.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField76 = copticChronology72.hourOfHalfday();
        org.joda.time.DateTime dateTime77 = dateTime71.toDateTime((org.joda.time.Chronology) copticChronology72);
        boolean boolean78 = dateTimeZone14.equals((java.lang.Object) dateTime77);
        org.joda.time.DateTime dateTime80 = dateTime77.withMillisOfDay(182);
        org.joda.time.DateTimeZone dateTimeZone81 = dateTime77.getZone();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 169L + "'", long18 == 169L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 35L + "'", long49 == 35L);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(chronology63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2022-02-22T07:25:42.189" + "'", str64, "2022-02-22T07:25:42.189");
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(copticChronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTimeZone81);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime11 = dateTime8.plusYears(15);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime11.minusSeconds(161);
        int int15 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime16.withDayOfYear(12);
        java.util.Date date20 = dateTime19.toDate();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        int int22 = calendar21.getMinimalDaysInFirstWeek();
        calendar21.set((-9936000), 497, 70);
        int int27 = calendar21.getMinimalDaysInFirstWeek();
        boolean boolean28 = calendar21.isWeekDateSupported();
        boolean boolean29 = date20.equals((java.lang.Object) calendar21);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 72000010 + "'", int15 == 72000010);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Jan 12 20:00:00 GMT 2037");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=-9936000,MONTH=497,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=70,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=227,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology3.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField9 = copticChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfHalfday();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology8);
        int int12 = localDate11.getMonthOfYear();
        org.joda.time.LocalDate.Property property13 = localDate11.weekyear();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        java.util.Locale locale18 = dateTimeFormatter17.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial21 = null;
        int int22 = dateTimeField20.getMaximumValue(readablePartial21);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.lang.String str24 = locale23.toLanguageTag();
        int int25 = dateTimeField20.getMaximumTextLength(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter17.withLocale(locale23);
        java.lang.String str27 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDate11, 11, locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter2.withLocale(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter2.withDefaultYear(21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 235);
        java.lang.Appendable appendable36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable36, (org.joda.time.ReadableInstant) dateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ja" + "'", str24, "ja");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "11" + "'", str27, "11");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        java.util.Locale locale14 = dateTimeFormatter13.getLocale();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withOffsetParsed();
        java.lang.Appendable appendable18 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime22 = localTime20.withMinuteOfHour(2);
        int int23 = localTime20.size();
        org.joda.time.LocalTime.Property property24 = localTime20.millisOfDay();
        org.joda.time.LocalTime localTime25 = property24.roundCeilingCopy();
        org.joda.time.LocalTime localTime26 = property24.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime27 = property24.getLocalTime();
        org.joda.time.LocalTime localTime28 = property24.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime30 = property24.addCopy((long) 100);
        org.joda.time.LocalTime localTime32 = property24.addNoWrapToCopy(865);
        org.joda.time.LocalTime localTime34 = localTime32.plusMillis(620);
        org.joda.time.LocalTime localTime36 = localTime32.withMillisOfDay(598);
        org.joda.time.DateTime dateTime37 = localTime32.toDateTimeToday();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(appendable18, (org.joda.time.ReadableInstant) dateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getLanguage();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra(1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        int int10 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.Chronology chronology11 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfMinute();
        boolean boolean15 = dateTimeField13.isLeap((long) 2022);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology21 = localDateTime19.getChronology();
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.lang.String str23 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime19, locale22);
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale22.getScript();
        java.lang.String str26 = locale22.getISO3Language();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial29 = null;
        int int30 = dateTimeField28.getMaximumValue(readablePartial29);
        java.util.Locale locale31 = java.util.Locale.JAPANESE;
        java.lang.String str32 = locale31.toLanguageTag();
        int int33 = dateTimeField28.getMaximumTextLength(locale31);
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.lang.String str35 = locale31.getDisplayName(locale34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) chronology36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        org.joda.time.tz.NameProvider nameProvider43 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str47 = nameProvider43.getShortName(locale44, "", "");
        java.lang.String str48 = property41.getAsShortText(locale44);
        org.joda.time.tz.NameProvider nameProvider49 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str53 = nameProvider49.getShortName(locale50, "", "");
        java.lang.String str54 = locale44.getDisplayCountry(locale50);
        org.joda.time.tz.NameProvider nameProvider55 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str59 = nameProvider55.getShortName(locale56, "", "");
        java.lang.String str60 = locale56.getDisplayScript();
        java.lang.String str61 = locale50.getDisplayScript(locale56);
        java.lang.String str62 = locale31.getDisplayCountry(locale56);
        java.lang.String str63 = locale22.getDisplayScript(locale31);
        java.lang.String str64 = locale0.getDisplayCountry(locale31);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "42" + "'", str23, "42");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ja" + "'", str32, "ja");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u65e5\u6587" + "'", str35, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(nameProvider43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "8" + "'", str48, "8");
        org.junit.Assert.assertNotNull(nameProvider49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Canada" + "'", str54, "Canada");
        org.junit.Assert.assertNotNull(nameProvider55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField2 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) 388, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime1.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime1.withMinuteOfHour((int) (short) 10);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("11");
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = dateTime8.toString("10", locale10);
        org.joda.time.DateTime dateTime15 = dateTime8.withDayOfYear(345);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.plus(readablePeriod16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readableDuration21);
        int int23 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime20);
        int int24 = dateTime5.getWeekyear();
        java.util.Date date25 = dateTime5.toDate();
        org.joda.time.Instant instant26 = dateTime5.toInstant();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2940001L) + "'", long6 == (-2940001L));
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 23:10:59 GMT 1969");
        org.junit.Assert.assertNotNull(instant26);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int int7 = dateTimeField5.getMaximumValue(readablePartial6);
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale8.toLanguageTag();
        int int10 = dateTimeField5.getMaximumTextLength(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale8);
        java.lang.String str12 = locale8.getISO3Language();
        java.util.Set<java.lang.String> strSet13 = locale8.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet14 = locale8.getUnicodeLocaleAttributes();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = instant15.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.DateTime.Property property19 = dateTime17.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) chronology20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.property(dateTimeFieldType26);
        boolean boolean28 = dateTime17.isSupported(dateTimeFieldType26);
        org.joda.time.DateTime.Property property29 = dateTime17.weekyear();
        org.joda.time.DateTime.Property property30 = dateTime17.millisOfSecond();
        boolean boolean32 = property30.equals((java.lang.Object) 72000010);
        java.lang.String str33 = property30.toString();
        org.joda.time.DateTimeField dateTimeField34 = property30.getField();
        org.joda.time.DateTime dateTime35 = property30.roundFloorCopy();
        boolean boolean36 = locale8.equals((java.lang.Object) dateTime35);
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ja" + "'", str9, "ja");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jpn" + "'", str12, "jpn");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Property[millisOfSecond]" + "'", str33, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime8 = localTime6.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        org.joda.time.LocalTime localTime12 = property9.setCopy("0", locale11);
        int[] intArray14 = copticChronology0.get((org.joda.time.ReadablePartial) localTime12, 26184082L);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime16.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfMonth(10);
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay23 = dateTime21.toTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean25 = dateTime21.isSupported(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property26 = localTime12.property(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property27 = localTime12.millisOfSecond();
        org.joda.time.LocalTime localTime29 = property27.setCopy(626);
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime31 = property27.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = localTime31.getValue(209);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 209");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[7, 16, 24, 82]");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = dateTimeField8.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField8.set(1645514466023L, "22 Apr 1802095 07:23:59 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"22 Apr 1802095 07:23:59 GMT\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.yearOfEra();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        long long11 = dateTimeField8.addWrapField((long) 585, 178);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[UTC]" + "'", str3, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5617296000585L + "'", long11 == 5617296000585L);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = dateTime2.withCenturyOfEra(100);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property7 = dateTime2.era();
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfEra();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.hourOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) chronology11);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.property(dateTimeFieldType17);
        int int19 = localDateTime1.get(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime1.withMillisOfDay(808);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime1.plusMinutes(26572964);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusHours(26157846);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType(335);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 335");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        int int17 = dateTimeZone14.getOffset((long) 12);
        boolean boolean19 = dateTimeZone14.isStandardOffset((-3628800000L));
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        long long22 = dateTimeZone14.nextTransition(26184082L);
        long long26 = dateTimeZone14.convertLocalToUTC((long) 720, true, (long) 193);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) chronology27);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.property(dateTimeFieldType33);
        java.lang.String str35 = property34.getName();
        int int36 = property34.getMaximumValue();
        long long37 = property34.remainder();
        org.joda.time.LocalDateTime localDateTime38 = property34.roundHalfEvenCopy();
        boolean boolean39 = dateTimeZone14.equals((java.lang.Object) property34);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 26184082L + "'", long22 == 26184082L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 720L + "'", long26 == 720L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "weekOfWeekyear" + "'", str35, "weekOfWeekyear");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 26742422L + "'", long37 == 26742422L);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone1);
        boolean boolean4 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(34);
        int int7 = timeZone1.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        java.lang.String[] strArray2 = new java.lang.String[] { "English (Canada)", "English (Canada)" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.Object[] objArray5 = strSet3.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale17.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale22.getDisplayName();
        boolean boolean25 = locale22.hasExtensions();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale14, locale15, locale16, locale17, locale20, locale21, locale22 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        boolean boolean31 = strSet3.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream32 = languageRangeList7.stream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList7.parallelStream();
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial36 = null;
        int int37 = dateTimeField35.getMaximumValue(readablePartial36);
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.lang.String str39 = locale38.toLanguageTag();
        int int40 = dateTimeField35.getMaximumTextLength(locale38);
        java.util.Locale locale41 = java.util.Locale.CHINA;
        java.lang.String str42 = locale38.getDisplayName(locale41);
        java.util.Locale locale43 = locale41.stripExtensions();
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet44);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream46 = languageRangeList7.parallelStream();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[English (Canada)]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[English (Canada)]");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English (Canada)" + "'", str19, "English (Canada)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English (Canada)" + "'", str24, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeStream32);
        org.junit.Assert.assertNotNull(languageRangeStream33);
        org.junit.Assert.assertNotNull(copticChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ja" + "'", str39, "ja");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u65e5\u6587" + "'", str42, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(languageRangeStream46);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        java.lang.String str3 = durationField2.toString();
        int int6 = durationField2.getValue(169L, (long) 3);
        long long9 = durationField2.subtract((long) 221, (-62071129393068L));
        long long12 = durationField2.getDifferenceAsLong(666000000L, (long) 643);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DurationField[minutes]" + "'", str3, "DurationField[minutes]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3724267763584080221L + "'", long9 == 3724267763584080221L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11099L + "'", long12 == 11099L);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("year");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguage("2022-02-22T07:21:58.794");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2022-02-22T07:21:58.794 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        java.util.Date date10 = localDate5.toDate();
        org.joda.time.LocalDate localDate12 = localDate5.withWeekOfWeekyear(17);
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField15 = copticChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.hourOfHalfday();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology14);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        boolean boolean21 = localDate17.isSupported(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate17.minus(readablePeriod22);
        int int24 = localDate23.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        org.joda.time.LocalDate.Property property27 = localDate23.property(dateTimeFieldType25);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.LocalDate.Property property29 = localDate12.property(dateTimeFieldType25);
        org.joda.time.LocalDate localDate31 = property29.addWrapFieldToCopy(998);
        org.joda.time.LocalDate localDate33 = property29.addWrapFieldToCopy(447);
        org.joda.time.LocalDate localDate34 = property29.roundCeilingCopy();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Sep 15 00:00:00 GMT 1737");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.Chronology chronology7 = localDate3.getChronology();
        org.joda.time.DateTime dateTime8 = localDate3.toDateTimeAtMidnight();
        int int9 = localDate3.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate3.withPeriodAdded(readablePeriod10, 158);
        org.joda.time.DateTime dateTime13 = localDate12.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime13.toYearMonthDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        long long3 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant6 = instant1.withMillis((long) 168);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 620);
        org.joda.time.Instant instant11 = instant9.minus((long) (-292275054));
        org.joda.time.DateTime dateTime12 = instant11.toDateTimeISO();
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfDay();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        int int17 = durationField15.getValue(997167L);
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514742526L + "'", long3 == 1645514742526L);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 997 + "'", int17 == 997);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withPeriodAdded(readablePeriod3, (-1));
        int int6 = localDateTime2.getYearOfEra();
        int int7 = localDateTime2.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readableDuration8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withDurationAdded(readableDuration10, 26508);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime2.getValue(609);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 609");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.withMaximumValue();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) chronology5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str16 = nameProvider12.getShortName(locale13, "", "");
        java.lang.String str17 = property10.getAsShortText(locale13);
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str22 = nameProvider18.getShortName(locale19, "", "");
        java.lang.String str23 = locale13.getDisplayCountry(locale19);
        org.joda.time.LocalDateTime localDateTime24 = property1.setCopy("26269666", locale19);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localTime26.toDateTimeToday(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfMonth(10);
        org.joda.time.DateTime dateTime33 = dateTime29.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property34 = dateTime33.year();
        org.joda.time.DateTime dateTime36 = dateTime33.plusYears(15);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime39 = dateTime36.minusSeconds(161);
        int int40 = dateTime36.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime36.getZone();
        long long43 = dateTimeZone41.convertUTCToLocal((long) 185);
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone41);
        java.util.TimeZone timeZone45 = dateTimeZone41.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) "26269666", dateTimeZone41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"26269666\" is malformed at \"269666\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8" + "'", str17, "8");
        org.junit.Assert.assertNotNull(nameProvider18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Canada" + "'", str23, "Canada");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 72000010 + "'", int40 == 72000010);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 185L + "'", long43 == 185L);
        org.junit.Assert.assertNotNull(copticChronology44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 4, 2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime5.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minus(readableDuration10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.era();
        java.util.Date date13 = localDateTime11.toDate();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.weekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 577 + "'", int9 == 577);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Feb 22 07:25:43 GMT 2022");
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        int int9 = dateTime8.getCenturyOfEra();
        boolean boolean10 = dateTime8.isEqualNow();
        org.joda.time.DateTime dateTime12 = dateTime8.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear(165);
        org.joda.time.DateTime dateTime15 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime17 = dateTime15.withMillis(1645514285309L);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        boolean boolean19 = dateTime17.isBeforeNow();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.weekOfWeekyear();
        int int5 = localDateTime1.getCenturyOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        int int10 = localDateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withField(dateTimeFieldType12, 2922728);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(987);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withDurationAdded(readableDuration17, 224);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withEra(1);
        int int28 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.Chronology chronology29 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMinuteOfHour((int) '#');
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withFields(readablePartial33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra(1);
        int int39 = localDateTime38.getMonthOfYear();
        org.joda.time.Chronology chronology40 = localDateTime38.getChronology();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withEra(1);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withEra(1);
        int int50 = localDateTime43.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.Chronology chronology51 = localDateTime47.getChronology();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withEra(1);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withEra(1);
        int int61 = localDateTime54.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        int int62 = localDateTime58.getMillisOfSecond();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withEra(1);
        int int67 = localDateTime66.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = localDateTime66.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime58.withField(dateTimeFieldType69, 7);
        int[] intArray73 = chronology51.get((org.joda.time.ReadablePartial) localDateTime71, (long) (byte) 10);
        org.joda.time.Chronology chronology74 = chronology51.withUTC();
        org.joda.time.DurationField durationField75 = durationFieldType41.getField(chronology51);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime38.withFieldAdded(durationFieldType41, 0);
        boolean boolean78 = localDateTime34.isSupported(durationFieldType41);
        boolean boolean79 = localDateTime19.isSupported(durationFieldType41);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime19.withCenturyOfEra(744);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = localDateTime19.getValue(973);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 973");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 599 + "'", int62 == 599);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1970, 1, 1, 10]");
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localDateTime81);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        java.util.Date date6 = new java.util.Date(139, 26511, 385, 831, 80, 798);
        org.junit.Assert.assertEquals(date6.toString(), "Thu May 24 16:33:18 GMT 4249");
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        int int13 = property9.getMaximumTextLength(locale12);
        org.joda.time.LocalDate localDate14 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate16 = property9.setCopy(200);
        org.joda.time.DateTime dateTime17 = localDate16.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate16.getValue(444);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 444");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.LocalTime localTime9 = dateTime6.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMillis(200);
        int int12 = localTime9.getMillisOfDay();
        org.joda.time.LocalTime localTime14 = localTime9.plusMinutes(21600777);
        int int15 = localTime9.size();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.Chronology chronology14 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        long long22 = dateTimeZone19.convertLocalToUTC((long) '#', false);
        int int24 = dateTimeZone19.getOffset(100L);
        org.joda.time.Chronology chronology25 = copticChronology4.withZone(dateTimeZone19);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19, (int) (short) 1);
        org.joda.time.DurationField durationField28 = copticChronology27.years();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.halfdayOfDay();
        boolean boolean31 = durationFieldType3.isSupported((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DurationField durationField32 = copticChronology27.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(80, 2000, 693, (org.joda.time.Chronology) copticChronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.LocalTime localTime9 = dateTime6.toLocalTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.plus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks(54);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime19 = localTime17.withMinuteOfHour(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean21 = localTime17.isSupported(dateTimeFieldType20);
        boolean boolean22 = dateTime13.isSupported(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusYears(762);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField11 = copticChronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.weekOfWeekyear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology22 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        long long30 = dateTimeZone27.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology31 = copticChronology10.withZone(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone27);
        java.lang.String str34 = dateTimeZone27.getName((long) 72);
        long long36 = dateTimeZone27.nextTransition((long) 10);
        long long38 = dateTimeZone27.convertUTCToLocal(1645514215380L);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(0L, dateTimeZone27);
        org.joda.time.DateTime dateTime40 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfEra();
        org.joda.time.DateTime dateTime45 = property43.addToCopy((long) 24);
        org.joda.time.DateTime dateTime46 = property43.getDateTime();
        org.joda.time.DateTime dateTime47 = property43.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.withPeriodAdded(readablePeriod48, 1);
        org.joda.time.DateTime dateTime51 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        int int52 = dateTime51.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1645514215380L + "'", long38 == 1645514215380L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 7 + "'", int52 == 7);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) chronology8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str19 = nameProvider15.getShortName(locale16, "", "");
        java.lang.String str20 = property13.getAsShortText(locale16);
        org.joda.time.LocalDateTime localDateTime21 = property13.roundHalfEvenCopy();
        int[] intArray23 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime21, (-2398377599503L));
        org.joda.time.DurationField durationField24 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField25 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "8" + "'", str20, "8");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1610, 4, 23, 497]");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime8 = localTime6.withMinuteOfHour(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean10 = localTime6.isSupported(dateTimeFieldType9);
        org.joda.time.LocalTime localTime12 = localTime1.withField(dateTimeFieldType9, 2);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime1.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay(5);
        org.joda.time.LocalTime localTime18 = localTime14.minusMillis(292272708);
        org.joda.time.LocalTime localTime20 = localTime18.minusSeconds(327);
        org.joda.time.LocalTime.Property property21 = localTime20.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = property21.setCopy(26239);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26239 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 158);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(865);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTime dateTime7 = dateTime3.minusMillis(26239);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) dateTime7);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(20);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra(1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        int int23 = localDateTime19.getMillisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withEra(1);
        int int28 = localDateTime27.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime27.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime19.withField(dateTimeFieldType30, 7);
        int[] intArray33 = localDateTime19.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField9.add((org.joda.time.ReadablePartial) localTime10, 855, intArray33, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 855");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 778 + "'", int23 == 778);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2022, 2, 22, 26742778]");
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        int int9 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int10 = localDateTime6.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minus(readableDuration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        java.util.Date date14 = localDateTime12.toDate();
        int int15 = date14.getHours();
        java.util.Calendar.Builder builder16 = builder0.setInstant(date14);
        java.util.Calendar.Builder builder18 = builder16.setLenient(false);
        java.util.Calendar.Builder builder20 = builder18.setLenient(false);
        java.util.Calendar.Builder builder22 = builder18.setLenient(false);
        java.util.Calendar.Builder builder24 = builder22.setLenient(false);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.dayOfMonth();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.weekOfWeekyear();
        int int30 = localDateTime26.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property31 = localDateTime26.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundFloorCopy();
        int[] intArray33 = localDateTime32.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder34 = builder22.setFields(intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 792 + "'", int10 == 792);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Feb 22 07:25:43 GMT 2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2000, 1, 1, 0]");
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.clockhourOfHalfday();
        int int18 = dateTimeField17.getMinimumValue();
        int int20 = dateTimeField17.getMaximumValue((-25210800000L));
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 4, 2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime10.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfMonth(10);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.minus(readablePeriod18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        int int22 = dateTime19.getHourOfDay();
        int int23 = dateTime19.getYearOfEra();
        org.joda.time.DateTime dateTime25 = dateTime19.minusMonths(978);
        org.joda.time.DateTime dateTime27 = dateTime19.withMillisOfSecond(108);
        boolean boolean28 = copticChronology0.equals((java.lang.Object) dateTime19);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = copticChronology0.add(readablePeriod29, (long) 632, 683);
        org.joda.time.DurationField durationField33 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 632L + "'", long32 == 632L);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 171);
        org.joda.time.YearMonthDay yearMonthDay2 = dateTime1.toYearMonthDay();
        org.joda.time.DateTime.Property property3 = dateTime1.weekOfWeekyear();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime1.toYearMonthDay();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate localDate10 = property9.roundCeilingCopy();
        org.joda.time.LocalDate localDate11 = property9.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property9.addToCopy(843);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField11 = copticChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.hourOfHalfday();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology10);
        int int14 = localDate13.getMonthOfYear();
        org.joda.time.LocalDate.Property property15 = localDate13.weekyear();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        java.util.Locale locale20 = dateTimeFormatter19.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial23 = null;
        int int24 = dateTimeField22.getMaximumValue(readablePartial23);
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.lang.String str26 = locale25.toLanguageTag();
        int int27 = dateTimeField22.getMaximumTextLength(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter19.withLocale(locale25);
        java.lang.String str29 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDate13, 11, locale25);
        java.util.Calendar calendar30 = dateTime2.toCalendar(locale25);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale31);
        java.lang.String str33 = locale31.getDisplayName();
        boolean boolean34 = locale31.hasExtensions();
        java.lang.String str35 = locale31.getCountry();
        java.lang.String str36 = locale31.getDisplayVariant();
        java.util.Calendar calendar37 = dateTime2.toCalendar(locale31);
        org.joda.time.DateTime dateTime39 = dateTime2.minusMinutes(60);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ja" + "'", str26, "ja");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "11" + "'", str29, "11");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1645514742855,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=855,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English (Canada)" + "'", str33, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CA" + "'", str35, "CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645514742855,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=855,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayName();
        boolean boolean3 = locale0.hasExtensions();
        java.util.Locale.setDefault(locale0);
        java.lang.String str5 = locale0.getDisplayCountry();
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology17 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale22.getDisplayName();
        boolean boolean25 = locale22.hasExtensions();
        java.util.Locale.setDefault(locale22);
        long long27 = dateTimeField19.set((long) 692, "8", locale22);
        java.lang.String str30 = nameProvider6.getName(locale22, "\u516c\u5143", "DateTimeField[weekyearOfCentury]");
        java.lang.String str31 = locale0.getDisplayScript(locale22);
        java.lang.String str33 = locale22.getExtension('u');
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale22);
        java.util.Locale locale35 = locale22.stripExtensions();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Canada)" + "'", str2, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Canada" + "'", str5, "Canada");
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English (Canada)" + "'", str24, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 480692L + "'", long27 == 480692L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1645514742880,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=914,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645514742880,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=914,ZONE_OFFSET=34,DST_OFFSET=0]");
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 11);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.plus(readablePeriod4);
        org.joda.time.LocalDate localDate7 = localDate3.plusWeeks(36);
        int int9 = localDate7.getValue((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.minus(readablePeriod10);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        java.lang.Integer int7 = dateTimeFormatter5.getPivotYear();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        int int26 = dateTimeZone23.getOffset((long) 12);
        boolean boolean28 = dateTimeZone23.isStandardOffset((-3628800000L));
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        long long31 = dateTimeZone23.nextTransition(26184082L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter5.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField35 = copticChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology34.weekyearOfCentury();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology34);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology34.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter33.withChronology((org.joda.time.Chronology) copticChronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter42.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter42.withPivotYear((java.lang.Integer) 334);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 26184082L + "'", long31 == 26184082L);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(copticChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        java.util.Date date6 = new java.util.Date(0, 0, 821, 851, 357, 637);
        org.junit.Assert.assertEquals(date6.toString(), "Tue May 06 17:07:37 GMT 1902");
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusHours((int) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.plus(readablePeriod13);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = instant15.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.DateTime dateTime20 = dateTime17.withCenturyOfEra(100);
        java.util.GregorianCalendar gregorianCalendar21 = dateTime17.toGregorianCalendar();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        int int26 = localDateTime25.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime25.getFieldType(0);
        boolean boolean29 = dateTime17.isSupported(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra(1);
        int int34 = localDateTime33.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime33.getFieldType(0);
        boolean boolean37 = dateTime17.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime40 = dateTime17.withField(dateTimeFieldType38, 72);
        org.joda.time.DateTime dateTime42 = dateTime40.withYear((-9935959));
        org.joda.time.DateTime dateTime45 = dateTime42.withDurationAdded((long) 292272708, 2);
        org.joda.time.DateTime dateTime46 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime14.plus(readableDuration47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime14.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime11 = dateTime8.plusYears(15);
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime14 = property13.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMonths(95);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        int int9 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int10 = localDateTime6.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minus(readableDuration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        java.util.Date date14 = localDateTime12.toDate();
        int int15 = date14.getHours();
        java.util.Calendar.Builder builder16 = builder0.setInstant(date14);
        java.util.Date date23 = new java.util.Date(513, 26195173, 497, 134, 5, 170);
        java.util.Calendar.Builder builder24 = builder0.setInstant(date23);
        java.util.Calendar calendar25 = builder0.build();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("ja");
        timeZone27.setID("ja");
        timeZone27.setID("eras");
        timeZone27.setRawOffset(52);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("ja");
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str38 = timeZone35.getID();
        boolean boolean39 = timeZone27.hasSameRules(timeZone35);
        boolean boolean40 = timeZone35.observesDaylightTime();
        java.util.Calendar.Builder builder41 = builder0.setTimeZone(timeZone35);
        java.util.Calendar.Builder builder45 = builder41.setWeekDate(688, 416, 26580922);
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder46.clearExtensions();
        java.util.Locale.Builder builder49 = builder46.setScript("");
        java.util.Locale locale50 = builder46.build();
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder52 = builder45.setLocale(locale50);
        java.util.Locale locale53 = locale50.stripExtensions();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 976 + "'", int10 == 976);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Feb 22 07:25:43 GMT 2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Jun 16 14:07:50 GMT 2185345");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=68900674514869966,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2185345,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=167,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=7,SECOND=50,MILLISECOND=0,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645514742976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=42,MILLISECOND=976,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GMT" + "'", str38, "GMT");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeeksInWeekYear();
        calendar0.add((int) (short) 0, (int) (short) 1);
        calendar0.clear();
        calendar0.clear((int) (byte) 1);
        calendar0.setTimeInMillis(0L);
        int int11 = calendar0.getMinimum(15);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField13 = copticChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.hourOfHalfday();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology12);
        org.joda.time.LocalDate localDate17 = localDate15.minusMonths((int) (short) 10);
        int int18 = localDate17.getWeekyear();
        int int19 = localDate17.getEra();
        org.joda.time.LocalDate localDate21 = localDate17.withMonthOfYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property22 = localDate17.yearOfEra();
        org.joda.time.LocalDate localDate23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate24 = property22.roundCeilingCopy();
        boolean boolean25 = calendar0.after((java.lang.Object) property22);
        org.joda.time.LocalDate localDate26 = property22.roundCeilingCopy();
        org.joda.time.LocalDate localDate27 = property22.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=34,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-46800000) + "'", int11 == (-46800000));
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1737 + "'", int18 == 1737);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Fri Mar 24 19:00:00 GMT 2361", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frimar2419:00:00gmt2361");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusHours((int) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusMinutes(32769);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusYears(2);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(0);
        int int26 = localDateTime14.get(dateTimeFieldType25);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField28 = copticChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology27.weekyearOfCentury();
        org.joda.time.DurationField durationField32 = copticChronology27.centuries();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(1);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withEra(1);
        int int41 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.Chronology chronology42 = localDateTime38.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology46.getZone();
        org.joda.time.Chronology chronology48 = copticChronology27.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField49 = copticChronology27.days();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType25.getField((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DurationField durationField51 = copticChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology27.dayOfYear();
        boolean boolean53 = dateTimeField52.isSupported();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property5.getLocalTime();
        org.joda.time.LocalTime localTime9 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime11 = property5.setCopy(72);
        org.joda.time.LocalTime localTime12 = property5.getLocalTime();
        org.joda.time.LocalTime localTime13 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime14 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime15 = property5.roundHalfFloorCopy();
        java.lang.String str16 = localTime15.toString();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00:00:00.010" + "'", str16, "00:00:00.010");
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) chronology5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.property(dateTimeFieldType11);
        boolean boolean13 = dateTime2.isSupported(dateTimeFieldType11);
        long long14 = dateTime2.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime2.minusSeconds(22);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears(64799999);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str20 = dateTimeFieldType19.getName();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType19.getRangeDurationType();
        int int22 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        int int25 = dateTimeZone23.getStandardOffset((long) 849);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = dateTime18.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 158);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond(865);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(1);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withEra(1);
        int int41 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.Chronology chronology42 = localDateTime38.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology46.getZone();
        long long50 = dateTimeZone47.convertLocalToUTC((long) '#', false);
        org.joda.time.DateTime dateTime51 = dateTime30.toDateTime(dateTimeZone47);
        org.joda.time.DateTime.Property property52 = dateTime30.weekyear();
        org.joda.time.DateTime dateTime54 = dateTime30.plusMonths(692);
        int int55 = dateTime54.getWeekyear();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.minus(readableDuration56);
        int int58 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime54);
        java.lang.String str60 = dateTimeZone23.getNameKey((long) 1439);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645514743078L + "'", long14 == 1645514743078L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "weekyearOfCentury" + "'", str20, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 21 + "'", int22 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 35L + "'", long50 == 35L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2027 + "'", int55 == 2027);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int int7 = dateTimeField5.getMaximumValue(readablePartial6);
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale8.toLanguageTag();
        int int10 = dateTimeField5.getMaximumTextLength(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale8);
        int int12 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale14 = new java.util.Locale("Thu Dec 23 00:00:00 UTC 1937");
        java.util.Locale locale15 = locale14.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withLocale(locale15);
        java.lang.String str17 = locale15.getCountry();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ja" + "'", str9, "ja");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertEquals(locale14.toString(), "thu dec 23 00:00:00 utc 1937");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "thu dec 23 00:00:00 utc 1937");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZone(dateTimeZone11);
        boolean boolean13 = dateTimeFormatter12.isParser();
        java.lang.Integer int14 = dateTimeFormatter12.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 72000010);
        boolean boolean17 = dateTimeFormatter12.isPrinter();
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer18, 26742422L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = copticChronology3.centuries();
        long long5 = durationField4.getUnitMillis();
        int int7 = durationField4.getValue((long) 27388968);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3155760000000L + "'", long5 == 3155760000000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        boolean boolean13 = localDateTime10.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra(1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.Chronology chronology23 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime24);
        int int30 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime12.withCenturyOfEra(3);
        java.util.Date date33 = localDateTime12.toDate();
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial37 = null;
        int int38 = dateTimeField36.getMaximumValue(readablePartial37);
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.lang.String str40 = locale39.toLanguageTag();
        int int41 = dateTimeField36.getMaximumTextLength(locale39);
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.lang.String str43 = locale39.getDisplayName(locale42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) chronology44);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField50 = property49.getField();
        org.joda.time.tz.NameProvider nameProvider51 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str55 = nameProvider51.getShortName(locale52, "", "");
        java.lang.String str56 = property49.getAsShortText(locale52);
        org.joda.time.tz.NameProvider nameProvider57 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale58 = java.util.Locale.CANADA;
        java.lang.String str61 = nameProvider57.getShortName(locale58, "", "");
        java.lang.String str62 = locale52.getDisplayCountry(locale58);
        org.joda.time.tz.NameProvider nameProvider63 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale64 = java.util.Locale.CANADA;
        java.lang.String str67 = nameProvider63.getShortName(locale64, "", "");
        java.lang.String str68 = locale64.getDisplayScript();
        java.lang.String str69 = locale58.getDisplayScript(locale64);
        java.lang.String str70 = locale39.getDisplayCountry(locale64);
        java.lang.String str71 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime12, 0, locale64);
        org.joda.time.LocalDateTime.Property property72 = localDateTime12.year();
        org.joda.time.DurationField durationField73 = property72.getLeapDurationField();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 43 + "'", int30 == 43);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Feb 22 07:25:44 GMT 2022");
        org.junit.Assert.assertNotNull(copticChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ja" + "'", str40, "ja");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u65e5\u6587" + "'", str43, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(nameProvider51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "8" + "'", str56, "8");
        org.junit.Assert.assertNotNull(nameProvider57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_CA");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Canada" + "'", str62, "Canada");
        org.junit.Assert.assertNotNull(nameProvider63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_CA");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0" + "'", str71, "0");
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(durationField73);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone17);
        java.lang.String str24 = dateTimeZone17.getName((long) 72);
        int int26 = dateTimeZone17.getOffsetFromLocal((long) 6);
        long long28 = dateTimeZone17.convertUTCToLocal((long) 169);
        long long30 = dateTimeZone17.nextTransition(0L);
        long long32 = dateTimeZone17.convertUTCToLocal(7265L);
        java.util.TimeZone timeZone33 = dateTimeZone17.toTimeZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 169L + "'", long28 == 169L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 7265L + "'", long32 == 7265L);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        timeZone1.setID("ja");
        timeZone1.setID("eras");
        timeZone1.setRawOffset(15);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone1);
        boolean boolean9 = timeZone1.observesDaylightTime();
        boolean boolean10 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645514743225,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"eras\",offset=15,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=43,MILLISECOND=240,ZONE_OFFSET=15,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
        java.util.Locale locale2 = new java.util.Locale("java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]", "2022-02-22T07:17:01.652");
        java.util.Locale locale5 = new java.util.Locale("267", "clockhourOfDay");
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category6, locale7);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int int17 = dateTimeField15.getMaximumValue(readablePartial16);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale18.toLanguageTag();
        int int20 = dateTimeField15.getMaximumTextLength(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter12.withLocale(locale18);
        java.util.Locale.setDefault(category6, locale18);
        org.joda.time.tz.NameProvider nameProvider23 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str27 = nameProvider23.getShortName(locale24, "", "");
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial30 = null;
        int int31 = dateTimeField29.getMaximumValue(readablePartial30);
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        java.lang.String str33 = locale32.toLanguageTag();
        int int34 = dateTimeField29.getMaximumTextLength(locale32);
        org.joda.time.tz.NameProvider nameProvider35 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str39 = nameProvider35.getShortName(locale36, "", "");
        java.lang.String str40 = locale32.getDisplayName(locale36);
        java.lang.String str43 = nameProvider23.getShortName(locale36, "11", "English (Canada)");
        java.util.Locale.setDefault(category6, locale36);
        java.util.Locale locale45 = java.util.Locale.getDefault(category6);
        java.lang.String str46 = locale5.getDisplayVariant(locale45);
        java.lang.String str47 = locale2.getDisplayLanguage(locale5);
        java.lang.String str48 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "java.util.gregoriancalendar[time=10,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=10,zone_offset=0,dst_offset=0]_2022-02-22T07:17:01.652");
        org.junit.Assert.assertEquals(locale5.toString(), "267_CLOCKHOUROFDAY");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ja" + "'", str19, "ja");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(nameProvider23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ja" + "'", str33, "ja");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(nameProvider35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Japanese" + "'", str40, "Japanese");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.util.gregoriancalendar[time=10,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=10,zone_offset=0,dst_offset=0]" + "'", str47, "java.util.gregoriancalendar[time=10,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=10,zone_offset=0,dst_offset=0]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.util.gregoriancalendar[time=10,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=10,zone_offset=0,dst_offset=0]" + "'", str48, "java.util.gregoriancalendar[time=10,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=10,zone_offset=0,dst_offset=0]");
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter6.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withDefaultYear(453);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.parse("2022-02-22T07:22:52.020", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(15120826L);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField6 = copticChronology5.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology5.months();
        boolean boolean8 = localTime1.equals((java.lang.Object) copticChronology5);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.LocalTime localTime11 = localTime1.withMillisOfSecond(167);
        int int12 = localTime11.getMillisOfDay();
        org.joda.time.LocalTime localTime14 = localTime11.minusMillis(1439);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 167 + "'", int12 == 167);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(854, 72120010, 26482918, 26569160, 932, 348, 500);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26569160 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        int int11 = localDate10.getCenturyOfEra();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra(929);
        org.joda.time.LocalDate.Property property14 = localDate10.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        long long11 = durationField8.subtract((long) 846, 964);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3470399154L) + "'", long11 == (-3470399154L));
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = dateTime2.withCenturyOfEra(100);
        int int6 = dateTime2.getCenturyOfEra();
        org.joda.time.DateTime.Property property7 = dateTime2.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        boolean boolean9 = dateTimeField8.isLenient();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream8 = languageRangeList1.stream();
        java.lang.String[] strArray52 = new java.lang.String[] { "CopticChronology[UTC]", "eras", "hi!", "zh-CN", "2022-02-22T07:16:17.933Z", "1737-09-15", "CA", "weekyearOfCentury", "22-Feb-2022 7:16:08 AM", "gregory", "00:00:00.010", "CopticChronology[UTC]", "weekOfWeekyear", "DurationField[minutes]", "gregory", "2022-02-22T07:16:17.933Z", "24", "weekOfWeekyear", "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]", "17", "English (Canada)", "1737-09-15", "00:00:00.010", "fr-CA", "00:00:00.100", "Japanese", "8", "English (Canada)", "weekyearOfCentury", "dayOfMonth", "8", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=339,MONTH=0,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=48,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=-1,MINUTE=26157846,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]", "CA", "8", "1737-09-15", "24", "ja", "weeks", "Canada", "28 Apr 1915 23:16:00 GMT", "1439", "clockhourOfDay", "ko" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList53);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream56 = languageRangeList1.stream();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((java.lang.Object) languageRangeStream56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.stream.ReferencePipeline$Head");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeStream8);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeStream56);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField2 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfEra();
        java.lang.String str4 = copticChronology1.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[UTC]" + "'", str4, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.plusWeeks(17);
        int int9 = localDate8.getWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField11 = copticChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.hourOfHalfday();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology10);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) (short) 10);
        int int16 = localDate15.getWeekyear();
        org.joda.time.LocalDate localDate18 = localDate15.withYear(3);
        org.joda.time.LocalDate localDate20 = localDate18.withCenturyOfEra(510);
        int int21 = localDate8.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate23 = localDate8.plusYears((-1));
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) localDate23);
        org.joda.time.LocalDate.Property property25 = localDate23.era();
        org.joda.time.LocalDate localDate27 = localDate23.plusYears(532);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(668);
        java.util.Date date30 = localDate29.toDate();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1738 + "'", int9 == 1738);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1737 + "'", int16 == 1737);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Nov 12 00:00:00 GMT 2270");
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 4, 2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        int int18 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plusDays(7);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusDays(380);
        org.joda.time.DateTime dateTime24 = localDateTime21.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime21.property(dateTimeFieldType25);
        int int28 = localDateTime20.indexOf(dateTimeFieldType25);
        int[] intArray30 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime20, (long) 305);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43 + "'", int18 == 43);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNull(durationFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1686, 4, 23, 305]");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 631);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology3.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField9 = copticChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfHalfday();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology8);
        int int12 = localDate11.getMonthOfYear();
        org.joda.time.LocalDate.Property property13 = localDate11.weekyear();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        java.util.Locale locale18 = dateTimeFormatter17.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial21 = null;
        int int22 = dateTimeField20.getMaximumValue(readablePartial21);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.lang.String str24 = locale23.toLanguageTag();
        int int25 = dateTimeField20.getMaximumTextLength(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter17.withLocale(locale23);
        java.lang.String str27 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDate11, 11, locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter2.withLocale(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter2.withDefaultYear(21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int32 = dateTimeFormatter2.getPivotYear();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.parse("11");
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str38 = locale36.getDisplayScript(locale37);
        java.lang.String str39 = dateTime34.toString("10", locale36);
        org.joda.time.DateTime dateTime41 = dateTime34.withDayOfYear(345);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.plus(readablePeriod42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.minus(readablePeriod44);
        org.joda.time.DateTime dateTime46 = dateTime45.withLaterOffsetAtOverlap();
        int int47 = dateTime46.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ja" + "'", str24, "ja");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "11" + "'", str27, "11");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10" + "'", str39, "10");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 7 + "'", int47 == 7);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField4 = copticChronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.weekOfWeekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(1);
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        long long23 = dateTimeZone20.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology24 = copticChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone20);
        java.lang.String str27 = dateTimeZone20.getNameKey((long) 2);
        int int29 = dateTimeZone20.getOffset((long) 596);
        int int31 = dateTimeZone20.getOffset((long) 2);
        org.joda.time.DateTime dateTime32 = localDateTime1.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withEra(1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withEra(1);
        int int42 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withEra(1);
        int int47 = localDateTime46.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDateTime46.getFieldType(0);
        boolean boolean50 = localDateTime39.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime39.plusMillis(13);
        org.joda.time.LocalDateTime.Property property53 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime39.minusMonths(255);
        int int56 = localDateTime39.size();
        org.joda.time.LocalDateTime.Property property57 = localDateTime39.dayOfWeek();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTime.Property property60 = dateTime59.minuteOfDay();
        org.joda.time.DateTime.Property property61 = dateTime59.weekyear();
        org.joda.time.DateTime dateTime62 = property61.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime63 = property61.withMinimumValue();
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(241);
        org.joda.time.Instant instant66 = dateTime65.toInstant();
        org.joda.time.Instant instant69 = instant66.withDurationAdded((long) 917, 0);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withEra(1);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(chronology74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.withEra(1);
        int int78 = localDateTime71.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.withEra(1);
        int int83 = localDateTime82.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = localDateTime82.getFieldType(0);
        boolean boolean86 = localDateTime75.isSupported(dateTimeFieldType85);
        int int87 = localDateTime75.getMillisOfSecond();
        int int88 = localDateTime75.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean90 = localDateTime75.isSupported(dateTimeFieldType89);
        int int91 = instant69.get(dateTimeFieldType89);
        int int92 = localDateTime39.indexOf(dateTimeFieldType89);
        boolean boolean93 = dateTimeZone20.isLocalDateTimeGap(localDateTime39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 396 + "'", int87 == 396);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 59 + "'", int91 == 59);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        int int8 = property7.get();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = locale10.getDisplayName();
        boolean boolean13 = locale10.hasExtensions();
        java.lang.String str14 = locale10.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property7.setCopy("1970-02-22T07:20:42.041", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-02-22T07:20:42.041\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (Canada)" + "'", str12, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CA" + "'", str14, "CA");
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.halfdayOfDay();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) 777, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 10);
        int[] intArray7 = copticChronology1.get((org.joda.time.ReadablePartial) localTime5, (long) (byte) 100);
        org.joda.time.DurationField durationField8 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField11 = copticChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.hourOfHalfday();
        org.joda.time.Chronology chronology13 = copticChronology1.withUTC();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        java.lang.Integer int11 = dateTimeFormatter5.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter5.getPrinter();
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra(1);
        int int18 = localDateTime17.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime17.getFieldType(0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plus(readablePeriod21);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField24 = copticChronology23.eras();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.weekOfWeekyear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withEra(1);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra(1);
        int int34 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.Chronology chronology35 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        long long43 = dateTimeZone40.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology44 = copticChronology23.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone40);
        java.lang.String str47 = dateTimeZone40.getNameKey((long) 2);
        org.joda.time.DateTime dateTime48 = localDateTime17.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime50 = dateTime48.minus((long) 26333);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer13, (org.joda.time.ReadableInstant) dateTime50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTC" + "'", str47, "UTC");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = instant3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime8 = dateTime5.withCenturyOfEra(100);
        boolean boolean9 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime5.plusMinutes(513);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property14 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime16 = dateTime5.plusYears((-71997988));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        java.util.Date date1 = new java.util.Date(15780012L);
        java.lang.String str2 = date1.toGMTString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 04:23:00 GMT 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 Jan 1970 04:23:00 GMT" + "'", str2, "1 Jan 1970 04:23:00 GMT");
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.tz.NameProvider nameProvider7 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str11 = nameProvider7.getShortName(locale8, "", "");
        java.lang.String str12 = property5.getAsShortText(locale8);
        org.joda.time.LocalDateTime localDateTime13 = property5.roundHalfEvenCopy();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property5.getDifferenceAsLong(readableInstant14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property5.getFieldType();
        org.joda.time.LocalDateTime localDateTime17 = property5.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property19 = localDateTime17.property(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(nameProvider7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8" + "'", str12, "8");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99398L) + "'", long15 == (-99398L));
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        java.util.Date date7 = dateTime4.toDate();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, 856);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField16.getType();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime21.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfMonth(10);
        org.joda.time.DateTime dateTime28 = dateTime24.minusHours((int) (short) 100);
        int int29 = dateTime28.getCenturyOfEra();
        int int30 = dateTime28.getDayOfMonth();
        java.lang.String str31 = dateTime28.toString();
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(0L, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType17.getField(chronology32);
        int int35 = dateTime10.get(dateTimeFieldType17);
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField38 = copticChronology37.eras();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology37.yearOfEra();
        java.lang.String str40 = copticChronology37.toString();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology37.secondOfMinute();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(26448558L, (org.joda.time.Chronology) copticChronology37);
        boolean boolean43 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.withPeriodAdded(readablePeriod44, 1738);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Feb 22 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17 + "'", int30 == 17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-17T20:00:00.010Z" + "'", str31, "2022-02-17T20:00:00.010Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(copticChronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CopticChronology[UTC]" + "'", str40, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.halfdayOfDay();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) 777, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime3.property(dateTimeFieldType5);
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.LocalTime localTime9 = property6.roundFloorCopy();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfDay(161);
        int int6 = localDateTime2.getYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusWeeks(258);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) chronology9);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        int int16 = property14.getMaximumValue();
        java.lang.Object obj17 = null;
        boolean boolean18 = property14.equals(obj17);
        org.joda.time.LocalDateTime localDateTime20 = property14.addToCopy((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = copticChronology24.seconds();
        org.joda.time.DurationField durationField29 = copticChronology24.halfdays();
        boolean boolean30 = durationFieldType23.isSupported((org.joda.time.Chronology) copticChronology24);
        boolean boolean31 = localDateTime21.isSupported(durationFieldType23);
        java.lang.String str32 = durationFieldType23.getName();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime20.withFieldAdded(durationFieldType23, 777);
        java.lang.String str35 = durationFieldType23.getName();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime2.withFieldAdded(durationFieldType23, 79520744);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "years" + "'", str32, "years");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "years" + "'", str35, "years");
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.weekyears();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology0);
        java.util.Date date5 = new java.util.Date();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        int[] intArray10 = copticChronology0.get((org.joda.time.ReadablePartial) localTime8, (long) 177);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (long) 674, 2000);
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology0.getZone();
        java.lang.String str17 = dateTimeZone15.getShortName(72000010L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Feb 22 07:25:43 GMT 2022");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 177]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 674L + "'", long14 == 674L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Instant instant15 = instant12.withDurationAdded((long) 97, 913);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        java.util.Date date6 = new java.util.Date(616, 404, 202, 690, 764, 255);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Apr 19 06:48:15 GMT 2550");
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        timeZone1.setID("ja");
        timeZone1.setID("eras");
        timeZone1.setRawOffset(52);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("ja");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = timeZone9.getID();
        boolean boolean13 = timeZone1.hasSameRules(timeZone9);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("weekyears");
        boolean boolean16 = timeZone9.hasSameRules(timeZone15);
        boolean boolean17 = timeZone9.observesDaylightTime();
        java.time.ZoneId zoneId18 = timeZone9.toZoneId();
        boolean boolean19 = timeZone9.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645514743613,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=43,MILLISECOND=613,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT" + "'", str12, "GMT");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1645514228463L);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(911);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.addWrapFieldToCopy(20);
        long long8 = property5.remainder();
        java.util.Locale locale11 = new java.util.Locale("Japanese", "10");
        java.lang.String str12 = property5.getAsText(locale11);
        org.joda.time.LocalTime localTime13 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime14 = property5.getLocalTime();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale15.getScript();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale15);
        int int20 = property5.getMaximumTextLength(locale15);
        java.lang.String str21 = property5.toString();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals(locale11.toString(), "japanese_10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645514743632,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=43,MILLISECOND=666,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Property[millisOfDay]" + "'", str21, "Property[millisOfDay]");
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.Chronology chronology7 = localDate3.getChronology();
        org.joda.time.DateTime dateTime8 = localDate3.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime10 = property9.roundCeilingCopy();
        org.joda.time.DurationField durationField11 = property9.getLeapDurationField();
        org.joda.time.DateTime dateTime12 = property9.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(380);
        org.joda.time.DateTime dateTime3 = localDateTime0.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.property(dateTimeFieldType4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.plus(readablePeriod7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        boolean boolean10 = calendar9.isWeekDateSupported();
        calendar9.clear(1);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(740);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology21 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.era();
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.secondOfMinute();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withEra(1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withEra(1);
        int int32 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(1);
        int int37 = localDateTime36.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime36.getFieldType(0);
        boolean boolean40 = localDateTime29.isSupported(dateTimeFieldType39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime29.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getRangeDurationType();
        boolean boolean45 = localDateTime29.isSupported(dateTimeFieldType43);
        int int46 = localDateTime19.get(dateTimeFieldType43);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime13.withField(dateTimeFieldType43, 0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime.Property property50 = localDateTime13.centuryOfEra();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfEra();
        org.joda.time.DateTime dateTime54 = property53.getDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime13.withField(dateTimeFieldType55, 232);
        int int58 = localDateTime0.indexOf(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNull(durationFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=4519543659,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=43,MILLISECOND=693,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        java.lang.String str10 = localDateTime5.toString();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.minusMinutes(1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Instant instant16 = new org.joda.time.Instant(obj15);
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTimeISO();
        long long18 = instant16.getMillis();
        org.joda.time.MutableDateTime mutableDateTime19 = instant16.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTime();
        long long21 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) instant16);
        long long22 = instant16.getMillis();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-22T07:25:43.685" + "'", str10, "2022-02-22T07:25:43.685");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645514743685L + "'", long18 == 1645514743685L);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645514743685L + "'", long22 == 1645514743685L);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime10 = property9.roundCeilingCopy();
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withDurationAdded(readableDuration12, 876);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        java.lang.String str12 = dateTimeField10.getAsText(10598109516296L);
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("ja");
        timeZone15.setID("ja");
        timeZone15.setID("eras");
        timeZone15.setRawOffset((int) (byte) 1);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("ja");
        timeZone23.setID("UTC");
        boolean boolean26 = timeZone15.hasSameRules(timeZone23);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone23);
        java.util.Calendar.Builder builder28 = builder13.setTimeZone(timeZone23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) chronology29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        org.joda.time.tz.NameProvider nameProvider36 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str40 = nameProvider36.getShortName(locale37, "", "");
        java.lang.String str41 = property34.getAsShortText(locale37);
        org.joda.time.tz.NameProvider nameProvider42 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str46 = nameProvider42.getShortName(locale43, "", "");
        java.lang.String str47 = locale37.getDisplayCountry(locale43);
        java.util.Calendar.Builder builder48 = builder13.setLocale(locale37);
        int int49 = dateTimeField10.getMaximumTextLength(locale37);
        int int51 = dateTimeField10.getMaximumValue(0L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514743711,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=43,MILLISECOND=711,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(nameProvider36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "8" + "'", str41, "8");
        org.junit.Assert.assertNotNull(nameProvider42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Canada" + "'", str47, "Canada");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 30 + "'", int51 == 30);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtMidnight(dateTimeZone5);
        int int7 = dateTime6.getEra();
        int int8 = dateTime6.getYear();
        int int9 = dateTime6.getDayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1738 + "'", int8 == 1738);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate7 = localDate5.minusDays(11);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtStartOfDay(dateTimeZone10);
        java.lang.String str12 = dateTimeZone10.getID();
        boolean boolean14 = dateTimeZone10.isStandardOffset(81794400012L);
        boolean boolean16 = dateTimeZone10.isStandardOffset(1645514493728L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) chronology5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.property(dateTimeFieldType11);
        boolean boolean13 = dateTime2.isSupported(dateTimeFieldType11);
        org.joda.time.DateTime.Property property14 = dateTime2.weekyear();
        org.joda.time.DateTime.Property property15 = dateTime2.millisOfSecond();
        boolean boolean17 = dateTime2.isEqual(0L);
        org.joda.time.DateTime.Property property18 = dateTime2.millisOfDay();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int int7 = dateTimeField5.getMaximumValue(readablePartial6);
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale8.toLanguageTag();
        int int10 = dateTimeField5.getMaximumTextLength(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale8);
        java.lang.String str12 = locale8.getISO3Language();
        java.lang.String str13 = locale8.getLanguage();
        java.lang.String str15 = locale8.getExtension('a');
        java.lang.String str16 = locale8.getDisplayLanguage();
        java.lang.String str17 = locale8.toString();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ja" + "'", str9, "ja");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jpn" + "'", str12, "jpn");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ja" + "'", str13, "ja");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Japanese" + "'", str16, "Japanese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ja" + "'", str17, "ja");
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusMinutes((int) 'u');
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withPeriodAdded(readablePeriod16, 182);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusHours(625);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks(405);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone17);
        java.lang.String str24 = dateTimeZone17.getName((long) 72);
        int int26 = dateTimeZone17.getOffsetFromLocal((long) 6);
        long long28 = dateTimeZone17.convertUTCToLocal((long) 169);
        long long31 = dateTimeZone17.convertLocalToUTC((long) 692, true);
        java.lang.String str33 = dateTimeZone17.getNameKey(26184082L);
        long long36 = dateTimeZone17.adjustOffset((long) 626, true);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 169L + "'", long28 == 169L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 692L + "'", long31 == 692L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 626L + "'", long36 == 626L);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        boolean boolean6 = dateTime2.equals((java.lang.Object) 10);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths(117);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime2.getZone();
        org.joda.time.DateTime.Property property10 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField13 = copticChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.halfdayOfDay();
        org.joda.time.Chronology chronology17 = copticChronology12.withUTC();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        int int26 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.Chronology chronology27 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusMinutes((int) 'u');
        long long34 = copticChronology12.set((org.joda.time.ReadablePartial) localDateTime28, (-9936000000L));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra(1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        boolean boolean41 = localDateTime38.isAfter((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean43 = localDateTime38.isSupported(dateTimeFieldType42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime28.property(dateTimeFieldType42);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        boolean boolean46 = dateTime11.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime dateTime48 = dateTime11.withWeekyear(841);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = dateTime11.toString("2022-02-22T14:39:33.742");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10598109943836L + "'", long34 == 10598109943836L);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property5.getLocalTime();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime10.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfMonth(10);
        org.joda.time.DateTime dateTime17 = dateTime13.minusHours((int) (short) 100);
        int int18 = dateTime17.getCenturyOfEra();
        int int19 = dateTime17.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean21 = dateTime17.isSupported(dateTimeFieldType20);
        boolean boolean22 = localTime8.isSupported(dateTimeFieldType20);
        java.lang.String str23 = localTime8.toString();
        org.joda.time.LocalTime localTime25 = localTime8.withMillisOfDay(1439);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = localTime27.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00:00:00.010" + "'", str23, "00:00:00.010");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate.Property property9 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy(725);
        int int12 = property9.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime1.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime1.withMinuteOfHour((int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField7 = copticChronology6.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.weekOfWeekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        long long26 = dateTimeZone23.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology27 = copticChronology6.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone23);
        java.lang.String str30 = dateTimeZone23.getNameKey((long) 2);
        int int32 = dateTimeZone23.getOffset((long) 596);
        int int34 = dateTimeZone23.getOffset((long) 2);
        java.lang.String str36 = dateTimeZone23.getNameKey((long) 887);
        org.joda.time.DateTime dateTime37 = dateTime5.withZone(dateTimeZone23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.plusWeeks(17);
        int int9 = localDate8.getWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField11 = copticChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.hourOfHalfday();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology10);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) (short) 10);
        int int16 = localDate15.getWeekyear();
        org.joda.time.LocalDate localDate18 = localDate15.withYear(3);
        org.joda.time.LocalDate localDate20 = localDate18.withCenturyOfEra(510);
        int int21 = localDate8.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate23 = localDate8.plusYears((-1));
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) localDate23);
        org.joda.time.LocalDate.Property property25 = localDate23.era();
        int int26 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate localDate28 = localDate23.withWeekyear(541);
        int int29 = localDate23.getWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1738 + "'", int9 == 1738);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1737 + "'", int16 == 1737);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1737 + "'", int29 == 1737);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = dateTime2.withCenturyOfEra(100);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(0);
        boolean boolean14 = dateTime2.isSupported(dateTimeFieldType13);
        org.joda.time.DateTime dateTime16 = dateTime2.withMillis((long) (short) 1);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DateTime dateTime19 = dateTime16.minusYears(970);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded(readableDuration20, 797);
        int int23 = dateTime22.getDayOfWeek();
        int int24 = dateTime22.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime22.withSecondOfMinute(263);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 263 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.DurationField durationField8 = dateTimeField6.getRangeDurationField();
        int int11 = durationField8.getValue((long) 26611, (long) 917);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getStandardOffset((long) 2565);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = copticChronology1.seconds();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 32, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfEra();
        boolean boolean10 = copticChronology1.equals((java.lang.Object) dateTime8);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.hourOfDay();
        org.joda.time.Chronology chronology13 = copticChronology1.withUTC();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        long long3 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Chronology chronology6 = instant1.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfMonth();
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514743965L + "'", long3 == 1645514743965L);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        java.lang.String str7 = localDate5.toString();
        org.joda.time.LocalDate localDate9 = localDate5.withDayOfYear(9);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(742);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(444);
        org.joda.time.LocalDate localDate15 = localDate11.withWeekyear(72120010);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears(472);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1737-09-15" + "'", str7, "1737-09-15");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=-9936000,MONTH=497,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=70,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=20,SECOND=6,MILLISECOND=923,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withDefaultYear(1);
        java.util.Locale locale9 = dateTimeFormatter5.getLocale();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = locale10.getDisplayName();
        boolean boolean13 = locale10.hasExtensions();
        java.util.Locale.setDefault(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter5.withLocale(locale10);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.minuteOfDay();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime24 = localTime22.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfDay();
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.LocalTime localTime28 = property25.setCopy("59", locale27);
        java.lang.String str29 = dateTimeField19.getAsText((long) (-1), locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter15.withLocale(locale27);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale27);
        calendar31.set(626, 72, 155, 450, 720);
        calendar31.set(0, 481, 736);
        java.util.TimeZone timeZone42 = calendar31.getTimeZone();
        java.util.TimeZone timeZone43 = calendar31.getTimeZone();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (Canada)" + "'", str12, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1439" + "'", str29, "1439");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(calendar31);
// flaky:         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=481,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=736,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=450,MINUTE=720,SECOND=44,MILLISECOND=29,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1932);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.LocalDate.Property property5 = localDate3.weekyear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfFloorCopy();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate6.weekyear();
        org.joda.time.LocalDate.Property property9 = localDate6.weekyear();
        org.joda.time.LocalDate localDate11 = localDate6.withCenturyOfEra(598);
        org.joda.time.LocalDate.Property property12 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate14 = localDate6.withYear(979);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        boolean boolean9 = dateTimeFieldType2.isSupported(chronology8);
        int int10 = localDateTime1.get(dateTimeFieldType2);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = property11.addWrapFieldToCopy(902);
        org.joda.time.LocalDateTime localDateTime14 = property11.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime16 = property11.setCopy("25");
        org.joda.time.LocalDateTime localDateTime17 = property11.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime7 = localTime5.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        org.joda.time.LocalTime localTime11 = property8.setCopy("0", locale10);
        java.lang.String str12 = locale10.getISO3Language();
        java.util.Locale.Builder builder13 = builder3.setLocale(locale10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime17 = localTime15.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        org.joda.time.LocalTime localTime21 = property18.setCopy("0", locale20);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField24 = copticChronology23.eras();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology23.weekyearOfCentury();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) 388, (org.joda.time.Chronology) copticChronology23);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology23.weekyearOfCentury();
        long long31 = dateTimeField29.roundHalfCeiling((long) 32);
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        int int34 = dateTimeField29.getMaximumTextLength(locale32);
        java.lang.String str35 = locale32.getLanguage();
        java.lang.String str36 = locale20.getDisplayScript(locale32);
        java.util.Locale.Builder builder37 = builder3.setLocale(locale32);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra" + "'", str12, "fra");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-9936000000L) + "'", long31 == (-9936000000L));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "it" + "'", str35, "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str4 = nameProvider0.getShortName(locale1, "", "");
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int int8 = dateTimeField6.getMaximumValue(readablePartial7);
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.lang.String str10 = locale9.toLanguageTag();
        int int11 = dateTimeField6.getMaximumTextLength(locale9);
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str16 = nameProvider12.getShortName(locale13, "", "");
        java.lang.String str17 = locale9.getDisplayName(locale13);
        java.lang.String str20 = nameProvider0.getShortName(locale13, "11", "English (Canada)");
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale13);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja" + "'", str10, "ja");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645514744068,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=102,ZONE_OFFSET=34,DST_OFFSET=0]");
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(161);
        org.joda.time.DateTime dateTime5 = dateTime1.minus((long) 11);
        org.joda.time.DateTime dateTime7 = dateTime1.plusYears(24);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        calendar9.setLenient(true);
        java.time.Instant instant13 = calendar9.toInstant();
        calendar9.clear();
        long long15 = calendar9.getTimeInMillis();
        java.time.Instant instant16 = calendar9.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("5 Oct 1737 23:59:59 GMT", (double) 167);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=167.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("11");
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        java.lang.String str4 = dateTime1.toString("\u65e5\u6587");
        org.joda.time.DateMidnight dateMidnight5 = dateTime1.toDateMidnight();
        org.joda.time.DateTime dateTime7 = dateTime1.minusYears(6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded(readableDuration8, (int) (short) 100);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = instant11.toDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withSecondOfMinute(2);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime15.era();
        org.joda.time.DateMidnight dateMidnight18 = dateTime15.toDateMidnight();
        int int19 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property20 = dateTime10.weekOfWeekyear();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = dateTime21.withDayOfYear(23);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u65e5\u6587" + "'", str4, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        int int9 = dateTime8.getCenturyOfEra();
        boolean boolean10 = dateTime8.isEqualNow();
        org.joda.time.DateTime dateTime12 = dateTime8.withMillisOfDay((int) (short) 10);
        org.joda.time.DateTime.Property property13 = dateTime8.secondOfMinute();
        org.joda.time.DateTime dateTime15 = property13.addToCopy((long) 4);
        long long16 = dateTime15.getMillis();
        java.util.Locale locale20 = new java.util.Locale("22-Feb-2000 7:18:59 AM", "DateTimeField[clockhourOfHalfday]", "English (Canada)");
        java.util.Calendar calendar21 = dateTime15.toCalendar(locale20);
        java.util.Date date22 = calendar21.getTime();
        int int23 = date22.getMonth();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1645128004010L + "'", long16 == 1645128004010L);
        org.junit.Assert.assertEquals(locale20.toString(), "22-feb-2000 7:18:59 am_DATETIMEFIELD[CLOCKHOUROFHALFDAY]_English (Canada)");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645128004010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=48,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=0,SECOND=4,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Feb 17 20:00:04 GMT 2022");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime8 = localTime6.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        org.joda.time.LocalTime localTime12 = property9.setCopy("0", locale11);
        int[] intArray14 = copticChronology0.get((org.joda.time.ReadablePartial) localTime12, 26184082L);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime16.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfMonth(10);
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay23 = dateTime21.toTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean25 = dateTime21.isSupported(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property26 = localTime12.property(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property27 = localTime12.millisOfSecond();
        org.joda.time.LocalTime localTime29 = property27.setCopy(626);
        org.joda.time.LocalTime localTime31 = localTime29.minusHours(753);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str33 = dateTimeFieldType32.getName();
        boolean boolean34 = localTime31.isSupported(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[7, 16, 24, 82]");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "yearOfEra" + "'", str33, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = property7.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDurationAdded(readableDuration10, 93);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        int int14 = localDateTime12.size();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        int int26 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        int int27 = localDateTime23.getMillisOfSecond();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withEra(1);
        int int32 = localDateTime31.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = localDateTime31.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime23.withField(dateTimeFieldType34, 7);
        int[] intArray38 = chronology16.get((org.joda.time.ReadablePartial) localDateTime36, (long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withDayOfYear((int) '4');
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.parse("11");
        java.util.Locale locale46 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str48 = locale46.getDisplayScript(locale47);
        java.lang.String str49 = dateTime44.toString("10", locale46);
        java.lang.String str50 = locale46.getCountry();
        java.lang.String str51 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime40, 26257954, locale46);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfEra();
        org.joda.time.DateTime dateTime55 = property54.getDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        boolean boolean57 = localDateTime40.isSupported(dateTimeFieldType56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime40.dayOfYear();
        org.joda.time.DurationField durationField59 = property58.getDurationField();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 167 + "'", int27 == 167);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1970, 1, 1, 10]");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "10" + "'", str49, "10");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "CA" + "'", str50, "CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "26257954" + "'", str51, "26257954");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(durationField59);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        java.util.Date date0 = new java.util.Date();
        date0.setYear(605);
        java.time.Instant instant3 = date0.toInstant();
        java.util.Date date4 = java.util.Date.from(instant3);
        date4.setMinutes(27327666);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Sun Feb 22 07:25:44 GMT 2505");
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sun Feb 06 20:06:44 GMT 2557");
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.LocalTime localTime9 = dateTime6.toLocalTime();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localTime9.getFieldTypes();
        org.joda.time.LocalTime localTime12 = localTime9.minusSeconds((int) 'u');
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday();
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays(23);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.DateTime dateTime20 = property17.setCopy(455);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-22T00:00:00.010Z" + "'", str14, "2022-02-22T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.halfdayOfDay();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) 777, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField4 = copticChronology1.eras();
        java.lang.String str5 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.centuryOfEra();
        org.joda.time.Chronology chronology8 = copticChronology1.withUTC();
        long long12 = copticChronology1.add(166679L, (long) 316, 451);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[UTC]" + "'", str5, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 309195L + "'", long12 == 309195L);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(161);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury(70);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(185);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology17 = localDateTime13.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.DurationFieldType durationFieldType19 = durationField18.getType();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.minuteOfDay();
        boolean boolean25 = durationFieldType19.isSupported((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology20.monthOfYear();
        org.joda.time.DateTime dateTime28 = dateTime7.toDateTime((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DateTime dateTime29 = dateTime28.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(0);
        boolean boolean16 = localDateTime5.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withMillisOfDay(0);
        int int19 = localDateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime5.minusDays(860);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMillisOfSecond(4);
        int int24 = localDateTime23.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDayOfYear(1719);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1719 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 243 + "'", int19 == 243);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusHours(26157846);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withCenturyOfEra((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks(359);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(777);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        boolean boolean6 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property23 = localDateTime5.secondOfMinute();
        org.joda.time.LocalDateTime.Property property24 = localDateTime5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withEra(1);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra(1);
        int int34 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.Chronology chronology35 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfMinute();
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        long long41 = dateTimeField37.set((long) 10, "8", locale40);
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str43 = locale40.getDisplayCountry();
        int int44 = property24.getMaximumShortTextLength(locale40);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8010L + "'", long41 == 8010L);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Canada" + "'", str43, "Canada");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property7 = localDate3.dayOfMonth();
        org.joda.time.LocalDate localDate9 = localDate3.plusMonths(27481819);
        org.joda.time.LocalDate.Property property10 = localDate3.era();
        int int11 = localDate3.getYearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1738 + "'", int11 == 1738);
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        int int7 = localDate5.getEra();
        org.joda.time.LocalDate localDate9 = localDate5.minusMonths(53);
        int int10 = localDate9.getDayOfYear();
        int int11 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate13 = localDate9.minusYears(8);
        org.joda.time.LocalDate.Property property14 = localDate9.era();
        org.joda.time.LocalDate localDate15 = property14.withMaximumValue();
        java.util.Date date16 = localDate15.toDate();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        boolean boolean18 = calendar17.isWeekDateSupported();
        calendar17.clear(1);
        java.util.Date date21 = calendar17.getTime();
        date21.setMonth(683);
        date21.setMonth(21599842);
        date21.setMonth(999);
        java.lang.String str28 = date21.toGMTString();
        boolean boolean29 = date16.before(date21);
        java.util.Date date35 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date35.setSeconds(20);
        int int38 = date35.getDay();
        date35.setYear((int) (byte) -1);
        java.util.Date date46 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date46.setSeconds(20);
        int int49 = date46.getDay();
        date46.setYear((int) (byte) -1);
        int int52 = date46.getMonth();
        boolean boolean53 = date35.before(date46);
        int int54 = date35.getDay();
        date35.setYear(32769);
        boolean boolean57 = date16.after(date35);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 225 + "'", int10 == 225);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Aug 15 00:00:00 GMT 1733");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=4519544298,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=?,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=332,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Apr 22 07:25:44 GMT 1802095");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "22 Apr 1802095 07:25:44 GMT" + "'", str28, "22 Apr 1802095 07:25:44 GMT");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Apr 28 23:16:20 GMT 34669");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Apr 28 23:16:20 GMT 1899");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 4, 2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.secondOfMinute();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) chronology17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusHours((int) (byte) 1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra(1);
        int int29 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime21.plus(readablePeriod30);
        int int32 = localDateTime21.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime21.plusHours((int) (short) 10);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundHalfEvenCopy();
        int[] intArray37 = localDateTime36.getValues();
        copticChronology0.validate((org.joda.time.ReadablePartial) localDateTime14, intArray37);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 53 + "'", int32 == 53);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[117, 2, 22, 0]");
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalTime localTime2 = localTime0.plus(readablePeriod1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = property3.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalTime localTime6 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime8.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth(10);
        org.joda.time.DateTime dateTime15 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        boolean boolean17 = dateTime11.isAfter(readableInstant16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.plus(readablePeriod18);
        long long20 = dateTime11.getMillis();
        int int21 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime23 = dateTime11.plusMinutes((-52));
        boolean boolean24 = localTime6.equals((java.lang.Object) (-52));
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645488000010L + "'", long20 == 1645488000010L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfWeek();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = localDate0.toString("437", locale5);
        org.joda.time.LocalDate.Property property7 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate9 = localDate0.withEra(0);
        int int10 = localDate0.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "437" + "'", str6, "437");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
        java.util.Date date5 = new java.util.Date(419, 485, 626, 887, 1200);
        int int6 = date5.getMinutes();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 24 19:00:00 GMT 2361");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "eras");
        java.util.Locale.Builder builder6 = builder5.clear();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField8 = copticChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.halfdayOfDay();
        long long14 = dateTimeField12.roundHalfFloor((long) 7);
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale16);
        java.lang.String str18 = locale16.getDisplayName();
        boolean boolean19 = locale16.hasExtensions();
        java.lang.String str20 = locale16.getCountry();
        java.lang.String str21 = locale16.getDisplayName();
        java.lang.String str22 = dateTimeField12.getAsShortText(11, locale16);
        java.util.Locale.Builder builder23 = builder5.setLocale(locale16);
        java.util.Set<java.lang.String> strSet24 = locale16.getUnicodeLocaleKeys();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale16);
        int int26 = calendar25.getWeekYear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English (Canada)" + "'", str18, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CA" + "'", str20, "CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English (Canada)" + "'", str21, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "11" + "'", str22, "11");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645514744371,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=405,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        int int5 = timeZone3.getOffset((long) 738);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone3.getOffset(972, 815, 860, (int) 'u', 30, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime3 = property1.withMaximumValue();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) chronology5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str16 = nameProvider12.getShortName(locale13, "", "");
        java.lang.String str17 = property10.getAsShortText(locale13);
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str22 = nameProvider18.getShortName(locale19, "", "");
        java.lang.String str23 = locale13.getDisplayCountry(locale19);
        org.joda.time.LocalDateTime localDateTime24 = property1.setCopy("26269666", locale19);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.era();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField29 = localDateTime24.getField(634);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 634");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8" + "'", str17, "8");
        org.junit.Assert.assertNotNull(nameProvider18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Canada" + "'", str23, "Canada");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1645514275838L);
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusWeeks(634);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        boolean boolean6 = property5.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        long long15 = dateTimeField11.set((long) 10, "8", locale14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        boolean boolean22 = localDateTime19.isAfter((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean24 = localDateTime19.isSupported(dateTimeFieldType23);
        int int25 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.minusMonths(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localDateTime27.getFields();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 8010L + "'", long15 == 8010L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfYear();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.halfdays();
        long long15 = durationField12.getMillis(1L, 604800981L);
        long long17 = durationField12.getValueAsLong((long) (short) 0);
        long long20 = durationField12.add((long) 477, 0);
        org.joda.time.DurationFieldType durationFieldType21 = durationField12.getType();
        boolean boolean22 = durationField12.isPrecise();
        boolean boolean23 = durationField12.isSupported();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 43200000L + "'", long15 == 43200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 477L + "'", long20 == 477L);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(90);
        boolean boolean3 = dateTimeZone1.isStandardOffset(1645514700538L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.LocalTime localTime9 = dateTime6.toLocalTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.plus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra(35);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readablePeriod9);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        java.lang.String str14 = dateTime10.toString();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-10T00:00:00.010Z" + "'", str14, "2022-02-10T00:00:00.010Z");
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        int int6 = localDateTime3.getSecondOfMinute();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) chronology7);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = property12.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property12.addToCopy((long) 7);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        boolean boolean17 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime15);
        int int18 = localDateTime15.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 44 + "'", int6 == 44);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) chronology5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.property(dateTimeFieldType11);
        boolean boolean13 = dateTime2.isSupported(dateTimeFieldType11);
        org.joda.time.DateTime.Property property14 = dateTime2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime2.minus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundFloorCopy();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime11 = dateTime8.plusYears(15);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTimeISO();
        org.joda.time.Chronology chronology13 = mutableDateTime12.getChronology();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property5.getLocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalTime localTime6 = localTime3.withField(dateTimeFieldType4, (int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime3.minus(readablePeriod7);
        org.joda.time.LocalTime.Property property9 = localTime3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        java.lang.String str11 = dateTimeField10.toString();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateTimeField[hourOfDay]" + "'", str11, "DateTimeField[hourOfDay]");
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        long long17 = dateTimeZone14.convertLocalToUTC((long) '#', false);
        long long19 = dateTimeZone14.nextTransition((long) 510);
        java.lang.String str21 = dateTimeZone14.getShortName((long) 165);
        long long25 = dateTimeZone14.convertLocalToUTC(734399999L, false, (long) 100);
        java.lang.String str27 = dateTimeZone14.getShortName((long) 1202);
        long long29 = dateTimeZone14.convertUTCToLocal(1645514432987L);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 510L + "'", long19 == 510L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 734399999L + "'", long25 == 734399999L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1645514432987L + "'", long29 == 1645514432987L);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'u', (org.joda.time.Chronology) copticChronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) chronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusYears(940);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minusSeconds(293);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.minusHours(489);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("UTC");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.setRegion("ca");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension(' ', "2022-02-22T07:25:32.741Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
        java.util.Date date5 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date5.setSeconds(20);
        int int8 = date5.getDay();
        date5.setYear((int) (byte) -1);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.LocalTime localTime13 = localTime11.minusMinutes(570);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Apr 28 23:16:20 GMT 1899");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfYear();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(377);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.weekOfWeekyear();
        int int5 = localDateTime1.getCenturyOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        int int10 = localDateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withField(dateTimeFieldType12, 2922728);
        int int15 = localDateTime1.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plusMonths(374);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.plus(readablePeriod18);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate localDate10 = localDate8.withCenturyOfEra(510);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury(3);
        org.joda.time.LocalDate.Property property13 = localDate12.centuryOfEra();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getDisplayName();
        boolean boolean17 = locale14.hasExtensions();
        boolean boolean18 = localDate12.equals((java.lang.Object) locale14);
        int int19 = localDate12.getYearOfEra();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.parse("11");
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = dateTime22.toString("10", locale24);
        java.util.Set<java.lang.String> strSet28 = locale24.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet29 = locale24.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet30 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str31 = localDate12.toString("2022-02-22", locale24);
        java.lang.String str32 = locale24.getCountry();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English (Canada)" + "'", str16, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50903 + "'", int19 == 50903);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-22" + "'", str31, "2022-02-22");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CA" + "'", str32, "CA");
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        timeZone1.setID("ja");
        timeZone1.setID("eras");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone1);
        long long7 = calendar6.getTimeInMillis();
        calendar6.setFirstDayOfWeek(117);
        int int10 = calendar6.getMinimalDaysInFirstWeek();
        java.time.Instant instant11 = calendar6.toInstant();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645514744610,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"eras\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=117,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=610,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645514744610L + "'", long7 == 1645514744610L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(80509334400000L);
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.YearMonthDay yearMonthDay5 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime.Property property6 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(496);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        gregorianCalendar11.set(1226580000, 632, 729);
        long long16 = gregorianCalendar11.getTimeInMillis();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1813577594524441431L + "'", long16 == 1813577594524441431L);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-22T07:18:42.625");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate localDate10 = localDate8.withCenturyOfEra(510);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate10.plus(readablePeriod12);
        org.joda.time.LocalDate localDate15 = localDate10.plusWeeks(433);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(18);
        org.joda.time.LocalDate.Property property18 = localDate15.dayOfWeek();
        org.joda.time.LocalDate localDate19 = property18.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate20 = property18.roundCeilingCopy();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        java.lang.String[] strArray2 = new java.lang.String[] { "English (Canada)", "English (Canada)" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.Object[] objArray5 = strSet3.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale17.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale22.getDisplayName();
        boolean boolean25 = locale22.hasExtensions();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale14, locale15, locale16, locale17, locale20, locale21, locale22 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        boolean boolean31 = strSet3.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField33 = copticChronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology32.hourOfHalfday();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology32);
        org.joda.time.LocalDate localDate37 = localDate35.minusMonths((int) (short) 10);
        int int38 = localDate37.getWeekyear();
        org.joda.time.LocalDate localDate40 = localDate37.withYear(3);
        org.joda.time.LocalDate.Property property41 = localDate37.year();
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale locale44 = builder42.build();
        int int45 = property41.getMaximumTextLength(locale44);
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleKeys();
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet46);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream48 = languageRangeList7.stream();
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = instant49.toDateTime(dateTimeZone50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfEra();
        org.joda.time.DateTime.Property property53 = dateTime51.millisOfDay();
        boolean boolean55 = dateTime51.equals((java.lang.Object) 10);
        org.joda.time.DateTime.Property property56 = dateTime51.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime59 = dateTime51.withDurationAdded(readableDuration57, 857);
        org.joda.time.DateTimeZone dateTimeZone60 = dateTime51.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) languageRangeStream48, dateTimeZone60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.stream.ReferencePipeline$Head");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[English (Canada)]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[English (Canada)]");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English (Canada)" + "'", str19, "English (Canada)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English (Canada)" + "'", str24, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(copticChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1737 + "'", int38 == 1737);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(languageRangeStream48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime4 = property2.addToCopy(302);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.Chronology chronology14 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        java.lang.String str20 = dateTimeZone19.getID();
        java.lang.String str22 = dateTimeZone19.getNameKey((long) (short) -1);
        long long24 = dateTimeZone19.previousTransition((long) 388);
        java.lang.String str26 = dateTimeZone19.getShortName((-2349143L));
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField28 = copticChronology27.eras();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.weekOfWeekyear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra(1);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withEra(1);
        int int38 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.Chronology chronology39 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        long long47 = dateTimeZone44.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology48 = copticChronology27.withZone(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone44);
        java.lang.String str51 = dateTimeZone44.getName((long) 72);
        int int53 = dateTimeZone44.getOffsetFromLocal((long) 6);
        long long55 = dateTimeZone44.convertUTCToLocal((long) 169);
        long long58 = dateTimeZone44.convertLocalToUTC((long) 692, true);
        java.lang.String str60 = dateTimeZone44.getNameKey(26184082L);
        boolean boolean62 = dateTimeZone44.isStandardOffset((long) 31);
        long long64 = dateTimeZone44.convertUTCToLocal((-2760L));
        long long66 = dateTimeZone19.getMillisKeepLocal(dateTimeZone44, (long) 327);
        org.joda.time.DateTime dateTime67 = dateTime4.toDateTime(dateTimeZone44);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 388L + "'", long24 == 388L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 169L + "'", long55 == 169L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 692L + "'", long58 == 692L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-2760L) + "'", long64 == (-2760L));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 327L + "'", long66 == 327L);
        org.junit.Assert.assertNotNull(dateTime67);
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("11");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = dateTime1.toString("10", locale3);
        org.joda.time.DateTime dateTime8 = dateTime1.withDayOfYear(345);
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.weekOfWeekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra(1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.Chronology chronology23 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        long long31 = dateTimeZone28.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology32 = copticChronology11.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone28);
        java.lang.String str35 = dateTimeZone28.getName((long) 72);
        long long37 = dateTimeZone28.nextTransition((long) 10);
        java.lang.String str38 = dateTimeZone28.toString();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) calendar10, dateTimeZone28);
        long long40 = calendar10.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            calendar10.add(45, 689);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61790342400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=11,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=347,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-61790342400000L) + "'", long40 == (-61790342400000L));
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        int int4 = localTime1.size();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property5.getLocalTime();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime10.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfMonth(10);
        org.joda.time.DateTime dateTime17 = dateTime13.minusHours((int) (short) 100);
        int int18 = dateTime17.getCenturyOfEra();
        int int19 = dateTime17.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean21 = dateTime17.isSupported(dateTimeFieldType20);
        boolean boolean22 = localTime8.isSupported(dateTimeFieldType20);
        java.lang.String str23 = localTime8.toString();
        org.joda.time.LocalTime localTime25 = localTime8.withMillisOfDay(1439);
        org.joda.time.LocalTime.Property property26 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property26.addWrapFieldToCopy(939);
        org.joda.time.LocalTime localTime29 = property26.withMaximumValue();
        org.joda.time.LocalTime localTime30 = property26.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = localTime30.withHourOfDay(26565506);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26565506 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00:00:00.010" + "'", str23, "00:00:00.010");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) '#', 17);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant3.plus(readableDuration4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant5.withDurationAdded(readableDuration6, 692);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str13 = dateTimeFieldType12.getName();
        int int14 = instant8.get(dateTimeFieldType12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant8.minus(readableDuration15);
        org.joda.time.MutableDateTime mutableDateTime17 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime18 = instant8.toDateTimeISO();
        org.joda.time.DateTime dateTime19 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property20 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime23 = property20.addToCopy(634);
        org.joda.time.DateTime dateTime24 = property20.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime26 = property20.addToCopy(168);
        org.joda.time.DateTime dateTime27 = property20.roundCeilingCopy();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "weekyearOfCentury" + "'", str13, "weekyearOfCentury");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        timeZone1.setID("UTC");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        calendar5.setTimeInMillis(466L);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514744745,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=745,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=466,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=466,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withDefaultYear(1);
        java.util.Locale locale9 = dateTimeFormatter5.getLocale();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = locale10.getDisplayName();
        boolean boolean13 = locale10.hasExtensions();
        java.util.Locale.setDefault(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter5.withLocale(locale10);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.minuteOfDay();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime24 = localTime22.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfDay();
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.LocalTime localTime28 = property25.setCopy("59", locale27);
        java.lang.String str29 = dateTimeField19.getAsText((long) (-1), locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter15.withLocale(locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter15.withZoneUTC();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("ja");
        boolean boolean34 = timeZone33.observesDaylightTime();
        boolean boolean35 = timeZone33.observesDaylightTime();
        java.util.Locale locale38 = new java.util.Locale("2022-02-22T07:18:54.771Z", "26232032");
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone33, locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter31.withLocale(locale38);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (Canada)" + "'", str12, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1439" + "'", str29, "1439");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals(locale38.toString(), "2022-02-22t07:18:54.771z_26232032");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1645514744752,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=752,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(86300612, 633);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 633");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        java.lang.String str10 = localDateTime5.toString();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.minusMinutes(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusSeconds(598);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        int int18 = localDateTime16.getEra();
        int[] intArray19 = localDateTime16.getValues();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-22T07:25:44.784" + "'", str10, "2022-02-22T07:25:44.784");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2022, 2, 9, 27342784]");
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        int int1 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfMonth(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(161);
        org.joda.time.DateTime dateTime5 = dateTime1.minus((long) 11);
        org.joda.time.DateTime dateTime7 = dateTime1.plusYears(24);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        int int10 = dateTime7.getYearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField13 = copticChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.hourOfHalfday();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.year();
        org.joda.time.DurationField durationField18 = copticChronology12.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.weekOfWeekyear();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale21.getDisplayName();
        boolean boolean24 = locale21.hasExtensions();
        java.lang.String str25 = locale21.getCountry();
        java.lang.String str26 = locale21.getDisplayVariant();
        java.lang.String str27 = locale21.getDisplayLanguage();
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale28.getDisplayScript(locale29);
        java.lang.String str31 = locale21.getDisplayName(locale29);
        java.lang.String str32 = locale29.getDisplayVariant();
        java.lang.String str33 = dateTimeField19.getAsText((long) 575, locale29);
        boolean boolean34 = locale29.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dateTime7.toString("", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=2402897144808,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2046,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=808,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2046 + "'", int10 == 2046);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English (Canada)" + "'", str23, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CA" + "'", str25, "CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str31, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "17" + "'", str33, "17");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(161);
        org.joda.time.DateTime dateTime5 = dateTime1.minus((long) 11);
        org.joda.time.DateTime dateTime7 = dateTime1.plusYears(24);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("ja");
        java.time.ZoneId zoneId12 = timeZone11.toZoneId();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone(zoneId12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId12);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId12);
        calendar9.setTimeZone(timeZone15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfMonth(10);
        int int24 = dateTime23.getCenturyOfEra();
        org.joda.time.DateTime.Property property25 = dateTime23.yearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology26.minutes();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology26.clockhourOfDay();
        int int30 = dateTime23.get(dateTimeField29);
        long long33 = dateTimeField29.add(2022L, 26184082L);
        boolean boolean34 = calendar9.before((java.lang.Object) 26184082L);
        java.util.Date date35 = calendar9.getTime();
        java.time.Instant instant36 = calendar9.toInstant();
        int int37 = calendar9.getMinimalDaysInFirstWeek();
        java.util.Locale locale42 = new java.util.Locale("2022-02-22T07:20:37.788Z", "2022-02-22T07:18:02.522Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = calendar9.getDisplayName(115, 927, locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=2402897144822,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2046,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=822,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 94262695202022L + "'", long33 == 94262695202022L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Thu Feb 22 07:25:44 GMT 2046");
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals(locale42.toString(), "2022-02-22t07:20:37.788z_2022-02-22T07:18:02.522Z");
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withSecondOfMinute(2);
        org.joda.time.DateTime.Property property5 = dateTime2.weekOfWeekyear();
        java.util.Date date11 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date11.setSeconds(20);
        int int14 = date11.getDay();
        date11.setYear((int) (byte) -1);
        java.util.Date date22 = new java.util.Date(7, (int) (short) 100, (-1), (int) (byte) -1, 16);
        date22.setSeconds(20);
        int int25 = date22.getDay();
        date22.setYear((int) (byte) -1);
        int int28 = date22.getMonth();
        boolean boolean29 = date11.before(date22);
        int int30 = date11.getDay();
        boolean boolean31 = property5.equals((java.lang.Object) int30);
        int int32 = property5.get();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Apr 28 23:16:20 GMT 1899");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Apr 28 23:16:20 GMT 1899");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("eng");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) chronology4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        long long27 = dateTimeField23.set((long) 10, "8", locale26);
        int int28 = property10.getMaximumShortTextLength(locale26);
        java.util.Locale.Builder builder29 = builder1.setLocale(locale26);
        java.util.Locale.Builder builder30 = builder1.clear();
        java.util.Locale.Builder builder31 = builder1.clear();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("ja");
        timeZone33.setID("UTC");
        java.lang.String str36 = timeZone33.getID();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder37.clearExtensions();
        java.util.Locale locale39 = builder37.build();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone33, locale39);
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder42 = builder1.setLocale(locale39);
        java.util.Locale.Builder builder43 = builder1.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 8010L + "'", long27 == 8010L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=1645514744850,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=850,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        int int5 = localDateTime4.getMonthOfYear();
        org.joda.time.Chronology chronology6 = localDateTime4.getChronology();
        boolean boolean7 = dateTimeFieldType0.isSupported(chronology6);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.weekyearOfCentury();
        boolean boolean12 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) copticChronology8);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.weekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        int int17 = localDateTime15.getSecondOfMinute();
        int int18 = localDateTime15.getEra();
        long long20 = copticChronology8.set((org.joda.time.ReadablePartial) localDateTime15, 1645514318085L);
        org.joda.time.DurationField durationField21 = copticChronology8.months();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10598109944865L + "'", long20 == 10598109944865L);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ja");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone(zoneId2);
        int int8 = timeZone7.getRawOffset();
        timeZone7.setRawOffset(953);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField14 = copticChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.hourOfHalfday();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology13);
        org.joda.time.LocalDate localDate18 = localDate16.minusMonths((int) (short) 10);
        int int19 = localDate18.getWeekyear();
        org.joda.time.LocalDate localDate21 = localDate18.plusWeeks(17);
        int int22 = localDate21.getWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField24 = copticChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.hourOfHalfday();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology23);
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths((int) (short) 10);
        int int29 = localDate28.getWeekyear();
        org.joda.time.LocalDate localDate31 = localDate28.withYear(3);
        org.joda.time.LocalDate localDate33 = localDate31.withCenturyOfEra(510);
        int int34 = localDate21.compareTo((org.joda.time.ReadablePartial) localDate31);
        int int35 = localDate31.getYearOfEra();
        int int36 = localDate9.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24 + "'", int12 == 24);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1737 + "'", int19 == 1737);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1738 + "'", int22 == 1738);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1737 + "'", int29 == 1737);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.LocalTime localTime9 = dateTime6.toLocalTime();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localTime9.getFieldTypes();
        org.joda.time.LocalTime localTime12 = localTime9.minusSeconds((int) 'u');
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday();
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays(23);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DurationField durationField18 = property17.getDurationField();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-22T00:00:00.010Z" + "'", str14, "2022-02-22T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("5");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str3 = timeZone1.getID();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("ja");
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale8.toLanguageTag();
        boolean boolean10 = calendar7.before((java.lang.Object) locale8);
        java.util.Locale.setDefault(category4, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category4);
        java.util.Locale locale13 = java.util.Locale.getDefault(category4);
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = timeZone1.getDisplayName(locale13);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645514744917,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=917,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645514744917,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=44,MILLISECOND=917,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ja" + "'", str9, "ja");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642" + "'", str15, "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str17 = dateTimeZone14.getName(100L, locale16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        int int26 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.Chronology chronology27 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withMinuteOfHour((int) '#');
        int int31 = localDateTime28.getMillisOfDay();
        boolean boolean32 = dateTimeZone14.isLocalDateTimeGap(localDateTime28);
        long long35 = dateTimeZone14.adjustOffset(328406400000L, true);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withYearOfCentury(837);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 837 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 26744932 + "'", int31 == 26744932);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 328406400000L + "'", long35 == 328406400000L);
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 450);
        org.joda.time.Instant instant4 = instant1.withDurationAdded((long) 886, 188);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField6 = copticChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.clockhourOfHalfday();
        java.lang.String str10 = copticChronology5.toString();
        org.joda.time.MutableDateTime mutableDateTime11 = instant1.toMutableDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.Chronology chronology12 = instant1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology12.getDateTimeMillis(865, 550, 104802, 610, 421, 679, 632);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 610 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime5.getMillisOfSecond();
        int int10 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withYear(339);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfSecond(302);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 951 + "'", int9 == 951);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(2);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        org.joda.time.LocalTime localTime7 = property4.setCopy("0", locale6);
        org.joda.time.LocalTime localTime8 = property4.getLocalTime();
        org.joda.time.LocalTime localTime10 = property4.addCopy(10598109623838L);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(345);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField6 = copticChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.hourOfHalfday();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology5);
        int int9 = localDate8.getMonthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate8.weekyear();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.Locale locale15 = dateTimeFormatter14.getLocale();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int int19 = dateTimeField17.getMaximumValue(readablePartial18);
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.lang.String str21 = locale20.toLanguageTag();
        int int22 = dateTimeField17.getMaximumTextLength(locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter14.withLocale(locale20);
        java.lang.String str24 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDate8, 11, locale20);
        org.joda.time.LocalDate.Property property25 = localDate8.era();
        org.joda.time.LocalDate localDate27 = localDate8.plusMonths(26188813);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField29 = copticChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology28.hourOfHalfday();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology28);
        org.joda.time.LocalDate localDate33 = localDate31.minusMonths((int) (short) 10);
        int int34 = localDate33.getWeekyear();
        org.joda.time.LocalDate localDate36 = localDate33.withYear(3);
        org.joda.time.LocalDate localDate38 = localDate36.withCenturyOfEra(510);
        int int39 = localDate38.getYearOfEra();
        org.joda.time.LocalDate.Property property40 = localDate38.weekOfWeekyear();
        org.joda.time.LocalDate localDate42 = property40.addToCopy(477);
        org.joda.time.DateTime dateTime43 = localDate42.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate44 = localDate8.withFields((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField46 = copticChronology45.halfdays();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.hourOfHalfday();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology45);
        int int49 = localDate48.getMonthOfYear();
        org.joda.time.LocalDate.Property property50 = localDate48.weekyear();
        org.joda.time.LocalDate localDate51 = property50.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate52 = property50.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate54 = localDate52.withCenturyOfEra(550);
        org.joda.time.DateTime dateTime55 = localDate54.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime57 = dateTime55.plusSeconds(255);
        org.joda.time.DateTime dateTime59 = dateTime57.minusYears(797);
        org.joda.time.DateTime dateTime60 = localDate44.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ja" + "'", str21, "ja");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "11" + "'", str24, "11");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1737 + "'", int34 == 1737);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 50903 + "'", int39 == 50903);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(copticChronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        java.lang.Integer int7 = dateTimeFormatter5.getPivotYear();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        int int26 = dateTimeZone23.getOffset((long) 12);
        boolean boolean28 = dateTimeZone23.isStandardOffset((-3628800000L));
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        long long31 = dateTimeZone23.nextTransition(26184082L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter5.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField35 = copticChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology34.weekyearOfCentury();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology34);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology34.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter33.withChronology((org.joda.time.Chronology) copticChronology34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate44 = dateTimeFormatter42.parseLocalDate("86301145");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 26184082L + "'", long31 == 26184082L);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(copticChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(543);
        java.util.Locale locale12 = new java.util.Locale("English (Canada)");
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = property8.getAsText(locale12);
        java.lang.String str15 = locale12.getVariant();
        java.lang.String str16 = locale12.getCountry();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals(locale12.toString(), "english (canada)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "22" + "'", str14, "22");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 630);
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeeksInWeekYear();
        calendar0.add((int) (short) 0, (int) (short) 1);
        calendar0.clear();
        java.lang.String str6 = calendar0.getCalendarType();
        calendar0.setMinimalDaysInFirstWeek(36);
        calendar0.set(598, 675, 27, 865, 894, 435);
        int int16 = calendar0.getMinimalDaysInFirstWeek();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.weekOfWeekyear();
        org.joda.time.DurationField durationField24 = copticChronology19.days();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology19.weekyearOfCentury();
        int int26 = dateTimeField25.getMinimumValue();
        java.util.Locale locale31 = new java.util.Locale("26245779", "", "2022-02-22T07:17:19.066");
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withEra(1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withEra(1);
        int int40 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.Chronology chronology41 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.minuteOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withEra(1);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withEra(1);
        int int52 = localDateTime45.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.Chronology chronology53 = localDateTime49.getChronology();
        java.lang.String str54 = localDateTime49.toString();
        org.joda.time.LocalDateTime.Property property55 = localDateTime49.hourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property55.getLocalDateTime();
        java.util.Locale locale57 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale57);
        java.lang.String str59 = locale57.getDisplayName();
        boolean boolean60 = locale57.hasExtensions();
        java.lang.String str61 = locale57.getCountry();
        java.lang.String str62 = locale57.getDisplayVariant();
        java.lang.String str63 = locale57.getDisplayLanguage();
        java.util.Locale locale64 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str66 = locale64.getDisplayScript(locale65);
        java.lang.String str67 = locale57.getDisplayName(locale65);
        java.lang.String str68 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) localDateTime56, locale57);
        java.lang.String str69 = locale31.getDisplayVariant(locale57);
        java.lang.String str70 = dateTimeField25.getAsText(3, locale57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = calendar0.getDisplayName(178, (int) '4', locale57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=36,ERA=?,YEAR=598,MONTH=675,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=27,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=865,MINUTE=894,SECOND=435,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gregory" + "'", str6, "gregory");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals(locale31.toString(), "26245779__2022-02-22T07:17:19.066");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(chronology53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022-02-22T07:25:45.051" + "'", str54, "2022-02-22T07:25:45.051");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "English (Canada)" + "'", str59, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "CA" + "'", str61, "CA");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "English" + "'", str63, "English");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str67, "\u82f1\u6587\u52a0\u62ff\u5927)");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "445" + "'", str68, "445");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2022-02-22T07:17:19.066" + "'", str69, "2022-02-22T07:17:19.066");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "3" + "'", str70, "3");
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet2 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        java.lang.String[] strArray6 = new java.lang.String[] { "English (Canada)", "English (Canada)" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.lang.Object[] objArray9 = strSet7.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale21.getDisplayName();
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale26);
        java.lang.String str28 = locale26.getDisplayName();
        boolean boolean29 = locale26.hasExtensions();
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale18, locale19, locale20, locale21, locale24, locale25, locale26 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList31, filteringMode33);
        boolean boolean35 = strSet7.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) chronology36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfFloorCopy();
        int int43 = property41.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime44 = property41.roundHalfFloorCopy();
        boolean boolean45 = strSet7.contains((java.lang.Object) property41);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale locale54 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.util.Locale locale57 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale57);
        java.lang.String str59 = locale57.getDisplayName();
        java.util.Locale locale60 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale61 = java.util.Locale.CANADA;
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale62);
        java.lang.String str64 = locale62.getDisplayName();
        boolean boolean65 = locale62.hasExtensions();
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale54, locale55, locale56, locale57, locale60, locale61, locale62 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList67, filteringMode69);
        boolean boolean71 = strSet7.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47);
        boolean boolean72 = strSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream73 = languageRangeList47.parallelStream();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[English (Canada)]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[English (Canada)]");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English (Canada)" + "'", str23, "English (Canada)");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "English (Canada)" + "'", str28, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "English (Canada)" + "'", str59, "English (Canada)");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "English (Canada)" + "'", str64, "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(languageRangeStream73);
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.millis();
        int int14 = durationField12.getValue(604800L);
        long long16 = durationField12.getValueAsLong((long) 10);
        long long19 = durationField12.subtract(3L, 987L);
        long long21 = durationField12.getMillis((-1329789120000L));
        long long24 = durationField12.subtract(1645514743965L, 1666077404590L);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 604800 + "'", int14 == 604800);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-984L) + "'", long19 == (-984L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1329789120000L) + "'", long21 == (-1329789120000L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-20562660625L) + "'", long24 == (-20562660625L));
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("ja");
        timeZone2.setID("ja");
        timeZone2.setID("eras");
        timeZone2.setRawOffset((int) (byte) 1);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("ja");
        timeZone10.setID("UTC");
        boolean boolean13 = timeZone2.hasSameRules(timeZone10);
        java.util.Calendar.Builder builder14 = builder0.setTimeZone(timeZone10);
        java.util.Calendar.Builder builder16 = builder14.setLenient(false);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("ja");
        timeZone18.setID("ja");
        timeZone18.setID("eras");
        timeZone18.setRawOffset((int) (byte) 1);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("ja");
        timeZone26.setID("UTC");
        boolean boolean29 = timeZone18.hasSameRules(timeZone26);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("ja");
        timeZone31.setID("UTC");
        java.lang.String str34 = timeZone31.getID();
        boolean boolean35 = timeZone18.hasSameRules(timeZone31);
        int int37 = timeZone18.getOffset((long) 825);
        java.util.Calendar.Builder builder38 = builder14.setTimeZone(timeZone18);
        java.util.Calendar.Builder builder42 = builder14.setWeekDate(0, 0, 0);
        java.util.Calendar.Builder builder46 = builder42.setDate(876, 86399165, 846);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
        java.util.Date date5 = new java.util.Date((int) (short) 10, (int) (short) -1, 2037, 50903, 345);
        java.util.Date date6 = new java.util.Date();
        java.time.Instant instant7 = date6.toInstant();
        boolean boolean8 = date5.after(date6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Apr 19 04:45:00 GMT 1921");
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Feb 22 07:25:45 GMT 2022");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("11");
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        java.lang.String str11 = dateTime8.toString("\u65e5\u6587");
        org.joda.time.DateMidnight dateMidnight12 = dateTime8.toDateMidnight();
        org.joda.time.DateTime dateTime14 = dateTime8.minusYears(6);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, (int) (short) 100);
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTime17);
        int int19 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime17.withMillisOfDay(26655054);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u6587" + "'", str11, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusMinutes((int) 'u');
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withPeriodAdded(readablePeriod16, 182);
        org.joda.time.Chronology chronology19 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime.Property property20 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.minusMinutes(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime10.millisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        long long10 = copticChronology0.add((long) 451, 1645514347660L, 668);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1099203584237331L + "'", long10 == 1099203584237331L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        java.util.Date date7 = localDate5.toDate();
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTimeISO();
        java.lang.String str12 = mutableDateTime11.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Sep 15 00:00:00 GMT 1737");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2021-05-09T00:00:00.000Z" + "'", str12, "2021-05-09T00:00:00.000Z");
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.secondOfMinute();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime20.getFieldType(0);
        boolean boolean24 = localDateTime13.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime13.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getRangeDurationType();
        boolean boolean29 = localDateTime13.isSupported(dateTimeFieldType27);
        int int30 = localDateTime3.get(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime3.minusMillis(1738);
        int int33 = localDateTime3.getYear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withEra(1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withEra(1);
        int int42 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withEra(1);
        int int47 = localDateTime46.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDateTime46.getFieldType(0);
        boolean boolean50 = localDateTime39.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime39.plusMillis(13);
        org.joda.time.LocalDateTime.Property property53 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime39.minusMonths(255);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType56.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType56.getRangeDurationType();
        int int59 = localDateTime55.get(dateTimeFieldType56);
        org.joda.time.LocalDateTime.Property property60 = localDateTime3.property(dateTimeFieldType56);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTime.Property property63 = dateTime62.minuteOfDay();
        org.joda.time.DateTime.Property property64 = dateTime62.weekyear();
        org.joda.time.DateTime dateTime65 = property64.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime66 = property64.withMinimumValue();
        long long67 = property60.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.LocalDateTime localDateTime69 = property60.setCopy(258);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNull(durationFieldType57);
        org.junit.Assert.assertNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2000 + "'", int59 == 2000);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 292277076L + "'", long67 == 292277076L);
        org.junit.Assert.assertNotNull(localDateTime69);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1738);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = instant3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime8 = dateTime5.withCenturyOfEra(100);
        boolean boolean9 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField11 = copticChronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.weekOfWeekyear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology22 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        long long30 = dateTimeZone27.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology31 = copticChronology10.withZone(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone27);
        java.lang.String str34 = dateTimeZone27.getNameKey((long) 2);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra(1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withEra(1);
        int int43 = localDateTime36.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        java.lang.String str45 = localDateTime40.toString();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.minusMinutes(1);
        boolean boolean48 = dateTimeZone27.isLocalDateTimeGap(localDateTime40);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime5.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime51 = dateTime5.withYear((int) '#');
        org.joda.time.DateTime dateTime52 = dateTime5.withEarlierOffsetAtOverlap();
        java.util.GregorianCalendar gregorianCalendar53 = dateTime52.toGregorianCalendar();
        gregorianCalendar53.setLenient(true);
        org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology58.halfdayOfDay();
        org.joda.time.DurationField durationField60 = copticChronology58.minutes();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology58.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = copticChronology58.weekOfWeekyear();
        org.joda.time.DurationField durationField63 = copticChronology58.centuries();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology58.era();
        java.util.Locale locale68 = new java.util.Locale("java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]", "2022-02-22T07:17:01.652");
        java.lang.String str69 = locale68.getDisplayCountry();
        java.lang.String str70 = dateTimeField64.getAsText(1645514286443L, locale68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = gregorianCalendar53.getDisplayName(997, 456, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chronology44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022-02-22T07:25:45.284" + "'", str45, "2022-02-22T07:25:45.284");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(gregorianCalendar53);
        org.junit.Assert.assertNotNull(copticChronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertEquals(locale68.toString(), "java.util.gregoriancalendar[time=10,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"etc/utc\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=10,zone_offset=0,dst_offset=0]_2022-02-22T07:17:01.652");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2022-02-22T07:17:01.652" + "'", str69, "2022-02-22T07:17:01.652");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "AM" + "'", str70, "AM");
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property5.addToCopy((long) 7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusHours(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.dayOfWeek();
        int int14 = localDateTime10.getYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withCenturyOfEra(127);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.plus(readablePeriod17);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 117 + "'", int14 == 117);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField2 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        long long21 = dateTimeZone18.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology22 = copticChronology1.withZone(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(723L, dateTimeZone18);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) 10);
        int int6 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(3);
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        int int13 = property9.getMaximumTextLength(locale12);
        org.joda.time.LocalDate localDate14 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate16 = property9.setCopy(200);
        org.joda.time.DateTime dateTime17 = localDate16.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property18 = localDate16.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1737 + "'", int6 == 1737);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology6.minutes();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology6.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withChronology((org.joda.time.Chronology) copticChronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter5.withZoneUTC();
        java.io.Writer writer16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withEra(1);
        int int25 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Chronology chronology26 = localDateTime22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        long long32 = dateTimeField28.set((long) 10, "8", locale31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(1);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        boolean boolean39 = localDateTime36.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean41 = localDateTime36.isSupported(dateTimeFieldType40);
        int int42 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime36.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer16, (org.joda.time.ReadablePartial) localDateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 8010L + "'", long32 == 8010L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 59 + "'", int42 == 59);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime.Property property4 = dateTime2.millisOfDay();
        org.joda.time.DateTime.Property property5 = dateTime2.era();
        org.joda.time.DateTime dateTime6 = property5.getDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(816);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime.Property property8 = dateTime6.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readablePeriod9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        boolean boolean14 = dateTime12.isBefore((long) (short) 0);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = instant15.toDateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant15.withDurationAdded(readableDuration18, (int) ' ');
        boolean boolean21 = dateTime12.isBefore((org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime dateTime23 = dateTime12.minusMonths(263);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime11 = dateTime8.plusYears(15);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((java.lang.Object) dateTime8);
        org.joda.time.Instant instant14 = instant12.withMillis((long) 72);
        org.joda.time.DateTime dateTime15 = instant12.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime16 = instant12.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) '#', false);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone17);
        java.lang.String str24 = dateTimeZone17.getName((long) 72);
        long long26 = dateTimeZone17.nextTransition((long) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        java.lang.String str29 = localDateTime27.toString("1737-09-15");
        org.joda.time.Instant instant30 = new org.joda.time.Instant((java.lang.Object) str29);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = instant31.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = dateTime33.toLocalDateTime();
        boolean boolean35 = instant30.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property36 = dateTime33.millisOfDay();
        org.joda.time.DateTime dateTime37 = property36.withMinimumValue();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1737-09-15" + "'", str29, "1737-09-15");
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        calendar0.clear(1);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.lang.String str5 = localDateTime4.toString();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(1);
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        int int15 = localDateTime11.getMillisOfSecond();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime19.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime11.withField(dateTimeFieldType22, 7);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime11.plus(readablePeriod25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime11.plus(readablePeriod27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime11.withDurationAdded(readableDuration29, 5);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime11.plusMillis(585);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime11);
        int int35 = localDateTime11.getDayOfWeek();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=4519545401,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=34,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=435,ZONE_OFFSET=34,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-02-22T07:25:45.435" + "'", str5, "1970-02-22T07:25:45.435");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 401 + "'", int15 == 401);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("5");
        int int3 = timeZone1.getOffset((long) 22);
        java.util.TimeZone.setDefault(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone1.getOffset(26580922, 792, 86399, 376, 50903, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("11");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = dateTime1.toString("10", locale3);
        java.util.Date date7 = dateTime1.toDate();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromDateFields(date7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromDateFields(date7);
        int int10 = date7.getDay();
        date7.setMonth(0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 03 00:00:00 GMT 11");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = dateTimeField7.getAsText(7200, locale9);
        boolean boolean11 = locale9.hasExtensions();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7200" + "'", str10, "7200");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour((int) '#');
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.lang.String str20 = dateTimeZone17.getName(100L, locale19);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone17);
        long long22 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        java.util.Locale locale27 = new java.util.Locale("22 feb 2022 00:01:39 gmt", "3");
        java.lang.String str28 = locale27.getCountry();
        java.util.Calendar calendar29 = dateTime21.toCalendar(locale27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals(locale27.toString(), "22 feb 2022 00:01:39 gmt_3");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "3" + "'", str28, "3");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645514745443,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=45,MILLISECOND=443,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = dateTime2.withCenturyOfEra(100);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(0);
        boolean boolean14 = dateTime2.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime18.getFieldType(0);
        boolean boolean22 = dateTime2.isSupported(dateTimeFieldType21);
        org.joda.time.DateTime dateTime24 = dateTime2.plusMillis((int) (byte) 0);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField26 = copticChronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.halfdayOfDay();
        org.joda.time.DurationField durationField31 = copticChronology25.days();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        int int34 = localDateTime33.getWeekyear();
        int int35 = localDateTime33.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.era();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withWeekOfWeekyear(22);
        int[] intArray40 = copticChronology25.get((org.joda.time.ReadablePartial) localDateTime33, (-9936000000L));
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) chronology41);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.property(dateTimeFieldType47);
        boolean boolean49 = localDateTime33.isSupported(dateTimeFieldType47);
        boolean boolean50 = dateTime2.isSupported(dateTimeFieldType47);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime52 = dateTime2.minus(readablePeriod51);
        int int53 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime.Property property54 = dateTime2.era();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(copticChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1685, 13, 3, 0]");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTime52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 45 + "'", int53 == 45);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("45");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime1.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(10);
        org.joda.time.DateTime dateTime8 = dateTime4.minusHours((int) (short) 100);
        int int9 = dateTime8.getCenturyOfEra();
        boolean boolean10 = dateTime8.isEqualNow();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        int int12 = dateTime8.getEra();
        org.joda.time.DateTime dateTime13 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 158);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(865);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTime dateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        int int17 = localDateTime9.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime9.withDurationAdded(readableDuration18, 388);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField22 = copticChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.hourOfDay();
        boolean boolean24 = localDateTime9.equals((java.lang.Object) copticChronology21);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology21.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime7.toMutableDateTime((org.joda.time.Chronology) copticChronology21);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        long long7 = durationField5.getMillis((long) 543);
        long long10 = durationField5.add((long) 359, (long) 28);
        long long13 = durationField5.getValueAsLong(1645514194831L, 169L);
        long long16 = durationField5.getMillis((long) 557, 12148593L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[UTC]" + "'", str4, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 328406400000L + "'", long7 == 328406400000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 16934400359L + "'", long10 == 16934400359L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2720L + "'", long13 == 2720L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 336873600000L + "'", long16 == 336873600000L);
    }

    @Test
    public void test20780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20780");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.minuteOfDay();
        boolean boolean17 = durationFieldType11.isSupported((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology12.halfdayOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test20781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20781");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.LocalDate.Property property5 = localDate3.weekyear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfFloorCopy();
        int int7 = localDate6.getWeekOfWeekyear();
        int int8 = localDate6.getDayOfYear();
        org.joda.time.LocalDate localDate10 = localDate6.plusYears(762);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("clockhourOfDay");
        java.lang.String str13 = locale12.getISO3Country();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = localDate10.equals((java.lang.Object) locale12);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20782");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        long long9 = dateTimeField6.add((long) 26613842, (long) 109);
        long long11 = dateTimeField6.roundHalfCeiling((long) 26584106);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3439783413842L + "'", long9 == 3439783413842L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9676800000L) + "'", long11 == (-9676800000L));
    }

    @Test
    public void test20783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20783");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy(70);
        int int4 = localDate3.getYearOfCentury();
        int int5 = localDate3.getWeekOfWeekyear();
        int int6 = localDate3.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test20784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20784");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(26220000L, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.LocalDate.Property property8 = localDate7.weekyear();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withWeekOfWeekyear(26615);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26615 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test20785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20785");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusMinutes((int) 'u');
        java.util.Date date15 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfSecond(2);
        int int18 = localDateTime17.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusYears(753);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusWeeks(749);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = instant23.toDateTime(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.DateTime dateTime28 = dateTime25.withCenturyOfEra(100);
        java.util.GregorianCalendar gregorianCalendar29 = dateTime25.toGregorianCalendar();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra(1);
        int int34 = localDateTime33.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime33.getFieldType(0);
        boolean boolean37 = dateTime25.isSupported(dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withEra(1);
        int int42 = localDateTime41.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = localDateTime41.getFieldType(0);
        boolean boolean45 = dateTime25.isSupported(dateTimeFieldType44);
        org.joda.time.DateTime dateTime47 = dateTime25.plusMillis((int) (byte) 0);
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField49 = copticChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology48.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology48.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology48.halfdayOfDay();
        org.joda.time.DurationField durationField54 = copticChronology48.days();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        int int57 = localDateTime56.getWeekyear();
        int int58 = localDateTime56.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.era();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime56.withWeekOfWeekyear(22);
        int[] intArray63 = copticChronology48.get((org.joda.time.ReadablePartial) localDateTime56, (-9936000000L));
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((java.lang.Object) chronology64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.withYear((int) 'u');
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property71 = localDateTime68.property(dateTimeFieldType70);
        boolean boolean72 = localDateTime56.isSupported(dateTimeFieldType70);
        boolean boolean73 = dateTime25.isSupported(dateTimeFieldType70);
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType70.getRangeDurationType();
        java.lang.String str75 = durationFieldType74.toString();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime17.withFieldAdded(durationFieldType74, 987);
        java.lang.String str78 = durationFieldType74.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Feb 22 07:25:45 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(copticChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1685, 13, 3, 0]");
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "weekyears" + "'", str75, "weekyears");
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "weekyears" + "'", str78, "weekyears");
    }

    @Test
    public void test20786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20786");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        int int7 = dateTimeField6.getMinimumValue();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test20787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20787");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = instant0.toDateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = dateTime2.withCenturyOfEra(100);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(0);
        boolean boolean14 = dateTime2.isSupported(dateTimeFieldType13);
        org.joda.time.DateTime dateTime16 = dateTime2.withMillis((long) (short) 1);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DateTime dateTime19 = dateTime16.minusYears(970);
        int int20 = dateTime19.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime19.withHourOfDay(376);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 376 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }
}
