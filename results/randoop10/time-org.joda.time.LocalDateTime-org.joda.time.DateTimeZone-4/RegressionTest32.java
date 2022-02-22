import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("07:19:35.506");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"07:19:35.506\" is malformed at \":19:35.506\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setDayOfYear(1);
        mutableDateTime1.setMillisOfSecond((int) 'u');
        int int6 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime15.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.dayOfYear();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        boolean boolean28 = period26.isSupported(durationFieldType27);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight21.plus((org.joda.time.ReadablePeriod) period26);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight29.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime15.toDateTime(dateTimeZone31);
        long long36 = dateTimeZone31.convertLocalToUTC((long) 15, false);
        mutableDateTime9.setZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        mutableDateTime39.setSecondOfDay((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        mutableDateTime39.add((org.joda.time.ReadablePeriod) period45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime39.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime50 = property47.addWrapField(365);
        org.joda.time.MutableDateTime mutableDateTime51 = property47.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime53 = property47.add(23L);
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        long long59 = dateTimeZone55.convertLocalToUTC(31536000000L, false, 100L);
        mutableDateTime53.setZoneRetainFields(dateTimeZone55);
        mutableDateTime9.setZone(dateTimeZone55);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+14:35");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-52499985L) + "'", long36 == (-52499985L));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "GMT+14:35");
        org.junit.Assert.assertNotNull(dateTimeZone55);
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + 31483500000L + "'", long59 == 31483500000L);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 1, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) duration20, periodType24);
        mutablePeriod26.setMillis(844);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTime dateTime6 = dateTime2.withDayOfWeek(4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime12.dayOfWeek();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.lang.String str18 = locale17.getISO3Language();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.DateTime dateTime24 = property22.addToCopy((int) ' ');
        java.util.Locale locale25 = java.util.Locale.ITALY;
        int int26 = property22.getMaximumShortTextLength(locale25);
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("PT0S");
        int int29 = property22.getMaximumShortTextLength(locale28);
        java.lang.String str30 = locale17.getDisplayVariant(locale28);
        java.lang.String str31 = property16.getAsText(locale17);
        java.util.Calendar calendar32 = dateTime6.toCalendar(locale17);
        calendar32.set(7, 130, 52, 0, 14);
        calendar32.setFirstDayOfWeek(7);
        calendar32.set(0, 12422, 116);
        java.lang.Object obj45 = calendar32.clone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "deu" + "'", str18, "deu");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Donnerstag" + "'", str31, "Donnerstag");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+14:35\",offset=52500000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=7,minimalDaysInFirstWeek=4,ERA=1,YEAR=0,MONTH=12422,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=116,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=14,SECOND=59,MILLISECOND=999,ZONE_OFFSET=52500000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj45);
// flaky:         org.junit.Assert.assertEquals(obj45.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+14:35\",offset=52500000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=7,minimalDaysInFirstWeek=4,ERA=1,YEAR=0,MONTH=12422,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=116,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=14,SECOND=59,MILLISECOND=999,ZONE_OFFSET=52500000,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+14:35\",offset=52500000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=7,minimalDaysInFirstWeek=4,ERA=1,YEAR=0,MONTH=12422,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=116,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=14,SECOND=59,MILLISECOND=999,ZONE_OFFSET=52500000,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+14:35\",offset=52500000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=7,minimalDaysInFirstWeek=4,ERA=1,YEAR=0,MONTH=12422,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=116,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=14,SECOND=59,MILLISECOND=999,ZONE_OFFSET=52500000,DST_OFFSET=0]");
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        java.util.Date date1 = new java.util.Date((long) 32769);
        java.lang.String str2 = date1.toGMTString();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears(26455);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:35:32 GMT+14:35 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 Jan 1970 00:00:32 GMT" + "'", str2, "1 Jan 1970 00:00:32 GMT");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.roundHalfFloorCopy();
        java.util.Date date3 = localDate2.toDate();
        date3.setMonth(262097);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Jun 01 00:00:00 GMT+14:35 23863");
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(946684800000L, 1645514360663L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period7.normalizedStandard(periodType8);
        java.lang.String str10 = period7.toString();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.Period period17 = period7.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((java.lang.Object) period14);
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = dateTime22.toString(dateTimeFormatter23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (-1), chronology38);
        org.joda.time.Duration duration40 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateTime.Property property43 = dateTime26.year();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight.Property property45 = dateMidnight19.yearOfCentury();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (-1), chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (-1), chronology50);
        org.joda.time.Duration duration52 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime51);
        long long53 = duration52.getStandardMinutes();
        org.joda.time.Duration duration54 = duration52.toDuration();
        org.joda.time.Period period55 = new org.joda.time.Period((java.lang.Object) duration52);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration57 = period14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration57);
        java.lang.String str60 = duration2.toString();
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(dateMidnight19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str24, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT698829560.663S" + "'", str60, "PT698829560.663S");
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime11);
        long long13 = duration12.getStandardMinutes();
        org.joda.time.Duration duration14 = duration12.toDuration();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime22.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime26.setDayOfYear(1);
        mutableDateTime26.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime26.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime19.withZoneRetainFields(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter2.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology35 = dateTimeFormatter34.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        mutableDateTime37.setDayOfYear(1);
        mutableDateTime37.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology44 = mutableDateTime43.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter34.withChronology(chronology44);
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = dateTimeFormatter34.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter34.withPivotYear((java.lang.Integer) 593);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNull(dateTimePrinter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = period11.normalizedStandard(periodType12);
        java.lang.String str14 = period11.toString();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = period18.normalizedStandard(periodType19);
        org.joda.time.Period period21 = period11.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime23.setSecondOfDay((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period32 = period29.minusHours(52);
        org.joda.time.Period period33 = period11.withFields((org.joda.time.ReadablePeriod) period29);
        int int35 = period33.getValue((int) (byte) 1);
        org.joda.time.LocalTime localTime36 = localTime7.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Duration duration37 = period33.toStandardDuration();
        int int38 = period33.getSeconds();
        org.joda.time.Period period40 = period33.minusMonths(79260336);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(20);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMillis(25);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears(7);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMillis(56);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury(71);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusMillis(3993);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        java.util.Date date3 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withWeekyear(10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withCenturyOfEra(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusYears(4);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(4);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime14 = property12.addWrapFieldToCopy(837);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 14:35:00 GMT+14:35 1970");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("");
        org.joda.time.DateTimeZone dateTimeZone5 = provider0.getZone("2032-02-22");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("9-giu-2030 0.00.00");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period2 = new org.joda.time.Period((long) 1, periodType1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        boolean boolean4 = periodType1.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(86400000L, chronology6);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        boolean boolean11 = durationFieldType3.isSupported(chronology8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        mutableDateTime14.setDayOfYear(1);
        mutableDateTime14.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone19);
        org.joda.time.Chronology chronology22 = chronology8.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime28);
        long long30 = duration29.getStandardMinutes();
        org.joda.time.Duration duration31 = duration29.toDuration();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        mutableDateTime39.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        mutableDateTime43.setDayOfYear(1);
        mutableDateTime43.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime43.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime36.withZoneRetainFields(dateTimeZone48);
        int int52 = dateTimeZone48.getOffsetFromLocal((long) 0);
        org.joda.time.Chronology chronology53 = chronology22.withZone(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.centuryOfEra();
        int int56 = dateTimeField54.get((long) 245);
        org.joda.time.DurationField durationField57 = dateTimeField54.getDurationField();
        boolean boolean59 = dateTimeField54.isLeap((long) 26291448);
        org.joda.time.DurationField durationField60 = dateTimeField54.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long63 = durationField60.add((-312427L), (-472953555296L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -47295355529600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52500000 + "'", int52 == 52500000);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 19 + "'", int56 == 19);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(durationField60);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1645517917833L);
        org.joda.time.DateTime dateTime3 = dateTime1.minusHours(2030);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfWeek();
        org.joda.time.DateTime.Property property5 = dateTime3.secondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (-36));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(985, 985, 46, 4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, periodType13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        boolean boolean16 = periodType13.isSupported(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration11, periodType13);
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = dateTime21.toString(dateTimeFormatter22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1), chronology37);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime.Property property42 = dateTime25.year();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight18, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateMidnight.Property property44 = dateMidnight18.yearOfCentury();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1), chronology49);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime50);
        long long52 = duration51.getStandardMinutes();
        org.joda.time.Duration duration53 = duration51.toDuration();
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) duration51);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (-1), chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Duration duration64 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration66 = duration64.plus((long) 'u');
        mutableDateTime57.add((org.joda.time.ReadableDuration) duration66, (-1));
        org.joda.time.Duration duration69 = duration51.plus((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration71 = duration11.withDurationAdded((org.joda.time.ReadableDuration) duration51, 16);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration51);
        mutablePeriod4.setMinutes(33);
        java.lang.Object obj77 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(86400000L, chronology79);
        org.joda.time.Chronology chronology81 = localDateTime80.getChronology();
        org.joda.time.Interval interval82 = new org.joda.time.Interval(obj77, chronology81);
        org.joda.time.Period period83 = new org.joda.time.Period((-240L), 0L, chronology81);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) period83);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str23, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(chronology81);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(20);
        int int6 = localDateTime5.getMinuteOfHour();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        java.lang.Integer int13 = dateTimeFormatter11.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter11.getZone();
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.DateTime dateTime16 = localDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime5.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) dateMidnight1, dateTimeZone5);
        java.lang.String str7 = localTime6.toString();
        org.joda.time.DateTime dateTime8 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = property9.getLeapDurationField();
        org.joda.time.DateTime dateTime11 = property9.getDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00:00:00.000" + "'", str7, "00:00:00.000");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter4.getParser();
        java.lang.Integer int6 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(86400000L, chronology8);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology10.add(readablePeriod13, (long) 83459999, 99);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter20.getZone();
        java.util.Locale locale22 = dateTimeFormatter20.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter20.withPivotYear(420);
        boolean boolean25 = dateTimeFormatter24.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withOffsetParsed();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 83459999L + "'", long16 == 83459999L);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        int int1 = timeOfDay0.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay0.withMillisOfSecond((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = timeOfDay3.toDateTimeToday(dateTimeZone4);
        int[] intArray6 = timeOfDay3.getValues();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay3.property(dateTimeFieldType10);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay3.minusMillis(16);
        int int15 = timeOfDay14.getMillisOfSecond();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = timeOfDay14.getFieldTypes();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.parse("23:59:59.999");
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology21);
        org.joda.time.LocalTime localTime24 = localTime18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, 292278993);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay14.minus((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.secondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 985 + "'", int15 == 985);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        org.joda.time.Chronology chronology7 = dateTimeFormatter5.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(875, 0, (-192830), dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        mutableDateTime5.setDayOfYear(1);
        mutableDateTime5.setMillisOfSecond((int) 'u');
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        mutableDateTime5.setDayOfMonth(14);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        mutableDateTime14.setDayOfYear(1);
        mutableDateTime14.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        mutableDateTime5.setZone(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localTime3.toDateTimeToday(dateTimeZone19);
        org.joda.time.Interval interval23 = new org.joda.time.Interval(0L, 13148730000L, dateTimeZone19);
        boolean boolean24 = interval23.containsNow();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.Interval interval27 = interval23.withStartMillis((long) 27);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.dayOfYear();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight29.minusDays(0);
        org.joda.time.Interval interval33 = dateMidnight32.toInterval();
        org.joda.time.Interval interval34 = interval33.toInterval();
        long long35 = interval33.getEndMillis();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1), chronology37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (-1), chronology40);
        org.joda.time.Duration duration42 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime41);
        long long43 = duration42.getStandardMinutes();
        org.joda.time.Duration duration44 = duration42.toDuration();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfEra();
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime52.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone55);
        mutableDateTime56.setDayOfYear(1);
        mutableDateTime56.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime56.getZone();
        mutableDateTime52.setZoneRetainFields(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = dateTime49.withZoneRetainFields(dateTimeZone61);
        org.joda.time.DateTime.Property property64 = dateTime63.millisOfDay();
        org.joda.time.DateTime dateTime66 = property64.addToCopy(43);
        org.joda.time.Interval interval67 = property64.toInterval();
        boolean boolean68 = interval33.isBefore((org.joda.time.ReadableInterval) interval67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Interval interval70 = interval67.withEnd(readableInstant69);
        boolean boolean71 = interval27.isAfter((org.joda.time.ReadableInterval) interval67);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(interval34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 33900000L + "'", long35 == 33900000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        java.util.Date date3 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withWeekyear(10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withCenturyOfEra(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusYears(4);
        int int10 = localDateTime9.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfEra(26252);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 14:35:00 GMT+14:35 1970");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 66 + "'", int10 == 66);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusYears(2023);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = period13.normalizedStandard(periodType14);
        org.joda.time.Period period17 = period15.minusDays(0);
        java.lang.String str18 = period17.toString();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withZone(dateTimeZone26);
        org.joda.time.Duration duration28 = period17.toDurationFrom((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.format.PeriodFormatter periodFormatter29 = null;
        java.lang.String str30 = period17.toString(periodFormatter29);
        org.joda.time.Period period32 = period17.withMonths(2052);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime9.withPeriodAdded((org.joda.time.ReadablePeriod) period32, 1070);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        mutableDateTime36.setDayOfYear(1);
        mutableDateTime36.setMillisOfSecond((int) 'u');
        int int41 = mutableDateTime36.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.year();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        mutableDateTime45.setDayOfYear(1);
        mutableDateTime45.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime45.getZone();
        mutableDateTime43.setZone(dateTimeZone50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime43.year();
        org.joda.time.MutableDateTime mutableDateTime53 = property52.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean55 = mutableDateTime53.isSupported(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime53.yearOfCentury();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime53.era();
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime53.getZone();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period32, (org.joda.time.ReadableInstant) mutableDateTime53);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0S" + "'", str30, "PT0S");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays(10L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period9 = new org.joda.time.Period((long) 1, periodType8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        boolean boolean11 = periodType8.isSupported(durationFieldType10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration6, periodType8);
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = dateTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateTime.Property property37 = dateTime20.year();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight13, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateMidnight.Property property39 = dateMidnight13.yearOfCentury();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (-1), chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (-1), chronology44);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime45);
        long long47 = duration46.getStandardMinutes();
        org.joda.time.Duration duration48 = duration46.toDuration();
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) duration46);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight13.plus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (-1), chronology57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Duration duration61 = duration59.plus((long) 'u');
        mutableDateTime52.add((org.joda.time.ReadableDuration) duration61, (-1));
        org.joda.time.Duration duration64 = duration46.plus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Duration duration66 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration46, 16);
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property69 = dateMidnight68.dayOfYear();
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight68.minusDays(0);
        org.joda.time.Interval interval72 = dateMidnight71.toInterval();
        org.joda.time.Interval interval73 = interval72.toInterval();
        org.joda.time.Duration duration74 = interval72.toDuration();
        boolean boolean75 = duration66.equals((java.lang.Object) duration74);
        org.joda.time.Duration duration78 = new org.joda.time.Duration((long) 81, 15L);
        boolean boolean79 = duration74.isLongerThan((org.joda.time.ReadableDuration) duration78);
        org.joda.time.Seconds seconds80 = duration78.toStandardSeconds();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateMidnight13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str18, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(seconds80);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        java.util.Date date3 = new java.util.Date(26347715, 3, 21);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Tue Apr 21 00:00:00 GMT+14:35 26349615");
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        mutableDateTime5.setDayOfYear(1);
        mutableDateTime5.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        java.lang.String str12 = dateTimeZone10.toString();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        java.lang.String str15 = dateTimeZone10.getName((long) 100964);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+14:35" + "'", str12, "+14:35");
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+14:35" + "'", str15, "+14:35");
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = dateTime3.toString(dateTimeFormatter4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTime.Property property24 = dateTime7.year();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateMidnight.Property property26 = dateMidnight0.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight28 = property26.setCopy("22");
        int int29 = dateMidnight28.getCenturyOfEra();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.minusDays(23);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        java.lang.String str36 = localDateTime33.toString("+00:00");
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.minusMinutes((int) '4');
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(1969, 999, 999, 52, (int) (byte) 100, 1439, 4, (int) '#');
        org.joda.time.PeriodType periodType48 = mutablePeriod47.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(86400000L, chronology51);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.clockhourOfDay();
        mutablePeriod47.setPeriod((-61472908799968L), chronology53);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime33.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod47, (int) 'u');
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod47, (int) (byte) 0);
        mutablePeriod47.addMonths(26553867);
        org.junit.Assert.assertNotNull(dateMidnight0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str5, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateMidnight59);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        int int1 = timeOfDay0.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay0.withMillisOfSecond((int) (short) 1);
        int int5 = timeOfDay0.getValue(3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        mutableDateTime7.setSecondOfDay((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        mutableDateTime7.add((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period13.minusHours(52);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay0.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusMinutes(27);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.plusMinutes(26612104);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.withFieldAdded(durationFieldType23, 127);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(timeOfDay25);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder8 = builder4.setDate(2000, (int) '#', (int) (byte) 100);
        java.util.Calendar.Builder builder10 = builder4.setLenient(false);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getISO3Language();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime18.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property24 = dateTime18.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        org.joda.time.DateTime dateTime27 = dateTime25.minusYears(32769);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.lang.String str31 = locale30.getISO3Language();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.DateTime dateTime37 = property35.addToCopy((int) ' ');
        java.util.Locale locale38 = java.util.Locale.ITALY;
        int int39 = property35.getMaximumShortTextLength(locale38);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("PT0S");
        int int42 = property35.getMaximumShortTextLength(locale41);
        java.lang.String str43 = locale30.getDisplayVariant(locale41);
        java.lang.String str45 = locale30.getExtension('u');
        java.lang.String str46 = locale29.getDisplayVariant(locale30);
        java.lang.String str47 = dateTime27.toString("22", locale30);
        java.lang.String str48 = locale11.getDisplayLanguage(locale30);
        java.util.Calendar.Builder builder49 = builder4.setLocale(locale30);
        java.util.Locale.Builder builder50 = builder3.setLocale(locale30);
        java.lang.String str51 = locale30.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "deu" + "'", str12, "deu");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "deu" + "'", str31, "deu");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "22" + "'", str47, "22");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Deutsch" + "'", str48, "Deutsch");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "de" + "'", str51, "de");
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        java.util.Locale locale2 = new java.util.Locale("Thu Mar 24 03:59:00 UTC 1960", "26293418-01-08T00:00:00.000");
        org.junit.Assert.assertEquals(locale2.toString(), "thu mar 24 03:59:00 utc 1960_26293418-01-08T00:00:00.000");
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("22-feb-2022 0.00.00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(86400000L, chronology1);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(16);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(0L);
        org.joda.time.Period period18 = duration15.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateTime dateTime19 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks((-7));
        int int22 = dateTime19.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime19.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 54 + "'", int22 == 54);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean6 = dateTimeField4.isLeap((long) 1439);
        long long8 = dateTimeField4.roundFloor(0L);
        boolean boolean10 = dateTimeField4.isLeap((long) 7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        mutableDateTime13.setYear(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        mutableDateTime13.setRounding(dateTimeField18);
        int int21 = dateTimeField18.getLeapAmount((long) (byte) 10);
        java.lang.String str23 = dateTimeField18.getAsText(0L);
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = dateTimeField18.getAsShortText(1969, locale25);
        java.lang.String str27 = dateTimeField4.getAsText((int) (byte) 100, locale25);
        long long30 = dateTimeField4.add((long) 19, 22);
        long long33 = dateTimeField4.add((long) 1, 12178291L);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.tz.NameProvider nameProvider36 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.lang.String str38 = locale37.getISO3Language();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (-1), chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfEra();
        org.joda.time.DateTime dateTime44 = property42.addToCopy((int) ' ');
        java.util.Locale locale45 = java.util.Locale.ITALY;
        int int46 = property42.getMaximumShortTextLength(locale45);
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("PT0S");
        int int49 = property42.getMaximumShortTextLength(locale48);
        java.lang.String str50 = locale37.getDisplayVariant(locale48);
        java.lang.String str53 = nameProvider36.getShortName(locale37, "yearOfCentury", "PT1.969S");
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str57 = nameProvider36.getName(locale54, "PT0S", "hi!");
        java.lang.String str58 = dateTimeField4.getAsText(readablePartial34, 292278993, locale54);
        java.util.Locale.Builder builder59 = builder0.setLocale(locale54);
        java.util.Locale.Builder builder60 = builder59.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder62 = builder59.setScript("P6D");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: P6D [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-52500000L) + "'", long8 == (-52500000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970" + "'", str23, "1970");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1969" + "'", str26, "1969");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100" + "'", str27, "100");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 694224000019L + "'", long30 == 694224000019L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 384309744566400001L + "'", long33 == 384309744566400001L);
        org.junit.Assert.assertNotNull(nameProvider36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "deu" + "'", str38, "deu");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "292278993" + "'", str58, "292278993");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.addYears((int) (short) 0);
        mutablePeriod1.setPeriod(2, (int) (byte) 100, 100, 2, 0, 4, 999, (int) (short) 1);
        int int13 = mutablePeriod1.getYears();
        mutablePeriod1.addMonths(43);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime18.plusMonths(999);
        java.lang.String str25 = dateTime18.toString();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate28 = localDate26.plusYears(10);
        boolean boolean30 = localDate26.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property31 = localDate26.weekOfWeekyear();
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtMidnight();
        int int33 = dateTime32.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime32.toMutableDateTimeISO();
        mutablePeriod1.setPeriod((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.plus(readablePeriod36);
        int int38 = dateTime37.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str25, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 22 + "'", int38 == 22);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        org.joda.time.DateTime dateTime9 = dateTime6.withYear(32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks(2152);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime9.withEarlierOffsetAtOverlap();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 874 + "'", int12 == 874);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration16 = duration14.plus((long) 'u');
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration7.isEqual((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays(10L);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 1, periodType27);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.years();
        boolean boolean30 = periodType27.isSupported(durationFieldType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration25, periodType27);
        org.joda.time.Duration duration32 = duration7.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType34 = periodType33.withHoursRemoved();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.LocalTime localTime42 = dateTime41.toLocalTime();
        int int43 = dateTime41.getDayOfWeek();
        org.joda.time.DateTime.Property property44 = dateTime41.secondOfDay();
        org.joda.time.Chronology chronology45 = dateTime41.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.hours();
        org.joda.time.Period period47 = duration7.toPeriod(periodType33, chronology45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(15L, chronology45);
        org.joda.time.DateTimeField dateTimeField49 = chronology45.dayOfMonth();
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str39, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setSecondOfDay((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(365);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = property9.add(23L);
        org.joda.time.MutableDateTime mutableDateTime16 = property9.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property9.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime18 = property9.roundFloor();
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add(844);
        mutableDateTime5.addHours((-12));
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths(999);
        org.joda.time.YearMonthDay yearMonthDay9 = dateTime8.toYearMonthDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        long long18 = duration17.getStandardMinutes();
        org.joda.time.Duration duration19 = duration17.toDuration();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfEra();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        mutableDateTime27.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        mutableDateTime31.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime31.getZone();
        mutableDateTime27.setZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime24.withZoneRetainFields(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) "22", dateTimeZone36);
        org.joda.time.Interval interval40 = yearMonthDay9.toInterval(dateTimeZone36);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay9.withDayOfMonth((int) (short) 10);
        org.joda.time.YearMonthDay.Property property43 = yearMonthDay9.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay45 = property43.addWrapFieldToCopy(5);
        org.joda.time.YearMonthDay yearMonthDay47 = property43.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeField dateTimeField48 = property43.getField();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay50.plusSeconds(3);
        org.joda.time.LocalTime localTime53 = timeOfDay52.toLocalTime();
        org.joda.time.Period period56 = org.joda.time.Period.minutes(2023);
        int[] intArray57 = period56.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray59 = dateTimeField48.addWrapField((org.joda.time.ReadablePartial) localTime53, (-292275054), intArray57, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0, 0, 0, 2023, 0, 0]");
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(32770);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 6);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay9.minuteOfHour();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        int int13 = property10.getMaximumTextLength(locale12);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getISO3Language();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((int) ' ');
        java.util.Locale locale23 = java.util.Locale.ITALY;
        int int24 = property20.getMaximumShortTextLength(locale23);
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("PT0S");
        int int27 = property20.getMaximumShortTextLength(locale26);
        java.lang.String str28 = locale15.getDisplayVariant(locale26);
        java.lang.String str30 = locale15.getExtension('u');
        java.lang.String str31 = locale14.getDisplayVariant(locale15);
        int int32 = property10.getMaximumShortTextLength(locale15);
        java.lang.String str33 = locale15.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 86399999);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter7.withPivotYear(216);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight40 = org.joda.time.DateMidnight.parse("1969-01-31T23:59:59.999Z/1969-12-31T23:59:59.999Z", dateTimeFormatter39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "deu" + "'", str16, "deu");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "deu" + "'", str33, "deu");
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = dateTime3.toString(dateTimeFormatter4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTime.Property property24 = dateTime7.year();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateMidnight.Property property26 = dateMidnight0.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight28 = property26.setCopy("22");
        org.joda.time.DateMidnight dateMidnight30 = property26.addToCopy(31);
        org.joda.time.DateMidnight dateMidnight31 = property26.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight32 = property26.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight33 = property26.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight34 = property26.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateMidnight0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str5, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateMidnight34);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withChronology(chronology12);
        int int14 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) period30, chronology31);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadablePeriod) period30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (-1), chronology38);
        org.joda.time.Duration duration40 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = dateTime36.plusMonths(999);
        org.joda.time.YearMonthDay yearMonthDay43 = dateTime42.toYearMonthDay();
        org.joda.time.DateTime dateTime45 = dateTime42.withMillis((long) 1);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1), chronology49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.Duration duration54 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Duration duration56 = duration54.plus((long) 'u');
        mutableDateTime47.add((org.joda.time.ReadableDuration) duration56, (-1));
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (-1), chronology60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime67 = dateTime61.plusMonths(999);
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period70 = new org.joda.time.Period((long) 1, periodType69);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime47, (org.joda.time.ReadableInstant) dateTime67, periodType69);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Interval interval74 = interval72.withChronology(chronology73);
        org.joda.time.Interval interval75 = interval33.overlap((org.joda.time.ReadableInterval) interval72);
        org.joda.time.Chronology chronology76 = interval72.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(100L, (long) 6, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.yearOfEra();
        org.joda.time.DurationField durationField79 = chronology76.centuries();
        org.joda.time.Chronology chronology80 = chronology76.withUTC();
        org.joda.time.DurationField durationField81 = chronology76.days();
        long long82 = durationField81.getUnitMillis();
        long long83 = durationField81.getUnitMillis();
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNull(interval75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(durationField81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 86400000L + "'", long82 == 86400000L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 86400000L + "'", long83 == 86400000L);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.DurationField durationField3 = property2.getDurationField();
        boolean boolean4 = durationField3.isPrecise();
        int int6 = durationField3.getValue((long) 5);
        long long8 = durationField3.getMillis((long) (short) 0);
        boolean boolean9 = durationField3.isSupported();
        int int12 = durationField3.getValue(1645514209701L, 157766401000L);
        long long13 = durationField3.getUnitMillis();
        long long16 = durationField3.add(993600000L, 97L);
        long long19 = durationField3.getValueAsLong(951177600000L, 1645514313358L);
        long long21 = durationField3.getMillis((long) 874);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 625 + "'", int12 == 625);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2629746000L + "'", long13 == 2629746000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 256132800000L + "'", long16 == 256132800000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 361L + "'", long19 == 361L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2298398004000L + "'", long21 == 2298398004000L);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withChronology(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime6.withMillis((long) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        int int12 = dateTimeField10.get(26209701L);
        org.joda.time.DurationField durationField13 = dateTimeField10.getDurationField();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        boolean boolean20 = dateTimeField18.isLeap((long) 1439);
        boolean boolean22 = dateTimeField18.isLeap(0L);
        long long24 = dateTimeField18.roundFloor((long) (byte) 1);
        int int26 = dateTimeField18.get((long) 5);
        long long29 = dateTimeField18.add((long) 4, (int) (byte) 10);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale31.getISO3Language();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.DateTime dateTime38 = property36.addToCopy((int) ' ');
        java.util.Locale locale39 = java.util.Locale.ITALY;
        int int40 = property36.getMaximumShortTextLength(locale39);
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("PT0S");
        int int43 = property36.getMaximumShortTextLength(locale42);
        java.lang.String str44 = locale31.getDisplayVariant(locale42);
        java.lang.String str46 = locale31.getExtension('u');
        java.lang.String str47 = dateTimeField18.getAsText(10L, locale31);
        java.lang.String str48 = locale15.getDisplayLanguage(locale31);
        java.lang.String str49 = locale15.getDisplayName();
        java.lang.String str50 = dateTimeField10.getAsShortText(840006L, locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = locale15.getUnicodeLocaleType("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano (Italia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-52500000L) + "'", long24 == (-52500000L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 315532800004L + "'", long29 == 315532800004L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "deu" + "'", str32, "deu");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970" + "'", str47, "1970");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Chinesisch" + "'", str48, "Chinesisch");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "chinois (Taiwan)" + "'", str49, "chinois (Taiwan)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970" + "'", str50, "1970");
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setDayOfYear(1);
        mutableDateTime1.setMillisOfSecond((int) 'u');
        int int6 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        int int9 = mutableDateTime8.getDayOfMonth();
        int int10 = mutableDateTime8.getMillisOfDay();
        int int11 = mutableDateTime8.getMinuteOfDay();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = dateTime15.toString(dateTimeFormatter16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime.Property property36 = dateTime19.year();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight12, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateMidnight.Property property38 = dateMidnight12.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight39 = property38.withMinimumValue();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (-1), chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = dateTime42.toString(dateTimeFormatter43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Duration duration53 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (-1), chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = dateTime65.toString(dateTimeFormatter66);
        int int68 = dateTime65.getMillisOfSecond();
        org.joda.time.Period period69 = duration60.toPeriodFrom((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight39.withDurationAdded((org.joda.time.ReadableDuration) duration60, 1439);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (-1), chronology73);
        org.joda.time.DateTime.Property property75 = dateTime74.yearOfEra();
        org.joda.time.DateTime dateTime76 = dateTime74.toDateTime();
        int int77 = dateTime74.getMinuteOfHour();
        org.joda.time.Period period78 = duration60.toPeriodFrom((org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Duration duration79 = duration60.toDuration();
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration79);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateMidnight12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str17, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateMidnight39);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str44, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str67, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 999 + "'", int68 == 999);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateTime76);
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 34 + "'", int77 == 34);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(duration79);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        boolean boolean8 = period6.isSupported(durationFieldType7);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight1.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (byte) 10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withCenturyOfEra(8);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = duration20.plus((long) 'u');
        org.joda.time.Period period23 = duration22.toPeriod();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = duration22.toPeriod(chronology24);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateMidnight.Property property27 = dateMidnight9.dayOfMonth();
        org.joda.time.Interval interval28 = dateMidnight9.toInterval();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusDays(9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray35 = period32.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = period39.normalizedStandard(periodType40);
        org.joda.time.Period period43 = period41.minusDays(0);
        java.lang.String str44 = period43.toString();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1), chronology49);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.withZone(dateTimeZone52);
        org.joda.time.Duration duration54 = period43.toDurationFrom((org.joda.time.ReadableInstant) dateTime53);
        boolean boolean56 = dateTime53.isBefore((long) 1439);
        org.joda.time.Duration duration57 = period32.toDurationTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Period period59 = period32.withWeeks(5);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 26209701, (long) (-1));
        mutablePeriod62.addHours(365);
        org.joda.time.Period period65 = period59.withFields((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.years();
        boolean boolean67 = mutablePeriod62.isSupported(durationFieldType66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight9.withFieldAdded(durationFieldType66, 40);
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((java.lang.Object) dateMidnight69);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight72 = dateMidnight70.withYearOfEra((-44));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -44 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldTypeArray35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT0S" + "'", str44, "PT0S");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateMidnight69);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withChronology(chronology10);
        int int12 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.DateTime dateTime13 = dateMidnight8.toDateTime();
        org.joda.time.DateMidnight.Property property14 = dateMidnight8.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight15 = property14.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight16 = property14.withMinimumValue();
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale17.getDisplayName();
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = property14.getAsShortText(locale17);
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinois" + "'", str18, "chinois");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19" + "'", str20, "19");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(20);
        int int6 = localDateTime5.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.centuryOfEra();
        int int10 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.weekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.minuteOfHour();
        mutableDateTime8.addMinutes((int) (short) -1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.DateTime dateTime20 = property18.addToCopy((int) ' ');
        org.joda.time.DateTime dateTime22 = property18.addWrapFieldToCopy(9);
        org.joda.time.DateTime dateTime23 = property18.withMinimumValue();
        int int24 = property18.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property18.getFieldType();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        java.lang.String str27 = dateTimeFieldType25.getName();
        mutableDateTime8.set(dateTimeFieldType25, 41);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "yearOfEra" + "'", str27, "yearOfEra");
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        boolean boolean8 = period6.isSupported(durationFieldType7);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight1.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus(10L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight9.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.plus((long) 32769);
        int int15 = dateMidnight14.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime17.setDayOfYear(1);
        mutableDateTime17.setMillisOfSecond((int) 'u');
        int int22 = mutableDateTime17.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.year();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        int int25 = mutableDateTime24.getDayOfMonth();
        mutableDateTime24.addMinutes(86399);
        mutableDateTime24.setDate(83459999L);
        boolean boolean30 = dateMidnight14.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Instant instant31 = mutableDateTime24.toInstant();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(instant31);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 1, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) duration20, periodType24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean31 = dateTime29.isSupported(dateTimeFieldType30);
        org.joda.time.DateMidnight dateMidnight32 = dateTime29.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.plusMonths(292278993);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period39 = new org.joda.time.Period((long) 1, periodType38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.years();
        boolean boolean41 = periodType38.isSupported(durationFieldType40);
        org.joda.time.Period period42 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight36, periodType38);
        java.lang.String str43 = periodType38.toString();
        org.joda.time.PeriodType periodType44 = periodType38.withMonthsRemoved();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PeriodType[DayTime]" + "'", str43, "PeriodType[DayTime]");
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration23);
        long long26 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateMidnight dateMidnight28 = property2.addToCopy((long) (byte) 100);
        org.joda.time.DateMidnight dateMidnight30 = property2.addToCopy(0);
        int int31 = dateMidnight30.getHourOfDay();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.withYear(20);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str7, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateMidnight33);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setDayOfYear(1);
        int int4 = mutableDateTime1.getSecondOfMinute();
        mutableDateTime1.addYears((int) 'a');
        mutableDateTime1.addMinutes(12);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime1.dayOfYear();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate14 = localDate12.plusYears(10);
        boolean boolean16 = localDate12.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property17 = localDate12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime19.setDayOfYear(1);
        mutableDateTime19.setMillisOfSecond((int) 'u');
        int int24 = mutableDateTime19.getWeekOfWeekyear();
        mutableDateTime19.setDayOfMonth(14);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime28.setDayOfYear(1);
        mutableDateTime28.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        mutableDateTime19.setZone(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDate12.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.LocalDate.Property property37 = localDate12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField38, 2028);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 2028");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Duration duration10 = duration8.plus((long) 'u');
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration10, (-1));
        org.joda.time.Duration duration13 = duration10.toDuration();
        org.joda.time.Duration duration15 = duration10.plus((long) (-292275054));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime17.setYear(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        mutableDateTime17.setRounding(dateTimeField22);
        int int24 = mutableDateTime17.getYearOfEra();
        org.joda.time.Interval interval25 = duration10.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration35 = duration33.plus((long) 'u');
        org.joda.time.Instant instant37 = instant26.withDurationAdded((org.joda.time.ReadableDuration) duration33, (int) 'x');
        boolean boolean38 = mutableDateTime17.isEqual((org.joda.time.ReadableInstant) instant26);
        org.joda.time.format.DateTimePrinter dateTimePrinter39 = null;
        org.joda.time.format.DateTimeParser dateTimeParser40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter39, dateTimeParser40);
        boolean boolean42 = dateTimeFormatter41.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter43.getParser();
        java.lang.Integer int45 = dateTimeFormatter43.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeFormatter43.getZone();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period49 = new org.joda.time.Period((long) 1, periodType48);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.years();
        boolean boolean51 = periodType48.isSupported(durationFieldType50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(86400000L, chronology53);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.millisOfSecond();
        boolean boolean58 = durationFieldType50.isSupported(chronology55);
        org.joda.time.DateTimeField dateTimeField59 = chronology55.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology55.era();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter43.withChronology(chronology55);
        java.util.Locale locale62 = dateTimeFormatter61.getLocale();
        org.joda.time.DateTimeZone dateTimeZone63 = dateTimeFormatter61.getZone();
        mutableDateTime17.setZone(dateTimeZone63);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1969 + "'", int24 == 1969);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNull(dateTimeParser44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(locale62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 2030);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks(152);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean4 = dateTimeField2.isLeap((long) 1439);
        boolean boolean6 = dateTimeField2.isLeap(0L);
        long long8 = dateTimeField2.roundFloor((long) (byte) 1);
        int int10 = dateTimeField2.get((long) 5);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = dateTimeField2.getType();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.withZone(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime20.dayOfWeek();
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale25.getISO3Language();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime32 = property30.addToCopy((int) ' ');
        java.util.Locale locale33 = java.util.Locale.ITALY;
        int int34 = property30.getMaximumShortTextLength(locale33);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("PT0S");
        int int37 = property30.getMaximumShortTextLength(locale36);
        java.lang.String str38 = locale25.getDisplayVariant(locale36);
        java.lang.String str39 = property24.getAsText(locale25);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (-1), chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfEra();
        org.joda.time.DateTime dateTime45 = property43.addToCopy((int) ' ');
        java.util.Locale locale46 = java.util.Locale.ITALY;
        int int47 = property43.getMaximumShortTextLength(locale46);
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.lang.String str49 = locale48.getISO3Language();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfEra();
        org.joda.time.DateTime dateTime55 = property53.addToCopy((int) ' ');
        java.util.Locale locale56 = java.util.Locale.ITALY;
        int int57 = property53.getMaximumShortTextLength(locale56);
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("PT0S");
        int int60 = property53.getMaximumShortTextLength(locale59);
        java.lang.String str61 = locale48.getDisplayVariant(locale59);
        java.util.Locale locale62 = java.util.Locale.GERMAN;
        java.lang.String str63 = locale62.getISO3Language();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.DateTime.Property property67 = dateTime66.yearOfEra();
        org.joda.time.DateTime dateTime69 = property67.addToCopy((int) ' ');
        java.util.Locale locale70 = java.util.Locale.ITALY;
        int int71 = property67.getMaximumShortTextLength(locale70);
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("PT0S");
        int int74 = property67.getMaximumShortTextLength(locale73);
        java.lang.String str75 = locale62.getDisplayVariant(locale73);
        java.lang.String str76 = locale59.getDisplayLanguage(locale62);
        java.lang.String str77 = locale46.getDisplayLanguage(locale59);
        java.lang.String str78 = locale25.getDisplayVariant(locale46);
        java.lang.String str79 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localTime13, 23, locale46);
        org.joda.time.LocalTime.Property property80 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime81 = property80.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-52500000L) + "'", long8 == (-52500000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "deu" + "'", str26, "deu");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Donnerstag" + "'", str39, "Donnerstag");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "deu" + "'", str49, "deu");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "deu" + "'", str63, "deu");
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 9 + "'", int74 == 9);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Italian" + "'", str77, "Italian");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "23" + "'", str79, "23");
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localTime81);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 1439);
        org.joda.time.LocalDate localDate2 = yearMonthDay1.toLocalDate();
        org.joda.time.Chronology chronology3 = yearMonthDay1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((-472953600000L));
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.monthOfYear();
        int int3 = property2.get();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = dateTime6.toString(dateTimeFormatter7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime.Property property27 = dateTime10.year();
        org.joda.time.DateTime dateTime28 = property27.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds(86399999);
        int int31 = property2.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime33 = dateTime28.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime dateTime35 = dateTime28.withYearOfEra(26661213);
        java.util.Date date36 = dateTime35.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str8, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Jan 01 00:00:00 GMT+14:35 26661213");
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(26558518);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        int int1 = timeOfDay0.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay0.withMillisOfSecond((int) (short) 1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        mutablePeriod5.addYears((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay0.plus((org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Period period10 = org.joda.time.Period.months(1);
        org.joda.time.Period period12 = period10.plusWeeks(0);
        int int13 = period12.getHours();
        org.joda.time.Period period15 = period12.plusDays(19);
        org.joda.time.Period period17 = period15.withWeeks(90);
        int int18 = period15.getMinutes();
        org.joda.time.Period period20 = period15.minusYears(33);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay8.withPeriodAdded((org.joda.time.ReadablePeriod) period20, 26367315);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks23 = period20.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = period8.normalizedStandard(periodType9);
        org.joda.time.Period period12 = period10.minusDays(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period12.getFieldTypes();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.forFields(durationFieldTypeArray13);
        org.joda.time.PeriodType periodType15 = periodType14.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, (-31536000001L), periodType14);
        org.joda.time.PeriodType periodType17 = periodType14.withYearsRemoved();
        java.lang.String str18 = periodType14.getName();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period21 = new org.joda.time.Period((long) 1, periodType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = periodType20.isSupported(durationFieldType22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(86400000L, chronology25);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.millisOfSecond();
        boolean boolean30 = durationFieldType22.isSupported(chronology27);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        mutableDateTime33.setDayOfYear(1);
        mutableDateTime33.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone38);
        org.joda.time.Chronology chronology41 = chronology27.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (-1), chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        long long49 = duration48.getStandardMinutes();
        org.joda.time.Duration duration50 = duration48.toDuration();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfEra();
        org.joda.time.DateTime dateTime55 = dateTime53.toDateTime();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(dateTimeZone57);
        mutableDateTime58.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        mutableDateTime62.setDayOfYear(1);
        mutableDateTime62.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime62.getZone();
        mutableDateTime58.setZoneRetainFields(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = dateTime55.withZoneRetainFields(dateTimeZone67);
        int int71 = dateTimeZone67.getOffsetFromLocal((long) 0);
        org.joda.time.Chronology chronology72 = chronology41.withZone(dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField73 = chronology72.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (byte) 100);
        int int76 = localDateTime75.getWeekyear();
        org.joda.time.LocalDateTime.Property property77 = localDateTime75.millisOfSecond();
        long long79 = chronology72.set((org.joda.time.ReadablePartial) localDateTime75, (long) ' ');
        org.joda.time.DateTimeField dateTimeField80 = chronology72.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) 26209701, (long) (-1));
        mutablePeriod83.addHours(365);
        mutablePeriod83.setMillis(25);
        long long90 = chronology72.add((org.joda.time.ReadablePeriod) mutablePeriod83, 1645514357397L, 2070);
        org.joda.time.Period period91 = new org.joda.time.Period(1645513200000L, periodType14, chronology72);
        org.joda.time.PeriodType periodType92 = periodType14.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((long) 1007, (long) 3970, periodType14);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Standard" + "'", str18, "Standard");
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(dateTime69);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52500000 + "'", int71 == 52500000);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1970 + "'", int76 == 1970);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 100L + "'", long79 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 4311241779147L + "'", long90 == 4311241779147L);
        org.junit.Assert.assertNotNull(periodType92);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 6);
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = dateTime6.toString(dateTimeFormatter7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime.Property property27 = dateTime10.year();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableInstant) dateTime10);
        boolean boolean29 = timeOfDay1.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        mutableDateTime31.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone36.toTimeZone();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) timeOfDay1, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str8, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+14:35");
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        boolean boolean9 = period7.isSupported(durationFieldType8);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withZoneRetainFields(dateTimeZone12);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(366L, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone12);
        int int17 = dateTimeZone12.getOffset(993600000L);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+14:35");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateMidnight13);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52500000 + "'", int17 == 52500000);
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setYear(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        mutableDateTime1.setRounding(dateTimeField6);
        int int9 = dateTimeField6.getLeapAmount((long) (byte) 10);
        java.lang.String str11 = dateTimeField6.getAsText(0L);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = dateTimeField6.getAsShortText(1969, locale13);
        int int16 = dateTimeField6.getMinimumValue(118281600039L);
        org.joda.time.DurationField durationField17 = dateTimeField6.getDurationField();
        java.lang.String str18 = durationField17.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969" + "'", str14, "1969");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-292275054) + "'", int16 == (-292275054));
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "years" + "'", str18, "years");
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = dateTime3.toString(dateTimeFormatter4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTime.Property property24 = dateTime7.year();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateMidnight.Property property26 = dateMidnight0.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight27 = property26.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        org.joda.time.DateMidnight dateMidnight29 = property26.withMinimumValue();
        java.lang.String str30 = property26.getAsText();
        org.junit.Assert.assertNotNull(dateMidnight0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str5, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "22" + "'", str30, "22");
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(10);
        boolean boolean4 = localDate0.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        int int7 = dateTime6.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.weekOfWeekyear();
        int int10 = mutableDateTime8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour((int) (short) 10);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.addCopy((-308433560090L));
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property4.getFieldType();
        org.joda.time.LocalTime localTime8 = property4.getLocalTime();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1969, 999, 999, 52, (int) (byte) 100, 1439, 4, (int) '#');
        org.joda.time.PeriodType periodType12 = mutablePeriod11.getPeriodType();
        int int13 = periodType12.size();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, periodType12);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 1, periodType18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        boolean boolean21 = periodType18.isSupported(durationFieldType20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(86400000L, chronology23);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.millisOfSecond();
        boolean boolean28 = durationFieldType20.isSupported(chronology25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        mutableDateTime31.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone36);
        org.joda.time.Chronology chronology39 = chronology25.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.monthOfYear();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 50, (long) (short) 100, chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.Period period43 = new org.joda.time.Period(6156761356800007L, 26079259890519000L, periodType12, chronology39);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        java.util.Date date8 = new java.util.Date(52, (int) 'a', 52, 4, 1439);
        date8.setDate(10);
        date8.setDate(99);
        java.util.Date date16 = new java.util.Date(59, 100, 1969);
        boolean boolean17 = date8.before(date16);
        java.util.Date date23 = new java.util.Date(52, (int) 'a', 52, 4, 1439);
        int int24 = date23.getYear();
        java.time.Instant instant25 = date23.toInstant();
        boolean boolean26 = date16.before(date23);
        int int27 = date16.getYear();
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromDateFields(date16);
        org.joda.time.Chronology chronology29 = yearMonthDay28.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(25890579, 26446485, 728, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26446485 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Jun 07 03:59:00 GMT+14:35 1960");
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Sep 19 00:00:00 GMT+14:35 1972");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 24 03:59:00 GMT+14:35 1960");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 72 + "'", int27 == 72);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime25.toString(dateTimeFormatter26);
        int int28 = dateTime25.getMillisOfSecond();
        org.joda.time.Period period29 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime25);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime25.toGregorianCalendar();
        int int32 = gregorianCalendar30.getActualMaximum(2);
        int int33 = gregorianCalendar30.getWeeksInWeekYear();
        gregorianCalendar30.setMinimalDaysInFirstWeek(99);
        int int36 = gregorianCalendar30.getWeekYear();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar30);
        java.lang.String str38 = gregorianCalendar30.getCalendarType();
        long long39 = gregorianCalendar30.getTimeInMillis();
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone("55");
        java.util.TimeZone.setDefault(timeZone41);
        gregorianCalendar30.setTimeZone(timeZone41);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str27, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 999 + "'", int28 == 999);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 53 + "'", int33 == 53);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1969 + "'", int36 == 1969);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "gregory" + "'", str38, "gregory");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        mutableDateTime6.setYear(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        mutableDateTime6.setRounding(dateTimeField11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property15.addToCopy(20);
        org.joda.time.LocalDateTime localDateTime19 = property15.roundHalfEvenCopy();
        int int20 = localDateTime19.size();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusWeeks((-1));
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfEra();
        org.joda.time.DateTime dateTime29 = property27.addToCopy((int) ' ');
        java.util.Locale locale30 = java.util.Locale.ITALY;
        int int31 = property27.getMaximumShortTextLength(locale30);
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("PT0S");
        int int34 = property27.getMaximumShortTextLength(locale33);
        java.lang.String str35 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime19, 0, locale33);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(locale33);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.lang.String str38 = locale37.getISO3Language();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (-1), chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfEra();
        org.joda.time.DateTime dateTime44 = property42.addToCopy((int) ' ');
        java.util.Locale locale45 = java.util.Locale.ITALY;
        int int46 = property42.getMaximumShortTextLength(locale45);
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("PT0S");
        int int49 = property42.getMaximumShortTextLength(locale48);
        java.lang.String str50 = locale37.getDisplayVariant(locale48);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.lang.String str52 = locale51.getISO3Language();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfEra();
        org.joda.time.DateTime dateTime58 = property56.addToCopy((int) ' ');
        java.util.Locale locale59 = java.util.Locale.ITALY;
        int int60 = property56.getMaximumShortTextLength(locale59);
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("PT0S");
        int int63 = property56.getMaximumShortTextLength(locale62);
        java.lang.String str64 = locale51.getDisplayVariant(locale62);
        java.lang.String str65 = locale48.getDisplayLanguage(locale51);
        java.lang.String str66 = locale33.getDisplayLanguage(locale51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter3.withLocale(locale51);
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter67.withLocale(locale68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter69.withDefaultYear((int) 'a');
        java.lang.Integer int72 = dateTimeFormatter69.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter69.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter69.withPivotYear((java.lang.Integer) 593);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant76 = org.joda.time.Instant.parse("79187", dateTimeFormatter69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645514764897,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=4,MILLISECOND=897,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "deu" + "'", str38, "deu");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "deu" + "'", str52, "deu");
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNull(int72);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime25.toString(dateTimeFormatter26);
        int int28 = dateTime25.getMillisOfSecond();
        org.joda.time.Period period29 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime25);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime25.toGregorianCalendar();
        int int32 = gregorianCalendar30.getActualMaximum(2);
        int int33 = gregorianCalendar30.getWeeksInWeekYear();
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar30);
        gregorianCalendar30.set(83459999, 51, 1439);
        gregorianCalendar30.setMinimalDaysInFirstWeek(57);
        gregorianCalendar30.setLenient(true);
        java.time.Instant instant43 = gregorianCalendar30.toInstant();
        gregorianCalendar30.setMinimalDaysInFirstWeek(0);
        java.util.Date date46 = gregorianCalendar30.getTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str27, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 999 + "'", int28 == 999);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 53 + "'", int33 == 53);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Thu Mar 08 23:59:59 GMT 83460007");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays(10L);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period12 = new org.joda.time.Period((long) 1, periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        boolean boolean14 = periodType11.isSupported(durationFieldType13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration9, periodType11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 0, (long) 14, periodType11, chronology16);
        org.joda.time.PeriodType periodType18 = periodType11.withDaysRemoved();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = dateTime21.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int25 = dateTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = dateTime28.toString(dateTimeFormatter29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.toDateTime(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = dateTime32.toLocalTime();
        int int34 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology35 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((-3599948L), periodType18, chronology35);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 34 + "'", int25 == 34);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str30, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "Coordinated Universal Time", "PT0.035S" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        boolean boolean11 = strSet9.isEmpty();
        java.lang.String str12 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        boolean boolean14 = strSet9.add("T00:00:00.000");
        java.lang.String str15 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.stream.Stream<java.lang.String> strStream16 = strSet9.parallelStream();
        strSet9.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = strSet9.remove(obj18);
        java.lang.String[] strArray22 = new java.lang.String[] { "Coordinated Universal Time", "PT0.035S" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        boolean boolean25 = strSet23.isEmpty();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.monthOfYear();
        java.util.Date date29 = localDateTime27.toDate();
        org.joda.time.DateTime dateTime30 = localDateTime27.toDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.minusMonths((int) (short) 100);
        boolean boolean33 = strSet23.remove((java.lang.Object) localDateTime32);
        java.util.Iterator<java.lang.String> strItor34 = strSet23.iterator();
        strSet23.clear();
        boolean boolean36 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet23);
        java.lang.String[] strArray41 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "PT0S", "+00:00", "deu" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.stream.Stream<java.lang.String> strStream44 = strList42.parallelStream();
        boolean boolean45 = strSet23.containsAll((java.util.Collection<java.lang.String>) strList42);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 14:35:00 GMT 1970");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime25.toString(dateTimeFormatter26);
        int int28 = dateTime25.getMillisOfSecond();
        org.joda.time.Period period29 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime25);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime25.toGregorianCalendar();
        gregorianCalendar30.setFirstDayOfWeek((int) '4');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar30, chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime42 = dateTime40.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withZone(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.DateTime dateTime47 = dateTime44.minusMonths(9);
        mutableDateTime34.setTime((org.joda.time.ReadableInstant) dateTime47);
        mutableDateTime34.addMillis(32772);
        org.joda.time.Period period52 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.dayTime();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.years();
        boolean boolean55 = periodType53.isSupported(durationFieldType54);
        org.joda.time.Period period57 = period52.withField(durationFieldType54, 28);
        mutableDateTime34.add(durationFieldType54, 15);
        int int60 = mutableDateTime34.getHourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str27, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 999 + "'", int28 == 999);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 14 + "'", int60 == 14);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.set((int) '4', 32772, 32770, 72, 90);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=28488936605040,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2872,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=285,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=30,SECOND=5,MILLISECOND=40,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Duration duration10 = duration8.plus((long) 'u');
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration10, (-1));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime15.plusMonths(999);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 1, periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableInstant) dateTime21, periodType23);
        org.joda.time.Period period27 = period25.minusDays(12);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, periodType29);
        org.joda.time.Period period31 = period27.normalizedStandard(periodType29);
        org.joda.time.PeriodType periodType32 = periodType29.withMillisRemoved();
        org.joda.time.PeriodType periodType33 = periodType29.withMillisRemoved();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = property3.addToCopy((int) ' ');
        java.util.Locale locale6 = java.util.Locale.ITALY;
        int int7 = property3.getMaximumShortTextLength(locale6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("PT0S");
        int int10 = property3.getMaximumShortTextLength(locale9);
        java.lang.String str11 = locale9.getDisplayScript();
        java.lang.String str12 = locale9.getISO3Country();
        java.lang.String str13 = locale9.getISO3Language();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        int int15 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTime dateTime16 = dateMidnight14.toDateTime();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = dateTime19.toString(dateTimeFormatter20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Duration duration37 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period42 = new org.joda.time.Period((long) 1, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((java.lang.Object) duration37, periodType41);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.time();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, (org.joda.time.ReadableDuration) duration37, periodType44);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) (byte) 0, (long) 7);
        int int49 = duration37.compareTo((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean54 = dateTime52.isSupported(dateTimeFieldType53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int56 = dateTime52.get(dateTimeFieldType55);
        org.joda.time.Period period57 = duration48.toPeriodTo((org.joda.time.ReadableInstant) dateTime52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime59 = dateTime52.withDayOfMonth(26489678);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26489678 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str21, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 34 + "'", int56 == 34);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime25.toString(dateTimeFormatter26);
        int int28 = dateTime25.getMillisOfSecond();
        org.joda.time.Period period29 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime25);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime25.toGregorianCalendar();
        gregorianCalendar30.setFirstDayOfWeek((int) '4');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar30, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        mutableDateTime36.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        mutableDateTime40.setDayOfYear(1);
        mutableDateTime40.setMillisOfSecond((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime40.getZone();
        mutableDateTime36.setZoneRetainFields(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight47 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1), chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = dateTime50.toString(dateTimeFormatter51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (-1), chronology56);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (-1), chronology59);
        org.joda.time.Duration duration61 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (-1), chronology66);
        org.joda.time.Duration duration68 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableDuration) duration68);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration68);
        org.joda.time.DateTime.Property property71 = dateTime54.year();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight47, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateMidnight.Property property73 = dateMidnight47.yearOfCentury();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (-1), chronology75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (-1), chronology78);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime79);
        long long81 = duration80.getStandardMinutes();
        org.joda.time.Duration duration82 = duration80.toDuration();
        org.joda.time.Period period83 = new org.joda.time.Period((java.lang.Object) duration80);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight47.plus((org.joda.time.ReadableDuration) duration80);
        boolean boolean85 = dateTimeZone45.equals((java.lang.Object) dateMidnight47);
        mutableDateTime34.setZone(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime34.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime34.millisOfSecond();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime34.weekyear();
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime34.weekOfWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str4, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str27, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 999 + "'", int28 == 999);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateMidnight47);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01T14:34:59.999+14:35" + "'", str52, "1970-01-01T14:34:59.999+14:35");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertNotNull(dateMidnight84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(mutableDateTime87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property90);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths(999);
        org.joda.time.YearMonthDay yearMonthDay9 = dateTime8.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusYears(1);
        int int12 = yearMonthDay11.getDayOfMonth();
        java.lang.String str13 = yearMonthDay11.toString();
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay11.year();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.minusMonths(122);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusYears(0);
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int21 = dateTime20.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2052-04-01" + "'", str13, "2052-04-01");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusDays(9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period3.getFieldTypes();
        org.joda.time.Period period8 = period3.multipliedBy(26429889);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = period12.normalizedStandard(periodType13);
        java.lang.String str15 = period12.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = period19.normalizedStandard(periodType20);
        org.joda.time.Period period22 = period12.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) period19);
        org.joda.time.Period period25 = period19.minusSeconds(11);
        org.joda.time.Period period27 = period25.plusMillis(28);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.DateTime dateTime32 = dateTime30.toDateTime();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardDays(10L);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period37 = new org.joda.time.Period((long) 1, periodType36);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.years();
        boolean boolean39 = periodType36.isSupported(durationFieldType38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration34, periodType36);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1), chronology49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.Duration duration54 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Duration duration56 = duration54.plus((long) 'u');
        org.joda.time.Period period57 = duration56.toPeriod();
        boolean boolean58 = duration47.isEqual((org.joda.time.ReadableDuration) duration56);
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.dayTime();
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.years();
        boolean boolean61 = periodType59.isSupported(durationFieldType60);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration47, periodType59);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(86400000L, chronology64);
        org.joda.time.Chronology chronology66 = localDateTime65.getChronology();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (-1), chronology68);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) (-1), chronology71);
        org.joda.time.Duration duration73 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (-1), chronology75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (-1), chronology78);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime81 = dateTime79.toDateTime();
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration73, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((java.lang.Object) period82, chronology83);
        int[] intArray86 = chronology66.get((org.joda.time.ReadablePeriod) period82, (-1L));
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(chronology66);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((java.lang.Object) period27, periodType59, chronology66);
        org.joda.time.PeriodType periodType89 = periodType59.withWeeksRemoved();
        org.joda.time.PeriodType periodType90 = periodType89.withSecondsRemoved();
        org.joda.time.Period period91 = period3.normalizedStandard(periodType89);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0S" + "'", str15, "PT0S");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertNotNull(periodType90);
        org.junit.Assert.assertNotNull(period91);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "Coordinated Universal Time", "PT0.035S" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        boolean boolean11 = strSet9.isEmpty();
        java.lang.String str12 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        boolean boolean14 = strSet9.add("T00:00:00.000");
        java.lang.String str15 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.lang.String[] strArray18 = new java.lang.String[] { "Coordinated Universal Time", "PT0.035S" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        boolean boolean21 = strSet19.isEmpty();
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap23);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
    }
}
