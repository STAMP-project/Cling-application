import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 0);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.minusMinutes(1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfYear();
        org.joda.time.DateTime dateTime12 = property11.roundHalfCeilingCopy();
        boolean boolean13 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime1.plusHours(6);
        org.joda.time.DateTime dateTime17 = dateTime1.minus((-1L));
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime19 = property18.roundFloorCopy();
        int int20 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime24 = dateTime21.withYearOfEra(292275055);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime27.minusDays((int) 'a');
        org.joda.time.DateTime dateTime31 = dateTime27.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay32 = dateTime31.toYearMonthDay();
        org.joda.time.Chronology chronology33 = yearMonthDay32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        java.lang.String str35 = chronology33.toString();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.year();
        org.joda.time.DurationField durationField38 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField39 = chronology33.minuteOfDay();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance();
        calendar40.setTimeInMillis(100L);
        boolean boolean43 = calendar40.isWeekDateSupported();
        calendar40.roll(2, false);
        calendar40.setTimeInMillis(0L);
        java.util.TimeZone timeZone49 = calendar40.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        int int53 = dateTimeZone51.getOffsetFromLocal((long) (short) 0);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance();
        calendar54.setTimeInMillis(100L);
        boolean boolean57 = calendar54.isWeekDateSupported();
        calendar54.roll(2, false);
        calendar54.setTimeInMillis(0L);
        java.util.TimeZone timeZone63 = calendar54.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        long long66 = dateTimeZone51.getMillisKeepLocal(dateTimeZone64, (long) 2);
        long long69 = dateTimeZone64.adjustOffset((long) (short) 100, false);
        int int71 = dateTimeZone64.getOffset(310L);
        org.joda.time.Chronology chronology72 = chronology33.withZone(dateTimeZone64);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((-1644573600L), chronology33);
        org.joda.time.DateTime dateTime74 = dateTime24.withChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField75 = chronology33.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime74", (dateTime24.compareTo(dateTime74) == 0) == dateTime24.equals(dateTime74));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 10, 0, (int) (short) 0, (int) 'a', chronology4);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 10, 0, (int) (short) 0, (int) 'a', chronology12);
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.lang.String str20 = dateTimeField15.getAsText(32770, locale17);
        java.lang.String str22 = dateTimeField15.getAsText((long) (short) 0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 100, chronology24);
        int int26 = localTime25.getMillisOfSecond();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) 100, chronology28);
        boolean boolean30 = localTime25.isAfter((org.joda.time.ReadablePartial) localTime29);
        int int31 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localTime25);
        java.lang.String str32 = dateTimeField15.getName();
        java.util.Date date38 = new java.util.Date(0, (int) (short) 1, (int) ' ', (int) (byte) -1, 17);
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromDateFields(date38);
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale41.getISO3Country();
        java.lang.String str43 = dateTimeField15.getAsText((org.joda.time.ReadablePartial) localTime39, (int) 'a', locale41);
        java.lang.String str44 = property6.getAsText(locale41);
        org.joda.time.LocalTime localTime46 = property6.addCopy(0L);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 10, 0, (int) (short) 0, (int) 'a', chronology51);
        org.joda.time.LocalTime.Property property53 = localTime52.millisOfSecond();
        org.joda.time.LocalTime localTime54 = property53.withMaximumValue();
        int int56 = localTime54.getValue(0);
        java.lang.String str57 = localTime54.toString();
        org.joda.time.LocalTime localTime59 = localTime54.minusSeconds(12);
        boolean boolean60 = localTime46.equals((java.lang.Object) localTime54);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalTime localTime62 = localTime46.plus(readablePeriod61);
        org.joda.time.LocalTime.Property property63 = localTime46.minuteOfHour();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime dateTime67 = dateTime65.minusMonths((int) ' ');
        org.joda.time.DateTime dateTime69 = dateTime65.withYear(1);
        org.joda.time.DateTime dateTime70 = localTime46.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime72 = dateTime69.withWeekyear(139680);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime((long) 100, chronology74);
        int int76 = localTime75.getMillisOfSecond();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime((long) 100, chronology78);
        boolean boolean80 = localTime75.isAfter((org.joda.time.ReadablePartial) localTime79);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology82 = null;
        boolean boolean83 = dateTimeFieldType81.isSupported(chronology82);
        int int84 = localTime75.indexOf(dateTimeFieldType81);
        org.joda.time.Chronology chronology85 = localTime75.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.era();
        org.joda.time.DateTimeField dateTimeField87 = chronology85.monthOfYear();
        org.joda.time.DateTime dateTime88 = dateTime72.toDateTime(chronology85);
        java.lang.String str89 = chronology85.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime72 and dateTime88", (dateTime72.compareTo(dateTime88) == 0) == dateTime72.equals(dateTime88));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) 'a');
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.setTimeInMillis(100L);
        boolean boolean9 = calendar6.isWeekDateSupported();
        calendar6.roll(2, false);
        calendar6.setTimeInMillis(0L);
        java.util.TimeZone timeZone15 = calendar6.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        int int19 = dateTimeZone17.getOffsetFromLocal((long) 0);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) 999, dateTimeZone17);
        java.lang.String str21 = dateTimeZone17.getID();
        org.joda.time.DateTime dateTime22 = dateTime4.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime24 = dateTime4.withCenturyOfEra(0);
        org.joda.time.DateTime.Property property25 = dateTime4.era();
        org.joda.time.DateTime.Property property26 = dateTime4.secondOfMinute();
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        org.joda.time.DateTime dateTime29 = property26.setCopy("10", locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.lang.String str1 = calendar0.getCalendarType();
        calendar0.roll((int) (short) 0, 4);
        calendar0.setFirstDayOfWeek((-1));
        boolean boolean7 = calendar0.isWeekDateSupported();
        int int9 = calendar0.getGreatestMinimum(6);
        calendar0.setMinimalDaysInFirstWeek(30);
        java.util.Date date12 = calendar0.getTime();
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((int) (byte) 10, 0, (int) (short) 0, (int) 'a', chronology18);
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.lang.String str26 = dateTimeField21.getAsText(32770, locale23);
        java.lang.String str28 = dateTimeField21.getAsText((long) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) 100, chronology30);
        int int32 = localTime31.getMillisOfSecond();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 100, chronology34);
        boolean boolean36 = localTime31.isAfter((org.joda.time.ReadablePartial) localTime35);
        int int37 = dateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) localTime31);
        java.lang.String str38 = dateTimeField21.getName();
        java.util.Date date44 = new java.util.Date(0, (int) (short) 1, (int) ' ', (int) (byte) -1, 17);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromDateFields(date44);
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localTime45, (int) 'a', locale47);
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.lang.String str51 = locale47.getDisplayLanguage(locale50);
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale54.getISO3Country();
        java.lang.String str56 = locale54.toLanguageTag();
        java.util.Locale locale57 = java.util.Locale.ITALY;
        java.lang.String str58 = locale54.getDisplayCountry(locale57);
        java.lang.String str59 = locale53.getDisplayVariant(locale54);
        java.lang.String str60 = locale52.getDisplayScript(locale54);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(locale54);
        java.lang.String str62 = locale50.getDisplayName(locale54);
        java.util.Calendar.Builder builder63 = builder13.setLocale(locale54);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance();
        calendar64.setTimeInMillis(100L);
        boolean boolean67 = calendar64.isWeekDateSupported();
        calendar64.roll(2, false);
        calendar64.setTimeInMillis(0L);
        java.util.TimeZone timeZone73 = calendar64.getTimeZone();
        java.util.Calendar.Builder builder74 = builder13.setTimeZone(timeZone73);
        calendar0.setTimeZone(timeZone73);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar61", (calendar0.compareTo(calendar61) == 0) == calendar0.equals(calendar61));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(2L);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(100L);
        boolean boolean5 = calendar2.isWeekDateSupported();
        calendar2.roll(2, false);
        calendar2.setTimeInMillis(0L);
        java.util.TimeZone timeZone11 = calendar2.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.previousTransition((long) (short) -1);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMonths((int) ' ');
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime21 = property19.addToCopy((long) (short) 0);
        org.joda.time.DateTime dateTime23 = dateTime21.withHourOfDay(6);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTimeISO();
        int int25 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 0);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime dateTime30 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime32 = dateTime28.minusMinutes(1);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfYear();
        org.joda.time.DateTime dateTime34 = property33.roundHalfCeilingCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = dateTime34.toString(dateTimeFormatter35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean38 = dateTime34.isSupported(dateTimeFieldType37);
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType37.getDurationType();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfHour();
        org.joda.time.DateTime dateTime44 = dateTime41.minusDays((int) 'a');
        org.joda.time.DateTime dateTime45 = dateTime41.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay46 = dateTime45.toYearMonthDay();
        org.joda.time.Chronology chronology47 = yearMonthDay46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology47.getZone();
        org.joda.time.DurationField durationField50 = chronology47.days();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = chronology47.dayOfYear();
        boolean boolean53 = durationFieldType39.isSupported(chronology47);
        long long57 = chronology47.add((-1581379253000L), (long) 'u', (int) (short) 1);
        org.joda.time.DateTime dateTime58 = dateTime24.toDateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField59 = chronology47.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime58", (dateTime23.compareTo(dateTime58) == 0) == dateTime23.equals(dateTime58));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter6.isOffsetParsed();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        calendar9.setTimeInMillis(100L);
        boolean boolean12 = calendar9.isWeekDateSupported();
        calendar9.roll(2, false);
        calendar9.setTimeInMillis(0L);
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        int int22 = dateTimeZone20.getOffsetFromLocal((long) (short) 0);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance();
        calendar23.setTimeInMillis(100L);
        boolean boolean26 = calendar23.isWeekDateSupported();
        calendar23.roll(2, false);
        calendar23.setTimeInMillis(0L);
        java.util.TimeZone timeZone32 = calendar23.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        long long35 = dateTimeZone20.getMillisKeepLocal(dateTimeZone33, (long) 2);
        boolean boolean36 = dateTimeZone33.isFixed();
        long long39 = dateTimeZone33.adjustOffset((long) 139680, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter6.withZone(dateTimeZone33);
        int int41 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfHour();
        org.joda.time.DateTime dateTime47 = dateTime44.minusDays((int) 'a');
        org.joda.time.DateTime dateTime48 = dateTime44.toDateTime();
        org.joda.time.DateTime.Property property49 = dateTime44.year();
        int int50 = dateTime44.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        java.lang.String str53 = dateTimeZone52.getID();
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime44.toMutableDateTime(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter42.withZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and mutableDateTime54", (dateTime44.compareTo(mutableDateTime54) == 0) == dateTime44.equals(mutableDateTime54));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.setTimeInMillis(100L);
        boolean boolean4 = calendar1.isWeekDateSupported();
        calendar1.roll(2, false);
        calendar1.setTimeInMillis(0L);
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int14 = dateTimeZone12.getOffsetFromLocal((long) (short) 0);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        calendar15.setTimeInMillis(100L);
        boolean boolean18 = calendar15.isWeekDateSupported();
        calendar15.roll(2, false);
        calendar15.setTimeInMillis(0L);
        java.util.TimeZone timeZone24 = calendar15.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone12.getMillisKeepLocal(dateTimeZone25, (long) 2);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 8, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime31 = dateTime28.withYearOfEra(14);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfHour();
        org.joda.time.DateTime dateTime36 = dateTime33.minusDays((int) 'a');
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int39 = dateTime37.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfHour();
        org.joda.time.DateTime dateTime44 = dateTime41.minusDays((int) 'a');
        org.joda.time.DateTime dateTime45 = dateTime41.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay46 = dateTime45.toYearMonthDay();
        org.joda.time.Chronology chronology47 = yearMonthDay46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology47.getZone();
        org.joda.time.DurationField durationField50 = chronology47.months();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType38.getField(chronology47);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology47.year();
        org.joda.time.DateTimeField dateTimeField54 = chronology47.millisOfDay();
        org.joda.time.DateTime dateTime55 = dateTime31.withChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField56 = chronology47.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime55", (dateTime31.compareTo(dateTime55) == 0) == dateTime31.equals(dateTime55));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(100L);
        boolean boolean3 = calendar0.isWeekDateSupported();
        calendar0.roll(2, false);
        calendar0.setTimeInMillis(0L);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int13 = dateTimeZone11.getOffsetFromLocal((long) (short) 0);
        boolean boolean15 = dateTimeZone11.isStandardOffset((long) 1969);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 10, 0, (int) (short) 0, (int) 'a', chronology20);
        org.joda.time.LocalTime.Property property22 = localTime21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.lang.String str28 = dateTimeField23.getAsText(32770, locale25);
        java.lang.String str30 = dateTimeField23.getAsText((long) (short) 0);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 100, chronology32);
        int int34 = localTime33.getMillisOfSecond();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) 100, chronology36);
        boolean boolean38 = localTime33.isAfter((org.joda.time.ReadablePartial) localTime37);
        int int39 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localTime33);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.fromCalendarFields(calendar40);
        int int42 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTime dateTime43 = localTime41.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withPeriodAdded(readablePeriod44, 36000097);
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        java.lang.String str52 = dateTimeZone50.getName((long) (byte) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        int int55 = dateTimeZone50.getStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime56 = dateTime48.withZoneRetainFields(dateTimeZone50);
        org.joda.time.DateTime.Property property57 = dateTime56.year();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property60 = dateTime59.minuteOfHour();
        org.joda.time.DateTime dateTime62 = dateTime59.minusDays((int) 'a');
        org.joda.time.DateTime dateTime63 = dateTime59.toDateTime();
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(3);
        int int66 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime68 = dateTime63.plusYears(11);
        java.util.GregorianCalendar gregorianCalendar69 = dateTime63.toGregorianCalendar();
        org.joda.time.DateTime.Property property70 = dateTime63.yearOfEra();
        long long71 = property70.remainder();
        org.joda.time.DateTimeField dateTimeField72 = property70.getField();
        org.joda.time.DateTime dateTime74 = property70.addToCopy(56);
        boolean boolean75 = dateTime56.isBefore((org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.DateTime dateTime77 = dateTime56.minusSeconds(0);
        int int78 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and gregorianCalendar69", (calendar0.compareTo(gregorianCalendar69) == 0) == calendar0.equals(gregorianCalendar69));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.setTimeInMillis(100L);
        boolean boolean4 = calendar1.isWeekDateSupported();
        calendar1.roll(2, false);
        calendar1.setTimeInMillis(0L);
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int14 = dateTimeZone12.getOffsetFromLocal((long) (short) 0);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        calendar15.setTimeInMillis(100L);
        boolean boolean18 = calendar15.isWeekDateSupported();
        calendar15.roll(2, false);
        calendar15.setTimeInMillis(0L);
        java.util.TimeZone timeZone24 = calendar15.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone12.getMillisKeepLocal(dateTimeZone25, (long) 2);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 8, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTimeISO();
        boolean boolean30 = dateTime28.isAfterNow();
        org.joda.time.DateTime dateTime32 = dateTime28.withMillis(100L);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 0);
        int int35 = dateTime34.getEra();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime38 = dateTime34.minusMinutes(1);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfYear();
        org.joda.time.DateTime dateTime40 = property39.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.minus(readablePeriod41);
        boolean boolean43 = dateTime28.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = dateTime28.withZoneRetainFields(dateTimeZone44);
        boolean boolean47 = dateTime45.isAfter(32L);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMonths((int) ' ');
        org.joda.time.DateTime.Property property52 = dateTime49.weekyear();
        org.joda.time.DateTime dateTime54 = property52.addToCopy((long) (short) 0);
        org.joda.time.DateTime dateTime56 = dateTime54.withHourOfDay(6);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime58 = dateTime54.minus(readablePeriod57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.withZone(dateTimeZone59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime63 = dateTime60.withField(dateTimeFieldType61, 1);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime.Property property66 = dateTime65.minuteOfHour();
        org.joda.time.DateTime dateTime68 = dateTime65.minusDays((int) 'a');
        org.joda.time.DateTime dateTime69 = dateTime65.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay70 = dateTime69.toYearMonthDay();
        org.joda.time.Chronology chronology71 = yearMonthDay70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.secondOfDay();
        org.joda.time.DurationField durationField73 = chronology71.eras();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType61.getField(chronology71);
        org.joda.time.DateTimeField dateTimeField76 = chronology71.dayOfYear();
        org.joda.time.DateTime dateTime77 = dateTime45.withChronology(chronology71);
        org.joda.time.DateTimeField dateTimeField78 = chronology71.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and dateTime77", (dateTime45.compareTo(dateTime77) == 0) == dateTime45.equals(dateTime77));
    }
}

