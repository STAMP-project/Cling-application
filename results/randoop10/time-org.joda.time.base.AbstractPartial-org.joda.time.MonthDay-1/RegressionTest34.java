import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay6 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) '4', (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        boolean boolean15 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays((int) '#');
        int int21 = dateTime18.getWeekyear();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMillis((int) (short) 0);
        org.joda.time.Chronology chronology24 = dateTime18.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime14.withChronology(chronology24);
        org.joda.time.Chronology chronology26 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property33 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property36 = dateTime32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusDays((int) '#');
        int int42 = dateTime39.getWeekyear();
        org.joda.time.DateTime dateTime44 = dateTime39.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.plus(readablePeriod48);
        boolean boolean50 = dateTime39.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) dateTime39);
        int int52 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology53 = dateTime39.getChronology();
        boolean boolean54 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime56 = dateTime14.withCenturyOfEra(32772);
        org.joda.time.DateTime dateTime58 = dateTime14.minusMonths(43);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DurationField durationField18 = chronology15.millis();
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.DurationField durationField20 = chronology15.centuries();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone1);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear(100);
        int int13 = localDate10.size();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTime dateTime17 = localDate10.toDateTime(localTime16);
        int int18 = dateTime17.getEra();
        org.joda.time.DateTime dateTime20 = dateTime17.minusMillis(999);
        org.joda.time.LocalDate localDate21 = dateTime17.toLocalDate();
        org.joda.time.DateTime.Property property22 = dateTime17.year();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        boolean boolean24 = locale23.hasExtensions();
        boolean boolean25 = locale23.hasExtensions();
        java.lang.String str26 = property22.getAsText(locale23);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone7, locale23);
        int int28 = calendar27.getWeeksInWeekYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199990L) + "'", long5 == (-187199990L));
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022" + "'", str26, "2022");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1644572695370,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=370,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = dateTimeField4.getAsShortText((long) 10, locale11);
        java.lang.String str14 = locale11.getDisplayLanguage();
        java.util.Locale locale15 = locale11.stripExtensions();
        java.lang.String str16 = locale11.getDisplayName();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale11);
        java.util.Set<java.lang.String> strSet18 = locale11.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "janv." + "'", str13, "janv.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fran\347ais" + "'", str14, "fran\347ais");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fran\347ais" + "'", str16, "fran\347ais");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1644572695387,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=387,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        java.util.Date date5 = new java.util.Date((int) (short) 100, 100, 11, 0, (int) (byte) 10);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        org.joda.time.LocalDate.Property property11 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = property11.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDate14.getFields();
        org.joda.time.LocalDate localDate17 = localDate14.minusYears(2730);
        int int18 = localDate14.getMonthOfYear();
        java.util.Date date19 = localDate14.toDate();
        int int20 = date19.getHours();
        java.lang.String str21 = date19.toLocaleString();
        boolean boolean22 = date5.after(date19);
        int int23 = date5.getMinutes();
        java.lang.String str24 = date5.toLocaleString();
        int int25 = date5.getMonth();
        org.junit.Assert.assertEquals(date5.toString(), "Sun May 11 00:10:00 UTC 2008");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 13 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "13 f\351vr. 2022 00:00:00" + "'", str21, "13 f\351vr. 2022 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "11 mai 2008 00:10:00" + "'", str24, "11 mai 2008 00:10:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = locale10.getDisplayVariant(locale13);
        java.lang.String str15 = dateTimeZone2.getShortName((long) 20, locale10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays((int) '#');
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime18.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property29 = dateTime18.centuryOfEra();
        java.lang.String str30 = property29.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays((int) '#');
        int int36 = dateTime33.getWeekyear();
        org.joda.time.DateTime dateTime38 = dateTime33.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime33.plus(readablePeriod39);
        int int41 = property29.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.minus(readableDuration42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusMinutes(4);
        int int46 = dateTime43.getEra();
        int int47 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime43);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate50.withDayOfYear(100);
        org.joda.time.Interval interval53 = localDate52.toInterval();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.days();
        java.lang.String str55 = durationFieldType54.getName();
        org.joda.time.LocalDate localDate57 = localDate52.withFieldAdded(durationFieldType54, 32770);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.plus(readablePeriod61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property65 = dateTime64.dayOfWeek();
        org.joda.time.DateTime dateTime66 = localDate52.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        boolean boolean67 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean71 = dateTimeZone69.isStandardOffset(10L);
        java.lang.Object obj72 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long79 = dateTimeZone75.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(obj72, dateTimeZone75);
        org.joda.time.DateTime dateTime81 = dateTime80.toDateTime();
        int int82 = dateTimeZone69.getOffset((org.joda.time.ReadableInstant) dateTime80);
        long long86 = dateTimeZone69.convertLocalToUTC((long) 32772, false, (long) 292278994);
        org.joda.time.LocalDate localDate87 = org.joda.time.LocalDate.now(dateTimeZone69);
        java.util.Locale locale89 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(locale89);
        java.lang.String str91 = locale89.getDisplayVariant();
        java.lang.String str92 = dateTimeZone69.getName((long) 2175, locale89);
        java.util.Set<java.lang.String> strSet93 = locale89.getUnicodeLocaleKeys();
        java.util.Calendar calendar94 = dateTime66.toCalendar(locale89);
        org.joda.time.ReadablePeriod readablePeriod95 = null;
        org.joda.time.DateTime dateTime97 = dateTime66.withPeriodAdded(readablePeriod95, 49088531);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-187199996L) + "'", long7 == (-187199996L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572695417,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=417,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+52:00" + "'", str15, "+52:00");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19" + "'", str30, "19");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 187200000 + "'", int47 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "days" + "'", str55, "days");
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-187199987L) + "'", long79 == (-187199987L));
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 32762L + "'", long86 == 32762L);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "+00:00:00.010" + "'", str92, "+00:00:00.010");
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNotNull(calendar94);
// flaky:         org.junit.Assert.assertEquals(calendar94.toString(), "java.util.GregorianCalendar[time=1649375999999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=7,DAY_OF_YEAR=97,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime97);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology30 = chronology26.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField31 = chronology26.weeks();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.hourOfHalfday();
        boolean boolean34 = dateTimeFieldType15.isSupported(chronology26);
        org.joda.time.DurationField durationField35 = chronology26.minutes();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology26);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.withPeriodAdded(readablePeriod37, 28);
        org.joda.time.DateTime dateTime41 = dateTime36.withCenturyOfEra(719571);
        org.joda.time.DateTime dateTime43 = dateTime41.plusYears(108);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.Chronology chronology16 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime2.plusHours((int) (short) -1);
        org.joda.time.DateTime dateTime20 = dateTime2.withYearOfEra(19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        int int23 = dateTime20.getYearOfEra();
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(49207310);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime24.getZone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u516c\u5143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '??' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(52);
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfYear();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear(100);
        org.joda.time.LocalDate.Property property9 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate6.withDayOfMonth(21);
        org.joda.time.LocalDate.Property property12 = localDate6.dayOfMonth();
        int int13 = property12.getMinimumValueOverall();
        org.joda.time.LocalDate localDate14 = property12.roundCeilingCopy();
        int int15 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property21 = dateTime20.hourOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.secondOfDay();
        boolean boolean26 = localDate14.equals((java.lang.Object) dateTimeField25);
        org.joda.time.LocalDate localDate28 = localDate14.withYearOfEra(2922786);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean3 = dateTimeZone1.isStandardOffset(10L);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long11 = dateTimeZone7.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj4, dateTimeZone7);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        int int14 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime12);
        long long18 = dateTimeZone1.convertLocalToUTC((long) 32772, false, (long) 292278994);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone1);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        long long25 = dateTimeZone21.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime26 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekyear(100);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(104294356487196000L);
        int int31 = dateTime28.getMillisOfSecond();
        int int32 = dateTime28.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-187199987L) + "'", long11 == (-187199987L));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32762L + "'", long18 == 32762L);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-187199990L) + "'", long25 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 529 + "'", int31 == 529);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 13 + "'", int32 == 13);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1965);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateTime6.toDateMidnight();
        int int9 = dateTime6.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime6.minusMillis(240);
        int int12 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1965 + "'", int12 == 1965);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        java.lang.String str12 = monthDay11.toString();
        org.joda.time.Chronology chronology13 = monthDay11.getChronology();
        org.joda.time.Chronology chronology14 = monthDay11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter9.withChronology(chronology14);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer17, 1644710400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--01-03" + "'", str12, "--01-03");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.set((-1), 0, 32770, (int) 'u', (int) (byte) -1, 1439);
        int int11 = calendar1.getMinimalDaysInFirstWeek();
        int int13 = calendar1.getMinimum((int) (byte) 1);
        calendar1.setMinimalDaysInFirstWeek(92);
        int int16 = calendar1.getMinimalDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 23, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone18);
        java.util.TimeZone timeZone22 = dateTimeZone18.toTimeZone();
        calendar1.setTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=92,ERA=1,YEAR=-1,MONTH=0,WEEK_OF_YEAR=38,WEEK_OF_MONTH=4,DAY_OF_MONTH=32770,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=117,MINUTE=-1,SECOND=1439,MILLISECOND=578,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 92 + "'", int16 == 92);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime5.secondOfDay();
        org.joda.time.DateTime dateTime10 = property8.setCopy(8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, 1973);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime10.getZone();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((-42868800205L), dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusDays((int) 'u');
        long long10 = dateTime4.getMillis();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear(100);
        org.joda.time.Interval interval16 = localDate15.toInterval();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        java.lang.String str18 = durationFieldType17.getName();
        org.joda.time.LocalDate localDate20 = localDate15.withFieldAdded(durationFieldType17, 32770);
        org.joda.time.DateTime dateTime22 = dateTime4.withFieldAdded(durationFieldType17, 3);
        org.joda.time.DateTime dateTime24 = dateTime22.minus((long) 11279);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean29 = dateTimeZone27.isStandardOffset(10L);
        long long32 = dateTimeZone27.adjustOffset((-58474832460001L), false);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone27);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 187200000, dateTimeZone27);
        org.joda.time.DateTime dateTime35 = dateTime24.toDateTime(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTime35.toString("1970-02-09T11:00:59.999+97:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60526224000001L) + "'", long10 == (-60526224000001L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "days" + "'", str18, "days");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-58474832460001L) + "'", long32 == (-58474832460001L));
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 4, dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readablePeriod5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        java.lang.String str8 = property7.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.fromDateFields(date1);
        java.util.Date date6 = new java.util.Date(0, 0, (int) '4');
        date6.setDate(12);
        date6.setHours(2922789);
        date6.setTime(9L);
        java.util.Date date16 = new java.util.Date(0, 0, (int) '4');
        int int17 = date16.getHours();
        boolean boolean18 = date6.before(date16);
        java.lang.String str19 = date6.toLocaleString();
        date6.setMonth(187200000);
        date6.setDate((-1));
        int int24 = date6.getSeconds();
        boolean boolean25 = date1.before(date6);
        int int26 = date1.getHours();
        int int27 = date1.getYear();
        int int28 = date1.getMonth();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Dec 30 00:00:00 UTC 15601969");
        org.junit.Assert.assertEquals(date16.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1 janv. 1970 00:00:00" + "'", str19, "1 janv. 1970 00:00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 70 + "'", int27 == 70);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.MonthDay monthDay5 = monthDay1.minus(readablePeriod4);
        org.joda.time.MonthDay.Property property6 = monthDay1.dayOfMonth();
        java.lang.String str7 = property6.toString();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.MonthDay monthDay10 = property6.getMonthDay();
        int int11 = property6.getMaximumValue();
        java.util.Locale locale12 = null;
        int int13 = property6.getMaximumTextLength(locale12);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = locale14.getDisplayScript(locale15);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale15);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale15);
        int int20 = property6.getMaximumTextLength(locale15);
        int int21 = property6.getMaximumValueOverall();
        org.joda.time.MonthDay monthDay23 = new org.joda.time.MonthDay(0L);
        java.lang.String str24 = monthDay23.toString();
        org.joda.time.Chronology chronology25 = monthDay23.getChronology();
        org.joda.time.Chronology chronology26 = monthDay23.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekOfWeekyear();
        java.util.Locale locale33 = new java.util.Locale("hi!", "1969-12-31T23:59:59.999Z", "11");
        int int34 = dateTimeField29.getMaximumShortTextLength(locale33);
        int int35 = property6.getMaximumShortTextLength(locale33);
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfMonth]" + "'", str7, "Property[dayOfMonth]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1644572695668,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=668,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1644572695668,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=668,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "--01-03" + "'", str24, "--01-03");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!_1969-12-31T23:59:59.999Z_11");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder0.setDate(59, (int) (byte) 1, 2022);
        java.util.Calendar.Builder builder11 = builder0.setDate(14399, 52, 4);
        java.util.Calendar calendar12 = builder11.build();
        calendar12.setMinimalDaysInFirstWeek((int) (byte) 0);
        int int15 = calendar12.getWeekYear();
        int int16 = calendar12.getMinimalDaysInFirstWeek();
        java.util.Date date17 = calendar12.getTime();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=392358211200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=0,ERA=1,YEAR=14403,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=124,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14403 + "'", int15 == 14403);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun May 04 00:00:00 UTC 14403");
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.set((-1), 0, 32770, (int) 'u', (int) (byte) -1, 1439);
        calendar1.set(48949, 17, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) '#');
        boolean boolean22 = dateTime19.isBeforeNow();
        int int23 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime28.hourOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime28.withYearOfEra((int) ' ');
        java.util.Locale locale34 = java.util.Locale.FRENCH;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        java.lang.String str36 = locale34.getCountry();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property42 = dateTime41.hourOfDay();
        java.lang.String str43 = property42.getAsShortText();
        org.joda.time.MonthDay monthDay44 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay46 = monthDay44.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField48 = monthDay46.getField((int) (byte) 0);
        java.util.Locale locale52 = new java.util.Locale("", "", "hi!");
        int int53 = dateTimeField48.getMaximumTextLength(locale52);
        long long56 = dateTimeField48.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay57 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay59 = monthDay57.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.MonthDay monthDay61 = monthDay57.minus(readablePeriod60);
        org.joda.time.MonthDay monthDay62 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay64 = monthDay62.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField66 = monthDay64.getField((int) (byte) 0);
        java.util.Locale locale70 = new java.util.Locale("", "", "hi!");
        int int71 = dateTimeField66.getMaximumTextLength(locale70);
        java.lang.String str72 = dateTimeField48.getAsShortText((org.joda.time.ReadablePartial) monthDay57, locale70);
        int int73 = property42.getMaximumTextLength(locale70);
        java.lang.String str74 = locale34.getDisplayVariant(locale70);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale70.getDisplayScript(locale75);
        java.util.Calendar calendar77 = dateTime33.toCalendar(locale70);
        java.util.Calendar calendar78 = dateTime19.toCalendar(locale70);
        java.lang.String str79 = locale70.getVariant();
        java.util.Map<java.lang.String, java.lang.Integer> strMap80 = calendar1.getDisplayNames(12, 0, locale70);
        java.time.Instant instant81 = calendar1.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(205, 205);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1482559881779695,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=48950,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=165,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=22,SECOND=59,MILLISECOND=695,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 239 + "'", int23 == 239);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar35);
// flaky:         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1644572695695,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=695,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3" + "'", str43, "3");
        org.junit.Assert.assertNotNull(monthDay46);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 9L + "'", long56 == 9L);
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(monthDay61);
        org.junit.Assert.assertNotNull(monthDay64);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Feb" + "'", str72, "Feb");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(calendar77);
// flaky:         org.junit.Assert.assertEquals(calendar77.toString(), "java.util.GregorianCalendar[time=-61157376000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar78);
// flaky:         org.junit.Assert.assertEquals(calendar78.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNull(strMap80);
        org.junit.Assert.assertNotNull(instant81);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(32769);
        org.joda.time.LocalDate localDate15 = localDate4.minusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(100);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime16.withEra(1941);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1941 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long7 = dateTimeZone3.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        java.lang.String str10 = dateTimeZone3.getName((long) 1970);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone3);
        java.util.Date date17 = new java.util.Date(32770, 29, 14, (int) (short) -1, 14);
        boolean boolean18 = localDate11.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-187199987L) + "'", long7 == (-187199987L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+52:00" + "'", str10, "+52:00");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jun 13 23:14:00 UTC 34672");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) '#');
        int int9 = dateTime6.getWeekyear();
        org.joda.time.DateMidnight dateMidnight10 = dateTime6.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property12 = dateTime6.property(dateTimeFieldType11);
        org.joda.time.DateTime.Property property13 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime15 = dateTime6.withCenturyOfEra(20);
        int int16 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime6.withYearOfEra((int) (short) 100);
        int int19 = dateTime6.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.MonthDay monthDay31 = monthDay21.withChronologyRetainFields(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime6.toMutableDateTime(chronology30);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property42 = dateTime41.hourOfDay();
        org.joda.time.DateTime dateTime44 = dateTime41.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology45 = dateTime44.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology49 = chronology45.withZone(dateTimeZone48);
        org.joda.time.DurationField durationField50 = chronology45.weeks();
        org.joda.time.DateTimeField dateTimeField51 = chronology45.clockhourOfDay();
        long long56 = chronology45.getDateTimeMillis((-1), 8, 2, 17);
        org.joda.time.MonthDay monthDay57 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay59 = monthDay57.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField61 = monthDay59.getField((int) (byte) 0);
        java.util.Locale locale65 = new java.util.Locale("", "", "hi!");
        int int66 = dateTimeField61.getMaximumTextLength(locale65);
        long long69 = dateTimeField61.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay70 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay72 = monthDay70.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.MonthDay monthDay74 = monthDay70.minus(readablePeriod73);
        org.joda.time.MonthDay monthDay75 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay77 = monthDay75.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField79 = monthDay77.getField((int) (byte) 0);
        java.util.Locale locale83 = new java.util.Locale("", "", "hi!");
        int int84 = dateTimeField79.getMaximumTextLength(locale83);
        java.lang.String str85 = dateTimeField61.getAsShortText((org.joda.time.ReadablePartial) monthDay70, locale83);
        int[] intArray86 = monthDay70.getValues();
        int[] intArray88 = chronology45.get((org.joda.time.ReadablePartial) monthDay70, (long) 4);
        org.joda.time.MonthDay monthDay89 = new org.joda.time.MonthDay(chronology45);
        boolean boolean90 = dateTimeFieldType36.isSupported(chronology45);
        org.joda.time.DurationField durationField91 = chronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField92 = chronology45.weekOfWeekyear();
        org.joda.time.DurationField durationField93 = chronology45.halfdays();
        org.joda.time.DateTimeField dateTimeField94 = chronology45.era();
        org.joda.time.DurationField durationField95 = chronology45.hours();
        org.joda.time.MutableDateTime mutableDateTime96 = dateTime6.toMutableDateTime(chronology45);
        org.joda.time.DateTimeZone dateTimeZone97 = dateTime6.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 349260000 + "'", int16 == 349260000);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-62180539199983L) + "'", long56 == (-62180539199983L));
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 9L + "'", long69 == 9L);
        org.junit.Assert.assertNotNull(monthDay72);
        org.junit.Assert.assertNotNull(monthDay74);
        org.junit.Assert.assertNotNull(monthDay77);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Feb" + "'", str85, "Feb");
        org.junit.Assert.assertNotNull(intArray86);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[2, 13]");
        org.junit.Assert.assertNotNull(intArray88);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 3]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(durationField91);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(durationField93);
        org.junit.Assert.assertNotNull(dateTimeField94);
        org.junit.Assert.assertNotNull(durationField95);
        org.junit.Assert.assertNotNull(mutableDateTime96);
        org.junit.Assert.assertNotNull(dateTimeZone97);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("USA", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        java.util.Locale locale2 = new java.util.Locale("2022-01-09T00:00:00.000+97:01", "");
        org.junit.Assert.assertEquals(locale2.toString(), "2022-01-09t00:00:00.000+97:01");
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withYearOfEra((int) ' ');
        int int10 = dateTime4.getYearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekOfWeekyear(9);
        org.joda.time.DateTime dateTime14 = dateTime4.plus(32762L);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withPeriodAdded(readablePeriod16, 366);
        org.joda.time.DateTime dateTime20 = dateTime14.plusMonths(684);
        org.joda.time.MonthDay monthDay23 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property24 = monthDay23.monthOfYear();
        int int25 = property24.getMinimumValueOverall();
        java.util.Locale locale29 = new java.util.Locale("years", "italien", "Cina");
        java.lang.String str30 = property24.getAsText(locale29);
        int int31 = property24.getMaximumValue();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale32);
        java.lang.String str34 = locale32.getCountry();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property40 = dateTime39.hourOfDay();
        java.lang.String str41 = property40.getAsShortText();
        org.joda.time.MonthDay monthDay42 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay44 = monthDay42.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField46 = monthDay44.getField((int) (byte) 0);
        java.util.Locale locale50 = new java.util.Locale("", "", "hi!");
        int int51 = dateTimeField46.getMaximumTextLength(locale50);
        long long54 = dateTimeField46.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay55 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay57 = monthDay55.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.MonthDay monthDay59 = monthDay55.minus(readablePeriod58);
        org.joda.time.MonthDay monthDay60 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay62 = monthDay60.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField64 = monthDay62.getField((int) (byte) 0);
        java.util.Locale locale68 = new java.util.Locale("", "", "hi!");
        int int69 = dateTimeField64.getMaximumTextLength(locale68);
        java.lang.String str70 = dateTimeField46.getAsShortText((org.joda.time.ReadablePartial) monthDay55, locale68);
        int int71 = property40.getMaximumTextLength(locale68);
        java.lang.String str72 = locale32.getDisplayVariant(locale68);
        java.util.Locale locale74 = new java.util.Locale("en-US");
        java.lang.String str75 = locale68.getDisplayLanguage(locale74);
        java.lang.String str76 = property24.getAsText(locale68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = dateTime20.toString("mercoled\354 (2 APR 2104 08:59:23 GMT)", locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals(locale29.toString(), "years_ITALIEN_Cina");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "January" + "'", str30, "January");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1644572695839,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=839,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "3" + "'", str41, "3");
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 9L + "'", long54 == 9L);
        org.junit.Assert.assertNotNull(monthDay57);
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(monthDay62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Feb" + "'", str70, "Feb");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals(locale74.toString(), "en-us");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "January" + "'", str76, "January");
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str3 = locale0.getExtension('a');
        java.lang.String str4 = locale0.getVariant();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale7.getDisplayVariant(locale10);
        java.util.Locale.setDefault(category5, locale10);
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = locale14.getDisplayScript(locale15);
        java.lang.String str18 = locale13.getDisplayCountry(locale14);
        java.lang.String str19 = locale14.getDisplayLanguage();
        java.util.Locale.setDefault(category5, locale14);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property26 = dateTime25.hourOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology33 = chronology29.withZone(dateTimeZone32);
        org.joda.time.MonthDay monthDay34 = org.joda.time.MonthDay.now(chronology29);
        org.joda.time.DateTimeField dateTimeField35 = chronology29.dayOfMonth();
        org.joda.time.DurationField durationField36 = chronology29.millis();
        org.joda.time.DateTimeField dateTimeField37 = chronology29.year();
        java.lang.String str38 = dateTimeField37.getName();
        int int40 = dateTimeField37.getLeapAmount((long) 100);
        org.joda.time.DurationField durationField41 = dateTimeField37.getLeapDurationField();
        java.util.Locale locale42 = java.util.Locale.JAPANESE;
        int int43 = dateTimeField37.getMaximumShortTextLength(locale42);
        java.util.Locale.setDefault(category5, locale42);
        java.lang.String str45 = locale0.getDisplayLanguage(locale42);
        java.util.Set<java.lang.String> strSet46 = locale42.getUnicodeLocaleKeys();
        java.util.Locale locale48 = new java.util.Locale("Canada");
        java.lang.String str49 = locale42.getDisplayLanguage(locale48);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644572695880,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=55,MILLISECOND=880,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str19, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "year" + "'", str38, "year");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str45, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals(locale48.toString(), "canada");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Japanese" + "'", str49, "Japanese");
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        java.util.Locale locale2 = new java.util.Locale("59", "Francia");
        org.junit.Assert.assertEquals(locale2.toString(), "59_FRANCIA");
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusYears((int) '4');
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = dateTime10.toString("--02-01", locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime10.getZone();
        long long17 = dateTimeZone14.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--02-01" + "'", str13, "--02-01");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-818880000L) + "'", long17 == (-818880000L));
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(2022);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        java.lang.String str8 = durationFieldType7.getName();
        org.joda.time.DateTime dateTime10 = dateTime6.withFieldAdded(durationFieldType7, 1);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(11);
        org.joda.time.Chronology chronology13 = dateTime10.getChronology();
        org.joda.time.Chronology chronology14 = chronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyear();
        org.joda.time.DurationField durationField16 = chronology14.months();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "days" + "'", str8, "days");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(32769);
        int int14 = localDate4.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) localDate4);
        org.joda.time.LocalDate localDate17 = localDate15.plusMonths((-1970));
        int int18 = localDate17.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1858 + "'", int18 == 1858);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        java.util.Date date1 = new java.util.Date(124243200100L);
        int int2 = date1.getMonth();
        java.time.Instant instant3 = date1.toInstant();
        java.lang.Object obj4 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Sun Dec 09 00:00:00 UTC 1973");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Sun Dec 09 00:00:00 UTC 1973");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Sun Dec 09 00:00:00 UTC 1973");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Sun Dec 09 00:00:00 UTC 1973");
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate15.plus(readablePeriod21);
        org.joda.time.LocalDate.Property property23 = localDate22.weekyear();
        org.joda.time.Chronology chronology24 = localDate22.getChronology();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.hourOfDay();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology24);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.clear();
        java.lang.String str9 = calendar1.getCalendarType();
        org.joda.time.MonthDay monthDay10 = org.joda.time.MonthDay.fromCalendarFields(calendar1);
        java.util.Locale locale13 = new java.util.Locale("13 f\351vr. 2022 00:00:00");
        java.lang.String str14 = monthDay10.toString("14400097", locale13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = monthDay10.getFieldTypes();
        int int16 = monthDay10.getDayOfMonth();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertEquals(locale13.toString(), "13 f\351vr. 2022 00:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "14400097" + "'", str14, "14400097");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(314, 39600637, 1965, 0, 97, 2175);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(97L);
        org.joda.time.DateTime dateTime9 = property5.addWrapFieldToCopy(21);
        org.joda.time.DateTime dateTime10 = property5.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2022");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) '#');
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime6.plusWeeks(5);
        org.joda.time.Chronology chronology19 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withChronology(chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withPivotYear(14399967);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra(52);
        org.joda.time.LocalDate.Property property28 = localDate27.weekOfWeekyear();
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str33 = locale30.getExtension('a');
        org.joda.time.LocalDate localDate34 = property28.setCopy("3", locale30);
        java.lang.String str35 = locale30.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter21.withLocale(locale30);
        org.joda.time.Chronology chronology37 = dateTimeFormatter21.getChronolgy();
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "it" + "'", str31, "it");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(chronology37);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.MonthDay monthDay5 = monthDay1.minus(readablePeriod4);
        org.joda.time.MonthDay.Property property6 = monthDay1.dayOfMonth();
        java.lang.String str7 = property6.toString();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = property6.addWrapFieldToCopy(39659999);
        org.joda.time.MonthDay monthDay13 = property6.addToCopy(211);
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfMonth]" + "'", str7, "Property[dayOfMonth]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(monthDay13);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.secondOfMinute();
        org.joda.time.Chronology chronology18 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        calendar1.set(10, 2022, 2922789, 3, 11, 32772);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        boolean boolean14 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=195994469832087,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=8180,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=299,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=17,SECOND=12,MILLISECOND=87,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale.setDefault(category0, locale2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay13 = monthDay11.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = monthDay13.getField((int) (byte) 0);
        java.util.Locale locale19 = new java.util.Locale("", "", "hi!");
        int int20 = dateTimeField15.getMaximumTextLength(locale19);
        long long23 = dateTimeField15.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay26 = monthDay24.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.MonthDay monthDay28 = monthDay24.minus(readablePeriod27);
        org.joda.time.MonthDay monthDay29 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay31 = monthDay29.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField33 = monthDay31.getField((int) (byte) 0);
        java.util.Locale locale37 = new java.util.Locale("", "", "hi!");
        int int38 = dateTimeField33.getMaximumTextLength(locale37);
        java.lang.String str39 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) monthDay24, locale37);
        int int40 = property9.getMaximumTextLength(locale37);
        org.joda.time.DateTimeField dateTimeField41 = property9.getField();
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale42);
        int int44 = property9.getMaximumTextLength(locale42);
        boolean boolean45 = locale42.hasExtensions();
        java.lang.String str46 = locale42.getDisplayCountry();
        boolean boolean47 = locale42.hasExtensions();
        java.util.Locale.setDefault(category0, locale42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = locale42.getUnicodeLocaleType("9 Jun 7492 22:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 9 Jun 7492 22:00:00 GMT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11" + "'", str10, "11");
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertNotNull(monthDay26);
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feb" + "'", str39, "Feb");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1644572696098,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=98,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        int int5 = dateTimeField4.getMinimumValue();
        int int6 = dateTimeField4.getMinimumValue();
        org.joda.time.DurationField durationField7 = dateTimeField4.getRangeDurationField();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale8.getDisplayLanguage();
        int int11 = dateTimeField4.getMaximumTextLength(locale8);
        java.util.Locale locale12 = locale8.stripExtensions();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale8);
        java.util.Set<java.lang.Character> charSet14 = locale8.getExtensionKeys();
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien" + "'", str10, "italien");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1644572696119,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=119,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(charSet14);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime1.weekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded(readableDuration4, 13);
        int int7 = dateTime6.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        java.util.Locale locale6 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        int int4 = date3.getHours();
        java.time.Instant instant5 = date3.toInstant();
        date3.setHours((int) 'a');
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks(0);
        org.junit.Assert.assertEquals(date3.toString(), "Sun Feb 25 01:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime12.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property21 = dateTime20.hourOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology28 = chronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = chronology24.weekyearOfCentury();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(83968099800000L, chronology24);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate30.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime37 = dateTime35.minusYears((int) (short) 10);
        int int38 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime14.getZone();
        org.joda.time.DateTime dateTime41 = dateTime14.minusMonths(49347543);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays((int) '#');
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime25.plusWeeks(5);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        int int39 = dateTime38.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime42.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = dateTime42.plusWeeks(5);
        org.joda.time.Chronology chronology55 = dateTime42.getChronology();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime57 = dateTime42.minus(readablePeriod56);
        int int58 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime57);
        boolean boolean59 = calendar1.after((java.lang.Object) int58);
        int int60 = calendar1.getWeeksInWeekYear();
        calendar1.setFirstDayOfWeek(43199999);
        int int63 = calendar1.getFirstDayOfWeek();
        int int64 = calendar1.getWeeksInWeekYear();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property70 = dateTime69.hourOfDay();
        org.joda.time.DateTime dateTime72 = dateTime69.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime74 = dateTime69.withYearOfEra((int) ' ');
        int int75 = dateTime69.getYearOfCentury();
        int int76 = dateTime69.getMonthOfYear();
        org.joda.time.DateTime.Property property77 = dateTime69.millisOfSecond();
        org.joda.time.DateTime dateTime78 = property77.roundHalfFloorCopy();
        boolean boolean79 = calendar1.before((java.lang.Object) dateTime78);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = calendar1.getLeastMaximum(49367);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49367");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1660953600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=43199999,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=232,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 20 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 43199999 + "'", int63 == 43199999);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 52 + "'", int75 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.lang.String str3 = property2.getAsText();
        int int4 = property2.get();
        int int5 = property2.getMaximumValueOverall();
        int int6 = property2.get();
        int int7 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "janvier" + "'", str3, "janvier");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        int int9 = property2.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField10 = property2.getField();
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        int int12 = property2.getMinimumValueOverall();
        java.lang.String str13 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "janv." + "'", str13, "janv.");
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = locale10.getDisplayVariant(locale13);
        java.lang.String str15 = dateTimeZone2.getShortName((long) 20, locale10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays((int) '#');
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime18.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property29 = dateTime18.centuryOfEra();
        java.lang.String str30 = property29.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays((int) '#');
        int int36 = dateTime33.getWeekyear();
        org.joda.time.DateTime dateTime38 = dateTime33.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime33.plus(readablePeriod39);
        int int41 = property29.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.minus(readableDuration42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusMinutes(4);
        int int46 = dateTime43.getEra();
        int int47 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime43);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate50.withDayOfYear(100);
        org.joda.time.Interval interval53 = localDate52.toInterval();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.days();
        java.lang.String str55 = durationFieldType54.getName();
        org.joda.time.LocalDate localDate57 = localDate52.withFieldAdded(durationFieldType54, 32770);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.plus(readablePeriod61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property65 = dateTime64.dayOfWeek();
        org.joda.time.DateTime dateTime66 = localDate52.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        boolean boolean67 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean71 = dateTimeZone69.isStandardOffset(10L);
        java.lang.Object obj72 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long79 = dateTimeZone75.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(obj72, dateTimeZone75);
        org.joda.time.DateTime dateTime81 = dateTime80.toDateTime();
        int int82 = dateTimeZone69.getOffset((org.joda.time.ReadableInstant) dateTime80);
        long long86 = dateTimeZone69.convertLocalToUTC((long) 32772, false, (long) 292278994);
        org.joda.time.LocalDate localDate87 = org.joda.time.LocalDate.now(dateTimeZone69);
        java.util.Locale locale89 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(locale89);
        java.lang.String str91 = locale89.getDisplayVariant();
        java.lang.String str92 = dateTimeZone69.getName((long) 2175, locale89);
        java.util.Set<java.lang.String> strSet93 = locale89.getUnicodeLocaleKeys();
        java.util.Calendar calendar94 = dateTime66.toCalendar(locale89);
        // The following exception was thrown during execution in test generation
        try {
            calendar94.roll(1922, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-818879996L) + "'", long7 == (-818879996L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572696278,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=278,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+227:28" + "'", str15, "+227:28");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19" + "'", str30, "19");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 818880000 + "'", int47 == 818880000);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "days" + "'", str55, "days");
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-187199987L) + "'", long79 == (-187199987L));
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 32762L + "'", long86 == 32762L);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "+00:00:00.010" + "'", str92, "+00:00:00.010");
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNotNull(calendar94);
// flaky:         org.junit.Assert.assertEquals(calendar94.toString(), "java.util.GregorianCalendar[time=1648771199999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+227:28,offset=818880000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=27,SECOND=59,MILLISECOND=999,ZONE_OFFSET=818880000,DST_OFFSET=0]");
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(2730);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear(100);
        org.joda.time.Interval interval14 = localDate13.toInterval();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        java.lang.String str16 = durationFieldType15.getName();
        org.joda.time.LocalDate localDate18 = localDate13.withFieldAdded(durationFieldType15, 32770);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime23.hourOfDay();
        org.joda.time.DateTime dateTime26 = dateTime23.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology31 = chronology27.withZone(dateTimeZone30);
        java.lang.String str32 = chronology27.toString();
        org.joda.time.DurationField durationField33 = chronology27.seconds();
        boolean boolean34 = durationFieldType15.isSupported(chronology27);
        org.joda.time.LocalDate localDate36 = localDate6.withFieldAdded(durationFieldType15, 22);
        org.joda.time.LocalDate localDate38 = localDate6.withYear(21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = localDate6.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime42.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = dateTime42.minusMinutes(52);
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(dateTimeZone56);
        long long60 = dateTimeZone56.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime61 = dateTime42.withZone(dateTimeZone56);
        java.lang.String str63 = dateTimeZone56.getNameKey(631680016L);
        org.joda.time.DateTime dateTime64 = localDate6.toDateTimeAtCurrentTime(dateTimeZone56);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Jul 24 00:00:00 UTC 1907");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "days" + "'", str16, "days");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[+227:28]" + "'", str32, "ISOChronology[+227:28]");
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-818879990L) + "'", long60 == (-818879990L));
        org.junit.Assert.assertNotNull(dateTime61);
// flaky:         org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(dateTime64);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        java.lang.String str4 = monthDay0.toString("23");
        org.joda.time.MonthDay monthDay6 = monthDay0.withDayOfMonth(23);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23" + "'", str4, "23");
        org.junit.Assert.assertNotNull(monthDay6);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusDays((int) '#');
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime22.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime22.plusWeeks(5);
        int int35 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate38 = localDate36.plusYears(2022);
        java.lang.String str39 = localDate36.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate41 = localDate36.withCenturyOfEra(49407763);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49407763 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 187200000 + "'", int35 == 187200000);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-13" + "'", str39, "2022-02-13");
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        boolean boolean9 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withDefaultYear(4);
        boolean boolean12 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronology();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        calendar1.setLenient(false);
        boolean boolean11 = calendar1.isWeekDateSupported();
        int int13 = calendar1.getLeastMaximum(5);
        java.util.Date date17 = new java.util.Date(0, 0, (int) '4');
        int int18 = date17.getHours();
        int int19 = date17.getMinutes();
        java.util.Date date23 = new java.util.Date(0, 0, (int) '4');
        date23.setDate(12);
        date23.setTime(1L);
        boolean boolean28 = date17.after(date23);
        int int29 = date23.getDay();
        int int30 = date23.getMinutes();
        org.joda.time.MonthDay monthDay31 = org.joda.time.MonthDay.fromDateFields(date23);
        calendar1.setTime(date23);
        long long33 = calendar1.getTimeInMillis();
        int int34 = calendar1.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = calendar1.get(2922786);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2922786");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) '#');
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra(20);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int12 = localDate7.get(dateTimeFieldType11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        org.joda.time.Interval interval18 = localDate17.toInterval();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.days();
        java.lang.String str20 = durationFieldType19.getName();
        org.joda.time.LocalDate localDate22 = localDate17.withFieldAdded(durationFieldType19, 32770);
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays((int) '#');
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime27.toDateTime(dateTimeZone34);
        org.joda.time.DateTime.Property property38 = dateTime27.centuryOfEra();
        java.lang.String str39 = dateTime27.toString();
        int int40 = dateTime27.getDayOfYear();
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.withDayOfYear(100);
        org.joda.time.LocalDate.Property property46 = localDate43.dayOfMonth();
        org.joda.time.LocalDate localDate47 = property46.getLocalDate();
        org.joda.time.LocalDate localDate49 = property46.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate50 = property46.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property46.getFieldType();
        org.joda.time.LocalDate localDate52 = property46.getLocalDate();
        org.joda.time.LocalDate localDate53 = property46.roundFloorCopy();
        java.lang.String str54 = localDate53.toString();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(11);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtCurrentTime(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime27.withZoneRetainFields(dateTimeZone56);
        int int59 = property23.getDifference((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime61 = dateTime58.withYearOfEra(122);
        int int62 = dateTime58.getWeekyear();
        org.joda.time.DateTime dateTime63 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean64 = dateTime58.isEqualNow();
        int int65 = dateTime58.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime58.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "days" + "'", str20, "days");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "11" + "'", str24, "11");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-10T11:27:59.999+227:28" + "'", str39, "1970-01-10T11:27:59.999+227:28");
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022-02-20" + "'", str54, "2022-02-20");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 141 + "'", int59 == 141);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1970 + "'", int62 == 1970);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 41279999 + "'", int65 == 41279999);
        org.junit.Assert.assertNotNull(mutableDateTime66);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusYears((int) '4');
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = dateTime10.toString("--02-01", locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime10.getZone();
        java.lang.String str16 = dateTimeZone14.getShortName(5907399684280970126L);
        long long18 = dateTimeZone14.nextTransition((long) 17);
        java.util.TimeZone timeZone19 = dateTimeZone14.toTimeZone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--02-01" + "'", str13, "--02-01");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+227:28" + "'", str16, "+227:28");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 17L + "'", long18 == 17L);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+F7:28");
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.MonthDay monthDay9 = property2.getMonthDay();
        int int10 = property2.getMaximumValueOverall();
        org.joda.time.DurationField durationField11 = property2.getRangeDurationField();
        org.joda.time.MonthDay monthDay13 = property2.addToCopy(50);
        org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        java.lang.String str23 = property22.getAsShortText();
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay26 = monthDay24.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField28 = monthDay26.getField((int) (byte) 0);
        java.util.Locale locale32 = new java.util.Locale("", "", "hi!");
        int int33 = dateTimeField28.getMaximumTextLength(locale32);
        long long36 = dateTimeField28.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay37 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay39 = monthDay37.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.MonthDay monthDay41 = monthDay37.minus(readablePeriod40);
        org.joda.time.MonthDay monthDay42 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay44 = monthDay42.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField46 = monthDay44.getField((int) (byte) 0);
        java.util.Locale locale50 = new java.util.Locale("", "", "hi!");
        int int51 = dateTimeField46.getMaximumTextLength(locale50);
        java.lang.String str52 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) monthDay37, locale50);
        int int53 = property22.getMaximumTextLength(locale50);
        java.lang.String str54 = monthDay15.toString("--02-11", locale50);
        java.util.Set<java.lang.String> strSet55 = locale50.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property61 = dateTime60.hourOfDay();
        org.joda.time.DateTime dateTime63 = dateTime60.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property64 = dateTime60.yearOfCentury();
        java.util.Locale locale67 = new java.util.Locale("fra", "fr");
        java.lang.String str68 = property64.getAsShortText(locale67);
        java.lang.String str69 = locale67.getScript();
        java.lang.String str70 = locale50.getDisplayVariant(locale67);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay71 = property2.setCopy("187200000-02-13", locale50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"187200000-02-13\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "11" + "'", str23, "11");
        org.junit.Assert.assertNotNull(monthDay26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9L + "'", long36 == 9L);
        org.junit.Assert.assertNotNull(monthDay39);
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Feb" + "'", str52, "Feb");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "--02-11" + "'", str54, "--02-11");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals(locale67.toString(), "fra_FR");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "52" + "'", str68, "52");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfMonth(23);
        int int14 = localDate11.getDayOfWeek();
        org.joda.time.LocalDate.Property property15 = localDate11.yearOfEra();
        org.joda.time.LocalDate localDate16 = property15.roundFloorCopy();
        int int17 = property15.getMinimumValueOverall();
        long long18 = property15.remainder();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8553600000L + "'", long18 == 8553600000L);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((-123075459313645000L));
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray17 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList18);
        java.lang.String str21 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strList18);
        boolean boolean22 = calendar1.before((java.lang.Object) strList18);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        calendar24.setLenient(true);
        calendar24.roll((int) (short) 100, 0);
        int int31 = calendar24.getGreatestMinimum(0);
        calendar24.clear();
        calendar24.clear(0);
        calendar24.set(8, 0, (int) 'a', 2021, 3);
        java.util.TimeZone timeZone41 = calendar24.getTimeZone();
        calendar1.setTimeZone(timeZone41);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone41);
        boolean boolean46 = calendar45.isWeekDateSupported();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=498,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr" + "'", str21, "fr");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=8,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=97,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=2021,MINUTE=3,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1644572696498,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=498,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1644572696498,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=498,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay(22, 6, 32, 43199999);
        org.joda.time.MonthDay monthDay9 = new org.joda.time.MonthDay(0L);
        java.lang.String str10 = monthDay9.toString();
        org.joda.time.MonthDay monthDay12 = monthDay9.plusMonths((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        org.joda.time.MonthDay monthDay15 = monthDay9.withFieldAdded(durationFieldType13, (-1));
        org.joda.time.MonthDay monthDay17 = monthDay15.plusDays((int) '4');
        java.lang.String str18 = monthDay15.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.MonthDay monthDay20 = monthDay15.plus(readablePeriod19);
        org.joda.time.MonthDay.Property property21 = monthDay20.dayOfMonth();
        int[] intArray22 = monthDay20.getValues();
        java.util.Calendar.Builder builder23 = builder7.setFields(intArray22);
        java.util.Calendar.Builder builder27 = builder23.setDate((-16812840), 2111, 103);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--01-10" + "'", str10, "--01-10");
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--12-10" + "'", str18, "--12-10");
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[12, 10]");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(349260000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        int int9 = calendar1.getWeekYear();
        calendar1.setMinimalDaysInFirstWeek(8);
        java.lang.Object obj12 = null;
        boolean boolean13 = calendar1.before(obj12);
        calendar1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar1.getMaximum(49323762);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49323762");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=8,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateMidnight dateMidnight6 = dateTime4.toDateMidnight();
        long long7 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property8 = dateTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) '#');
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime11.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime11.plusWeeks(5);
        org.joda.time.Chronology chronology24 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = chronology24.days();
        org.joda.time.DurationField durationField27 = chronology24.weekyears();
        org.joda.time.DateTime dateTime28 = dateTime4.withChronology(chronology24);
        int int29 = dateTime28.getMillisOfDay();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-60526224000001L) + "'", long7 == (-60526224000001L));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 41279999 + "'", int29 == 41279999);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear(100);
        org.joda.time.LocalDate.Property property6 = localDate3.dayOfMonth();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate10 = property6.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property6.getFieldType();
        org.joda.time.LocalDate localDate12 = property6.withMinimumValue();
        int int13 = localDate12.getDayOfMonth();
        org.joda.time.Chronology chronology14 = localDate12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(1636854850140000L, chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        java.lang.String str25 = chronology20.toString();
        boolean boolean26 = dateTime4.equals((java.lang.Object) str25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar28 = dateTime4.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime4.plusSeconds(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter33.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) '#');
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime37.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = dateTime37.plusWeeks(5);
        org.joda.time.Chronology chronology50 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter33.withChronology(chronology50);
        org.joda.time.DateTime dateTime52 = dateTime30.toDateTime(chronology50);
        int int53 = dateTime30.getSecondOfMinute();
        org.joda.time.DateTime.Property property54 = dateTime30.era();
        java.lang.String str55 = property54.getAsText();
        org.joda.time.DateTime dateTime56 = property54.withMinimumValue();
        org.joda.time.DateTime dateTime58 = dateTime56.withCenturyOfEra(100);
        boolean boolean60 = dateTime58.isBefore((-29044792908L));
        org.joda.time.DateTime.Property property61 = dateTime58.weekyear();
        org.joda.time.DateTime dateTime63 = dateTime58.plusMonths(48950);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 687 + "'", int11 == 687);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[+227:28]" + "'", str25, "ISOChronology[+227:28]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+227:28,offset=818880000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=27,SECOND=59,MILLISECOND=999,ZONE_OFFSET=818880000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ap. J.-C." + "'", str55, "ap. J.-C.");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime63);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(2022);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime19 = dateTime14.minusDays((int) 'u');
        int int20 = dateTime14.getYearOfEra();
        org.joda.time.DateTime dateTime22 = dateTime14.plusMillis(4);
        java.util.Date date23 = dateTime14.toDate();
        int int24 = property9.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime25 = property9.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Sun Jan 02 23:59:59 UTC 52");
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 4, dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime7 = property5.withMinimumValue();
        int int8 = property5.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime12 = dateTime7.withCenturyOfEra(0);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        int int22 = localDate20.getValue(0);
        java.lang.String str23 = localDate20.toString();
        org.joda.time.LocalDate localDate25 = localDate20.withWeekyear(1);
        org.joda.time.LocalDate localDate27 = localDate20.withDayOfYear((int) (byte) 1);
        int int28 = localDate20.getYear();
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        long long35 = dateTimeZone30.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.DateTime dateTime36 = localDate20.toDateTimeAtMidnight(dateTimeZone30);
        org.joda.time.DateTime dateTime37 = dateTime7.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime.Property property38 = dateTime7.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusDays((int) '#');
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(dateTimeZone45);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = localDate46.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime41.toDateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime53 = dateTime41.plusWeeks(5);
        org.joda.time.Chronology chronology54 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.weekyear();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(chronology54);
        org.joda.time.DurationField durationField57 = chronology54.months();
        org.joda.time.DateTime dateTime58 = dateTime7.toDateTime(chronology54);
        org.joda.time.DateTimeZone dateTimeZone59 = chronology54.getZone();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-08-20" + "'", str23, "2022-08-20");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-818879996L) + "'", long35 == (-818879996L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("mon feb 12 00:00:00 utc 1900 (2 JAN 52 23:59:59 GMT,Italia)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        boolean boolean11 = dateTimeField9.isSupported();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime18.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.MonthDay monthDay23 = monthDay13.withChronologyRetainFields(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfDay();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology22.add(readablePeriod27, 18L, 23786);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) dateTimeField9, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 18L + "'", long30 == 18L);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateMidnight dateMidnight6 = dateTime4.toDateMidnight();
        int int7 = dateTime4.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime4.minusMillis(240);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = chronology20.weeks();
        org.joda.time.DateTimeField dateTimeField26 = chronology20.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology20.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology20.halfdays();
        org.joda.time.DurationField durationField29 = chronology20.centuries();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType10.getField(chronology20);
        int int31 = dateTime9.get(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay((int) 'x', (int) ' ', 0);
        java.util.Calendar.Builder builder11 = builder3.setTimeOfDay((int) (short) -1, 0, 2730);
        java.util.Calendar.Builder builder15 = builder3.setWeekDate((int) (byte) 1, 187200000, 1);
        java.util.Calendar.Builder builder20 = builder15.setTimeOfDay(36, (int) (short) 10, 311, 14402);
        java.util.Calendar.Builder builder25 = builder15.setTimeOfDay(122, 54, 1439, 323);
        java.util.Calendar.Builder builder27 = builder15.setLenient(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        int int7 = localDate2.getValue((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate2.withYearOfCentury((int) (byte) 0);
        org.joda.time.LocalDate.Property property10 = localDate2.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        boolean boolean45 = dateTimeField4.isSupported();
        boolean boolean46 = dateTimeField4.isSupported();
        org.joda.time.DurationField durationField47 = dateTimeField4.getRangeDurationField();
        org.joda.time.MonthDay monthDay49 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property50 = monthDay49.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        org.joda.time.DurationField durationField52 = property50.getRangeDurationField();
        org.joda.time.MonthDay monthDay54 = property50.addWrapFieldToCopy((int) ' ');
        org.joda.time.MonthDay monthDay56 = monthDay54.minusDays(59);
        org.joda.time.MonthDay monthDay58 = monthDay56.minusMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = monthDay56.getFieldType((int) (short) 0);
        org.joda.time.MonthDay monthDay62 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property63 = monthDay62.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property63.getFieldType();
        org.joda.time.DurationField durationField65 = property63.getRangeDurationField();
        org.joda.time.MonthDay monthDay66 = property63.getMonthDay();
        java.util.Locale locale70 = new java.util.Locale("Nov", "ja", "2 Apr 2104 08:59:23 GMT");
        java.lang.String str71 = property63.getAsShortText(locale70);
        java.lang.String str72 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay56, locale70);
        org.joda.time.Chronology chronology73 = monthDay56.getChronology();
        org.joda.time.MonthDay monthDay75 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay77 = monthDay75.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.MonthDay monthDay79 = monthDay75.minus(readablePeriod78);
        org.joda.time.MonthDay.Property property80 = monthDay75.dayOfMonth();
        java.lang.String str81 = property80.toString();
        java.util.Locale locale82 = null;
        int int83 = property80.getMaximumShortTextLength(locale82);
        org.joda.time.MonthDay monthDay84 = property80.getMonthDay();
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone86);
        org.joda.time.DateTime dateTime89 = dateTime87.minusDays((int) '#');
        int int90 = dateTime87.getWeekyear();
        org.joda.time.DateTime dateTime92 = dateTime87.minusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property93 = dateTime92.minuteOfDay();
        org.joda.time.DateTime dateTime95 = property93.setCopy((int) (short) 100);
        boolean boolean96 = monthDay84.equals((java.lang.Object) dateTime95);
        int int97 = monthDay56.compareTo((org.joda.time.ReadablePartial) monthDay84);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 20]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(monthDay54);
        org.junit.Assert.assertNotNull(monthDay56);
        org.junit.Assert.assertNotNull(monthDay58);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(monthDay66);
        org.junit.Assert.assertEquals(locale70.toString(), "nov_JA_2 Apr 2104 08:59:23 GMT");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Jan" + "'", str71, "Jan");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Aug" + "'", str72, "Aug");
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(monthDay77);
        org.junit.Assert.assertNotNull(monthDay79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Property[dayOfMonth]" + "'", str81, "Property[dayOfMonth]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(monthDay84);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1970 + "'", int90 == 1970);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay9 = monthDay7.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = monthDay9.getField((int) (byte) 0);
        java.util.Locale locale15 = new java.util.Locale("", "", "hi!");
        int int16 = dateTimeField11.getMaximumTextLength(locale15);
        long long19 = dateTimeField11.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.MonthDay monthDay24 = monthDay20.minus(readablePeriod23);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField29 = monthDay27.getField((int) (byte) 0);
        java.util.Locale locale33 = new java.util.Locale("", "", "hi!");
        int int34 = dateTimeField29.getMaximumTextLength(locale33);
        java.lang.String str35 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) monthDay20, locale33);
        int int36 = property5.getMaximumTextLength(locale33);
        org.joda.time.DateTimeField dateTimeField37 = property5.getField();
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale38);
        int int40 = property5.getMaximumTextLength(locale38);
        int int41 = property5.getLeapAmount();
        int int42 = property5.get();
        org.joda.time.DateTime dateTime43 = property5.getDateTime();
        java.util.Locale locale48 = new java.util.Locale("11 f\351vr. 2022 09:35:17", "und", "2022");
        java.util.Locale locale49 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale53 = new java.util.Locale("", "", "hi!");
        java.lang.String str54 = locale49.getDisplayLanguage(locale53);
        java.lang.String str55 = locale48.getDisplayLanguage(locale49);
        java.lang.String str56 = locale48.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime57 = property5.setCopy("Sat", locale48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Sat\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11" + "'", str6, "11");
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feb" + "'", str35, "Feb");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644572696830,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=830,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertEquals(locale48.toString(), "11 f\351vr. 2022 09:35:17_UND_2022");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "French" + "'", str54, "French");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "11 f\351vr. 2022 09:35:17" + "'", str55, "11 f\351vr. 2022 09:35:17");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2022" + "'", str56, "2022");
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(684);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        java.util.TimeZone timeZone23 = calendar1.getTimeZone();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone23);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone23);
        calendar25.setLenient(true);
        java.util.Date date33 = new java.util.Date((int) (short) 100, 100, 11, 0, (int) (byte) 10);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.withDayOfYear(100);
        org.joda.time.LocalDate.Property property39 = localDate36.dayOfMonth();
        org.joda.time.LocalDate localDate40 = property39.getLocalDate();
        org.joda.time.LocalDate localDate42 = property39.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localDate42.getFields();
        org.joda.time.LocalDate localDate45 = localDate42.minusYears(2730);
        int int46 = localDate42.getMonthOfYear();
        java.util.Date date47 = localDate42.toDate();
        int int48 = date47.getHours();
        java.lang.String str49 = date47.toLocaleString();
        boolean boolean50 = date33.after(date47);
        calendar25.setTime(date47);
        int int52 = calendar25.getFirstDayOfWeek();
        calendar25.setFirstDayOfWeek(1970);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1660953600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=232,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 20 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1644572696862,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=56,MILLISECOND=862,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645315200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1970,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=51,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date33.toString(), "Sun May 11 00:10:00 UTC 2008");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeFieldArray43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Sun Feb 20 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "20 f\351vr. 2022 00:00:00" + "'", str49, "20 f\351vr. 2022 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = property13.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) '#');
        int int20 = dateTime17.getWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime17.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime17.plus(readablePeriod23);
        int int25 = property13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.minus(readableDuration26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes(4);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, (int) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime27.withYearOfCentury(29);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property40 = dateTime39.hourOfDay();
        org.joda.time.DateTime dateTime42 = property40.addToCopy(97L);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withYearOfEra((int) '4');
        int int48 = property40.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime50 = property40.addToCopy((long) '#');
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.minusDays((int) '#');
        int int56 = dateTime53.getWeekyear();
        org.joda.time.DateMidnight dateMidnight57 = dateTime53.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property59 = dateTime53.property(dateTimeFieldType58);
        org.joda.time.DateTime.Property property60 = dateTime53.centuryOfEra();
        org.joda.time.DateTime dateTime62 = property60.addToCopy(6);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMonths(364);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime66 = dateTime64.minus(readablePeriod65);
        int int67 = dateTime64.getDayOfMonth();
        boolean boolean68 = dateTime50.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology69 = dateTime50.getChronology();
        org.joda.time.DateTime dateTime71 = dateTime50.minus((long) 2007);
        boolean boolean72 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.DateTime dateTime74 = dateTime71.minus(readablePeriod73);
        org.joda.time.DateTime dateTime76 = dateTime74.withYear(32);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19" + "'", str14, "19");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1970 + "'", int56 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDate8.getFieldType((int) (short) 1);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear(100);
        org.joda.time.LocalDate.Property property16 = localDate13.dayOfMonth();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.LocalDate localDate19 = property16.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate20 = property16.withMaximumValue();
        org.joda.time.LocalDate localDate21 = property16.roundHalfEvenCopy();
        boolean boolean22 = localDate8.isAfter((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateMidnight dateMidnight23 = localDate8.toDateMidnight();
        int int24 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (byte) 0);
        int int29 = localDate25.getYearOfEra();
        int int30 = localDate25.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate25.plus(readablePeriod31);
        boolean boolean33 = localDate8.isBefore((org.joda.time.ReadablePartial) localDate32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateMidnight23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("15601802-12-15T10:39:35.195+52:00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=15601802-12-15t10:39:35.195+52:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.Date date7 = dateTime6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime10.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = dateTime10.minusMinutes(52);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        long long28 = dateTimeZone24.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime29 = dateTime10.withZone(dateTimeZone24);
        int int30 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime32 = dateTime10.withMillisOfSecond(12);
        java.util.Date date33 = dateTime10.toDate();
        long long34 = date33.getTime();
        java.lang.String str35 = date33.toGMTString();
        int int36 = date33.getSeconds();
        java.lang.String str37 = date33.toGMTString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Feb 10 12:32:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-818879990L) + "'", long28 == (-818879990L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str35, "31 Dec 1969 23:59:59 GMT");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 59 + "'", int36 == 59);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str37, "31 Dec 1969 23:59:59 GMT");
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.minusMinutes(52);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        long long20 = dateTimeZone16.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime21 = dateTime2.withZone(dateTimeZone16);
        long long24 = dateTimeZone16.adjustOffset((long) 364, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone16);
        long long29 = dateTimeZone16.convertLocalToUTC((-16500195L), true);
        int int31 = dateTimeZone16.getOffset(1659312000000L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-818879990L) + "'", long20 == (-818879990L));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 364L + "'", long24 == 364L);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-835380195L) + "'", long29 == (-835380195L));
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 818880000 + "'", int31 == 818880000);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(3);
        org.joda.time.LocalDate localDate10 = localDate6.minusMonths(1973);
        int int11 = localDate6.getDayOfMonth();
        org.joda.time.LocalDate localDate13 = localDate6.minusDays(820);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        int int9 = property2.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(2022);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        java.lang.String str18 = durationFieldType17.getName();
        org.joda.time.DateTime dateTime20 = dateTime16.withFieldAdded(durationFieldType17, 1);
        org.joda.time.DateTime dateTime22 = dateTime20.minusSeconds(11);
        int int23 = property2.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property24 = dateTime22.era();
        long long25 = dateTime22.getMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "days" + "'", str18, "days");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 86391021L + "'", long25 == 86391021L);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.MonthDay monthDay34 = monthDay13.minusDays(59);
        java.util.Date date40 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long41 = date40.getTime();
        long long42 = date40.getTime();
        boolean boolean43 = monthDay13.equals((java.lang.Object) date40);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.MonthDay monthDay45 = monthDay13.plus(readablePeriod44);
        org.joda.time.MonthDay monthDay47 = monthDay13.minusDays((int) 'u');
        org.joda.time.MonthDay monthDay49 = monthDay47.minusMonths(487);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType51 = monthDay49.getFieldType(40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 20]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 83968099800000L + "'", long41 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 83968099800000L + "'", long42 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(monthDay45);
        org.junit.Assert.assertNotNull(monthDay47);
        org.junit.Assert.assertNotNull(monthDay49);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        int int4 = date3.getHours();
        int int5 = date3.getMinutes();
        java.util.Date date9 = new java.util.Date(0, 0, (int) '4');
        date9.setDate(12);
        date9.setTime(1L);
        boolean boolean14 = date3.after(date9);
        date3.setTime(43199999L);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date3);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury((int) '#');
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.joda.time.LocalDate localDate25 = localDate22.withYearOfEra(20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, 100);
        java.util.Date date29 = localDate25.toDate();
        boolean boolean30 = date3.before(date29);
        date29.setDate(570);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 11:59:59 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Aug 23 00:00:00 UTC 21");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        java.util.Locale locale3 = new java.util.Locale("168", "\u7fa9\u5927\u5229", "eras");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u7fa9\u5927\u5229_eras");
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(97L);
        java.lang.String str8 = property5.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfCentury(1);
        int int18 = property5.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime20 = dateTime13.withWeekyear((int) 'u');
        boolean boolean21 = dateTime13.isEqualNow();
        org.joda.time.DateTime dateTime23 = dateTime13.plusWeeks(14432);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[hourOfDay]" + "'", str8, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        calendar1.setFirstDayOfWeek((int) (byte) 1);
        int int7 = calendar1.getWeekYear();
        int int8 = calendar1.getFirstDayOfWeek();
        java.util.Date date12 = new java.util.Date(0, 0, (int) '4');
        date12.setDate(12);
        date12.setTime((long) (short) 100);
        date12.setDate(1439);
        java.time.Instant instant19 = date12.toInstant();
        long long20 = date12.getTime();
        java.time.Instant instant21 = date12.toInstant();
        calendar1.setTime(date12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=124243200100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=4,ERA=1,YEAR=1973,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=343,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Dec 09 00:00:00 UTC 1973");
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 124243200100L + "'", long20 == 124243200100L);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.minuteOfHour();
        boolean boolean16 = dateTimeField14.isLeap(292278994L);
        long long19 = dateTimeField14.add(5907399684280970662L, 36);
        long long22 = dateTimeField14.addWrapField(59999L, 49);
        int int24 = dateTimeField14.getMaximumValue((long) 115200000);
        int int25 = dateTimeField14.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+227:28]" + "'", str13, "ISOChronology[+227:28]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5907399684283130662L + "'", long19 == 5907399684283130662L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-600001L) + "'", long22 == (-600001L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        org.joda.time.LocalDate.Property property11 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = property11.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate15 = property11.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property11.getFieldType();
        org.joda.time.LocalDate.Property property17 = localDate2.property(dateTimeFieldType16);
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.LocalDate localDate20 = property17.setCopy("13");
        org.joda.time.LocalDate localDate22 = localDate20.minusYears(327);
        int int23 = localDate22.size();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay((int) 'x', (int) ' ', 0);
        java.util.Calendar.Builder builder10 = builder7.set(12, 2022);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(39659999, 365, (int) (short) 1);
        java.util.Calendar calendar15 = builder14.build();
        java.util.Calendar.Builder builder20 = builder14.setTimeOfDay(758, 2035, 48, 49088531);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1251486739042920000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=39660006,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=7,DAY_OF_YEAR=7,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=42,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtStartOfDay();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfYear(100);
        org.joda.time.LocalDate.Property property26 = localDate23.dayOfMonth();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTime dateTime29 = localDate23.toDateTime(localTime28);
        boolean boolean30 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays((int) '#');
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(dateTimeZone37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime33.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime33.plusWeeks(5);
        org.joda.time.Chronology chronology46 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.weekyear();
        org.joda.time.DateTime dateTime48 = dateTime20.toDateTime(chronology46);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime51 = dateTime20.withPeriodAdded(readablePeriod49, 0);
        org.joda.time.DateTime dateTime53 = dateTime20.plusHours(32769);
        org.joda.time.DateTime dateTime54 = dateTime20.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime59 = dateTime54.withTime(11, 32770, (-292275055), 719571);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.MonthDay monthDay4 = monthDay0.minus(readablePeriod3);
        java.lang.String str5 = monthDay0.toString();
        org.joda.time.MonthDay.Property property6 = monthDay0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int int43 = property12.getMaximumTextLength(locale40);
        org.joda.time.DateTimeField dateTimeField44 = property12.getField();
        java.util.Locale locale45 = java.util.Locale.FRENCH;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        int int47 = property12.getMaximumTextLength(locale45);
        boolean boolean48 = locale45.hasExtensions();
        java.lang.String str49 = locale45.getDisplayCountry();
        boolean boolean50 = locale45.hasExtensions();
        int int51 = property6.getMaximumShortTextLength(locale45);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property6.getFieldType();
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("fr");
        int int55 = property6.getMaximumShortTextLength(locale54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property61 = dateTime60.hourOfDay();
        org.joda.time.DateTime dateTime63 = dateTime60.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime65 = dateTime60.withYearOfEra((int) ' ');
        int int66 = dateTime60.getYearOfCentury();
        org.joda.time.DateTime dateTime68 = dateTime60.withWeekOfWeekyear(9);
        int int69 = dateTime60.getMinuteOfDay();
        org.joda.time.DateTime dateTime71 = dateTime60.minusMonths(70);
        org.joda.time.MonthDay monthDay72 = new org.joda.time.MonthDay((java.lang.Object) dateTime60);
        org.joda.time.MonthDay monthDay74 = monthDay72.minusDays(44);
        int int75 = property6.compareTo((org.joda.time.ReadablePartial) monthDay74);
        org.joda.time.MonthDay.Property property76 = monthDay74.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay78 = property76.setCopy(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(monthDay4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--02-20" + "'", str5, "--02-20");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11" + "'", str13, "11");
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1644572697197,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=57,MILLISECOND=197,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
        org.junit.Assert.assertNotNull(dateTime68);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 687 + "'", int69 == 687);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(monthDay74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(property76);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology18 = chronology14.withZone(dateTimeZone17);
        java.lang.String str19 = chronology14.toString();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField23 = chronology14.centuries();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(323, 2175, 314, (-1630), (int) (short) 0, 86399998, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1630 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[+227:28]" + "'", str19, "ISOChronology[+227:28]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfCentury(1);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) 0);
        org.joda.time.LocalDate.Property property13 = localDate9.year();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 4, dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate9.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj20, dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime18.toMutableDateTime(dateTimeZone23);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) dateTime4, dateTimeZone23);
        int int32 = localDate31.getWeekyear();
        org.joda.time.LocalDate localDate34 = localDate31.plusMonths(14402);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-187199987L) + "'", long27 == (-187199987L));
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property9 = monthDay8.monthOfYear();
        org.joda.time.MonthDay monthDay11 = property9.addToCopy((int) ' ');
        int int12 = property9.get();
        java.lang.String str13 = property9.toString();
        java.util.Locale locale14 = java.util.Locale.PRC;
        int int15 = property9.getMaximumShortTextLength(locale14);
        org.joda.time.MonthDay monthDay17 = property9.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property9.getFieldType();
        boolean boolean19 = dateTime6.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime24.hourOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.hours();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        org.joda.time.DurationField durationField31 = chronology28.years();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType18.getField(chronology28);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = chronology28.getDateTimeMillis(160, 257, 96684, 387, 805, 51860, 14591999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 387 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[monthOfYear]" + "'", str13, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.Date date7 = dateTime6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime10.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = dateTime10.minusMinutes(52);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        long long28 = dateTimeZone24.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime29 = dateTime10.withZone(dateTimeZone24);
        int int30 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime10);
        java.util.Date date31 = dateTime6.toDate();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime36.hourOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime41 = dateTime36.minusDays((int) 'u');
        int int42 = dateTime36.getYearOfEra();
        org.joda.time.DateTime dateTime44 = dateTime36.plusMillis(4);
        java.util.Date date45 = dateTime36.toDate();
        java.lang.String str46 = date45.toGMTString();
        int int47 = date45.getMinutes();
        boolean boolean48 = date31.before(date45);
        date31.setDate(10799999);
        date31.setHours(366);
        int int53 = date31.getDate();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Feb 10 20:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-187199990L) + "'", long28 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jul 09 06:00:00 UTC 31591");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Jan 02 23:59:59 UTC 52");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2 Jan 52 23:59:59 GMT" + "'", str46, "2 Jan 52 23:59:59 GMT");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 59 + "'", int47 == 59);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray11 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray25 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray39 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap44);
        java.util.Collection<java.util.Locale> localeCollection46 = null;
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray57 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray71 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList72);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList74);
        java.util.Set<java.lang.String> strSet76 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDate localDate80 = localDate77.withPeriodAdded(readablePeriod78, (int) (byte) 0);
        org.joda.time.LocalDate.Property property81 = localDate77.year();
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        boolean boolean83 = localDate77.equals((java.lang.Object) filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strSet76, filteringMode82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList45, localeCollection46, filteringMode82);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList86, filteringMode87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 92);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withDayOfYear(100);
        int int19 = localDate16.size();
        org.joda.time.LocalDate localDate21 = localDate16.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays((int) '#');
        int int27 = dateTime24.getWeekyear();
        org.joda.time.DateMidnight dateMidnight28 = dateTime24.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property30 = dateTime24.property(dateTimeFieldType29);
        org.joda.time.LocalDate.Property property31 = localDate21.property(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readablePeriod35);
        int int37 = property31.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalDate localDate38 = property31.withMaximumValue();
        org.joda.time.LocalDate localDate40 = property31.addWrapFieldToCopy(59);
        java.lang.String str41 = localDate40.toString();
        org.joda.time.LocalDate.Property property42 = localDate40.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = dateTimeFormatter13.print((org.joda.time.ReadablePartial) localDate40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-2022-08-13" + "'", str41, "-2022-08-13");
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 4, dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readablePeriod5);
        int int7 = dateTime4.getDayOfMonth();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale8);
        org.joda.time.MonthDay monthDay10 = org.joda.time.MonthDay.fromCalendarFields(calendar9);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        calendar12.setLenient(true);
        calendar12.roll((int) (short) 100, 0);
        int int19 = calendar12.getGreatestMinimum(0);
        calendar12.clear();
        org.joda.time.MonthDay monthDay21 = org.joda.time.MonthDay.fromCalendarFields(calendar12);
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale23.getLanguage();
        java.lang.String str25 = locale22.getDisplayScript(locale23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale23);
        calendar26.clear();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(locale28);
        calendar29.setLenient(true);
        calendar29.set((-1), 0, 32770, (int) 'u', (int) (byte) -1, 1439);
        calendar29.set(48949, 17, (int) (short) 10);
        boolean boolean43 = calendar29.isWeekDateSupported();
        java.util.Date date44 = calendar29.getTime();
        java.util.TimeZone timeZone45 = calendar29.getTimeZone();
        calendar26.setTimeZone(timeZone45);
        calendar12.setTimeZone(timeZone45);
        calendar9.setTimeZone(timeZone45);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=4,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=4,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(monthDay21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "it" + "'", str24, "it");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1482559881779378,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=48950,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=165,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=22,SECOND=59,MILLISECOND=378,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sun Jun 14 21:22:59 UTC 48950");
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Temps universel coordonn\351");
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate17 = localDate14.plusDays((int) 'a');
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate17.toString("4-mag-14403 0.00.00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTime dateTime9 = localDate2.toDateTime(localTime8);
        org.joda.time.LocalDate.Property property10 = localDate2.dayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate2.withYearOfEra(2730);
        org.joda.time.LocalDate.Property property13 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate15 = localDate2.plusMonths(32770);
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate18 = localDate15.minusMonths(570);
        org.joda.time.Chronology chronology19 = localDate15.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = dateTimeField17.getType();
        org.joda.time.DurationField durationField19 = dateTimeField17.getLeapDurationField();
        org.joda.time.DurationField durationField20 = dateTimeField17.getRangeDurationField();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        long long28 = dateTimeZone23.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate32 = localDate29.withPeriodAdded(readablePeriod30, (int) (short) -1);
        int int33 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDate29);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-187199996L) + "'", long28 == (-187199996L));
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime14);
        int int16 = dateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) '#');
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime19.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = dateTime19.plusWeeks(5);
        org.joda.time.Chronology chronology32 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime19.minus(readablePeriod33);
        int int35 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime37 = dateTime15.minusWeeks(8);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property45 = dateTime44.hourOfDay();
        org.joda.time.DateTime dateTime47 = dateTime44.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property48 = dateTime44.yearOfCentury();
        org.joda.time.DateTime.Property property49 = dateTime44.weekyear();
        boolean boolean50 = dateTime39.isEqual((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime51 = dateTime44.toDateTimeISO();
        boolean boolean52 = dateTime51.isBeforeNow();
        org.joda.time.DateTime dateTime53 = dateTime51.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(17);
        org.joda.time.LocalDate.Property property3 = localDate2.dayOfWeek();
        org.joda.time.Chronology chronology4 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(chronology4);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate.Property property11 = localDate7.dayOfMonth();
        int int12 = localDate7.getDayOfMonth();
        int int13 = localDate7.size();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) '#');
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime16.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = dateTime26.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property35 = dateTime34.hourOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology42 = chronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = chronology38.weekyearOfCentury();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(83968099800000L, chronology38);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime48 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = localDate44.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime51 = dateTime49.minusYears((int) (short) 10);
        int int52 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean54 = dateTime28.isSupported(dateTimeFieldType53);
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType53.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int56 = localDate7.get(dateTimeFieldType53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(durationFieldType55);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.MonthDay monthDay10 = property2.addToCopy(20);
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        org.joda.time.MonthDay monthDay12 = property2.getMonthDay();
        java.lang.String str13 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        org.joda.time.LocalDate.Property property11 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = property11.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate15 = property11.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property11.getFieldType();
        org.joda.time.LocalDate.Property property17 = localDate2.property(dateTimeFieldType16);
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.LocalDate localDate20 = property17.setCopy("13");
        org.joda.time.Interval interval21 = property17.toInterval();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(interval21);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths(52);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        int int15 = localDate11.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property16 = localDate14.year();
        org.joda.time.LocalDate localDate17 = property16.withMinimumValue();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfYear(100);
        int int23 = localDate20.size();
        org.joda.time.LocalDate localDate25 = localDate20.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusDays((int) '#');
        int int31 = dateTime28.getWeekyear();
        org.joda.time.DateMidnight dateMidnight32 = dateTime28.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property34 = dateTime28.property(dateTimeFieldType33);
        org.joda.time.LocalDate.Property property35 = localDate25.property(dateTimeFieldType33);
        java.lang.String str36 = localDate25.toString();
        org.joda.time.LocalDate localDate38 = localDate25.minusYears(4);
        org.joda.time.LocalDate.Property property39 = localDate38.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        int int45 = dateTime42.getWeekyear();
        org.joda.time.DateTime dateTime47 = dateTime42.minusMillis((int) (short) 0);
        int int48 = dateTime47.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusDays((int) '#');
        int int54 = dateTime51.getWeekyear();
        org.joda.time.DateTime dateTime56 = dateTime51.minusMillis((int) (short) 0);
        boolean boolean57 = dateTime47.isAfter((org.joda.time.ReadableInstant) dateTime56);
        long long58 = property39.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime47);
        int int59 = property39.getMinimumValue();
        org.joda.time.LocalDate localDate60 = property39.withMinimumValue();
        int int61 = property39.getMinimumValueOverall();
        org.joda.time.LocalDate localDate62 = property39.roundHalfEvenCopy();
        boolean boolean63 = localDate17.isAfter((org.joda.time.ReadablePartial) localDate62);
        java.lang.Object obj64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(obj64, dateTimeZone65);
        org.joda.time.LocalDate.Property property67 = localDate66.year();
        java.lang.String str68 = localDate66.toString();
        org.joda.time.Chronology chronology69 = localDate66.getChronology();
        int int70 = localDate66.getDayOfWeek();
        int int71 = localDate17.compareTo((org.joda.time.ReadablePartial) localDate66);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022-08-13" + "'", str36, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 17756L + "'", long58 == 17756L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "2022-02-13" + "'", str68, "2022-02-13");
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.MonthDay monthDay9 = property2.getMonthDay();
        int int10 = property2.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay12 = property2.setCopy("2022-02-13T13:39:06.412+52:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-13T13:39:06.412+52:00\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(2022);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime10.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = dateTime10.plusWeeks(5);
        org.joda.time.Chronology chronology23 = dateTime10.getChronology();
        org.joda.time.Chronology chronology24 = dateTime10.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime7.withChronology(chronology24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property31 = dateTime30.hourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime30.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology38 = chronology34.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = chronology34.weeks();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology34.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = chronology34.weekyearOfCentury();
        org.joda.time.DateTime dateTime43 = dateTime25.toDateTime(chronology34);
        org.joda.time.DateTime dateTime45 = dateTime25.withHourOfDay(12);
        org.joda.time.DateTime dateTime47 = dateTime25.minusMinutes(9);
        boolean boolean49 = dateTime47.isEqual(65257735695000L);
        int int50 = dateTime47.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 51 + "'", int50 == 51);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale1.getDisplayScript(locale2);
        java.lang.String str5 = locale0.getDisplayCountry(locale1);
        java.lang.String str6 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cina" + "'", str5, "Cina");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) 239);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.MonthDay monthDay3 = monthDay1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) '#');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime6.toYearMonthDay();
        org.joda.time.DateTime dateTime13 = dateTime6.withDurationAdded((long) '4', (int) (short) 10);
        org.joda.time.DateTime dateTime15 = dateTime6.plus(7092L);
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.YearMonthDay yearMonthDay17 = dateTime15.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = monthDay3.isBefore((org.joda.time.ReadablePartial) yearMonthDay17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(yearMonthDay17);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        java.lang.String str12 = monthDay11.toString();
        org.joda.time.Chronology chronology13 = monthDay11.getChronology();
        org.joda.time.Chronology chronology14 = monthDay11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter9.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withOffsetParsed();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale18.toLanguageTag();
        java.lang.String str20 = locale18.getDisplayCountry();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.lang.String str23 = locale18.getDisplayScript(locale22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter17.withLocale(locale22);
        boolean boolean25 = dateTimeFormatter17.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter17.withDefaultYear(0);
        java.lang.Appendable appendable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(appendable28, 1644523200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--01-03" + "'", str12, "--01-03");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "de-DE" + "'", str19, "de-DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Allemagne" + "'", str20, "Allemagne");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay5 = monthDay1.withMonthOfYear(2);
        int int7 = monthDay1.getValue(0);
        org.joda.time.MonthDay monthDay9 = monthDay1.minusMonths(14399967);
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(monthDay9);
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime14);
        org.joda.time.DateTime.Property property16 = dateTime14.minuteOfDay();
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.centuries();
        java.lang.String str19 = durationFieldType18.toString();
        java.lang.String str20 = durationFieldType18.getName();
        org.joda.time.DateTime dateTime22 = dateTime14.withFieldAdded(durationFieldType18, (int) (byte) 100);
        org.joda.time.Instant instant23 = dateTime14.toInstant();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "centuries" + "'", str19, "centuries");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "centuries" + "'", str20, "centuries");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder4.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("aprile", "80400000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: aprile [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("38305527");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=38305527");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime4.toMutableDateTimeISO();
        java.lang.String str14 = dateTime4.toString("1");
        java.util.GregorianCalendar gregorianCalendar15 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTime dateTime17 = dateTime4.minusYears(49169);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        java.util.Date date3 = new java.util.Date(0, (-16812840), 21);
        date3.setTime(3659999L);
        java.util.Date date11 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long12 = date11.getTime();
        date11.setMinutes((-292275054));
        int int15 = date11.getYear();
        boolean boolean16 = date3.before(date11);
        date3.setSeconds(2140);
        int int19 = date3.getYear();
        java.util.Date date26 = new java.util.Date(14399, 349260000, 19, 2022, 815, 48949);
        org.joda.time.MonthDay monthDay27 = org.joda.time.MonthDay.fromDateFields(date26);
        boolean boolean28 = date3.after(date26);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:35:40 UTC 1970");
        org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 18 05:06:00 UTC 4075");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 83968099800000L + "'", long12 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2175 + "'", int15 == 2175);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Apr 14 09:10:49 UTC 29121299");
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) '#');
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readablePeriod20);
        boolean boolean22 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) dateTime11);
        int int24 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology25 = dateTime11.getChronology();
        java.lang.String str27 = dateTime11.toString("2022-02-13");
        org.joda.time.DateTime dateTime29 = dateTime11.plus((long) 14402021);
        org.joda.time.DateTime.Property property30 = dateTime29.centuryOfEra();
        java.util.GregorianCalendar gregorianCalendar31 = dateTime29.toGregorianCalendar();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder34.setExtension('u', "en-US");
        java.util.Locale.Builder builder39 = builder34.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder40 = builder34.clear();
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault(category41);
        java.util.Locale.setDefault(locale42);
        java.util.Locale locale44 = locale42.stripExtensions();
        java.util.Locale.Builder builder45 = builder34.setLocale(locale44);
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleAttributes();
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.lang.String str48 = locale47.getDisplayVariant();
        java.lang.String str49 = locale44.getDisplayCountry(locale47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap50 = gregorianCalendar31.getDisplayNames(365, 54, locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-02-13" + "'", str27, "2022-02-13");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(gregorianCalendar31);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category41.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter2.withPivotYear(73);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter2.withPivotYear(17);
        boolean boolean55 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime57 = dateTimeFormatter2.parseDateTime("2 Apr 2104 08:59:36 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572697764,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=57,MILLISECOND=764,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.DateTime dateTime9 = dateTime4.withDurationAdded(1L, 52);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime dateTime12 = dateTime9.minusMinutes(52);
        boolean boolean13 = dateTime9.isEqualNow();
        int int14 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime dateTime16 = dateTime9.minusMonths(86399999);
        org.joda.time.DateTime.Property property17 = dateTime16.centuryOfEra();
        java.util.Locale locale19 = new java.util.Locale("7");
        java.lang.String str20 = property17.getAsShortText(locale19);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0052-01-03T04:00:00.051+52:00" + "'", str10, "0052-01-03T04:00:00.051+52:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 240 + "'", int14 == 240);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals(locale19.toString(), "7");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "71999" + "'", str20, "71999");
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear(52);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = dateTime19.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime19.toMutableDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter12.withChronology(chronology30);
        boolean boolean36 = dateTimeFormatter35.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = dateTimeFormatter35.parseLocalDateTime("--07-11");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        int[] intArray33 = monthDay13.getValues();
        int[] intArray34 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.MonthDay monthDay37 = monthDay13.withPeriodAdded(readablePeriod35, (int) (byte) 100);
        org.joda.time.MonthDay.Property property38 = monthDay37.monthOfYear();
        int int39 = property38.get();
        java.lang.String str40 = property38.getAsString();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property46 = dateTime45.hourOfDay();
        org.joda.time.DateTime dateTime48 = dateTime45.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime50 = dateTime45.withYearOfEra((int) ' ');
        int int51 = dateTime45.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime54 = dateTime45.withDurationAdded(readableDuration52, (int) (byte) -1);
        org.joda.time.DateTime.Property property55 = dateTime54.hourOfDay();
        org.joda.time.DateTime dateTime57 = dateTime54.withYearOfCentury(9);
        org.joda.time.DateTime.Property property58 = dateTime57.monthOfYear();
        org.joda.time.MonthDay monthDay59 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay61 = monthDay59.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField63 = monthDay61.getField((int) (byte) 0);
        int int64 = dateTimeField63.getMinimumValue();
        int int65 = dateTimeField63.getMinimumValue();
        org.joda.time.DurationField durationField66 = dateTimeField63.getRangeDurationField();
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.lang.String str68 = locale67.getLanguage();
        java.lang.String str69 = locale67.getDisplayLanguage();
        int int70 = dateTimeField63.getMaximumTextLength(locale67);
        int int71 = property58.getMaximumTextLength(locale67);
        java.lang.String str72 = locale67.getCountry();
        java.lang.String str74 = locale67.getExtension('x');
        int int75 = property38.getMaximumShortTextLength(locale67);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(locale67);
        java.util.Locale locale77 = java.util.Locale.FRENCH;
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(locale77);
        calendar78.roll(9, false);
        calendar78.setFirstDayOfWeek((int) (byte) 1);
        int int84 = calendar78.getWeekYear();
        int int85 = calendar78.getFirstDayOfWeek();
        int int86 = calendar78.getWeeksInWeekYear();
        java.util.Locale locale87 = java.util.Locale.FRENCH;
        java.util.Calendar calendar88 = java.util.Calendar.getInstance(locale87);
        calendar88.roll(9, false);
        calendar88.setFirstDayOfWeek((int) (byte) 1);
        int int94 = calendar88.getWeekYear();
        int int95 = calendar88.getFirstDayOfWeek();
        int int96 = calendar88.getWeeksInWeekYear();
        java.util.TimeZone timeZone97 = calendar88.getTimeZone();
        calendar78.setTimeZone(timeZone97);
        calendar76.setTimeZone(timeZone97);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2, 13]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2" + "'", str40, "2");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(monthDay61);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "it" + "'", str68, "it");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "italien" + "'", str69, "italien");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 9 + "'", int70 == 9);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertNotNull(calendar76);
// flaky:         org.junit.Assert.assertEquals(calendar76.toString(), "java.util.GregorianCalendar[time=1644572697818,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=57,MILLISECOND=818,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar78);
// flaky:         org.junit.Assert.assertEquals(calendar78.toString(), "java.util.GregorianCalendar[time=1644615897818,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=44,SECOND=57,MILLISECOND=818,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2022 + "'", int84 == 2022);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 52 + "'", int86 == 52);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar88);
// flaky:         org.junit.Assert.assertEquals(calendar88.toString(), "java.util.GregorianCalendar[time=1644615897818,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=44,SECOND=57,MILLISECOND=818,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 2022 + "'", int94 == 2022);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 52 + "'", int96 == 52);
        org.junit.Assert.assertNotNull(timeZone97);
        org.junit.Assert.assertEquals(timeZone97.getDisplayName(), "Temps universel coordonn\351");
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (-18988));
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        java.util.Locale locale2 = new java.util.Locale("Regno Unito", "fra (France)");
        org.junit.Assert.assertEquals(locale2.toString(), "regno unito_FRA (FRANCE)");
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withYearOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int11 = dateTime4.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime4.minusMonths((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readablePeriod14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMonths((-1970));
        org.joda.time.DateTime.Property property18 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime20 = property18.addToCopy(3591418446L);
        java.lang.String str21 = property18.getName();
        org.joda.time.DurationField durationField22 = property18.getRangeDurationField();
        int int23 = property18.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfDay" + "'", str21, "millisOfDay");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime12 = dateTime7.withCenturyOfEra(0);
        org.joda.time.DateTime dateTime13 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime15 = dateTime7.withWeekOfWeekyear(35);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readablePeriod19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        long long26 = dateTimeZone22.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime27 = dateTime18.withZoneRetainFields(dateTimeZone22);
        long long28 = dateTime27.getMillis();
        boolean boolean29 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime31 = dateTime7.minusDays(25);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime36.hourOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology44 = chronology40.withZone(dateTimeZone43);
        java.lang.String str45 = chronology40.toString();
        org.joda.time.DurationField durationField46 = chronology40.seconds();
        org.joda.time.DateTimeField dateTimeField47 = chronology40.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = chronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology40.dayOfYear();
        org.joda.time.DateTime dateTime50 = dateTime31.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField51 = chronology40.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-187199990L) + "'", long26 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ISOChronology[+52:00]" + "'", str45, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyearOfCentury();
        long long17 = chronology8.add((long) 229, 5907399684280970551L, (int) (byte) -1);
        org.joda.time.DurationField durationField18 = chronology8.halfdays();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-5907399684280970322L) + "'", long17 == (-5907399684280970322L));
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(157852800004L, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks(0);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfYear(100);
        int int10 = localDate7.size();
        org.joda.time.LocalDate localDate12 = localDate7.plusMonths(6);
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate7.toDateTime(localTime13);
        org.joda.time.LocalDate.Property property15 = localDate7.weekyear();
        org.joda.time.LocalDate localDate16 = property15.roundCeilingCopy();
        java.lang.String str17 = localDate16.toString();
        int int18 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate.Property property19 = localDate4.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2023-01-02" + "'", str17, "2023-01-02");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        int int7 = localDate2.getValue((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate2.withWeekyear(10);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(24);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        org.joda.time.LocalDate.Property property18 = localDate15.dayOfMonth();
        org.joda.time.LocalDate localDate20 = localDate15.withDayOfMonth(21);
        org.joda.time.LocalDate localDate22 = localDate15.withYearOfEra(187200000);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfEra(52);
        org.joda.time.LocalDate.Property property26 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate.Property property27 = localDate25.centuryOfEra();
        org.joda.time.LocalDate localDate28 = localDate22.withFields((org.joda.time.ReadablePartial) localDate25);
        java.lang.String str29 = localDate22.toString();
        org.joda.time.LocalDate localDate31 = localDate22.withCenturyOfEra(2111);
        int int32 = localDate11.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfEra(52);
        org.joda.time.LocalDate.Property property36 = localDate35.weekOfWeekyear();
        org.joda.time.LocalDate.Property property37 = localDate35.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property43 = dateTime42.hourOfDay();
        org.joda.time.DateTime dateTime45 = dateTime42.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime47 = dateTime42.withYearOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int49 = dateTime42.get(dateTimeFieldType48);
        org.joda.time.LocalDate.Property property50 = localDate35.property(dateTimeFieldType48);
        boolean boolean51 = localDate11.isSupported(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "187200000-02-13" + "'", str29, "187200000-02-13");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateMidnight dateMidnight6 = dateTime4.toDateMidnight();
        long long7 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime9 = dateTime4.minusMonths(1439);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime9.plusWeeks(14);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMillis(311);
        int int16 = dateTime15.getYearOfEra();
        int int17 = dateTime15.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-60526224000001L) + "'", long7 == (-60526224000001L));
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14400310 + "'", int17 == 14400310);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(2022);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime10.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = dateTime10.plusWeeks(5);
        org.joda.time.Chronology chronology23 = dateTime10.getChronology();
        org.joda.time.Chronology chronology24 = dateTime10.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime7.withChronology(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = chronology24.add(readablePeriod26, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField30 = chronology24.clockhourOfDay();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField32 = chronology24.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = chronology24.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale1);
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644572698043,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=43,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ita" + "'", str5, "ita");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime14);
        int int16 = dateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) '#');
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime19.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = dateTime19.plusWeeks(5);
        org.joda.time.Chronology chronology32 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime19.minus(readablePeriod33);
        int int35 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime37 = dateTime15.withHourOfDay(11);
        int int38 = dateTime37.getMillisOfDay();
        long long39 = dateTime37.getMillis();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.minus(readablePeriod40);
        org.joda.time.DateTime.Property property42 = dateTime41.year();
        org.joda.time.DateTime dateTime44 = dateTime41.minusHours(49021102);
        int int45 = dateTime41.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 43199999 + "'", int38 == 43199999);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3052799999L + "'", long39 == 3052799999L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 19 + "'", int45 == 19);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        int int11 = localDate4.get(dateTimeFieldType10);
        org.joda.time.LocalDate localDate13 = localDate4.minusDays(0);
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) '#');
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime19.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = dateTime19.plusWeeks(5);
        org.joda.time.Chronology chronology32 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType16.getField(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        java.lang.String str4 = monthDay0.toString("23");
        java.lang.String str5 = monthDay0.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology18 = chronology14.withZone(dateTimeZone17);
        org.joda.time.MonthDay monthDay19 = org.joda.time.MonthDay.now(chronology14);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField21 = chronology14.millis();
        org.joda.time.MonthDay monthDay22 = monthDay0.withChronologyRetainFields(chronology14);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DurationField durationField24 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField25 = chronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.dayOfMonth();
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23" + "'", str4, "23");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--02-13" + "'", str5, "--02-13");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(monthDay19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) '#');
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(32769);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime15 = dateTime10.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays((int) '#');
        boolean boolean21 = dateTime18.isBeforeNow();
        boolean boolean22 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime18);
        int int23 = property7.compareTo((org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime10.withTime(14399954, 0, 366, 583);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14399954 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 4, dateTimeZone3);
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = dateTimeZone3.getShortName((long) 0, locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        long long11 = calendar8.getTimeInMillis();
        java.lang.String str12 = calendar8.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar8.get(12503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12503");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+52:00" + "'", str7, "+52:00");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644572698150,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=150,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1644572698150L + "'", long11 == 1644572698150L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "gregory" + "'", str12, "gregory");
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate7.toDateTime(localTime13);
        int int15 = localDate7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = dateTime21.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology29 = chronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.weekyearOfCentury();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(83968099800000L, chronology25);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusDays((int) '#');
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone42);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDate43.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime38.toDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime50 = dateTime38.plusWeeks(5);
        int int51 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime38);
        int int52 = dateTime38.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime38.toMutableDateTimeISO();
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone55);
        org.joda.time.LocalDate localDate58 = localDate56.withDayOfYear(100);
        org.joda.time.Interval interval59 = localDate58.toInterval();
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = localDate58.toDateTimeAtCurrentTime(dateTimeZone61);
        int int65 = dateTimeZone61.getOffset(0L);
        java.lang.String str67 = dateTimeZone61.getName(97L);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property73 = dateTime72.hourOfDay();
        org.joda.time.DateTime dateTime75 = dateTime72.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology76 = dateTime75.getChronology();
        org.joda.time.DateTime dateTime78 = dateTime75.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime80 = dateTime75.withCenturyOfEra(0);
        org.joda.time.DateTime.Property property81 = dateTime80.dayOfWeek();
        java.util.Locale locale82 = java.util.Locale.ITALY;
        java.util.Locale locale83 = java.util.Locale.ITALIAN;
        java.lang.String str84 = locale83.getLanguage();
        java.lang.String str85 = locale82.getDisplayScript(locale83);
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(locale83);
        java.lang.String str87 = locale83.getISO3Language();
        int int88 = property81.getMaximumTextLength(locale83);
        boolean boolean89 = dateTimeZone61.equals((java.lang.Object) int88);
        java.lang.String str91 = dateTimeZone61.getShortName(26L);
        int int93 = dateTimeZone61.getStandardOffset((long) 48999197);
        org.joda.time.MutableDateTime mutableDateTime94 = dateTime38.toMutableDateTime(dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight95 = localDate7.toDateMidnight(dateTimeZone61);
        int int96 = localDate7.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType98 = localDate7.getFieldType(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 187200000 + "'", int51 == 187200000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 187200000 + "'", int65 == 187200000);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+52:00" + "'", str67, "+52:00");
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "it");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "it" + "'", str84, "it");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(calendar86);
// flaky:         org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=1644572698165,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=165,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ita" + "'", str87, "ita");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 9 + "'", int88 == 9);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "+52:00" + "'", str91, "+52:00");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 187200000 + "'", int93 == 187200000);
        org.junit.Assert.assertNotNull(mutableDateTime94);
        org.junit.Assert.assertNotNull(dateMidnight95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 22 + "'", int96 == 22);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.minusMinutes(52);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        long long20 = dateTimeZone16.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime21 = dateTime2.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property22 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime2.minusMinutes(18);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withDurationAdded(readableDuration25, (int) (byte) 1);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate30 = localDate28.minusMonths(32769);
        org.joda.time.LocalDate localDate32 = localDate28.withYear(9);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfYear(100);
        int int38 = localDate35.size();
        org.joda.time.LocalDate localDate40 = localDate35.plusMonths(6);
        int int42 = localDate40.getValue(0);
        java.lang.String str43 = localDate40.toString();
        org.joda.time.LocalDate localDate45 = localDate40.withWeekyear(1);
        org.joda.time.LocalDate localDate47 = localDate40.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.now(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = localDate47.toDateTimeAtStartOfDay(dateTimeZone50);
        int int53 = dateTime52.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime52.getZone();
        org.joda.time.Interval interval55 = localDate28.toInterval(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((java.lang.Object) readableDuration25, dateTimeZone54);
        int int57 = dateTime56.getWeekyear();
        org.joda.time.DateTime dateTime59 = dateTime56.plusSeconds(227);
        org.joda.time.DateTime.Property property60 = dateTime56.year();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusDays((int) '#');
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        long long70 = chronology66.add((-2608L), (long) 'a', (int) (byte) 100);
        org.joda.time.DurationField durationField71 = chronology66.months();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology66.getZone();
        org.joda.time.DateTime dateTime73 = dateTime56.toDateTime(dateTimeZone72);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-187199990L) + "'", long20 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022-08-13" + "'", str43, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2021 + "'", int53 == 2021);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 7092L + "'", long70 == 7092L);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTime(readableInstant11);
        int int13 = localDate9.getEra();
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(1439);
        org.joda.time.LocalDate.Property property16 = localDate9.dayOfMonth();
        org.joda.time.LocalDate localDate17 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime14);
        int int16 = dateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) '#');
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime19.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = dateTime19.plusWeeks(5);
        org.joda.time.Chronology chronology32 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime19.minus(readablePeriod33);
        int int35 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime37 = dateTime15.withHourOfDay(11);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(32769);
        org.joda.time.LocalDate localDate15 = localDate4.minusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(100);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfDay();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DateTime dateTime21 = property19.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime31 = dateTime26.minusDays((int) 'u');
        int int32 = dateTime26.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime26.plus(readablePeriod33);
        boolean boolean35 = property19.equals((java.lang.Object) dateTime26);
        org.joda.time.DateTime dateTime37 = dateTime26.minusMonths(32772);
        boolean boolean38 = dateTime26.isAfterNow();
        org.joda.time.DateTime.Property property39 = dateTime26.dayOfMonth();
        org.joda.time.DateTime.Property property40 = dateTime26.hourOfDay();
        org.joda.time.DateTime dateTime42 = dateTime26.minusHours(1200);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        boolean boolean9 = dateTimeFormatter2.isPrinter();
        int int10 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale11 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(239);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear(2913229);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = dateTime2.toString();
        int int15 = dateTime2.getDayOfYear();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withDayOfYear(100);
        org.joda.time.LocalDate.Property property21 = localDate18.dayOfMonth();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.LocalDate localDate24 = property21.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate25 = property21.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property21.getFieldType();
        org.joda.time.LocalDate localDate27 = property21.getLocalDate();
        org.joda.time.LocalDate localDate28 = property21.roundFloorCopy();
        java.lang.String str29 = localDate28.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(11);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime2.withZoneRetainFields(dateTimeZone31);
        int int34 = dateTime2.getDayOfWeek();
        int int35 = dateTime2.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-03T03:59:59.999+52:00" + "'", str14, "1970-01-03T03:59:59.999+52:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022-02-13" + "'", str29, "2022-02-13");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 239 + "'", int35 == 239);
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        java.lang.String str25 = chronology20.toString();
        boolean boolean26 = dateTime4.equals((java.lang.Object) str25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar28 = dateTime4.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime4.plusSeconds(3);
        org.joda.time.DateTime dateTime32 = dateTime4.minusMinutes(3);
        org.joda.time.DateTime.Property property33 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime35 = property33.addToCopy(6);
        int int36 = dateTime35.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[+52:00]" + "'", str25, "ISOChronology[+52:00]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.LocalDate.Property property9 = localDate8.centuryOfEra();
        int int10 = property9.get();
        org.joda.time.LocalDate localDate11 = property9.getLocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths(12503);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-187199996L) + "'", long7 == (-187199996L));
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.MonthDay monthDay2 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay4 = monthDay2.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.MonthDay monthDay6 = monthDay2.minus(readablePeriod5);
        org.joda.time.MonthDay.Property property7 = monthDay2.dayOfMonth();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        java.lang.String str17 = property16.getAsShortText();
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        int int47 = property16.getMaximumTextLength(locale44);
        org.joda.time.DateTimeField dateTimeField48 = property16.getField();
        java.util.Locale locale49 = java.util.Locale.FRENCH;
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(locale49);
        int int51 = property16.getMaximumTextLength(locale49);
        boolean boolean52 = locale49.hasExtensions();
        java.lang.String str53 = locale49.getDisplayCountry();
        boolean boolean54 = locale49.hasExtensions();
        int int55 = property7.getMaximumShortTextLength(locale49);
        java.util.Locale.Builder builder56 = builder0.setLocale(locale49);
        java.util.Locale.Builder builder58 = builder0.setLanguageTag("Italy");
        java.util.Locale locale59 = builder58.build();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property65 = dateTime64.hourOfDay();
        org.joda.time.DateTime dateTime67 = dateTime64.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime69 = dateTime64.withYearOfEra((int) ' ');
        int int70 = dateTime64.getYearOfCentury();
        int int71 = dateTime64.getMonthOfYear();
        org.joda.time.DateTime.Property property72 = dateTime64.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getLanguage();
        java.lang.String str77 = dateTimeZone73.getName(0L, locale75);
        int int78 = property72.getMaximumShortTextLength(locale75);
        java.util.Locale locale79 = locale75.stripExtensions();
        java.util.Locale locale80 = java.util.Locale.ROOT;
        java.lang.String str81 = locale80.toLanguageTag();
        java.lang.String str82 = locale75.getDisplayVariant(locale80);
        java.util.Locale.Builder builder83 = builder58.setLocale(locale80);
        java.util.Locale.Builder builder85 = builder58.removeUnicodeLocaleAttribute("gregory");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder87 = builder58.setVariant("2 Apr 2104 08:59:51 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2 Apr 2104 08:59:51 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertNotNull(monthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[dayOfMonth]" + "'", str8, "Property[dayOfMonth]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=1644572698411,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=411,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "italy");
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 52 + "'", int70 == 52);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "it" + "'", str76, "it");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+52:00" + "'", str77, "+52:00");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "it");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "und" + "'", str81, "und");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1644572660781L);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfMonth();
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay9 = monthDay7.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = monthDay9.getField((int) (byte) 0);
        java.util.Locale locale15 = new java.util.Locale("", "", "hi!");
        int int16 = dateTimeField11.getMaximumTextLength(locale15);
        long long19 = dateTimeField11.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.MonthDay monthDay24 = monthDay20.minus(readablePeriod23);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField29 = monthDay27.getField((int) (byte) 0);
        java.util.Locale locale33 = new java.util.Locale("", "", "hi!");
        int int34 = dateTimeField29.getMaximumTextLength(locale33);
        java.lang.String str35 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) monthDay20, locale33);
        int int36 = property5.getMaximumTextLength(locale33);
        org.joda.time.DateTimeField dateTimeField37 = property5.getField();
        org.joda.time.DurationField durationField38 = property5.getRangeDurationField();
        java.lang.String str39 = property5.getName();
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(locale40);
        java.lang.String str42 = locale40.getCountry();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property48 = dateTime47.hourOfDay();
        java.lang.String str49 = property48.getAsShortText();
        org.joda.time.MonthDay monthDay50 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay52 = monthDay50.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField54 = monthDay52.getField((int) (byte) 0);
        java.util.Locale locale58 = new java.util.Locale("", "", "hi!");
        int int59 = dateTimeField54.getMaximumTextLength(locale58);
        long long62 = dateTimeField54.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay63 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay65 = monthDay63.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.MonthDay monthDay67 = monthDay63.minus(readablePeriod66);
        org.joda.time.MonthDay monthDay68 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay70 = monthDay68.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField72 = monthDay70.getField((int) (byte) 0);
        java.util.Locale locale76 = new java.util.Locale("", "", "hi!");
        int int77 = dateTimeField72.getMaximumTextLength(locale76);
        java.lang.String str78 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) monthDay63, locale76);
        int int79 = property48.getMaximumTextLength(locale76);
        java.lang.String str80 = locale40.getDisplayVariant(locale76);
        java.util.Locale locale81 = java.util.Locale.ITALIAN;
        java.lang.String str82 = locale76.getDisplayScript(locale81);
        int int83 = property5.getMaximumShortTextLength(locale81);
        org.joda.time.DateTime dateTime85 = property5.addToCopy(1644572366928L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feb" + "'", str35, "Feb");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hourOfDay" + "'", str39, "hourOfDay");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar41);
// flaky:         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=1644572698441,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=441,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "3" + "'", str49, "3");
        org.junit.Assert.assertNotNull(monthDay52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9L + "'", long62 == 9L);
        org.junit.Assert.assertNotNull(monthDay65);
        org.junit.Assert.assertNotNull(monthDay67);
        org.junit.Assert.assertNotNull(monthDay70);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Feb" + "'", str78, "Feb");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "it");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        int int15 = localDate7.getYear();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withDayOfYear(100);
        int int21 = localDate18.size();
        org.joda.time.LocalDate localDate23 = localDate18.plusMonths(6);
        int int25 = localDate23.getValue(0);
        boolean boolean26 = localDate7.equals((java.lang.Object) int25);
        org.joda.time.LocalDate localDate28 = localDate7.withDayOfYear((int) (short) 100);
        int int29 = localDate28.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = localDate28.withWeekOfWeekyear(80400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 80400000 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser50 = dateTimeFormatter48.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatter48.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter48.withZoneUTC();
        java.lang.Appendable appendable54 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter53.printTo(appendable54, 364L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572698496,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=496,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNull(dateTimeParser50);
        org.junit.Assert.assertNull(dateTimeParser51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(45, 49207170, (-1829), 14399);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        int int11 = dateTime8.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        int int8 = property2.getMinimumValue();
        org.joda.time.DurationField durationField9 = property2.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property2.getFieldType();
        java.lang.String str11 = property2.getAsText();
        int int12 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "janvier" + "'", str11, "janvier");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        long long19 = chronology8.getDateTimeMillis((-1), 8, 2, 17);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField24 = monthDay22.getField((int) (byte) 0);
        java.util.Locale locale28 = new java.util.Locale("", "", "hi!");
        int int29 = dateTimeField24.getMaximumTextLength(locale28);
        long long32 = dateTimeField24.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay33 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay35 = monthDay33.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay37 = monthDay33.minus(readablePeriod36);
        org.joda.time.MonthDay monthDay38 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay40 = monthDay38.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField42 = monthDay40.getField((int) (byte) 0);
        java.util.Locale locale46 = new java.util.Locale("", "", "hi!");
        int int47 = dateTimeField42.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) monthDay33, locale46);
        int[] intArray49 = monthDay33.getValues();
        int[] intArray51 = chronology8.get((org.joda.time.ReadablePartial) monthDay33, (long) 4);
        org.joda.time.MonthDay monthDay52 = new org.joda.time.MonthDay(chronology8);
        org.joda.time.DateTimeField dateTimeField53 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField54 = chronology8.months();
        org.joda.time.DurationField durationField55 = chronology8.weekyears();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62180539199983L) + "'", long19 == (-62180539199983L));
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9L + "'", long32 == 9L);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feb" + "'", str48, "Feb");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[2, 13]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 3]");
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(3);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDate.Property property10 = localDate7.property(dateTimeFieldType9);
        org.joda.time.LocalDate localDate12 = localDate7.minusMonths(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDate12.getFieldType(10799999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10799999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("fra (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"fra (France)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale.Builder builder11 = builder0.setLocale(locale10);
        java.util.Locale locale12 = builder0.build();
        java.util.Locale locale13 = builder0.build();
        java.util.Locale.Builder builder14 = builder0.clear();
        java.util.Locale.Builder builder15 = builder0.clear();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronology();
        boolean boolean20 = dateTimeFormatter18.isParser();
        org.joda.time.Chronology chronology21 = dateTimeFormatter18.getChronology();
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale23.getLanguage();
        java.lang.String str25 = locale22.getDisplayScript(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter18.withLocale(locale23);
        java.util.Locale.Builder builder27 = builder0.setLocale(locale23);
        java.util.Locale.Builder builder28 = builder27.clear();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(chronology21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "it" + "'", str24, "it");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        java.lang.String str47 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) monthDay15, locale44);
        java.lang.String str48 = dateTimeField4.getName();
        int int49 = dateTimeField4.getMinimumValue();
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "February" + "'", str47, "February");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "monthOfYear" + "'", str48, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay6 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) '4', (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        boolean boolean15 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property16 = dateTime2.dayOfWeek();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.DateTime dateTime19 = property16.addToCopy(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6" + "'", str17, "6");
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter4.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays((int) '#');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime8.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime8.plusWeeks(5);
        org.joda.time.Chronology chronology21 = dateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter4.withChronology(chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter22.withOffsetParsed();
        org.joda.time.Chronology chronology24 = dateTimeFormatter23.getChronolgy();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType0.getField(chronology24);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter28.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusDays((int) '#');
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDate37.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime32.toDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime44 = dateTime32.plusWeeks(5);
        org.joda.time.Chronology chronology45 = dateTime32.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter28.withChronology(chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter46.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeFormatter46.getZone();
        java.lang.Integer int49 = dateTimeFormatter46.getPivotYear();
        java.util.Locale locale50 = java.util.Locale.UK;
        java.util.Locale locale51 = java.util.Locale.CANADA;
        java.lang.String str52 = locale50.getDisplayScript(locale51);
        java.util.Set<java.lang.String> strSet53 = locale51.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet54 = locale51.getExtensionKeys();
        java.lang.String str55 = locale51.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter46.withLocale(locale51);
        java.lang.String str57 = locale51.getCountry();
        int int58 = dateTimeField25.getMaximumShortTextLength(locale51);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNull(dateTimePrinter29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNull(dateTimeZone48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(charSet54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "eng" + "'", str55, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "CA" + "'", str57, "CA");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        int int9 = calendar1.getWeekYear();
        calendar1.setMinimalDaysInFirstWeek(8);
        int int12 = calendar1.getWeeksInWeekYear();
        java.lang.String str13 = calendar1.getCalendarType();
        calendar1.setLenient(false);
        java.util.Date date16 = calendar1.getTime();
        calendar1.setFirstDayOfWeek(47);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572698667,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=47,minimalDaysInFirstWeek=8,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=667,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Feb 11 09:44:58 UTC 2022");
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.Chronology chronology16 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime2.plusHours((int) (short) -1);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.DateTime dateTime21 = property19.getDateTime();
        org.joda.time.DateTime dateTime23 = property19.addToCopy(62135971200000L);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays((int) '#');
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay30 = dateTime26.toYearMonthDay();
        org.joda.time.DateTime dateTime33 = dateTime26.withDurationAdded((long) '4', (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) '4');
        boolean boolean39 = dateTime26.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        int int45 = dateTime42.getWeekyear();
        org.joda.time.DateTime dateTime47 = dateTime42.minusMillis((int) (short) 0);
        org.joda.time.Chronology chronology48 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime49 = dateTime38.withChronology(chronology48);
        org.joda.time.Chronology chronology50 = dateTime38.getChronology();
        org.joda.time.DateTime dateTime51 = dateTime38.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime38.plus(readableDuration52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusYears(583);
        int int56 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime55);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(dateTimeZone58);
        org.joda.time.LocalDate localDate61 = localDate59.withDayOfYear(100);
        org.joda.time.LocalDate.Property property62 = localDate59.dayOfMonth();
        org.joda.time.DateTime dateTime63 = localDate59.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtMidnight(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime65.withDurationAdded(3659999L, 14432);
        int int69 = dateTime55.compareTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime70 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.DateTime dateTime72 = dateTime55.plus(readablePeriod71);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate11 = property5.addWrapFieldToCopy(3);
        org.joda.time.DurationField durationField12 = property5.getDurationField();
        org.joda.time.LocalDate localDate13 = property5.roundHalfEvenCopy();
        org.joda.time.DurationField durationField14 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-11");
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(2730);
        long long4 = dateTime3.getMillis();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays((int) '#');
        int int10 = dateTime7.getWeekyear();
        org.joda.time.DateMidnight dateMidnight11 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property13 = dateTime7.property(dateTimeFieldType12);
        java.lang.String str14 = dateTimeFieldType12.getName();
        int int15 = dateTime3.get(dateTimeFieldType12);
        int int16 = dateTime3.getYearOfCentury();
        org.joda.time.DateTime dateTime18 = dateTime3.minusDays(160);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8823412800000L + "'", long4 == 8823412800000L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 0);
        java.lang.String str8 = dateTime2.toString();
        boolean boolean9 = dateTime2.isAfterNow();
        org.joda.time.DateTime.Property property10 = dateTime2.dayOfYear();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DurationField durationField12 = property10.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-03T03:59:59.999+52:00" + "'", str8, "1970-01-03T03:59:59.999+52:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) '#');
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(32769);
        org.joda.time.LocalDate localDate8 = localDate2.withYearOfEra((int) (short) 1);
        org.joda.time.LocalDate.Property property9 = localDate2.weekyear();
        org.joda.time.LocalDate localDate10 = property9.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.millis();
        java.lang.String str12 = durationFieldType11.getName();
        boolean boolean13 = localDate10.isSupported(durationFieldType11);
        org.joda.time.LocalDate.Property property14 = localDate10.dayOfWeek();
        org.joda.time.LocalDate localDate15 = property14.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "millis" + "'", str12, "millis");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear(100);
        int int6 = localDate3.size();
        org.joda.time.LocalDate localDate8 = localDate3.plusMonths(6);
        int int10 = localDate8.getValue(0);
        java.lang.String str11 = localDate8.toString();
        org.joda.time.LocalDate localDate13 = localDate8.withWeekyear(1);
        org.joda.time.LocalDate localDate15 = localDate8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(100);
        org.joda.time.DateTime dateTime24 = dateTime22.plusWeeks(3);
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime26 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property32 = dateTime31.hourOfDay();
        org.joda.time.DateTime dateTime34 = property32.addToCopy(97L);
        java.lang.String str35 = property32.toString();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime44 = dateTime40.withYearOfCentury(1);
        int int45 = property32.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime47 = dateTime40.minusYears(29);
        org.joda.time.DateTime.Property property48 = dateTime47.secondOfMinute();
        boolean boolean49 = dateTime26.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusDays((int) '#');
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(dateTimeZone56);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDate57.toDateTimeAtStartOfDay(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime52.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime64 = dateTime52.minusMinutes(52);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(dateTimeZone66);
        long long70 = dateTimeZone66.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime71 = dateTime52.withZone(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime52.getZone();
        org.joda.time.LocalDate localDate73 = org.joda.time.LocalDate.now(dateTimeZone72);
        boolean boolean75 = dateTimeZone72.isStandardOffset(11L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone72);
        org.joda.time.DateTime dateTime77 = dateTime26.withZone(dateTimeZone72);
        int int78 = dateTime26.getCenturyOfEra();
        org.joda.time.DateTime dateTime80 = dateTime26.plusMillis((-52));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-08-13" + "'", str11, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Property[hourOfDay]" + "'", str35, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-187199990L) + "'", long70 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 20 + "'", int78 == 20);
        org.junit.Assert.assertNotNull(dateTime80);
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.MonthDay monthDay6 = property2.addWrapFieldToCopy((int) ' ');
        org.joda.time.MonthDay monthDay8 = property2.addWrapFieldToCopy(16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(monthDay6);
        org.junit.Assert.assertNotNull(monthDay8);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getDayOfWeek();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        int int11 = localDate8.size();
        org.joda.time.LocalDate localDate13 = localDate8.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) '#');
        int int19 = dateTime16.getWeekyear();
        org.joda.time.DateMidnight dateMidnight20 = dateTime16.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property22 = dateTime16.property(dateTimeFieldType21);
        org.joda.time.LocalDate.Property property23 = localDate13.property(dateTimeFieldType21);
        boolean boolean24 = dateTime2.equals((java.lang.Object) property23);
        org.joda.time.LocalDate localDate25 = property23.roundFloorCopy();
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfWeek();
        org.joda.time.LocalDate.Property property27 = localDate25.centuryOfEra();
        org.joda.time.LocalDate localDate28 = property27.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDate28.getFieldType(2097);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2097");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(2022);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime9 = dateTime6.plusYears(2);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withPeriodAdded(readablePeriod10, 2021);
        org.joda.time.DateTime dateTime14 = dateTime12.plus((long) 5);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, 34847);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("1969-12-31T23:59:59.999Z");
        java.util.Locale.Builder builder9 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder5.setLanguageTag("und");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = dateTimeFormatter48.getPrinter();
        int int50 = dateTimeFormatter48.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withPivotYear((java.lang.Integer) (-700535));
        boolean boolean53 = dateTimeFormatter48.isParser();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572698887,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=58,MILLISECOND=887,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimePrinter49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2000 + "'", int50 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readablePeriod11);
        boolean boolean13 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) '#');
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime16.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = dateTime16.plusWeeks(5);
        org.joda.time.Chronology chronology29 = dateTime16.getChronology();
        org.joda.time.Chronology chronology30 = dateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime2.toMutableDateTime(chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) 239, 14432);
        org.joda.time.DurationField durationField36 = chronology30.days();
        java.lang.Class<?> wildcardClass37 = durationField36.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 239L + "'", long35 == 239L);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology17 = chronology13.withZone(dateTimeZone16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay((java.lang.Object) dateTime4, chronology13);
        java.lang.String str20 = monthDay18.toString("35");
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.MonthDay monthDay23 = monthDay18.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.MonthDay monthDay25 = monthDay23.plusMonths(32770);
        org.joda.time.MonthDay monthDay27 = monthDay23.plusDays((-3600000));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = monthDay27.toString("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35" + "'", str20, "35");
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(monthDay25);
        org.junit.Assert.assertNotNull(monthDay27);
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DurationField durationField14 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.clockhourOfDay();
        org.joda.time.MonthDay monthDay19 = new org.joda.time.MonthDay(chronology8);
        org.joda.time.DateTimeField dateTimeField20 = chronology8.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+52:00]" + "'", str13, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        int int4 = property2.getMaximumShortTextLength(locale3);
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = property2.getAsShortText(locale5);
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = property2.getAsShortText(locale7);
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.MonthDay monthDay12 = property2.addWrapFieldToCopy((-102795));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jan" + "'", str6, "Jan");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jan" + "'", str8, "Jan");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(monthDay12);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("-2022-08-13");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder4.setVariant("anglais");
        java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("und");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder11 = builder8.addUnicodeLocaleAttribute("100");
        java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("January");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("java.util.GregorianCalendar[time=1644615496872,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=38,SECOND=16,MILLISECOND=872,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.util.GregorianCalendar[time=1644615496872,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=38,SECOND=16,MILLISECOND=872,ZONE_OFFSET=0,DST_OFFSET=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 239, dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays((int) '#');
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = dateTime9.plusWeeks(5);
        org.joda.time.Chronology chronology22 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology22);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withDayOfYear(100);
        org.joda.time.Interval interval29 = localDate28.toInterval();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.days();
        java.lang.String str31 = durationFieldType30.getName();
        org.joda.time.LocalDate localDate33 = localDate28.withFieldAdded(durationFieldType30, 32770);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate28.plus(readablePeriod34);
        org.joda.time.LocalDate localDate37 = localDate28.withYearOfEra(32769);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime40 = localDate39.toDateTimeAtMidnight();
        int int41 = localDate39.getCenturyOfEra();
        org.joda.time.LocalDate localDate43 = localDate39.withWeekyear(19);
        int int44 = localDate43.getYear();
        int[] intArray46 = chronology22.get((org.joda.time.ReadablePartial) localDate43, (long) 49073203);
        org.joda.time.DurationField durationField47 = durationFieldType5.getField(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "days" + "'", str31, "days");
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1970, 1, 3]");
        org.junit.Assert.assertNotNull(durationField47);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        calendar1.setTimeInMillis(1L);
        int int12 = calendar1.getGreatestMinimum(8);
        int int13 = calendar1.getWeeksInWeekYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime19.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology27 = chronology23.withZone(dateTimeZone26);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays((int) '#');
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.days();
        java.lang.String str35 = durationFieldType34.getName();
        org.joda.time.DateTime dateTime37 = dateTime33.withFieldAdded(durationFieldType34, (int) 'u');
        int int38 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime33);
        java.util.TimeZone timeZone39 = dateTimeZone26.toTimeZone();
        calendar1.setTimeZone(timeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "days" + "'", str35, "days");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 349260000 + "'", int38 == 349260000);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime37.hourOfDay();
        org.joda.time.DateTime dateTime40 = dateTime37.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology45 = chronology41.withZone(dateTimeZone44);
        org.joda.time.MonthDay monthDay46 = org.joda.time.MonthDay.now(chronology41);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField49 = chronology41.minuteOfDay();
        org.joda.time.MonthDay monthDay50 = monthDay32.withChronologyRetainFields(chronology41);
        int[] intArray51 = monthDay50.getValues();
        org.joda.time.MonthDay monthDay53 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property54 = monthDay53.monthOfYear();
        java.lang.String str55 = property54.getAsText();
        int int56 = property54.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property54.getFieldType();
        int int58 = monthDay50.indexOf(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(monthDay46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(monthDay50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[2, 13]");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "janvier" + "'", str55, "janvier");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        java.util.Locale locale3 = new java.util.Locale("9 Dec 1973 00:00:00 GMT", "1 Jan 1970 00:00:14 GMT", "dimanche");
        org.junit.Assert.assertEquals(locale3.toString(), "9 dec 1973 00:00:00 gmt_1 JAN 1970 00:00:14 GMT_dimanche");
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) '#');
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(32769);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime15 = dateTime10.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays((int) '#');
        boolean boolean21 = dateTime18.isBeforeNow();
        boolean boolean22 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime18);
        int int23 = property7.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime10.plus(readablePeriod24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusSeconds(12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfCentury(1);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology23 = chronology19.withZone(dateTimeZone22);
        org.joda.time.MonthDay monthDay24 = org.joda.time.MonthDay.now(chronology19);
        org.joda.time.DateTimeField dateTimeField25 = chronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology19.year();
        java.lang.String str27 = dateTimeField26.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property33 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology40 = chronology36.withZone(dateTimeZone39);
        org.joda.time.MonthDay monthDay41 = org.joda.time.MonthDay.now(chronology36);
        org.joda.time.DateTimeField dateTimeField42 = chronology36.dayOfMonth();
        java.util.Locale locale43 = java.util.Locale.CHINA;
        int int44 = dateTimeField42.getMaximumTextLength(locale43);
        int int45 = dateTimeField26.getMaximumShortTextLength(locale43);
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale47);
        java.lang.String str49 = locale47.getCountry();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property55 = dateTime54.hourOfDay();
        java.lang.String str56 = property55.getAsShortText();
        org.joda.time.MonthDay monthDay57 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay59 = monthDay57.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField61 = monthDay59.getField((int) (byte) 0);
        java.util.Locale locale65 = new java.util.Locale("", "", "hi!");
        int int66 = dateTimeField61.getMaximumTextLength(locale65);
        long long69 = dateTimeField61.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay70 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay72 = monthDay70.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.MonthDay monthDay74 = monthDay70.minus(readablePeriod73);
        org.joda.time.MonthDay monthDay75 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay77 = monthDay75.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField79 = monthDay77.getField((int) (byte) 0);
        java.util.Locale locale83 = new java.util.Locale("", "", "hi!");
        int int84 = dateTimeField79.getMaximumTextLength(locale83);
        java.lang.String str85 = dateTimeField61.getAsShortText((org.joda.time.ReadablePartial) monthDay70, locale83);
        int int86 = property55.getMaximumTextLength(locale83);
        java.lang.String str87 = locale47.getDisplayVariant(locale83);
        java.lang.String str88 = dateTimeField26.getAsShortText(1970, locale83);
        java.util.Locale locale89 = java.util.Locale.GERMANY;
        java.lang.String str90 = locale89.toLanguageTag();
        java.lang.String str91 = locale83.getDisplayLanguage(locale89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = mutableDateTime9.toString("Jun 1, 29107246 11:05:35 PM", locale89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateTimeField[year]" + "'", str27, "DateTimeField[year]");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar48);
// flaky:         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=1644572699109,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=109,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "3" + "'", str56, "3");
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 9L + "'", long69 == 9L);
        org.junit.Assert.assertNotNull(monthDay72);
        org.junit.Assert.assertNotNull(monthDay74);
        org.junit.Assert.assertNotNull(monthDay77);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Feb" + "'", str85, "Feb");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1970" + "'", str88, "1970");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "de-DE" + "'", str90, "de-DE");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2022-08-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter2.withPivotYear(73);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeFormatter2.getZone();
        java.util.Locale locale53 = dateTimeFormatter2.getLocale();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MonthDay monthDay55 = new org.joda.time.MonthDay(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property61 = dateTime60.hourOfDay();
        org.joda.time.DateTime dateTime63 = dateTime60.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.MonthDay monthDay65 = monthDay55.withChronologyRetainFields(chronology64);
        org.joda.time.Chronology chronology66 = monthDay55.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter2.withChronology(chronology66);
        java.util.Locale locale68 = java.util.Locale.ITALY;
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str70 = locale69.getLanguage();
        java.lang.String str71 = locale68.getDisplayScript(locale69);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(locale69);
        java.lang.String str73 = locale69.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter67.withLocale(locale69);
        java.io.Writer writer75 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter74.printTo(writer75, 5907399684280970637L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572699134,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=134,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNull(dateTimeZone52);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(monthDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "it" + "'", str70, "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(calendar72);
// flaky:         org.junit.Assert.assertEquals(calendar72.toString(), "java.util.GregorianCalendar[time=1644572699134,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=134,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ita" + "'", str73, "ita");
        org.junit.Assert.assertNotNull(dateTimeFormatter74);
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = property13.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) '#');
        int int20 = dateTime17.getWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime17.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime17.plus(readablePeriod23);
        int int25 = property13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = property13.addToCopy((long) 11);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("fr");
        java.lang.String str30 = property13.getAsShortText(locale29);
        org.joda.time.DateTime dateTime31 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime32 = property13.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19" + "'", str14, "19");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19" + "'", str30, "19");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusDays((int) 'u');
        int int10 = dateTime4.getYearOfEra();
        org.joda.time.DateTime dateTime12 = dateTime4.plusMillis(4);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        org.joda.time.LocalDate.Property property18 = localDate15.dayOfMonth();
        org.joda.time.LocalDate localDate19 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime12.withFields((org.joda.time.ReadablePartial) localDate19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfYear(100);
        org.joda.time.Interval interval26 = localDate25.toInterval();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        java.lang.String str28 = durationFieldType27.getName();
        org.joda.time.LocalDate localDate30 = localDate25.withFieldAdded(durationFieldType27, 32770);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate25.plus(readablePeriod31);
        int int33 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate35 = localDate19.plusWeeks(9);
        org.joda.time.LocalDate.Property property36 = localDate19.dayOfYear();
        org.joda.time.LocalDate localDate38 = property36.addToCopy((int) 'a');
        org.joda.time.LocalDate localDate39 = property36.withMinimumValue();
        org.joda.time.LocalDate localDate41 = property36.addWrapFieldToCopy(48949);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "days" + "'", str28, "days");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1162);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime2.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean19 = dateTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType18.getDurationType();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType18.getDurationType();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        java.util.TimeZone timeZone23 = calendar1.getTimeZone();
        calendar1.set((int) 'u', (int) (byte) 10, 0, 2730, 11127);
        long long30 = calendar1.getTimeInMillis();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-58438413180000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=118,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=27,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-58438413180000L) + "'", long30 == (-58438413180000L));
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.MonthDay monthDay34 = monthDay13.minusDays(59);
        java.util.Date date40 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long41 = date40.getTime();
        long long42 = date40.getTime();
        boolean boolean43 = monthDay13.equals((java.lang.Object) date40);
        org.joda.time.Chronology chronology44 = monthDay13.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology44.getZone();
        int int48 = dateTimeZone46.getStandardOffset((-61693867108000L));
        int int50 = dateTimeZone46.getStandardOffset(1644572293825L);
        boolean boolean52 = dateTimeZone46.isStandardOffset((long) 34);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 83968099800000L + "'", long41 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 83968099800000L + "'", long42 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) '#');
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readablePeriod20);
        boolean boolean22 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) dateTime11);
        int int24 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology25 = dateTime11.getChronology();
        java.lang.String str27 = dateTime11.toString("2022-02-13");
        org.joda.time.DateTime dateTime29 = dateTime11.plus((long) 14402021);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        long long37 = dateTimeZone32.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(locale40);
        java.lang.String str42 = locale40.getCountry();
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str44 = locale40.getDisplayVariant(locale43);
        java.lang.String str45 = dateTimeZone32.getShortName((long) 20, locale40);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusDays((int) '#');
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtStartOfDay(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime48.toDateTime(dateTimeZone55);
        org.joda.time.DateTime.Property property59 = dateTime48.centuryOfEra();
        java.lang.String str60 = property59.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusDays((int) '#');
        int int66 = dateTime63.getWeekyear();
        org.joda.time.DateTime dateTime68 = dateTime63.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.DateTime dateTime70 = dateTime63.plus(readablePeriod69);
        int int71 = property59.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.DateTime dateTime73 = dateTime70.minus(readableDuration72);
        org.joda.time.DateTime dateTime75 = dateTime73.plusMinutes(4);
        int int76 = dateTime73.getEra();
        int int77 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime73);
        boolean boolean78 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime73);
        java.util.Locale locale79 = java.util.Locale.FRENCH;
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(locale79);
        java.lang.String str81 = locale79.getCountry();
        java.lang.String str82 = locale79.getDisplayScript();
        boolean boolean83 = locale79.hasExtensions();
        java.util.Calendar calendar84 = dateTime29.toCalendar(locale79);
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("Wed Oct 05 00:10:00 UTC 2332");
        java.lang.String str87 = locale79.getDisplayCountry(locale86);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-02-13" + "'", str27, "2022-02-13");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-187199996L) + "'", long37 == (-187199996L));
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar41);
// flaky:         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=1644572699249,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+52:00" + "'", str45, "+52:00");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "19" + "'", str60, "19");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1970 + "'", int66 == 1970);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 187200000 + "'", int77 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar80);
// flaky:         org.junit.Assert.assertEquals(calendar80.toString(), "java.util.GregorianCalendar[time=1644572699249,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(calendar84);
        org.junit.Assert.assertEquals(calendar84.toString(), "java.util.GregorianCalendar[time=14402020,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=2,MILLISECOND=20,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay((int) 'x', (int) ' ', 0);
        java.util.Calendar.Builder builder11 = builder3.setTimeOfDay((int) (short) -1, 0, 2730);
        java.util.Calendar.Builder builder15 = builder3.setWeekDate((int) (byte) 1, 187200000, 1);
        java.util.Calendar.Builder builder20 = builder15.setTimeOfDay(36, (int) (short) 10, 311, 14402);
        java.util.Calendar.Builder builder25 = builder15.setTimeOfDay(122, 54, 1439, 323);
        java.util.Calendar.Builder builder26 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder29 = builder26.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder33 = builder29.setTimeOfDay((int) 'x', (int) ' ', 0);
        java.util.Calendar.Builder builder37 = builder29.setTimeOfDay((int) (short) -1, 0, 2730);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale38);
        calendar39.setLenient(true);
        calendar39.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar39.setMinimalDaysInFirstWeek(2730);
        calendar39.clear();
        int int47 = calendar39.getFirstDayOfWeek();
        java.lang.Object obj48 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long55 = dateTimeZone51.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(obj48, dateTimeZone51);
        org.joda.time.DateTime dateTime57 = dateTime56.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime56.getZone();
        java.util.TimeZone timeZone59 = dateTimeZone58.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        calendar39.setTimeZone(timeZone59);
        java.util.Calendar.Builder builder62 = builder37.setTimeZone(timeZone59);
        java.util.Calendar.Builder builder63 = builder25.setTimeZone(timeZone59);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusDays((int) '#');
        java.util.TimeZone timeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate(dateTimeZone70);
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = localDate71.toDateTimeAtStartOfDay(dateTimeZone73);
        org.joda.time.DateTime dateTime76 = dateTime66.toDateTime(dateTimeZone73);
        boolean boolean77 = dateTimeZone73.isFixed();
        java.util.TimeZone timeZone78 = dateTimeZone73.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone80);
        org.joda.time.DateTime.Property property82 = dateTime81.secondOfMinute();
        org.joda.time.DateTime dateTime83 = property82.roundCeilingCopy();
        java.util.Locale locale84 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale85 = java.util.Locale.ITALY;
        java.util.Locale locale86 = java.util.Locale.ITALIAN;
        java.lang.String str87 = locale86.getLanguage();
        java.lang.String str88 = locale85.getDisplayScript(locale86);
        java.lang.String str89 = locale84.getDisplayCountry(locale85);
        java.lang.String str90 = property82.getAsText(locale85);
        java.util.Calendar calendar91 = java.util.Calendar.getInstance(timeZone78, locale85);
        java.util.Calendar.Builder builder92 = builder63.setTimeZone(timeZone78);
        java.util.Calendar.Builder builder96 = builder63.setWeekDate(2140, 364, 43);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar39);
        org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=2730,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-187199987L) + "'", long55 == (-187199987L));
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(timeZone78);
        org.junit.Assert.assertEquals(timeZone78.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "it" + "'", str87, "it");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Cina" + "'", str89, "Cina");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "59" + "'", str90, "59");
        org.junit.Assert.assertNotNull(calendar91);
// flaky:         org.junit.Assert.assertEquals(calendar91.toString(), "java.util.GregorianCalendar[time=1644572699302,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=302,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        java.lang.String str25 = chronology20.toString();
        boolean boolean26 = dateTime4.equals((java.lang.Object) str25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar28 = dateTime4.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime4.plusSeconds(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter33.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) '#');
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime37.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = dateTime37.plusWeeks(5);
        org.joda.time.Chronology chronology50 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter33.withChronology(chronology50);
        org.joda.time.DateTime dateTime52 = dateTime30.toDateTime(chronology50);
        int int53 = dateTime30.getSecondOfMinute();
        org.joda.time.DateTime.Property property54 = dateTime30.era();
        org.joda.time.DateTime dateTime56 = dateTime30.plusHours((int) (short) 10);
        int int57 = dateTime30.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime59 = dateTime30.withDayOfWeek(205);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 205 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[+52:00]" + "'", str25, "ISOChronology[+52:00]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 14402 + "'", int57 == 14402);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        java.util.Locale locale2 = new java.util.Locale("--02-03", "Jan");
        org.junit.Assert.assertEquals(locale2.toString(), "--02-03_JAN");
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.secondOfMinute();
        java.util.Locale locale21 = new java.util.Locale("fra", "--01-01", "monthOfYear");
        java.lang.String str23 = locale21.getExtension('u');
        boolean boolean24 = locale21.hasExtensions();
        int int25 = dateTimeField17.getMaximumTextLength(locale21);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = dateTimeField17.set((-375829157L), "2022-02-13T13:43:59.995+52:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-13T13:43:59.995+52:00\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale21.toString(), "fra_--01-01_monthOfYear");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(32769);
        org.joda.time.LocalDate localDate15 = localDate4.minusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(100);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfDay();
        java.lang.String str20 = property19.getAsText();
        java.lang.String str21 = property19.getName();
        int int22 = property19.getMaximumValueOverall();
        org.joda.time.DateTime dateTime23 = property19.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "secondOfDay" + "'", str21, "secondOfDay");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 86399 + "'", int22 == 86399);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear(100);
        int int7 = localDate4.size();
        org.joda.time.LocalDate localDate9 = localDate4.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property18 = dateTime12.property(dateTimeFieldType17);
        org.joda.time.LocalDate.Property property19 = localDate9.property(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime24.hourOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology32 = chronology28.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField33 = chronology28.weeks();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = chronology28.hourOfHalfday();
        boolean boolean36 = dateTimeFieldType17.isSupported(chronology28);
        org.joda.time.DurationField durationField37 = chronology28.minutes();
        org.joda.time.DateTimeField dateTimeField38 = chronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology28.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay40 = new org.joda.time.MonthDay(34908480, 10799999, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34908480 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        date3.setHours(2922789);
        date3.setTime(9L);
        java.util.Date date13 = new java.util.Date(0, 0, (int) '4');
        int int14 = date13.getHours();
        boolean boolean15 = date3.before(date13);
        java.lang.String str16 = date3.toLocaleString();
        int int17 = date3.getDay();
        int int18 = date3.getDate();
        int int19 = date3.getYear();
        java.util.Date date21 = new java.util.Date((long) (byte) 0);
        org.joda.time.MonthDay monthDay22 = org.joda.time.MonthDay.fromDateFields(date21);
        int int23 = date21.getTimezoneOffset();
        java.lang.String str24 = date21.toLocaleString();
        boolean boolean25 = date3.after(date21);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 janv. 1970 00:00:00" + "'", str16, "1 janv. 1970 00:00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 janv. 1970 00:00:00" + "'", str24, "1 janv. 1970 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(11);
        org.joda.time.MonthDay monthDay2 = new org.joda.time.MonthDay(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(31);
        org.joda.time.DateTime dateTime9 = dateTime5.plusHours(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = dateTime9.toString(dateTimeFormatter10);
        org.joda.time.DateTime dateTime12 = monthDay2.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDate localDate14 = monthDay2.toLocalDate(253);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-03T13:59:59.999+52:00" + "'", str11, "1970-01-03T13:59:59.999+52:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        java.util.Date date1 = new java.util.Date(1672617600000L);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 02 00:00:00 UTC 2023");
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        int int6 = date3.getMinutes();
        org.joda.time.MonthDay monthDay7 = org.joda.time.MonthDay.fromDateFields(date3);
        int int8 = monthDay7.getMonthOfYear();
        org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 12 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(monthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.Date date7 = dateTime6.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime10.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = dateTime10.minusMinutes(52);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        long long28 = dateTimeZone24.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime29 = dateTime10.withZone(dateTimeZone24);
        int int30 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime10);
        java.util.Date date31 = dateTime6.toDate();
        java.time.Instant instant32 = date31.toInstant();
        java.util.Date date33 = java.util.Date.from(instant32);
        java.util.Date date34 = java.util.Date.from(instant32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Feb 10 20:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-187199990L) + "'", long28 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Feb 10 20:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Feb 10 20:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Feb 10 20:00:00 UTC 2022");
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate.Property property11 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) localDate7);
        java.util.Date date13 = localDate7.toDate();
        date13.setMonth(315);
        java.util.Date date21 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long22 = date21.getTime();
        date21.setSeconds((int) 'u');
        boolean boolean25 = date13.after(date21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 13 00:00:00 UTC 2048");
        org.junit.Assert.assertEquals(date21.toString(), "Fri Nov 05 00:11:57 UTC 4630");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 83968099800000L + "'", long22 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(32769);
        org.joda.time.LocalDate localDate15 = localDate4.minusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(100);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfDay();
        java.lang.String str20 = property19.getAsText();
        java.lang.String str21 = property19.getName();
        org.joda.time.DateTime dateTime23 = property19.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMonths(15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusWeeks(19034);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "secondOfDay" + "'", str21, "secondOfDay");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        int int3 = property2.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        int int10 = property2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = property2.getAsText(locale11);
        int int13 = property2.getMaximumValueOverall();
        org.joda.time.DurationField durationField14 = property2.getDurationField();
        org.joda.time.MonthDay monthDay15 = property2.getMonthDay();
        org.joda.time.MonthDay monthDay17 = monthDay15.minusMonths(988);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e00\u6708" + "'", str12, "\u4e00\u6708");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter2.getZone();
        boolean boolean50 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter2.withZone(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter2.withPivotYear(32770);
        boolean boolean57 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property64 = dateTime63.hourOfDay();
        org.joda.time.DateTime dateTime66 = dateTime63.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology67 = dateTime66.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology71 = chronology67.withZone(dateTimeZone70);
        org.joda.time.DurationField durationField72 = chronology67.weeks();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology67.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter2.withChronology(chronology67);
        org.joda.time.DateTimeField dateTimeField75 = chronology67.secondOfMinute();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572699549,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=549,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTimeFormatter74);
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(0L);
        java.lang.String str4 = monthDay3.toString();
        org.joda.time.Chronology chronology5 = monthDay3.getChronology();
        org.joda.time.Chronology chronology6 = monthDay3.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay(2852, 102812, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2852 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--01-03" + "'", str4, "--01-03");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(2022);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) '#');
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime11.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime11.plusWeeks(5);
        org.joda.time.Chronology chronology24 = dateTime11.getChronology();
        org.joda.time.Chronology chronology25 = dateTime11.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime8.withChronology(chronology25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(5907399684280970662L, chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate27.withPeriodAdded(readablePeriod28, 52);
        org.joda.time.DateTime dateTime31 = localDate30.toDateTimeAtMidnight();
        org.joda.time.Interval interval32 = localDate30.toInterval();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval32);
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        date3.setHours(2922789);
        date3.setTime(9L);
        java.util.Date date13 = new java.util.Date(0, 0, (int) '4');
        int int14 = date13.getHours();
        int int15 = date13.getDate();
        boolean boolean16 = date3.after(date13);
        int int17 = date13.getMonth();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfYear(100);
        org.joda.time.Interval interval23 = localDate22.toInterval();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.days();
        java.lang.String str25 = durationFieldType24.getName();
        org.joda.time.LocalDate localDate27 = localDate22.withFieldAdded(durationFieldType24, 32770);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate22.plus(readablePeriod28);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTime.Property property37 = dateTime36.weekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property44 = dateTime43.hourOfDay();
        org.joda.time.DateTime dateTime46 = dateTime43.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology51 = chronology47.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.weekyearOfCentury();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(83968099800000L, chronology47);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtStartOfDay(dateTimeZone56);
        long long58 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        java.util.Date date62 = new java.util.Date(0, 0, (int) '4');
        date62.setDate(12);
        date62.setHours(2922789);
        date62.setTime(9L);
        java.util.Date date72 = new java.util.Date(0, 0, (int) '4');
        int int73 = date72.getHours();
        boolean boolean74 = date62.before(date72);
        java.lang.String str75 = date62.toLocaleString();
        date62.setMonth(187200000);
        date62.setDate((-1));
        boolean boolean80 = property37.equals((java.lang.Object) date62);
        java.lang.String str81 = date62.toGMTString();
        boolean boolean82 = localDate29.equals((java.lang.Object) date62);
        int int83 = date13.compareTo(date62);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "days" + "'", str25, "days");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-2608L) + "'", long58 == (-2608L));
        org.junit.Assert.assertEquals(date62.toString(), "Tue Dec 30 00:00:00 UTC 15601969");
        org.junit.Assert.assertEquals(date72.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1 janv. 1970 00:00:00" + "'", str75, "1 janv. 1970 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "30 Dec 15601969 00:00:00 GMT" + "'", str81, "30 Dec 15601969 00:00:00 GMT");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate localDate6 = localDate2.minusDays(302);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays((int) '#');
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime25.plusWeeks(5);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        int int39 = dateTime38.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime42.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = dateTime42.plusWeeks(5);
        org.joda.time.Chronology chronology55 = dateTime42.getChronology();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime57 = dateTime42.minus(readablePeriod56);
        int int58 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime57);
        boolean boolean59 = calendar1.after((java.lang.Object) int58);
        java.util.Date date60 = calendar1.getTime();
        boolean boolean61 = calendar1.isWeekDateSupported();
        int int62 = calendar1.getWeeksInWeekYear();
        int int63 = calendar1.getWeeksInWeekYear();
        calendar1.setFirstDayOfWeek(40);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = calendar1.get(358);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 358");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=40,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        long long19 = chronology8.getDateTimeMillis((-1), 8, 2, 17);
        org.joda.time.DurationField durationField20 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology8.clockhourOfHalfday();
        int int23 = dateTimeField22.getMinimumValue();
        java.util.Locale locale28 = new java.util.Locale("", "", "hi!");
        java.util.Locale locale29 = java.util.Locale.US;
        java.lang.String str30 = locale29.toLanguageTag();
        java.lang.String str31 = locale29.getDisplayVariant();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale32);
        java.lang.String str34 = locale32.getCountry();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property40 = dateTime39.hourOfDay();
        java.lang.String str41 = property40.getAsShortText();
        org.joda.time.MonthDay monthDay42 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay44 = monthDay42.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField46 = monthDay44.getField((int) (byte) 0);
        java.util.Locale locale50 = new java.util.Locale("", "", "hi!");
        int int51 = dateTimeField46.getMaximumTextLength(locale50);
        long long54 = dateTimeField46.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay55 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay57 = monthDay55.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.MonthDay monthDay59 = monthDay55.minus(readablePeriod58);
        org.joda.time.MonthDay monthDay60 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay62 = monthDay60.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField64 = monthDay62.getField((int) (byte) 0);
        java.util.Locale locale68 = new java.util.Locale("", "", "hi!");
        int int69 = dateTimeField64.getMaximumTextLength(locale68);
        java.lang.String str70 = dateTimeField46.getAsShortText((org.joda.time.ReadablePartial) monthDay55, locale68);
        int int71 = property40.getMaximumTextLength(locale68);
        java.lang.String str72 = locale32.getDisplayVariant(locale68);
        java.util.Locale locale76 = new java.util.Locale("Nov", "ja", "2 Apr 2104 08:59:23 GMT");
        java.lang.String str77 = locale68.getDisplayScript(locale76);
        java.lang.String str78 = locale29.getDisplayScript(locale76);
        java.lang.String str79 = locale28.getDisplayScript(locale29);
        java.lang.String str80 = dateTimeField22.getAsShortText(5907461382676800000L, locale29);
        long long82 = dateTimeField22.remainder((long) 2175);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62180539199983L) + "'", long19 == (-62180539199983L));
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en-US" + "'", str30, "en-US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1644572699664,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=664,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "3" + "'", str41, "3");
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 9L + "'", long54 == 9L);
        org.junit.Assert.assertNotNull(monthDay57);
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(monthDay62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Feb" + "'", str70, "Feb");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals(locale76.toString(), "nov_JA_2 Apr 2104 08:59:23 GMT");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "12" + "'", str80, "12");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 2175L + "'", long82 == 2175L);
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime12 = dateTime7.plusSeconds(13);
        org.joda.time.DateTime dateTime14 = dateTime7.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.LocalTime localTime15 = dateTime7.toLocalTime();
        boolean boolean16 = dateTime7.isEqualNow();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long24 = dateTimeZone20.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj17, dateTimeZone20);
        long long28 = dateTimeZone20.convertLocalToUTC(1644591907046L, false);
        org.joda.time.DateTime dateTime29 = dateTime7.toDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-187199987L) + "'", long24 == (-187199987L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1644404707046L + "'", long28 == 1644404707046L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = property13.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) '#');
        int int20 = dateTime17.getWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime17.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime17.plus(readablePeriod23);
        int int25 = property13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = property13.addToCopy((long) 11);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("fr");
        java.lang.String str30 = property13.getAsShortText(locale29);
        boolean boolean31 = property13.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property13.getFieldType();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19" + "'", str14, "19");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19" + "'", str30, "19");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime2.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean19 = dateTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusDays((int) '#');
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime22.toDateTime(dateTimeZone29);
        org.joda.time.DateTime.Property property33 = dateTime22.centuryOfEra();
        java.lang.String str34 = property33.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) '#');
        int int40 = dateTime37.getWeekyear();
        org.joda.time.DateTime dateTime42 = dateTime37.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime44 = dateTime37.plus(readablePeriod43);
        int int45 = property33.compareTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.days();
        java.lang.String str47 = durationFieldType46.toString();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property53 = dateTime52.hourOfDay();
        org.joda.time.DateTime dateTime55 = dateTime52.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology60 = chronology56.withZone(dateTimeZone59);
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.now(chronology60);
        org.joda.time.DurationField durationField62 = chronology60.seconds();
        boolean boolean63 = durationFieldType46.isSupported(chronology60);
        org.joda.time.DateTime dateTime65 = dateTime44.withFieldAdded(durationFieldType46, 11);
        boolean boolean66 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property67 = dateTime2.minuteOfDay();
        int int68 = property67.getMaximumValueOverall();
        org.joda.time.DateTime dateTime69 = property67.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19" + "'", str34, "19");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "days" + "'", str47, "days");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1439 + "'", int68 == 1439);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) 0);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays((int) '#');
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime7.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = dateTime7.plusWeeks(5);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear(52);
        org.joda.time.DateTime.Property property22 = dateTime19.secondOfDay();
        org.joda.time.DateTime.Property property23 = dateTime19.secondOfMinute();
        org.joda.time.DateTime dateTime24 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        int int25 = dateTime24.getMillisOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withYearOfCentury(23);
        java.util.GregorianCalendar gregorianCalendar28 = dateTime24.toGregorianCalendar();
        gregorianCalendar28.set(19005, 7, 7200000, 211, 16);
        gregorianCalendar28.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar28.set(1162, 14403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 14399999 + "'", int25 == 14399999);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime.Property property9 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property10 = dateTime4.year();
        int int11 = dateTime4.getMinuteOfDay();
        int int12 = dateTime4.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(43199999);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        long long14 = dateTimeZone9.convertLocalToUTC((long) 4, false, (long) 5);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        java.lang.String str19 = locale17.getCountry();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.lang.String str22 = dateTimeZone9.getShortName((long) 20, locale17);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays((int) '#');
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.DateTime.Property property36 = dateTime25.centuryOfEra();
        java.lang.String str37 = property36.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusDays((int) '#');
        int int43 = dateTime40.getWeekyear();
        org.joda.time.DateTime dateTime45 = dateTime40.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime40.plus(readablePeriod46);
        int int48 = property36.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.minus(readableDuration49);
        org.joda.time.DateTime dateTime52 = dateTime50.plusMinutes(4);
        int int53 = dateTime50.getEra();
        int int54 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone9);
        long long57 = dateTimeZone9.previousTransition(39659999L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter2.withZone(dateTimeZone9);
        java.lang.Integer int59 = dateTimeFormatter58.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withOffsetParsed();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-187199996L) + "'", long14 == (-187199996L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1644572699785,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=59,MILLISECOND=785,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+52:00" + "'", str22, "+52:00");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "19" + "'", str37, "19");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 187200000 + "'", int54 == 187200000);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 39659999L + "'", long57 == 39659999L);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
        java.util.Locale locale3 = new java.util.Locale("292278993-02-10T00:00:00.000+52:00", "2022-12-31", "2023-01-13T13:36:59.417+52:00");
        org.junit.Assert.assertEquals(locale3.toString(), "292278993-02-10t00:00:00.000+52:00_2022-12-31_2023-01-13T13:36:59.417+52:00");
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Etats-Unis");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray14 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray28 = new java.lang.String[] { "fr", "", "--01-01", "hi!", "23", "", "23" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(14400004);
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale37.getLanguage();
        java.lang.String str39 = locale37.getDisplayLanguage();
        boolean boolean40 = dateTimeZone36.equals((java.lang.Object) locale37);
        java.util.Set<java.lang.String> strSet41 = locale37.getUnicodeLocaleAttributes();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("fra");
        java.lang.String[] strArray72 = new java.lang.String[] { "11 f\351vr. 2022 09:35:18", "2022-08-11", "ISOChronology[Etc/UTC]", "23", "1-gen-1970 0.00.00", "en", "de-DE", "en", "11 f\351vr. 2022 09:35:17", "--02-13", "10", "1969-12-31T23:59:59.999Z", "fr", "0052-01-03T03:59:59.999+52:00", "millisOfDay", "February", "11 f\351vr. 2022 09:35:18", "year", "\u4e00\u6708", "Sat Dec 21 00:59:00 UTC 34791", "2022-02-13", "2022-08-13", "35", "11-feb-2022 9.35.23", "4", "2022-08-13", "+00:00:00.010", "+97:01" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList43, (java.util.Collection<java.lang.String>) strList73, filteringMode75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strSet41, filteringMode75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList77);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "it" + "'", str38, "it");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "italien" + "'", str39, "italien");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode75.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.plus(readablePeriod16);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMillis(2022);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays((int) '#');
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime23.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime35 = dateTime23.plusWeeks(5);
        org.joda.time.Chronology chronology36 = dateTime23.getChronology();
        org.joda.time.Chronology chronology37 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime20.withChronology(chronology37);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(5907399684280970662L, chronology37);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology37);
        int int41 = dateTime40.getYearOfCentury();
        long long42 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateMidnight dateMidnight43 = dateTime40.toDateMidnight();
        org.joda.time.DateTime dateTime45 = dateTime40.plusMonths(11);
        org.joda.time.DateTime dateTime47 = dateTime45.minusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property54 = dateTime53.hourOfDay();
        org.joda.time.DateTime dateTime56 = dateTime53.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology57 = dateTime56.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology61 = chronology57.withZone(dateTimeZone60);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) (byte) 1, dateTimeZone60);
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate(dateTimeZone60);
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder65.setExtension('u', "en-US");
        java.util.Locale locale69 = builder68.build();
        java.lang.String str70 = dateTimeZone60.getName((long) (short) 0, locale69);
        org.joda.time.DateTime dateTime71 = dateTime47.withZone(dateTimeZone60);
        org.joda.time.DateTime dateTime73 = dateTime47.plusMinutes(796387);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11" + "'", str11, "11");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 22 + "'", int41 == 22);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 89L + "'", long42 == 89L);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+97:01" + "'", str70, "+97:01");
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay((int) 'x', (int) ' ', 0);
        java.util.Calendar.Builder builder11 = builder3.setTimeOfDay((int) (short) -1, 0, 2730);
        java.util.Calendar.Builder builder15 = builder3.setWeekDate((int) (byte) 1, 187200000, 1);
        java.util.Calendar calendar16 = builder15.build();
        // The following exception was thrown during execution in test generation
        try {
            calendar16.roll(225, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=113156424315930000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=3587754,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=124,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=45,SECOND=30,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MonthDay monthDay2 = new org.joda.time.MonthDay(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.MonthDay monthDay12 = monthDay2.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfDay();
        boolean boolean15 = durationFieldType0.isSupported(chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology11.getDateTimeMillis(48999000L, (int) (byte) 0, 357, 1439, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 357 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        org.joda.time.Chronology chronology3 = monthDay1.getChronology();
        org.joda.time.Chronology chronology4 = monthDay1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.halfdayOfDay();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-03" + "'", str2, "--01-03");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.set((-1), 0, 32770, (int) 'u', (int) (byte) -1, 1439);
        int int11 = calendar1.getMinimalDaysInFirstWeek();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("fr");
        boolean boolean14 = calendar1.before((java.lang.Object) "fr");
        calendar1.clear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 4, dateTimeZone19);
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeZone19.getShortName((long) 0, locale22);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property26 = monthDay25.monthOfYear();
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale28.getLanguage();
        java.lang.String str30 = locale27.getDisplayScript(locale28);
        int int31 = property26.getMaximumTextLength(locale27);
        org.joda.time.DurationField durationField32 = property26.getDurationField();
        int int33 = property26.getMinimumValue();
        java.util.Locale locale34 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(locale34);
        java.lang.String str36 = locale34.getDisplayVariant();
        boolean boolean37 = property26.equals((java.lang.Object) str36);
        java.util.Locale.Category category38 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale39 = java.util.Locale.getDefault(category38);
        java.util.Locale.setDefault(locale39);
        java.util.Locale locale41 = locale39.stripExtensions();
        int int42 = property26.getMaximumTextLength(locale39);
        java.lang.String str43 = locale22.getDisplayCountry(locale39);
        java.lang.String str44 = dateTimeField14.getAsShortText(0L, locale39);
        java.lang.String str45 = locale39.getDisplayLanguage();
        java.lang.String str46 = locale39.getDisplayName();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+52:00" + "'", str23, "+52:00");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "it" + "'", str29, "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category38.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "janv." + "'", str44, "janv.");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "fran\347ais" + "'", str45, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fran\347ais" + "'", str46, "fran\347ais");
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime9 = property5.addToCopy((long) 239);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        int int13 = property5.getDifference((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate15 = dateTime14.toLocalDate();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDate15.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-16812840) + "'", int13 == (-16812840));
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setTimeInMillis((long) 32769);
        calendar1.setMinimalDaysInFirstWeek(2022);
        int int9 = calendar1.getActualMaximum(1);
        calendar1.roll((int) (short) 1, 2730);
        java.util.Date date13 = calendar1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar1.getActualMaximum(86399998);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 86399998");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=86150476832769,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=2022,ERA=1,YEAR=4700,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=769,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292278994 + "'", int9 == 292278994);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Jan 01 00:00:32 UTC 4700");
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        java.lang.String str9 = property2.getAsShortText();
        org.joda.time.MonthDay monthDay11 = property2.addToCopy(2);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusDays((int) (short) 100);
        int int14 = monthDay13.size();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.MonthDay monthDay16 = monthDay13.plus(readablePeriod15);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = monthDay16.getFields();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = monthDay16.toString("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "janv." + "'", str9, "janv.");
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusDays((int) 'u');
        int int10 = dateTime4.getYearOfEra();
        org.joda.time.DateTime dateTime12 = dateTime4.plusMillis(4);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        org.joda.time.LocalDate.Property property18 = localDate15.dayOfMonth();
        org.joda.time.LocalDate localDate19 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime12.withFields((org.joda.time.ReadablePartial) localDate19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfYear(100);
        org.joda.time.Interval interval26 = localDate25.toInterval();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        java.lang.String str28 = durationFieldType27.getName();
        org.joda.time.LocalDate localDate30 = localDate25.withFieldAdded(durationFieldType27, 32770);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate25.plus(readablePeriod31);
        int int33 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate.Property property34 = localDate25.weekyear();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfCentury((int) '#');
        org.joda.time.LocalDate localDate41 = localDate37.minusYears(32769);
        org.joda.time.LocalDate.Property property42 = localDate37.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property42.getFieldType();
        org.joda.time.LocalDate localDate45 = localDate25.withField(dateTimeFieldType43, 364);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusDays((int) '#');
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtStartOfDay(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime48.toDateTime(dateTimeZone55);
        org.joda.time.DateTime.Property property59 = dateTime48.centuryOfEra();
        java.lang.String str60 = dateTime48.toString();
        int int61 = dateTime48.getDayOfYear();
        int int62 = dateTime48.getHourOfDay();
        org.joda.time.DateTime dateTime63 = localDate25.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        int int64 = dateTime48.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "days" + "'", str28, "days");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-03T03:59:59.999+52:00" + "'", str60, "1970-01-03T03:59:59.999+52:00");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 59 + "'", int64 == 59);
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        java.lang.String str25 = chronology20.toString();
        boolean boolean26 = dateTime4.equals((java.lang.Object) str25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar28 = dateTime4.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime4.plusSeconds(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter33.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) '#');
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime37.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = dateTime37.plusWeeks(5);
        org.joda.time.Chronology chronology50 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter33.withChronology(chronology50);
        org.joda.time.DateTime dateTime52 = dateTime30.toDateTime(chronology50);
        int int53 = dateTime30.getSecondOfMinute();
        org.joda.time.DateTime.Property property54 = dateTime30.era();
        java.lang.String str55 = property54.getAsText();
        org.joda.time.DateTime dateTime56 = property54.withMinimumValue();
        java.lang.String str57 = property54.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property54.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime60 = property54.addToCopy(218L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[+52:00]" + "'", str25, "ISOChronology[+52:00]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ap. J.-C." + "'", str55, "ap. J.-C.");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1" + "'", str57, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.plus((long) (-292275054));
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis(92);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        java.util.Date date11 = new java.util.Date(0, 0, (int) '4');
        date11.setDate(12);
        date11.setHours(2922789);
        date11.setTime(9L);
        java.util.Date date21 = new java.util.Date(0, 0, (int) '4');
        int int22 = date21.getHours();
        boolean boolean23 = date11.before(date21);
        int int24 = date11.getDay();
        calendar1.setTime(date11);
        java.util.Date date31 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        int int32 = date31.getYear();
        boolean boolean33 = date11.before(date31);
        int int34 = date31.getMonth();
        java.time.Instant instant35 = date31.toInstant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date21.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2730 + "'", int32 == 2730);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(instant35);
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate.Property property11 = localDate7.weekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.LocalDate localDate14 = dateTime13.toLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDate localDate18 = localDate14.withFieldAdded(durationFieldType16, 11);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withDayOfYear(100);
        org.joda.time.LocalDate.Property property24 = localDate21.dayOfMonth();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.LocalDate localDate27 = property24.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localDate27.getFields();
        org.joda.time.LocalDate localDate30 = localDate27.minusYears(2730);
        int int31 = localDate27.getMonthOfYear();
        org.joda.time.LocalDate.Property property32 = localDate27.yearOfEra();
        org.joda.time.LocalDate localDate33 = localDate14.withFields((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate.Property property34 = localDate33.dayOfWeek();
        int int35 = property34.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.lang.String str3 = property2.getAsText();
        int int4 = property2.get();
        int int5 = property2.getMinimumValueOverall();
        int int6 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "janvier" + "'", str3, "janvier");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        java.lang.String str12 = property11.getAsShortText();
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        java.util.Locale locale21 = new java.util.Locale("", "", "hi!");
        int int22 = dateTimeField17.getMaximumTextLength(locale21);
        long long25 = dateTimeField17.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay26 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay28 = monthDay26.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.MonthDay monthDay30 = monthDay26.minus(readablePeriod29);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField35 = monthDay33.getField((int) (byte) 0);
        java.util.Locale locale39 = new java.util.Locale("", "", "hi!");
        int int40 = dateTimeField35.getMaximumTextLength(locale39);
        java.lang.String str41 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) monthDay26, locale39);
        int int42 = property11.getMaximumTextLength(locale39);
        org.joda.time.DateTimeField dateTimeField43 = property11.getField();
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        int int46 = property11.getMaximumTextLength(locale44);
        boolean boolean47 = locale44.hasExtensions();
        java.lang.String str48 = locale44.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter3.withLocale(locale44);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter3.withPivotYear(73);
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter52.getParser();
        boolean boolean54 = dateTimeFormatter52.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.parse("25 janv. 1062 19:00:00", dateTimeFormatter52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(monthDay30);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feb" + "'", str41, "Feb");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1644572700173,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=45,SECOND=0,MILLISECOND=173,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNull(dateTimeParser53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate.Property property10 = localDate4.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property10.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime4.toMutableDateTimeISO();
        java.lang.String str14 = dateTime4.toString("1");
        org.joda.time.DateTime dateTime16 = dateTime4.withMinuteOfHour(7);
        int int17 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withDayOfYear(117);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11279 + "'", int17 == 11279);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology8.add(readablePeriod15, (long) 32, (int) (byte) 0);
        org.joda.time.DurationField durationField19 = chronology8.seconds();
        org.joda.time.Chronology chronology20 = chronology8.withUTC();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate4.withYearOfEra(32769);
        org.joda.time.LocalDate localDate15 = localDate4.minusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(100);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime16.toGregorianCalendar();
        org.joda.time.DateTime dateTime22 = dateTime16.minusMonths(17);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.plus(readablePeriod26);
        int int28 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime27);
        java.util.Locale locale29 = null;
        java.util.Calendar calendar30 = dateTime16.toCalendar(locale29);
        // The following exception was thrown during execution in test generation
        try {
            calendar30.roll(28, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(gregorianCalendar20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(calendar30);
        org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1649448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=8,DAY_OF_YEAR=98,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        java.util.Date date1 = new java.util.Date((long) (short) 0);
        date1.setMinutes((-3600000));
        org.junit.Assert.assertEquals(date1.toString(), "Wed Feb 27 00:00:00 UTC 1963");
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        int int15 = localDate7.getYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withPivotYear(70);
        boolean boolean22 = localDate7.equals((java.lang.Object) 70);
        int int23 = localDate7.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weeks();
        boolean boolean25 = localDate7.isSupported(durationFieldType24);
        java.lang.String str26 = durationFieldType24.getName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "weeks" + "'", str26, "weeks");
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        org.joda.time.LocalDate localDate11 = property5.getLocalDate();
        org.joda.time.LocalDate localDate12 = property5.withMinimumValue();
        int int13 = property5.getMinimumValue();
        org.joda.time.LocalDate localDate15 = property5.addWrapFieldToCopy(622);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalDate localDate21 = localDate18.plusMonths(0);
        int int22 = localDate18.getDayOfMonth();
        org.joda.time.LocalDate localDate24 = localDate18.withWeekOfWeekyear(46);
        org.joda.time.LocalDate.Property property25 = localDate18.dayOfYear();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfYear(100);
        org.joda.time.Interval interval32 = localDate31.toInterval();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.days();
        java.lang.String str34 = durationFieldType33.getName();
        org.joda.time.LocalDate localDate36 = localDate31.withFieldAdded(durationFieldType33, 32770);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate31.plus(readablePeriod37);
        org.joda.time.LocalDate localDate40 = localDate38.withDayOfMonth(23);
        java.util.Locale locale41 = java.util.Locale.UK;
        boolean boolean42 = localDate38.equals((java.lang.Object) locale41);
        java.lang.String str43 = locale41.getScript();
        java.lang.String str44 = localDate18.toString("1969-02-27", locale41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 229 + "'", int19 == 229);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "days" + "'", str34, "days");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1969-02-27" + "'", str44, "1969-02-27");
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        org.joda.time.LocalDate localDate11 = property5.getLocalDate();
        org.joda.time.LocalDate localDate12 = property5.roundCeilingCopy();
        java.lang.String str13 = property5.toString();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withDayOfYear(100);
        int int19 = localDate16.size();
        org.joda.time.LocalDate localDate21 = localDate16.plusMonths(6);
        int int23 = localDate21.getValue(0);
        java.lang.String str24 = localDate21.toString();
        org.joda.time.LocalDate localDate26 = localDate21.withWeekyear(1);
        org.joda.time.LocalDate localDate28 = localDate21.withDayOfYear((int) (byte) 1);
        int int29 = localDate21.getYear();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.withDayOfYear(100);
        int int35 = localDate32.size();
        org.joda.time.LocalDate localDate37 = localDate32.plusMonths(6);
        int int39 = localDate37.getValue(0);
        boolean boolean40 = localDate21.equals((java.lang.Object) int39);
        org.joda.time.LocalDate localDate42 = localDate21.withDayOfYear((int) (short) 100);
        org.joda.time.LocalTime localTime43 = null;
        org.joda.time.DateTime dateTime44 = localDate21.toDateTime(localTime43);
        long long45 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate localDate46 = property5.roundHalfCeilingCopy();
        java.lang.String str47 = property5.toString();
        org.joda.time.LocalDate localDate49 = property5.setCopy(9);
        org.joda.time.LocalDate localDate50 = property5.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[dayOfMonth]" + "'", str13, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-08-13" + "'", str24, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-179L) + "'", long45 == (-179L));
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Property[dayOfMonth]" + "'", str47, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate50);
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter2.getZone();
        boolean boolean50 = dateTimeFormatter2.isParser();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572700355,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=45,SECOND=0,MILLISECOND=355,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }
}
