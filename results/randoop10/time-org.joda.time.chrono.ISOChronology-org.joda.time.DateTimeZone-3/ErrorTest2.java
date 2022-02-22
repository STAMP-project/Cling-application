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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime.Property property24 = dateTime22.minuteOfHour();
        org.joda.time.Chronology chronology25 = dateTime22.getChronology();
        long long26 = dateTime22.getMillis();
        java.lang.String str27 = dateTime22.toString();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = iSOChronology28.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(1);
        org.joda.time.LocalDate localDate39 = localDate37.plusMonths((int) '#');
        int int40 = localDate39.getMonthOfYear();
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate43 = localDate39.minusYears(0);
        boolean boolean44 = dateTimeZone32.equals((java.lang.Object) 0);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long49 = dateTimeZone47.previousTransition((long) (-1));
        long long53 = dateTimeZone47.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale55 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str56 = dateTimeZone47.getShortName((long) '#', locale55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime59 = dateTime57.minusHours((int) (short) 100);
        int int60 = dateTime57.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property61 = dateTime57.monthOfYear();
        org.joda.time.DateTime dateTime62 = property61.withMinimumValue();
        org.joda.time.DateTime dateTime63 = property61.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((java.lang.Object) dateTime63, dateTimeZone65);
        org.joda.time.DateTime dateTime67 = dateTime45.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime22.toDateTime(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime45", (dateTime11.compareTo(dateTime45) == 0) == dateTime11.equals(dateTime45));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.Interval interval7 = property5.toInterval();
        org.joda.time.DurationField durationField8 = property5.getDurationField();
        org.joda.time.DurationField durationField9 = property5.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField10 = property5.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField9", (durationField1.compareTo(durationField9) == 0) == durationField1.equals(durationField9));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(99);
        org.joda.time.Chronology chronology6 = iSOChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology0.add(readablePeriod11, 1642071420000L, 35);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours((int) (short) 100);
        int int30 = dateTime27.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property31 = dateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime();
        boolean boolean34 = dateTime27.isEqual(0L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long43 = dateTimeZone41.previousTransition((long) (-1));
        long long47 = dateTimeZone41.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale49 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str50 = dateTimeZone41.getShortName((long) '#', locale49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime53 = dateTime51.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime55 = dateTime53.minusDays(35);
        org.joda.time.DateTime dateTime56 = localDate37.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.LocalDate localDate58 = localDate37.withYearOfEra(15);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate60 = localDate37.plus(readablePeriod59);
        int int61 = localDate60.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long65 = dateTimeZone63.previousTransition((long) (-1));
        long long69 = dateTimeZone63.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale71 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str72 = dateTimeZone63.getShortName((long) '#', locale71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime75 = dateTime73.minusHours((int) (short) 100);
        int int76 = dateTime73.getWeekOfWeekyear();
        int int77 = dateTime73.getSecondOfMinute();
        org.joda.time.DateTime dateTime79 = dateTime73.minusMonths((int) (short) 10);
        boolean boolean80 = localDate60.equals((java.lang.Object) dateTime79);
        org.joda.time.DateTime dateTime82 = dateTime79.minus((long) 657);
        int int83 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime85 = dateTime79.minusHours(122);
        int int86 = dateTime79.getWeekyear();
        org.joda.time.DateTime.Property property87 = dateTime79.millisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology88 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField89 = iSOChronology88.weekyears();
        org.joda.time.DurationField durationField90 = iSOChronology88.halfdays();
        org.joda.time.DateTimeField dateTimeField91 = iSOChronology88.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone92 = iSOChronology88.getZone();
        org.joda.time.DateTime dateTime93 = dateTime79.toDateTime(dateTimeZone92);
        org.joda.time.Chronology chronology94 = iSOChronology0.withZone(dateTimeZone92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime79 and dateTime93", (dateTime79.compareTo(dateTime93) == 0) == dateTime79.equals(dateTime93));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(18);
        int int20 = dateTime16.getYearOfEra();
        org.joda.time.DateTime.Property property21 = dateTime16.minuteOfHour();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        int int24 = calendar22.getMinimum(10);
        int int26 = calendar22.getActualMinimum(0);
        calendar22.set(0, (-27424193), 918, 918, 25);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromCalendarFields(calendar22);
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = iSOChronology34.weekyears();
        org.joda.time.DateTimeZone dateTimeZone36 = iSOChronology34.getZone();
        org.joda.time.DurationField durationField37 = iSOChronology34.seconds();
        org.joda.time.DurationField durationField38 = iSOChronology34.halfdays();
        org.joda.time.DurationField durationField39 = iSOChronology34.months();
        boolean boolean40 = calendar22.after((java.lang.Object) iSOChronology34);
        org.joda.time.Chronology chronology41 = iSOChronology34.withUTC();
        org.joda.time.DateTime dateTime42 = dateTime16.withChronology(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime16.plus(3587015L);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) dateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime42", (dateTime16.compareTo(dateTime42) == 0) == dateTime16.equals(dateTime42));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        long long8 = dateTimeZone2.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeZone2.getShortName((long) '#', locale10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        int int15 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property16 = dateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime12.toMutableDateTime();
        boolean boolean19 = dateTime12.isEqual(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long28 = dateTimeZone26.previousTransition((long) (-1));
        long long32 = dateTimeZone26.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = dateTimeZone26.getShortName((long) '#', locale34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime40 = dateTime38.minusDays(35);
        org.joda.time.DateTime dateTime41 = localDate22.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDate localDate43 = localDate22.withYearOfEra(15);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate22.plus(readablePeriod44);
        int int46 = localDate45.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long50 = dateTimeZone48.previousTransition((long) (-1));
        long long54 = dateTimeZone48.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale56 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str57 = dateTimeZone48.getShortName((long) '#', locale56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime60 = dateTime58.minusHours((int) (short) 100);
        int int61 = dateTime58.getWeekOfWeekyear();
        int int62 = dateTime58.getSecondOfMinute();
        org.joda.time.DateTime dateTime64 = dateTime58.minusMonths((int) (short) 10);
        boolean boolean65 = localDate45.equals((java.lang.Object) dateTime64);
        org.joda.time.DateTime dateTime67 = dateTime64.minus((long) 657);
        int int68 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime70 = dateTime64.minusHours(122);
        int int71 = dateTime64.getWeekyear();
        org.joda.time.DateTime.Property property72 = dateTime64.millisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology73 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField74 = iSOChronology73.weekyears();
        org.joda.time.DurationField durationField75 = iSOChronology73.halfdays();
        org.joda.time.DateTimeField dateTimeField76 = iSOChronology73.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone77 = iSOChronology73.getZone();
        org.joda.time.DateTime dateTime78 = dateTime64.toDateTime(dateTimeZone77);
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(1645455442385L, dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and dateTime78", (dateTime64.compareTo(dateTime78) == 0) == dateTime64.equals(dateTime78));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.Instant instant18 = instant15.withDurationAdded((long) (short) 100, 6);
        org.joda.time.Instant instant20 = instant15.withMillis((long) 76);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.minusMonths(38);
        long long24 = dateTime23.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.lang.String str8 = locale5.getDisplayName();
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleAttributes();
        boolean boolean10 = strSet4.containsAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale14 = new java.util.Locale("days");
        java.lang.String str15 = locale12.getDisplayCountry(locale14);
        java.util.Locale.Builder builder16 = builder11.setLocale(locale14);
        java.util.Locale.Builder builder18 = builder11.removeUnicodeLocaleAttribute("100");
        java.util.Locale locale19 = builder11.build();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale19.getDisplayVariant();
        java.util.Locale locale22 = locale19.stripExtensions();
        java.util.Set<java.lang.String> strSet23 = locale19.getUnicodeLocaleAttributes();
        boolean boolean24 = strSet4.containsAll((java.util.Collection<java.lang.String>) strSet23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long28 = dateTimeZone26.previousTransition((long) (-1));
        long long32 = dateTimeZone26.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = dateTimeZone26.getShortName((long) '#', locale34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime40 = dateTime38.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate47 = localDate45.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property48 = localDate45.weekyear();
        java.lang.String str49 = property48.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology50 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField51 = iSOChronology50.weekyears();
        org.joda.time.DateTimeZone dateTimeZone52 = iSOChronology50.getZone();
        boolean boolean53 = property48.equals((java.lang.Object) iSOChronology50);
        org.joda.time.DateTime dateTime54 = dateTime38.toDateTime((org.joda.time.Chronology) iSOChronology50);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long58 = dateTimeZone56.previousTransition((long) (-1));
        long long62 = dateTimeZone56.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale64 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str65 = dateTimeZone56.getShortName((long) '#', locale64);
        java.lang.String str66 = dateTimeZone56.getID();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone56);
        boolean boolean68 = dateTimeZone56.isFixed();
        long long72 = dateTimeZone56.convertLocalToUTC(0L, false, (long) 17);
        org.joda.time.DateTime dateTime73 = dateTime38.toDateTime(dateTimeZone56);
        boolean boolean74 = strSet23.equals((java.lang.Object) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime73 and dateTime54", (dateTime73.compareTo(dateTime54) == 0) == dateTime73.equals(dateTime54));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getShortName((-349199975L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long13 = dateTimeZone11.previousTransition((long) (-1));
        long long17 = dateTimeZone11.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone11.getShortName((long) '#', locale19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays(35);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property27 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime28 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.Instant instant30 = dateTime28.toInstant();
        org.joda.time.Instant instant32 = instant30.minus((long) 955);
        int int33 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant30", (dateTime25.compareTo(instant30) == 0) == dateTime25.equals(instant30));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean23 = dateTime21.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime21.toYearMonthDay();
        int int25 = dateTime21.getYearOfCentury();
        org.joda.time.DateTime.Property property26 = dateTime21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime21.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(464);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime29", (dateTime21.compareTo(dateTime29) == 0) == dateTime21.equals(dateTime29));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        int int12 = dateTimeField9.get(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField10", (durationField1.compareTo(durationField10) == 0) == durationField1.equals(durationField10));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = property9.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone13.previousTransition((long) (-1));
        long long19 = dateTimeZone13.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = dateTimeZone13.getShortName((long) '#', locale21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime25 = dateTime23.minusHours((int) (short) 100);
        int int26 = dateTime23.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property27 = dateTime23.monthOfYear();
        org.joda.time.DateTime dateTime28 = property27.getDateTime();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = iSOChronology33.weekyears();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType31.getField((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DurationField durationField36 = iSOChronology33.hours();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology33.minuteOfHour();
        long long41 = iSOChronology33.add((long) 53655688, (long) 16, 839);
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology33.dayOfWeek();
        org.joda.time.DateTime dateTime43 = dateTime28.toDateTime((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DateTime dateTime44 = dateTime43.withLaterOffsetAtOverlap();
        int int45 = property9.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime44", (dateTime23.compareTo(dateTime44) == 0) == dateTime23.equals(dateTime44));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime23 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.Instant instant25 = dateTime23.toInstant();
        org.joda.time.Instant instant27 = instant25.minus((long) 955);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant25.withDurationAdded(readableDuration28, (-2299));
        org.joda.time.Instant instant32 = instant25.withMillis((long) (-27424193));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant25", (dateTime20.compareTo(instant25) == 0) == dateTime20.equals(instant25));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 0, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        int int10 = calendar8.getMinimum(10);
        calendar8.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        int int15 = localDate14.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = iSOChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField((org.joda.time.Chronology) iSOChronology20);
        org.joda.time.DurationField durationField23 = iSOChronology20.hours();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology20.weekyear();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology20.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology20.yearOfEra();
        long long29 = dateTimeField26.addWrapField((-349199926L), (int) (byte) 1);
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTime dateTime31 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        int int32 = localDate14.getYear();
        int[] intArray34 = iSOChronology1.get((org.joda.time.ReadablePartial) localDate14, (-1356965629999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField7", (durationField5.compareTo(durationField7) == 0) == durationField5.equals(durationField7));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.Instant instant48 = instant16.withMillis((long) 32772);
        boolean boolean50 = instant16.isAfter(1645052400000L);
        org.joda.time.Chronology chronology51 = instant16.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((java.lang.Object) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant22.plus(readableDuration24);
        org.joda.time.Instant instant27 = instant25.withMillis(49589L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = iSOChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType12.getField((org.joda.time.Chronology) iSOChronology14);
        org.joda.time.DurationField durationField17 = iSOChronology14.hours();
        boolean boolean18 = localDate11.equals((java.lang.Object) durationField17);
        boolean boolean19 = localDate6.isBefore((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        java.lang.String str31 = dateTimeZone21.getID();
        org.joda.time.DateTime dateTime32 = localDate6.toDateTimeAtMidnight(dateTimeZone21);
        long long33 = dateTime32.getMillis();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.withZone(dateTimeZone34);
        int int36 = dateTime32.getWeekyear();
        boolean boolean38 = dateTime32.isEqual((-72343413L));
        java.util.Date date39 = dateTime32.toDate();
        java.time.Instant instant40 = date39.toInstant();
        date39.setYear(54098317);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime35", (dateTime32.compareTo(dateTime35) == 0) == dateTime32.equals(dateTime35));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(3);
        int int23 = dateTime22.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        calendar0.set(0, (-27424193), 918, 918, 25);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology12.getZone();
        org.joda.time.DurationField durationField15 = iSOChronology12.seconds();
        org.joda.time.DurationField durationField16 = iSOChronology12.halfdays();
        org.joda.time.DurationField durationField17 = iSOChronology12.months();
        boolean boolean18 = calendar0.after((java.lang.Object) iSOChronology12);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.Chronology chronology21 = iSOChronology12.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField22 = iSOChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField13, and durationField15", !(durationField22.compareTo(durationField13) == 0) || (Math.signum(durationField22.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        java.lang.String str3 = calendar0.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        boolean boolean12 = localDate8.isSupported(durationFieldType11);
        boolean boolean13 = calendar0.after((java.lang.Object) durationFieldType11);
        java.util.TimeZone timeZone14 = calendar0.getTimeZone();
        java.time.Instant instant15 = calendar0.toInstant();
        java.util.TimeZone timeZone16 = calendar0.getTimeZone();
        java.util.Locale locale20 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.TimeZone timeZone22 = calendar21.getTimeZone();
        java.util.TimeZone timeZone23 = calendar21.getTimeZone();
        timeZone23.setID("gioved\354");
        int int26 = timeZone23.getRawOffset();
        java.util.TimeZone.setDefault(timeZone23);
        java.lang.String str28 = timeZone23.getID();
        boolean boolean29 = timeZone16.hasSameRules(timeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = iSOChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology24);
        long long32 = iSOChronology24.add((long) 100, (long) 15, (int) '4');
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology24.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = iSOChronology24.add(readablePeriod34, 55080040L, 789);
        org.joda.time.DurationField durationField38 = iSOChronology24.weeks();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime22.toMutableDateTime((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology24.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and mutableDateTime39", (dateTime22.compareTo(mutableDateTime39) == 0) == dateTime22.equals(mutableDateTime39));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        long long19 = dateTime17.getMillis();
        org.joda.time.Instant instant20 = dateTime17.toInstant();
        int int21 = dateTime17.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant20", (dateTime17.compareTo(instant20) == 0) == dateTime17.equals(instant20));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.LocalDate localDate28 = dateTime26.toLocalDate();
        org.joda.time.LocalDate localDate30 = localDate28.withEra(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.withEra(1);
        int int41 = localDate35.compareTo((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.LocalDate localDate43 = localDate35.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate.Property property44 = localDate43.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean47 = dateTimeZone45.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long51 = dateTimeZone45.getMillisKeepLocal(dateTimeZone49, (-1947974400000L));
        org.joda.time.DateMidnight dateMidnight52 = localDate43.toDateMidnight(dateTimeZone45);
        long long54 = dateTimeZone45.convertUTCToLocal(55080040L);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long59 = dateTimeZone57.previousTransition((long) (-1));
        long long63 = dateTimeZone57.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale65 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str66 = dateTimeZone57.getShortName((long) '#', locale65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime69 = dateTime67.minusHours((int) (short) 100);
        int int70 = dateTime67.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property71 = dateTime67.monthOfYear();
        org.joda.time.DateTime dateTime72 = property71.withMinimumValue();
        org.joda.time.DateTime dateTime73 = dateTime72.toDateTime();
        org.joda.time.DateTime.Property property74 = dateTime73.era();
        org.joda.time.DateTime dateTime75 = property74.roundHalfEvenCopy();
        boolean boolean77 = dateTime75.isEqual((long) 40);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean79 = dateTime75.equals((java.lang.Object) dateTimeFieldType78);
        org.joda.time.chrono.ISOChronology iSOChronology80 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField81 = iSOChronology80.weekyears();
        org.joda.time.DateTimeField dateTimeField82 = iSOChronology80.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField83 = iSOChronology80.hourOfDay();
        org.joda.time.DateTimeField dateTimeField84 = iSOChronology80.dayOfMonth();
        org.joda.time.DurationField durationField85 = iSOChronology80.months();
        org.joda.time.DateTimeField dateTimeField86 = iSOChronology80.weekyearOfCentury();
        boolean boolean87 = dateTimeFieldType78.isSupported((org.joda.time.Chronology) iSOChronology80);
        int int88 = dateTime55.get(dateTimeFieldType78);
        int int89 = localDate28.get(dateTimeFieldType78);
        int int90 = localDate28.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime55", (dateTime16.compareTo(dateTime55) == 0) == dateTime16.equals(dateTime55));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 42856587);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = iSOChronology4.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property14 = localDate11.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localDate11.toString(dateTimeFormatter15);
        long long18 = iSOChronology4.set((org.joda.time.ReadablePartial) localDate11, (long) 349200000);
        org.joda.time.LocalDate localDate20 = localDate11.withYearOfEra(53688639);
        org.joda.time.DateMidnight dateMidnight21 = localDate11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone23);
        boolean boolean31 = dateTimeZone23.isFixed();
        org.joda.time.DateTime dateTime32 = localDate11.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime33 = instant1.toDateTime(dateTimeZone23);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime33", (instant1.compareTo(dateTime33) == 0) == instant1.equals(dateTime33));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        int int7 = localDateTime4.getMillisOfDay();
        int int8 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusHours(1970);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.year();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = iSOChronology13.add(readablePeriod16, (long) (short) 1, 954);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.clockhourOfDay();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 56, (org.joda.time.Chronology) iSOChronology13);
        org.joda.time.DurationField durationField22 = iSOChronology13.years();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology13);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime26 = dateTime23.withFieldAdded(durationFieldType24, 9);
        boolean boolean27 = localDateTime10.isSupported(durationFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField22", (durationField1.compareTo(durationField22) == 0) == durationField1.equals(durationField22));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTimeISO();
        boolean boolean25 = instant16.isAfter((long) 580);
        org.joda.time.DateTime dateTime26 = instant16.toDateTimeISO();
        org.joda.time.Chronology chronology27 = instant16.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime15 = instant13.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long12 = dateTimeZone9.adjustOffset((long) 54, true);
        int int14 = dateTimeZone9.getOffset((long) 123086);
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = iSOChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType17.getField((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DurationField durationField22 = iSOChronology19.hours();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology19.clockhourOfDay();
        org.joda.time.DurationField durationField24 = iSOChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology19.millisOfSecond();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.util.Locale locale31 = new java.util.Locale("days");
        java.lang.String str32 = locale29.getDisplayCountry(locale31);
        java.util.Locale.Builder builder33 = builder28.setLocale(locale31);
        java.util.Locale.Builder builder35 = builder28.removeUnicodeLocaleAttribute("100");
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.util.Locale locale38 = new java.util.Locale("days");
        java.lang.String str39 = locale36.getDisplayCountry(locale38);
        java.lang.String str40 = locale38.getCountry();
        java.util.Set<java.lang.Character> charSet41 = locale38.getExtensionKeys();
        java.util.Locale.Builder builder42 = builder35.setLocale(locale38);
        java.lang.String str43 = dateTimeField26.getAsShortText((long) 53956925, locale38);
        java.util.Set<java.lang.Character> charSet44 = locale38.getExtensionKeys();
        java.lang.String str45 = dateTimeZone9.getShortName((long) 577, locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime15", (dateTime7.compareTo(dateTime15) == 0) == dateTime7.equals(dateTime15));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) iSOChronology0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("0");
        org.joda.time.Instant instant4 = instant1.withDurationAdded((long) 364, 1439);
        org.joda.time.Instant instant6 = instant4.plus((long) 27);
        org.joda.time.Instant instant7 = instant6.toInstant();
        org.joda.time.DateTime dateTime8 = instant6.toDateTime();
        int int9 = dateTime8.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTimeISO();
        long long11 = mutableDateTime10.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime8", (instant6.compareTo(dateTime8) == 0) == instant6.equals(dateTime8));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        int int6 = localDateTime4.getDayOfMonth();
        int int7 = localDateTime4.getYearOfEra();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DurationField durationField10 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.era();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.weekyear();
        org.joda.time.DurationField durationField15 = iSOChronology8.months();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = iSOChronology16.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology16.getZone();
        long long20 = dateTimeZone18.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(35);
        boolean boolean38 = dateTime36.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime41 = dateTime36.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        org.joda.time.DateTime dateTime43 = property42.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property44 = dateTime43.dayOfMonth();
        boolean boolean45 = dateTimeZone18.equals((java.lang.Object) dateTime43);
        org.joda.time.Chronology chronology46 = iSOChronology8.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology8.clockhourOfDay();
        boolean boolean48 = localDateTime4.equals((java.lang.Object) iSOChronology8);
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology8.year();
        org.joda.time.DurationField durationField51 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField1, and durationField10", !(durationField51.compareTo(durationField1) == 0) || (Math.signum(durationField51.compareTo(durationField10)) == Math.signum(durationField1.compareTo(durationField10))));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = iSOChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DurationField durationField24 = iSOChronology21.hours();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.minuteOfHour();
        long long29 = iSOChronology21.add((long) 53655688, (long) 16, 839);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology21.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime16.toDateTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DurationField durationField32 = iSOChronology21.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime31", (dateTime11.compareTo(dateTime31) == 0) == dateTime11.equals(dateTime31));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.era();
        org.joda.time.DurationField durationField9 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField10 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField7", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = iSOChronology0.millis();
        org.joda.time.DurationField durationField11 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.era();
        org.joda.time.DurationField durationField9 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField6, and durationField9", !(durationField11.compareTo(durationField6) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long52 = dateTimeZone50.previousTransition((long) (-1));
        long long56 = dateTimeZone50.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale58 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str59 = dateTimeZone50.getShortName((long) '#', locale58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime62 = dateTime60.minusHours((int) (short) 100);
        int int63 = dateTime60.getWeekOfWeekyear();
        int int64 = dateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime60.plusDays(86399999);
        boolean boolean67 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime66.minusDays(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        long long4 = dateTimeZone2.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        boolean boolean22 = dateTime20.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime25 = dateTime20.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        boolean boolean29 = dateTimeZone2.equals((java.lang.Object) dateTime27);
        int int30 = dateTime27.getMillisOfSecond();
        int int31 = dateTime27.getMonthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = iSOChronology32.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology32.hourOfDay();
        org.joda.time.DurationField durationField36 = iSOChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology32.year();
        org.joda.time.Chronology chronology38 = iSOChronology32.withUTC();
        org.joda.time.DateTime dateTime39 = dateTime27.toDateTime((org.joda.time.Chronology) iSOChronology32);
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology40.era();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology40.clockhourOfDay();
        org.joda.time.DurationField durationField43 = iSOChronology40.months();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(99);
        org.joda.time.Chronology chronology46 = iSOChronology40.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology40.hourOfHalfday();
        org.joda.time.DurationField durationField48 = iSOChronology40.years();
        org.joda.time.DurationField durationField49 = iSOChronology40.centuries();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology40.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime27.toMutableDateTime((org.joda.time.Chronology) iSOChronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField48", (durationField1.compareTo(durationField48) == 0) == durationField1.equals(durationField48));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int8 = localTime7.getMillisOfSecond();
        org.joda.time.LocalTime.Property property9 = localTime7.millisOfDay();
        org.joda.time.Interval interval10 = property9.toInterval();
        int int11 = property9.getMinimumValue();
        org.joda.time.LocalTime localTime13 = property9.addCopy(51);
        org.joda.time.LocalTime localTime14 = property9.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay(716);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.minusHours((int) (short) 100);
        int int31 = dateTime28.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime28.monthOfYear();
        org.joda.time.DateTime dateTime33 = property32.withMinimumValue();
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = property35.roundHalfEvenCopy();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.era();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology37);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology37.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long50 = dateTimeZone48.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) ' ', dateTimeZone48);
        org.joda.time.LocalTime.Property property52 = localTime51.minuteOfHour();
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.lang.String str54 = property52.getAsText(locale53);
        java.lang.String str55 = dateTimeField44.getAsText((long) 32772, locale53);
        int int56 = property35.getMaximumTextLength(locale53);
        java.lang.String str57 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localTime16, locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime28", (dateTime2.compareTo(dateTime28) == 0) == dateTime2.equals(dateTime28));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(99);
        org.joda.time.Chronology chronology6 = iSOChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.Instant instant18 = instant15.withDurationAdded((long) (short) 100, 6);
        org.joda.time.Instant instant20 = instant15.withMillis((long) 76);
        long long21 = instant20.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.LocalDate.Property property67 = localDate36.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime65", (dateTime57.compareTo(dateTime65) == 0) == dateTime57.equals(dateTime65));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.joda.time.Chronology chronology37 = instant36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.DateTime dateTime21 = dateTime16.plus((long) 'u');
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = iSOChronology22.getZone();
        org.joda.time.DurationField durationField25 = iSOChronology22.seconds();
        org.joda.time.DurationField durationField26 = iSOChronology22.hours();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone29);
        long long33 = dateTimeZone28.getMillisKeepLocal(dateTimeZone29, (long) 22);
        java.lang.String str34 = dateTimeZone28.toString();
        java.lang.String str36 = dateTimeZone28.getName(0L);
        org.joda.time.Chronology chronology37 = iSOChronology22.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime38 = dateTime21.toDateTime((org.joda.time.Chronology) iSOChronology22);
        org.joda.time.DateTime dateTime40 = dateTime21.plusMillis(23);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property46 = localDate45.weekyear();
        org.joda.time.LocalDate localDate48 = localDate45.withWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long52 = dateTimeZone50.previousTransition((long) (-1));
        long long56 = dateTimeZone50.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale58 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str59 = dateTimeZone50.getShortName((long) '#', locale58);
        long long62 = dateTimeZone50.convertLocalToUTC((long) (-292275054), true);
        org.joda.time.DateTime dateTime63 = localDate45.toDateTimeAtCurrentTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTime dateTime66 = localDate45.toDateTimeAtMidnight(dateTimeZone65);
        org.joda.time.DateTime.Property property67 = dateTime66.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long71 = dateTimeZone69.previousTransition((long) (-1));
        long long75 = dateTimeZone69.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale77 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str78 = dateTimeZone69.getShortName((long) '#', locale77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime81 = dateTime79.minusHours((int) (short) 100);
        int int82 = dateTime79.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property83 = dateTime79.monthOfYear();
        org.joda.time.DateTime dateTime84 = property83.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate(0L, dateTimeZone86);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean89 = localDate87.isSupported(dateTimeFieldType88);
        int int90 = dateTime84.get(dateTimeFieldType88);
        org.joda.time.DateTime.Property property91 = dateTime66.property(dateTimeFieldType88);
        org.joda.time.DurationFieldType durationFieldType92 = dateTimeFieldType88.getDurationType();
        org.joda.time.DateTime dateTime94 = dateTime40.withFieldAdded(durationFieldType92, 549);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime38", (dateTime21.compareTo(dateTime38) == 0) == dateTime21.equals(dateTime38));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(23, 0, 45);
        org.joda.time.LocalTime localTime10 = localTime8.withHourOfDay(23);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(76);
        int[] intArray14 = iSOChronology0.get((org.joda.time.ReadablePartial) localTime12, (-1645451640000L));
        org.joda.time.LocalTime.Property property15 = localTime12.hourOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DurationField durationField19 = iSOChronology16.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = iSOChronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Chronology chronology24 = iSOChronology21.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.yearOfCentury();
        boolean boolean26 = iSOChronology16.equals((java.lang.Object) iSOChronology21);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = iSOChronology16.add(readablePeriod27, (-113486044348000L), 2139);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology16.secondOfDay();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime.Property property35 = dateTime32.weekOfWeekyear();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int38 = localTime37.getMillisOfSecond();
        org.joda.time.LocalTime.Property property39 = localTime37.millisOfDay();
        int int40 = property39.getMinimumValueOverall();
        org.joda.time.LocalTime localTime42 = property39.addNoWrapToCopy(954);
        org.joda.time.LocalTime.Property property43 = localTime42.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime45 = localTime42.minus(readablePeriod44);
        org.joda.time.DateTime dateTime46 = localTime45.toDateTimeToday();
        org.joda.time.chrono.ISOChronology iSOChronology47 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology47.era();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology47.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology47.year();
        org.joda.time.DurationField durationField51 = iSOChronology47.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology47.halfdayOfDay();
        org.joda.time.DurationField durationField53 = iSOChronology47.seconds();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        long long57 = iSOChronology47.add(readablePeriod54, 16L, 100);
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology((org.joda.time.Chronology) iSOChronology47);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfHour();
        boolean boolean60 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime58);
        int int61 = property15.getDifference((org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField19", Math.signum(durationField2.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField2)));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDate localDate23 = localDate2.withYearOfEra(15);
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(53765887);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType27.getField((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField32 = iSOChronology29.hours();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = dateTimeField35.getType();
        int int37 = localDate23.get(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.withEra(1);
        int int48 = localDate42.compareTo((org.joda.time.ReadablePartial) localDate45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean51 = dateTimeZone49.isStandardOffset((long) 0);
        org.joda.time.Interval interval52 = localDate42.toInterval(dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight53 = localDate42.toDateMidnight();
        org.joda.time.Instant instant54 = new org.joda.time.Instant((java.lang.Object) dateMidnight53);
        org.joda.time.Instant instant56 = instant54.plus((-62898930858L));
        org.joda.time.DateTime dateTime57 = localDate23.toDateTime((org.joda.time.ReadableInstant) instant54);
        org.joda.time.LocalDate.Property property58 = localDate23.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight53 and instant54", (dateMidnight53.compareTo(instant54) == 0) == dateMidnight53.equals(instant54));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.era();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField6", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.year();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.years();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology8.getZone();
        long long12 = dateTimeZone10.nextTransition((long) (byte) 100);
        org.joda.time.Chronology chronology13 = iSOChronology0.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField9", (durationField7.compareTo(durationField9) == 0) == durationField7.equals(durationField9));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        java.util.Locale locale3 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.TimeZone timeZone6 = calendar4.getTimeZone();
        timeZone6.setID("gioved\354");
        timeZone6.setRawOffset(29);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone12 = calendar11.getTimeZone();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone12);
        calendar13.roll(11, false);
        calendar13.setLenient(true);
        java.util.TimeZone timeZone19 = calendar13.getTimeZone();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone19);
        java.time.ZoneId zoneId21 = timeZone19.toZoneId();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone(zoneId21);
        boolean boolean24 = timeZone6.hasSameRules(timeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar11", (calendar4.compareTo(calendar11) == 0) == calendar4.equals(calendar11));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Instant instant8 = new org.joda.time.Instant(obj7);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra(53708922);
        int int12 = property6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDate localDate13 = property6.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime31 = dateTime11.minusSeconds(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime29", (instant16.compareTo(mutableDateTime29) == 0) == instant16.equals(mutableDateTime29));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.Chronology chronology4 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology0.months();
        org.joda.time.DurationField durationField11 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime33 = instant15.toDateTimeISO();
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology34.era();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology34);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology34.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology34.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology34.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology34.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology34.dayOfYear();
        org.joda.time.DurationField durationField43 = iSOChronology34.years();
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology34.getZone();
        org.joda.time.DateTime dateTime45 = dateTime33.toDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }
}

